package com.bumptech.glide.load;

import com.bumptech.glide.p029t.C1309j;
import java.security.MessageDigest;

/* renamed from: com.bumptech.glide.load.h */
public final class C0870h<T> {

    /* renamed from: e */
    private static final C0872b<Object> f3391e = new C0871a();

    /* renamed from: a */
    private final T f3392a;

    /* renamed from: b */
    private final C0872b<T> f3393b;

    /* renamed from: c */
    private final String f3394c;

    /* renamed from: d */
    private volatile byte[] f3395d;

    /* renamed from: com.bumptech.glide.load.h$a */
    class C0871a implements C0872b<Object> {
        C0871a() {
        }

        /* renamed from: a */
        public void mo4626a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* renamed from: com.bumptech.glide.load.h$b */
    public interface C0872b<T> {
        /* renamed from: a */
        void mo4626a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private C0870h(String str, T t, C0872b<T> bVar) {
        C1309j.m6151a(str);
        this.f3394c = str;
        this.f3392a = t;
        C1309j.m6149a(bVar);
        this.f3393b = bVar;
    }

    /* renamed from: a */
    public static <T> C0870h<T> m4572a(String str) {
        return new C0870h<>(str, null, m4575b());
    }

    /* renamed from: a */
    public static <T> C0870h<T> m4573a(String str, T t) {
        return new C0870h<>(str, t, m4575b());
    }

    /* renamed from: a */
    public static <T> C0870h<T> m4574a(String str, T t, C0872b<T> bVar) {
        return new C0870h<>(str, t, bVar);
    }

    /* renamed from: b */
    private static <T> C0872b<T> m4575b() {
        return f3391e;
    }

    /* renamed from: c */
    private byte[] m4576c() {
        if (this.f3395d == null) {
            this.f3395d = this.f3394c.getBytes(C0869g.f3390a);
        }
        return this.f3395d;
    }

    /* renamed from: a */
    public T mo4621a() {
        return this.f3392a;
    }

    /* renamed from: a */
    public void mo4622a(T t, MessageDigest messageDigest) {
        this.f3393b.mo4626a(m4576c(), t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0870h)) {
            return false;
        }
        return this.f3394c.equals(((C0870h) obj).f3394c);
    }

    public int hashCode() {
        return this.f3394c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Option{key='");
        sb.append(this.f3394c);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
