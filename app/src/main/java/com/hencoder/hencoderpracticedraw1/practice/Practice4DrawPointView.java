package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw1.DpUtils;

public class Practice4DrawPointView extends View {
    private Context mContext;
    private Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

    public Practice4DrawPointView(Context context) {
        this(context, null);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点

        // 注意画点要设置宽度,否则没有效果
        mPaint.setStrokeWidth(DpUtils.dip2px(mContext, 20));
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(500, 200, mPaint);

        mPaint.setStrokeWidth(DpUtils.dip2px(mContext, 20));
        mPaint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(600, 200, mPaint);
    }
}
