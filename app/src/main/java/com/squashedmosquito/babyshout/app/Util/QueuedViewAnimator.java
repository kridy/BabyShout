package com.squashedmosquito.babyshout.app.Util;

import android.animation.Animator;
import android.view.View;

/**
 * Created by krd on 23-04-2014.
 */
public class QueuedViewAnimator extends QueuedAnimationItem {

    private View view;
    private Animator animator;

    public QueuedViewAnimator(View view, Animator animator) {
        this.view = view;
        this.animator = animator;
    }

    @Override
    public void setOnAnimationEndedListner(final OnAnimationEndedListener listener) {
        animator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                listener.onEnd();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
    }

    @Override
    public void start(int delay) {
        animator.setStartDelay(delay);
        animator.setTarget(view);
        animator.start();
    }
}
