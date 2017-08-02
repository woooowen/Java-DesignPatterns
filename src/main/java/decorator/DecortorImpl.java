package decorator;

/**
 * Created by woooowen on 2017/8/2.
 */
public class DecortorImpl extends Decortor{
    @Override
    public String show() {
        String res = "装饰下对象";
        return res + super.show();
    }

    public DecortorImpl(Word word) {
        super(word);
    }

    // 新方法
    public String hugShow(){
        return "输出巨大的对象" + super.show();
    }

}
