package Lambda;

/**
 * Created by Knight_JXNU on 2016/12/12.
 * lambda表达式（闭包）主要用来定义行内执行的方法类型接口
 * lambda表达式免去了使用匿名方法的麻烦，并且给予java简单强大的函数化编程能力
 */
public class JavaLambda {
    public static void main(String[] args){
        JavaLambda lambda = new JavaLambda();
        //使用类型声明
        MathOperation addition = (int a, int b)->a+b;
        //不适用类型声明
        MathOperation subtraction = (a, b)->a-b;
        //使用大括号和return
        MathOperation multiplication = (int a, int b)->{return a*b;};
        //不使用大括号和return
        MathOperation division = (a, b)->(a/b);
        System.out.println("10+5="+lambda.operation(10, 5, addition));
        System.out.println("10-5="+lambda.operation(10, 5, subtraction));
        System.out.println("10*5="+lambda.operation(10, 5, multiplication));
        System.out.println("10/5="+lambda.operation(10, 5, division));

        //不用括号
        GreetingService greetingService1 = message ->
                System.out.println("Hello " + message);
        //使用括号
        GreetingService greetingService2 = (message ->
                System.out.println("hello " + message));
        greetingService1.sayMessage("liuwen");
        greetingService2.sayMessage("qinying");
    }
    private interface MathOperation{
        int operation(int a, int b);
    }
    private int operation(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
    private interface GreetingService{
        void sayMessage(String message);
    }
}
