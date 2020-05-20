package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: g.d.a.b.d.g.m5 */
public final class C4110m5 extends C3998f3<String> implements C4094l5, RandomAccess {

    /* renamed from: h */
    private static final C4110m5 f11119h;

    /* renamed from: g */
    private final List<Object> f11120g;

    static {
        C4110m5 m5Var = new C4110m5();
        f11119h = m5Var;
        m5Var.mo12080n();
    }

    public C4110m5() {
        this(10);
    }

    public C4110m5(int i) {
        this(new ArrayList<>(i));
    }

    private C4110m5(ArrayList<Object> arrayList) {
        this.f11120g = arrayList;
    }

    /* renamed from: a */
    private static String m16823a(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof C4092l3 ? ((C4092l3) obj).mo12614b() : C4248v4.m17309b((byte[]) obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C3914a5 mo12078a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f11120g);
            return new C4110m5(arrayList);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    public final void mo12621a(C4092l3 l3Var) {
        mo12447c();
        this.f11120g.add(l3Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo12447c();
        this.f11120g.add(i, str);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo12447c();
        if (collection instanceof C4094l5) {
            collection = ((C4094l5) collection).mo12623b();
        }
        boolean addAll = this.f11120g.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b */
    public final Object mo12622b(int i) {
        return this.f11120g.get(i);
    }

    /* renamed from: b */
    public final List<?> mo12623b() {
        return Collections.unmodifiableList(this.f11120g);
    }

    public final void clear() {
        mo12447c();
        this.f11120g.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f11120g.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof C4092l3) {
            C4092l3 l3Var = (C4092l3) obj;
            String b = l3Var.mo12614b();
            if (l3Var.mo12615c()) {
                this.f11120g.set(i, b);
            }
            return b;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = C4248v4.m17309b(bArr);
        if (C4248v4.m17308a(bArr)) {
            this.f11120g.set(i, b2);
        }
        return b2;
    }

    /* renamed from: j */
    public final C4094l5 mo12624j() {
        return mo12079a() ? new C4168q7(this) : this;
    }

    public final /* synthetic */ Object remove(int i) {
        mo12447c();
        Object remove = this.f11120g.remove(i);
        this.modCount++;
        return m16823a(remove);
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo12447c();
        return m16823a(this.f11120g.set(i, str));
    }

    public final int size() {
        return this.f11120g.size();
    }
}
