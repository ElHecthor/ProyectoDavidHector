package com.stfalcon.imageviewer.common.pager;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.stfalcon.imageviewer.common.pager.C3080a.C3083c;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import p071f.p144y.p145a.C3658a;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: com.stfalcon.imageviewer.common.pager.a */
public abstract class C3080a<VH extends C3083c> extends C3658a {

    /* renamed from: d */
    private static final String f8742d = C3080a.class.getSimpleName();

    /* renamed from: b */
    private final SparseArray<C3082b> f8743b = new SparseArray<>();

    /* renamed from: c */
    private SparseArray<Parcelable> f8744c = new SparseArray<>();

    /* renamed from: com.stfalcon.imageviewer.common.pager.a$a */
    public static final class C3081a {
        private C3081a() {
        }

        public /* synthetic */ C3081a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: com.stfalcon.imageviewer.common.pager.a$b */
    private static final class C3082b {

        /* renamed from: a */
        private final List<C3083c> f8745a = new ArrayList();

        /* renamed from: b */
        private final C3080a<?> f8746b;

        public C3082b(C3080a<?> aVar) {
            C5942k.m22327b(aVar, "adapter");
            this.f8746b = aVar;
        }

        /* renamed from: a */
        public final C3083c mo9897a(ViewGroup viewGroup, int i) {
            C5942k.m22327b(viewGroup, "parent");
            for (int i2 = 0; i2 < this.f8745a.size(); i2++) {
                C3083c cVar = (C3083c) this.f8745a.get(i2);
                if (!cVar.mo9905c()) {
                    return cVar;
                }
            }
            C3083c b = this.f8746b.mo9895b(viewGroup, i);
            this.f8745a.add(b);
            return b;
        }

        /* renamed from: a */
        public final List<C3083c> mo9898a() {
            return this.f8745a;
        }
    }

    /* renamed from: com.stfalcon.imageviewer.common.pager.a$c */
    public static abstract class C3083c {

        /* renamed from: d */
        private static final String f8747d = C3083c.class.getSimpleName();

        /* renamed from: a */
        private int f8748a;

        /* renamed from: b */
        private boolean f8749b;

        /* renamed from: c */
        private final View f8750c;

        /* renamed from: com.stfalcon.imageviewer.common.pager.a$c$a */
        public static final class C3084a {
            private C3084a() {
            }

            public /* synthetic */ C3084a(C5938g gVar) {
                this();
            }
        }

        static {
            new C3084a(null);
        }

        public C3083c(View view) {
            C5942k.m22327b(view, "itemView");
            this.f8750c = view;
        }

        /* renamed from: b */
        private final SparseArray<Parcelable> m12538b(Parcelable parcelable) {
            if (parcelable != null && (parcelable instanceof Bundle)) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.containsKey(f8747d)) {
                    return bundle.getSparseParcelableArray(f8747d);
                }
            }
            return null;
        }

        /* renamed from: a */
        public final View mo9899a() {
            return this.f8750c;
        }

        /* renamed from: a */
        public final void mo9900a(int i) {
            this.f8748a = i;
        }

        /* renamed from: a */
        public final void mo9901a(Parcelable parcelable) {
            SparseArray b = m12538b(parcelable);
            if (b != null) {
                this.f8750c.restoreHierarchyState(b);
            }
        }

        /* renamed from: a */
        public final void mo9902a(ViewGroup viewGroup) {
            C5942k.m22327b(viewGroup, "parent");
            viewGroup.removeView(this.f8750c);
            this.f8749b = false;
        }

        /* renamed from: a */
        public final void mo9903a(ViewGroup viewGroup, int i) {
            C5942k.m22327b(viewGroup, "parent");
            this.f8749b = true;
            this.f8748a = i;
            viewGroup.addView(this.f8750c);
        }

        /* renamed from: b */
        public final int mo9904b() {
            return this.f8748a;
        }

        /* renamed from: c */
        public final boolean mo9905c() {
            return this.f8749b;
        }

        /* renamed from: d */
        public final Parcelable mo9906d() {
            SparseArray sparseArray = new SparseArray();
            this.f8750c.saveHierarchyState(sparseArray);
            Bundle bundle = new Bundle();
            bundle.putSparseParcelableArray(f8747d, sparseArray);
            return bundle;
        }
    }

    static {
        new C3081a(null);
    }

    /* renamed from: c */
    private final int mo13714c(int i) {
        return i;
    }

    /* renamed from: d */
    private final List<C3083c> m12525d() {
        ArrayList arrayList = new ArrayList();
        SparseArray<C3082b> sparseArray = this.f8743b;
        int size = sparseArray.size();
        int i = 0;
        while (i < size) {
            if (size == sparseArray.size()) {
                sparseArray.keyAt(i);
                for (C3083c cVar : ((C3082b) sparseArray.valueAt(i)).mo9898a()) {
                    if (cVar.mo9905c()) {
                        arrayList.add(cVar);
                    }
                }
                i++;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public int mo9887a() {
        return mo9896c();
    }

    /* renamed from: a */
    public int mo9888a(Object obj) {
        C5942k.m22327b(obj, "item");
        return -2;
    }

    /* renamed from: a */
    public Object mo9889a(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C3082b bVar = (C3082b) this.f8743b.get(0);
        if (bVar == null) {
            bVar = new C3082b(this);
            this.f8743b.put(0, bVar);
        }
        C3083c a = bVar.mo9897a(viewGroup, 0);
        a.mo9903a(viewGroup, i);
        if (a != null) {
            mo9892a((VH) a, i);
            SparseArray<Parcelable> sparseArray = this.f8744c;
            mo13714c(i);
            a.mo9901a((Parcelable) sparseArray.get(i));
            return a;
        }
        throw new C5809q("null cannot be cast to non-null type VH");
    }

    /* renamed from: a */
    public void mo9890a(Parcelable parcelable, ClassLoader classLoader) {
        SparseArray<Parcelable> sparseArray;
        if (parcelable != null && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            if (bundle.containsKey(f8742d)) {
                sparseArray = bundle.getSparseParcelableArray(f8742d);
                C5942k.m22324a((Object) sparseArray, "state.getSparseParcelableArray(STATE)");
            } else {
                sparseArray = new SparseArray<>();
            }
            this.f8744c = sparseArray;
        }
        super.mo9890a(parcelable, classLoader);
    }

    /* renamed from: a */
    public void mo9891a(ViewGroup viewGroup, int i, Object obj) {
        C5942k.m22327b(viewGroup, "parent");
        C5942k.m22327b(obj, "item");
        if (obj instanceof C3083c) {
            ((C3083c) obj).mo9902a(viewGroup);
        }
    }

    /* renamed from: a */
    public abstract void mo9892a(VH vh, int i);

    /* renamed from: a */
    public boolean mo9893a(View view, Object obj) {
        C5942k.m22327b(view, "view");
        C5942k.m22327b(obj, "obj");
        return (obj instanceof C3083c) && ((C3083c) obj).mo9899a() == view;
    }

    /* renamed from: b */
    public Parcelable mo9894b() {
        for (C3083c cVar : m12525d()) {
            SparseArray<Parcelable> sparseArray = this.f8744c;
            int b = cVar.mo9904b();
            mo13714c(b);
            sparseArray.put(b, cVar.mo9906d());
        }
        Bundle bundle = new Bundle();
        bundle.putSparseParcelableArray(f8742d, this.f8744c);
        return bundle;
    }

    /* renamed from: b */
    public abstract VH mo9895b(ViewGroup viewGroup, int i);

    /* renamed from: c */
    public abstract int mo9896c();
}
