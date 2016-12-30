package com.pakbg.study;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by PAKBG on 2016-12-30.
 */

public class MainActivity extends BaseActivity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);

        setTitle("asdasd");


        getView(R.id.Button);
        Button btn = (Button) getView(R.id.Button);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
