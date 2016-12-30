package com.pakbg.study;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.pakbg.study.myfirstmodule.ViewHolderActivity;

import java.util.HashMap;

/**
 * Created by PAKBG on 2016-12-30.
 */

public class BaseActivity extends ViewHolderActivity {

    private Toolbar mToolbar;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mToolbar = (Toolbar) findViewById(R.id.Toolbar);
        if(mToolbar != null)
            setSupportActionBar(mToolbar);

    }


    protected void setTitle(String title){
        mToolbar.setTitle(title);
    }
}
