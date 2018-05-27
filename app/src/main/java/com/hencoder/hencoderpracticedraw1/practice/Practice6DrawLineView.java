package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice6DrawLineView extends View {
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    private float[] mLines = new float[]{400, 200, 600, 400, 597, 400,1000, 400};


    public Practice6DrawLineView(Context context) {
        super(context);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice6DrawLineView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawLine() 方法画直线

        mPaint.setStrokeWidth(10);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        // 斜着的两条直线之间会有缝隙,可以通过是两条之间重合一点,消除缝隙
//        canvas.drawLine(400, 200, 600, 400, mPaint);
//        canvas.drawLine(600, 400, 1000, 400, mPaint);

        canvas.drawLines(mLines, mPaint);
    }
}
