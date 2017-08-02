package observer;

/**
 * Created by woooowen on 2017/8/2.
 */
// 被观察者
public interface Watched {
    // 被观察者可以添加删除观察者,表示可以通知到多少个观察者

    // 添加观察者
    public void add(WatcherImpl watcher);

    // 移除观察者
    public void remove(WatcherImpl watcher);

    // 通知观察者
    public void notice();

}
