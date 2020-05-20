package com.google.android.gms.measurement.internal;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3979e1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3979e1.C3980a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3995f1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3995f1.C3996a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4170q9;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4258w0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4258w0.C4259a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4273x0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4273x0.C4274a;

/* renamed from: com.google.android.gms.measurement.internal.ga */
final class C2316ga {

    /* renamed from: a */
    private String f6479a;

    /* renamed from: b */
    private boolean f6480b;

    /* renamed from: c */
    private C3979e1 f6481c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BitSet f6482d;

    /* renamed from: e */
    private BitSet f6483e;

    /* renamed from: f */
    private Map<Integer, Long> f6484f;

    /* renamed from: g */
    private Map<Integer, List<Long>> f6485g;

    /* renamed from: h */
    private final /* synthetic */ C2292ea f6486h;

    private C2316ga(C2292ea eaVar, String str) {
        this.f6486h = eaVar;
        this.f6479a = str;
        this.f6480b = true;
        this.f6482d = new BitSet();
        this.f6483e = new BitSet();
        this.f6484f = new C3162a();
        this.f6485g = new C3162a();
    }

    /* synthetic */ C2316ga(C2292ea eaVar, String str, C2280da daVar) {
        this(eaVar, str);
    }

    private C2316ga(C2292ea eaVar, String str, C3979e1 e1Var, BitSet bitSet, BitSet bitSet2, Map<Integer, Long> map, Map<Integer, Long> map2) {
        this.f6486h = eaVar;
        this.f6479a = str;
        this.f6482d = bitSet;
        this.f6483e = bitSet2;
        this.f6484f = map;
        this.f6485g = new C3162a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f6485g.put(num, arrayList);
            }
        }
        this.f6480b = false;
        this.f6481c = e1Var;
    }

    /* synthetic */ C2316ga(C2292ea eaVar, String str, C3979e1 e1Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, C2280da daVar) {
        this(eaVar, str, e1Var, bitSet, bitSet2, map, map2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C4258w0 mo7361a(int i) {
        ArrayList arrayList;
        Iterable iterable;
        C4259a w = C4258w0.m17423w();
        w.mo12881a(i);
        w.mo12884a(this.f6480b);
        C3979e1 e1Var = this.f6481c;
        if (e1Var != null) {
            w.mo12883a(e1Var);
        }
        C3980a x = C3979e1.m16251x();
        x.mo12381b((Iterable<? extends Long>) C2445r9.m9772a(this.f6482d));
        x.mo12379a((Iterable<? extends Long>) C2445r9.m9772a(this.f6483e));
        if (this.f6484f == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(this.f6484f.size());
            for (Integer intValue : this.f6484f.keySet()) {
                int intValue2 = intValue.intValue();
                C4274a t = C4273x0.m17517t();
                t.mo12904a(intValue2);
                t.mo12905a(((Long) this.f6484f.get(Integer.valueOf(intValue2))).longValue());
                arrayList.add((C4273x0) ((C4214t4) t.mo12346f()));
            }
        }
        x.mo12382c(arrayList);
        if (this.f6485g == null) {
            iterable = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(this.f6485g.size());
            for (Integer num : this.f6485g.keySet()) {
                C3996a t2 = C3995f1.m16351t();
                t2.mo12444a(num.intValue());
                List list = (List) this.f6485g.get(num);
                if (list != null) {
                    Collections.sort(list);
                    t2.mo12445a((Iterable<? extends Long>) list);
                }
                arrayList2.add((C3995f1) ((C4214t4) t2.mo12346f()));
            }
            iterable = arrayList2;
        }
        x.mo12383d(iterable);
        w.mo12882a(x);
        return (C4258w0) ((C4214t4) w.mo12346f());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7362a(C2328ha haVar) {
        int a = haVar.mo7373a();
        Boolean bool = haVar.f6509c;
        if (bool != null) {
            this.f6483e.set(a, bool.booleanValue());
        }
        Boolean bool2 = haVar.f6510d;
        if (bool2 != null) {
            this.f6482d.set(a, bool2.booleanValue());
        }
        if (haVar.f6511e != null) {
            Long l = (Long) this.f6484f.get(Integer.valueOf(a));
            long longValue = haVar.f6511e.longValue() / 1000;
            if (l == null || longValue > l.longValue()) {
                this.f6484f.put(Integer.valueOf(a), Long.valueOf(longValue));
            }
        }
        if (haVar.f6512f != null) {
            List list = (List) this.f6485g.get(Integer.valueOf(a));
            if (list == null) {
                list = new ArrayList();
                this.f6485g.put(Integer.valueOf(a), list);
            }
            if (haVar.mo7374b()) {
                list.clear();
            }
            if (C4170q9.m16953b() && this.f6486h.mo7827m().mo7114d(this.f6479a, C2457t.f6921h0) && haVar.mo7375c()) {
                list.clear();
            }
            if (!C4170q9.m16953b() || !this.f6486h.mo7827m().mo7114d(this.f6479a, C2457t.f6921h0)) {
                list.add(Long.valueOf(haVar.f6512f.longValue() / 1000));
            } else {
                long longValue2 = haVar.f6512f.longValue() / 1000;
                if (!list.contains(Long.valueOf(longValue2))) {
                    list.add(Long.valueOf(longValue2));
                }
            }
        }
    }
}
