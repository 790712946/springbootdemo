package com.example.model.message.repository;

import com.example.model.message.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jianghong on 2016/8/12.
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
