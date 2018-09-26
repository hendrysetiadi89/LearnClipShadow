package com.example.nakama.testshadow;

import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.nakama.manager.ClipPathManager;

/**
 * Created by hendry on 26/09/18.
 */
public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.toolbar));

//        ShapeOfView shapeOfView = findViewById(R.id.myShape);
//        shapeOfView.setClipPathCreator(new ClipPathManager.ClipPathCreator() {
//            @Override
//            public boolean requiresBitmap() {
//                return false;
//            }
//
//            @Override
//            public Path createClipPath(int width, int height) {
//                final Path path = new Path();

                //eg: triangle
//                path.moveTo(0, 0);
//                path.lineTo(0.5f * width, height);
//                path.lineTo(width, 0);
//                path.close();

//                path.moveTo(0, 0);
//                path.lineTo(width, 0);
//                path.lineTo(width, height);
//                path.lineTo(0.7f * width, height);
////                path.arcTo(new RectF(0.7f * width - 0.1f*height, 0.9f*height, 0.7f * width, height), 0, -90);
////                path.lineTo(0, height);
//                path.lineTo(0 + 160f, height);
//////                if (useBezier) {
//////                    path.quadTo(left, bottom, left, bottom - bottomLeftRadius);
//////                } else {
////                    path.arcTo(new RectF(0, height - 160f * 2f, 0 + 160f * 2f, height), 90, 90);
////                    path.arcTo(new RectF(0 - 160f, height - 160f, 0 + 160f, height + 160f), 0, -90
////                    ,false);
//////                }
////                path.lineTo(left, top + topLeftRadius);
//                path.moveTo(0, height - 160f);
//                path.close();

//                RectF rect = new RectF();
//                rect.set(20 / 2f, 20 / 2f, width - 20 / 2f, height - 20 / 2f);
//
//                final float left = rect.left;
//                final float top = rect.top;
//                final float bottom = rect.bottom;
//                final float right = rect.right;
//
//                final float minSize = Math.min(rect.width() / 2f, rect.height() / 2f);
//
//                boolean useBezier = false;
//                float topLeftRadius = 80;
//                float topRightRadius = 0 ;
//                float bottomLeftRadius = 0;
//                float bottomRightRadius = 0;
//
//                if (topLeftRadius > minSize) {
//                    topLeftRadius = minSize;
//                }
////                if (topRightRadius > minSize) {
////                    topRightRadius = minSize;
////                }
////                if (bottomLeftRadius > minSize) {
////                    bottomLeftRadius = minSize;
////                }
////                if (bottomRightRadius > minSize) {
////                    bottomRightRadius = minSize;
////                }
//
//                path.moveTo(left + topLeftRadius, top);
//                path.lineTo(right - topRightRadius, top);
//
//                //float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean forceMoveTo
////                if (useBezier) {
////                    path.quadTo(right, top, right, top + topRightRadius);
////                } else {
//                    path.arcTo(new RectF(right - topRightRadius * 2f, top, right, top + topRightRadius * 2f), -90, 90);
////                }
//                path.lineTo(right, bottom - bottomRightRadius);
////                if (useBezier) {
////                    path.quadTo(right, bottom, right - bottomRightRadius, bottom);
////                } else {
//                    path.arcTo(new RectF(right - bottomRightRadius * 2f, bottom - bottomRightRadius * 2f, right, bottom), 0, 90);
////                }
//                path.lineTo(left + bottomLeftRadius, bottom);
////                if (useBezier) {
////                    path.quadTo(left, bottom, left, bottom - bottomLeftRadius);
////                } else {
//                    path.arcTo(new RectF(left, bottom - bottomLeftRadius * 2f, left + bottomLeftRadius * 2f, bottom), 90, 90);
////                }
//                path.lineTo(left, top + topLeftRadius);
////                if (useBezier) {
////                    path.quadTo(left, top, left + topLeftRadius, top);
////                } else {
//                    path.arcTo(new RectF(left, top, left + topLeftRadius * 2f, top + topLeftRadius * 2f), 180, 90);
////                }
//                path.close();

//                return path;
//            }
//        });
    }
}
