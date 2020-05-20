package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.recyclerview.widget.g */
public class C0625g extends C0670v {

    /* renamed from: s */
    private static TimeInterpolator f2553s;

    /* renamed from: h */
    private ArrayList<C0566d0> f2554h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C0566d0> f2555i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C0635j> f2556j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C0634i> f2557k = new ArrayList<>();

    /* renamed from: l */
    ArrayList<ArrayList<C0566d0>> f2558l = new ArrayList<>();

    /* renamed from: m */
    ArrayList<ArrayList<C0635j>> f2559m = new ArrayList<>();

    /* renamed from: n */
    ArrayList<ArrayList<C0634i>> f2560n = new ArrayList<>();

    /* renamed from: o */
    ArrayList<C0566d0> f2561o = new ArrayList<>();

    /* renamed from: p */
    ArrayList<C0566d0> f2562p = new ArrayList<>();

    /* renamed from: q */
    ArrayList<C0566d0> f2563q = new ArrayList<>();

    /* renamed from: r */
    ArrayList<C0566d0> f2564r = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.g$a */
    class C0626a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2565f;

        C0626a(ArrayList arrayList) {
            this.f2565f = arrayList;
        }

        public void run() {
            Iterator it = this.f2565f.iterator();
            while (it.hasNext()) {
                C0635j jVar = (C0635j) it.next();
                C0625g.this.mo3863b(jVar.f2599a, jVar.f2600b, jVar.f2601c, jVar.f2602d, jVar.f2603e);
            }
            this.f2565f.clear();
            C0625g.this.f2559m.remove(this.f2565f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    class C0627b implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2567f;

        C0627b(ArrayList arrayList) {
            this.f2567f = arrayList;
        }

        public void run() {
            Iterator it = this.f2567f.iterator();
            while (it.hasNext()) {
                C0625g.this.mo3859a((C0634i) it.next());
            }
            this.f2567f.clear();
            C0625g.this.f2560n.remove(this.f2567f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    class C0628c implements Runnable {

        /* renamed from: f */
        final /* synthetic */ ArrayList f2569f;

        C0628c(ArrayList arrayList) {
            this.f2569f = arrayList;
        }

        public void run() {
            Iterator it = this.f2569f.iterator();
            while (it.hasNext()) {
                C0625g.this.mo3867t((C0566d0) it.next());
            }
            this.f2569f.clear();
            C0625g.this.f2558l.remove(this.f2569f);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    class C0629d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0566d0 f2571a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2572b;

        /* renamed from: c */
        final /* synthetic */ View f2573c;

        C0629d(C0566d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2571a = d0Var;
            this.f2572b = viewPropertyAnimator;
            this.f2573c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2572b.setListener(null);
            this.f2573c.setAlpha(1.0f);
            C0625g.this.mo3974l(this.f2571a);
            C0625g.this.f2563q.remove(this.f2571a);
            C0625g.this.mo3866j();
        }

        public void onAnimationStart(Animator animator) {
            C0625g.this.mo3975m(this.f2571a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    class C0630e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0566d0 f2575a;

        /* renamed from: b */
        final /* synthetic */ View f2576b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f2577c;

        C0630e(C0566d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2575a = d0Var;
            this.f2576b = view;
            this.f2577c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f2576b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f2577c.setListener(null);
            C0625g.this.mo3970h(this.f2575a);
            C0625g.this.f2561o.remove(this.f2575a);
            C0625g.this.mo3866j();
        }

        public void onAnimationStart(Animator animator) {
            C0625g.this.mo3971i(this.f2575a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    class C0631f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0566d0 f2579a;

        /* renamed from: b */
        final /* synthetic */ int f2580b;

        /* renamed from: c */
        final /* synthetic */ View f2581c;

        /* renamed from: d */
        final /* synthetic */ int f2582d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f2583e;

        C0631f(C0566d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2579a = d0Var;
            this.f2580b = i;
            this.f2581c = view;
            this.f2582d = i2;
            this.f2583e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f2580b != 0) {
                this.f2581c.setTranslationX(0.0f);
            }
            if (this.f2582d != 0) {
                this.f2581c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f2583e.setListener(null);
            C0625g.this.mo3972j(this.f2579a);
            C0625g.this.f2562p.remove(this.f2579a);
            C0625g.this.mo3866j();
        }

        public void onAnimationStart(Animator animator) {
            C0625g.this.mo3973k(this.f2579a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    class C0632g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0634i f2585a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2586b;

        /* renamed from: c */
        final /* synthetic */ View f2587c;

        C0632g(C0634i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2585a = iVar;
            this.f2586b = viewPropertyAnimator;
            this.f2587c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2586b.setListener(null);
            this.f2587c.setAlpha(1.0f);
            this.f2587c.setTranslationX(0.0f);
            this.f2587c.setTranslationY(0.0f);
            C0625g.this.mo3966a(this.f2585a.f2593a, true);
            C0625g.this.f2564r.remove(this.f2585a.f2593a);
            C0625g.this.mo3866j();
        }

        public void onAnimationStart(Animator animator) {
            C0625g.this.mo3967b(this.f2585a.f2593a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$h */
    class C0633h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C0634i f2589a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f2590b;

        /* renamed from: c */
        final /* synthetic */ View f2591c;

        C0633h(C0634i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2589a = iVar;
            this.f2590b = viewPropertyAnimator;
            this.f2591c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f2590b.setListener(null);
            this.f2591c.setAlpha(1.0f);
            this.f2591c.setTranslationX(0.0f);
            this.f2591c.setTranslationY(0.0f);
            C0625g.this.mo3966a(this.f2589a.f2594b, false);
            C0625g.this.f2564r.remove(this.f2589a.f2594b);
            C0625g.this.mo3866j();
        }

        public void onAnimationStart(Animator animator) {
            C0625g.this.mo3967b(this.f2589a.f2594b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$i */
    private static class C0634i {

        /* renamed from: a */
        public C0566d0 f2593a;

        /* renamed from: b */
        public C0566d0 f2594b;

        /* renamed from: c */
        public int f2595c;

        /* renamed from: d */
        public int f2596d;

        /* renamed from: e */
        public int f2597e;

        /* renamed from: f */
        public int f2598f;

        private C0634i(C0566d0 d0Var, C0566d0 d0Var2) {
            this.f2593a = d0Var;
            this.f2594b = d0Var2;
        }

        C0634i(C0566d0 d0Var, C0566d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f2595c = i;
            this.f2596d = i2;
            this.f2597e = i3;
            this.f2598f = i4;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f2593a);
            sb.append(", newHolder=");
            sb.append(this.f2594b);
            sb.append(", fromX=");
            sb.append(this.f2595c);
            sb.append(", fromY=");
            sb.append(this.f2596d);
            sb.append(", toX=");
            sb.append(this.f2597e);
            sb.append(", toY=");
            sb.append(this.f2598f);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$j */
    private static class C0635j {

        /* renamed from: a */
        public C0566d0 f2599a;

        /* renamed from: b */
        public int f2600b;

        /* renamed from: c */
        public int f2601c;

        /* renamed from: d */
        public int f2602d;

        /* renamed from: e */
        public int f2603e;

        C0635j(C0566d0 d0Var, int i, int i2, int i3, int i4) {
            this.f2599a = d0Var;
            this.f2600b = i;
            this.f2601c = i2;
            this.f2602d = i3;
            this.f2603e = i4;
        }
    }

    /* renamed from: a */
    private void m3601a(List<C0634i> list, C0566d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0634i iVar = (C0634i) list.get(size);
            if (m3602a(iVar, d0Var) && iVar.f2593a == null && iVar.f2594b == null) {
                list.remove(iVar);
            }
        }
    }

    /* renamed from: a */
    private boolean m3602a(C0634i iVar, C0566d0 d0Var) {
        boolean z = false;
        if (iVar.f2594b == d0Var) {
            iVar.f2594b = null;
        } else if (iVar.f2593a != d0Var) {
            return false;
        } else {
            iVar.f2593a = null;
            z = true;
        }
        d0Var.f2358a.setAlpha(1.0f);
        d0Var.f2358a.setTranslationX(0.0f);
        d0Var.f2358a.setTranslationY(0.0f);
        mo3966a(d0Var, z);
        return true;
    }

    /* renamed from: b */
    private void m3603b(C0634i iVar) {
        C0566d0 d0Var = iVar.f2593a;
        if (d0Var != null) {
            m3602a(iVar, d0Var);
        }
        C0566d0 d0Var2 = iVar.f2594b;
        if (d0Var2 != null) {
            m3602a(iVar, d0Var2);
        }
    }

    /* renamed from: u */
    private void m3604u(C0566d0 d0Var) {
        View view = d0Var.f2358a;
        ViewPropertyAnimator animate = view.animate();
        this.f2563q.add(d0Var);
        animate.setDuration(mo3517f()).alpha(0.0f).setListener(new C0629d(d0Var, animate, view)).start();
    }

    /* renamed from: v */
    private void m3605v(C0566d0 d0Var) {
        if (f2553s == null) {
            f2553s = new ValueAnimator().getInterpolator();
        }
        d0Var.f2358a.animate().setInterpolator(f2553s);
        mo3512c(d0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3859a(C0634i iVar) {
        C0566d0 d0Var = iVar.f2593a;
        View view = null;
        View view2 = d0Var == null ? null : d0Var.f2358a;
        C0566d0 d0Var2 = iVar.f2594b;
        if (d0Var2 != null) {
            view = d0Var2.f2358a;
        }
        if (view2 != null) {
            ViewPropertyAnimator duration = view2.animate().setDuration(mo3514d());
            this.f2564r.add(iVar.f2593a);
            duration.translationX((float) (iVar.f2597e - iVar.f2595c));
            duration.translationY((float) (iVar.f2598f - iVar.f2596d));
            duration.alpha(0.0f).setListener(new C0632g(iVar, duration, view2)).start();
        }
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            this.f2564r.add(iVar.f2594b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(mo3514d()).alpha(1.0f).setListener(new C0633h(iVar, animate, view)).start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3860a(List<C0566d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C0566d0) list.get(size)).f2358a.animate().cancel();
        }
    }

    /* renamed from: a */
    public boolean mo3861a(C0566d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f2358a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.f2358a.getTranslationY());
        m3605v(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            mo3972j(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C0635j> arrayList = this.f2556j;
        C0635j jVar = new C0635j(d0Var, translationX, translationY, i3, i4);
        arrayList.add(jVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo3862a(C0566d0 d0Var, C0566d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return mo3861a(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.f2358a.getTranslationX();
        float translationY = d0Var.f2358a.getTranslationY();
        float alpha = d0Var.f2358a.getAlpha();
        m3605v(d0Var);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        d0Var.f2358a.setTranslationX(translationX);
        d0Var.f2358a.setTranslationY(translationY);
        d0Var.f2358a.setAlpha(alpha);
        if (d0Var2 != null) {
            m3605v(d0Var2);
            d0Var2.f2358a.setTranslationX((float) (-i5));
            d0Var2.f2358a.setTranslationY((float) (-i6));
            d0Var2.f2358a.setAlpha(0.0f);
        }
        ArrayList<C0634i> arrayList = this.f2557k;
        C0634i iVar = new C0634i(d0Var, d0Var2, i, i2, i3, i4);
        arrayList.add(iVar);
        return true;
    }

    /* renamed from: a */
    public boolean mo3507a(C0566d0 d0Var, List<Object> list) {
        return !list.isEmpty() || super.mo3507a(d0Var, list);
    }

    /* renamed from: b */
    public void mo3508b() {
        int size = this.f2556j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C0635j jVar = (C0635j) this.f2556j.get(size);
            View view = jVar.f2599a.f2358a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            mo3972j(jVar.f2599a);
            this.f2556j.remove(size);
        }
        for (int size2 = this.f2554h.size() - 1; size2 >= 0; size2--) {
            mo3974l((C0566d0) this.f2554h.get(size2));
            this.f2554h.remove(size2);
        }
        int size3 = this.f2555i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C0566d0 d0Var = (C0566d0) this.f2555i.get(size3);
            d0Var.f2358a.setAlpha(1.0f);
            mo3970h(d0Var);
            this.f2555i.remove(size3);
        }
        for (int size4 = this.f2557k.size() - 1; size4 >= 0; size4--) {
            m3603b((C0634i) this.f2557k.get(size4));
        }
        this.f2557k.clear();
        if (mo3518g()) {
            for (int size5 = this.f2559m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f2559m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C0635j jVar2 = (C0635j) arrayList.get(size6);
                    View view2 = jVar2.f2599a.f2358a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    mo3972j(jVar2.f2599a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f2559m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f2558l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f2558l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C0566d0 d0Var2 = (C0566d0) arrayList2.get(size8);
                    d0Var2.f2358a.setAlpha(1.0f);
                    mo3970h(d0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f2558l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f2560n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f2560n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m3603b((C0634i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f2560n.remove(arrayList3);
                    }
                }
            }
            mo3860a((List<C0566d0>) this.f2563q);
            mo3860a((List<C0566d0>) this.f2562p);
            mo3860a((List<C0566d0>) this.f2561o);
            mo3860a((List<C0566d0>) this.f2564r);
            mo3502a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3863b(C0566d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.f2358a;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f2562p.add(d0Var);
        ViewPropertyAnimator duration = animate.setDuration(mo3516e());
        C0631f fVar = new C0631f(d0Var, i5, view, i6, animate);
        duration.setListener(fVar).start();
    }

    /* renamed from: c */
    public void mo3512c(C0566d0 d0Var) {
        View view = d0Var.f2358a;
        view.animate().cancel();
        int size = this.f2556j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C0635j) this.f2556j.get(size)).f2599a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                mo3972j(d0Var);
                this.f2556j.remove(size);
            }
        }
        m3601a((List<C0634i>) this.f2557k, d0Var);
        if (this.f2554h.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo3974l(d0Var);
        }
        if (this.f2555i.remove(d0Var)) {
            view.setAlpha(1.0f);
            mo3970h(d0Var);
        }
        for (int size2 = this.f2560n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f2560n.get(size2);
            m3601a((List<C0634i>) arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f2560n.remove(size2);
            }
        }
        for (int size3 = this.f2559m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f2559m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C0635j) arrayList2.get(size4)).f2599a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    mo3972j(d0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f2559m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f2558l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f2558l.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                mo3970h(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f2558l.remove(size5);
                }
            }
        }
        this.f2563q.remove(d0Var);
        this.f2561o.remove(d0Var);
        this.f2564r.remove(d0Var);
        this.f2562p.remove(d0Var);
        mo3866j();
    }

    /* renamed from: f */
    public boolean mo3864f(C0566d0 d0Var) {
        m3605v(d0Var);
        d0Var.f2358a.setAlpha(0.0f);
        this.f2555i.add(d0Var);
        return true;
    }

    /* renamed from: g */
    public boolean mo3518g() {
        return !this.f2555i.isEmpty() || !this.f2557k.isEmpty() || !this.f2556j.isEmpty() || !this.f2554h.isEmpty() || !this.f2562p.isEmpty() || !this.f2563q.isEmpty() || !this.f2561o.isEmpty() || !this.f2564r.isEmpty() || !this.f2559m.isEmpty() || !this.f2558l.isEmpty() || !this.f2560n.isEmpty();
    }

    /* renamed from: g */
    public boolean mo3865g(C0566d0 d0Var) {
        m3605v(d0Var);
        this.f2554h.add(d0Var);
        return true;
    }

    /* renamed from: i */
    public void mo3520i() {
        boolean z = !this.f2554h.isEmpty();
        boolean z2 = !this.f2556j.isEmpty();
        boolean z3 = !this.f2557k.isEmpty();
        boolean z4 = !this.f2555i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f2554h.iterator();
            while (it.hasNext()) {
                m3604u((C0566d0) it.next());
            }
            this.f2554h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f2556j);
                this.f2559m.add(arrayList);
                this.f2556j.clear();
                C0626a aVar = new C0626a(arrayList);
                if (z) {
                    C3379v.m13795a(((C0635j) arrayList.get(0)).f2599a.f2358a, (Runnable) aVar, mo3517f());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f2557k);
                this.f2560n.add(arrayList2);
                this.f2557k.clear();
                C0627b bVar = new C0627b(arrayList2);
                if (z) {
                    C3379v.m13795a(((C0634i) arrayList2.get(0)).f2593a.f2358a, (Runnable) bVar, mo3517f());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f2555i);
                this.f2558l.add(arrayList3);
                this.f2555i.clear();
                C0628c cVar = new C0628c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long f = z ? mo3517f() : 0;
                    long e = z2 ? mo3516e() : 0;
                    if (z3) {
                        j = mo3514d();
                    }
                    C3379v.m13795a(((C0566d0) arrayList3.get(0)).f2358a, (Runnable) cVar, f + Math.max(e, j));
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo3866j() {
        if (!mo3518g()) {
            mo3502a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public void mo3867t(C0566d0 d0Var) {
        View view = d0Var.f2358a;
        ViewPropertyAnimator animate = view.animate();
        this.f2561o.add(d0Var);
        animate.alpha(1.0f).setDuration(mo3511c()).setListener(new C0630e(d0Var, view, animate)).start();
    }
}
