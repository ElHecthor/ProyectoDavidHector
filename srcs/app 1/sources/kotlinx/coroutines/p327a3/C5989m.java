package kotlinx.coroutines.p327a3;

import kotlinx.coroutines.C6157l0;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.a3.m */
public final class C5989m<E> extends C6006z implements C6004x<E> {

    /* renamed from: i */
    public final Throwable f14999i;

    public C5989m(Throwable th) {
        this.f14999i = th;
    }

    /* renamed from: a */
    public void mo15673a(C5989m<?> mVar) {
        C5942k.m22327b(mVar, "closed");
        if (C6157l0.m23149a()) {
            throw new AssertionError();
        }
    }

    /* renamed from: b */
    public Object mo15658b(E e, Object obj) {
        return C5970b.f14973f;
    }

    /* renamed from: c */
    public void mo15659c(Object obj) {
        C5942k.m22327b(obj, "token");
        if (C6157l0.m23149a()) {
            if (!(obj == C5970b.f14973f)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: f */
    public void mo15674f(Object obj) {
        C5942k.m22327b(obj, "token");
        if (C6157l0.m23149a()) {
            if (!(obj == C5970b.f14973f)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: g */
    public Object mo15675g(Object obj) {
        return C5970b.f14973f;
    }

    /* renamed from: h */
    public C5989m<E> m22517h() {
        return this;
    }

    /* renamed from: t */
    public C5989m<E> m22519t() {
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Closed[");
        sb.append(this.f14999i);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public final Throwable mo15703u() {
        Throwable th = this.f14999i;
        return th != null ? th : new C5990n("Channel was closed");
    }

    /* renamed from: v */
    public final Throwable mo15704v() {
        Throwable th = this.f14999i;
        return th != null ? th : new C5991o("Channel was closed");
    }
}
