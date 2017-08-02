package decorator;

/**
 * Created by woooowen on 2017/8/2.
 */
public abstract class Decortor extends Word{

    protected Word word;

    public Decortor(Word word) {
        this.word = word;
    }

    @Override
    public String show() {
        return this.word.show();
    }

}
