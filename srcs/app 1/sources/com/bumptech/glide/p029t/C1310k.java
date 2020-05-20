package com.bumptech.glide.p029t;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import android.os.Looper;
import com.bumptech.glide.load.p011p.C1065l;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Queue;

/* renamed from: com.bumptech.glide.t.k */
public final class C1310k {

    /* renamed from: a */
    private static final char[] f4310a = "0123456789abcdef".toCharArray();

    /* renamed from: b */
    private static final char[] f4311b = new char[64];

    /* renamed from: com.bumptech.glide.t.k$a */
    static /* synthetic */ class C1311a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4312a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4312a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4312a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4312a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4312a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4312a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p029t.C1310k.C1311a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m6154a(float f) {
        return m6155a(f, 17);
    }

    /* renamed from: a */
    public static int m6155a(float f, int i) {
        return m6156a(Float.floatToIntBits(f), i);
    }

    /* renamed from: a */
    public static int m6156a(int i, int i2) {
        return (i2 * 31) + i;
    }

    /* renamed from: a */
    public static int m6157a(int i, int i2, Config config) {
        return i * i2 * m6158a(config);
    }

    /* renamed from: a */
    private static int m6158a(Config config) {
        if (config == null) {
            config = Config.ARGB_8888;
        }
        int i = C1311a.f4312a[config.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 4 : 8;
    }

    @TargetApi(19)
    /* renamed from: a */
    public static int m6159a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            if (VERSION.SDK_INT >= 19) {
                try {
                    return bitmap.getAllocationByteCount();
                } catch (NullPointerException unused) {
                }
            }
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot obtain size for recycled Bitmap: ");
        sb.append(bitmap);
        sb.append("[");
        sb.append(bitmap.getWidth());
        sb.append("x");
        sb.append(bitmap.getHeight());
        sb.append("] ");
        sb.append(bitmap.getConfig());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public static int m6160a(Object obj, int i) {
        return m6156a(obj == null ? 0 : obj.hashCode(), i);
    }

    /* renamed from: a */
    public static int m6161a(boolean z, int i) {
        return m6156a(z ? 1 : 0, i);
    }

    /* renamed from: a */
    public static String m6162a(byte[] bArr) {
        String a;
        synchronized (f4311b) {
            a = m6163a(bArr, f4311b);
        }
        return a;
    }

    /* renamed from: a */
    private static String m6163a(byte[] bArr, char[] cArr) {
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f4310a;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static <T> List<T> m6164a(Collection<T> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object next : collection) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> Queue<T> m6165a(int i) {
        return new ArrayDeque(i);
    }

    /* renamed from: a */
    public static void m6166a() {
        if (!m6172c()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    /* renamed from: a */
    public static boolean m6167a(Object obj, Object obj2) {
        if (obj != null) {
            return obj instanceof C1065l ? ((C1065l) obj).mo4952a(obj2) : obj.equals(obj2);
        }
        return obj2 == null;
    }

    /* renamed from: b */
    public static int m6168b(int i) {
        return m6156a(i, 17);
    }

    /* renamed from: b */
    public static boolean m6169b() {
        return !m6172c();
    }

    /* renamed from: b */
    public static boolean m6170b(int i, int i2) {
        return m6173c(i) && m6173c(i2);
    }

    /* renamed from: b */
    public static boolean m6171b(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: c */
    public static boolean m6172c() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: c */
    private static boolean m6173c(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }
}
