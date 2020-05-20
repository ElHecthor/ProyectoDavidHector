package p242i.p243a.p244a.p245a.p246n.p247a;

import android.content.Context;

/* renamed from: i.a.a.a.n.a.a */
public abstract class C4797a<T> implements C4799c<T> {

    /* renamed from: a */
    private final C4799c<T> f12542a;

    public C4797a(C4799c<T> cVar) {
        this.f12542a = cVar;
    }

    /* renamed from: b */
    private void m19308b(Context context, T t) {
        if (t != null) {
            mo13847a(context, t);
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo13845a(Context context);

    /* renamed from: a */
    public final synchronized T mo13846a(Context context, C4800d<T> dVar) {
        T a;
        a = mo13845a(context);
        if (a == null) {
            a = this.f12542a != null ? this.f12542a.mo13846a(context, dVar) : dVar.mo13848a(context);
            m19308b(context, a);
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13847a(Context context, T t);
}
