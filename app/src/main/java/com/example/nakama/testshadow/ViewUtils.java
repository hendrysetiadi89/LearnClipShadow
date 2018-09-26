package com.example.nakama.testshadow;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.View;

import static android.view.View.LAYER_TYPE_SOFTWARE;

/**
 * Created by ArmanSo on 4/16/17.
 */

public class ViewUtils {

    public static Drawable generateBackgroundWithShadow(View view, @ColorRes int backgroundColor,
                                                        @DimenRes int cornerRadius,
                                                        @ColorRes int shadowColor,
                                                        @DimenRes int elevation,
                                                        int shadowGravity) {
        float cornerRadiusValue = view.getContext().getResources().getDimension(cornerRadius);
        int elevationValue = (int) view.getContext().getResources().getDimension(elevation);
        int shadowColorValue = ContextCompat.getColor(view.getContext(),shadowColor);
        int backgroundColorValue = ContextCompat.getColor(view.getContext(),backgroundColor);

        float[] outerRadius = {cornerRadiusValue, cornerRadiusValue, cornerRadiusValue,
                cornerRadiusValue, cornerRadiusValue, cornerRadiusValue, cornerRadiusValue,
                cornerRadiusValue};

        Paint backgroundPaint = new Paint();
        backgroundPaint.setStyle(Paint.Style.FILL);
        backgroundPaint.setShadowLayer(cornerRadiusValue, 0, 0, 0);

        Rect shapeDrawablePadding = new Rect();
        shapeDrawablePadding.left = elevationValue;
        shapeDrawablePadding.right = elevationValue;

        int DY;
        switch (shadowGravity) {
            case Gravity.CENTER:
                shapeDrawablePadding.top = elevationValue;
                shapeDrawablePadding.bottom = elevationValue;
                DY = 0;
                break;
            case Gravity.TOP:
                shapeDrawablePadding.top = elevationValue*2;
                shapeDrawablePadding.bottom = elevationValue;
                DY = -1*elevationValue/3;
                break;
            default:
            case Gravity.BOTTOM:
                shapeDrawablePadding.top = elevationValue;
                shapeDrawablePadding.bottom = elevationValue*2;
                DY = elevationValue/3;
                break;
        }

        Drawable shapeDrawable = ContextCompat.getDrawable(view.getContext(), R.drawable.test2);
//        ShapeDrawable shapeDrawable = new ShapeDrawable();
//        RoundRectShape roundRectShape = new RoundRectShape(new float[]{
//                10, 10, 10, 10,
//                10, 10, 10, 10}, null, null);
//        ShapeDrawable shapeDrawable = new ShapeDrawable(roundRectShape);
//        shapeDrawable.setPadding(shapeDrawablePadding);
//
//        shapeDrawable.getPaint().setColor(backgroundColorValue);
////        shapeDrawable.getPaint().setShadowLayer(cornerRadiusValue/3, 0, DY, shadowColorValue);
//        if (shapeDrawable instanceof GradientDrawable) {
//            ((GradientDrawable)shapeDrawable).set
//        }

//
//
//        view.setLayerType(LAYER_TYPE_SOFTWARE, shapeDrawable.getPaint());
//
//        shapeDrawable.setShape(new RoundRectShape(outerRadius, null, null));

//        GradientDrawable shadow;
//        try{
//            int[] colors1 = {Color.GRAY, Color.parseColor("#FFFFFF")};
//            shadow = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors1);
//            shadow.setCornerRadius(elevationValue);
//        }
//        catch(Exception e){
//            int[] colors1 = {Color.parseColor("#419ED9"), Color.parseColor("#419ED9")};
//            shadow = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, colors1);
//            shadow.setCornerRadius(elevationValue);
//            e.printStackTrace();
//        }

        LayerDrawable drawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        drawable.setLayerInset(0, elevationValue, elevationValue*2, elevationValue, elevationValue*2);

        return drawable;

    }
}