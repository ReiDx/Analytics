package com.reidx.analytics;

import android.util.Log;

public class ReidxAnalytics {
    public static final String TAG = "[REIDX ANALYTICS]";
    public static String token = "";

    private boolean Valid = true;
    public ReidxAnalytics(String token) {
        this.token = token;
        if (new Verify(token).Verify()) {
            Log.d(TAG, "initialize success");
            Log.d(TAG, "{token: \""+token+"\", valid: true}");
        } else {
            Log.e(TAG, "initialize fail");
            Log.e(TAG, "{token: \""+token+"\", valid: false}");
        }
    }

    public void Log() {
        
    }
}
