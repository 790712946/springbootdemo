package com.example.model.test.repository;

import com.example.model.test.domain.Users;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by jianghong on 2016/8/7.
 */
@CacheConfig(cacheNames = "users")
public interface UsersRepository extends JpaRepository<Users, Long> {
    /**
     * 对该次查询添加缓存
     * @param name
     * @return
     */
    @Cacheable(key = "#p0")
    Users findByName(String name);
    @CachePut(key = "#p0.name")
    Users save(Users users);
}
