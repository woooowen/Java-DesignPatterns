package observer;

/**
 * Created by woooowen on 2017/8/2.
 */
public class WatcherImpl implements Watcher{
    @Override
    public void notice() {
        System.out.println("收到消息");
    }
}
