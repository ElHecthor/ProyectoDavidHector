package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4.C4219e;

/* renamed from: g.d.a.b.d.g.e4 */
final class C3983e4 implements C4051i8 {

    /* renamed from: a */
    private final C3945c4 f10919a;

    private C3983e4(C3945c4 c4Var) {
        C4248v4.m17306a(c4Var, "output");
        C3945c4 c4Var2 = c4Var;
        this.f10919a = c4Var2;
    }

    /* renamed from: a */
    public static C3983e4 m16280a(C3945c4 c4Var) {
        C3983e4 e4Var = c4Var.f10845a;
        return e4Var != null ? e4Var : new C3983e4(c4Var);
    }

    /* renamed from: a */
    public final int mo12388a() {
        return C4219e.f11325k;
    }

    /* renamed from: a */
    public final void mo12389a(int i) {
        this.f10919a.mo12254a(i, 3);
    }

    /* renamed from: a */
    public final void mo12390a(int i, double d) {
        this.f10919a.mo12252a(i, d);
    }

    /* renamed from: a */
    public final void mo12391a(int i, float f) {
        this.f10919a.mo12253a(i, f);
    }

    /* renamed from: a */
    public final void mo12392a(int i, int i2) {
        this.f10919a.mo12280e(i, i2);
    }

    /* renamed from: a */
    public final void mo12393a(int i, long j) {
        this.f10919a.mo12276c(i, j);
    }

    /* renamed from: a */
    public final void mo12394a(int i, C4092l3 l3Var) {
        this.f10919a.mo12258a(i, l3Var);
    }

    /* renamed from: a */
    public final <K, V> void mo12395a(int i, C4249v5<K, V> v5Var, Map<K, V> map) {
        for (Entry entry : map.entrySet()) {
            this.f10919a.mo12254a(i, 2);
            this.f10919a.mo12268b(C4264w5.m17450a(v5Var, entry.getKey(), entry.getValue()));
            C4264w5.m17451a(this.f10919a, v5Var, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: a */
    public final void mo12396a(int i, Object obj) {
        if (obj instanceof C4092l3) {
            this.f10919a.mo12271b(i, (C4092l3) obj);
        } else {
            this.f10919a.mo12256a(i, (C3985e6) obj);
        }
    }

    /* renamed from: a */
    public final void mo12397a(int i, Object obj, C4236u6 u6Var) {
        this.f10919a.mo12257a(i, (C3985e6) obj, u6Var);
    }

    /* renamed from: a */
    public final void mo12398a(int i, String str) {
        this.f10919a.mo12259a(i, str);
    }

    /* renamed from: a */
    public final void mo12399a(int i, List<C4092l3> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f10919a.mo12258a(i, (C4092l3) list.get(i2));
        }
    }

    /* renamed from: a */
    public final void mo12400a(int i, List<?> list, C4236u6 u6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo12397a(i, list.get(i2), u6Var);
        }
    }

    /* renamed from: a */
    public final void mo12401a(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16048g(((Long) list.get(i4)).longValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12277c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12276c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: a */
    public final void mo12402a(int i, boolean z) {
        this.f10919a.mo12260a(i, z);
    }

    /* renamed from: b */
    public final void mo12403b(int i) {
        this.f10919a.mo12254a(i, 4);
    }

    /* renamed from: b */
    public final void mo12404b(int i, int i2) {
        this.f10919a.mo12279d(i, i2);
    }

    /* renamed from: b */
    public final void mo12405b(int i, long j) {
        this.f10919a.mo12255a(i, j);
    }

    /* renamed from: b */
    public final void mo12406b(int i, Object obj, C4236u6 u6Var) {
        C3945c4 c4Var = this.f10919a;
        C3985e6 e6Var = (C3985e6) obj;
        c4Var.mo12254a(i, 3);
        u6Var.mo12544a(e6Var, (C4051i8) c4Var.f10845a);
        c4Var.mo12254a(i, 4);
    }

    /* renamed from: b */
    public final void mo12407b(int i, List<String> list) {
        int i2 = 0;
        if (list instanceof C4094l5) {
            C4094l5 l5Var = (C4094l5) list;
            while (i2 < list.size()) {
                Object b = l5Var.mo12622b(i2);
                if (b instanceof String) {
                    this.f10919a.mo12259a(i, (String) b);
                } else {
                    this.f10919a.mo12258a(i, (C4092l3) b);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12259a(i, (String) list.get(i2));
            i2++;
        }
    }

    /* renamed from: b */
    public final void mo12408b(int i, List<?> list, C4236u6 u6Var) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo12406b(i, list.get(i2), u6Var);
        }
    }

    /* renamed from: b */
    public final void mo12409b(int i, List<Boolean> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16029b(((Boolean) list.get(i4)).booleanValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12266a(((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12260a(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    /* renamed from: c */
    public final void mo12410c(int i, int i2) {
        this.f10919a.mo12269b(i, i2);
    }

    /* renamed from: c */
    public final void mo12411c(int i, long j) {
        this.f10919a.mo12276c(i, j);
    }

    /* renamed from: c */
    public final void mo12412c(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16044f(((Long) list.get(i4)).longValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12272b(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12270b(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: d */
    public final void mo12413d(int i, int i2) {
        this.f10919a.mo12269b(i, i2);
    }

    /* renamed from: d */
    public final void mo12414d(int i, long j) {
        this.f10919a.mo12270b(i, j);
    }

    /* renamed from: d */
    public final void mo12415d(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16041f(((Integer) list.get(i4)).intValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12251a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12269b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: e */
    public final void mo12416e(int i, int i2) {
        this.f10919a.mo12280e(i, i2);
    }

    /* renamed from: e */
    public final void mo12417e(int i, long j) {
        this.f10919a.mo12255a(i, j);
    }

    /* renamed from: e */
    public final void mo12418e(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16040e(((Long) list.get(i4)).longValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12261a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12255a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: f */
    public final void mo12419f(int i, int i2) {
        this.f10919a.mo12275c(i, i2);
    }

    /* renamed from: f */
    public final void mo12420f(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16058k(((Integer) list.get(i4)).intValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12251a(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12269b(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: g */
    public final void mo12421g(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16049h(((Integer) list.get(i4)).intValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12274c(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12279d(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: h */
    public final void mo12422h(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16037d(((Long) list.get(i4)).longValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12261a(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12255a(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: i */
    public final void mo12423i(int i, List<Double> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16017b(((Double) list.get(i4)).doubleValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12249a(((Double) list.get(i2)).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12252a(i, ((Double) list.get(i2)).doubleValue());
            i2++;
        }
    }

    /* renamed from: j */
    public final void mo12424j(int i, List<Long> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16052h(((Long) list.get(i4)).longValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12277c(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12276c(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    /* renamed from: k */
    public final void mo12425k(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16053i(((Integer) list.get(i4)).intValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12278d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12280e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: l */
    public final void mo12426l(int i, List<Float> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16018b(((Float) list.get(i4)).floatValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12250a(((Float) list.get(i2)).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12253a(i, ((Float) list.get(i2)).floatValue());
            i2++;
        }
    }

    /* renamed from: m */
    public final void mo12427m(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16045g(((Integer) list.get(i4)).intValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12268b(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12275c(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    /* renamed from: n */
    public final void mo12428n(int i, List<Integer> list, boolean z) {
        int i2 = 0;
        if (z) {
            this.f10919a.mo12254a(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3945c4.m16056j(((Integer) list.get(i4)).intValue());
            }
            this.f10919a.mo12268b(i3);
            while (i2 < list.size()) {
                this.f10919a.mo12278d(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f10919a.mo12280e(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }
}
