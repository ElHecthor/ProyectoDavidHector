package p147g.p156d.p204b;

import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147g.p156d.p204b.p207y.C4537d;
import p147g.p156d.p204b.p207y.p208n.C4589n;

/* renamed from: g.d.b.g */
public final class C4492g {

    /* renamed from: a */
    private C4537d f11896a = C4537d.f11939l;

    /* renamed from: b */
    private C4506u f11897b = C4506u.DEFAULT;

    /* renamed from: c */
    private C4484e f11898c = C4477d.IDENTITY;

    /* renamed from: d */
    private final Map<Type, C4493h<?>> f11899d = new HashMap();

    /* renamed from: e */
    private final List<C4511w> f11900e = new ArrayList();

    /* renamed from: f */
    private final List<C4511w> f11901f = new ArrayList();

    /* renamed from: g */
    private boolean f11902g = false;

    /* renamed from: h */
    private String f11903h;

    /* renamed from: i */
    private int f11904i = 2;

    /* renamed from: j */
    private int f11905j = 2;

    /* renamed from: k */
    private boolean f11906k = false;

    /* renamed from: l */
    private boolean f11907l = false;

    /* renamed from: m */
    private boolean f11908m = true;

    /* renamed from: n */
    private boolean f11909n = false;

    /* renamed from: o */
    private boolean f11910o = false;

    /* renamed from: p */
    private boolean f11911p = false;

    /* renamed from: a */
    private void m18329a(String str, int i, int i2, List<C4511w> list) {
        C4469a aVar;
        C4469a aVar2;
        C4469a aVar3;
        if (str != null) {
            if (!"".equals(str.trim())) {
                aVar2 = new C4469a(Date.class, str);
                aVar = new C4469a(Timestamp.class, str);
                aVar3 = new C4469a(java.sql.Date.class, str);
                list.add(C4589n.m18547a(Date.class, aVar2));
                list.add(C4589n.m18547a(Timestamp.class, aVar));
                list.add(C4589n.m18547a(java.sql.Date.class, aVar3));
            }
        }
        if (i != 2 && i2 != 2) {
            C4469a aVar4 = new C4469a(Date.class, i, i2);
            C4469a aVar5 = new C4469a(Timestamp.class, i, i2);
            C4469a aVar6 = new C4469a(java.sql.Date.class, i, i2);
            aVar2 = aVar4;
            aVar = aVar5;
            aVar3 = aVar6;
            list.add(C4589n.m18547a(Date.class, aVar2));
            list.add(C4589n.m18547a(Timestamp.class, aVar));
            list.add(C4589n.m18547a(java.sql.Date.class, aVar3));
        }
    }

    /* renamed from: a */
    public C4485f mo13356a() {
        ArrayList arrayList = r1;
        ArrayList arrayList2 = new ArrayList(this.f11900e.size() + this.f11901f.size() + 3);
        arrayList2.addAll(this.f11900e);
        Collections.reverse(arrayList2);
        ArrayList arrayList3 = new ArrayList(this.f11901f);
        Collections.reverse(arrayList3);
        arrayList2.addAll(arrayList3);
        m18329a(this.f11903h, this.f11904i, this.f11905j, arrayList2);
        C4485f fVar = new C4485f(this.f11896a, this.f11898c, this.f11899d, this.f11902g, this.f11906k, this.f11910o, this.f11908m, this.f11909n, this.f11911p, this.f11907l, this.f11897b, this.f11903h, this.f11904i, this.f11905j, this.f11900e, this.f11901f, arrayList);
        return fVar;
    }
}
