package com.squashedmosquito.babyshout.app.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by krd on 23-04-2014.
 */
public class QueuedAnimationManager {

    private final List<QueuedAnimationItem> itemLst;
    private QueuedAnimationItem latestItem;
    private int delay;

    public QueuedAnimationManager()
    {
        itemLst = new ArrayList<QueuedAnimationItem>();
    }

    public void enqueue(final QueuedAnimationItem item){
        itemLst.add(item);

        if(latestItem != null)
        {
            latestItem.setOnAnimationEndedListner(new QueuedAnimationItem.OnAnimationEndedListener() {
                @Override
                public void onEnd() {
                    item.start(0);
                }
            });
        }

        latestItem = item;
    }

    public void start(){

        if(itemLst.size() == 0) return;

        itemLst.get(0).start(delay);
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getDelay() {
        return delay;
    }
}
