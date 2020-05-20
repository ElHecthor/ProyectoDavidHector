package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.C1981a.C1983b;
import com.google.android.gms.common.api.C1981a.C1985d;
import com.google.android.gms.common.api.C1981a.C1992f;
import com.google.android.gms.common.api.internal.C2011a;
import com.google.android.gms.common.api.internal.C2012a0;
import com.google.android.gms.common.api.internal.C2014b;
import com.google.android.gms.common.api.internal.C2021d;
import com.google.android.gms.common.api.internal.C2025f;
import com.google.android.gms.common.api.internal.C2025f.C2026a;
import com.google.android.gms.common.api.internal.C2035i0;
import com.google.android.gms.common.api.internal.C2044n;
import com.google.android.gms.common.api.internal.C2052r;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.common.api.e */
public class C1998e<O extends C1985d> {

    /* renamed from: a */
    private final Context f5809a;

    /* renamed from: b */
    private final C1981a<O> f5810b;

    /* renamed from: c */
    private final O f5811c;

    /* renamed from: d */
    private final C2014b<O> f5812d;

    /* renamed from: e */
    private final Looper f5813e;

    /* renamed from: f */
    private final int f5814f;

    /* renamed from: g */
    private final C2001f f5815g;

    /* renamed from: h */
    protected final C2025f f5816h;

    /* renamed from: com.google.android.gms.common.api.e$a */
    public static class C1999a {

        /* renamed from: a */
        public final C2044n f5817a;

        /* renamed from: b */
        public final Looper f5818b;

        /* renamed from: com.google.android.gms.common.api.e$a$a */
        public static class C2000a {

            /* renamed from: a */
            private C2044n f5819a;

            /* renamed from: b */
            private Looper f5820b;

            /* renamed from: a */
            public C2000a mo6623a(Looper looper) {
                C2148s.m8835a(looper, (Object) "Looper must not be null.");
                this.f5820b = looper;
                return this;
            }

            /* renamed from: a */
            public C2000a mo6624a(C2044n nVar) {
                C2148s.m8835a(nVar, (Object) "StatusExceptionMapper must not be null.");
                this.f5819a = nVar;
                return this;
            }

            /* renamed from: a */
            public C1999a mo6625a() {
                if (this.f5819a == null) {
                    this.f5819a = new C2011a();
                }
                if (this.f5820b == null) {
                    this.f5820b = Looper.getMainLooper();
                }
                return new C1999a(this.f5819a, this.f5820b);
            }
        }

        static {
            new C2000a().mo6625a();
        }

        private C1999a(C2044n nVar, Account account, Looper looper) {
            this.f5817a = nVar;
            this.f5818b = looper;
        }
    }

    public C1998e(Activity activity, C1981a<O> aVar, O o, C1999a aVar2) {
        C2148s.m8835a(activity, (Object) "Null activity is not permitted.");
        C2148s.m8835a(aVar, (Object) "Api must not be null.");
        C2148s.m8835a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f5809a = activity.getApplicationContext();
        this.f5810b = aVar;
        this.f5811c = o;
        this.f5813e = aVar2.f5818b;
        this.f5812d = C2014b.m8397a(aVar, o);
        this.f5815g = new C2012a0(this);
        C2025f a = C2025f.m8431a(this.f5809a);
        this.f5816h = a;
        this.f5814f = a.mo6682a();
        C2044n nVar = aVar2.f5817a;
        if (!(activity instanceof GoogleApiActivity)) {
            C2052r.m8550a(activity, this.f5816h, this.f5812d);
        }
        this.f5816h.mo6683a(this);
    }

    @Deprecated
    public C1998e(Activity activity, C1981a<O> aVar, O o, C2044n nVar) {
        C2000a aVar2 = new C2000a();
        aVar2.mo6624a(nVar);
        aVar2.mo6623a(activity.getMainLooper());
        this(activity, aVar, o, aVar2.mo6625a());
    }

    public C1998e(Context context, C1981a<O> aVar, O o, C1999a aVar2) {
        C2148s.m8835a(context, (Object) "Null context is not permitted.");
        C2148s.m8835a(aVar, (Object) "Api must not be null.");
        C2148s.m8835a(aVar2, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f5809a = context.getApplicationContext();
        this.f5810b = aVar;
        this.f5811c = o;
        this.f5813e = aVar2.f5818b;
        this.f5812d = C2014b.m8397a(aVar, o);
        this.f5815g = new C2012a0(this);
        C2025f a = C2025f.m8431a(this.f5809a);
        this.f5816h = a;
        this.f5814f = a.mo6682a();
        C2044n nVar = aVar2.f5817a;
        this.f5816h.mo6683a(this);
    }

    @Deprecated
    public C1998e(Context context, C1981a<O> aVar, O o, C2044n nVar) {
        C2000a aVar2 = new C2000a();
        aVar2.mo6624a(nVar);
        this(context, aVar, o, aVar2.mo6625a());
    }

    /* renamed from: a */
    private final <A extends C1983b, T extends C2021d<? extends C2071k, A>> T m8344a(int i, T t) {
        t.mo6636b();
        this.f5816h.mo6684a(this, i, t);
        return t;
    }

    /* renamed from: a */
    public C1992f mo6613a(Looper looper, C2026a<O> aVar) {
        return this.f5810b.mo6593c().mo6594a(this.f5809a, looper, mo6617b().mo6878a(), this.f5811c, aVar, aVar);
    }

    /* renamed from: a */
    public C2001f mo6614a() {
        return this.f5815g;
    }

    /* renamed from: a */
    public <A extends C1983b, T extends C2021d<? extends C2071k, A>> T mo6615a(T t) {
        m8344a(1, t);
        return t;
    }

    /* renamed from: a */
    public C2035i0 mo6616a(Context context, Handler handler) {
        return new C2035i0(context, handler, mo6617b().mo6878a());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.common.internal.C2109d.C2110a mo6617b() {
        /*
            r3 = this;
            com.google.android.gms.common.internal.d$a r0 = new com.google.android.gms.common.internal.d$a
            r0.<init>()
            O r1 = r3.f5811c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C1981a.C1985d.C1987b
            if (r2 == 0) goto L_0x0018
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C1981a.C1985d.C1987b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo6596d()
            if (r1 == 0) goto L_0x0018
            android.accounts.Account r1 = r1.mo6482i()
            goto L_0x0026
        L_0x0018:
            O r1 = r3.f5811c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C1981a.C1985d.C1986a
            if (r2 == 0) goto L_0x0025
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.C1981a.C1985d.C1986a) r1
            android.accounts.Account r1 = r1.mo6595i()
            goto L_0x0026
        L_0x0025:
            r1 = 0
        L_0x0026:
            r0.mo6875a(r1)
            O r1 = r3.f5811c
            boolean r2 = r1 instanceof com.google.android.gms.common.api.C1981a.C1985d.C1987b
            if (r2 == 0) goto L_0x003c
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.C1981a.C1985d.C1987b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.mo6596d()
            if (r1 == 0) goto L_0x003c
            java.util.Set r1 = r1.mo6486s()
            goto L_0x0040
        L_0x003c:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x0040:
            r0.mo6877a(r1)
            android.content.Context r1 = r3.f5809a
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.mo6876a(r1)
            android.content.Context r1 = r3.f5809a
            java.lang.String r1 = r1.getPackageName()
            r0.mo6879b(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.C1998e.mo6617b():com.google.android.gms.common.internal.d$a");
    }

    /* renamed from: c */
    public C2014b<O> mo6618c() {
        return this.f5812d;
    }

    /* renamed from: d */
    public O mo6619d() {
        return this.f5811c;
    }

    /* renamed from: e */
    public Context mo6620e() {
        return this.f5809a;
    }

    /* renamed from: f */
    public final int mo6621f() {
        return this.f5814f;
    }

    /* renamed from: g */
    public Looper mo6622g() {
        return this.f5813e;
    }
}
