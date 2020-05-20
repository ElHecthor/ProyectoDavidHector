package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.C2148s;
import p147g.p156d.p157a.p167b.p173d.p180g.C3923b;

/* renamed from: com.google.android.gms.measurement.internal.f6 */
public final class C2300f6 {

    /* renamed from: a */
    final Context f6436a;

    /* renamed from: b */
    String f6437b;

    /* renamed from: c */
    String f6438c;

    /* renamed from: d */
    String f6439d;

    /* renamed from: e */
    Boolean f6440e;

    /* renamed from: f */
    long f6441f;

    /* renamed from: g */
    C3923b f6442g;

    /* renamed from: h */
    boolean f6443h = true;

    /* renamed from: i */
    Long f6444i;

    public C2300f6(Context context, C3923b bVar, Long l) {
        C2148s.m8834a(context);
        Context applicationContext = context.getApplicationContext();
        C2148s.m8834a(applicationContext);
        this.f6436a = applicationContext;
        this.f6444i = l;
        if (bVar != null) {
            this.f6442g = bVar;
            this.f6437b = bVar.f10822k;
            this.f6438c = bVar.f10821j;
            this.f6439d = bVar.f10820i;
            this.f6443h = bVar.f10819h;
            this.f6441f = bVar.f10818g;
            Bundle bundle = bVar.f10823l;
            if (bundle != null) {
                this.f6440e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
