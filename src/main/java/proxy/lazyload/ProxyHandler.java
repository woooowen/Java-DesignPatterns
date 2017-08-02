package proxy.lazyload;

/**
 * Created by woooowen on 2017/8/2.
 */
public class ProxyHandler implements Word{

    private Word word = null;
    private String method;

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String show() {
        String res = "default";
        if(null == word && method.equals("WordA")){
            word = new WordA();
        }

        if(null == word && method.equals("WordB")){
            word = new WordB();
        }
        if(null != word){
            res = word.show();
        }
        return res;
    }
}
