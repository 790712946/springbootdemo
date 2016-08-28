package LearningJava8;

/**
 * Created by jianghong on 2016/8/27.
 */
public interface Younger {
    default void print(){
        System.out.println("I am ayounger.");
    }
    static void sayHi(){
        System.out.println("Young is the capital.");
    }
}
