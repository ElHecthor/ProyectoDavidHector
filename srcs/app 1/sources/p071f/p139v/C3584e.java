package p071f.p139v;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0483v;
import java.util.ArrayList;
import java.util.List;
import p071f.p139v.C3607m.C3612e;
import p071f.p139v.C3607m.C3613f;

@SuppressLint({"RestrictedApi"})
/* renamed from: f.v.e */
public class C3584e extends C0483v {

    /* renamed from: f.v.e$a */
    class C3585a extends C3612e {
        C3585a(C3584e eVar, Rect rect) {
        }
    }

    /* renamed from: f.v.e$b */
    class C3586b implements C3613f {

        /* renamed from: a */
        final /* synthetic */ View f10071a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f10072b;

        C3586b(C3584e eVar, View view, ArrayList arrayList) {
            this.f10071a = view;
            this.f10072b = arrayList;
        }

        /* renamed from: a */
        public void mo11327a(C3607m mVar) {
        }

        /* renamed from: b */
        public void mo11305b(C3607m mVar) {
        }

        /* renamed from: c */
        public void mo11306c(C3607m mVar) {
        }

        /* renamed from: d */
        public void mo11307d(C3607m mVar) {
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            mVar.mo11366b((C3613f) this);
            this.f10071a.setVisibility(8);
            int size = this.f10072b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f10072b.get(i)).setVisibility(0);
            }
        }
    }

    /* renamed from: f.v.e$c */
    class C3587c extends C3615n {

        /* renamed from: a */
        final /* synthetic */ Object f10073a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f10074b;

        /* renamed from: c */
        final /* synthetic */ Object f10075c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f10076d;

        /* renamed from: e */
        final /* synthetic */ Object f10077e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f10078f;

        C3587c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f10073a = obj;
            this.f10074b = arrayList;
            this.f10075c = obj2;
            this.f10076d = arrayList2;
            this.f10077e = obj3;
            this.f10078f = arrayList3;
        }

        /* renamed from: a */
        public void mo11327a(C3607m mVar) {
            Object obj = this.f10073a;
            if (obj != null) {
                C3584e.this.mo2933a(obj, this.f10074b, null);
            }
            Object obj2 = this.f10075c;
            if (obj2 != null) {
                C3584e.this.mo2933a(obj2, this.f10076d, null);
            }
            Object obj3 = this.f10077e;
            if (obj3 != null) {
                C3584e.this.mo2933a(obj3, this.f10078f, null);
            }
        }

        /* renamed from: e */
        public void mo11308e(C3607m mVar) {
            mVar.mo11366b((C3613f) this);
        }
    }

    /* renamed from: f.v.e$d */
    class C3588d extends C3612e {
        C3588d(C3584e eVar, Rect rect) {
        }
    }

    /* renamed from: a */
    private static boolean m14590a(C3607m mVar) {
        return !C0483v.m2623a(mVar.mo11383o()) || !C0483v.m2623a(mVar.mo11384p()) || !C0483v.m2623a(mVar.mo11385q());
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo2925a(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            f.v.m r2 = (p071f.p139v.C3607m) r2
            f.v.m r3 = (p071f.p139v.C3607m) r3
            f.v.m r4 = (p071f.p139v.C3607m) r4
            if (r2 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            f.v.q r0 = new f.v.q
            r0.<init>()
            r0.mo11400a(r2)
            r0.mo11400a(r3)
            r2 = 1
            r0.mo11401b(r2)
            r2 = r0
            goto L_0x0023
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r4 == 0) goto L_0x0033
            f.v.q r3 = new f.v.q
            r3.<init>()
            if (r2 == 0) goto L_0x002f
            r3.mo11400a(r2)
        L_0x002f:
            r3.mo11400a(r4)
            return r3
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p139v.C3584e.mo2925a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: a */
    public void mo2926a(ViewGroup viewGroup, Object obj) {
        C3616o.m14726a(viewGroup, (C3607m) obj);
    }

    /* renamed from: a */
    public void mo2928a(Object obj, Rect rect) {
        if (obj != null) {
            ((C3607m) obj).mo11362a((C3612e) new C3588d(this, rect));
        }
    }

    /* renamed from: a */
    public void mo2929a(Object obj, View view) {
        if (obj != null) {
            ((C3607m) obj).mo11353a(view);
        }
    }

    /* renamed from: a */
    public void mo2930a(Object obj, View view, ArrayList<View> arrayList) {
        ((C3607m) obj).mo11354a((C3613f) new C3586b(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo2931a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        C3607m mVar = (C3607m) obj;
        C3587c cVar = new C3587c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        mVar.mo11354a((C3613f) cVar);
    }

    /* renamed from: a */
    public void mo2932a(Object obj, ArrayList<View> arrayList) {
        C3607m mVar = (C3607m) obj;
        if (mVar != null) {
            int i = 0;
            if (mVar instanceof C3620q) {
                C3620q qVar = (C3620q) mVar;
                int v = qVar.mo11402v();
                while (i < v) {
                    mo2932a((Object) qVar.mo11399a(i), arrayList);
                    i++;
                }
            } else if (!m14590a(mVar) && C0483v.m2623a(mVar.mo11386r())) {
                int size = arrayList.size();
                while (i < size) {
                    mVar.mo11353a((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2933a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C3607m mVar = (C3607m) obj;
        int i = 0;
        if (mVar instanceof C3620q) {
            C3620q qVar = (C3620q) mVar;
            int v = qVar.mo11402v();
            while (i < v) {
                mo2933a((Object) qVar.mo11399a(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m14590a(mVar)) {
            List r = mVar.mo11386r();
            if (r.size() == arrayList.size() && r.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    mVar.mo11353a((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    mVar.mo11376d((View) arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo2934a(Object obj) {
        return obj instanceof C3607m;
    }

    /* renamed from: b */
    public Object mo2935b(Object obj) {
        if (obj != null) {
            return ((C3607m) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo2936b(Object obj, Object obj2, Object obj3) {
        C3620q qVar = new C3620q();
        if (obj != null) {
            qVar.mo11400a((C3607m) obj);
        }
        if (obj2 != null) {
            qVar.mo11400a((C3607m) obj2);
        }
        if (obj3 != null) {
            qVar.mo11400a((C3607m) obj3);
        }
        return qVar;
    }

    /* renamed from: b */
    public void mo2937b(Object obj, View view) {
        if (obj != null) {
            ((C3607m) obj).mo11376d(view);
        }
    }

    /* renamed from: b */
    public void mo2938b(Object obj, View view, ArrayList<View> arrayList) {
        C3620q qVar = (C3620q) obj;
        List r = qVar.mo11386r();
        r.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0483v.m2622a(r, (View) arrayList.get(i));
        }
        r.add(view);
        arrayList.add(view);
        mo2932a((Object) qVar, arrayList);
    }

    /* renamed from: b */
    public void mo2939b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        C3620q qVar = (C3620q) obj;
        if (qVar != null) {
            qVar.mo11386r().clear();
            qVar.mo11386r().addAll(arrayList2);
            mo2933a((Object) qVar, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo2940c(Object obj) {
        if (obj == null) {
            return null;
        }
        C3620q qVar = new C3620q();
        qVar.mo11400a((C3607m) obj);
        return qVar;
    }

    /* renamed from: c */
    public void mo2941c(Object obj, View view) {
        if (view != null) {
            C3607m mVar = (C3607m) obj;
            Rect rect = new Rect();
            mo2960a(view, rect);
            mVar.mo11362a((C3612e) new C3585a(this, rect));
        }
    }
}
