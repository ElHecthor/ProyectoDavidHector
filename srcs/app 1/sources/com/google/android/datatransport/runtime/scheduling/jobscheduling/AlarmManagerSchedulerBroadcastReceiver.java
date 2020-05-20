package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.C3767l.C3768a;
import p147g.p156d.p157a.p158a.p159i.C3773q;
import p147g.p156d.p157a.p158a.p159i.p166y.C3839a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m8123a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C3773q.m15403a(context);
        C3768a d = C3767l.m15386d();
        d.mo11934a(queryParameter);
        d.mo11933a(C3839a.m15581a(intValue));
        if (queryParameter2 != null) {
            d.mo11935a(Base64.decode(queryParameter2, 0));
        }
        C3773q.m15404b().mo11959a().mo6460a(d.mo11936a(), i, C1917b.m8127a());
    }
}
