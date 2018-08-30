package bwie.com.lianxi201830_01;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MyShapeView extends LinearLayout {
    public MyShapeView(Context context) {
        this(context,null);
    }

    public MyShapeView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyShapeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        inflate(context,R.layout.title_tou,this);
    }
}
