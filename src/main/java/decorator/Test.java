package decorator;

/**
 * Created by woooowen on 2017/8/2.
 */
public class Test {
    public static void main(String[] args) {

        // 如果我需要在我需要的时候去修改某个方法,如果直接改了方法,那么所有的对象都会跟着修改,因此可以利用装饰器模式,在我想要的时候进行调用,从而完成修改
        // 装饰器可以在不添加新的子类的前提下,不修改原类的前提下,拓展对象的方法
        WordA wordA = new WordA();
        System.out.println(wordA.show());

        WordB wordB = new WordB();
        System.out.println(wordB.show());

        // 装饰器
        DecortorImpl decortor = new DecortorImpl(wordA);
        System.out.println(decortor.show());

        DecortorImpl decortor1 = new DecortorImpl(wordB);
        System.out.println(decortor1.show());

        System.out.println(decortor.hugShow());
        System.out.println(decortor1.hugShow());

    }
}
