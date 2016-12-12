package Lambda;

/**
 * Created by Knight_JXNU on 2016/12/12.
 * java8 lambda表达式 变量作用域
 */
public class VariableScope {
    final static String salutation = "Hello ";
    public static void main(String[] args){
        GreetingService greetingService = message ->
                System.out.println(salutation+message);
        greetingService.sayMessage("google!");

    }
    private interface GreetingService{
        public void sayMessage(String message);

        //如果接口中有多个方法，lambda表达式报错
//        public void hello(String m);
    }
}
