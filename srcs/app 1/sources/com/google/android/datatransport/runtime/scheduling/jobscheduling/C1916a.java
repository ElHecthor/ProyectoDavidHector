package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.util.Base64;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.p160t.C3777a;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;
import p147g.p156d.p157a.p158a.p159i.p166y.C3839a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.a */
public class C1916a implements C1940s {

    /* renamed from: a */
    private final Context f5644a;

    /* renamed from: b */
    private final C3796c f5645b;

    /* renamed from: c */
    private AlarmManager f5646c;

    /* renamed from: d */
    private final C1924g f5647d;

    /* renamed from: e */
    private final C3833a f5648e;

    C1916a(Context context, C3796c cVar, AlarmManager alarmManager, C3833a aVar, C1924g gVar) {
        this.f5644a = context;
        this.f5645b = cVar;
        this.f5646c = alarmManager;
        this.f5648e = aVar;
        this.f5647d = gVar;
    }

    public C1916a(Context context, C3796c cVar, C3833a aVar, C1924g gVar) {
        this(context, cVar, (AlarmManager) context.getSystemService("alarm"), aVar, gVar);
    }

    /* renamed from: a */
    public void mo6432a(C3767l lVar, int i) {
        Builder builder = new Builder();
        builder.appendQueryParameter("backendName", lVar.mo11928a());
        builder.appendQueryParameter("priority", String.valueOf(C3839a.m15580a(lVar.mo11930c())));
        if (lVar.mo11929b() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(lVar.mo11929b(), 0));
        }
        Intent intent = new Intent(this.f5644a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        String str = "AlarmManagerScheduler";
        if (mo6433a(intent)) {
            C3777a.m15416a(str, "Upload for context %s is already scheduled. Returning...", (Object) lVar);
            return;
        }
        long b = this.f5645b.mo11987b(lVar);
        long a = this.f5647d.mo6452a(lVar.mo11930c(), b, i);
        C3777a.m15418a(str, "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", lVar, Long.valueOf(a), Long.valueOf(b), Integer.valueOf(i));
        this.f5646c.set(3, this.f5648e.mo12001a() + a, PendingIntent.getBroadcast(this.f5644a, 0, intent, 0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6433a(Intent intent) {
        return PendingIntent.getBroadcast(this.f5644a, 0, intent, 536870912) != null;
    }
}
