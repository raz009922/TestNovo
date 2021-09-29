package com.rajibroy.technovotest.manager;

import android.app.Activity;
import android.content.Intent;

import com.rajibroy.technovotest.details.DetailsActivity;

public class ActivityManager {

    public static void gotoDetailsActivity(Activity activity){
        Intent intent = new Intent(activity, DetailsActivity.class);
        activity.startActivity(intent);
    }

}
