package com.bumptech.glide.load.p007o.p008a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.p029t.C1310k;

/* renamed from: com.bumptech.glide.load.o.a0.c */
class C0917c implements C0933l {

    /* renamed from: a */
    private final C0919b f3454a = new C0919b();

    /* renamed from: b */
    private final C0924h<C0918a, Bitmap> f3455b = new C0924h<>();

    /* renamed from: com.bumptech.glide.load.o.a0.c$a */
    static class C0918a implements C0934m {

        /* renamed from: a */
        private final C0919b f3456a;

        /* renamed from: b */
        private int f3457b;

        /* renamed from: c */
        private int f3458c;

        /* renamed from: d */
        private Config f3459d;

        public C0918a(C0919b bVar) {
            this.f3456a = bVar;
        }

        /* renamed from: a */
        public void mo4701a() {
            this.f3456a.mo4708a(this);
        }

        /* renamed from: a */
        public void mo4702a(int i, int i2, Config config) {
            this.f3457b = i;
            this.f3458c = i2;
            this.f3459d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0918a)) {
                return false;
            }
            C0918a aVar = (C0918a) obj;
            return this.f3457b == aVar.f3457b && this.f3458c == aVar.f3458c && this.f3459d == aVar.f3459d;
        }

        public int hashCode() {
            int i = ((this.f3457b * 31) + this.f3458c) * 31;
            Config config = this.f3459d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C0917c.m4709c(this.f3457b, this.f3458c, this.f3459d);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.c$b */
    static class C0919b extends C0920d<C0918a> {
        C0919b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0918a m4721a() {
            return new C0918a(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0918a mo4707a(int i, int i2, Config config) {
            C0918a aVar = (C0918a) mo4709b();
            aVar.mo4702a(i, i2, config);
            return aVar;
        }
    }

    C0917c() {
    }

    /* renamed from: c */
    static String m4709c(int i, int i2, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("], ");
        sb.append(config);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m4710d(Bitmap bitmap) {
        return m4709c(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    /* renamed from: a */
    public Bitmap mo4694a() {
        return (Bitmap) this.f3455b.mo4716a();
    }

    /* renamed from: a */
    public Bitmap mo4695a(int i, int i2, Config config) {
        return (Bitmap) this.f3455b.mo4717a(this.f3454a.mo4707a(i, i2, config));
    }

    /* renamed from: a */
    public void mo4696a(Bitmap bitmap) {
        this.f3455b.mo4718a(this.f3454a.mo4707a(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    /* renamed from: b */
    public int mo4697b(Bitmap bitmap) {
        return C1310k.m6159a(bitmap);
    }

    /* renamed from: b */
    public String mo4698b(int i, int i2, Config config) {
        return m4709c(i, i2, config);
    }

    /* renamed from: c */
    public String mo4699c(Bitmap bitmap) {
        return m4710d(bitmap);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AttributeStrategy:\n  ");
        sb.append(this.f3455b);
        return sb.toString();
    }
}
