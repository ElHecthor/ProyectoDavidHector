package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.fragment.app.r */
class C0465r {

    /* renamed from: a */
    private final ArrayList<Fragment> f2078a = new ArrayList<>();

    /* renamed from: b */
    private final HashMap<String, C0463q> f2079b = new HashMap<>();

    C0465r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2891a() {
        this.f2079b.values().removeAll(Collections.singleton(null));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2892a(int i) {
        Iterator it = this.f2078a.iterator();
        while (it.hasNext()) {
            C0463q qVar = (C0463q) this.f2079b.get(((Fragment) it.next()).f1887j);
            if (qVar != null) {
                qVar.mo2873a(i);
            }
        }
        for (C0463q qVar2 : this.f2079b.values()) {
            if (qVar2 != null) {
                qVar2.mo2873a(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2893a(Fragment fragment) {
        if (!this.f2078a.contains(fragment)) {
            synchronized (this.f2078a) {
                this.f2078a.add(fragment);
            }
            fragment.f1893p = true;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment already added: ");
        sb.append(fragment);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2894a(C0463q qVar) {
        this.f2079b.put(qVar.mo2882e().f1887j, qVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2895a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.f2079b.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments:");
            for (C0463q qVar : this.f2079b.values()) {
                printWriter.print(str);
                if (qVar != null) {
                    Fragment e = qVar.mo2882e();
                    printWriter.println(e);
                    e.mo2510a(sb2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2078a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f2078a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2896a(List<String> list) {
        this.f2078a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment b = mo2900b(str);
                if (b != null) {
                    if (C0445l.m2390d(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("restoreSaveState: added (");
                        sb.append(str);
                        sb.append("): ");
                        sb.append(b);
                        Log.v("FragmentManager", sb.toString());
                    }
                    mo2893a(b);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("No instantiated fragment for (");
                    sb2.append(str);
                    sb2.append(")");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2897a(String str) {
        return this.f2079b.containsKey(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo2898b(int i) {
        for (int size = this.f2078a.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f2078a.get(size);
            if (fragment != null && fragment.f1857A == i) {
                return fragment;
            }
        }
        for (C0463q qVar : this.f2079b.values()) {
            if (qVar != null) {
                Fragment e = qVar.mo2882e();
                if (e.f1857A == i) {
                    return e;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo2899b(Fragment fragment) {
        ViewGroup viewGroup = fragment.f1867K;
        View view = fragment.f1868L;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f2078a.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.f2078a.get(indexOf);
                if (fragment2.f1867K == viewGroup && fragment2.f1868L != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo2900b(String str) {
        C0463q qVar = (C0463q) this.f2079b.get(str);
        if (qVar != null) {
            return qVar.mo2882e();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public List<Fragment> mo2901b() {
        ArrayList arrayList = new ArrayList();
        for (C0463q qVar : this.f2079b.values()) {
            arrayList.add(qVar != null ? qVar.mo2882e() : null);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2902b(C0463q qVar) {
        Fragment e = qVar.mo2882e();
        for (C0463q qVar2 : this.f2079b.values()) {
            if (qVar2 != null) {
                Fragment e2 = qVar2.mo2882e();
                if (e.f1887j.equals(e2.f1890m)) {
                    e2.f1889l = e;
                    e2.f1890m = null;
                }
            }
        }
        this.f2079b.put(e.f1887j, null);
        String str = e.f1890m;
        if (str != null) {
            e.f1889l = mo2900b(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Fragment mo2903c(String str) {
        if (str != null) {
            for (int size = this.f2078a.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f2078a.get(size);
                if (fragment != null && str.equals(fragment.f1859C)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0463q qVar : this.f2079b.values()) {
                if (qVar != null) {
                    Fragment e = qVar.mo2882e();
                    if (str.equals(e.f1859C)) {
                        return e;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public List<Fragment> mo2904c() {
        ArrayList arrayList;
        if (this.f2078a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f2078a) {
            arrayList = new ArrayList(this.f2078a);
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2905c(Fragment fragment) {
        synchronized (this.f2078a) {
            this.f2078a.remove(fragment);
        }
        fragment.f1893p = false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Fragment mo2906d(String str) {
        for (C0463q qVar : this.f2079b.values()) {
            if (qVar != null) {
                Fragment a = qVar.mo2882e().mo2490a(str);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2907d() {
        this.f2079b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0463q mo2908e(String str) {
        return (C0463q) this.f2079b.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public ArrayList<C0461p> mo2909e() {
        ArrayList<C0461p> arrayList = new ArrayList<>(this.f2079b.size());
        for (C0463q qVar : this.f2079b.values()) {
            if (qVar != null) {
                Fragment e = qVar.mo2882e();
                C0461p j = qVar.mo2887j();
                arrayList.add(j);
                if (C0445l.m2390d(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Saved state of ");
                    sb.append(e);
                    sb.append(": ");
                    sb.append(j.f2073r);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public ArrayList<String> mo2910f() {
        synchronized (this.f2078a) {
            if (this.f2078a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f2078a.size());
            Iterator it = this.f2078a.iterator();
            while (it.hasNext()) {
                Fragment fragment = (Fragment) it.next();
                arrayList.add(fragment.f1887j);
                if (C0445l.m2390d(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(fragment.f1887j);
                    sb.append("): ");
                    sb.append(fragment);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            return arrayList;
        }
    }
}
