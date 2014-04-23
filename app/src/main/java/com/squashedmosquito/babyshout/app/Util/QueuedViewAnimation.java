package com.squashedmosquito.babyshout.app.Util;

import android.view.View;
import android.view.animation.Animation;

/**
 * Created by krd on 23-04-2014.
 */
public class QueuedViewAnimation extends QueuedAnimationItem {

    private View view;
    private Animation animation;

    public QueuedViewAnimation(View view, Animation animation) {
        this.view = view;
        this.animation = animation;
    }

    @Override
    public void start(int delay)
    {
        animation.setStartOffset(delay);
        view.startAnimation(animation);
    }

    @Override
    public void setOnAnimationEndedListner(final OnAnimationEndedListener listener) {
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                listener.onEnd();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }
}
