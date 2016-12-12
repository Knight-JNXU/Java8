package MethodReferences;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Knight_JXNU on 2016/12/12.
 * java8 方法引用实例
 */
public class MethodRefInst {
    public static void main(String[] args){
        List names = new ArrayList();
        names.add("google");
        names.add("baidu");
        names.add("sougou");
        names.forEach(System.out::println);
    }
}
