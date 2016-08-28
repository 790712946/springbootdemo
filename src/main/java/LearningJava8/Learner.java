package LearningJava8;

/**
 * Created by jianghong on 2016/8/27.
 */
public interface Learner {
    default void print(){
        System.out.println("I am a learner");
    }
}
