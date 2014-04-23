package com.squashedmosquito.babyshout.app.Util;

/**
 * Created by krd on 23-04-2014.
 */
public abstract class QueuedAnimationItem {
    public abstract void start(int delay);
    public abstract void setOnAnimationEndedListner(OnAnimationEndedListener listener);

    interface OnAnimationEndedListener{
        public void onEnd();
    }
}
