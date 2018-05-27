package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private Path  mPath  = new Path();
    private Rect  bounds = null;

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //        综合练习
        //        练习内容：使用各种 Canvas.drawXXX() 方法画直方图

        mPaint.setColor(Color.WHITE);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(2);
        mPath.moveTo(100, 100);
        mPath.lineTo(100, 600);
        mPath.lineTo(900, 600);
        canvas.drawPath(mPath, mPaint);

        //        mPaint.reset();
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(120, 595, 220, 599, mPaint);

        canvas.drawRect(240, 580, 340, 599, mPaint);

        canvas.drawRect(360, 580, 460, 599, mPaint);

        canvas.drawRect(480, 400, 580, 599, mPaint);

        canvas.drawRect(600, 200, 700, 599, mPaint);


        mPaint.setTextAlign(Paint.Align.CENTER);
        mPaint.setColor(Color.WHITE);
        mPaint.setTextSize(20);

        if (bounds == null) {
            bounds = new Rect();
            mPaint.getTextBounds("Froyo", 0, "Froyo".length(), bounds);
        }


        canvas.drawText("Froyo", 170, 600 + bounds.bottom - bounds.top, mPaint);
        canvas.drawText("GB", 290, 600 + bounds.bottom - bounds.top, mPaint);
        canvas.drawText("ICS", 410, 600 + bounds.bottom - bounds.top, mPaint);
        canvas.drawText("JB", 530, 600 + bounds.bottom - bounds.top, mPaint);
        canvas.drawText("KitKat", 650, 600 + bounds.bottom - bounds.top, mPaint);

    }
}
