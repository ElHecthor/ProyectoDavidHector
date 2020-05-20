package com.google.firebase.installations.p064q;

import com.google.firebase.installations.p064q.C3019c.C3020a;

/* renamed from: com.google.firebase.installations.q.d */
public abstract class C3021d {

    /* renamed from: com.google.firebase.installations.q.d$a */
    public static abstract class C3022a {
        /* renamed from: a */
        public abstract C3022a mo9749a(long j);

        /* renamed from: a */
        public abstract C3022a mo9750a(C3020a aVar);

        /* renamed from: a */
        public abstract C3022a mo9751a(String str);

        /* renamed from: a */
        public abstract C3021d mo9752a();

        /* renamed from: b */
        public abstract C3022a mo9753b(long j);

        /* renamed from: b */
        public abstract C3022a mo9754b(String str);

        /* renamed from: c */
        public abstract C3022a mo9755c(String str);

        /* renamed from: d */
        public abstract C3022a mo9756d(String str);
    }

    static {
        m12303p().mo9752a();
    }

    /* renamed from: p */
    public static C3022a m12303p() {
        C3017b bVar = new C3017b();
        bVar.mo9753b(0);
        bVar.mo9750a(C3020a.ATTEMPT_MIGRATION);
        bVar.mo9749a(0);
        return bVar;
    }

    /* renamed from: a */
    public C3021d mo9761a(String str) {
        C3022a m = mo9747m();
        m.mo9755c(str);
        m.mo9750a(C3020a.REGISTER_ERROR);
        return m.mo9752a();
    }

    /* renamed from: a */
    public C3021d mo9762a(String str, long j, long j2) {
        C3022a m = mo9747m();
        m.mo9751a(str);
        m.mo9749a(j);
        m.mo9753b(j2);
        return m.mo9752a();
    }

    /* renamed from: a */
    public C3021d mo9763a(String str, String str2, long j, String str3, long j2) {
        C3022a m = mo9747m();
        m.mo9754b(str);
        m.mo9750a(C3020a.REGISTERED);
        m.mo9751a(str3);
        m.mo9756d(str2);
        m.mo9749a(j2);
        m.mo9753b(j);
        return m.mo9752a();
    }

    /* renamed from: a */
    public abstract String mo9738a();

    /* renamed from: b */
    public abstract long mo9739b();

    /* renamed from: b */
    public C3021d mo9764b(String str) {
        C3022a m = mo9747m();
        m.mo9754b(str);
        m.mo9750a(C3020a.UNREGISTERED);
        return m.mo9752a();
    }

    /* renamed from: c */
    public abstract String mo9740c();

    /* renamed from: d */
    public abstract String mo9741d();

    /* renamed from: e */
    public abstract String mo9742e();

    /* renamed from: f */
    public abstract C3020a mo9744f();

    /* renamed from: g */
    public abstract long mo9745g();

    /* renamed from: h */
    public boolean mo9765h() {
        return mo9744f() == C3020a.REGISTER_ERROR;
    }

    /* renamed from: i */
    public boolean mo9766i() {
        return mo9744f() == C3020a.NOT_GENERATED || mo9744f() == C3020a.ATTEMPT_MIGRATION;
    }

    /* renamed from: j */
    public boolean mo9767j() {
        return mo9744f() == C3020a.REGISTERED;
    }

    /* renamed from: k */
    public boolean mo9768k() {
        return mo9744f() == C3020a.UNREGISTERED;
    }

    /* renamed from: l */
    public boolean mo9769l() {
        return mo9744f() == C3020a.ATTEMPT_MIGRATION;
    }

    /* renamed from: m */
    public abstract C3022a mo9747m();

    /* renamed from: n */
    public C3021d mo9770n() {
        C3022a m = mo9747m();
        m.mo9751a((String) null);
        return m.mo9752a();
    }

    /* renamed from: o */
    public C3021d mo9771o() {
        C3022a m = mo9747m();
        m.mo9750a(C3020a.NOT_GENERATED);
        return m.mo9752a();
    }
}
