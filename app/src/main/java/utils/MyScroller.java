package utils;

import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public class MyScroller extends Scroller {
    @Override
    public void startScroll(int startX, int startY, int dx, int dy,int duration) {
        super.startScroll(startX, startY, dx, dy,400);
    }

    public MyScroller(Context context) {
        super(context,new DecelerateInterpolator());
    }
}
