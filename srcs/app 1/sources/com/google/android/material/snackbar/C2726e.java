package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.snackbar.e */
class C2726e {

    /* renamed from: e */
    private static C2726e f7913e;

    /* renamed from: a */
    private final Object f7914a = new Object();

    /* renamed from: b */
    private final Handler f7915b = new Handler(Looper.getMainLooper(), new C2727a());

    /* renamed from: c */
    private C2729c f7916c;

    /* renamed from: d */
    private C2729c f7917d;

    /* renamed from: com.google.android.material.snackbar.e$a */
    class C2727a implements Callback {
        C2727a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C2726e.this.mo9034a((C2729c) message.obj);
            return true;
        }
    }

    /* renamed from: com.google.android.material.snackbar.e$b */
    interface C2728b {
        /* renamed from: a */
        void mo9037a(int i);
    }

    /* renamed from: com.google.android.material.snackbar.e$c */
    private static class C2729c {

        /* renamed from: a */
        final WeakReference<C2728b> f7919a;

        /* renamed from: b */
        int f7920b;

        /* renamed from: c */
        boolean f7921c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9038a(C2728b bVar) {
            return bVar != null && this.f7919a.get() == bVar;
        }
    }

    private C2726e() {
    }

    /* renamed from: a */
    static C2726e m11303a() {
        if (f7913e == null) {
            f7913e = new C2726e();
        }
        return f7913e;
    }

    /* renamed from: a */
    private boolean m11304a(C2729c cVar, int i) {
        C2728b bVar = (C2728b) cVar.f7919a.get();
        if (bVar == null) {
            return false;
        }
        this.f7915b.removeCallbacksAndMessages(cVar);
        bVar.mo9037a(i);
        return true;
    }

    /* renamed from: b */
    private void m11305b(C2729c cVar) {
        int i = cVar.f7920b;
        if (i != -2) {
            if (i <= 0) {
                i = i == -1 ? 1500 : 2750;
            }
            this.f7915b.removeCallbacksAndMessages(cVar);
            Handler handler = this.f7915b;
            handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), (long) i);
        }
    }

    /* renamed from: c */
    private boolean m11306c(C2728b bVar) {
        C2729c cVar = this.f7916c;
        return cVar != null && cVar.mo9038a(bVar);
    }

    /* renamed from: a */
    public void mo9033a(C2728b bVar) {
        synchronized (this.f7914a) {
            if (m11306c(bVar) && !this.f7916c.f7921c) {
                this.f7916c.f7921c = true;
                this.f7915b.removeCallbacksAndMessages(this.f7916c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo9034a(C2729c cVar) {
        synchronized (this.f7914a) {
            if (this.f7916c == cVar || this.f7917d == cVar) {
                m11304a(cVar, 2);
            }
        }
    }

    /* renamed from: b */
    public void mo9035b(C2728b bVar) {
        synchronized (this.f7914a) {
            if (m11306c(bVar) && this.f7916c.f7921c) {
                this.f7916c.f7921c = false;
                m11305b(this.f7916c);
            }
        }
    }
}
