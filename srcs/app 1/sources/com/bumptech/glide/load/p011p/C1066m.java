package com.bumptech.glide.load.p011p;

import com.bumptech.glide.p029t.C1306g;
import com.bumptech.glide.p029t.C1310k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.p.m */
public class C1066m<A, B> {

    /* renamed from: a */
    private final C1306g<C1068b<A>, B> f3801a;

    /* renamed from: com.bumptech.glide.load.p.m$a */
    class C1067a extends C1306g<C1068b<A>, B> {
        C1067a(C1066m mVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo4752a(C1068b<A> bVar, B b) {
            bVar.mo4956a();
        }
    }

    /* renamed from: com.bumptech.glide.load.p.m$b */
    static final class C1068b<A> {

        /* renamed from: d */
        private static final Queue<C1068b<?>> f3802d = C1310k.m6165a(0);

        /* renamed from: a */
        private int f3803a;

        /* renamed from: b */
        private int f3804b;

        /* renamed from: c */
        private A f3805c;

        private C1068b() {
        }

        /* renamed from: a */
        static <A> C1068b<A> m5208a(A a, int i, int i2) {
            C1068b<A> bVar;
            synchronized (f3802d) {
                bVar = (C1068b) f3802d.poll();
            }
            if (bVar == null) {
                bVar = new C1068b<>();
            }
            bVar.m5209b(a, i, i2);
            return bVar;
        }

        /* renamed from: b */
        private void m5209b(A a, int i, int i2) {
            this.f3805c = a;
            this.f3804b = i;
            this.f3803a = i2;
        }

        /* renamed from: a */
        public void mo4956a() {
            synchronized (f3802d) {
                f3802d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1068b)) {
                return false;
            }
            C1068b bVar = (C1068b) obj;
            return this.f3804b == bVar.f3804b && this.f3803a == bVar.f3803a && this.f3805c.equals(bVar.f3805c);
        }

        public int hashCode() {
            return (((this.f3803a * 31) + this.f3804b) * 31) + this.f3805c.hashCode();
        }
    }

    public C1066m(long j) {
        this.f3801a = new C1067a(this, j);
    }

    /* renamed from: a */
    public B mo4953a(A a, int i, int i2) {
        C1068b a2 = C1068b.m5208a(a, i, i2);
        B a3 = this.f3801a.mo5369a(a2);
        a2.mo4956a();
        return a3;
    }

    /* renamed from: a */
    public void mo4954a(A a, int i, int i2, B b) {
        this.f3801a.mo5373b(C1068b.m5208a(a, i, i2), b);
    }
}
