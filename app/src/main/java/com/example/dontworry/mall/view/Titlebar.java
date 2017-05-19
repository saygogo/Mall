package com.example.dontworry.mall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dontworry.mall.R;

/**
 * Created by Don't worry on 2017/5/19.
 */

public class Titlebar extends LinearLayout implements View.OnClickListener {
    private TextView tv_sousuo;
    private RelativeLayout rl_game;
    private ImageView tv_game;
    private Context context;

    public Titlebar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
    }


    @Override
    protected void onFinishInflate() {

        super.onFinishInflate();
        tv_sousuo = (TextView) getChildAt(1);
        rl_game = (RelativeLayout) getChildAt(2);
        tv_game = (ImageView) getChildAt(3);
        tv_sousuo.setOnClickListener(this);
        rl_game.setOnClickListener(this);
        tv_game.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_sousuo:
                Toast.makeText(context, "搜索", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_game:
                Toast.makeText(context, "游戏", Toast.LENGTH_SHORT).show();
                break;
            case R.id.tv_game:
                Toast.makeText(context, "记录", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
