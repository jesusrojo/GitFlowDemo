package com.jesusrojo.composedemo.listmenuactivity;


import android.app.Activity;
import android.content.Intent;
import android.util.SparseArray;

import com.jesusrojo.composedemo.state.examples.HelloCodelabActivity;


public class MainListActivity extends BaseListActivity {

    public static void makeIntent(Activity a) {
        Intent i = new Intent(a, MainListActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        a.startActivity(i);
    }

    @Override protected SparseArray<Class> initNewSparseArray(){
        SparseArray<Class> result = new SparseArray<>();
        result.put(0, HelloCodelabActivity.class);

        return result;
    }
}