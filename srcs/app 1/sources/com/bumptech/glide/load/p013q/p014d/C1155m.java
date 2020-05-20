package com.bumptech.glide.load.p013q.p014d;

import android.os.Build.VERSION;
import com.bumptech.glide.load.C0870h;

/* renamed from: com.bumptech.glide.load.q.d.m */
public abstract class C1155m {

    /* renamed from: a */
    public static final C1155m f3926a = new C1160e();

    /* renamed from: b */
    public static final C1155m f3927b = new C1158c();

    /* renamed from: c */
    public static final C1155m f3928c = new C1159d();

    /* renamed from: d */
    public static final C1155m f3929d = new C1161f();

    /* renamed from: e */
    public static final C1155m f3930e;

    /* renamed from: f */
    public static final C0870h<C1155m> f3931f;

    /* renamed from: g */
    static final boolean f3932g = (VERSION.SDK_INT >= 19);

    /* renamed from: com.bumptech.glide.load.q.d.m$a */
    private static class C1156a extends C1155m {
        C1156a() {
        }

        /* renamed from: a */
        public C1162g mo5041a(int i, int i2, int i3, int i4) {
            return C1162g.QUALITY;
        }

        /* renamed from: b */
        public float mo5042b(int i, int i2, int i3, int i4) {
            int min = Math.min(i2 / i4, i / i3);
            if (min == 0) {
                return 1.0f;
            }
            return 1.0f / ((float) Integer.highestOneBit(min));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$b */
    private static class C1157b extends C1155m {
        C1157b() {
        }

        /* renamed from: a */
        public C1162g mo5041a(int i, int i2, int i3, int i4) {
            return C1162g.MEMORY;
        }

        /* renamed from: b */
        public float mo5042b(int i, int i2, int i3, int i4) {
            int ceil = (int) Math.ceil((double) Math.max(((float) i2) / ((float) i4), ((float) i) / ((float) i3)));
            int i5 = 1;
            int max = Math.max(1, Integer.highestOneBit(ceil));
            if (max >= ceil) {
                i5 = 0;
            }
            return 1.0f / ((float) (max << i5));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$c */
    private static class C1158c extends C1155m {
        C1158c() {
        }

        /* renamed from: a */
        public C1162g mo5041a(int i, int i2, int i3, int i4) {
            return mo5042b(i, i2, i3, i4) == 1.0f ? C1162g.QUALITY : C1155m.f3926a.mo5041a(i, i2, i3, i4);
        }

        /* renamed from: b */
        public float mo5042b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, C1155m.f3926a.mo5042b(i, i2, i3, i4));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$d */
    private static class C1159d extends C1155m {
        C1159d() {
        }

        /* renamed from: a */
        public C1162g mo5041a(int i, int i2, int i3, int i4) {
            return C1162g.QUALITY;
        }

        /* renamed from: b */
        public float mo5042b(int i, int i2, int i3, int i4) {
            return Math.max(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$e */
    private static class C1160e extends C1155m {
        C1160e() {
        }

        /* renamed from: a */
        public C1162g mo5041a(int i, int i2, int i3, int i4) {
            return C1155m.f3932g ? C1162g.QUALITY : C1162g.MEMORY;
        }

        /* renamed from: b */
        public float mo5042b(int i, int i2, int i3, int i4) {
            if (C1155m.f3932g) {
                return Math.min(((float) i3) / ((float) i), ((float) i4) / ((float) i2));
            }
            int max = Math.max(i2 / i4, i / i3);
            float f = 1.0f;
            if (max != 0) {
                f = 1.0f / ((float) Integer.highestOneBit(max));
            }
            return f;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$f */
    private static class C1161f extends C1155m {
        C1161f() {
        }

        /* renamed from: a */
        public C1162g mo5041a(int i, int i2, int i3, int i4) {
            return C1162g.QUALITY;
        }

        /* renamed from: b */
        public float mo5042b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* renamed from: com.bumptech.glide.load.q.d.m$g */
    public enum C1162g {
        MEMORY,
        QUALITY
    }

    static {
        new C1156a();
        new C1157b();
        C1155m mVar = f3928c;
        f3930e = mVar;
        f3931f = C0870h.m4573a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", mVar);
    }

    /* renamed from: a */
    public abstract C1162g mo5041a(int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract float mo5042b(int i, int i2, int i3, int i4);
}
