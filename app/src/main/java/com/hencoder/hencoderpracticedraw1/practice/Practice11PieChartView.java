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

public class Practice11PieChartView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        
        float degreetLp = 120.0f;
        float degreeKk = 120.0f;
        float degreeMm = 60.0f;
        float degreeJb = 60.0f;
        float degreeGb = 8.0f;
        float degreeIcs = 8.0f;
        float degreeF = 2.0f;

        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(140, 90, 740, 690, -180, 120, true, mPaint);
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(150, 100, 750, 700, -60, 60, true, mPaint);
        mPaint.setColor(Color.BLACK);
        canvas.drawArc(150, 100, 750, 700,1, 1 + 2, true, mPaint);

        mPaint.setColor(Color.MAGENTA);
        canvas.drawArc(150, 100, 750, 700,4, 7, true, mPaint);
        mPaint.setColor(Color.GRAY);
        canvas.drawArc(150, 100, 750, 700,12, 7, true, mPaint);
        mPaint.setColor(Color.CYAN);
        canvas.drawArc(150, 100, 750, 700,20, 39, true, mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(150, 100, 750, 700,60, 120, true, mPaint);
    }
}
