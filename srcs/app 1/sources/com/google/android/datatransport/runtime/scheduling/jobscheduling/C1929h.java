package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p147g.p156d.p157a.p158a.p159i.C3767l;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.h */
final /* synthetic */ class C1929h implements Runnable {

    /* renamed from: f */
    private final C1934m f5669f;

    /* renamed from: g */
    private final C3767l f5670g;

    /* renamed from: h */
    private final int f5671h;

    /* renamed from: i */
    private final Runnable f5672i;

    private C1929h(C1934m mVar, C3767l lVar, int i, Runnable runnable) {
        this.f5669f = mVar;
        this.f5670g = lVar;
        this.f5671h = i;
        this.f5672i = runnable;
    }

    /* renamed from: a */
    public static Runnable m8161a(C1934m mVar, C3767l lVar, int i, Runnable runnable) {
        return new C1929h(mVar, lVar, i, runnable);
    }

    public void run() {
        C1934m.m8173a(this.f5669f, this.f5670g, this.f5671h, this.f5672i);
    }
}
