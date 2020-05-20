package com.facebook.p034f0;

import android.content.Context;
import android.os.Bundle;
import com.facebook.C1499a;
import com.facebook.C1787m;
import com.facebook.p034f0.C1547g.C1548a;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.f0.m */
public class C1558m {

    /* renamed from: a */
    private C1549h f4846a;

    public C1558m(Context context) {
        this.f4846a = new C1549h(context, (String) null, (C1499a) null);
    }

    public C1558m(Context context, String str) {
        this.f4846a = new C1549h(context, str, (C1499a) null);
    }

    public C1558m(String str, String str2, C1499a aVar) {
        this.f4846a = new C1549h(str, str2, aVar);
    }

    /* renamed from: a */
    public static void m6914a(Map<String, String> map) {
        C1563p.m6943b(map);
    }

    /* renamed from: b */
    static Executor m6915b() {
        return C1549h.m6897c();
    }

    /* renamed from: c */
    public static C1548a m6916c() {
        return C1549h.m6898d();
    }

    /* renamed from: d */
    static String m6917d() {
        return C1549h.m6900f();
    }

    /* renamed from: a */
    public void mo5769a() {
        this.f4846a.mo5758a();
    }

    /* renamed from: a */
    public void mo5770a(String str) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5761a(str, (Double) null, (Bundle) null);
        }
    }

    /* renamed from: a */
    public void mo5771a(String str, double d, Bundle bundle) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5759a(str, d, bundle);
        }
    }

    /* renamed from: a */
    public void mo5772a(String str, Bundle bundle) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5760a(str, bundle);
        }
    }

    /* renamed from: a */
    public void mo5773a(String str, Double d, Bundle bundle) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5761a(str, d, bundle);
        }
    }

    /* renamed from: a */
    public void mo5774a(String str, BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5763a(str, bigDecimal, currency, bundle);
        }
    }

    /* renamed from: a */
    public void mo5775a(BigDecimal bigDecimal, Currency currency, Bundle bundle) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5764a(bigDecimal, currency, bundle);
        }
    }

    /* renamed from: b */
    public void mo5776b(String str, Bundle bundle) {
        if (C1787m.m7747h()) {
            this.f4846a.mo5761a(str, (Double) null, bundle);
        }
    }
}
