package androidx.coordinatorlayout.widget;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p071f.p088e.C3175g;
import p071f.p097h.p107l.C3318e;
import p071f.p097h.p107l.C3319f;

/* renamed from: androidx.coordinatorlayout.widget.a */
public final class C0340a<T> {

    /* renamed from: a */
    private final C3318e<ArrayList<T>> f1610a = new C3319f(10);

    /* renamed from: b */
    private final C3175g<T, ArrayList<T>> f1611b = new C3175g<>();

    /* renamed from: c */
    private final ArrayList<T> f1612c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f1613d = new HashSet<>();

    /* renamed from: a */
    private void m1760a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f1611b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m1760a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }

    /* renamed from: a */
    private void m1761a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f1610a.mo5388a(arrayList);
    }

    /* renamed from: c */
    private ArrayList<T> m1762c() {
        ArrayList<T> arrayList = (ArrayList) this.f1610a.mo5387a();
        return arrayList == null ? new ArrayList<>() : arrayList;
    }

    /* renamed from: a */
    public void mo2149a() {
        int size = this.f1611b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1611b.mo10274d(i);
            if (arrayList != null) {
                m1761a(arrayList);
            }
        }
        this.f1611b.clear();
    }

    /* renamed from: a */
    public void mo2150a(T t) {
        if (!this.f1611b.containsKey(t)) {
            this.f1611b.put(t, null);
        }
    }

    /* renamed from: a */
    public void mo2151a(T t, T t2) {
        if (!this.f1611b.containsKey(t) || !this.f1611b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f1611b.get(t);
        if (arrayList == null) {
            arrayList = m1762c();
            this.f1611b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: b */
    public ArrayList<T> mo2152b() {
        this.f1612c.clear();
        this.f1613d.clear();
        int size = this.f1611b.size();
        for (int i = 0; i < size; i++) {
            m1760a(this.f1611b.mo10271b(i), this.f1612c, this.f1613d);
        }
        return this.f1612c;
    }

    /* renamed from: b */
    public boolean mo2153b(T t) {
        return this.f1611b.containsKey(t);
    }

    /* renamed from: c */
    public List mo2154c(T t) {
        return (List) this.f1611b.get(t);
    }

    /* renamed from: d */
    public List<T> mo2155d(T t) {
        int size = this.f1611b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f1611b.mo10274d(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f1611b.mo10271b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public boolean mo2156e(T t) {
        int size = this.f1611b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f1611b.mo10274d(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }
}
