package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.C1904e;
import com.google.android.datatransport.runtime.backends.C1905f;
import com.google.android.datatransport.runtime.backends.C1905f.C1906a;
import com.google.android.datatransport.runtime.backends.C1907g;
import com.google.android.datatransport.runtime.backends.C1907g.C1908a;
import com.google.android.datatransport.runtime.backends.C1915m;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p147g.p156d.p157a.p158a.p159i.C3761h;
import p147g.p156d.p157a.p158a.p159i.C3767l;
import p147g.p156d.p157a.p158a.p159i.p160t.C3777a;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3796c;
import p147g.p156d.p157a.p158a.p159i.p162v.p163j.C3807h;
import p147g.p156d.p157a.p158a.p159i.p164w.C3831b;
import p147g.p156d.p157a.p158a.p159i.p165x.C3833a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.m */
public class C1934m {

    /* renamed from: a */
    private final Context f5684a;

    /* renamed from: b */
    private final C1904e f5685b;

    /* renamed from: c */
    private final C3796c f5686c;

    /* renamed from: d */
    private final C1940s f5687d;

    /* renamed from: e */
    private final Executor f5688e;

    /* renamed from: f */
    private final C3831b f5689f;

    /* renamed from: g */
    private final C3833a f5690g;

    public C1934m(Context context, C1904e eVar, C3796c cVar, C1940s sVar, Executor executor, C3831b bVar, C3833a aVar) {
        this.f5684a = context;
        this.f5685b = eVar;
        this.f5686c = cVar;
        this.f5687d = sVar;
        this.f5688e = executor;
        this.f5689f = bVar;
        this.f5690g = aVar;
    }

    /* renamed from: a */
    static /* synthetic */ Object m8171a(C1934m mVar, C1907g gVar, Iterable iterable, C3767l lVar, int i) {
        if (gVar.mo6414b() == C1908a.TRANSIENT_ERROR) {
            mVar.f5686c.mo11988b(iterable);
            mVar.f5687d.mo6432a(lVar, i + 1);
        } else {
            mVar.f5686c.mo11986a(iterable);
            if (gVar.mo6414b() == C1908a.OK) {
                mVar.f5686c.mo11985a(lVar, mVar.f5690g.mo12001a() + gVar.mo6413a());
            }
            if (mVar.f5686c.mo11990c(lVar)) {
                mVar.f5687d.mo6432a(lVar, 1);
            }
        }
        return null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        r5.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        r2.f5687d.mo6432a(r3, r4 + 1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0024 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m8173a(com.google.android.datatransport.runtime.scheduling.jobscheduling.C1934m r2, p147g.p156d.p157a.p158a.p159i.C3767l r3, int r4, java.lang.Runnable r5) {
        /*
            g.d.a.a.i.w.b r0 = r2.f5689f     // Catch:{ a -> 0x0024 }
            g.d.a.a.i.v.j.c r1 = r2.f5686c     // Catch:{ a -> 0x0024 }
            r1.getClass()     // Catch:{ a -> 0x0024 }
            g.d.a.a.i.w.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C1932k.m8166a(r1)     // Catch:{ a -> 0x0024 }
            r0.mo11999a(r1)     // Catch:{ a -> 0x0024 }
            boolean r0 = r2.mo6461a()     // Catch:{ a -> 0x0024 }
            if (r0 != 0) goto L_0x001e
            g.d.a.a.i.w.b r0 = r2.f5689f     // Catch:{ a -> 0x0024 }
            g.d.a.a.i.w.b$a r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.C1933l.m8168a(r2, r3, r4)     // Catch:{ a -> 0x0024 }
            r0.mo11999a(r1)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x001e:
            r2.mo6459a(r3, r4)     // Catch:{ a -> 0x0024 }
            goto L_0x002b
        L_0x0022:
            r2 = move-exception
            goto L_0x002f
        L_0x0024:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.s r2 = r2.f5687d     // Catch:{ all -> 0x0022 }
            int r4 = r4 + 1
            r2.mo6432a(r3, r4)     // Catch:{ all -> 0x0022 }
        L_0x002b:
            r5.run()
            return
        L_0x002f:
            r5.run()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.C1934m.m8173a(com.google.android.datatransport.runtime.scheduling.jobscheduling.m, g.d.a.a.i.l, int, java.lang.Runnable):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6459a(C3767l lVar, int i) {
        C1907g gVar;
        C1915m a = this.f5685b.mo6425a(lVar.mo11928a());
        Iterable<C3807h> iterable = (Iterable) this.f5689f.mo11999a(C1930i.m8162a(this, lVar));
        if (iterable.iterator().hasNext()) {
            if (a == null) {
                C3777a.m15416a("Uploader", "Unknown backend for %s, deleting event batch for it...", (Object) lVar);
                gVar = C1907g.m8104c();
            } else {
                ArrayList arrayList = new ArrayList();
                for (C3807h a2 : iterable) {
                    arrayList.add(a2.mo11976a());
                }
                C1906a c = C1905f.m8097c();
                c.mo6410a((Iterable<C3761h>) arrayList);
                c.mo6411a(lVar.mo11929b());
                gVar = a.mo6401a(c.mo6412a());
            }
            this.f5689f.mo11999a(C1931j.m8164a(this, gVar, iterable, lVar, i));
        }
    }

    /* renamed from: a */
    public void mo6460a(C3767l lVar, int i, Runnable runnable) {
        this.f5688e.execute(C1929h.m8161a(this, lVar, i, runnable));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo6461a() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5684a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
