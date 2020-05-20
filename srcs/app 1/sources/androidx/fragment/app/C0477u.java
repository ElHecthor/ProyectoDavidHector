package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p071f.p097h.p104i.C3277a;

/* renamed from: androidx.fragment.app.u */
class C0477u extends C0483v {

    /* renamed from: androidx.fragment.app.u$a */
    class C0478a extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2147a;

        C0478a(C0477u uVar, Rect rect) {
            this.f2147a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f2147a;
        }
    }

    /* renamed from: androidx.fragment.app.u$b */
    class C0479b implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f2148a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2149b;

        C0479b(C0477u uVar, View view, ArrayList arrayList) {
            this.f2148a = view;
            this.f2149b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f2148a.setVisibility(8);
            int size = this.f2149b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f2149b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }
    }

    /* renamed from: androidx.fragment.app.u$c */
    class C0480c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f2150a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f2151b;

        /* renamed from: c */
        final /* synthetic */ Object f2152c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f2153d;

        /* renamed from: e */
        final /* synthetic */ Object f2154e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f2155f;

        C0480c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f2150a = obj;
            this.f2151b = arrayList;
            this.f2152c = obj2;
            this.f2153d = arrayList2;
            this.f2154e = obj3;
            this.f2155f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f2150a;
            if (obj != null) {
                C0477u.this.mo2933a(obj, this.f2151b, null);
            }
            Object obj2 = this.f2152c;
            if (obj2 != null) {
                C0477u.this.mo2933a(obj2, this.f2153d, null);
            }
            Object obj3 = this.f2154e;
            if (obj3 != null) {
                C0477u.this.mo2933a(obj3, this.f2155f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.u$d */
    class C0481d implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f2157a;

        C0481d(C0477u uVar, Runnable runnable) {
            this.f2157a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f2157a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.u$e */
    class C0482e extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f2158a;

        C0482e(C0477u uVar, Rect rect) {
            this.f2158a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f2158a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f2158a;
        }
    }

    C0477u() {
    }

    /* renamed from: a */
    private static boolean m2603a(Transition transition) {
        return !C0483v.m2623a(transition.getTargetIds()) || !C0483v.m2623a(transition.getTargetNames()) || !C0483v.m2623a(transition.getTargetTypes());
    }

    /* renamed from: a */
    public Object mo2925a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo2926a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo2927a(Fragment fragment, Object obj, C3277a aVar, Runnable runnable) {
        ((Transition) obj).addListener(new C0481d(this, runnable));
    }

    /* renamed from: a */
    public void mo2928a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0482e(this, rect));
        }
    }

    /* renamed from: a */
    public void mo2929a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo2930a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0479b(this, view, arrayList));
    }

    /* renamed from: a */
    public void mo2931a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C0480c cVar = new C0480c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(cVar);
    }

    /* renamed from: a */
    public void mo2932a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo2932a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m2603a(transition) && C0483v.m2623a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2933a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo2933a((Object) transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m2603a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                int size = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size) {
                    transition.addTarget((View) arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.removeTarget((View) arrayList.get(size2));
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo2934a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo2935b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: b */
    public Object mo2936b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: b */
    public void mo2937b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: b */
    public void mo2938b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0483v.m2622a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo2932a((Object) transitionSet, arrayList);
    }

    /* renamed from: b */
    public void mo2939b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo2933a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: c */
    public Object mo2940c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: c */
    public void mo2941c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo2960a(view, rect);
            transition.setEpicenterCallback(new C0478a(this, rect));
        }
    }
}
