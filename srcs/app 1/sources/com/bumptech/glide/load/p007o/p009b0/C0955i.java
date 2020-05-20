package com.bumptech.glide.load.p007o.p009b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* renamed from: com.bumptech.glide.load.o.b0.i */
public final class C0955i {

    /* renamed from: a */
    private final int f3513a;

    /* renamed from: b */
    private final int f3514b;

    /* renamed from: c */
    private final Context f3515c;

    /* renamed from: d */
    private final int f3516d;

    /* renamed from: com.bumptech.glide.load.o.b0.i$a */
    public static final class C0956a {

        /* renamed from: i */
        static final int f3517i = (VERSION.SDK_INT < 26 ? 4 : 1);

        /* renamed from: a */
        final Context f3518a;

        /* renamed from: b */
        ActivityManager f3519b;

        /* renamed from: c */
        C0958c f3520c;

        /* renamed from: d */
        float f3521d = 2.0f;

        /* renamed from: e */
        float f3522e = ((float) f3517i);

        /* renamed from: f */
        float f3523f = 0.4f;

        /* renamed from: g */
        float f3524g = 0.33f;

        /* renamed from: h */
        int f3525h = 4194304;

        public C0956a(Context context) {
            this.f3518a = context;
            this.f3519b = (ActivityManager) context.getSystemService("activity");
            this.f3520c = new C0957b(context.getResources().getDisplayMetrics());
            if (VERSION.SDK_INT >= 26 && C0955i.m4850a(this.f3519b)) {
                this.f3522e = 0.0f;
            }
        }

        /* renamed from: a */
        public C0955i mo4760a() {
            return new C0955i(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.i$b */
    private static final class C0957b implements C0958c {

        /* renamed from: a */
        private final DisplayMetrics f3526a;

        C0957b(DisplayMetrics displayMetrics) {
            this.f3526a = displayMetrics;
        }

        /* renamed from: a */
        public int mo4761a() {
            return this.f3526a.heightPixels;
        }

        /* renamed from: b */
        public int mo4762b() {
            return this.f3526a.widthPixels;
        }
    }

    /* renamed from: com.bumptech.glide.load.o.b0.i$c */
    interface C0958c {
        /* renamed from: a */
        int mo4761a();

        /* renamed from: b */
        int mo4762b();
    }

    C0955i(C0956a aVar) {
        this.f3515c = aVar.f3518a;
        this.f3516d = m4850a(aVar.f3519b) ? aVar.f3525h / 2 : aVar.f3525h;
        int a = m4848a(aVar.f3519b, aVar.f3523f, aVar.f3524g);
        float b = (float) (aVar.f3520c.mo4762b() * aVar.f3520c.mo4761a() * 4);
        int round = Math.round(aVar.f3522e * b);
        int round2 = Math.round(b * aVar.f3521d);
        int i = a - this.f3516d;
        int i2 = round2 + round;
        if (i2 <= i) {
            this.f3514b = round2;
            this.f3513a = round;
        } else {
            float f = (float) i;
            float f2 = aVar.f3522e;
            float f3 = aVar.f3521d;
            float f4 = f / (f2 + f3);
            this.f3514b = Math.round(f3 * f4);
            this.f3513a = Math.round(f4 * aVar.f3522e);
        }
        String str = "MemorySizeCalculator";
        if (Log.isLoggable(str, 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(m4849a(this.f3514b));
            sb.append(", pool size: ");
            sb.append(m4849a(this.f3513a));
            sb.append(", byte array size: ");
            sb.append(m4849a(this.f3516d));
            sb.append(", memory class limited? ");
            sb.append(i2 > a);
            sb.append(", max size: ");
            sb.append(m4849a(a));
            sb.append(", memoryClass: ");
            sb.append(aVar.f3519b.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(m4850a(aVar.f3519b));
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: a */
    private static int m4848a(ActivityManager activityManager, float f, float f2) {
        float memoryClass = (float) (activityManager.getMemoryClass() * 1024 * 1024);
        if (m4850a(activityManager)) {
            f = f2;
        }
        return Math.round(memoryClass * f);
    }

    /* renamed from: a */
    private String m4849a(int i) {
        return Formatter.formatFileSize(this.f3515c, (long) i);
    }

    @TargetApi(19)
    /* renamed from: a */
    static boolean m4850a(ActivityManager activityManager) {
        if (VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    /* renamed from: a */
    public int mo4757a() {
        return this.f3516d;
    }

    /* renamed from: b */
    public int mo4758b() {
        return this.f3513a;
    }

    /* renamed from: c */
    public int mo4759c() {
        return this.f3514b;
    }
}
