package com.bumptech.glide.p025r;

import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0870h;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.C0989j;
import com.bumptech.glide.load.p013q.p014d.C1146i;
import com.bumptech.glide.load.p013q.p014d.C1147j;
import com.bumptech.glide.load.p013q.p014d.C1148k;
import com.bumptech.glide.load.p013q.p014d.C1155m;
import com.bumptech.glide.load.p013q.p014d.C1168p;
import com.bumptech.glide.load.p013q.p014d.C1170r;
import com.bumptech.glide.load.p013q.p018h.C1196c;
import com.bumptech.glide.load.p013q.p018h.C1200f;
import com.bumptech.glide.p025r.C1267a;
import com.bumptech.glide.p028s.C1294a;
import com.bumptech.glide.p029t.C1299b;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import java.util.Map;

/* renamed from: com.bumptech.glide.r.a */
public abstract class C1267a<T extends C1267a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f4183A;

    /* renamed from: B */
    private boolean f4184B;

    /* renamed from: C */
    private boolean f4185C;

    /* renamed from: D */
    private boolean f4186D = true;

    /* renamed from: E */
    private boolean f4187E;

    /* renamed from: f */
    private int f4188f;

    /* renamed from: g */
    private float f4189g = 1.0f;

    /* renamed from: h */
    private C0989j f4190h = C0989j.f3640c;

    /* renamed from: i */
    private C0838g f4191i = C0838g.NORMAL;

    /* renamed from: j */
    private Drawable f4192j;

    /* renamed from: k */
    private int f4193k;

    /* renamed from: l */
    private Drawable f4194l;

    /* renamed from: m */
    private int f4195m;

    /* renamed from: n */
    private boolean f4196n = true;

    /* renamed from: o */
    private int f4197o = -1;

    /* renamed from: p */
    private int f4198p = -1;

    /* renamed from: q */
    private C0869g f4199q = C1294a.m6115a();

    /* renamed from: r */
    private boolean f4200r;

    /* renamed from: s */
    private boolean f4201s = true;

    /* renamed from: t */
    private Drawable f4202t;

    /* renamed from: u */
    private int f4203u;

    /* renamed from: v */
    private C0873i f4204v = new C0873i();

    /* renamed from: w */
    private Map<Class<?>, C0877m<?>> f4205w = new C1299b();

    /* renamed from: x */
    private Class<?> f4206x = Object.class;

    /* renamed from: y */
    private boolean f4207y;

    /* renamed from: z */
    private Theme f4208z;

    /* renamed from: M */
    private T m5910M() {
        return this;
    }

    /* renamed from: N */
    private T m5911N() {
        if (!this.f4207y) {
            m5910M();
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    /* renamed from: a */
    private T m5912a(C1155m mVar, C0877m<Bitmap> mVar2, boolean z) {
        T b = z ? mo5271b(mVar, mVar2) : mo5266a(mVar, mVar2);
        b.f4186D = true;
        return b;
    }

    /* renamed from: b */
    private boolean m5913b(int i) {
        return m5914b(this.f4188f, i);
    }

    /* renamed from: b */
    private static boolean m5914b(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: c */
    private T m5915c(C1155m mVar, C0877m<Bitmap> mVar2) {
        return m5912a(mVar, mVar2, false);
    }

    /* renamed from: A */
    public final boolean mo5244A() {
        return this.f4184B;
    }

    /* renamed from: B */
    public final boolean mo5245B() {
        return this.f4196n;
    }

    /* renamed from: C */
    public final boolean mo5246C() {
        return m5913b(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public boolean mo5247D() {
        return this.f4186D;
    }

    /* renamed from: E */
    public final boolean mo5248E() {
        return this.f4201s;
    }

    /* renamed from: F */
    public final boolean mo5249F() {
        return this.f4200r;
    }

    /* renamed from: G */
    public final boolean mo5250G() {
        return m5913b(2048);
    }

    /* renamed from: H */
    public final boolean mo5251H() {
        return C1310k.m6170b(this.f4198p, this.f4197o);
    }

    /* renamed from: I */
    public T mo5252I() {
        this.f4207y = true;
        m5910M();
        return this;
    }

    /* renamed from: J */
    public T mo5253J() {
        return mo5266a(C1155m.f3928c, (C0877m<Bitmap>) new C1146i<Bitmap>());
    }

    /* renamed from: K */
    public T mo5254K() {
        return m5915c(C1155m.f3927b, new C1147j());
    }

    /* renamed from: L */
    public T mo5255L() {
        return m5915c(C1155m.f3926a, new C1170r());
    }

    /* renamed from: a */
    public T mo5256a(float f) {
        if (this.f4183A) {
            return clone().mo5256a(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f4189g = f;
        this.f4188f |= 2;
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5257a(int i) {
        if (this.f4183A) {
            return clone().mo5257a(i);
        }
        this.f4193k = i;
        int i2 = this.f4188f | 32;
        this.f4188f = i2;
        this.f4192j = null;
        this.f4188f = i2 & -17;
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5258a(int i, int i2) {
        if (this.f4183A) {
            return clone().mo5258a(i, i2);
        }
        this.f4198p = i;
        this.f4197o = i2;
        this.f4188f |= 512;
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5259a(C0838g gVar) {
        if (this.f4183A) {
            return clone().mo5259a(gVar);
        }
        C1309j.m6149a(gVar);
        this.f4191i = gVar;
        this.f4188f |= 8;
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5260a(C0869g gVar) {
        if (this.f4183A) {
            return clone().mo5260a(gVar);
        }
        C1309j.m6149a(gVar);
        this.f4199q = gVar;
        this.f4188f |= 1024;
        m5911N();
        return this;
    }

    /* renamed from: a */
    public <Y> T mo5261a(C0870h<Y> hVar, Y y) {
        if (this.f4183A) {
            return clone().mo5261a(hVar, y);
        }
        C1309j.m6149a(hVar);
        C1309j.m6149a(y);
        this.f4204v.mo4627a(hVar, y);
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5262a(C0877m<Bitmap> mVar) {
        return mo5263a(mVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public T mo5263a(C0877m<Bitmap> mVar, boolean z) {
        if (this.f4183A) {
            return clone().mo5263a(mVar, z);
        }
        C1168p pVar = new C1168p(mVar, z);
        mo5268a(Bitmap.class, mVar, z);
        mo5268a(Drawable.class, (C0877m<Y>) pVar, z);
        pVar.mo5049a();
        mo5268a(BitmapDrawable.class, (C0877m<Y>) pVar, z);
        mo5268a(C1196c.class, (C0877m<Y>) new C1200f<Y>(mVar), z);
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5264a(C0989j jVar) {
        if (this.f4183A) {
            return clone().mo5264a(jVar);
        }
        C1309j.m6149a(jVar);
        this.f4190h = jVar;
        this.f4188f |= 4;
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5265a(C1155m mVar) {
        C0870h<C1155m> hVar = C1155m.f3931f;
        C1309j.m6149a(mVar);
        return mo5261a(hVar, (Y) mVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final T mo5266a(C1155m mVar, C0877m<Bitmap> mVar2) {
        if (this.f4183A) {
            return clone().mo5266a(mVar, mVar2);
        }
        mo5265a(mVar);
        return mo5263a(mVar2, false);
    }

    /* renamed from: a */
    public T mo4577a(C1267a<?> aVar) {
        if (this.f4183A) {
            return clone().mo4577a(aVar);
        }
        if (m5914b(aVar.f4188f, 2)) {
            this.f4189g = aVar.f4189g;
        }
        if (m5914b(aVar.f4188f, 262144)) {
            this.f4184B = aVar.f4184B;
        }
        if (m5914b(aVar.f4188f, 1048576)) {
            this.f4187E = aVar.f4187E;
        }
        if (m5914b(aVar.f4188f, 4)) {
            this.f4190h = aVar.f4190h;
        }
        if (m5914b(aVar.f4188f, 8)) {
            this.f4191i = aVar.f4191i;
        }
        if (m5914b(aVar.f4188f, 16)) {
            this.f4192j = aVar.f4192j;
            this.f4193k = 0;
            this.f4188f &= -33;
        }
        if (m5914b(aVar.f4188f, 32)) {
            this.f4193k = aVar.f4193k;
            this.f4192j = null;
            this.f4188f &= -17;
        }
        if (m5914b(aVar.f4188f, 64)) {
            this.f4194l = aVar.f4194l;
            this.f4195m = 0;
            this.f4188f &= -129;
        }
        if (m5914b(aVar.f4188f, 128)) {
            this.f4195m = aVar.f4195m;
            this.f4194l = null;
            this.f4188f &= -65;
        }
        if (m5914b(aVar.f4188f, 256)) {
            this.f4196n = aVar.f4196n;
        }
        if (m5914b(aVar.f4188f, 512)) {
            this.f4198p = aVar.f4198p;
            this.f4197o = aVar.f4197o;
        }
        if (m5914b(aVar.f4188f, 1024)) {
            this.f4199q = aVar.f4199q;
        }
        if (m5914b(aVar.f4188f, 4096)) {
            this.f4206x = aVar.f4206x;
        }
        if (m5914b(aVar.f4188f, 8192)) {
            this.f4202t = aVar.f4202t;
            this.f4203u = 0;
            this.f4188f &= -16385;
        }
        if (m5914b(aVar.f4188f, 16384)) {
            this.f4203u = aVar.f4203u;
            this.f4202t = null;
            this.f4188f &= -8193;
        }
        if (m5914b(aVar.f4188f, 32768)) {
            this.f4208z = aVar.f4208z;
        }
        if (m5914b(aVar.f4188f, 65536)) {
            this.f4201s = aVar.f4201s;
        }
        if (m5914b(aVar.f4188f, 131072)) {
            this.f4200r = aVar.f4200r;
        }
        if (m5914b(aVar.f4188f, 2048)) {
            this.f4205w.putAll(aVar.f4205w);
            this.f4186D = aVar.f4186D;
        }
        if (m5914b(aVar.f4188f, 524288)) {
            this.f4185C = aVar.f4185C;
        }
        if (!this.f4201s) {
            this.f4205w.clear();
            int i = this.f4188f & -2049;
            this.f4188f = i;
            this.f4200r = false;
            this.f4188f = i & -131073;
            this.f4186D = true;
        }
        this.f4188f |= aVar.f4188f;
        this.f4204v.mo4629a(aVar.f4204v);
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5267a(Class<?> cls) {
        if (this.f4183A) {
            return clone().mo5267a(cls);
        }
        C1309j.m6149a(cls);
        this.f4206x = cls;
        this.f4188f |= 4096;
        m5911N();
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Y> T mo5268a(Class<Y> cls, C0877m<Y> mVar, boolean z) {
        if (this.f4183A) {
            return clone().mo5268a(cls, mVar, z);
        }
        C1309j.m6149a(cls);
        C1309j.m6149a(mVar);
        this.f4205w.put(cls, mVar);
        int i = this.f4188f | 2048;
        this.f4188f = i;
        this.f4201s = true;
        int i2 = i | 65536;
        this.f4188f = i2;
        this.f4186D = false;
        if (z) {
            this.f4188f = i2 | 131072;
            this.f4200r = true;
        }
        m5911N();
        return this;
    }

    /* renamed from: a */
    public T mo5269a(boolean z) {
        if (this.f4183A) {
            return clone().mo5269a(true);
        }
        this.f4196n = !z;
        this.f4188f |= 256;
        m5911N();
        return this;
    }

    /* renamed from: b */
    public T mo5270b() {
        if (!this.f4207y || this.f4183A) {
            this.f4183A = true;
            return mo5252I();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final T mo5271b(C1155m mVar, C0877m<Bitmap> mVar2) {
        if (this.f4183A) {
            return clone().mo5271b(mVar, mVar2);
        }
        mo5265a(mVar);
        return mo5262a(mVar2);
    }

    /* renamed from: b */
    public T mo5272b(boolean z) {
        if (this.f4183A) {
            return clone().mo5272b(z);
        }
        this.f4187E = z;
        this.f4188f |= 1048576;
        m5911N();
        return this;
    }

    /* renamed from: c */
    public T mo5273c() {
        return mo5271b(C1155m.f3927b, (C0877m<Bitmap>) new C1148k<Bitmap>());
    }

    public T clone() {
        try {
            T t = (C1267a) super.clone();
            C0873i iVar = new C0873i();
            t.f4204v = iVar;
            iVar.mo4629a(this.f4204v);
            C1299b bVar = new C1299b();
            t.f4205w = bVar;
            bVar.putAll(this.f4205w);
            t.f4207y = false;
            t.f4183A = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public final C0989j mo5274d() {
        return this.f4190h;
    }

    /* renamed from: e */
    public final int mo5275e() {
        return this.f4193k;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1267a)) {
            return false;
        }
        C1267a aVar = (C1267a) obj;
        return Float.compare(aVar.f4189g, this.f4189g) == 0 && this.f4193k == aVar.f4193k && C1310k.m6171b((Object) this.f4192j, (Object) aVar.f4192j) && this.f4195m == aVar.f4195m && C1310k.m6171b((Object) this.f4194l, (Object) aVar.f4194l) && this.f4203u == aVar.f4203u && C1310k.m6171b((Object) this.f4202t, (Object) aVar.f4202t) && this.f4196n == aVar.f4196n && this.f4197o == aVar.f4197o && this.f4198p == aVar.f4198p && this.f4200r == aVar.f4200r && this.f4201s == aVar.f4201s && this.f4184B == aVar.f4184B && this.f4185C == aVar.f4185C && this.f4190h.equals(aVar.f4190h) && this.f4191i == aVar.f4191i && this.f4204v.equals(aVar.f4204v) && this.f4205w.equals(aVar.f4205w) && this.f4206x.equals(aVar.f4206x) && C1310k.m6171b((Object) this.f4199q, (Object) aVar.f4199q) && C1310k.m6171b((Object) this.f4208z, (Object) aVar.f4208z);
    }

    public int hashCode() {
        return C1310k.m6160a((Object) this.f4208z, C1310k.m6160a((Object) this.f4199q, C1310k.m6160a((Object) this.f4206x, C1310k.m6160a((Object) this.f4205w, C1310k.m6160a((Object) this.f4204v, C1310k.m6160a((Object) this.f4191i, C1310k.m6160a((Object) this.f4190h, C1310k.m6161a(this.f4185C, C1310k.m6161a(this.f4184B, C1310k.m6161a(this.f4201s, C1310k.m6161a(this.f4200r, C1310k.m6156a(this.f4198p, C1310k.m6156a(this.f4197o, C1310k.m6161a(this.f4196n, C1310k.m6160a((Object) this.f4202t, C1310k.m6156a(this.f4203u, C1310k.m6160a((Object) this.f4194l, C1310k.m6156a(this.f4195m, C1310k.m6160a((Object) this.f4192j, C1310k.m6156a(this.f4193k, C1310k.m6154a(this.f4189g)))))))))))))))))))));
    }

    /* renamed from: j */
    public final Drawable mo5278j() {
        return this.f4192j;
    }

    /* renamed from: k */
    public final Drawable mo5279k() {
        return this.f4202t;
    }

    /* renamed from: l */
    public final int mo5280l() {
        return this.f4203u;
    }

    /* renamed from: n */
    public final boolean mo5281n() {
        return this.f4185C;
    }

    /* renamed from: o */
    public final C0873i mo5282o() {
        return this.f4204v;
    }

    /* renamed from: p */
    public final int mo5283p() {
        return this.f4197o;
    }

    /* renamed from: q */
    public final int mo5284q() {
        return this.f4198p;
    }

    /* renamed from: r */
    public final Drawable mo5285r() {
        return this.f4194l;
    }

    /* renamed from: s */
    public final int mo5286s() {
        return this.f4195m;
    }

    /* renamed from: t */
    public final C0838g mo5287t() {
        return this.f4191i;
    }

    /* renamed from: u */
    public final Class<?> mo5288u() {
        return this.f4206x;
    }

    /* renamed from: v */
    public final C0869g mo5289v() {
        return this.f4199q;
    }

    /* renamed from: w */
    public final float mo5290w() {
        return this.f4189g;
    }

    /* renamed from: x */
    public final Theme mo5291x() {
        return this.f4208z;
    }

    /* renamed from: y */
    public final Map<Class<?>, C0877m<?>> mo5292y() {
        return this.f4205w;
    }

    /* renamed from: z */
    public final boolean mo5293z() {
        return this.f4187E;
    }
}
