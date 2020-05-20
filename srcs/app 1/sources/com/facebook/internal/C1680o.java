package com.facebook.internal;

import com.facebook.C1787m;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: com.facebook.internal.o */
public class C1680o<T> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public T f5125a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CountDownLatch f5126b = new CountDownLatch(1);

    /* renamed from: com.facebook.internal.o$a */
    class C1681a implements Callable<Void> {

        /* renamed from: f */
        final /* synthetic */ Callable f5127f;

        C1681a(Callable callable) {
            this.f5127f = callable;
        }

        /* JADX INFO: finally extract failed */
        public Void call() {
            try {
                C1680o.this.f5125a = this.f5127f.call();
                C1680o.this.f5126b.countDown();
                return null;
            } catch (Throwable th) {
                C1680o.this.f5126b.countDown();
                throw th;
            }
        }
    }

    public C1680o(Callable<T> callable) {
        C1787m.m7751l().execute(new FutureTask(new C1681a(callable)));
    }
}
