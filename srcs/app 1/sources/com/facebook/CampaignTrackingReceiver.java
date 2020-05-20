package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.p034f0.C1547g;

public final class CampaignTrackingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String str = "referrer";
        String stringExtra = intent.getStringExtra(str);
        if (stringExtra != null && stringExtra.startsWith("fb")) {
            C1547g.m6883a(intent.getStringExtra(str));
        }
    }
}
