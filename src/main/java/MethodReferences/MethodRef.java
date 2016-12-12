package MethodReferences;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * Created by Knight_JXNU on 2016/12/12.
 * java8 方法引用
 * 说白了就是使用 ::
 */
public class MethodRef {
    private static class Car{
        public static Car create(final Supplier<Car> supplier){
            return supplier.get();
        }
        public static void collide(final Car car){
            System.out.println("Collided " + car.toString());
        }
        public void follow(final Car another){
            System.out.println("Following the " + another.toString());
        }
        public void repair(){
            System.out.println("Repaired " + this.toString());
        }
    }
    public static void main(String[] args){
        final Car car = Car.create(Car::new);  //构造方法
        final List<Car> cars = Arrays.asList(car);  //构造list

        cars.forEach(Car::collide);  //静态方法引用

        cars.forEach(Car::repair);  //特定类的任意对象的方法引用

        final Car police = Car.create(Car::new);  //特定对象的方法引用
        cars.forEach(police::follow);
    }
}
