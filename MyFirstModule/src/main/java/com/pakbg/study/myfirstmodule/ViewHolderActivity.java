package com.pakbg.study.myfirstmodule;

import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;

/**
 * Created by PAKBG on 2016-12-30.
 */

public class ViewHolderActivity extends AppCompatActivity {
    private HashMap<Integer, Object> viewHolder = new HashMap<>();

    protected Object getView(int id){
        Object result = null;
        if(viewHolder.containsKey(id)){
            try{
                result = viewHolder.get(id);
            }catch (Exception e){

            }
        }else{
            result = findViewById(id);
            viewHolder.put(id, result);
        }
        return result;
    }

}
