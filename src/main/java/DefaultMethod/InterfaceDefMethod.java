package DefaultMethod;

/**
 * Created by Knight_JXNU on 2016/12/12.
 * java 8 接口的默认方法
 */
public class InterfaceDefMethod {
    private interface Animal{
        default void show(){
            System.out.println("animal");
        }
        static void show(String s){
            System.out.println("animal "+s);
        }
    }
    private class Dog implements Animal{
        @Override
        public void show() {
            System.out.println("animal");
        }
    }

}
