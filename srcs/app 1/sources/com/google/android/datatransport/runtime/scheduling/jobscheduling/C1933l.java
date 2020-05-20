package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b.C3832a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
final /* synthetic */ class C1933l implements C3832a {

    /* renamed from: a */
    private final C1934m f5681a;

    /* renamed from: b */
    private final C3767l f5682b;

    /* renamed from: c */
    private final int f5683c;

    private C1933l(C1934m mVar, C3767l lVar, int i) {
        this.f5681a = mVar;
        this.f5682b = lVar;
        this.f5683c = i;
    }

    /* renamed from: a */
    public static C3832a m8168a(C1934m mVar, C3767l lVar, int i) {
        return new C1933l(mVar, lVar, i);
    }

    /* renamed from: h */
    public Object mo6458h() {
        return this.f5681a.f5687d.mo6432a(this.f5682b, this.f5683c + 1);
    }
}
