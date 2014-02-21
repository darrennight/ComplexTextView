package com.wangjie.complextextview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created with IntelliJ IDEA.
 * Author: wangjie  email:wangjie@cyyun.com
 * Date: 14-2-21
 * Time: 上午10:22
 */
public class NoLineClickSpan extends ClickableSpan{
    private String text;
    private TextPaint ds;
    private Context context;

    public NoLineClickSpan(Context context, String text) {
        this.text = text;
        this.context = context;
    }

    @Override
    public void updateDrawState(TextPaint ds) {
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
        ds.setColor(Color.parseColor("#0066CC"));
        ds.bgColor = Color.TRANSPARENT;
        this.ds = ds;

    }

    @Override
    public void onClick(View widget) {
        Toast.makeText(context, "clicked!!", Toast.LENGTH_SHORT).show();
    }



}
