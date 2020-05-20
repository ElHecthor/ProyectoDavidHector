package com.bumptech.glide.load.p007o;

import com.bumptech.glide.C0836e;
import com.bumptech.glide.C0838g;
import com.bumptech.glide.load.C0859d;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.C0873i;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p009b0.C0940a;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import com.bumptech.glide.load.p013q.C1120c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bumptech.glide.load.o.g */
final class C0977g<Transcode> {

    /* renamed from: a */
    private final List<C1070a<?>> f3562a = new ArrayList();

    /* renamed from: b */
    private final List<C0869g> f3563b = new ArrayList();

    /* renamed from: c */
    private C0836e f3564c;

    /* renamed from: d */
    private Object f3565d;

    /* renamed from: e */
    private int f3566e;

    /* renamed from: f */
    private int f3567f;

    /* renamed from: g */
    private Class<?> f3568g;

    /* renamed from: h */
    private C0983e f3569h;

    /* renamed from: i */
    private C0873i f3570i;

    /* renamed from: j */
    private Map<Class<?>, C0877m<?>> f3571j;

    /* renamed from: k */
    private Class<Transcode> f3572k;

    /* renamed from: l */
    private boolean f3573l;

    /* renamed from: m */
    private boolean f3574m;

    /* renamed from: n */
    private C0869g f3575n;

    /* renamed from: o */
    private C0838g f3576o;

    /* renamed from: p */
    private C0989j f3577p;

    /* renamed from: q */
    private boolean f3578q;

    /* renamed from: r */
    private boolean f3579r;

    C0977g() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <X> C0859d<X> mo4793a(X x) {
        return this.f3564c.mo4541f().mo4560c(x);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Z> C0876l<Z> mo4794a(C1020v<Z> vVar) {
        return this.f3564c.mo4541f().mo4552a(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <Data> C1017t<Data, ?, Transcode> mo4795a(Class<Data> cls) {
        return this.f3564c.mo4541f().mo4553a(cls, this.f3568g, this.f3572k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public List<C1069n<File, ?>> mo4796a(File file) {
        return this.f3564c.mo4541f().mo4555a(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4797a() {
        this.f3564c = null;
        this.f3565d = null;
        this.f3575n = null;
        this.f3568g = null;
        this.f3572k = null;
        this.f3570i = null;
        this.f3576o = null;
        this.f3571j = null;
        this.f3577p = null;
        this.f3562a.clear();
        this.f3573l = false;
        this.f3563b.clear();
        this.f3574m = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public <R> void mo4798a(C0836e eVar, Object obj, C0869g gVar, int i, int i2, C0989j jVar, Class<?> cls, Class<R> cls2, C0838g gVar2, C0873i iVar, Map<Class<?>, C0877m<?>> map, boolean z, boolean z2, C0983e eVar2) {
        this.f3564c = eVar;
        this.f3565d = obj;
        this.f3575n = gVar;
        this.f3566e = i;
        this.f3567f = i2;
        this.f3577p = jVar;
        this.f3568g = cls;
        this.f3569h = eVar2;
        this.f3572k = cls2;
        this.f3576o = gVar2;
        this.f3570i = iVar;
        this.f3571j = map;
        this.f3578q = z;
        this.f3579r = z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4799a(C0869g gVar) {
        List g = mo4808g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            if (((C1070a) g.get(i)).f3806a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public <Z> C0877m<Z> mo4800b(Class<Z> cls) {
        C0877m<Z> mVar = (C0877m) this.f3571j.get(cls);
        if (mVar == null) {
            Iterator it = this.f3571j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Entry entry = (Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    mVar = (C0877m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.f3571j.isEmpty() || !this.f3578q) {
            return C1120c.m5359a();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Missing transformation for ");
        sb.append(cls);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0916b mo4801b() {
        return this.f3564c.mo4535a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4802b(C1020v<?> vVar) {
        return this.f3564c.mo4541f().mo4559b(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public List<C0869g> mo4803c() {
        if (!this.f3574m) {
            this.f3574m = true;
            this.f3563b.clear();
            List g = mo4808g();
            int size = g.size();
            for (int i = 0; i < size; i++) {
                C1070a aVar = (C1070a) g.get(i);
                if (!this.f3563b.contains(aVar.f3806a)) {
                    this.f3563b.add(aVar.f3806a);
                }
                for (int i2 = 0; i2 < aVar.f3807b.size(); i2++) {
                    if (!this.f3563b.contains(aVar.f3807b.get(i2))) {
                        this.f3563b.add(aVar.f3807b.get(i2));
                    }
                }
            }
        }
        return this.f3563b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4804c(Class<?> cls) {
        return mo4795a(cls) != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0940a mo4805d() {
        return this.f3569h.mo4833a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0989j mo4806e() {
        return this.f3577p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo4807f() {
        return this.f3567f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public List<C1070a<?>> mo4808g() {
        if (!this.f3573l) {
            this.f3573l = true;
            this.f3562a.clear();
            List a = this.f3564c.mo4541f().mo4555a(this.f3565d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                C1070a a2 = ((C1069n) a.get(i)).mo4571a(this.f3565d, this.f3566e, this.f3567f, this.f3570i);
                if (a2 != null) {
                    this.f3562a.add(a2);
                }
            }
        }
        return this.f3562a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public Class<?> mo4809h() {
        return this.f3565d.getClass();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public C0873i mo4810i() {
        return this.f3570i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C0838g mo4811j() {
        return this.f3576o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public List<Class<?>> mo4812k() {
        return this.f3564c.mo4541f().mo4558b(this.f3565d.getClass(), this.f3568g, this.f3572k);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public C0869g mo4813l() {
        return this.f3575n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public Class<?> mo4814m() {
        return this.f3572k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public int mo4815n() {
        return this.f3566e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public boolean mo4816o() {
        return this.f3579r;
    }
}
