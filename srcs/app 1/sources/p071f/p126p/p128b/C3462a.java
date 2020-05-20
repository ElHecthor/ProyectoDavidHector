package p071f.p126p.p128b;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import p071f.p097h.p104i.C3279b;
import p071f.p097h.p107l.C3322i;

/* renamed from: f.p.b.a */
public abstract class C3462a<D> extends C3464b<D> {

    /* renamed from: i */
    private final Executor f9808i;

    /* renamed from: j */
    volatile C3463a f9809j;

    /* renamed from: k */
    volatile C3463a f9810k;

    /* renamed from: l */
    long f9811l;

    /* renamed from: m */
    long f9812m;

    /* renamed from: n */
    Handler f9813n;

    /* renamed from: f.p.b.a$a */
    final class C3463a extends C3467c<Void, Void, D> implements Runnable {

        /* renamed from: o */
        private final CountDownLatch f9814o = new CountDownLatch(1);

        /* renamed from: p */
        boolean f9815p;

        C3463a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public D mo11047a(Void... voidArr) {
            try {
                return C3462a.this.mo11046u();
            } catch (C3279b e) {
                if (mo11074a()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo11049b(D d) {
            try {
                C3462a.this.mo11038a(this, d);
            } finally {
                this.f9814o.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo11050c(D d) {
            try {
                C3462a.this.mo11040b(this, d);
            } finally {
                this.f9814o.countDown();
            }
        }

        public void run() {
            this.f9815p = false;
            C3462a.this.mo11045s();
        }
    }

    public C3462a(Context context) {
        this(context, C3467c.f9827m);
    }

    private C3462a(Context context, Executor executor) {
        super(context);
        this.f9812m = -10000;
        this.f9808i = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11038a(C3463a aVar, D d) {
        mo11041c(d);
        if (this.f9810k == aVar) {
            mo11067o();
            this.f9812m = SystemClock.uptimeMillis();
            this.f9810k = null;
            mo11059d();
            mo11045s();
        }
    }

    @Deprecated
    /* renamed from: a */
    public void mo11039a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo11039a(str, fileDescriptor, printWriter, strArr);
        String str2 = " waiting=";
        if (this.f9809j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f9809j);
            printWriter.print(str2);
            printWriter.println(this.f9809j.f9815p);
        }
        if (this.f9810k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f9810k);
            printWriter.print(str2);
            printWriter.println(this.f9810k.f9815p);
        }
        if (this.f9811l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C3322i.m13552a(this.f9811l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C3322i.m13551a(this.f9812m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11040b(C3463a aVar, D d) {
        if (this.f9809j != aVar) {
            mo11038a(aVar, d);
        } else if (mo11061f()) {
            mo11041c(d);
        } else {
            mo11058c();
            this.f9812m = SystemClock.uptimeMillis();
            this.f9809j = null;
            mo11056b(d);
        }
    }

    /* renamed from: c */
    public void mo11041c(D d) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public boolean mo11042h() {
        if (this.f9809j == null) {
            return false;
        }
        if (!this.f9820d) {
            this.f9823g = true;
        }
        if (this.f9810k != null) {
            if (this.f9809j.f9815p) {
                this.f9809j.f9815p = false;
                this.f9813n.removeCallbacks(this.f9809j);
            }
            this.f9809j = null;
            return false;
        } else if (this.f9809j.f9815p) {
            this.f9809j.f9815p = false;
            this.f9813n.removeCallbacks(this.f9809j);
            this.f9809j = null;
            return false;
        } else {
            boolean a = this.f9809j.mo11075a(false);
            if (a) {
                this.f9810k = this.f9809j;
                mo11044r();
            }
            this.f9809j = null;
            return a;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo11043j() {
        super.mo11043j();
        mo11057b();
        this.f9809j = new C3463a<>();
        mo11045s();
    }

    /* renamed from: r */
    public void mo11044r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public void mo11045s() {
        if (this.f9810k == null && this.f9809j != null) {
            if (this.f9809j.f9815p) {
                this.f9809j.f9815p = false;
                this.f9813n.removeCallbacks(this.f9809j);
            }
            if (this.f9811l <= 0 || SystemClock.uptimeMillis() >= this.f9812m + this.f9811l) {
                this.f9809j.mo11072a(this.f9808i, null);
            } else {
                this.f9809j.f9815p = true;
                this.f9813n.postAtTime(this.f9809j, this.f9812m + this.f9811l);
            }
        }
    }

    /* renamed from: t */
    public abstract D mo6552t();

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public D mo11046u() {
        return mo6552t();
    }
}
