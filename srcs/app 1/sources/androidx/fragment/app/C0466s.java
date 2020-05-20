package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C0514h.C0516b;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.s */
public abstract class C0466s {

    /* renamed from: a */
    ArrayList<C0467a> f2080a = new ArrayList<>();

    /* renamed from: b */
    int f2081b;

    /* renamed from: c */
    int f2082c;

    /* renamed from: d */
    int f2083d;

    /* renamed from: e */
    int f2084e;

    /* renamed from: f */
    int f2085f;

    /* renamed from: g */
    boolean f2086g;

    /* renamed from: h */
    String f2087h;

    /* renamed from: i */
    int f2088i;

    /* renamed from: j */
    CharSequence f2089j;

    /* renamed from: k */
    int f2090k;

    /* renamed from: l */
    CharSequence f2091l;

    /* renamed from: m */
    ArrayList<String> f2092m;

    /* renamed from: n */
    ArrayList<String> f2093n;

    /* renamed from: o */
    boolean f2094o = false;

    /* renamed from: p */
    ArrayList<Runnable> f2095p;

    /* renamed from: androidx.fragment.app.s$a */
    static final class C0467a {

        /* renamed from: a */
        int f2096a;

        /* renamed from: b */
        Fragment f2097b;

        /* renamed from: c */
        int f2098c;

        /* renamed from: d */
        int f2099d;

        /* renamed from: e */
        int f2100e;

        /* renamed from: f */
        int f2101f;

        /* renamed from: g */
        C0516b f2102g;

        /* renamed from: h */
        C0516b f2103h;

        C0467a() {
        }

        C0467a(int i, Fragment fragment) {
            this.f2096a = i;
            this.f2097b = fragment;
            C0516b bVar = C0516b.RESUMED;
            this.f2102g = bVar;
            this.f2103h = bVar;
        }

        C0467a(int i, Fragment fragment, C0516b bVar) {
            this.f2096a = i;
            this.f2097b = fragment;
            this.f2102g = fragment.f1877U;
            this.f2103h = bVar;
        }
    }

    C0466s(C0440h hVar, ClassLoader classLoader) {
    }

    /* renamed from: a */
    public abstract int mo2618a();

    /* renamed from: a */
    public C0466s mo2911a(int i, Fragment fragment) {
        mo2917b(i, fragment, null);
        return this;
    }

    /* renamed from: a */
    public C0466s mo2912a(int i, Fragment fragment, String str) {
        mo2623a(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0466s mo2913a(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f1867K = viewGroup;
        mo2912a(viewGroup.getId(), fragment, str);
        return this;
    }

    /* renamed from: a */
    public C0466s mo2620a(Fragment fragment) {
        mo2916a(new C0467a(4, fragment));
        return this;
    }

    /* renamed from: a */
    public C0466s mo2621a(Fragment fragment, C0516b bVar) {
        mo2916a(new C0467a(10, fragment, bVar));
        return this;
    }

    /* renamed from: a */
    public C0466s mo2914a(Fragment fragment, String str) {
        mo2623a(0, fragment, str, 1);
        return this;
    }

    /* renamed from: a */
    public C0466s mo2915a(boolean z) {
        this.f2094o = z;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2623a(int i, Fragment fragment, String str, int i2) {
        Class cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(cls.getCanonicalName());
            sb.append(" must be a public static class to be  properly recreated from instance state.");
            throw new IllegalStateException(sb.toString());
        }
        String str2 = " now ";
        String str3 = ": was ";
        if (str != null) {
            String str4 = fragment.f1859C;
            if (str4 == null || str.equals(str4)) {
                fragment.f1859C = str;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't change tag of fragment ");
                sb2.append(fragment);
                sb2.append(str3);
                sb2.append(fragment.f1859C);
                sb2.append(str2);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f1857A;
                if (i3 == 0 || i3 == i) {
                    fragment.f1857A = i;
                    fragment.f1858B = i;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Can't change container ID of fragment ");
                    sb3.append(fragment);
                    sb3.append(str3);
                    sb3.append(fragment.f1857A);
                    sb3.append(str2);
                    sb3.append(i);
                    throw new IllegalStateException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Can't add fragment ");
                sb4.append(fragment);
                sb4.append(" with tag ");
                sb4.append(str);
                sb4.append(" to container view with no id");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
        mo2916a(new C0467a(i2, fragment));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2916a(C0467a aVar) {
        this.f2080a.add(aVar);
        aVar.f2098c = this.f2081b;
        aVar.f2099d = this.f2082c;
        aVar.f2100e = this.f2083d;
        aVar.f2101f = this.f2084e;
    }

    /* renamed from: b */
    public abstract int mo2629b();

    /* renamed from: b */
    public C0466s mo2917b(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo2623a(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: b */
    public C0466s mo2632b(Fragment fragment) {
        mo2916a(new C0467a(3, fragment));
        return this;
    }

    /* renamed from: c */
    public C0466s mo2634c(Fragment fragment) {
        mo2916a(new C0467a(5, fragment));
        return this;
    }

    /* renamed from: c */
    public abstract void mo2635c();

    /* renamed from: d */
    public abstract void mo2637d();

    /* renamed from: e */
    public C0466s mo2918e() {
        if (!this.f2086g) {
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* renamed from: f */
    public abstract boolean mo2638f();
}
