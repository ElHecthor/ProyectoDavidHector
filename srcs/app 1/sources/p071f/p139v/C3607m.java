package p071f.p139v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071f.p088e.C3162a;
import p071f.p088e.C3167d;
import p071f.p088e.C3175g;
import p071f.p097h.p108m.C3379v;

/* renamed from: f.v.m */
public abstract class C3607m implements Cloneable {

    /* renamed from: L */
    private static final int[] f10117L = {2, 1, 3, 4};

    /* renamed from: M */
    private static final C3592g f10118M = new C3608a();

    /* renamed from: N */
    private static ThreadLocal<C3162a<Animator, C3611d>> f10119N = new ThreadLocal<>();

    /* renamed from: A */
    boolean f10120A = false;

    /* renamed from: B */
    ArrayList<Animator> f10121B = new ArrayList<>();

    /* renamed from: C */
    private int f10122C = 0;

    /* renamed from: D */
    private boolean f10123D = false;

    /* renamed from: E */
    private boolean f10124E = false;

    /* renamed from: F */
    private ArrayList<C3613f> f10125F = null;

    /* renamed from: G */
    private ArrayList<Animator> f10126G = new ArrayList<>();

    /* renamed from: H */
    C3619p f10127H;

    /* renamed from: I */
    private C3612e f10128I;

    /* renamed from: J */
    private C3162a<String, String> f10129J;

    /* renamed from: K */
    private C3592g f10130K = f10118M;

    /* renamed from: f */
    private String f10131f = getClass().getName();

    /* renamed from: g */
    private long f10132g = -1;

    /* renamed from: h */
    long f10133h = -1;

    /* renamed from: i */
    private TimeInterpolator f10134i = null;

    /* renamed from: j */
    ArrayList<Integer> f10135j = new ArrayList<>();

    /* renamed from: k */
    ArrayList<View> f10136k = new ArrayList<>();

    /* renamed from: l */
    private ArrayList<String> f10137l = null;

    /* renamed from: m */
    private ArrayList<Class<?>> f10138m = null;

    /* renamed from: n */
    private ArrayList<Integer> f10139n = null;

    /* renamed from: o */
    private ArrayList<View> f10140o = null;

    /* renamed from: p */
    private ArrayList<Class<?>> f10141p = null;

    /* renamed from: q */
    private ArrayList<String> f10142q = null;

    /* renamed from: r */
    private ArrayList<Integer> f10143r = null;

    /* renamed from: s */
    private ArrayList<View> f10144s = null;

    /* renamed from: t */
    private ArrayList<Class<?>> f10145t = null;

    /* renamed from: u */
    private C3625t f10146u = new C3625t();

    /* renamed from: v */
    private C3625t f10147v = new C3625t();

    /* renamed from: w */
    C3620q f10148w = null;

    /* renamed from: x */
    private int[] f10149x = f10117L;

    /* renamed from: y */
    private ArrayList<C3624s> f10150y;

    /* renamed from: z */
    private ArrayList<C3624s> f10151z;

    /* renamed from: f.v.m$a */
    static class C3608a extends C3592g {
        C3608a() {
        }

        /* renamed from: a */
        public Path mo11331a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: f.v.m$b */
    class C3609b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3162a f10152a;

        C3609b(C3162a aVar) {
            this.f10152a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f10152a.remove(animator);
            C3607m.this.f10121B.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            C3607m.this.f10121B.add(animator);
        }
    }

    /* renamed from: f.v.m$c */
    class C3610c extends AnimatorListenerAdapter {
        C3610c() {
        }

        public void onAnimationEnd(Animator animator) {
            C3607m.this.mo11368b();
            animator.removeListener(this);
        }
    }

    /* renamed from: f.v.m$d */
    private static class C3611d {

        /* renamed from: a */
        View f10155a;

        /* renamed from: b */
        String f10156b;

        /* renamed from: c */
        C3624s f10157c;

        /* renamed from: d */
        C3614m0 f10158d;

        /* renamed from: e */
        C3607m f10159e;

        C3611d(View view, String str, C3607m mVar, C3614m0 m0Var, C3624s sVar) {
            this.f10155a = view;
            this.f10156b = str;
            this.f10157c = sVar;
            this.f10158d = m0Var;
            this.f10159e = mVar;
        }
    }

    /* renamed from: f.v.m$e */
    public static abstract class C3612e {
    }

    /* renamed from: f.v.m$f */
    public interface C3613f {
        /* renamed from: a */
        void mo11327a(C3607m mVar);

        /* renamed from: b */
        void mo11305b(C3607m mVar);

        /* renamed from: c */
        void mo11306c(C3607m mVar);

        /* renamed from: d */
        void mo11307d(C3607m mVar);

        /* renamed from: e */
        void mo11308e(C3607m mVar);
    }

    /* renamed from: a */
    private void m14663a(Animator animator, C3162a<Animator, C3611d> aVar) {
        if (animator != null) {
            animator.addListener(new C3609b(aVar));
            mo11357a(animator);
        }
    }

    /* renamed from: a */
    private void m14664a(C3162a<View, C3624s> aVar, C3162a<View, C3624s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C3624s sVar = (C3624s) aVar.mo10274d(i);
            if (mo11370b(sVar.f10178b)) {
                this.f10150y.add(sVar);
                this.f10151z.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C3624s sVar2 = (C3624s) aVar2.mo10274d(i2);
            if (mo11370b(sVar2.f10178b)) {
                this.f10151z.add(sVar2);
                this.f10150y.add(null);
            }
        }
    }

    /* renamed from: a */
    private void m14665a(C3162a<View, C3624s> aVar, C3162a<View, C3624s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo11370b(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo11370b(view2)) {
                    C3624s sVar = (C3624s) aVar.get(view);
                    C3624s sVar2 = (C3624s) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f10150y.add(sVar);
                        this.f10151z.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m14666a(C3162a<View, C3624s> aVar, C3162a<View, C3624s> aVar2, C3162a<String, View> aVar3, C3162a<String, View> aVar4) {
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) aVar3.mo10274d(i);
            if (view != null && mo11370b(view)) {
                View view2 = (View) aVar4.get(aVar3.mo10271b(i));
                if (view2 != null && mo11370b(view2)) {
                    C3624s sVar = (C3624s) aVar.get(view);
                    C3624s sVar2 = (C3624s) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f10150y.add(sVar);
                        this.f10151z.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m14667a(C3162a<View, C3624s> aVar, C3162a<View, C3624s> aVar2, C3167d<View> dVar, C3167d<View> dVar2) {
        int d = dVar.mo10194d();
        for (int i = 0; i < d; i++) {
            View view = (View) dVar.mo10189c(i);
            if (view != null && mo11370b(view)) {
                View view2 = (View) dVar2.mo10190c(dVar.mo10182a(i));
                if (view2 != null && mo11370b(view2)) {
                    C3624s sVar = (C3624s) aVar.get(view);
                    C3624s sVar2 = (C3624s) aVar2.get(view2);
                    if (!(sVar == null || sVar2 == null)) {
                        this.f10150y.add(sVar);
                        this.f10151z.add(sVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m14668a(C3625t tVar, View view, C3624s sVar) {
        tVar.f10180a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f10181b.indexOfKey(id) >= 0) {
                tVar.f10181b.put(id, null);
            } else {
                tVar.f10181b.put(id, view);
            }
        }
        String v = C3379v.m13835v(view);
        if (v != null) {
            if (tVar.f10183d.containsKey(v)) {
                tVar.f10183d.put(v, null);
            } else {
                tVar.f10183d.put(v, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f10182c.mo10195d(itemIdAtPosition) >= 0) {
                    View view2 = (View) tVar.f10182c.mo10190c(itemIdAtPosition);
                    if (view2 != null) {
                        C3379v.m13804b(view2, false);
                        tVar.f10182c.mo10191c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C3379v.m13804b(view, true);
                tVar.f10182c.mo10191c(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: a */
    private void m14669a(C3625t tVar, C3625t tVar2) {
        C3162a aVar = new C3162a((C3175g) tVar.f10180a);
        C3162a aVar2 = new C3162a((C3175g) tVar2.f10180a);
        int i = 0;
        while (true) {
            int[] iArr = this.f10149x;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m14671b(aVar, aVar2);
                } else if (i2 == 2) {
                    m14666a(aVar, aVar2, tVar.f10183d, tVar2.f10183d);
                } else if (i2 == 3) {
                    m14665a(aVar, aVar2, tVar.f10181b, tVar2.f10181b);
                } else if (i2 == 4) {
                    m14667a(aVar, aVar2, tVar.f10182c, tVar2.f10182c);
                }
                i++;
            } else {
                m14664a(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: a */
    private static boolean m14670a(C3624s sVar, C3624s sVar2, String str) {
        Object obj = sVar.f10177a.get(str);
        Object obj2 = sVar2.f10177a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* renamed from: b */
    private void m14671b(C3162a<View, C3624s> aVar, C3162a<View, C3624s> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo10271b(size);
            if (view != null && mo11370b(view)) {
                C3624s sVar = (C3624s) aVar2.remove(view);
                if (sVar != null && mo11370b(sVar.f10178b)) {
                    this.f10150y.add((C3624s) aVar.mo5347c(size));
                    this.f10151z.add(sVar);
                }
            }
        }
    }

    /* renamed from: c */
    private void m14672c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f10139n;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f10140o;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class<?>> arrayList3 = this.f10141p;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f10141p.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C3624s sVar = new C3624s(view);
                        if (z) {
                            mo9001c(sVar);
                        } else {
                            mo9000a(sVar);
                        }
                        sVar.f10179c.add(this);
                        mo11369b(sVar);
                        m14668a(z ? this.f10146u : this.f10147v, view, sVar);
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f10143r;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f10144s;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class<?>> arrayList6 = this.f10145t;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f10145t.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m14672c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: v */
    private static C3162a<Animator, C3611d> mo11402v() {
        C3162a<Animator, C3611d> aVar = (C3162a) f10119N.get();
        if (aVar != null) {
            return aVar;
        }
        C3162a<Animator, C3611d> aVar2 = new C3162a<>();
        f10119N.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo8999a(ViewGroup viewGroup, C3624s sVar, C3624s sVar2) {
        return null;
    }

    /* renamed from: a */
    public C3607m mo11351a(long j) {
        this.f10133h = j;
        return this;
    }

    /* renamed from: a */
    public C3607m mo11352a(TimeInterpolator timeInterpolator) {
        this.f10134i = timeInterpolator;
        return this;
    }

    /* renamed from: a */
    public C3607m mo11353a(View view) {
        this.f10136k.add(view);
        return this;
    }

    /* renamed from: a */
    public C3607m mo11354a(C3613f fVar) {
        if (this.f10125F == null) {
            this.f10125F = new ArrayList<>();
        }
        this.f10125F.add(fVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3624s mo11355a(View view, boolean z) {
        C3620q qVar = this.f10148w;
        if (qVar != null) {
            return qVar.mo11355a(view, z);
        }
        ArrayList<C3624s> arrayList = z ? this.f10150y : this.f10151z;
        C3624s sVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C3624s sVar2 = (C3624s) arrayList.get(i2);
            if (sVar2 == null) {
                return null;
            }
            if (sVar2.f10178b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            sVar = (C3624s) (z ? this.f10151z : this.f10150y).get(i);
        }
        return sVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo11356a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.f10133h != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f10133h);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.f10132g != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f10132g);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.f10134i != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f10134i);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.f10135j.size() <= 0 && this.f10136k.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.f10135j.size() > 0) {
            for (int i = 0; i < this.f10135j.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(sb7);
                    sb8.append(str3);
                    sb7 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(sb7);
                sb9.append(this.f10135j.get(i));
                sb7 = sb9.toString();
            }
        }
        if (this.f10136k.size() > 0) {
            for (int i2 = 0; i2 < this.f10136k.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f10136k.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11357a(Animator animator) {
        if (animator == null) {
            mo11368b();
            return;
        }
        if (mo11371c() >= 0) {
            animator.setDuration(mo11371c());
        }
        if (mo11382n() >= 0) {
            animator.setStartDelay(mo11382n() + animator.getStartDelay());
        }
        if (mo11377e() != null) {
            animator.setInterpolator(mo11377e());
        }
        animator.addListener(new C3610c());
        animator.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11358a(ViewGroup viewGroup) {
        this.f10150y = new ArrayList<>();
        this.f10151z = new ArrayList<>();
        m14669a(this.f10146u, this.f10147v);
        C3162a v = mo11402v();
        int size = v.size();
        C3614m0 d = C3577c0.m14574d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) v.mo10271b(i);
            if (animator != null) {
                C3611d dVar = (C3611d) v.get(animator);
                if (!(dVar == null || dVar.f10155a == null || !d.equals(dVar.f10158d))) {
                    C3624s sVar = dVar.f10157c;
                    View view = dVar.f10155a;
                    C3624s b = mo11367b(view, true);
                    C3624s a = mo11355a(view, true);
                    if (b == null && a == null) {
                        a = (C3624s) this.f10147v.f10180a.get(view);
                    }
                    if (!(b == null && a == null) && dVar.f10159e.mo11338a(sVar, a)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            v.remove(animator);
                        }
                    }
                }
            }
        }
        mo11359a(viewGroup, this.f10146u, this.f10147v, this.f10150y, this.f10151z);
        mo11387t();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11359a(ViewGroup viewGroup, C3625t tVar, C3625t tVar2, ArrayList<C3624s> arrayList, ArrayList<C3624s> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C3624s sVar;
        C3624s sVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C3162a v = mo11402v();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C3624s sVar3 = (C3624s) arrayList.get(i3);
            C3624s sVar4 = (C3624s) arrayList2.get(i3);
            if (sVar3 != null && !sVar3.f10179c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f10179c.contains(this)) {
                sVar4 = null;
            }
            if (!(sVar3 == null && sVar4 == null)) {
                if (sVar3 == null || sVar4 == null || mo11338a(sVar3, sVar4)) {
                    Animator a = mo8999a(viewGroup2, sVar3, sVar4);
                    if (a != null) {
                        if (sVar4 != null) {
                            view = sVar4.f10178b;
                            String[] s = mo11277s();
                            if (s != null && s.length > 0) {
                                sVar2 = new C3624s(view);
                                Animator animator3 = a;
                                i2 = size;
                                C3624s sVar5 = (C3624s) tVar2.f10180a.get(view);
                                if (sVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < s.length) {
                                        int i5 = i3;
                                        C3624s sVar6 = sVar5;
                                        sVar2.f10177a.put(s[i4], sVar5.f10177a.get(s[i4]));
                                        i4++;
                                        ArrayList<C3624s> arrayList3 = arrayList2;
                                        i3 = i5;
                                        sVar5 = sVar6;
                                    }
                                }
                                i = i3;
                                int size2 = v.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C3611d dVar = (C3611d) v.get((Animator) v.mo10271b(i6));
                                    if (dVar.f10157c != null && dVar.f10155a == view && dVar.f10156b.equals(mo11379j()) && dVar.f10157c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i2 = size;
                                i = i3;
                                animator2 = a;
                                sVar2 = null;
                            }
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            Animator animator4 = a;
                            i2 = size;
                            i = i3;
                            view = sVar3.f10178b;
                            animator = animator4;
                            sVar = null;
                        }
                        if (animator != null) {
                            C3619p pVar = this.f10127H;
                            if (pVar != null) {
                                long a2 = pVar.mo11396a(viewGroup2, this, sVar3, sVar4);
                                sparseIntArray.put(this.f10126G.size(), (int) a2);
                                j = Math.min(a2, j);
                            }
                            long j2 = j;
                            C3611d dVar2 = new C3611d(view, mo11379j(), this, C3577c0.m14574d(viewGroup), sVar);
                            v.put(animator, dVar2);
                            this.f10126G.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (sparseIntArray.size() != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator5 = (Animator) this.f10126G.get(sparseIntArray.keyAt(i7));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11360a(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            r5.mo11364a(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.f10135j
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0014
            java.util.ArrayList<android.view.View> r0 = r5.f10136k
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0029
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r5.f10137l
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            java.util.ArrayList<java.lang.Class<?>> r0 = r5.f10138m
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r5.m14672c(r6, r7)
            goto L_0x00a0
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.f10135j
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x006c
            java.util.ArrayList<java.lang.Integer> r2 = r5.f10135j
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x0069
            f.v.s r3 = new f.v.s
            r3.<init>(r2)
            if (r7 == 0) goto L_0x0054
            r5.mo9001c(r3)
            goto L_0x0057
        L_0x0054:
            r5.mo9000a(r3)
        L_0x0057:
            java.util.ArrayList<f.v.m> r4 = r3.f10179c
            r4.add(r5)
            r5.mo11369b(r3)
            if (r7 == 0) goto L_0x0064
            f.v.t r4 = r5.f10146u
            goto L_0x0066
        L_0x0064:
            f.v.t r4 = r5.f10147v
        L_0x0066:
            m14668a(r4, r2, r3)
        L_0x0069:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x006c:
            r6 = 0
        L_0x006d:
            java.util.ArrayList<android.view.View> r0 = r5.f10136k
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00a0
            java.util.ArrayList<android.view.View> r0 = r5.f10136k
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            f.v.s r2 = new f.v.s
            r2.<init>(r0)
            if (r7 == 0) goto L_0x0088
            r5.mo9001c(r2)
            goto L_0x008b
        L_0x0088:
            r5.mo9000a(r2)
        L_0x008b:
            java.util.ArrayList<f.v.m> r3 = r2.f10179c
            r3.add(r5)
            r5.mo11369b(r2)
            if (r7 == 0) goto L_0x0098
            f.v.t r3 = r5.f10146u
            goto L_0x009a
        L_0x0098:
            f.v.t r3 = r5.f10147v
        L_0x009a:
            m14668a(r3, r0, r2)
            int r6 = r6 + 1
            goto L_0x006d
        L_0x00a0:
            if (r7 != 0) goto L_0x00e4
            f.e.a<java.lang.String, java.lang.String> r6 = r5.f10129J
            if (r6 == 0) goto L_0x00e4
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        L_0x00b0:
            if (r0 >= r6) goto L_0x00c8
            f.e.a<java.lang.String, java.lang.String> r2 = r5.f10129J
            java.lang.Object r2 = r2.mo10271b(r0)
            java.lang.String r2 = (java.lang.String) r2
            f.v.t r3 = r5.f10146u
            f.e.a<java.lang.String, android.view.View> r3 = r3.f10183d
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto L_0x00b0
        L_0x00c8:
            if (r1 >= r6) goto L_0x00e4
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00e1
            f.e.a<java.lang.String, java.lang.String> r2 = r5.f10129J
            java.lang.Object r2 = r2.mo10274d(r1)
            java.lang.String r2 = (java.lang.String) r2
            f.v.t r3 = r5.f10146u
            f.e.a<java.lang.String, android.view.View> r3 = r3.f10183d
            r3.put(r2, r0)
        L_0x00e1:
            int r1 = r1 + 1
            goto L_0x00c8
        L_0x00e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p139v.C3607m.mo11360a(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: a */
    public void mo11361a(C3592g gVar) {
        if (gVar == null) {
            gVar = f10118M;
        }
        this.f10130K = gVar;
    }

    /* renamed from: a */
    public void mo11362a(C3612e eVar) {
        this.f10128I = eVar;
    }

    /* renamed from: a */
    public void mo11363a(C3619p pVar) {
        this.f10127H = pVar;
    }

    /* renamed from: a */
    public abstract void mo9000a(C3624s sVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11364a(boolean z) {
        C3625t tVar;
        if (z) {
            this.f10146u.f10180a.clear();
            this.f10146u.f10181b.clear();
            tVar = this.f10146u;
        } else {
            this.f10147v.f10180a.clear();
            this.f10147v.f10181b.clear();
            tVar = this.f10147v;
        }
        tVar.f10182c.mo10186b();
    }

    /* renamed from: a */
    public boolean mo11338a(C3624s sVar, C3624s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] s = mo11277s();
        if (s != null) {
            int length = s.length;
            int i = 0;
            while (i < length) {
                if (!m14670a(sVar, sVar2, s[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : sVar.f10177a.keySet()) {
            if (m14670a(sVar, sVar2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: b */
    public C3607m mo11365b(long j) {
        this.f10132g = j;
        return this;
    }

    /* renamed from: b */
    public C3607m mo11366b(C3613f fVar) {
        ArrayList<C3613f> arrayList = this.f10125F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f10125F.size() == 0) {
            this.f10125F = null;
        }
        return this;
    }

    /* renamed from: b */
    public C3624s mo11367b(View view, boolean z) {
        C3620q qVar = this.f10148w;
        if (qVar != null) {
            return qVar.mo11367b(view, z);
        }
        return (C3624s) (z ? this.f10146u : this.f10147v).f10180a.get(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11368b() {
        int i = this.f10122C - 1;
        this.f10122C = i;
        if (i == 0) {
            ArrayList<C3613f> arrayList = this.f10125F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10125F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((C3613f) arrayList2.get(i2)).mo11308e(this);
                }
            }
            for (int i3 = 0; i3 < this.f10146u.f10182c.mo10194d(); i3++) {
                View view = (View) this.f10146u.f10182c.mo10189c(i3);
                if (view != null) {
                    C3379v.m13804b(view, false);
                }
            }
            for (int i4 = 0; i4 < this.f10147v.f10182c.mo10194d(); i4++) {
                View view2 = (View) this.f10147v.f10182c.mo10189c(i4);
                if (view2 != null) {
                    C3379v.m13804b(view2, false);
                }
            }
            this.f10124E = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11369b(C3624s sVar) {
        if (this.f10127H != null && !sVar.f10177a.isEmpty()) {
            String[] a = this.f10127H.mo11398a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!sVar.f10177a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f10127H.mo11397a(sVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo11370b(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f10139n;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.f10140o;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList3 = this.f10141p;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f10141p.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f10142q != null && C3379v.m13835v(view) != null && this.f10142q.contains(C3379v.m13835v(view))) {
            return false;
        }
        if (this.f10135j.size() == 0 && this.f10136k.size() == 0) {
            ArrayList<Class<?>> arrayList4 = this.f10138m;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.f10137l;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.f10135j.contains(Integer.valueOf(id)) || this.f10136k.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f10137l;
        if (arrayList6 != null && arrayList6.contains(C3379v.m13835v(view))) {
            return true;
        }
        if (this.f10138m != null) {
            for (int i2 = 0; i2 < this.f10138m.size(); i2++) {
                if (((Class) this.f10138m.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public long mo11371c() {
        return this.f10133h;
    }

    /* renamed from: c */
    public void mo11372c(View view) {
        if (!this.f10124E) {
            C3162a v = mo11402v();
            int size = v.size();
            C3614m0 d = C3577c0.m14574d(view);
            for (int i = size - 1; i >= 0; i--) {
                C3611d dVar = (C3611d) v.mo10274d(i);
                if (dVar.f10155a != null && d.equals(dVar.f10158d)) {
                    C3560a.m14533a((Animator) v.mo10271b(i));
                }
            }
            ArrayList<C3613f> arrayList = this.f10125F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10125F.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((C3613f) arrayList2.get(i2)).mo11306c(this);
                }
            }
            this.f10123D = true;
        }
    }

    /* renamed from: c */
    public abstract void mo9001c(C3624s sVar);

    /* access modifiers changed from: protected */
    public void cancel() {
        for (int size = this.f10121B.size() - 1; size >= 0; size--) {
            ((Animator) this.f10121B.get(size)).cancel();
        }
        ArrayList<C3613f> arrayList = this.f10125F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f10125F.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((C3613f) arrayList2.get(i)).mo11305b(this);
            }
        }
    }

    public C3607m clone() {
        try {
            C3607m mVar = (C3607m) super.clone();
            mVar.f10126G = new ArrayList<>();
            mVar.f10146u = new C3625t();
            mVar.f10147v = new C3625t();
            mVar.f10150y = null;
            mVar.f10151z = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C3612e mo11375d() {
        return this.f10128I;
    }

    /* renamed from: d */
    public C3607m mo11376d(View view) {
        this.f10136k.remove(view);
        return this;
    }

    /* renamed from: e */
    public TimeInterpolator mo11377e() {
        return this.f10134i;
    }

    /* renamed from: e */
    public void mo11378e(View view) {
        if (this.f10123D) {
            if (!this.f10124E) {
                C3162a v = mo11402v();
                int size = v.size();
                C3614m0 d = C3577c0.m14574d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C3611d dVar = (C3611d) v.mo10274d(i);
                    if (dVar.f10155a != null && d.equals(dVar.f10158d)) {
                        C3560a.m14535b((Animator) v.mo10271b(i));
                    }
                }
                ArrayList<C3613f> arrayList = this.f10125F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f10125F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((C3613f) arrayList2.get(i2)).mo11307d(this);
                    }
                }
            }
            this.f10123D = false;
        }
    }

    /* renamed from: j */
    public String mo11379j() {
        return this.f10131f;
    }

    /* renamed from: k */
    public C3592g mo11380k() {
        return this.f10130K;
    }

    /* renamed from: l */
    public C3619p mo11381l() {
        return this.f10127H;
    }

    /* renamed from: n */
    public long mo11382n() {
        return this.f10132g;
    }

    /* renamed from: o */
    public List<Integer> mo11383o() {
        return this.f10135j;
    }

    /* renamed from: p */
    public List<String> mo11384p() {
        return this.f10137l;
    }

    /* renamed from: q */
    public List<Class<?>> mo11385q() {
        return this.f10138m;
    }

    /* renamed from: r */
    public List<View> mo11386r() {
        return this.f10136k;
    }

    /* renamed from: s */
    public String[] mo11277s() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo11387t() {
        mo11389u();
        C3162a v = mo11402v();
        Iterator it = this.f10126G.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (v.containsKey(animator)) {
                mo11389u();
                m14663a(animator, v);
            }
        }
        this.f10126G.clear();
        mo11368b();
    }

    public String toString() {
        return mo11356a("");
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo11389u() {
        if (this.f10122C == 0) {
            ArrayList<C3613f> arrayList = this.f10125F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f10125F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((C3613f) arrayList2.get(i)).mo11327a(this);
                }
            }
            this.f10124E = false;
        }
        this.f10122C++;
    }
}
