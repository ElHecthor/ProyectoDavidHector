package p308k.p323z.p325d;

import java.io.Serializable;
import p308k.p311c0.C5738a;
import p308k.p311c0.C5740c;
import p308k.p323z.C5906b;

/* renamed from: k.z.d.c */
public abstract class C5932c implements C5738a, Serializable {

    /* renamed from: h */
    public static final Object f14930h = C5933a.f14933f;

    /* renamed from: f */
    private transient C5738a f14931f;

    /* renamed from: g */
    protected final Object f14932g;

    /* renamed from: k.z.d.c$a */
    private static class C5933a implements Serializable {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public static final C5933a f14933f = new C5933a();

        private C5933a() {
        }

        private Object readResolve() {
            return f14933f;
        }
    }

    public C5932c() {
        this(f14930h);
    }

    protected C5932c(Object obj) {
        this.f14932g = obj;
    }

    /* renamed from: a */
    public Object mo15378a(Object... objArr) {
        return mo15609h().mo15378a(objArr);
    }

    /* renamed from: a */
    public C5738a mo15606a() {
        C5738a aVar = this.f14931f;
        if (aVar != null) {
            return aVar;
        }
        C5738a b = mo15607b();
        this.f14931f = b;
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C5738a mo15607b();

    /* renamed from: c */
    public Object mo15608c() {
        return this.f14932g;
    }

    /* renamed from: e */
    public String mo9884e() {
        throw new AbstractMethodError();
    }

    /* renamed from: f */
    public C5740c mo9885f() {
        throw new AbstractMethodError();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C5738a mo15609h() {
        C5738a a = mo15606a();
        if (a != this) {
            return a;
        }
        throw new C5906b();
    }

    /* renamed from: i */
    public String mo9886i() {
        throw new AbstractMethodError();
    }
}
