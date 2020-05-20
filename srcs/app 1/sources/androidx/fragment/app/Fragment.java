package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.app.C0368m;
import androidx.lifecycle.C0508c0;
import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0514h;
import androidx.lifecycle.C0514h.C0515a;
import androidx.lifecycle.C0514h.C0516b;
import androidx.lifecycle.C0521l;
import androidx.lifecycle.C0522m;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0524o;
import androidx.lifecycle.C0532t;
import androidx.savedstate.C0757a;
import androidx.savedstate.C0758b;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.UUID;
import p071f.p097h.p108m.C3344f;
import p071f.p126p.p127a.C3455a;

public class Fragment implements ComponentCallbacks, OnCreateContextMenuListener, C0523n, C0510d0, C0758b {

    /* renamed from: a0 */
    static final Object f1856a0 = new Object();

    /* renamed from: A */
    int f1857A;

    /* renamed from: B */
    int f1858B;

    /* renamed from: C */
    String f1859C;

    /* renamed from: D */
    boolean f1860D;

    /* renamed from: E */
    boolean f1861E;

    /* renamed from: F */
    boolean f1862F;

    /* renamed from: G */
    boolean f1863G;

    /* renamed from: H */
    boolean f1864H;

    /* renamed from: I */
    boolean f1865I = true;

    /* renamed from: J */
    private boolean f1866J;

    /* renamed from: K */
    ViewGroup f1867K;

    /* renamed from: L */
    View f1868L;

    /* renamed from: M */
    boolean f1869M;

    /* renamed from: N */
    boolean f1870N = true;

    /* renamed from: O */
    C0417d f1871O;

    /* renamed from: P */
    boolean f1872P;

    /* renamed from: Q */
    boolean f1873Q;

    /* renamed from: R */
    float f1874R;

    /* renamed from: S */
    LayoutInflater f1875S;

    /* renamed from: T */
    boolean f1876T;

    /* renamed from: U */
    C0516b f1877U;

    /* renamed from: V */
    C0524o f1878V;

    /* renamed from: W */
    C0487w f1879W;

    /* renamed from: X */
    C0532t<C0523n> f1880X;

    /* renamed from: Y */
    C0757a f1881Y;

    /* renamed from: Z */
    private int f1882Z;

    /* renamed from: f */
    int f1883f = -1;

    /* renamed from: g */
    Bundle f1884g;

    /* renamed from: h */
    SparseArray<Parcelable> f1885h;

    /* renamed from: i */
    Boolean f1886i;

    /* renamed from: j */
    String f1887j = UUID.randomUUID().toString();

    /* renamed from: k */
    Bundle f1888k;

    /* renamed from: l */
    Fragment f1889l;

    /* renamed from: m */
    String f1890m = null;

    /* renamed from: n */
    int f1891n;

    /* renamed from: o */
    private Boolean f1892o = null;

    /* renamed from: p */
    boolean f1893p;

    /* renamed from: q */
    boolean f1894q;

    /* renamed from: r */
    boolean f1895r;

    /* renamed from: s */
    boolean f1896s;

    /* renamed from: t */
    boolean f1897t;

    /* renamed from: u */
    boolean f1898u;

    /* renamed from: v */
    int f1899v;

    /* renamed from: w */
    C0445l f1900w;

    /* renamed from: x */
    C0441i<?> f1901x;

    /* renamed from: y */
    C0445l f1902y = new C0456m();

    /* renamed from: z */
    Fragment f1903z;

    /* renamed from: androidx.fragment.app.Fragment$a */
    class C0414a implements Runnable {
        C0414a() {
        }

        public void run() {
            Fragment.this.mo2580r0();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$b */
    class C0415b implements Runnable {
        C0415b() {
        }

        public void run() {
            Fragment.this.mo2535e();
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$c */
    class C0416c extends C0438f {
        C0416c() {
        }

        /* renamed from: a */
        public View mo2593a(int i) {
            View view = Fragment.this.f1868L;
            if (view != null) {
                return view.findViewById(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" does not have a view");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: d */
        public boolean mo2594d() {
            return Fragment.this.f1868L != null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$d */
    static class C0417d {

        /* renamed from: a */
        View f1908a;

        /* renamed from: b */
        Animator f1909b;

        /* renamed from: c */
        int f1910c;

        /* renamed from: d */
        int f1911d;

        /* renamed from: e */
        int f1912e;

        /* renamed from: f */
        Object f1913f = null;

        /* renamed from: g */
        Object f1914g;

        /* renamed from: h */
        Object f1915h;

        /* renamed from: i */
        Object f1916i;

        /* renamed from: j */
        Object f1917j;

        /* renamed from: k */
        Object f1918k;

        /* renamed from: l */
        Boolean f1919l;

        /* renamed from: m */
        Boolean f1920m;

        /* renamed from: n */
        C0368m f1921n;

        /* renamed from: o */
        C0368m f1922o;

        /* renamed from: p */
        boolean f1923p;

        /* renamed from: q */
        C0419f f1924q;

        /* renamed from: r */
        boolean f1925r;

        C0417d() {
            Object obj = Fragment.f1856a0;
            this.f1914g = obj;
            this.f1915h = null;
            this.f1916i = obj;
            this.f1917j = null;
            this.f1918k = obj;
            this.f1921n = null;
            this.f1922o = null;
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$e */
    public static class C0418e extends RuntimeException {
        public C0418e(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* renamed from: androidx.fragment.app.Fragment$f */
    interface C0419f {
        /* renamed from: a */
        void mo2595a();

        /* renamed from: b */
        void mo2596b();
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.fragment.app.Fragment$g */
    public static class C0420g implements Parcelable {
        public static final Creator<C0420g> CREATOR = new C0421a();

        /* renamed from: f */
        final Bundle f1926f;

        /* renamed from: androidx.fragment.app.Fragment$g$a */
        static class C0421a implements ClassLoaderCreator<C0420g> {
            C0421a() {
            }

            public C0420g createFromParcel(Parcel parcel) {
                return new C0420g(parcel, null);
            }

            public C0420g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0420g(parcel, classLoader);
            }

            public C0420g[] newArray(int i) {
                return new C0420g[i];
            }
        }

        C0420g(Bundle bundle) {
            this.f1926f = bundle;
        }

        C0420g(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f1926f = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeBundle(this.f1926f);
        }
    }

    public Fragment() {
        new C0414a();
        this.f1877U = C0516b.RESUMED;
        this.f1880X = new C0532t<>();
        mo2654t0();
    }

    @Deprecated
    /* renamed from: a */
    public static Fragment m2095a(Context context, String str, Bundle bundle) {
        String str2 = ": make sure class name exists, is public, and has an empty constructor that is public";
        String str3 = "Unable to instantiate fragment ";
        try {
            Fragment fragment = (Fragment) C0440h.m2338d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragment.getClass().getClassLoader());
                fragment.mo2566m(bundle);
            }
            return fragment;
        } catch (InstantiationException e) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str);
            sb.append(str2);
            throw new C0418e(sb.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(str);
            sb2.append(str2);
            throw new C0418e(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str3);
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new C0418e(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str3);
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new C0418e(sb4.toString(), e4);
        }
    }

    /* renamed from: s0 */
    private C0417d mo2653s0() {
        if (this.f1871O == null) {
            this.f1871O = new C0417d();
        }
        return this.f1871O;
    }

    /* renamed from: t0 */
    private void mo2654t0() {
        this.f1878V = new C0524o(this);
        this.f1881Y = C0757a.m4087a((C0758b) this);
        if (VERSION.SDK_INT >= 19) {
            this.f1878V.mo3037a((C0522m) new C0521l() {
                /* renamed from: a */
                public void mo124a(C0523n nVar, C0515a aVar) {
                    if (aVar == C0515a.ON_STOP) {
                        View view = Fragment.this.f1868L;
                        if (view != null) {
                            view.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
    }

    /* renamed from: A */
    public final Resources mo2461A() {
        return mo2576p0().getResources();
    }

    /* renamed from: B */
    public final boolean mo2462B() {
        return this.f1862F;
    }

    /* renamed from: C */
    public Object mo2463C() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1914g;
        if (obj == f1856a0) {
            obj = mo2570o();
        }
        return obj;
    }

    /* renamed from: D */
    public Object mo2464D() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1917j;
    }

    /* renamed from: E */
    public Object mo2465E() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1918k;
        if (obj == f1856a0) {
            obj = mo2464D();
        }
        return obj;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public int mo2466F() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1910c;
    }

    /* renamed from: G */
    public final String mo2467G() {
        return this.f1859C;
    }

    /* renamed from: H */
    public final Fragment mo2468H() {
        Fragment fragment = this.f1889l;
        if (fragment != null) {
            return fragment;
        }
        C0445l lVar = this.f1900w;
        if (lVar != null) {
            String str = this.f1890m;
            if (str != null) {
                return lVar.mo2754a(str);
            }
        }
        return null;
    }

    /* renamed from: I */
    public View mo2469I() {
        return this.f1868L;
    }

    /* renamed from: J */
    public C0523n mo2470J() {
        C0487w wVar = this.f1879W;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public void mo2471K() {
        mo2654t0();
        this.f1887j = UUID.randomUUID().toString();
        this.f1893p = false;
        this.f1894q = false;
        this.f1895r = false;
        this.f1896s = false;
        this.f1897t = false;
        this.f1899v = 0;
        this.f1900w = null;
        this.f1902y = new C0456m();
        this.f1901x = null;
        this.f1857A = 0;
        this.f1858B = 0;
        this.f1859C = null;
        this.f1860D = false;
        this.f1861E = false;
    }

    /* renamed from: L */
    public final boolean mo2472L() {
        return this.f1901x != null && this.f1893p;
    }

    /* renamed from: M */
    public final boolean mo2473M() {
        return this.f1860D;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: N */
    public boolean mo2474N() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return false;
        }
        return dVar.f1925r;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public final boolean mo2475O() {
        return this.f1899v > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public boolean mo2476P() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return false;
        }
        return dVar.f1923p;
    }

    /* renamed from: Q */
    public final boolean mo2477Q() {
        return this.f1894q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: R */
    public final boolean mo2478R() {
        Fragment x = mo2588x();
        return x != null && (x.mo2477Q() || x.mo2478R());
    }

    /* renamed from: S */
    public final boolean mo2479S() {
        return this.f1883f >= 4;
    }

    /* renamed from: T */
    public final boolean mo2480T() {
        C0445l lVar = this.f1900w;
        if (lVar == null) {
            return false;
        }
        return lVar.mo2823w();
    }

    /* renamed from: U */
    public final boolean mo2481U() {
        if (mo2472L() && !mo2473M()) {
            View view = this.f1868L;
            if (!(view == null || view.getWindowToken() == null || this.f1868L.getVisibility() != 0)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: V */
    public void mo2482V() {
        this.f1902y.mo2824x();
    }

    /* renamed from: W */
    public void mo2483W() {
        this.f1866J = true;
    }

    /* renamed from: X */
    public void mo2484X() {
    }

    /* renamed from: Y */
    public void mo2485Y() {
        this.f1866J = true;
    }

    /* renamed from: Z */
    public void mo2486Z() {
        this.f1866J = true;
    }

    @Deprecated
    /* renamed from: a */
    public LayoutInflater mo2487a(Bundle bundle) {
        C0441i<?> iVar = this.f1901x;
        if (iVar != null) {
            LayoutInflater j = iVar.mo2692j();
            C3344f.m13625b(j, this.f1902y.mo2816q());
            return j;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.f1882Z;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    /* renamed from: a */
    public Animation mo2489a(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo2490a(String str) {
        return str.equals(this.f1887j) ? this : this.f1902y.mo2786c(str);
    }

    /* renamed from: a */
    public C0514h mo115a() {
        return this.f1878V;
    }

    /* renamed from: a */
    public final String mo2491a(int i) {
        return mo2461A().getString(i);
    }

    /* renamed from: a */
    public void mo2492a(int i, int i2, Intent intent) {
    }

    /* renamed from: a */
    public void mo2493a(int i, String[] strArr, int[] iArr) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2494a(Animator animator) {
        mo2653s0().f1909b = animator;
    }

    @Deprecated
    /* renamed from: a */
    public void mo2495a(Activity activity) {
        this.f1866J = true;
    }

    @Deprecated
    /* renamed from: a */
    public void mo2496a(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.f1866J = true;
    }

    /* renamed from: a */
    public void mo2497a(Context context) {
        this.f1866J = true;
        C0441i<?> iVar = this.f1901x;
        Activity e = iVar == null ? null : iVar.mo2729e();
        if (e != null) {
            this.f1866J = false;
            mo2495a(e);
        }
    }

    /* renamed from: a */
    public void mo2498a(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.f1866J = true;
        C0441i<?> iVar = this.f1901x;
        Activity e = iVar == null ? null : iVar.mo2729e();
        if (e != null) {
            this.f1866J = false;
            mo2496a(e, attributeSet, bundle);
        }
    }

    /* renamed from: a */
    public void mo2499a(@SuppressLint({"UnknownNullness"}) Intent intent) {
        mo2501a(intent, (Bundle) null);
    }

    /* renamed from: a */
    public void mo2500a(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        C0441i<?> iVar = this.f1901x;
        if (iVar != null) {
            iVar.mo2688a(this, intent, i, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public void mo2501a(@SuppressLint({"UnknownNullness"}) Intent intent, Bundle bundle) {
        C0441i<?> iVar = this.f1901x;
        if (iVar != null) {
            iVar.mo2688a(this, intent, -1, bundle);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to Activity");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2502a(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.f1902y.mo2757a(configuration);
    }

    /* renamed from: a */
    public void mo2503a(Menu menu) {
    }

    /* renamed from: a */
    public void mo2504a(Menu menu, MenuInflater menuInflater) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2505a(View view) {
        mo2653s0().f1908a = view;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2507a(C0419f fVar) {
        mo2653s0();
        C0419f fVar2 = this.f1871O.f1924q;
        if (fVar != fVar2) {
            if (fVar == null || fVar2 == null) {
                C0417d dVar = this.f1871O;
                if (dVar.f1923p) {
                    dVar.f1924q = fVar;
                }
                if (fVar != null) {
                    fVar.mo2596b();
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set a replacement startPostponedEnterTransition on ");
            sb.append(this);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        if (r2 != null) goto L_0x000c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2508a(androidx.fragment.app.Fragment.C0420g r2) {
        /*
            r1 = this;
            androidx.fragment.app.l r0 = r1.f1900w
            if (r0 != 0) goto L_0x000f
            if (r2 == 0) goto L_0x000b
            android.os.Bundle r2 = r2.f1926f
            if (r2 == 0) goto L_0x000b
            goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            r1.f1884g = r2
            return
        L_0x000f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "Fragment already added"
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.Fragment.mo2508a(androidx.fragment.app.Fragment$g):void");
    }

    /* renamed from: a */
    public void mo2509a(Fragment fragment) {
    }

    /* renamed from: a */
    public void mo2510a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.f1857A));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.f1858B));
        printWriter.print(" mTag=");
        printWriter.println(this.f1859C);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1883f);
        printWriter.print(" mWho=");
        printWriter.print(this.f1887j);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f1899v);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f1893p);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f1894q);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f1895r);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f1896s);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.f1860D);
        printWriter.print(" mDetached=");
        printWriter.print(this.f1861E);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.f1865I);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.f1864H);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.f1862F);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f1870N);
        if (this.f1900w != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f1900w);
        }
        if (this.f1901x != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f1901x);
        }
        if (this.f1903z != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.f1903z);
        }
        if (this.f1888k != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f1888k);
        }
        if (this.f1884g != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1884g);
        }
        if (this.f1885h != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1885h);
        }
        Fragment H = mo2468H();
        if (H != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(H);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f1891n);
        }
        if (mo2586v() != 0) {
            printWriter.print(str);
            printWriter.print("mNextAnim=");
            printWriter.println(mo2586v());
        }
        if (this.f1867K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.f1867K);
        }
        if (this.f1868L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.f1868L);
        }
        if (mo2556j() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(mo2556j());
            printWriter.print(str);
            printWriter.print("mStateAfterAnimating=");
            printWriter.println(mo2466F());
        }
        if (mo2568n() != null) {
            C3455a.m14163a(this).mo11018a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        StringBuilder sb = new StringBuilder();
        sb.append("Child ");
        sb.append(this.f1902y);
        sb.append(":");
        printWriter.println(sb.toString());
        C0445l lVar = this.f1902y;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("  ");
        lVar.mo2772a(sb2.toString(), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: a */
    public void mo2511a(boolean z) {
    }

    /* renamed from: a */
    public boolean mo2512a(MenuItem menuItem) {
        return false;
    }

    /* renamed from: a0 */
    public void mo2513a0() {
        this.f1866J = true;
    }

    /* renamed from: b */
    public Animator mo2514b(int i, boolean z, int i2) {
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2515b(int i) {
        if (this.f1871O != null || i != 0) {
            mo2653s0().f1911d = i;
        }
    }

    /* renamed from: b */
    public void mo2516b(Bundle bundle) {
        this.f1866J = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2517b(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f1902y.mo2824x();
        this.f1898u = true;
        this.f1879W = new C0487w();
        View a = mo2488a(layoutInflater, viewGroup, bundle);
        this.f1868L = a;
        if (a != null) {
            this.f1879W.mo2970d();
            this.f1880X.mo2981b(this.f1879W);
        } else if (!this.f1879W.mo2971e()) {
            this.f1879W = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* renamed from: b */
    public void mo2518b(Menu menu) {
    }

    /* renamed from: b */
    public void mo2519b(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2520b(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.f1860D) {
            return false;
        }
        if (this.f1864H && this.f1865I) {
            z = true;
            mo2504a(menu, menuInflater);
        }
        return z | this.f1902y.mo2774a(menu, menuInflater);
    }

    /* renamed from: b */
    public boolean mo2521b(MenuItem menuItem) {
        return false;
    }

    /* renamed from: b0 */
    public void mo2522b0() {
        this.f1866J = true;
    }

    /* renamed from: c */
    public final SavedStateRegistry mo117c() {
        return this.f1881Y.mo4172a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2523c(int i) {
        if (this.f1871O != null || i != 0) {
            mo2653s0();
            this.f1871O.f1912e = i;
        }
    }

    /* renamed from: c */
    public void mo2524c(Bundle bundle) {
        this.f1866J = true;
        mo2560k(bundle);
        if (!this.f1902y.mo2783b(1)) {
            this.f1902y.mo2793e();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo2525c(Menu menu) {
        if (!this.f1860D) {
            if (this.f1864H && this.f1865I) {
                mo2503a(menu);
            }
            this.f1902y.mo2760a(menu);
        }
    }

    /* renamed from: c */
    public void mo2526c(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo2527c(MenuItem menuItem) {
        return !this.f1860D && (mo2512a(menuItem) || this.f1902y.mo2775a(menuItem));
    }

    /* renamed from: c0 */
    public void mo2528c0() {
        this.f1866J = true;
    }

    /* renamed from: d */
    public LayoutInflater mo2529d(Bundle bundle) {
        return mo2487a(bundle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2530d(int i) {
        mo2653s0().f1910c = i;
    }

    /* renamed from: d */
    public void mo2531d(boolean z) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2532d(Menu menu) {
        boolean z = false;
        if (this.f1860D) {
            return false;
        }
        if (this.f1864H && this.f1865I) {
            z = true;
            mo2518b(menu);
        }
        return z | this.f1902y.mo2784b(menu);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo2533d(MenuItem menuItem) {
        return !this.f1860D && ((this.f1864H && this.f1865I && mo2521b(menuItem)) || this.f1902y.mo2785b(menuItem));
    }

    /* renamed from: d0 */
    public void mo2534d0() {
        this.f1866J = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2535e() {
        C0417d dVar = this.f1871O;
        C0419f fVar = null;
        if (dVar != null) {
            dVar.f1923p = false;
            C0419f fVar2 = dVar.f1924q;
            dVar.f1924q = null;
            fVar = fVar2;
        }
        if (fVar != null) {
            fVar.mo2595a();
        }
    }

    /* renamed from: e */
    public void mo2536e(Bundle bundle) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo2537e(boolean z) {
        mo2519b(z);
        this.f1902y.mo2773a(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e0 */
    public void mo2538e0() {
        this.f1902y.mo2768a(this.f1901x, (C0438f) new C0416c(), this);
        this.f1883f = 0;
        this.f1866J = false;
        mo2497a(this.f1901x.mo2730f());
        if (!this.f1866J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onAttach()");
            throw new C0488x(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f */
    public final C0429d mo2540f() {
        C0441i<?> iVar = this.f1901x;
        if (iVar == null) {
            return null;
        }
        return (C0429d) iVar.mo2729e();
    }

    /* renamed from: f */
    public void mo2541f(Bundle bundle) {
        this.f1866J = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo2542f(boolean z) {
        mo2526c(z);
        this.f1902y.mo2782b(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f0 */
    public void mo2543f0() {
        this.f1902y.mo2794f();
        this.f1878V.mo3041a(C0515a.ON_DESTROY);
        this.f1883f = 0;
        this.f1866J = false;
        this.f1876T = false;
        mo2483W();
        if (!this.f1866J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDestroy()");
            throw new C0488x(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2544g(Bundle bundle) {
        this.f1902y.mo2824x();
        this.f1883f = 2;
        this.f1866J = false;
        mo2516b(bundle);
        if (this.f1866J) {
            this.f1902y.mo2790d();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onActivityCreated()");
        throw new C0488x(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo2545g(boolean z) {
        mo2653s0().f1925r = z;
    }

    /* renamed from: g */
    public boolean mo2546g() {
        C0417d dVar = this.f1871O;
        if (dVar != null) {
            Boolean bool = dVar.f1920m;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g0 */
    public void mo2547g0() {
        this.f1902y.mo2796g();
        if (this.f1868L != null) {
            this.f1879W.mo2969a(C0515a.ON_DESTROY);
        }
        this.f1883f = 1;
        this.f1866J = false;
        mo2485Y();
        if (this.f1866J) {
            C3455a.m14163a(this).mo11017a();
            this.f1898u = false;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onDestroyView()");
        throw new C0488x(sb.toString());
    }

    /* renamed from: h */
    public C0508c0 mo118h() {
        C0445l lVar = this.f1900w;
        if (lVar != null) {
            return lVar.mo2792e(this);
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo2548h(Bundle bundle) {
        this.f1902y.mo2824x();
        this.f1883f = 1;
        this.f1866J = false;
        this.f1881Y.mo4173a(bundle);
        mo2524c(bundle);
        this.f1876T = true;
        if (this.f1866J) {
            this.f1878V.mo3041a(C0515a.ON_CREATE);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onCreate()");
        throw new C0488x(sb.toString());
    }

    /* renamed from: h */
    public void mo2549h(boolean z) {
        if (this.f1865I != z) {
            this.f1865I = z;
            if (this.f1864H && mo2472L() && !mo2473M()) {
                this.f1901x.mo2693k();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h0 */
    public void mo2550h0() {
        this.f1883f = -1;
        this.f1866J = false;
        mo2486Z();
        this.f1875S = null;
        if (!this.f1866J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onDetach()");
            throw new C0488x(sb.toString());
        } else if (!this.f1902y.mo2822v()) {
            this.f1902y.mo2794f();
            this.f1902y = new C0456m();
        }
    }

    public final int hashCode() {
        return super.hashCode();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public LayoutInflater mo2552i(Bundle bundle) {
        LayoutInflater d = mo2529d(bundle);
        this.f1875S = d;
        return d;
    }

    /* renamed from: i */
    public void mo2553i(boolean z) {
        this.f1862F = z;
        C0445l lVar = this.f1900w;
        if (lVar == null) {
            this.f1863G = true;
        } else if (z) {
            lVar.mo2779b(this);
        } else {
            lVar.mo2809m(this);
        }
    }

    /* renamed from: i */
    public boolean mo2554i() {
        C0417d dVar = this.f1871O;
        if (dVar != null) {
            Boolean bool = dVar.f1919l;
            if (bool != null) {
                return bool.booleanValue();
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i0 */
    public void mo2555i0() {
        onLowMemory();
        this.f1902y.mo2798h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public View mo2556j() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1908a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo2557j(Bundle bundle) {
        mo2536e(bundle);
        this.f1881Y.mo4174b(bundle);
        Parcelable z = this.f1902y.mo2826z();
        if (z != null) {
            bundle.putParcelable("android:support:fragments", z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j0 */
    public void mo2558j0() {
        this.f1902y.mo2800i();
        if (this.f1868L != null) {
            this.f1879W.mo2969a(C0515a.ON_PAUSE);
        }
        this.f1878V.mo3041a(C0515a.ON_PAUSE);
        this.f1883f = 3;
        this.f1866J = false;
        mo2513a0();
        if (!this.f1866J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onPause()");
            throw new C0488x(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public Animator mo2559k() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1909b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2560k(Bundle bundle) {
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            if (parcelable != null) {
                this.f1902y.mo2759a(parcelable);
                this.f1902y.mo2793e();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k0 */
    public void mo2561k0() {
        boolean g = this.f1900w.mo2797g(this);
        Boolean bool = this.f1892o;
        if (bool == null || bool.booleanValue() != g) {
            this.f1892o = Boolean.valueOf(g);
            mo2531d(g);
            this.f1902y.mo2802j();
        }
    }

    /* renamed from: l */
    public final Bundle mo2562l() {
        return this.f1888k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo2563l(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1885h;
        if (sparseArray != null) {
            this.f1868L.restoreHierarchyState(sparseArray);
            this.f1885h = null;
        }
        this.f1866J = false;
        mo2541f(bundle);
        if (!this.f1866J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onViewStateRestored()");
            throw new C0488x(sb.toString());
        } else if (this.f1868L != null) {
            this.f1879W.mo2969a(C0515a.ON_CREATE);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l0 */
    public void mo2564l0() {
        this.f1902y.mo2824x();
        this.f1902y.mo2789c(true);
        this.f1883f = 4;
        this.f1866J = false;
        mo2522b0();
        if (this.f1866J) {
            this.f1878V.mo3041a(C0515a.ON_RESUME);
            if (this.f1868L != null) {
                this.f1879W.mo2969a(C0515a.ON_RESUME);
            }
            this.f1902y.mo2804k();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onResume()");
        throw new C0488x(sb.toString());
    }

    /* renamed from: m */
    public final C0445l mo2565m() {
        if (this.f1901x != null) {
            return this.f1902y;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" has not been attached yet.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: m */
    public void mo2566m(Bundle bundle) {
        if (this.f1900w == null || !mo2480T()) {
            this.f1888k = bundle;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m0 */
    public void mo2567m0() {
        this.f1902y.mo2824x();
        this.f1902y.mo2789c(true);
        this.f1883f = 3;
        this.f1866J = false;
        mo2528c0();
        if (this.f1866J) {
            this.f1878V.mo3041a(C0515a.ON_START);
            if (this.f1868L != null) {
                this.f1879W.mo2969a(C0515a.ON_START);
            }
            this.f1902y.mo2806l();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not call through to super.onStart()");
        throw new C0488x(sb.toString());
    }

    /* renamed from: n */
    public Context mo2568n() {
        C0441i<?> iVar = this.f1901x;
        if (iVar == null) {
            return null;
        }
        return iVar.mo2730f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n0 */
    public void mo2569n0() {
        this.f1902y.mo2808m();
        if (this.f1868L != null) {
            this.f1879W.mo2969a(C0515a.ON_STOP);
        }
        this.f1878V.mo3041a(C0515a.ON_STOP);
        this.f1883f = 2;
        this.f1866J = false;
        mo2534d0();
        if (!this.f1866J) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(this);
            sb.append(" did not call through to super.onStop()");
            throw new C0488x(sb.toString());
        }
    }

    /* renamed from: o */
    public Object mo2570o() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1913f;
    }

    /* renamed from: o0 */
    public final C0429d mo2571o0() {
        C0429d f = mo2540f();
        if (f != null) {
            return f;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to an activity.");
        throw new IllegalStateException(sb.toString());
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f1866J = true;
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        mo2571o0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.f1866J = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public C0368m mo2575p() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1921n;
    }

    /* renamed from: p0 */
    public final Context mo2576p0() {
        Context n = mo2568n();
        if (n != null) {
            return n;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not attached to a context.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: q */
    public Object mo2577q() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1915h;
    }

    /* renamed from: q0 */
    public final View mo2578q0() {
        View I = mo2469I();
        if (I != null) {
            return I;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" did not return a View from onCreateView() or this was called before onCreateView().");
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public C0368m mo2579r() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        return dVar.f1922o;
    }

    /* renamed from: r0 */
    public void mo2580r0() {
        C0445l lVar = this.f1900w;
        if (lVar == null || lVar.f2023o == null) {
            mo2653s0().f1923p = false;
        } else if (Looper.myLooper() != this.f1900w.f2023o.mo2731g().getLooper()) {
            this.f1900w.f2023o.mo2731g().postAtFrontOfQueue(new C0415b());
        } else {
            mo2535e();
        }
    }

    @Deprecated
    /* renamed from: s */
    public final C0445l mo2581s() {
        return this.f1900w;
    }

    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        mo2500a(intent, i, (Bundle) null);
    }

    /* renamed from: t */
    public final Object mo2583t() {
        C0441i<?> iVar = this.f1901x;
        if (iVar == null) {
            return null;
        }
        return iVar.mo2691i();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f1887j);
        sb.append(")");
        if (this.f1857A != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1857A));
        }
        if (this.f1859C != null) {
            sb.append(" ");
            sb.append(this.f1859C);
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public final LayoutInflater mo2585u() {
        LayoutInflater layoutInflater = this.f1875S;
        return layoutInflater == null ? mo2552i((Bundle) null) : layoutInflater;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public int mo2586v() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1911d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public int mo2587w() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return 0;
        }
        return dVar.f1912e;
    }

    /* renamed from: x */
    public final Fragment mo2588x() {
        return this.f1903z;
    }

    /* renamed from: y */
    public final C0445l mo2589y() {
        C0445l lVar = this.f1900w;
        if (lVar != null) {
            return lVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(this);
        sb.append(" not associated with a fragment manager.");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: z */
    public Object mo2590z() {
        C0417d dVar = this.f1871O;
        if (dVar == null) {
            return null;
        }
        Object obj = dVar.f1916i;
        if (obj == f1856a0) {
            obj = mo2577q();
        }
        return obj;
    }
}
