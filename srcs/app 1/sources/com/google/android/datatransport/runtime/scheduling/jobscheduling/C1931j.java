package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.backends.C1907g;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b.C3832a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.j */
final /* synthetic */ class C1931j implements C3832a {

    /* renamed from: a */
    private final C1934m f5675a;

    /* renamed from: b */
    private final C1907g f5676b;

    /* renamed from: c */
    private final Iterable f5677c;

    /* renamed from: d */
    private final C3767l f5678d;

    /* renamed from: e */
    private final int f5679e;

    private C1931j(C1934m mVar, C1907g gVar, Iterable iterable, C3767l lVar, int i) {
        this.f5675a = mVar;
        this.f5676b = gVar;
        this.f5677c = iterable;
        this.f5678d = lVar;
        this.f5679e = i;
    }

    /* renamed from: a */
    public static C3832a m8164a(C1934m mVar, C1907g gVar, Iterable iterable, C3767l lVar, int i) {
        C1931j jVar = new C1931j(mVar, gVar, iterable, lVar, i);
        return jVar;
    }

    /* renamed from: h */
    public Object mo6458h() {
        return C1934m.m8171a(this.f5675a, this.f5676b, this.f5677c, this.f5678d, this.f5679e);
    }
}
