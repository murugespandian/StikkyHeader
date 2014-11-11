package it.carlom.stikkyheader.core.animator;

import android.view.View;

import it.carlom.stikkyheader.core.HeaderAnimator;


public class BaseStickyHeaderAnimator extends HeaderAnimator {

    private float mTranslationRatio;

    @Override
    protected void onAnimatorAttached() {
        //nothing to do
    }

    @Override
    protected void onAnimatorReady() {
        //nothing to do
    }

    @Override
    public void onScroll(int scrolledY, final View header) {

        header.setTranslationY(Math.max(scrolledY, getMaxTransiction()));

        mTranslationRatio = calculateTransictionRatio(scrolledY);
    }

    public float getTranslationRatio() {
        return mTranslationRatio;
    }

    private float calculateTransictionRatio(int scrolledY) {
        return (float) scrolledY / (float) getMaxTransiction();
    }

}
