package LearningJava8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jianghong on 2016/8/27.
 */
public class NewFeaturesTester {
    final static  String salutation = "Hello";

    public static void main(String[] args) {
        NewFeaturesTester tester = new NewFeaturesTester();
        //带有类型声明的表达式
        MathOperation addition = (int a, int b) -> a + b;
        //没有类型声明的表达式
        MathOperation subtraction = (a, b) -> a - b;
        //带有大括号，带有返回语句的表达式
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };
        //没有大括号和return语句的表达式
        MathOperation division = (int a, int b) -> a / b;
        //输出结果
        System.out.println("10+5=" + tester.operate(100, 2, addition));
        System.out.println("10-5=" + tester.operate(100, 2, subtraction));
        System.out.println("10 x 5 =" + tester.operate(100, 2, multiplication));
        System.out.println("10/5=" + tester.operate(100, 2, division));
        //没有括号的表达式
        GreetingService greetingService1 = message -> System.out.println("Hello" + message);
        GreetingService greetingService2=(message) -> System.out.println("Hello" + message);
        greetingService1.sayMessage("Shiyanlou");
        greetingService2.sayMessage("Classmate");
        GreetingService greetingService3=message -> System.out.println(salutation+message);
        greetingService3.sayMessage("Shiyanlou");
        //方法引用，List循环输出
        List names=new ArrayList();
        names.add("Peter");
        names.add("Linda");
        names.add("Smith");
        names.add("Zack");
        names.add("Bob");
        //通过System.out::printlm引用了输出的方法
        names.forEach(System.out::println);
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
