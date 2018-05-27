package com.hencoder.hencoderpracticedraw1.practice;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        // x轴正方向是0度,顺时针为正
        mPaint.setColor(Color.BLACK);
        mPaint.setStyle(Paint.Style.FILL);

        canvas.drawArc(200, 200, 600, 500, -110, 100,true, mPaint);
        canvas.drawArc(200, 200, 600, 500, 10, 160, false, mPaint);

        mPaint.setStyle(Paint.Style.STROKE);
        // useCenter为false,表示不封口的扇形,只是个弧线
        canvas.drawArc(200, 200, 600, 500,180 , 60, false, mPaint);
    }
}
