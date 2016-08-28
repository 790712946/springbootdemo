package LearningJava8;

import java.util.Optional;

/**
 * Created by jianghong on 2016/8/27.
 */
public class LearnedOptional {
    public static void main(String[] args) {
        LearnedOptional tester = new LearnedOptional();
        Integer value1 = null;
        Integer value2 = new Integer(5);
        //ofNullable 允许传参时给出NULL
        Optional<Integer> a = Optional.ofNullable(value1);
        //如果传递的参数为null，那么 of 将抛出空指针异常
        Optional<Integer> b = Optional.of(value2);
        System.out.println(tester.sum(a, b));
    }

    private Integer sum(Optional<Integer> a, Optional<Integer> b) {
        //isPresent 用于检查值是否存在
        System.out.println("First parameter is present: " + a.isPresent());
        System.out.println("Second parameter is present: " + b.isPresent());
        //如果当前返回的是传入的默认值，orElse 将返回它
        Integer value1 = a.orElse(new Integer(0));
        //get 用于获得值，如果值不存在则抛出异常
        Integer value2 = b.get();
        return value1 + value2;
    }
}
