package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.C1962i;
import com.google.android.gms.common.C2084e;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.api.C1998e;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.internal.C2011a;
import com.google.android.gms.common.api.internal.C2044n;
import com.google.android.gms.common.internal.C2144r;
import com.google.android.gms.common.internal.C2144r.C2145a;
import com.google.android.gms.dynamite.DynamiteModule;
import p147g.p156d.p157a.p167b.p168a.p169a.C3840a;
import p147g.p156d.p157a.p167b.p184g.C4350h;

/* renamed from: com.google.android.gms.auth.api.signin.b */
public class C1943b extends C1998e<GoogleSignInOptions> {

    /* renamed from: i */
    private static int f5751i = C1945b.f5752a;

    /* renamed from: com.google.android.gms.auth.api.signin.b$a */
    private static class C1944a implements C2145a<C1946c, GoogleSignInAccount> {
        private C1944a() {
        }

        /* synthetic */ C1944a(C1951h hVar) {
            this();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo6516a(C2071k kVar) {
            return ((C1946c) kVar).mo6517a();
        }
    }

    /* 'enum' access flag removed */
    /* renamed from: com.google.android.gms.auth.api.signin.b$b */
    static final class C1945b {

        /* renamed from: a */
        public static final int f5752a = 1;

        /* renamed from: b */
        public static final int f5753b = 2;

        /* renamed from: c */
        public static final int f5754c = 3;

        /* renamed from: d */
        public static final int f5755d = 4;

        /* renamed from: e */
        private static final /* synthetic */ int[] f5756e = {1, 2, 3, 4};

        /* renamed from: a */
        public static int[] m8241a() {
            return (int[]) f5756e.clone();
        }
    }

    static {
        new C1944a(null);
    }

    C1943b(Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, C3840a.f10765e, googleSignInOptions, (C2044n) new C2011a());
    }

    C1943b(Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, C3840a.f10765e, googleSignInOptions, (C2044n) new C2011a());
    }

    /* renamed from: k */
    private final synchronized int m8236k() {
        if (f5751i == C1945b.f5752a) {
            Context e = mo6620e();
            C2084e a = C2084e.m8612a();
            int a2 = a.mo6797a(e, (int) C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            int i = a2 == 0 ? C1945b.f5755d : (a.mo6801a(e, a2, (String) null) != null || DynamiteModule.m9038a(e, "com.google.android.gms.auth.api.fallback") == 0) ? C1945b.f5753b : C1945b.f5754c;
            f5751i = i;
        }
        return f5751i;
    }

    /* renamed from: h */
    public Intent mo6513h() {
        Context e = mo6620e();
        int i = C1951h.f5760a[m8236k() - 1];
        return i != 1 ? i != 2 ? C1962i.m8280c(e, (GoogleSignInOptions) mo6619d()) : C1962i.m8274a(e, (GoogleSignInOptions) mo6619d()) : C1962i.m8278b(e, (GoogleSignInOptions) mo6619d());
    }

    /* renamed from: i */
    public C4350h<Void> mo6514i() {
        return C2144r.m8827a(C1962i.m8279b(mo6614a(), mo6620e(), m8236k() == C1945b.f5754c));
    }

    /* renamed from: j */
    public C4350h<Void> mo6515j() {
        return C2144r.m8827a(C1962i.m8276a(mo6614a(), mo6620e(), m8236k() == C1945b.f5754c));
    }
}
