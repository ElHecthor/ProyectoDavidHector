package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.p064q.C3018b;
import com.google.firebase.installations.p064q.C3019c;
import com.google.firebase.installations.p064q.C3021d;
import com.google.firebase.installations.p065r.C3029c;
import com.google.firebase.installations.p065r.C3030d;
import com.google.firebase.installations.p065r.C3033e;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3043h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.firebase.installations.g */
public class C3001g implements C3004h {

    /* renamed from: k */
    private static final Object f8580k = new Object();

    /* renamed from: l */
    private static final ThreadFactory f8581l = new C3002a();

    /* renamed from: a */
    private final FirebaseApp f8582a;

    /* renamed from: b */
    private final C3029c f8583b;

    /* renamed from: c */
    private final C3019c f8584c;

    /* renamed from: d */
    private final C3014p f8585d;

    /* renamed from: e */
    private final C3018b f8586e;

    /* renamed from: f */
    private final C3012n f8587f;

    /* renamed from: g */
    private final Object f8588g;

    /* renamed from: h */
    private final ExecutorService f8589h;

    /* renamed from: i */
    private final ExecutorService f8590i;

    /* renamed from: j */
    private final List<C3013o> f8591j;

    /* renamed from: com.google.firebase.installations.g$a */
    class C3002a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f8592a = new AtomicInteger(1);

        C3002a() {
        }

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f8592a.getAndIncrement())}));
        }
    }

    /* renamed from: com.google.firebase.installations.g$b */
    static /* synthetic */ class C3003b {

        /* renamed from: a */
        static final /* synthetic */ int[] f8593a;

        /* renamed from: b */
        static final /* synthetic */ int[] f8594b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                com.google.firebase.installations.r.e$b[] r0 = com.google.firebase.installations.p065r.C3033e.C3035b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8594b = r0
                r1 = 1
                com.google.firebase.installations.r.e$b r2 = com.google.firebase.installations.p065r.C3033e.C3035b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f8594b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.firebase.installations.r.e$b r3 = com.google.firebase.installations.p065r.C3033e.C3035b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f8594b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.firebase.installations.r.e$b r3 = com.google.firebase.installations.p065r.C3033e.C3035b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.firebase.installations.r.d$b[] r2 = com.google.firebase.installations.p065r.C3030d.C3032b.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f8593a = r2
                com.google.firebase.installations.r.d$b r3 = com.google.firebase.installations.p065r.C3030d.C3032b.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f8593a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.firebase.installations.r.d$b r2 = com.google.firebase.installations.p065r.C3030d.C3032b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C3001g.C3003b.<clinit>():void");
        }
    }

    C3001g(FirebaseApp firebaseApp, C3043h hVar, C2921c cVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f8581l);
        this(threadPoolExecutor, firebaseApp, new C3029c(firebaseApp.mo9508a(), hVar, cVar), new C3019c(firebaseApp), new C3014p(), new C3018b(firebaseApp), new C3012n());
    }

    C3001g(ExecutorService executorService, FirebaseApp firebaseApp, C3029c cVar, C3019c cVar2, C3014p pVar, C3018b bVar, C3012n nVar) {
        this.f8588g = new Object();
        this.f8591j = new ArrayList();
        this.f8582a = firebaseApp;
        this.f8583b = cVar;
        this.f8584c = cVar2;
        this.f8585d = pVar;
        this.f8586e = bVar;
        this.f8587f = nVar;
        this.f8589h = executorService;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f8581l);
        this.f8590i = threadPoolExecutor;
    }

    /* renamed from: a */
    private C3021d m12230a(C3021d dVar) {
        C3033e a = this.f8583b.mo9797a(mo9728a(), dVar.mo9740c(), mo9730c(), dVar.mo9742e());
        int i = C3003b.f8594b[a.mo9786a().ordinal()];
        if (i == 1) {
            return dVar.mo9762a(a.mo9787b(), a.mo9788c(), this.f8585d.mo9736a());
        } else if (i == 2) {
            return dVar.mo9761a("BAD CONFIG");
        } else {
            if (i == 3) {
                return dVar.mo9771o();
            }
            throw new IOException();
        }
    }

    /* renamed from: a */
    private void m12233a(C3021d dVar, Exception exc) {
        synchronized (this.f8588g) {
            Iterator it = this.f8591j.iterator();
            while (it.hasNext()) {
                if (((C3013o) it.next()).mo9734a(dVar, exc)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: b */
    private String m12234b(C3021d dVar) {
        if ((!this.f8582a.mo9510b().equals("CHIME_ANDROID_SDK") && !this.f8582a.mo9513e()) || !dVar.mo9769l()) {
            return this.f8587f.mo9735a();
        }
        String a = this.f8586e.mo9757a();
        if (TextUtils.isEmpty(a)) {
            a = this.f8587f.mo9735a();
        }
        return a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m12236b(boolean r3) {
        /*
            r2 = this;
            com.google.firebase.installations.q.d r0 = r2.m12246j()
            boolean r1 = r0.mo9765h()     // Catch:{ IOException -> 0x004e }
            if (r1 != 0) goto L_0x0022
            boolean r1 = r0.mo9768k()     // Catch:{ IOException -> 0x004e }
            if (r1 == 0) goto L_0x0011
            goto L_0x0022
        L_0x0011:
            if (r3 != 0) goto L_0x001d
            com.google.firebase.installations.p r3 = r2.f8585d     // Catch:{ IOException -> 0x004e }
            boolean r3 = r3.mo9737a(r0)     // Catch:{ IOException -> 0x004e }
            if (r3 == 0) goto L_0x001c
            goto L_0x001d
        L_0x001c:
            return
        L_0x001d:
            com.google.firebase.installations.q.d r3 = r2.m12230a(r0)     // Catch:{ IOException -> 0x004e }
            goto L_0x0026
        L_0x0022:
            com.google.firebase.installations.q.d r3 = r2.m12237c(r0)     // Catch:{ IOException -> 0x004e }
        L_0x0026:
            com.google.firebase.installations.q.c r0 = r2.f8584c
            r0.mo9760a(r3)
            boolean r0 = r3.mo9765h()
            if (r0 == 0) goto L_0x003c
            com.google.firebase.installations.i r0 = new com.google.firebase.installations.i
            com.google.firebase.installations.i$a r1 = com.google.firebase.installations.C3005i.C3006a.BAD_CONFIG
            r0.<init>(r1)
        L_0x0038:
            r2.m12233a(r3, r0)
            goto L_0x004d
        L_0x003c:
            boolean r0 = r3.mo9766i()
            if (r0 == 0) goto L_0x004a
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "cleared fid due to auth error"
            r0.<init>(r1)
            goto L_0x0038
        L_0x004a:
            r2.m12240d(r3)
        L_0x004d:
            return
        L_0x004e:
            r3 = move-exception
            r2.m12233a(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.C3001g.m12236b(boolean):void");
    }

    /* renamed from: c */
    private C3021d m12237c(C3021d dVar) {
        C3030d a = this.f8583b.mo9796a(mo9728a(), dVar.mo9740c(), mo9730c(), mo9729b(), dVar.mo9740c().length() == 11 ? this.f8586e.mo9758b() : null);
        int i = C3003b.f8593a[a.mo9775d().ordinal()];
        if (i == 1) {
            return dVar.mo9763a(a.mo9773b(), a.mo9774c(), this.f8585d.mo9736a(), a.mo9772a().mo9787b(), a.mo9772a().mo9788c());
        } else if (i == 2) {
            return dVar.mo9761a("BAD CONFIG");
        } else {
            throw new IOException();
        }
    }

    /* renamed from: c */
    private final void m12239c(boolean z) {
        C3021d j = m12246j();
        if (z) {
            j = j.mo9770n();
        }
        m12240d(j);
        this.f8590i.execute(C3000f.m12229a(this, z));
    }

    /* renamed from: d */
    private void m12240d(C3021d dVar) {
        synchronized (this.f8588g) {
            Iterator it = this.f8591j.iterator();
            while (it.hasNext()) {
                if (((C3013o) it.next()).mo9733a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    private C4350h<C3010m> m12241e() {
        C4351i iVar = new C4351i();
        C3008k kVar = new C3008k(this.f8585d, iVar);
        synchronized (this.f8588g) {
            this.f8591j.add(kVar);
        }
        return iVar.mo13025a();
    }

    /* renamed from: f */
    private C4350h<String> m12242f() {
        C4351i iVar = new C4351i();
        C3009l lVar = new C3009l(iVar);
        synchronized (this.f8588g) {
            this.f8591j.add(lVar);
        }
        return iVar.mo13025a();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m12243g() {
        m12239c(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m12244h() {
        m12239c(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m12245i() {
        m12239c(false);
    }

    /* renamed from: j */
    private C3021d m12246j() {
        C3021d a;
        synchronized (f8580k) {
            C2996b a2 = C2996b.m12224a(this.f8582a.mo9508a(), "generatefid.lock");
            try {
                a = this.f8584c.mo9759a();
                if (a.mo9766i()) {
                    String b = m12234b(a);
                    C3019c cVar = this.f8584c;
                    a = a.mo9764b(b);
                    cVar.mo9760a(a);
                }
                if (a2 != null) {
                    a2.mo9722a();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.mo9722a();
                }
                throw th;
            }
        }
        return a;
    }

    /* renamed from: a */
    public C4350h<C3010m> mo9727a(boolean z) {
        ExecutorService executorService;
        Runnable runnable;
        C4350h<C3010m> e = m12241e();
        if (z) {
            executorService = this.f8589h;
            runnable = C2998d.m12227a(this);
        } else {
            executorService = this.f8589h;
            runnable = C2999e.m12228a(this);
        }
        executorService.execute(runnable);
        return e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo9728a() {
        return this.f8582a.mo9511c().mo9577a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo9729b() {
        return this.f8582a.mo9511c().mo9578b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public String mo9730c() {
        return this.f8582a.mo9511c().mo9580d();
    }

    /* renamed from: d */
    public C4350h<String> mo9731d() {
        C4350h<String> f = m12242f();
        this.f8589h.execute(C2997c.m12226a(this));
        return f;
    }
}
