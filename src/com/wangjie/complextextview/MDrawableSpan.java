package com.wangjie.complextextview;

import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;

/**
 * Created with IntelliJ IDEA.
 * Author: wangjie  email:wangjie@cyyun.com
 * Date: 14-2-21
 * Time: 下午5:47
 */
public class MDrawableSpan extends DynamicDrawableSpan {
    private Drawable drawablel;

    public MDrawableSpan(Drawable drawablel) {
        this.drawablel = drawablel;
    }

    @Override
    public Drawable getDrawable() {
        return drawablel;
    }
}
