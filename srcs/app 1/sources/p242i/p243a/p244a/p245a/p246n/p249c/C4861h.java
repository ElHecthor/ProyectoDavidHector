package p242i.p243a.p244a.p245a.p246n.p249c;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: i.a.a.a.n.c.h */
public class C4861h<V> extends FutureTask<V> implements C4853b<C4866l>, C4862i, C4866l {

    /* renamed from: f */
    final Object f12685f;

    public C4861h(Runnable runnable, V v) {
        super(runnable, v);
        this.f12685f = mo13963b(runnable);
    }

    public C4861h(Callable<V> callable) {
        super(callable);
        this.f12685f = mo13963b(callable);
    }

    /* renamed from: a */
    public void mo13930a(C4866l lVar) {
        ((C4853b) ((C4862i) mo13961i())).mo13930a(lVar);
    }

    /* renamed from: a */
    public void mo13954a(Throwable th) {
        ((C4866l) ((C4862i) mo13961i())).mo13954a(th);
    }

    /* renamed from: a */
    public void mo13956a(boolean z) {
        ((C4866l) ((C4862i) mo13961i())).mo13956a(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public <T extends C4853b<C4866l> & C4862i & C4866l> T mo13963b(Object obj) {
        return C4863j.m19526b(obj) ? (C4853b) obj : new C4863j();
    }

    public int compareTo(Object obj) {
        return ((C4862i) mo13961i()).compareTo(obj);
    }

    /* renamed from: f */
    public boolean mo13958f() {
        return ((C4866l) ((C4862i) mo13961i())).mo13958f();
    }

    /* renamed from: g */
    public boolean mo13931g() {
        return ((C4853b) ((C4862i) mo13961i())).mo13931g();
    }

    /* renamed from: h */
    public Collection<C4866l> mo13932h() {
        return ((C4853b) ((C4862i) mo13961i())).mo13932h();
    }

    /* renamed from: i */
    public <T extends C4853b<C4866l> & C4862i & C4866l> T mo13961i() {
        return (C4853b) this.f12685f;
    }

    /* renamed from: k */
    public C4856e mo5636k() {
        return ((C4862i) mo13961i()).mo5636k();
    }
}
