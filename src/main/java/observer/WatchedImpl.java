package observer;

import java.util.Vector;

/**
 * Created by woooowen on 2017/8/2.
 */
public class WatchedImpl implements Watched{

    private Vector<WatcherImpl> watcherVector = new Vector<>();
    private boolean data = false;

    @Override
    public void add(WatcherImpl watcher) {
        watcherVector.add(watcher);
    }

    @Override
    public void remove(WatcherImpl watcher) {
        watcherVector.remove(watcher);
    }

    @Override
    public void notice(){
        for (WatcherImpl watcher1 : watcherVector){
            watcher1.notice();
        }
    }

    public void setData(boolean data) {
        this.data = data;
        notice();
    }
}
