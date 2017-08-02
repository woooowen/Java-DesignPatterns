package observer;

/**
 * Created by woooowen on 2017/8/3.
 */
public class Test {

    public static void main(String[] args) {

        // 3个观察者
        WatcherImpl watcher1 = new WatcherImpl();
        WatcherImpl watcher2 = new WatcherImpl();
        WatcherImpl watcher3 = new WatcherImpl();

        WatchedImpl watched = new WatchedImpl();

        watched.add(watcher1);
        watched.add(watcher2);
        watched.add(watcher3);

        watched.setData(true);


    }

}
