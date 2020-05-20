package com.bumptech.glide.load.p007o;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

/* renamed from: com.bumptech.glide.load.o.y */
class C1023y {

    /* renamed from: a */
    private boolean f3752a;

    /* renamed from: b */
    private final Handler f3753b = new Handler(Looper.getMainLooper(), new C1024a());

    /* renamed from: com.bumptech.glide.load.o.y$a */
    private static final class C1024a implements Callback {
        C1024a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((C1020v) message.obj).mo4882d();
            return true;
        }
    }

    C1023y() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo4910a(C1020v<?> vVar, boolean z) {
        if (!this.f3752a) {
            if (!z) {
                this.f3752a = true;
                vVar.mo4882d();
                this.f3752a = false;
            }
        }
        this.f3753b.obtainMessage(1, vVar).sendToTarget();
    }
}
