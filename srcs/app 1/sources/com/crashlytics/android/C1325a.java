package com.crashlytics.android;

import com.crashlytics.android.p031c.C1332b;
import com.crashlytics.android.p032d.C1369a;
import com.crashlytics.android.p033e.C1448l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4792i;
import p242i.p243a.p244a.p245a.C4793j;

/* renamed from: com.crashlytics.android.a */
public class C1325a extends C4792i<Void> implements C4793j {

    /* renamed from: l */
    public final C1448l f4318l;

    /* renamed from: m */
    public final Collection<? extends C4792i> f4319m;

    public C1325a() {
        this(new C1332b(), new C1369a(), new C1448l());
    }

    C1325a(C1332b bVar, C1369a aVar, C1448l lVar) {
        this.f4318l = lVar;
        this.f4319m = Collections.unmodifiableCollection(Arrays.asList(new C4792i[]{bVar, aVar, lVar}));
    }

    /* renamed from: a */
    public static void m6202a(String str, int i) {
        m6205t();
        m6206u().f4318l.mo5624a(str, i);
    }

    /* renamed from: a */
    public static void m6203a(String str, String str2) {
        m6205t();
        m6206u().f4318l.mo5625a(str, str2);
    }

    /* renamed from: a */
    public static void m6204a(Throwable th) {
        m6205t();
        m6206u().f4318l.mo5626a(th);
    }

    /* renamed from: t */
    private static void m6205t() {
        if (m6206u() == null) {
            throw new IllegalStateException("Crashlytics must be initialized by calling Fabric.with(Context) prior to calling Crashlytics.getInstance()");
        }
    }

    /* renamed from: u */
    public static C1325a m6206u() {
        return (C1325a) C4781c.m19220a(C1325a.class);
    }

    /* renamed from: f */
    public Collection<? extends C4792i> mo5399f() {
        return this.f4319m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public Void m6209h() {
        return null;
    }

    /* renamed from: n */
    public String mo5401n() {
        return "com.crashlytics.sdk.android:crashlytics";
    }

    /* renamed from: p */
    public String mo5402p() {
        return "2.10.1.34";
    }
}
