package p147g.p156d.p157a.p158a.p159i.p162v;

import com.google.android.datatransport.runtime.backends.C1904e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.C1940s;
import java.util.concurrent.Executor;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;
import p240h.p241a.C4773b;
import p306j.p307a.C5718a;

/* renamed from: g.d.a.a.i.v.d */
public final class C3784d implements C4773b<C3783c> {

    /* renamed from: a */
    private final C5718a<Executor> f10687a;

    /* renamed from: b */
    private final C5718a<C1904e> f10688b;

    /* renamed from: c */
    private final C5718a<C1940s> f10689c;

    /* renamed from: d */
    private final C5718a<C3796c> f10690d;

    /* renamed from: e */
    private final C5718a<C3831b> f10691e;

    public C3784d(C5718a<Executor> aVar, C5718a<C1904e> aVar2, C5718a<C1940s> aVar3, C5718a<C3796c> aVar4, C5718a<C3831b> aVar5) {
        this.f10687a = aVar;
        this.f10688b = aVar2;
        this.f10689c = aVar3;
        this.f10690d = aVar4;
        this.f10691e = aVar5;
    }

    /* renamed from: a */
    public static C3784d m15429a(C5718a<Executor> aVar, C5718a<C1904e> aVar2, C5718a<C1940s> aVar3, C5718a<C3796c> aVar4, C5718a<C3831b> aVar5) {
        C3784d dVar = new C3784d(aVar, aVar2, aVar3, aVar4, aVar5);
        return dVar;
    }

    public C3783c get() {
        C3783c cVar = new C3783c((Executor) this.f10687a.get(), (C1904e) this.f10688b.get(), (C1940s) this.f10689c.get(), (C3796c) this.f10690d.get(), (C3831b) this.f10691e.get());
        return cVar;
    }
}
