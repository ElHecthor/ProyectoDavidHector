package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0574l.C0577c;
import p071f.p088e.C3167d;
import p071f.p088e.C3175g;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3319f;

/* renamed from: androidx.recyclerview.widget.y */
class C0677y {

    /* renamed from: a */
    final C3175g<C0566d0, C0678a> f2726a = new C3175g<>();

    /* renamed from: b */
    final C3167d<C0566d0> f2727b = new C3167d<>();

    /* renamed from: androidx.recyclerview.widget.y$a */
    static class C0678a {

        /* renamed from: d */
        static C3318e<C0678a> f2728d = new C3319f(20);

        /* renamed from: a */
        int f2729a;

        /* renamed from: b */
        C0577c f2730b;

        /* renamed from: c */
        C0577c f2731c;

        private C0678a() {
        }

        /* renamed from: a */
        static void m3884a() {
            do {
            } while (f2728d.mo5387a() != null);
        }

        /* renamed from: a */
        static void m3885a(C0678a aVar) {
            aVar.f2729a = 0;
            aVar.f2730b = null;
            aVar.f2731c = null;
            f2728d.mo5388a(aVar);
        }

        /* renamed from: b */
        static C0678a m3886b() {
            C0678a aVar = (C0678a) f2728d.mo5387a();
            return aVar == null ? new C0678a() : aVar;
        }
    }

    /* renamed from: androidx.recyclerview.widget.y$b */
    interface C0679b {
        /* renamed from: a */
        void mo3400a(C0566d0 d0Var);

        /* renamed from: a */
        void mo3401a(C0566d0 d0Var, C0577c cVar, C0577c cVar2);

        /* renamed from: b */
        void mo3402b(C0566d0 d0Var, C0577c cVar, C0577c cVar2);

        /* renamed from: c */
        void mo3403c(C0566d0 d0Var, C0577c cVar, C0577c cVar2);
    }

    C0677y() {
    }

    /* renamed from: a */
    private C0577c m3867a(C0566d0 d0Var, int i) {
        C0577c cVar;
        int a = this.f2726a.mo10267a((Object) d0Var);
        if (a < 0) {
            return null;
        }
        C0678a aVar = (C0678a) this.f2726a.mo10274d(a);
        if (aVar != null) {
            int i2 = aVar.f2729a;
            if ((i2 & i) != 0) {
                aVar.f2729a = (~i) & i2;
                if (i == 4) {
                    cVar = aVar.f2730b;
                } else if (i == 8) {
                    cVar = aVar.f2731c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((aVar.f2729a & 12) == 0) {
                    this.f2726a.mo5347c(a);
                    C0678a.m3885a(aVar);
                }
                return cVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0566d0 mo3993a(long j) {
        return (C0566d0) this.f2727b.mo10190c(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3994a() {
        this.f2726a.clear();
        this.f2727b.mo10186b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3995a(long j, C0566d0 d0Var) {
        this.f2727b.mo10191c(j, d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3996a(C0566d0 d0Var) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        if (aVar == null) {
            aVar = C0678a.m3886b();
            this.f2726a.put(d0Var, aVar);
        }
        aVar.f2729a |= 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3997a(C0566d0 d0Var, C0577c cVar) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        if (aVar == null) {
            aVar = C0678a.m3886b();
            this.f2726a.put(d0Var, aVar);
        }
        aVar.f2729a |= 2;
        aVar.f2730b = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3998a(C0679b bVar) {
        C0577c cVar;
        C0577c cVar2;
        for (int size = this.f2726a.size() - 1; size >= 0; size--) {
            C0566d0 d0Var = (C0566d0) this.f2726a.mo10271b(size);
            C0678a aVar = (C0678a) this.f2726a.mo5347c(size);
            int i = aVar.f2729a;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = aVar.f2730b;
                    if (cVar != null) {
                        cVar2 = aVar.f2731c;
                    }
                } else {
                    if ((i & 14) != 14) {
                        if ((i & 12) == 12) {
                            bVar.mo3403c(d0Var, aVar.f2730b, aVar.f2731c);
                        } else if ((i & 4) != 0) {
                            cVar = aVar.f2730b;
                            cVar2 = null;
                        } else if ((i & 8) == 0) {
                        }
                        C0678a.m3885a(aVar);
                    }
                    bVar.mo3401a(d0Var, aVar.f2730b, aVar.f2731c);
                    C0678a.m3885a(aVar);
                }
                bVar.mo3402b(d0Var, cVar, cVar2);
                C0678a.m3885a(aVar);
            }
            bVar.mo3400a(d0Var);
            C0678a.m3885a(aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3999b() {
        C0678a.m3884a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4000b(C0566d0 d0Var, C0577c cVar) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        if (aVar == null) {
            aVar = C0678a.m3886b();
            this.f2726a.put(d0Var, aVar);
        }
        aVar.f2731c = cVar;
        aVar.f2729a |= 8;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4001b(C0566d0 d0Var) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        return (aVar == null || (aVar.f2729a & 1) == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4002c(C0566d0 d0Var, C0577c cVar) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        if (aVar == null) {
            aVar = C0678a.m3886b();
            this.f2726a.put(d0Var, aVar);
        }
        aVar.f2730b = cVar;
        aVar.f2729a |= 4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4003c(C0566d0 d0Var) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        return (aVar == null || (aVar.f2729a & 4) == 0) ? false : true;
    }

    /* renamed from: d */
    public void mo4004d(C0566d0 d0Var) {
        mo4007g(d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0577c mo4005e(C0566d0 d0Var) {
        return m3867a(d0Var, 8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C0577c mo4006f(C0566d0 d0Var) {
        return m3867a(d0Var, 4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4007g(C0566d0 d0Var) {
        C0678a aVar = (C0678a) this.f2726a.get(d0Var);
        if (aVar != null) {
            aVar.f2729a &= -2;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4008h(C0566d0 d0Var) {
        int d = this.f2727b.mo10194d() - 1;
        while (true) {
            if (d < 0) {
                break;
            } else if (d0Var == this.f2727b.mo10189c(d)) {
                this.f2727b.mo10187b(d);
                break;
            } else {
                d--;
            }
        }
        C0678a aVar = (C0678a) this.f2726a.remove(d0Var);
        if (aVar != null) {
            C0678a.m3885a(aVar);
        }
    }
}
