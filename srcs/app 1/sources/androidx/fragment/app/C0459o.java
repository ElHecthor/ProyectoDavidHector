package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0498a0;
import androidx.lifecycle.C0503b0;
import androidx.lifecycle.C0503b0.C0504a;
import androidx.lifecycle.C0508c0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.o */
final class C0459o extends C0498a0 {

    /* renamed from: h */
    private static final C0504a f2054h = new C0460a();

    /* renamed from: b */
    private final HashMap<String, Fragment> f2055b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, C0459o> f2056c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0508c0> f2057d = new HashMap<>();

    /* renamed from: e */
    private final boolean f2058e;

    /* renamed from: f */
    private boolean f2059f = false;

    /* renamed from: g */
    private boolean f2060g = false;

    /* renamed from: androidx.fragment.app.o$a */
    static class C0460a implements C0504a {
        C0460a() {
        }

        /* renamed from: a */
        public <T extends C0498a0> T mo2866a(Class<T> cls) {
            return new C0459o(true);
        }
    }

    C0459o(boolean z) {
        this.f2058e = z;
    }

    /* renamed from: a */
    static C0459o m2502a(C0508c0 c0Var) {
        return (C0459o) new C0503b0(c0Var, f2054h).mo3012a(C0459o.class);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2853a(Fragment fragment) {
        if (this.f2055b.containsKey(fragment.f1887j)) {
            return false;
        }
        this.f2055b.put(fragment.f1887j, fragment);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo2854b(String str) {
        return (Fragment) this.f2055b.get(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2855b() {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.f2059f = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2856b(Fragment fragment) {
        if (C0445l.m2390d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        C0459o oVar = (C0459o) this.f2056c.get(fragment.f1887j);
        if (oVar != null) {
            oVar.mo2855b();
            this.f2056c.remove(fragment.f1887j);
        }
        C0508c0 c0Var = (C0508c0) this.f2057d.get(fragment.f1887j);
        if (c0Var != null) {
            c0Var.mo3019a();
            this.f2057d.remove(fragment.f1887j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0459o mo2857c(Fragment fragment) {
        C0459o oVar = (C0459o) this.f2056c.get(fragment.f1887j);
        if (oVar != null) {
            return oVar;
        }
        C0459o oVar2 = new C0459o(this.f2058e);
        this.f2056c.put(fragment.f1887j, oVar2);
        return oVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Collection<Fragment> mo2858c() {
        return this.f2055b.values();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0508c0 mo2859d(Fragment fragment) {
        C0508c0 c0Var = (C0508c0) this.f2057d.get(fragment.f1887j);
        if (c0Var != null) {
            return c0Var;
        }
        C0508c0 c0Var2 = new C0508c0();
        this.f2057d.put(fragment.f1887j, c0Var2);
        return c0Var2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2860d() {
        return this.f2059f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo2861e(Fragment fragment) {
        return this.f2055b.remove(fragment.f1887j) != null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0459o.class != obj.getClass()) {
            return false;
        }
        C0459o oVar = (C0459o) obj;
        if (!this.f2055b.equals(oVar.f2055b) || !this.f2056c.equals(oVar.f2056c) || !this.f2057d.equals(oVar.f2057d)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo2863f(Fragment fragment) {
        if (!this.f2055b.containsKey(fragment.f1887j)) {
            return true;
        }
        return this.f2058e ? this.f2059f : !this.f2060g;
    }

    public int hashCode() {
        return (((this.f2055b.hashCode() * 31) + this.f2056c.hashCode()) * 31) + this.f2057d.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f2055b.values().iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f2056c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f2057d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
