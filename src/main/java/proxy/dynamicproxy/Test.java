package proxy.dynamicproxy;

/**
 * Created by woooowen on 2017/8/2.
 */
public class Test {

    // 动态代理
    public static void main(String[] args) {
        WordA wordA = new WordA();
        ProxyHandler proxyHandler = new ProxyHandler();
        Word word = (Word)proxyHandler.bind(wordA);
        System.out.println(word.show());
    }
}
