package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.C2001f;
import com.google.android.gms.common.api.C2004g;
import com.google.android.gms.common.api.C2004g.C2005a;
import com.google.android.gms.common.api.C2008i;
import com.google.android.gms.common.api.C2071k;
import com.google.android.gms.common.api.C2072l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C2148s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p147g.p156d.p157a.p167b.p173d.p177d.C3878d;

@KeepName
public abstract class BasePendingResult<R extends C2071k> extends C2004g<R> {

    /* renamed from: n */
    static final ThreadLocal<Boolean> f5823n = new C2063w0();

    /* renamed from: a */
    private final Object f5824a;

    /* renamed from: b */
    private final C2009a<R> f5825b;

    /* renamed from: c */
    private final CountDownLatch f5826c;

    /* renamed from: d */
    private final ArrayList<C2005a> f5827d;

    /* renamed from: e */
    private C2072l<? super R> f5828e;

    /* renamed from: f */
    private final AtomicReference<C2045n0> f5829f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public R f5830g;

    /* renamed from: h */
    private Status f5831h;

    /* renamed from: i */
    private volatile boolean f5832i;

    /* renamed from: j */
    private boolean f5833j;

    /* renamed from: k */
    private boolean f5834k;

    /* renamed from: l */
    private volatile C2041l0<R> f5835l;

    /* renamed from: m */
    private boolean f5836m;
    @KeepName
    private C2010b mResultGuardian;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C2009a<R extends C2071k> extends C3878d {
        public C2009a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo6638a(C2072l<? super R> lVar, R r) {
            BasePendingResult.m8371a(lVar);
            sendMessage(obtainMessage(1, new Pair(lVar, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                C2072l lVar = (C2072l) pair.first;
                C2071k kVar = (C2071k) pair.second;
                try {
                    lVar.mo6769a(kVar);
                } catch (RuntimeException e) {
                    BasePendingResult.m8375c(kVar);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo6637b(Status.f5799m);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C2010b {
        private C2010b() {
        }

        /* synthetic */ C2010b(BasePendingResult basePendingResult, C2063w0 w0Var) {
            this();
        }

        /* access modifiers changed from: protected */
        public final void finalize() {
            BasePendingResult.m8375c(BasePendingResult.this.f5830g);
            super.finalize();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f5824a = new Object();
        this.f5826c = new CountDownLatch(1);
        this.f5827d = new ArrayList<>();
        this.f5829f = new AtomicReference<>();
        this.f5836m = false;
        this.f5825b = new C2009a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    protected BasePendingResult(C2001f fVar) {
        this.f5824a = new Object();
        this.f5826c = new CountDownLatch(1);
        this.f5827d = new ArrayList<>();
        this.f5829f = new AtomicReference<>();
        this.f5836m = false;
        this.f5825b = new C2009a<>(fVar != null ? fVar.mo6626a() : Looper.getMainLooper());
        new WeakReference(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <R extends C2071k> C2072l<R> m8371a(C2072l<R> lVar) {
        return lVar;
    }

    /* renamed from: b */
    private final void mo6675b(R r) {
        this.f5830g = r;
        this.f5826c.countDown();
        this.f5831h = this.f5830g.mo6518c();
        if (this.f5833j) {
            this.f5828e = null;
        } else if (this.f5828e != null) {
            this.f5825b.removeMessages(2);
            this.f5825b.mo6638a(this.f5828e, m8374c());
        } else if (this.f5830g instanceof C2008i) {
            this.mResultGuardian = new C2010b(this, null);
        }
        ArrayList<C2005a> arrayList = this.f5827d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C2005a) obj).mo6632a(this.f5831h);
        }
        this.f5827d.clear();
    }

    /* renamed from: c */
    private final R m8374c() {
        R r;
        synchronized (this.f5824a) {
            C2148s.m8846b(!this.f5832i, "Result has already been consumed.");
            C2148s.m8846b(mo6635a(), "Result is not ready.");
            r = this.f5830g;
            this.f5830g = null;
            this.f5828e = null;
            this.f5832i = true;
        }
        C2045n0 n0Var = (C2045n0) this.f5829f.getAndSet(null);
        if (n0Var != null) {
            n0Var.mo6734a(this);
        }
        return r;
    }

    /* renamed from: c */
    public static void m8375c(C2071k kVar) {
        if (kVar instanceof C2008i) {
            try {
                ((C2008i) kVar).mo6633a();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(kVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public final R mo6630a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C2148s.m8847c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C2148s.m8846b(!this.f5832i, "Result has already been consumed.");
        if (this.f5835l != null) {
            z = false;
        }
        C2148s.m8846b(z, "Cannot await if then() has been called.");
        try {
            if (!this.f5826c.await(j, timeUnit)) {
                mo6637b(Status.f5799m);
            }
        } catch (InterruptedException unused) {
            mo6637b(Status.f5797k);
        }
        C2148s.m8846b(mo6635a(), "Result is not ready.");
        return m8374c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo6558a(Status status);

    /* renamed from: a */
    public final void mo6631a(C2005a aVar) {
        C2148s.m8842a(aVar != null, (Object) "Callback cannot be null.");
        synchronized (this.f5824a) {
            if (mo6635a()) {
                aVar.mo6632a(this.f5831h);
            } else {
                this.f5827d.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo6634a(R r) {
        synchronized (this.f5824a) {
            if (this.f5834k || this.f5833j) {
                m8375c(r);
                return;
            }
            mo6635a();
            boolean z = true;
            C2148s.m8846b(!mo6635a(), "Results have already been set");
            if (this.f5832i) {
                z = false;
            }
            C2148s.m8846b(z, "Result has already been consumed");
            mo6675b(r);
        }
    }

    /* renamed from: a */
    public final boolean mo6635a() {
        return this.f5826c.getCount() == 0;
    }

    /* renamed from: b */
    public final void mo6636b() {
        this.f5836m = this.f5836m || ((Boolean) f5823n.get()).booleanValue();
    }

    /* renamed from: b */
    public final void mo6637b(Status status) {
        synchronized (this.f5824a) {
            if (!mo6635a()) {
                mo6634a((R) mo6558a(status));
                this.f5834k = true;
            }
        }
    }
}
