package LearningJava8;

/**
 * Created by jianghong on 2016/8/27.
 */
public class Student implements Younger,Learner {
    @Override
    public void print() {
        Younger.super.print();
        Learner.super.print();
        Younger.sayHi();
        System.out.println("I am a student");
    }
}
