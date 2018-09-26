package com.example.nakama.testshadow;

/**
 * Created by hendry on 25/09/18.
 */
import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.nakama.elevation.CompatElevationDelegate;

/**
 * Created by ArmanSo on 4/16/17.
 */

public class RoundLinerLinearNormal extends LinearLayout {
    private CompatElevationDelegate mCompatElevationDelegate;

    public RoundLinerLinearNormal(Context context) {
        super(context);
        initBackground();
    }

    public RoundLinerLinearNormal(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initBackground();
    }

    public RoundLinerLinearNormal(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initBackground();
    }

    private void initBackground() {
        setBackground(ViewUtils.generateBackgroundWithShadow(this,R.color.white,
                R.dimen.radius_corner,R.color.shadowColor,R.dimen.elevation, Gravity.BOTTOM));
        initElevation(true, 16);
        internalSetIsMini();
    }

    private void internalSetIsMini() {
        int radius = getResources().getDimensionPixelOffset(16);
        int size = radius * 2;

        if (mCompatElevationDelegate != null) {
            mCompatElevationDelegate.setCornerRadius(radius);
        }

        // Re-set layout params so that width and height are adjusted accordingly.
        ViewGroup.LayoutParams params = getLayoutParams();
        if (params != null) {
            boolean isAttached = getWindowVisibility() == View.VISIBLE;
            if (mCompatElevationDelegate != null && isAttached) {
                mCompatElevationDelegate.onDetachedFromWindow();
            }

            params.width = ViewGroup.LayoutParams.WRAP_CONTENT;
            params.height = ViewGroup.LayoutParams.WRAP_CONTENT;
            setLayoutParams(params);

            if (mCompatElevationDelegate != null && isAttached) {
                mCompatElevationDelegate.onAttachedToWindow();
            }
        }
    }

    private void initElevation(boolean inCompat, float elevation) {
        if (inCompat) {
            mCompatElevationDelegate = new CompatElevationDelegate(this);
        }
        setElevation(elevation);
    }

    @Override
    public void setElevation(float elevation) {
        if (mCompatElevationDelegate != null) {
            mCompatElevationDelegate.setElevation(elevation);
        } else {
            super.setElevation(elevation);
        }
    }

    @Override
    public float getElevation() {
        if (mCompatElevationDelegate != null) {
            return mCompatElevationDelegate.getElevation();
        } else {
            return super.getElevation();
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (mCompatElevationDelegate != null) {
            mCompatElevationDelegate.onAttachedToWindow();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();

        if (mCompatElevationDelegate != null) {
            mCompatElevationDelegate.onDetachedFromWindow();
        }
    }
}