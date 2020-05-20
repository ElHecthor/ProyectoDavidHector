package p071f.p139v;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p071f.p088e.C3162a;
import p071f.p097h.p108m.C3379v;
import p071f.p139v.C3607m.C3613f;

/* renamed from: f.v.o */
public class C3616o {

    /* renamed from: a */
    private static C3607m f10160a = new C3563b();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C3162a<ViewGroup, ArrayList<C3607m>>>> f10161b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f10162c = new ArrayList<>();

    /* renamed from: f.v.o$a */
    private static class C3617a implements OnPreDrawListener, OnAttachStateChangeListener {

        /* renamed from: f */
        C3607m f10163f;

        /* renamed from: g */
        ViewGroup f10164g;

        /* renamed from: f.v.o$a$a */
        class C3618a extends C3615n {

            /* renamed from: a */
            final /* synthetic */ C3162a f10165a;

            C3618a(C3162a aVar) {
                this.f10165a = aVar;
            }

            /* renamed from: e */
            public void mo11308e(C3607m mVar) {
                ((ArrayList) this.f10165a.get(C3617a.this.f10164g)).remove(mVar);
                mVar.mo11366b((C3613f) this);
            }
        }

        C3617a(C3607m mVar, ViewGroup viewGroup) {
            this.f10163f = mVar;
            this.f10164g = viewGroup;
        }

        /* renamed from: a */
        private void m14729a() {
            this.f10164g.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f10164g.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m14729a();
            if (!C3616o.f10162c.remove(this.f10164g)) {
                return true;
            }
            C3162a a = C3616o.m14725a();
            ArrayList arrayList = (ArrayList) a.get(this.f10164g);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f10164g, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f10163f);
            this.f10163f.mo11354a((C3613f) new C3618a(a));
            this.f10163f.mo11360a(this.f10164g, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C3607m) it.next()).mo11378e(this.f10164g);
                }
            }
            this.f10163f.mo11358a(this.f10164g);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m14729a();
            C3616o.f10162c.remove(this.f10164g);
            ArrayList arrayList = (ArrayList) C3616o.m14725a().get(this.f10164g);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C3607m) it.next()).mo11378e(this.f10164g);
                }
            }
            this.f10163f.mo11364a(true);
        }
    }

    /* renamed from: a */
    static C3162a<ViewGroup, ArrayList<C3607m>> m14725a() {
        WeakReference weakReference = (WeakReference) f10161b.get();
        if (weakReference != null) {
            C3162a<ViewGroup, ArrayList<C3607m>> aVar = (C3162a) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        C3162a<ViewGroup, ArrayList<C3607m>> aVar2 = new C3162a<>();
        f10161b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public static void m14726a(ViewGroup viewGroup, C3607m mVar) {
        if (!f10162c.contains(viewGroup) && C3379v.m13768D(viewGroup)) {
            f10162c.add(viewGroup);
            if (mVar == null) {
                mVar = f10160a;
            }
            C3607m clone = mVar.clone();
            m14728c(viewGroup, clone);
            C3605l.m14661a(viewGroup, null);
            m14727b(viewGroup, clone);
        }
    }

    /* renamed from: b */
    private static void m14727b(ViewGroup viewGroup, C3607m mVar) {
        if (mVar != null && viewGroup != null) {
            C3617a aVar = new C3617a(mVar, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m14728c(ViewGroup viewGroup, C3607m mVar) {
        ArrayList arrayList = (ArrayList) m14725a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C3607m) it.next()).mo11372c((View) viewGroup);
            }
        }
        if (mVar != null) {
            mVar.mo11360a(viewGroup, true);
        }
        C3605l a = C3605l.m14660a(viewGroup);
        if (a != null) {
            a.mo11348a();
        }
    }
}
