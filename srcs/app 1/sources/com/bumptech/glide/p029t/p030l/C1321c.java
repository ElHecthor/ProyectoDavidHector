package com.bumptech.glide.p029t.p030l;

/* renamed from: com.bumptech.glide.t.l.c */
public abstract class C1321c {

    /* renamed from: com.bumptech.glide.t.l.c$b */
    private static class C1323b extends C1321c {

        /* renamed from: a */
        private volatile boolean f4317a;

        C1323b() {
            super();
        }

        /* renamed from: a */
        public void mo5389a() {
            if (this.f4317a) {
                throw new IllegalStateException("Already released");
            }
        }

        /* renamed from: a */
        public void mo5390a(boolean z) {
            this.f4317a = z;
        }
    }

    private C1321c() {
    }

    /* renamed from: b */
    public static C1321c m6194b() {
        return new C1323b();
    }

    /* renamed from: a */
    public abstract void mo5389a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo5390a(boolean z);
}
