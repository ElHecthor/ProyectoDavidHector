package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && C1787m.m7758s()) {
            C1507c.m6802e().mo5718a();
        }
    }
}