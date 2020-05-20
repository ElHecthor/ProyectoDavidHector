package p147g.p156d.p204b.p207y;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import p147g.p156d.p204b.C4475b;
import p147g.p156d.p204b.C4476c;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p206x.C4512a;
import p147g.p156d.p204b.p206x.C4515d;
import p147g.p156d.p204b.p206x.C4516e;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.d */
public final class C4537d implements C4511w, Cloneable {

    /* renamed from: l */
    public static final C4537d f11939l = new C4537d();

    /* renamed from: f */
    private double f11940f = -1.0d;

    /* renamed from: g */
    private int f11941g = 136;

    /* renamed from: h */
    private boolean f11942h = true;

    /* renamed from: i */
    private boolean f11943i;

    /* renamed from: j */
    private List<C4475b> f11944j = Collections.emptyList();

    /* renamed from: k */
    private List<C4475b> f11945k = Collections.emptyList();

    /* renamed from: g.d.b.y.d$a */
    class C4538a extends C4509v<T> {

        /* renamed from: a */
        private C4509v<T> f11946a;

        /* renamed from: b */
        final /* synthetic */ boolean f11947b;

        /* renamed from: c */
        final /* synthetic */ boolean f11948c;

        /* renamed from: d */
        final /* synthetic */ C4485f f11949d;

        /* renamed from: e */
        final /* synthetic */ C4632a f11950e;

        C4538a(boolean z, boolean z2, C4485f fVar, C4632a aVar) {
            this.f11947b = z;
            this.f11948c = z2;
            this.f11949d = fVar;
            this.f11950e = aVar;
        }

        /* renamed from: b */
        private C4509v<T> m18416b() {
            C4509v<T> vVar = this.f11946a;
            if (vVar != null) {
                return vVar;
            }
            C4509v<T> a = this.f11949d.mo13335a((C4511w) C4537d.this, this.f11950e);
            this.f11946a = a;
            return a;
        }

        /* renamed from: a */
        public T mo13284a(C4470a aVar) {
            if (!this.f11947b) {
                return m18416b().mo13284a(aVar);
            }
            aVar.mo13308x();
            return null;
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, T t) {
            if (this.f11948c) {
                cVar.mo13329m();
            } else {
                m18416b().mo13285a(cVar, t);
            }
        }
    }

    /* renamed from: a */
    private boolean m18405a(C4515d dVar) {
        return dVar == null || dVar.value() <= this.f11940f;
    }

    /* renamed from: a */
    private boolean m18406a(C4515d dVar, C4516e eVar) {
        return m18405a(dVar) && m18407a(eVar);
    }

    /* renamed from: a */
    private boolean m18407a(C4516e eVar) {
        return eVar == null || eVar.value() > this.f11940f;
    }

    /* renamed from: a */
    private boolean m18408a(Class<?> cls) {
        if (this.f11940f == -1.0d || m18406a((C4515d) cls.getAnnotation(C4515d.class), (C4516e) cls.getAnnotation(C4516e.class))) {
            return (!this.f11942h && m18411c(cls)) || m18409b(cls);
        }
        return true;
    }

    /* renamed from: b */
    private boolean m18409b(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    /* renamed from: b */
    private boolean m18410b(Class<?> cls, boolean z) {
        for (C4475b a : z ? this.f11944j : this.f11945k) {
            if (a.mo13331a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m18411c(Class<?> cls) {
        return cls.isMemberClass() && !m18412d(cls);
    }

    /* renamed from: d */
    private boolean m18412d(Class<?> cls) {
        return (cls.getModifiers() & 8) != 0;
    }

    /* renamed from: a */
    public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
        Class a = aVar.mo13529a();
        boolean a2 = m18408a(a);
        boolean z = a2 || m18410b(a, true);
        boolean z2 = a2 || m18410b(a, false);
        if (!z && !z2) {
            return null;
        }
        C4538a aVar2 = new C4538a(z2, z, fVar, aVar);
        return aVar2;
    }

    /* renamed from: a */
    public boolean mo13420a(Class<?> cls, boolean z) {
        return m18408a(cls) || m18410b(cls, z);
    }

    /* renamed from: a */
    public boolean mo13421a(Field field, boolean z) {
        if ((this.f11941g & field.getModifiers()) != 0) {
            return true;
        }
        if ((this.f11940f != -1.0d && !m18406a((C4515d) field.getAnnotation(C4515d.class), (C4516e) field.getAnnotation(C4516e.class))) || field.isSynthetic()) {
            return true;
        }
        if (this.f11943i) {
            C4512a aVar = (C4512a) field.getAnnotation(C4512a.class);
            if (aVar == null || (!z ? !aVar.deserialize() : !aVar.serialize())) {
                return true;
            }
        }
        if ((!this.f11942h && m18411c(field.getType())) || m18409b(field.getType())) {
            return true;
        }
        List<C4475b> list = z ? this.f11944j : this.f11945k;
        if (!list.isEmpty()) {
            C4476c cVar = new C4476c(field);
            for (C4475b a : list) {
                if (a.mo13330a(cVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public C4537d clone() {
        try {
            return (C4537d) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
