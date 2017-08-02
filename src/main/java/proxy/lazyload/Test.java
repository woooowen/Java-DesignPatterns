package proxy.lazyload;

/**
 * Created by woooowen on 2017/8/2.
 */
public class Test {
    // 静态代理
    // 代理模式可以在使用的时候才去初始化这个类,按需加载(延迟加载)
    // 将调用端和实现端分开
    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.setMethod("WordB");
        System.out.println(proxyHandler.show());
    }
}