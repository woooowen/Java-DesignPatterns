package singleton;

/**
 * Created by woooowen on 2017/8/1.
 */

import java.io.Serializable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/***
 *  单例模式
 */

// 枚举,类加载时就初始化,无法懒汉,Java规范保证线程安全,反序列安全,反射安全
enum SingletonEnum {
    INSTANCE;

    public void a(){
        System.out.println("");
    }

}

// 内部静态类
class Singleton {

    private static class SingletonInstance {
        private static Singleton Instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonInstance.Instance;
    }

    // 防止反射调用
    private Singleton() {
        if(null != SingletonInstance.Instance){
            throw new RuntimeException();
        }
    }

    // 防止重新finalize
    protected void finalize() {}

    // 防止反序列化
    protected Object readObject(){
        return SingletonInstance.Instance;
    }

    protected Object readResolve(){
        return SingletonInstance.Instance;
    }

}

// double-check
class SingletonDoubleCheck implements Serializable {

    private static volatile SingletonDoubleCheck Instance;

    private SingletonDoubleCheck() {
        if(null != Instance){
            throw new RuntimeException();
        }
    }

    public static SingletonDoubleCheck getInstance() {
        if (null == Instance){
            synchronized (SingletonDoubleCheck.class) {
                if (null == Instance){
                    Instance = new SingletonDoubleCheck();
                }
            }
        }
        return Instance;
    }

    protected void finalize() {}

    protected Object readObject(){
        return Instance;
    }

    protected Object readResolve(){
        return Instance;
    }

}

// 测试
class SingletonTest extends Thread{

    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        ExecutorService thread = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++){
            thread.submit(
                    () -> System.out.println(SingletonDoubleCheck.getInstance().hashCode())
            );
        }

    }

}