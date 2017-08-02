package factory.simple;

/**
 * Created by woooowen on 2017/8/2.
 */

/**
 * 工厂模式
 * JDK java.lang.Object toString()
 */
public class Test {

    public static void main(String[] args) {
        Car myCar = Factory.product("blue");
        System.out.println(myCar.getColor());
    }

}
