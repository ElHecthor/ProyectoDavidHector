package com.bumptech.glide.load.p007o.p008a0;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.o.a0.k */
public class C0930k implements C0921e {

    /* renamed from: j */
    private static final Config f3476j = Config.ARGB_8888;

    /* renamed from: a */
    private final C0933l f3477a;

    /* renamed from: b */
    private final Set<Config> f3478b;

    /* renamed from: c */
    private final C0931a f3479c;

    /* renamed from: d */
    private long f3480d;

    /* renamed from: e */
    private long f3481e;

    /* renamed from: f */
    private int f3482f;

    /* renamed from: g */
    private int f3483g;

    /* renamed from: h */
    private int f3484h;

    /* renamed from: i */
    private int f3485i;

    /* renamed from: com.bumptech.glide.load.o.a0.k$a */
    private interface C0931a {
        /* renamed from: a */
        void mo4730a(Bitmap bitmap);

        /* renamed from: b */
        void mo4731b(Bitmap bitmap);
    }

    /* renamed from: com.bumptech.glide.load.o.a0.k$b */
    private static final class C0932b implements C0931a {
        C0932b() {
        }

        /* renamed from: a */
        public void mo4730a(Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo4731b(Bitmap bitmap) {
        }
    }

    public C0930k(long j) {
        this(j, m4783g(), m4782f());
    }

    C0930k(long j, C0933l lVar, Set<Config> set) {
        this.f3480d = j;
        this.f3477a = lVar;
        this.f3478b = set;
        this.f3479c = new C0932b();
    }

    /* renamed from: a */
    private synchronized void m4773a(long j) {
        while (this.f3481e > j) {
            Bitmap a = this.f3477a.mo4694a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m4780d();
                }
                this.f3481e = 0;
                return;
            }
            this.f3479c.mo4730a(a);
            this.f3481e -= (long) this.f3477a.mo4697b(a);
            this.f3485i++;
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Evicting bitmap=");
                sb.append(this.f3477a.mo4699c(a));
                Log.d("LruBitmapPool", sb.toString());
            }
            m4777c();
            a.recycle();
        }
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m4774a(Config config) {
        if (VERSION.SDK_INT >= 26 && config == Config.HARDWARE) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create a mutable Bitmap with config: ");
            sb.append(config);
            sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    @TargetApi(19)
    /* renamed from: b */
    private static void m4775b(Bitmap bitmap) {
        if (VERSION.SDK_INT >= 19) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: c */
    private static Bitmap m4776c(int i, int i2, Config config) {
        if (config == null) {
            config = f3476j;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: c */
    private void m4777c() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m4780d();
        }
    }

    /* renamed from: c */
    private static void m4778c(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        m4775b(bitmap);
    }

    /* renamed from: d */
    private synchronized Bitmap m4779d(int i, int i2, Config config) {
        Bitmap a;
        m4774a(config);
        a = this.f3477a.mo4695a(i, i2, config != null ? config : f3476j);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Missing bitmap=");
                sb.append(this.f3477a.mo4698b(i, i2, config));
                Log.d("LruBitmapPool", sb.toString());
            }
            this.f3483g++;
        } else {
            this.f3482f++;
            this.f3481e -= (long) this.f3477a.mo4697b(a);
            this.f3479c.mo4730a(a);
            m4778c(a);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Get bitmap=");
            sb2.append(this.f3477a.mo4698b(i, i2, config));
            Log.v("LruBitmapPool", sb2.toString());
        }
        m4777c();
        return a;
    }

    /* renamed from: d */
    private void m4780d() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.f3482f);
        sb.append(", misses=");
        sb.append(this.f3483g);
        sb.append(", puts=");
        sb.append(this.f3484h);
        sb.append(", evictions=");
        sb.append(this.f3485i);
        sb.append(", currentSize=");
        sb.append(this.f3481e);
        sb.append(", maxSize=");
        sb.append(this.f3480d);
        sb.append("\nStrategy=");
        sb.append(this.f3477a);
        Log.v("LruBitmapPool", sb.toString());
    }

    /* renamed from: e */
    private void m4781e() {
        m4773a(this.f3480d);
    }

    @TargetApi(26)
    /* renamed from: f */
    private static Set<Config> m4782f() {
        HashSet hashSet = new HashSet(Arrays.asList(Config.values()));
        if (VERSION.SDK_INT >= 19) {
            hashSet.add(null);
        }
        if (VERSION.SDK_INT >= 26) {
            hashSet.remove(Config.HARDWARE);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: g */
    private static C0933l m4783g() {
        return VERSION.SDK_INT >= 19 ? new C0935n() : new C0917c();
    }

    /* renamed from: a */
    public Bitmap mo4710a(int i, int i2, Config config) {
        Bitmap d = m4779d(i, i2, config);
        if (d == null) {
            return m4776c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: a */
    public void mo4711a() {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "clearMemory");
        }
        m4773a(0);
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public void mo4712a(int i) {
        String str = "LruBitmapPool";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d(str, sb.toString());
        }
        if (i >= 40 || (VERSION.SDK_INT >= 23 && i >= 20)) {
            mo4711a();
        } else if (i >= 20 || i == 15) {
            m4773a(mo4729b() / 2);
        }
    }

    /* renamed from: a */
    public synchronized void mo4713a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.f3477a.mo4697b(bitmap)) <= this.f3480d) {
                        if (this.f3478b.contains(bitmap.getConfig())) {
                            int b = this.f3477a.mo4697b(bitmap);
                            this.f3477a.mo4696a(bitmap);
                            this.f3479c.mo4731b(bitmap);
                            this.f3484h++;
                            this.f3481e += (long) b;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Put bitmap in pool=");
                                sb.append(this.f3477a.mo4699c(bitmap));
                                Log.v("LruBitmapPool", sb.toString());
                            }
                            m4777c();
                            m4781e();
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Reject bitmap from pool, bitmap: ");
                        sb2.append(this.f3477a.mo4699c(bitmap));
                        sb2.append(", is mutable: ");
                        sb2.append(bitmap.isMutable());
                        sb2.append(", is allowed config: ");
                        sb2.append(this.f3478b.contains(bitmap.getConfig()));
                        Log.v("LruBitmapPool", sb2.toString());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } finally {
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    /* renamed from: b */
    public long mo4729b() {
        return this.f3480d;
    }

    /* renamed from: b */
    public Bitmap mo4714b(int i, int i2, Config config) {
        Bitmap d = m4779d(i, i2, config);
        return d == null ? m4776c(i, i2, config) : d;
    }
}
