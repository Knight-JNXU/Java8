package Java8Stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by Knight_JXNU on 2016/12/13.
 */
public class Java8Stream {
    @Test
    //为集合创建串行流
    public void stream(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> filtered = strings.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);
    }

    @Test
    //使用forEach迭代流中的每个数据
    public void forEach(){
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);
    }

    @Test
    //map映射
    public void map(){
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        //取平方
        List<Integer> squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println(squaresList);
        //cosonle:
        //[9, 4, 49, 25]
    }

    @Test
    //filter方法用于通过设置的条件过滤出元素
    public void filter(){
        List<String> strings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        //获取空字符串的数量
        Long count = strings.stream().filter(string->string.isEmpty()).count();
        System.out.println(count);
    }

    @Test
    //limit获取指定数量的流
    public void limit(){
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);
    }

    @Test
    //流并行处理
    public void parallelStream(){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        long count = strings.parallelStream().filter(string->string.isEmpty()).count();
        System.out.println(count);
    }

    @Test
    //收集器，可以用于int、double、long
    public void count(){
        List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("max:"+stats.getMax());
        System.out.println("min:"+stats.getMin());
        System.out.println("sum:"+stats.getSum());
        System.out.println("avg:"+stats.getAverage());
    }

}
