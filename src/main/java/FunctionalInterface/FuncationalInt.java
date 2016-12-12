package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/**
 * Created by Knight_JXNU on 2016/12/12.
 * java8 函数式接口
 */
public class FuncationalInt {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        eval(list, n->true);  //所有
        System.out.println("-------");
        eval(list, n->n%2==0);  //偶数
        System.out.println("-------");
        eval(list, n->n>3);  //大于3的
    }
    public static void eval(List<Integer> list, Predicate<Integer> predicate){
        for (Integer n : list){
            if(predicate.test(n)){
                System.out.println(n+" ");
            }
        }
    }
}
