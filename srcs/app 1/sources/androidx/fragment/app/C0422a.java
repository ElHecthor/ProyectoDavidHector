package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0514h.C0516b;
import java.io.PrintWriter;
import java.util.ArrayList;
import p071f.p097h.p107l.C3315b;

/* renamed from: androidx.fragment.app.a */
final class C0422a extends C0466s implements C0453h {

    /* renamed from: q */
    final C0445l f1930q;

    /* renamed from: r */
    boolean f1931r;

    /* renamed from: s */
    int f1932s;

    C0422a(C0445l lVar) {
        C0440h o = lVar.mo2812o();
        C0441i<?> iVar = lVar.f2023o;
        super(o, iVar != null ? iVar.mo2730f().getClassLoader() : null);
        this.f1932s = -1;
        this.f1930q = lVar;
    }

    /* renamed from: b */
    private static boolean m2230b(C0467a aVar) {
        Fragment fragment = aVar.f2097b;
        return fragment != null && fragment.f1893p && fragment.f1868L != null && !fragment.f1861E && !fragment.f1860D && fragment.mo2476P();
    }

    /* renamed from: a */
    public int mo2618a() {
        return mo2630b(false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo2619a(ArrayList<Fragment> arrayList, Fragment fragment) {
        ArrayList<Fragment> arrayList2 = arrayList;
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f2080a.size()) {
            C0467a aVar = (C0467a) this.f2080a.get(i);
            int i2 = aVar.f2096a;
            if (i2 != 1) {
                if (i2 == 2) {
                    Fragment fragment3 = aVar.f2097b;
                    int i3 = fragment3.f1858B;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = (Fragment) arrayList2.get(size);
                        if (fragment4.f1858B == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f2080a.add(i, new C0467a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                C0467a aVar2 = new C0467a(3, fragment4);
                                aVar2.f2098c = aVar.f2098c;
                                aVar2.f2100e = aVar.f2100e;
                                aVar2.f2099d = aVar.f2099d;
                                aVar2.f2101f = aVar.f2101f;
                                this.f2080a.add(i, aVar2);
                                arrayList2.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.f2080a.remove(i);
                        i--;
                    } else {
                        aVar.f2096a = 1;
                        arrayList2.add(fragment3);
                    }
                } else if (i2 == 3 || i2 == 6) {
                    arrayList2.remove(aVar.f2097b);
                    Fragment fragment5 = aVar.f2097b;
                    if (fragment5 == fragment2) {
                        this.f2080a.add(i, new C0467a(9, fragment5));
                        i++;
                        fragment2 = null;
                    }
                } else if (i2 != 7) {
                    if (i2 == 8) {
                        this.f2080a.add(i, new C0467a(9, fragment2));
                        i++;
                        fragment2 = aVar.f2097b;
                    }
                }
                i++;
            }
            arrayList2.add(aVar.f2097b);
            i++;
        }
        return fragment2;
    }

    /* renamed from: a */
    public C0466s mo2620a(Fragment fragment) {
        C0445l lVar = fragment.f1900w;
        if (lVar == null || lVar == this.f1930q) {
            super.mo2620a(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot hide Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public C0466s mo2621a(Fragment fragment, C0516b bVar) {
        if (fragment.f1900w != this.f1930q) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot setMaxLifecycle for Fragment not attached to FragmentManager ");
            sb.append(this.f1930q);
            throw new IllegalArgumentException(sb.toString());
        } else if (bVar.mo3039a(C0516b.CREATED)) {
            super.mo2621a(fragment, bVar);
            return this;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot set maximum Lifecycle below ");
            sb2.append(C0516b.CREATED);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2622a(int i) {
        if (this.f2086g) {
            String str = "FragmentManager";
            if (C0445l.m2390d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Bump nesting in ");
                sb.append(this);
                sb.append(" by ");
                sb.append(i);
                Log.v(str, sb.toString());
            }
            int size = this.f2080a.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0467a aVar = (C0467a) this.f2080a.get(i2);
                Fragment fragment = aVar.f2097b;
                if (fragment != null) {
                    fragment.f1899v += i;
                    if (C0445l.m2390d(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Bump nesting of ");
                        sb2.append(aVar.f2097b);
                        sb2.append(" to ");
                        sb2.append(aVar.f2097b.f1899v);
                        Log.v(str, sb2.toString());
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2623a(int i, Fragment fragment, String str, int i2) {
        super.mo2623a(i, fragment, str, i2);
        fragment.f1900w = this.f1930q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2624a(C0419f fVar) {
        for (int i = 0; i < this.f2080a.size(); i++) {
            C0467a aVar = (C0467a) this.f2080a.get(i);
            if (m2230b(aVar)) {
                aVar.f2097b.mo2507a(fVar);
            }
        }
    }

    /* renamed from: a */
    public void mo2625a(String str, PrintWriter printWriter) {
        mo2626a(str, printWriter, true);
    }

    /* renamed from: a */
    public void mo2626a(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f2087h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1932s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1931r);
            if (this.f2085f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f2085f));
            }
            if (!(this.f2081b == 0 && this.f2082c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2081b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2082c));
            }
            if (!(this.f2083d == 0 && this.f2084e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f2083d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f2084e));
            }
            if (!(this.f2088i == 0 && this.f2089j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2088i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f2089j);
            }
            if (!(this.f2090k == 0 && this.f2091l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f2090k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f2091l);
            }
        }
        if (!this.f2080a.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.f2080a.size();
            for (int i = 0; i < size; i++) {
                C0467a aVar = (C0467a) this.f2080a.get(i);
                switch (aVar.f2096a) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("cmd=");
                        sb.append(aVar.f2096a);
                        str2 = sb.toString();
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(aVar.f2097b);
                if (z) {
                    if (!(aVar.f2098c == 0 && aVar.f2099d == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2098c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2099d));
                    }
                    if (aVar.f2100e != 0 || aVar.f2101f != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(aVar.f2100e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(aVar.f2101f));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo2627a(ArrayList<C0422a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f2080a.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = ((C0467a) this.f2080a.get(i4)).f2097b;
            int i5 = fragment != null ? fragment.f1858B : 0;
            if (!(i5 == 0 || i5 == i3)) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0422a aVar = (C0422a) arrayList.get(i6);
                    int size2 = aVar.f2080a.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = ((C0467a) aVar.f2080a.get(i7)).f2097b;
                        if ((fragment2 != null ? fragment2.f1858B : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo2628a(ArrayList<C0422a> arrayList, ArrayList<Boolean> arrayList2) {
        if (C0445l.m2390d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Run: ");
            sb.append(this);
            Log.v("FragmentManager", sb.toString());
        }
        arrayList.add(this);
        arrayList2.add(Boolean.valueOf(false));
        if (this.f2086g) {
            this.f1930q.mo2766a(this);
        }
        return true;
    }

    /* renamed from: b */
    public int mo2629b() {
        return mo2630b(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo2630b(boolean z) {
        if (!this.f1931r) {
            if (C0445l.m2390d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Commit: ");
                sb.append(this);
                String str = "FragmentManager";
                Log.v(str, sb.toString());
                PrintWriter printWriter = new PrintWriter(new C3315b(str));
                mo2625a("  ", printWriter);
                printWriter.close();
            }
            this.f1931r = true;
            this.f1932s = this.f2086g ? this.f1930q.mo2751a() : -1;
            this.f1930q.mo2771a((C0453h) this, z);
            return this.f1932s;
        }
        throw new IllegalStateException("commit already called");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo2631b(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f2080a.size() - 1; size >= 0; size--) {
            C0467a aVar = (C0467a) this.f2080a.get(size);
            int i = aVar.f2096a;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 6:
                            break;
                        case 7:
                            break;
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = aVar.f2097b;
                            break;
                        case 10:
                            aVar.f2103h = aVar.f2102g;
                            break;
                    }
                }
                arrayList.add(aVar.f2097b);
            }
            arrayList.remove(aVar.f2097b);
        }
        return fragment;
    }

    /* renamed from: b */
    public C0466s mo2632b(Fragment fragment) {
        C0445l lVar = fragment.f1900w;
        if (lVar == null || lVar == this.f1930q) {
            super.mo2632b(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2633b(int i) {
        int size = this.f2080a.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = ((C0467a) this.f2080a.get(i2)).f2097b;
            int i3 = fragment != null ? fragment.f1858B : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public C0466s mo2634c(Fragment fragment) {
        C0445l lVar = fragment.f1900w;
        if (lVar == null || lVar == this.f1930q) {
            super.mo2634c(fragment);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot show Fragment attached to a different FragmentManager. Fragment ");
        sb.append(fragment.toString());
        sb.append(" is already attached to a FragmentManager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: c */
    public void mo2635c() {
        mo2918e();
        this.f1930q.mo2781b((C0453h) this, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2636c(boolean z) {
        for (int size = this.f2080a.size() - 1; size >= 0; size--) {
            C0467a aVar = (C0467a) this.f2080a.get(size);
            Fragment fragment = aVar.f2097b;
            if (fragment != null) {
                fragment.mo2523c(C0445l.m2391e(this.f2085f));
            }
            switch (aVar.f2096a) {
                case 1:
                    fragment.mo2515b(aVar.f2101f);
                    this.f1930q.mo2765a(fragment, true);
                    this.f1930q.mo2807l(fragment);
                    break;
                case 3:
                    fragment.mo2515b(aVar.f2100e);
                    this.f1930q.mo2761a(fragment);
                    break;
                case 4:
                    fragment.mo2515b(aVar.f2100e);
                    this.f1930q.mo2815p(fragment);
                    break;
                case 5:
                    fragment.mo2515b(aVar.f2101f);
                    this.f1930q.mo2765a(fragment, true);
                    this.f1930q.mo2795f(fragment);
                    break;
                case 6:
                    fragment.mo2515b(aVar.f2100e);
                    this.f1930q.mo2787c(fragment);
                    break;
                case 7:
                    fragment.mo2515b(aVar.f2101f);
                    this.f1930q.mo2765a(fragment, true);
                    this.f1930q.mo2791d(fragment);
                    break;
                case 8:
                    this.f1930q.mo2813o(null);
                    break;
                case 9:
                    this.f1930q.mo2813o(fragment);
                    break;
                case 10:
                    this.f1930q.mo2763a(fragment, aVar.f2102g);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f2096a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f2094o || aVar.f2096a == 3 || fragment == null)) {
                this.f1930q.mo2801i(fragment);
            }
        }
        if (!this.f2094o && z) {
            C0445l lVar = this.f1930q;
            lVar.mo2756a(lVar.f2022n, true);
        }
    }

    /* renamed from: d */
    public void mo2637d() {
        mo2918e();
        this.f1930q.mo2781b((C0453h) this, true);
    }

    /* renamed from: f */
    public boolean mo2638f() {
        return this.f2080a.isEmpty();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2639g() {
        int size = this.f2080a.size();
        for (int i = 0; i < size; i++) {
            C0467a aVar = (C0467a) this.f2080a.get(i);
            Fragment fragment = aVar.f2097b;
            if (fragment != null) {
                fragment.mo2523c(this.f2085f);
            }
            switch (aVar.f2096a) {
                case 1:
                    fragment.mo2515b(aVar.f2098c);
                    this.f1930q.mo2765a(fragment, false);
                    this.f1930q.mo2761a(fragment);
                    break;
                case 3:
                    fragment.mo2515b(aVar.f2099d);
                    this.f1930q.mo2807l(fragment);
                    break;
                case 4:
                    fragment.mo2515b(aVar.f2099d);
                    this.f1930q.mo2795f(fragment);
                    break;
                case 5:
                    fragment.mo2515b(aVar.f2098c);
                    this.f1930q.mo2765a(fragment, false);
                    this.f1930q.mo2815p(fragment);
                    break;
                case 6:
                    fragment.mo2515b(aVar.f2099d);
                    this.f1930q.mo2791d(fragment);
                    break;
                case 7:
                    fragment.mo2515b(aVar.f2098c);
                    this.f1930q.mo2765a(fragment, false);
                    this.f1930q.mo2787c(fragment);
                    break;
                case 8:
                    this.f1930q.mo2813o(fragment);
                    break;
                case 9:
                    this.f1930q.mo2813o(null);
                    break;
                case 10:
                    this.f1930q.mo2763a(fragment, aVar.f2103h);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown cmd: ");
                    sb.append(aVar.f2096a);
                    throw new IllegalArgumentException(sb.toString());
            }
            if (!(this.f2094o || aVar.f2096a == 1 || fragment == null)) {
                this.f1930q.mo2801i(fragment);
            }
        }
        if (!this.f2094o) {
            C0445l lVar = this.f1930q;
            lVar.mo2756a(lVar.f2022n, true);
        }
    }

    /* renamed from: h */
    public String mo2640h() {
        return this.f2087h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo2641i() {
        for (int i = 0; i < this.f2080a.size(); i++) {
            if (m2230b((C0467a) this.f2080a.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public void mo2642j() {
        if (this.f2095p != null) {
            for (int i = 0; i < this.f2095p.size(); i++) {
                ((Runnable) this.f2095p.get(i)).run();
            }
            this.f2095p = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1932s >= 0) {
            sb.append(" #");
            sb.append(this.f1932s);
        }
        if (this.f2087h != null) {
            sb.append(" ");
            sb.append(this.f2087h);
        }
        sb.append("}");
        return sb.toString();
    }
}
