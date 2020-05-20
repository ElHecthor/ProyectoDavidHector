package p147g.p156d.p204b.p207y.p208n;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p147g.p156d.p204b.C4484e;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4505t;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p206x.C4513b;
import p147g.p156d.p204b.p206x.C4514c;
import p147g.p156d.p204b.p207y.C4518b;
import p147g.p156d.p204b.p207y.C4522c;
import p147g.p156d.p204b.p207y.C4537d;
import p147g.p156d.p204b.p207y.C4550i;
import p147g.p156d.p204b.p207y.C4552k;
import p147g.p156d.p204b.p207y.p210o.C4630b;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.i */
public final class C4577i implements C4511w {

    /* renamed from: f */
    private final C4522c f12014f;

    /* renamed from: g */
    private final C4484e f12015g;

    /* renamed from: h */
    private final C4537d f12016h;

    /* renamed from: i */
    private final C4567d f12017i;

    /* renamed from: j */
    private final C4630b f12018j = C4630b.m18684a();

    /* renamed from: g.d.b.y.n.i$a */
    class C4578a extends C4580c {

        /* renamed from: d */
        final /* synthetic */ Field f12019d;

        /* renamed from: e */
        final /* synthetic */ boolean f12020e;

        /* renamed from: f */
        final /* synthetic */ C4509v f12021f;

        /* renamed from: g */
        final /* synthetic */ C4485f f12022g;

        /* renamed from: h */
        final /* synthetic */ C4632a f12023h;

        /* renamed from: i */
        final /* synthetic */ boolean f12024i;

        C4578a(C4577i iVar, String str, boolean z, boolean z2, Field field, boolean z3, C4509v vVar, C4485f fVar, C4632a aVar, boolean z4) {
            this.f12019d = field;
            this.f12020e = z3;
            this.f12021f = vVar;
            this.f12022g = fVar;
            this.f12023h = aVar;
            this.f12024i = z4;
            super(str, z, z2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13488a(C4470a aVar, Object obj) {
            Object a = this.f12021f.mo13284a(aVar);
            if (a != null || !this.f12024i) {
                this.f12019d.set(obj, a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13489a(C4473c cVar, Object obj) {
            (this.f12020e ? this.f12021f : new C4588m(this.f12022g, this.f12021f, this.f12023h.mo13530b())).mo13285a(cVar, this.f12019d.get(obj));
        }

        /* renamed from: a */
        public boolean mo13490a(Object obj) {
            boolean z = false;
            if (!this.f12028b) {
                return false;
            }
            if (this.f12019d.get(obj) != obj) {
                z = true;
            }
            return z;
        }
    }

    /* renamed from: g.d.b.y.n.i$b */
    public static final class C4579b<T> extends C4509v<T> {

        /* renamed from: a */
        private final C4550i<T> f12025a;

        /* renamed from: b */
        private final Map<String, C4580c> f12026b;

        C4579b(C4550i<T> iVar, Map<String, C4580c> map) {
            this.f12025a = iVar;
            this.f12026b = map;
        }

        /* renamed from: a */
        public T mo13284a(C4470a aVar) {
            if (aVar.mo13307w() == C4472b.NULL) {
                aVar.mo13305u();
                return null;
            }
            T a = this.f12025a.mo13419a();
            try {
                aVar.mo13291d();
                while (aVar.mo13296i()) {
                    C4580c cVar = (C4580c) this.f12026b.get(aVar.mo13303t());
                    if (cVar != null) {
                        if (cVar.f12029c) {
                            cVar.mo13488a(aVar, (Object) a);
                        }
                    }
                    aVar.mo13308x();
                }
                aVar.mo13295h();
                return a;
            } catch (IllegalStateException e) {
                throw new C4505t((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        /* renamed from: a */
        public void mo13285a(C4473c cVar, T t) {
            if (t == null) {
                cVar.mo13329m();
                return;
            }
            cVar.mo13318d();
            try {
                for (C4580c cVar2 : this.f12026b.values()) {
                    if (cVar2.mo13490a(t)) {
                        cVar.mo13315c(cVar2.f12027a);
                        cVar2.mo13489a(cVar, (Object) t);
                    }
                }
                cVar.mo13325g();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: g.d.b.y.n.i$c */
    static abstract class C4580c {

        /* renamed from: a */
        final String f12027a;

        /* renamed from: b */
        final boolean f12028b;

        /* renamed from: c */
        final boolean f12029c;

        protected C4580c(String str, boolean z, boolean z2) {
            this.f12027a = str;
            this.f12028b = z;
            this.f12029c = z2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo13488a(C4470a aVar, Object obj);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo13489a(C4473c cVar, Object obj);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract boolean mo13490a(Object obj);
    }

    public C4577i(C4522c cVar, C4484e eVar, C4537d dVar, C4567d dVar2) {
        this.f12014f = cVar;
        this.f12015g = eVar;
        this.f12016h = dVar;
        this.f12017i = dVar2;
    }

    /* renamed from: a */
    private C4580c m18517a(C4485f fVar, Field field, String str, C4632a<?> aVar, boolean z, boolean z2) {
        C4485f fVar2 = fVar;
        C4632a<?> aVar2 = aVar;
        boolean a = C4552k.m18446a((Type) aVar.mo13529a());
        Field field2 = field;
        C4513b bVar = (C4513b) field.getAnnotation(C4513b.class);
        C4509v a2 = bVar != null ? this.f12017i.mo13478a(this.f12014f, fVar, aVar2, bVar) : null;
        boolean z3 = a2 != null;
        if (a2 == null) {
            a2 = fVar.mo13336a(aVar2);
        }
        C4578a aVar3 = new C4578a(this, str, z, z2, field, z3, a2, fVar, aVar, a);
        return aVar3;
    }

    /* renamed from: a */
    private List<String> m18518a(Field field) {
        C4514c cVar = (C4514c) field.getAnnotation(C4514c.class);
        if (cVar == null) {
            return Collections.singletonList(this.f12015g.mo13332a(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: a */
    private Map<String, C4580c> m18519a(C4485f fVar, C4632a<?> aVar, Class<?> cls) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type b = aVar.mo13530b();
        C4632a<?> aVar2 = aVar;
        Class<?> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean a = mo13487a(field, true);
                boolean a2 = mo13487a(field, z);
                if (a || a2) {
                    this.f12018j.mo13527a(field);
                    Type a3 = C4518b.m18373a(aVar2.mo13530b(), cls2, field.getGenericType());
                    List a4 = m18518a(field);
                    int size = a4.size();
                    C4580c cVar = null;
                    int i2 = 0;
                    while (i2 < size) {
                        String str = (String) a4.get(i2);
                        boolean z2 = i2 != 0 ? false : a;
                        String str2 = str;
                        int i3 = i2;
                        C4580c cVar2 = cVar;
                        int i4 = size;
                        List list = a4;
                        Field field2 = field;
                        cVar = cVar2 == null ? (C4580c) linkedHashMap.put(str2, m18517a(fVar, field, str2, C4632a.m18691a(a3), z2, a2)) : cVar2;
                        i2 = i3 + 1;
                        a = z2;
                        a4 = list;
                        size = i4;
                        field = field2;
                    }
                    C4580c cVar3 = cVar;
                    if (cVar3 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b);
                        sb.append(" declares multiple JSON fields named ");
                        sb.append(cVar3.f12027a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                i++;
                z = false;
            }
            aVar2 = C4632a.m18691a(C4518b.m18373a(aVar2.mo13530b(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.mo13529a();
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static boolean m18520a(Field field, boolean z, C4537d dVar) {
        return !dVar.mo13420a(field.getType(), z) && !dVar.mo13421a(field, z);
    }

    /* renamed from: a */
    public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
        Class a = aVar.mo13529a();
        if (!Object.class.isAssignableFrom(a)) {
            return null;
        }
        return new C4579b(this.f12014f.mo13417a(aVar), m18519a(fVar, aVar, a));
    }

    /* renamed from: a */
    public boolean mo13487a(Field field, boolean z) {
        return m18520a(field, z, this.f12016h);
    }
}
