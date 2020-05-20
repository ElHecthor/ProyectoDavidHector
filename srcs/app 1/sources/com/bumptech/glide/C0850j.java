package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.load.p007o.C0989j;
import com.bumptech.glide.p025r.C1267a;
import com.bumptech.glide.p025r.C1269c;
import com.bumptech.glide.p025r.C1270d;
import com.bumptech.glide.p025r.C1272e;
import com.bumptech.glide.p025r.C1273f;
import com.bumptech.glide.p025r.C1275h;
import com.bumptech.glide.p025r.C1277i;
import com.bumptech.glide.p025r.p026j.C1285h;
import com.bumptech.glide.p025r.p026j.C1286i;
import com.bumptech.glide.p029t.C1302e;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.j */
public class C0850j<TranscodeType> extends C1267a<C0850j<TranscodeType>> implements Cloneable {

    /* renamed from: F */
    private final Context f3335F;

    /* renamed from: G */
    private final C0852k f3336G;

    /* renamed from: H */
    private final Class<TranscodeType> f3337H;

    /* renamed from: I */
    private final C0836e f3338I;

    /* renamed from: J */
    private C0855l<?, ? super TranscodeType> f3339J;

    /* renamed from: K */
    private Object f3340K;

    /* renamed from: L */
    private List<C1272e<TranscodeType>> f3341L;

    /* renamed from: M */
    private C0850j<TranscodeType> f3342M;

    /* renamed from: N */
    private C0850j<TranscodeType> f3343N;

    /* renamed from: O */
    private Float f3344O;

    /* renamed from: P */
    private boolean f3345P = true;

    /* renamed from: Q */
    private boolean f3346Q;

    /* renamed from: R */
    private boolean f3347R;

    /* renamed from: com.bumptech.glide.j$a */
    static /* synthetic */ class C0851a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3348a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3349b;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0083 */
        static {
            /*
                com.bumptech.glide.g[] r0 = com.bumptech.glide.C0838g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3349b = r0
                r1 = 1
                com.bumptech.glide.g r2 = com.bumptech.glide.C0838g.LOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3349b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bumptech.glide.g r3 = com.bumptech.glide.C0838g.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3349b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bumptech.glide.g r4 = com.bumptech.glide.C0838g.HIGH     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f3349b     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bumptech.glide.g r5 = com.bumptech.glide.C0838g.IMMEDIATE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                android.widget.ImageView$ScaleType[] r4 = android.widget.ImageView.ScaleType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f3348a = r4
                android.widget.ImageView$ScaleType r5 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f3348a     // Catch:{ NoSuchFieldError -> 0x004e }
                android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f3348a     // Catch:{ NoSuchFieldError -> 0x0058 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f3348a     // Catch:{ NoSuchFieldError -> 0x0062 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f3348a     // Catch:{ NoSuchFieldError -> 0x006d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f3348a     // Catch:{ NoSuchFieldError -> 0x0078 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f3348a     // Catch:{ NoSuchFieldError -> 0x0083 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                int[] r0 = f3348a     // Catch:{ NoSuchFieldError -> 0x008f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C0850j.C0851a.<clinit>():void");
        }
    }

    static {
        C1273f fVar = (C1273f) ((C1273f) ((C1273f) new C1273f().mo5264a(C0989j.f3639b)).mo5259a(C0838g.LOW)).mo5269a(true);
    }

    @SuppressLint({"CheckResult"})
    protected C0850j(C0832c cVar, C0852k kVar, Class<TranscodeType> cls, Context context) {
        this.f3336G = kVar;
        this.f3337H = cls;
        this.f3335F = context;
        this.f3339J = kVar.mo4591b(cls);
        this.f3338I = cVar.mo4524f();
        m4517a(kVar.mo4597g());
        m4528a((C1267a<?>) kVar.mo4598h());
    }

    /* renamed from: a */
    private C1269c m4514a(C1285h<TranscodeType> hVar, C1272e<TranscodeType> eVar, C1267a<?> aVar, Executor executor) {
        return m4516a(new Object(), hVar, eVar, (C1270d) null, this.f3339J, aVar.mo5287t(), aVar.mo5284q(), aVar.mo5283p(), aVar, executor);
    }

    /* renamed from: a */
    private C1269c m4515a(Object obj, C1285h<TranscodeType> hVar, C1272e<TranscodeType> eVar, C1267a<?> aVar, C1270d dVar, C0855l<?, ? super TranscodeType> lVar, C0838g gVar, int i, int i2, Executor executor) {
        Context context = this.f3335F;
        C0836e eVar2 = this.f3338I;
        return C1275h.m6008a(context, eVar2, obj, this.f3340K, this.f3337H, aVar, i, i2, gVar, hVar, eVar, this.f3341L, dVar, eVar2.mo4539d(), lVar.mo4609b(), executor);
    }

    /* JADX WARNING: type inference failed for: r15v0 */
    /* JADX WARNING: type inference failed for: r4v0, types: [com.bumptech.glide.r.d] */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r0v4, types: [com.bumptech.glide.r.b] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bumptech.glide.p025r.C1269c m4516a(java.lang.Object r24, com.bumptech.glide.p025r.p026j.C1285h<TranscodeType> r25, com.bumptech.glide.p025r.C1272e<TranscodeType> r26, com.bumptech.glide.p025r.C1270d r27, com.bumptech.glide.C0855l<?, ? super TranscodeType> r28, com.bumptech.glide.C0838g r29, int r30, int r31, com.bumptech.glide.p025r.C1267a<?> r32, java.util.concurrent.Executor r33) {
        /*
            r23 = this;
            r11 = r23
            com.bumptech.glide.j<TranscodeType> r0 = r11.f3343N
            if (r0 == 0) goto L_0x0012
            com.bumptech.glide.r.b r0 = new com.bumptech.glide.r.b
            r13 = r24
            r1 = r27
            r0.<init>(r13, r1)
            r4 = r0
            r15 = r4
            goto L_0x0019
        L_0x0012:
            r13 = r24
            r1 = r27
            r0 = 0
            r15 = r0
            r4 = r1
        L_0x0019:
            r0 = r23
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            com.bumptech.glide.r.c r0 = r0.m4521b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r15 != 0) goto L_0x0034
            return r0
        L_0x0034:
            com.bumptech.glide.j<TranscodeType> r1 = r11.f3343N
            int r1 = r1.mo5284q()
            com.bumptech.glide.j<TranscodeType> r2 = r11.f3343N
            int r2 = r2.mo5283p()
            boolean r3 = com.bumptech.glide.p029t.C1310k.m6170b(r30, r31)
            if (r3 == 0) goto L_0x0056
            com.bumptech.glide.j<TranscodeType> r3 = r11.f3343N
            boolean r3 = r3.mo5251H()
            if (r3 != 0) goto L_0x0056
            int r1 = r32.mo5284q()
            int r2 = r32.mo5283p()
        L_0x0056:
            r19 = r1
            r20 = r2
            com.bumptech.glide.j<TranscodeType> r12 = r11.f3343N
            com.bumptech.glide.l<?, ? super TranscodeType> r1 = r12.f3339J
            com.bumptech.glide.g r18 = r12.mo5287t()
            com.bumptech.glide.j<TranscodeType> r2 = r11.f3343N
            r13 = r24
            r14 = r25
            r3 = r15
            r15 = r26
            r16 = r3
            r17 = r1
            r21 = r2
            r22 = r33
            com.bumptech.glide.r.c r1 = r12.m4516a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r3.mo5295a(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C0850j.m4516a(java.lang.Object, com.bumptech.glide.r.j.h, com.bumptech.glide.r.e, com.bumptech.glide.r.d, com.bumptech.glide.l, com.bumptech.glide.g, int, int, com.bumptech.glide.r.a, java.util.concurrent.Executor):com.bumptech.glide.r.c");
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    private void m4517a(List<C1272e<Object>> list) {
        for (C1272e a : list) {
            mo4578a(a);
        }
    }

    /* renamed from: a */
    private boolean m4518a(C1267a<?> aVar, C1269c cVar) {
        return !aVar.mo5245B() && cVar.mo5306f();
    }

    /* renamed from: b */
    private C0838g m4519b(C0838g gVar) {
        int i = C0851a.f3349b[gVar.ordinal()];
        if (i == 1) {
            return C0838g.NORMAL;
        }
        if (i == 2) {
            return C0838g.HIGH;
        }
        if (i == 3 || i == 4) {
            return C0838g.IMMEDIATE;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("unknown priority: ");
        sb.append(mo5287t());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    private C0850j<TranscodeType> m4520b(Object obj) {
        this.f3340K = obj;
        this.f3346Q = true;
        return this;
    }

    /* renamed from: b */
    private C1269c m4521b(Object obj, C1285h<TranscodeType> hVar, C1272e<TranscodeType> eVar, C1270d dVar, C0855l<?, ? super TranscodeType> lVar, C0838g gVar, int i, int i2, C1267a<?> aVar, Executor executor) {
        Object obj2 = obj;
        C1270d dVar2 = dVar;
        C0838g gVar2 = gVar;
        C0850j<TranscodeType> jVar = this.f3342M;
        if (jVar != null) {
            if (!this.f3347R) {
                C0855l<?, ? super TranscodeType> lVar2 = jVar.f3345P ? lVar : jVar.f3339J;
                C0838g t = this.f3342M.mo5246C() ? this.f3342M.mo5287t() : m4519b(gVar2);
                int q = this.f3342M.mo5284q();
                int p = this.f3342M.mo5283p();
                if (C1310k.m6170b(i, i2) && !this.f3342M.mo5251H()) {
                    q = aVar.mo5284q();
                    p = aVar.mo5283p();
                }
                int i3 = q;
                int i4 = p;
                C1277i iVar = new C1277i(obj2, dVar2);
                Object obj3 = obj;
                C1285h<TranscodeType> hVar2 = hVar;
                C1272e<TranscodeType> eVar2 = eVar;
                C1277i iVar2 = iVar;
                C1269c a = m4515a(obj3, hVar2, eVar2, aVar, (C1270d) iVar, lVar, gVar, i, i2, executor);
                this.f3347R = true;
                C0850j<TranscodeType> jVar2 = this.f3342M;
                C1269c cVar = a;
                C1269c a2 = jVar2.m4516a(obj3, hVar2, eVar2, (C1270d) iVar2, lVar2, t, i3, i4, (C1267a<?>) jVar2, executor);
                this.f3347R = false;
                iVar2.mo5316a(cVar, a2);
                return iVar2;
            }
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        } else if (this.f3344O == null) {
            return m4515a(obj, hVar, eVar, aVar, dVar, lVar, gVar, i, i2, executor);
        } else {
            C1277i iVar3 = new C1277i(obj2, dVar2);
            C1285h<TranscodeType> hVar3 = hVar;
            C1272e<TranscodeType> eVar3 = eVar;
            C1277i iVar4 = iVar3;
            C0855l<?, ? super TranscodeType> lVar3 = lVar;
            int i5 = i;
            int i6 = i2;
            Executor executor2 = executor;
            iVar3.mo5316a(m4515a(obj, hVar3, eVar3, aVar, (C1270d) iVar4, lVar3, gVar, i5, i6, executor2), m4515a(obj, hVar3, eVar3, aVar.clone().mo5256a(this.f3344O.floatValue()), (C1270d) iVar4, lVar3, m4519b(gVar2), i5, i6, executor2));
            return iVar3;
        }
    }

    /* renamed from: b */
    private <Y extends C1285h<TranscodeType>> Y m4522b(Y y, C1272e<TranscodeType> eVar, C1267a<?> aVar, Executor executor) {
        C1309j.m6149a(y);
        if (this.f3346Q) {
            C1269c a = m4514a(y, eVar, aVar, executor);
            C1269c c = y.mo5324c();
            if (!a.mo5298b(c) || m4518a(aVar, c)) {
                this.f3336G.mo4589a((C1285h<?>) y);
                y.mo5321a(a);
                this.f3336G.mo4590a(y, a);
                return y;
            }
            C1309j.m6149a(c);
            if (!c.isRunning()) {
                c.mo5304e();
            }
            return y;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    /* renamed from: a */
    public C0850j<TranscodeType> mo4576a(C0850j<TranscodeType> jVar) {
        this.f3342M = jVar;
        return this;
    }

    /* renamed from: a */
    public C0850j<TranscodeType> m4528a(C1267a<?> aVar) {
        C1309j.m6149a(aVar);
        return (C0850j) super.mo4577a(aVar);
    }

    /* renamed from: a */
    public C0850j<TranscodeType> mo4578a(C1272e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.f3341L == null) {
                this.f3341L = new ArrayList();
            }
            this.f3341L.add(eVar);
        }
        return this;
    }

    /* renamed from: a */
    public C0850j<TranscodeType> mo4579a(Object obj) {
        m4520b(obj);
        return this;
    }

    /* renamed from: a */
    public C0850j<TranscodeType> mo4580a(String str) {
        m4520b((Object) str);
        return this;
    }

    /* renamed from: a */
    public <Y extends C1285h<TranscodeType>> Y mo4581a(Y y) {
        mo4582a(y, null, C1302e.m6134b());
        return y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y extends C1285h<TranscodeType>> Y mo4582a(Y y, C1272e<TranscodeType> eVar, Executor executor) {
        m4522b(y, eVar, this, executor);
        return y;
    }

    /* renamed from: a */
    public C1286i<ImageView, TranscodeType> mo4583a(ImageView imageView) {
        C1267a aVar;
        C1310k.m6166a();
        C1309j.m6149a(imageView);
        if (!mo5250G() && mo5248E() && imageView.getScaleType() != null) {
            switch (C0851a.f3348a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVar = clone().mo5253J();
                    break;
                case 2:
                case 6:
                    aVar = clone().mo5254K();
                    break;
                case 3:
                case 4:
                case 5:
                    aVar = clone().mo5255L();
                    break;
            }
        }
        aVar = this;
        C1286i<ImageView, TranscodeType> a = this.f3338I.mo4536a(imageView, this.f3337H);
        m4522b(a, null, aVar, C1302e.m6134b());
        return a;
    }

    public C0850j<TranscodeType> clone() {
        C0850j<TranscodeType> jVar = (C0850j) super.clone();
        jVar.f3339J = jVar.f3339J.clone();
        return jVar;
    }
}
