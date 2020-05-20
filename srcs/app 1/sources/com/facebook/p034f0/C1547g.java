package com.facebook.p034f0;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.facebook.C1499a;

/* renamed from: com.facebook.f0.g */
public class C1547g {

    /* renamed from: a */
    private C1549h f4817a;

    /* renamed from: com.facebook.f0.g$a */
    public enum C1548a {
        AUTO,
        EXPLICIT_ONLY
    }

    private C1547g(Context context, String str, C1499a aVar) {
        this.f4817a = new C1549h(context, str, aVar);
    }

    /* renamed from: a */
    public static String m6880a(Context context) {
        return C1549h.m6890a(context);
    }

    /* renamed from: a */
    public static void m6881a(Application application, String str) {
        C1549h.m6891a(application, str);
    }

    /* renamed from: a */
    public static void m6882a(Context context, String str) {
        C1549h.m6892a(context, str);
    }

    /* renamed from: a */
    public static void m6883a(String str) {
        C1549h.m6896b(str);
    }

    /* renamed from: b */
    public static C1548a m6884b() {
        return C1549h.m6898d();
    }

    /* renamed from: b */
    public static C1547g m6885b(Context context) {
        return new C1547g(context, null, null);
    }

    /* renamed from: c */
    public static String m6886c() {
        return C1531b.m6842b();
    }

    /* renamed from: d */
    public static void m6887d() {
        C1549h.m6902h();
    }

    /* renamed from: a */
    public void mo5756a() {
        this.f4817a.mo5758a();
    }

    /* renamed from: a */
    public void mo5757a(String str, Bundle bundle) {
        this.f4817a.mo5760a(str, bundle);
    }
}
