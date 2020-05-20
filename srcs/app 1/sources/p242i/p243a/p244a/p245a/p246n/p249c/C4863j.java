package p242i.p243a.p244a.p245a.p246n.p249c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: i.a.a.a.n.c.j */
public class C4863j implements C4853b<C4866l>, C4862i, C4866l {

    /* renamed from: f */
    private final List<C4866l> f12686f = new ArrayList();

    /* renamed from: g */
    private final AtomicBoolean f12687g = new AtomicBoolean(false);

    /* renamed from: h */
    private final AtomicReference<Throwable> f12688h = new AtomicReference<>(null);

    /* renamed from: b */
    public static boolean m19526b(Object obj) {
        try {
            return (((C4853b) obj) == null || ((C4866l) obj) == null || ((C4862i) obj) == null) ? false : true;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public synchronized void mo13930a(C4866l lVar) {
        this.f12686f.add(lVar);
    }

    /* renamed from: a */
    public void mo13954a(Throwable th) {
        this.f12688h.set(th);
    }

    /* renamed from: a */
    public synchronized void mo13956a(boolean z) {
        this.f12687g.set(z);
    }

    public int compareTo(Object obj) {
        return C4856e.m19503a(this, obj);
    }

    /* renamed from: f */
    public boolean mo13958f() {
        return this.f12687g.get();
    }

    /* renamed from: g */
    public boolean mo13931g() {
        for (C4866l f : mo13932h()) {
            if (!f.mo13958f()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public synchronized Collection<C4866l> mo13932h() {
        return Collections.unmodifiableCollection(this.f12686f);
    }

    /* renamed from: k */
    public C4856e mo5636k() {
        return C4856e.NORMAL;
    }
}
