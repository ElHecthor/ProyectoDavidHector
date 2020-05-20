package com.bumptech.glide.load.p007o.p008a0;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.p029t.C1310k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.o.a0.n */
public class C0935n implements C0933l {

    /* renamed from: d */
    private static final Config[] f3486d;

    /* renamed from: e */
    private static final Config[] f3487e;

    /* renamed from: f */
    private static final Config[] f3488f = {Config.RGB_565};

    /* renamed from: g */
    private static final Config[] f3489g = {Config.ARGB_4444};

    /* renamed from: h */
    private static final Config[] f3490h = {Config.ALPHA_8};

    /* renamed from: a */
    private final C0938c f3491a = new C0938c();

    /* renamed from: b */
    private final C0924h<C0937b, Bitmap> f3492b = new C0924h<>();

    /* renamed from: c */
    private final Map<Config, NavigableMap<Integer, Integer>> f3493c = new HashMap();

    /* renamed from: com.bumptech.glide.load.o.a0.n$a */
    static /* synthetic */ class C0936a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3494a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3494a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3494a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3494a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f3494a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.p007o.p008a0.C0935n.C0936a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.n$b */
    static final class C0937b implements C0934m {

        /* renamed from: a */
        private final C0938c f3495a;

        /* renamed from: b */
        int f3496b;

        /* renamed from: c */
        private Config f3497c;

        public C0937b(C0938c cVar) {
            this.f3495a = cVar;
        }

        /* renamed from: a */
        public void mo4701a() {
            this.f3495a.mo4708a(this);
        }

        /* renamed from: a */
        public void mo4733a(int i, Config config) {
            this.f3496b = i;
            this.f3497c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C0937b)) {
                return false;
            }
            C0937b bVar = (C0937b) obj;
            return this.f3496b == bVar.f3496b && C1310k.m6171b((Object) this.f3497c, (Object) bVar.f3497c);
        }

        public int hashCode() {
            int i = this.f3496b * 31;
            Config config = this.f3497c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C0935n.m4804b(this.f3496b, this.f3497c);
        }
    }

    /* renamed from: com.bumptech.glide.load.o.a0.n$c */
    static class C0938c extends C0920d<C0937b> {
        C0938c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C0937b m4815a() {
            return new C0937b(this);
        }

        /* renamed from: a */
        public C0937b mo4737a(int i, Config config) {
            C0937b bVar = (C0937b) mo4709b();
            bVar.mo4733a(i, config);
            return bVar;
        }
    }

    static {
        Config[] configArr = {Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        f3486d = configArr;
        f3487e = configArr;
    }

    /* renamed from: a */
    private C0937b m4801a(int i, Config config) {
        C0937b a = this.f3491a.mo4737a(i, config);
        Config[] a2 = m4803a(config);
        int length = a2.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = a2[i2];
            Integer num = (Integer) m4805b(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config)) {
                        return a;
                    }
                }
                this.f3491a.mo4708a(a);
                return this.f3491a.mo4737a(num.intValue(), config2);
            }
        }
        return a;
    }

    /* renamed from: a */
    private void m4802a(Integer num, Bitmap bitmap) {
        NavigableMap b = m4805b(bitmap.getConfig());
        Integer num2 = (Integer) b.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(mo4699c(bitmap));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            b.remove(num);
        } else {
            b.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    private static Config[] m4803a(Config config) {
        if (VERSION.SDK_INT >= 26 && Config.RGBA_F16.equals(config)) {
            return f3487e;
        }
        int i = C0936a.f3494a[config.ordinal()];
        if (i == 1) {
            return f3486d;
        }
        if (i == 2) {
            return f3488f;
        }
        if (i == 3) {
            return f3489g;
        }
        if (i == 4) {
            return f3490h;
        }
        return new Config[]{config};
    }

    /* renamed from: b */
    static String m4804b(int i, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m4805b(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f3493c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f3493c.put(config, treeMap);
        return treeMap;
    }

    /* renamed from: a */
    public Bitmap mo4694a() {
        Bitmap bitmap = (Bitmap) this.f3492b.mo4716a();
        if (bitmap != null) {
            m4802a(Integer.valueOf(C1310k.m6159a(bitmap)), bitmap);
        }
        return bitmap;
    }

    /* renamed from: a */
    public Bitmap mo4695a(int i, int i2, Config config) {
        C0937b a = m4801a(C1310k.m6157a(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f3492b.mo4717a(a);
        if (bitmap != null) {
            m4802a(Integer.valueOf(a.f3496b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    /* renamed from: a */
    public void mo4696a(Bitmap bitmap) {
        C0937b a = this.f3491a.mo4737a(C1310k.m6159a(bitmap), bitmap.getConfig());
        this.f3492b.mo4718a(a, bitmap);
        NavigableMap b = m4805b(bitmap.getConfig());
        Integer num = (Integer) b.get(Integer.valueOf(a.f3496b));
        Integer valueOf = Integer.valueOf(a.f3496b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        b.put(valueOf, Integer.valueOf(i));
    }

    /* renamed from: b */
    public int mo4697b(Bitmap bitmap) {
        return C1310k.m6159a(bitmap);
    }

    /* renamed from: b */
    public String mo4698b(int i, int i2, Config config) {
        return m4804b(C1310k.m6157a(i, i2, config), config);
    }

    /* renamed from: c */
    public String mo4699c(Bitmap bitmap) {
        return m4804b(C1310k.m6159a(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f3492b);
        sb.append(", sortedSizes=(");
        for (Entry entry : this.f3493c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f3493c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
