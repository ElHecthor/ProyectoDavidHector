package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0580o.C0583c;
import androidx.recyclerview.widget.RecyclerView.C0580o.C0584d;
import androidx.recyclerview.widget.RecyclerView.C0585p;
import androidx.recyclerview.widget.RecyclerView.C0592v;
import androidx.recyclerview.widget.RecyclerView.C0597z;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0599b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3350c;

public class StaggeredGridLayoutManager extends C0580o implements C0599b {

    /* renamed from: A */
    boolean f2449A = false;

    /* renamed from: B */
    private BitSet f2450B;

    /* renamed from: C */
    int f2451C = -1;

    /* renamed from: D */
    int f2452D = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: E */
    C0603d f2453E = new C0603d();

    /* renamed from: F */
    private int f2454F = 2;

    /* renamed from: G */
    private boolean f2455G;

    /* renamed from: H */
    private boolean f2456H;

    /* renamed from: I */
    private C0606e f2457I;

    /* renamed from: J */
    private int f2458J;

    /* renamed from: K */
    private final Rect f2459K = new Rect();

    /* renamed from: L */
    private final C0601b f2460L = new C0601b();

    /* renamed from: M */
    private boolean f2461M = false;

    /* renamed from: N */
    private boolean f2462N = true;

    /* renamed from: O */
    private int[] f2463O;

    /* renamed from: P */
    private final Runnable f2464P = new C0600a();

    /* renamed from: s */
    private int f2465s = -1;

    /* renamed from: t */
    C0608f[] f2466t;

    /* renamed from: u */
    C0662r f2467u;

    /* renamed from: v */
    C0662r f2468v;

    /* renamed from: w */
    private int f2469w;

    /* renamed from: x */
    private int f2470x;

    /* renamed from: y */
    private final C0654l f2471y;

    /* renamed from: z */
    boolean f2472z = false;

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C0600a implements Runnable {
        C0600a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo3718G();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C0601b {

        /* renamed from: a */
        int f2474a;

        /* renamed from: b */
        int f2475b;

        /* renamed from: c */
        boolean f2476c;

        /* renamed from: d */
        boolean f2477d;

        /* renamed from: e */
        boolean f2478e;

        /* renamed from: f */
        int[] f2479f;

        C0601b() {
            mo3739b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3736a() {
            this.f2475b = this.f2476c ? StaggeredGridLayoutManager.this.f2467u.mo3942b() : StaggeredGridLayoutManager.this.f2467u.mo3950f();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3737a(int i) {
            this.f2475b = this.f2476c ? StaggeredGridLayoutManager.this.f2467u.mo3942b() - i : StaggeredGridLayoutManager.this.f2467u.mo3950f() + i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3738a(C0608f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f2479f;
            if (iArr == null || iArr.length < length) {
                this.f2479f = new int[StaggeredGridLayoutManager.this.f2466t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f2479f[i] = fVarArr[i].mo3773b((int) RecyclerView.UNDEFINED_DURATION);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3739b() {
            this.f2474a = -1;
            this.f2475b = RecyclerView.UNDEFINED_DURATION;
            this.f2476c = false;
            this.f2477d = false;
            this.f2478e = false;
            int[] iArr = this.f2479f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public static class C0602c extends C0585p {

        /* renamed from: e */
        C0608f f2481e;

        /* renamed from: f */
        boolean f2482f;

        public C0602c(int i, int i2) {
            super(i, i2);
        }

        public C0602c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0602c(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0602c(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* renamed from: e */
        public final int mo3740e() {
            C0608f fVar = this.f2481e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f2503e;
        }

        /* renamed from: f */
        public boolean mo3741f() {
            return this.f2482f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d */
    static class C0603d {

        /* renamed from: a */
        int[] f2483a;

        /* renamed from: b */
        List<C0604a> f2484b;

        @SuppressLint({"BanParcelableUsage"})
        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a */
        static class C0604a implements Parcelable {
            public static final Creator<C0604a> CREATOR = new C0605a();

            /* renamed from: f */
            int f2485f;

            /* renamed from: g */
            int f2486g;

            /* renamed from: h */
            int[] f2487h;

            /* renamed from: i */
            boolean f2488i;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            static class C0605a implements Creator<C0604a> {
                C0605a() {
                }

                public C0604a createFromParcel(Parcel parcel) {
                    return new C0604a(parcel);
                }

                public C0604a[] newArray(int i) {
                    return new C0604a[i];
                }
            }

            C0604a() {
            }

            C0604a(Parcel parcel) {
                this.f2485f = parcel.readInt();
                this.f2486g = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f2488i = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f2487h = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo3754a(int i) {
                int[] iArr = this.f2487h;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f2485f);
                sb.append(", mGapDir=");
                sb.append(this.f2486g);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f2488i);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f2487h));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f2485f);
                parcel.writeInt(this.f2486g);
                parcel.writeInt(this.f2488i ? 1 : 0);
                int[] iArr = this.f2487h;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f2487h);
            }
        }

        C0603d() {
        }

        /* renamed from: c */
        private void m3462c(int i, int i2) {
            List<C0604a> list = this.f2484b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0604a aVar = (C0604a) this.f2484b.get(size);
                    int i3 = aVar.f2485f;
                    if (i3 >= i) {
                        aVar.f2485f = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: d */
        private void m3463d(int i, int i2) {
            List<C0604a> list = this.f2484b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0604a aVar = (C0604a) this.f2484b.get(size);
                    int i4 = aVar.f2485f;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f2484b.remove(size);
                        } else {
                            aVar.f2485f = i4 - i2;
                        }
                    }
                }
            }
        }

        /* renamed from: g */
        private int m3464g(int i) {
            if (this.f2484b == null) {
                return -1;
            }
            C0604a c = mo3750c(i);
            if (c != null) {
                this.f2484b.remove(c);
            }
            int size = this.f2484b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((C0604a) this.f2484b.get(i2)).f2485f >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            C0604a aVar = (C0604a) this.f2484b.get(i2);
            this.f2484b.remove(i2);
            return aVar.f2485f;
        }

        /* renamed from: a */
        public C0604a mo3742a(int i, int i2, int i3, boolean z) {
            List<C0604a> list = this.f2484b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C0604a aVar = (C0604a) this.f2484b.get(i4);
                int i5 = aVar.f2485f;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f2486g == i3 || (z && aVar.f2488i))) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3743a() {
            int[] iArr = this.f2483a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2484b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3744a(int i) {
            int[] iArr = this.f2483a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f2483a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int[] iArr3 = new int[mo3753f(i)];
                this.f2483a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f2483a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3745a(int i, int i2) {
            int[] iArr = this.f2483a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3744a(i3);
                int[] iArr2 = this.f2483a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f2483a, i, i3, -1);
                m3462c(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3746a(int i, C0608f fVar) {
            mo3744a(i);
            this.f2483a[i] = fVar.f2503e;
        }

        /* renamed from: a */
        public void mo3747a(C0604a aVar) {
            if (this.f2484b == null) {
                this.f2484b = new ArrayList();
            }
            int size = this.f2484b.size();
            for (int i = 0; i < size; i++) {
                C0604a aVar2 = (C0604a) this.f2484b.get(i);
                if (aVar2.f2485f == aVar.f2485f) {
                    this.f2484b.remove(i);
                }
                if (aVar2.f2485f >= aVar.f2485f) {
                    this.f2484b.add(i, aVar);
                    return;
                }
            }
            this.f2484b.add(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3748b(int i) {
            List<C0604a> list = this.f2484b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((C0604a) this.f2484b.get(size)).f2485f >= i) {
                        this.f2484b.remove(size);
                    }
                }
            }
            return mo3752e(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3749b(int i, int i2) {
            int[] iArr = this.f2483a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo3744a(i3);
                int[] iArr2 = this.f2483a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f2483a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m3463d(i, i2);
            }
        }

        /* renamed from: c */
        public C0604a mo3750c(int i) {
            List<C0604a> list = this.f2484b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                C0604a aVar = (C0604a) this.f2484b.get(size);
                if (aVar.f2485f == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo3751d(int i) {
            int[] iArr = this.f2483a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo3752e(int i) {
            int[] iArr = this.f2483a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m3464g(i);
            if (g == -1) {
                int[] iArr2 = this.f2483a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f2483a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f2483a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo3753f(int i) {
            int length = this.f2483a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e */
    public static class C0606e implements Parcelable {
        public static final Creator<C0606e> CREATOR = new C0607a();

        /* renamed from: f */
        int f2489f;

        /* renamed from: g */
        int f2490g;

        /* renamed from: h */
        int f2491h;

        /* renamed from: i */
        int[] f2492i;

        /* renamed from: j */
        int f2493j;

        /* renamed from: k */
        int[] f2494k;

        /* renamed from: l */
        List<C0604a> f2495l;

        /* renamed from: m */
        boolean f2496m;

        /* renamed from: n */
        boolean f2497n;

        /* renamed from: o */
        boolean f2498o;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$e$a */
        static class C0607a implements Creator<C0606e> {
            C0607a() {
            }

            public C0606e createFromParcel(Parcel parcel) {
                return new C0606e(parcel);
            }

            public C0606e[] newArray(int i) {
                return new C0606e[i];
            }
        }

        public C0606e() {
        }

        C0606e(Parcel parcel) {
            this.f2489f = parcel.readInt();
            this.f2490g = parcel.readInt();
            int readInt = parcel.readInt();
            this.f2491h = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f2492i = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f2493j = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f2494k = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f2496m = parcel.readInt() == 1;
            this.f2497n = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f2498o = z;
            this.f2495l = parcel.readArrayList(C0604a.class.getClassLoader());
        }

        public C0606e(C0606e eVar) {
            this.f2491h = eVar.f2491h;
            this.f2489f = eVar.f2489f;
            this.f2490g = eVar.f2490g;
            this.f2492i = eVar.f2492i;
            this.f2493j = eVar.f2493j;
            this.f2494k = eVar.f2494k;
            this.f2496m = eVar.f2496m;
            this.f2497n = eVar.f2497n;
            this.f2498o = eVar.f2498o;
            this.f2495l = eVar.f2495l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3760a() {
            this.f2492i = null;
            this.f2491h = 0;
            this.f2489f = -1;
            this.f2490g = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3761b() {
            this.f2492i = null;
            this.f2491h = 0;
            this.f2493j = 0;
            this.f2494k = null;
            this.f2495l = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2489f);
            parcel.writeInt(this.f2490g);
            parcel.writeInt(this.f2491h);
            if (this.f2491h > 0) {
                parcel.writeIntArray(this.f2492i);
            }
            parcel.writeInt(this.f2493j);
            if (this.f2493j > 0) {
                parcel.writeIntArray(this.f2494k);
            }
            parcel.writeInt(this.f2496m ? 1 : 0);
            parcel.writeInt(this.f2497n ? 1 : 0);
            parcel.writeInt(this.f2498o ? 1 : 0);
            parcel.writeList(this.f2495l);
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$f */
    class C0608f {

        /* renamed from: a */
        ArrayList<View> f2499a = new ArrayList<>();

        /* renamed from: b */
        int f2500b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        int f2501c = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: d */
        int f2502d = 0;

        /* renamed from: e */
        final int f2503e;

        C0608f(int i) {
            this.f2503e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3766a(int i) {
            int i2 = this.f2501c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2499a.size() == 0) {
                return i;
            }
            mo3770a();
            return this.f2501c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3767a(int i, int i2, boolean z) {
            return mo3768a(i, i2, false, false, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo3768a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f2467u.mo3950f();
            int b = StaggeredGridLayoutManager.this.f2467u.mo3942b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f2499a.get(i);
                int d = StaggeredGridLayoutManager.this.f2467u.mo3947d(view);
                int a = StaggeredGridLayoutManager.this.f2467u.mo3940a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d >= f && a <= b) {
                        }
                    } else if (d >= f && a <= b) {
                    }
                    return StaggeredGridLayoutManager.this.mo3608l(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: a */
        public View mo3769a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f2499a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f2499a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f2472z && staggeredGridLayoutManager.mo3608l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f2472z && staggeredGridLayoutManager2.mo3608l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f2499a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f2499a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f2472z && staggeredGridLayoutManager3.mo3608l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f2472z && staggeredGridLayoutManager4.mo3608l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3770a() {
            ArrayList<View> arrayList = this.f2499a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            C0602c b = mo3774b(view);
            this.f2501c = StaggeredGridLayoutManager.this.f2467u.mo3940a(view);
            if (b.f2482f) {
                C0604a c = StaggeredGridLayoutManager.this.f2453E.mo3750c(b.mo3630a());
                if (c != null && c.f2486g == 1) {
                    this.f2501c += c.mo3754a(this.f2503e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3771a(View view) {
            C0602c b = mo3774b(view);
            b.f2481e = this;
            this.f2499a.add(view);
            this.f2501c = RecyclerView.UNDEFINED_DURATION;
            if (this.f2499a.size() == 1) {
                this.f2500b = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo3632c() || b.mo3631b()) {
                this.f2502d += StaggeredGridLayoutManager.this.f2467u.mo3943b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3772a(boolean z, int i) {
            int a = z ? mo3766a((int) RecyclerView.UNDEFINED_DURATION) : mo3773b((int) RecyclerView.UNDEFINED_DURATION);
            mo3776c();
            if (a != Integer.MIN_VALUE) {
                if ((!z || a >= StaggeredGridLayoutManager.this.f2467u.mo3942b()) && (z || a <= StaggeredGridLayoutManager.this.f2467u.mo3950f())) {
                    if (i != Integer.MIN_VALUE) {
                        a += i;
                    }
                    this.f2501c = a;
                    this.f2500b = a;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo3773b(int i) {
            int i2 = this.f2500b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f2499a.size() == 0) {
                return i;
            }
            mo3775b();
            return this.f2500b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0602c mo3774b(View view) {
            return (C0602c) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3775b() {
            View view = (View) this.f2499a.get(0);
            C0602c b = mo3774b(view);
            this.f2500b = StaggeredGridLayoutManager.this.f2467u.mo3947d(view);
            if (b.f2482f) {
                C0604a c = StaggeredGridLayoutManager.this.f2453E.mo3750c(b.mo3630a());
                if (c != null && c.f2486g == -1) {
                    this.f2500b -= c.mo3754a(this.f2503e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3776c() {
            this.f2499a.clear();
            mo3785i();
            this.f2502d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3777c(int i) {
            int i2 = this.f2500b;
            if (i2 != Integer.MIN_VALUE) {
                this.f2500b = i2 + i;
            }
            int i3 = this.f2501c;
            if (i3 != Integer.MIN_VALUE) {
                this.f2501c = i3 + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3778c(View view) {
            C0602c b = mo3774b(view);
            b.f2481e = this;
            this.f2499a.add(0, view);
            this.f2500b = RecyclerView.UNDEFINED_DURATION;
            if (this.f2499a.size() == 1) {
                this.f2501c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo3632c() || b.mo3631b()) {
                this.f2502d += StaggeredGridLayoutManager.this.f2467u.mo3943b(view);
            }
        }

        /* renamed from: d */
        public int mo3779d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2472z) {
                i2 = this.f2499a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f2499a.size();
            }
            return mo3767a(i2, i, true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3780d(int i) {
            this.f2500b = i;
            this.f2501c = i;
        }

        /* renamed from: e */
        public int mo3781e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.f2472z) {
                i2 = 0;
                i = this.f2499a.size();
            } else {
                i2 = this.f2499a.size() - 1;
                i = -1;
            }
            return mo3767a(i2, i, true);
        }

        /* renamed from: f */
        public int mo3782f() {
            return this.f2502d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int mo3783g() {
            int i = this.f2501c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3770a();
            return this.f2501c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo3784h() {
            int i = this.f2500b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo3775b();
            return this.f2500b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo3785i() {
            this.f2500b = RecyclerView.UNDEFINED_DURATION;
            this.f2501c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo3786j() {
            int size = this.f2499a.size();
            View view = (View) this.f2499a.remove(size - 1);
            C0602c b = mo3774b(view);
            b.f2481e = null;
            if (b.mo3632c() || b.mo3631b()) {
                this.f2502d -= StaggeredGridLayoutManager.this.f2467u.mo3943b(view);
            }
            if (size == 1) {
                this.f2500b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f2501c = RecyclerView.UNDEFINED_DURATION;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo3787k() {
            View view = (View) this.f2499a.remove(0);
            C0602c b = mo3774b(view);
            b.f2481e = null;
            if (this.f2499a.size() == 0) {
                this.f2501c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b.mo3632c() || b.mo3631b()) {
                this.f2502d -= StaggeredGridLayoutManager.this.f2467u.mo3943b(view);
            }
            this.f2500b = RecyclerView.UNDEFINED_DURATION;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C0584d a = C0580o.m3113a(context, attributeSet, i, i2);
        mo3732j(a.f2409a);
        mo3733k(a.f2410b);
        mo3731c(a.f2411c);
        this.f2471y = new C0654l();
        m3358N();
    }

    /* renamed from: N */
    private void m3358N() {
        this.f2467u = C0662r.m3735a(this, this.f2469w);
        this.f2468v = C0662r.m3735a(this, 1 - this.f2469w);
    }

    /* renamed from: O */
    private void m3359O() {
        if (this.f2468v.mo3946d() != 1073741824) {
            float f = 0.0f;
            int e = mo3587e();
            for (int i = 0; i < e; i++) {
                View d = mo3583d(i);
                float b = (float) this.f2468v.mo3943b(d);
                if (b >= f) {
                    if (((C0602c) d.getLayoutParams()).mo3741f()) {
                        b = (b * 1.0f) / ((float) this.f2465s);
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f2470x;
            int round = Math.round(f * ((float) this.f2465s));
            if (this.f2468v.mo3946d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f2468v.mo3952g());
            }
            mo3734l(round);
            if (this.f2470x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View d2 = mo3583d(i3);
                    C0602c cVar = (C0602c) d2.getLayoutParams();
                    if (!cVar.f2482f) {
                        if (!mo3724M() || this.f2469w != 1) {
                            int i4 = cVar.f2481e.f2503e;
                            int i5 = (this.f2470x * i4) - (i4 * i2);
                            if (this.f2469w == 1) {
                                d2.offsetLeftAndRight(i5);
                            } else {
                                d2.offsetTopAndBottom(i5);
                            }
                        } else {
                            int i6 = this.f2465s;
                            int i7 = i6 - 1;
                            int i8 = cVar.f2481e.f2503e;
                            d2.offsetLeftAndRight(((-(i7 - i8)) * this.f2470x) - ((-((i6 - 1) - i8)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: P */
    private void m3360P() {
        this.f2449A = (this.f2469w == 1 || !mo3724M()) ? this.f2472z : !this.f2472z;
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: type inference failed for: r9v11 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [int, boolean]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 219
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m3361a(androidx.recyclerview.widget.RecyclerView.C0592v r17, androidx.recyclerview.widget.C0654l r18, androidx.recyclerview.widget.RecyclerView.C0560a0 r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f2450B
            int r1 = r6.f2465s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.l r0 = r6.f2471y
            boolean r0 = r0.f2687i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f2683e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0035
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0035
        L_0x0025:
            int r0 = r8.f2683e
            if (r0 != r10) goto L_0x002f
            int r0 = r8.f2685g
            int r1 = r8.f2680b
            int r0 = r0 + r1
            goto L_0x0034
        L_0x002f:
            int r0 = r8.f2684f
            int r1 = r8.f2680b
            int r0 = r0 - r1
        L_0x0034:
            r11 = r0
        L_0x0035:
            int r0 = r8.f2683e
            r6.m3379e(r0, r11)
            boolean r0 = r6.f2449A
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.r r0 = r6.f2467u
            int r0 = r0.mo3942b()
            goto L_0x004b
        L_0x0045:
            androidx.recyclerview.widget.r r0 = r6.f2467u
            int r0 = r0.mo3950f()
        L_0x004b:
            r12 = r0
            r0 = 0
        L_0x004d:
            boolean r1 = r18.mo3918a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ca
            androidx.recyclerview.widget.l r1 = r6.f2471y
            boolean r1 = r1.f2687i
            if (r1 != 0) goto L_0x0062
            java.util.BitSet r1 = r6.f2450B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ca
        L_0x0062:
            android.view.View r13 = r8.mo3917a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0602c) r14
            int r0 = r14.mo3630a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f2453E
            int r1 = r1.mo3751d(r0)
            if (r1 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0091
            boolean r1 = r14.f2482f
            if (r1 == 0) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.f2466t
            r1 = r1[r9]
            goto L_0x008b
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r1 = r6.m3362a(r8)
        L_0x008b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2453E
            r4.mo3746a(r0, r1)
            goto L_0x0095
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r4 = r6.f2466t
            r1 = r4[r1]
        L_0x0095:
            r15 = r1
            r14.f2481e = r15
            int r1 = r8.f2683e
            if (r1 != r10) goto L_0x00a0
            r6.mo3567b(r13)
            goto L_0x00a3
        L_0x00a0:
            r6.mo3568b(r13, r9)
        L_0x00a3:
            r6.m3365a(r13, r14, r9)
            int r1 = r8.f2683e
            if (r1 != r10) goto L_0x00d4
            boolean r1 = r14.f2482f
            if (r1 == 0) goto L_0x00b3
            int r1 = r6.m3391s(r12)
            goto L_0x00b7
        L_0x00b3:
            int r1 = r15.mo3766a(r12)
        L_0x00b7:
            androidx.recyclerview.widget.r r4 = r6.f2467u
            int r4 = r4.mo3943b(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d1
            boolean r5 = r14.f2482f
            if (r5 == 0) goto L_0x00d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m3385o(r1)
            r5.f2486g = r2
            r5.f2485f = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2453E
            r9.mo3747a(r5)
        L_0x00d1:
            r5 = r4
            r4 = r1
            goto L_0x00fd
        L_0x00d4:
            boolean r1 = r14.f2482f
            if (r1 == 0) goto L_0x00dd
            int r1 = r6.m3394v(r12)
            goto L_0x00e1
        L_0x00dd:
            int r1 = r15.mo3773b(r12)
        L_0x00e1:
            androidx.recyclerview.widget.r r4 = r6.f2467u
            int r4 = r4.mo3943b(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fc
            boolean r5 = r14.f2482f
            if (r5 == 0) goto L_0x00fc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r5 = r6.m3386p(r1)
            r5.f2486g = r10
            r5.f2485f = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2453E
            r9.mo3747a(r5)
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            boolean r1 = r14.f2482f
            if (r1 == 0) goto L_0x0125
            int r1 = r8.f2682d
            if (r1 != r2) goto L_0x0125
            if (r3 == 0) goto L_0x010a
        L_0x0107:
            r6.f2461M = r10
            goto L_0x0125
        L_0x010a:
            int r1 = r8.f2683e
            if (r1 != r10) goto L_0x0113
            boolean r1 = r16.mo3716E()
            goto L_0x0117
        L_0x0113:
            boolean r1 = r16.mo3717F()
        L_0x0117:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0125
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.f2453E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r1.mo3750c(r0)
            if (r0 == 0) goto L_0x0107
            r0.f2488i = r10
            goto L_0x0107
        L_0x0125:
            r6.m3364a(r13, r14, r8)
            boolean r0 = r16.mo3724M()
            if (r0 == 0) goto L_0x0159
            int r0 = r6.f2469w
            if (r0 != r10) goto L_0x0159
            boolean r0 = r14.f2482f
            if (r0 == 0) goto L_0x013d
            androidx.recyclerview.widget.r r0 = r6.f2468v
            int r0 = r0.mo3942b()
            goto L_0x014e
        L_0x013d:
            androidx.recyclerview.widget.r r0 = r6.f2468v
            int r0 = r0.mo3942b()
            int r1 = r6.f2465s
            int r1 = r1 - r10
            int r2 = r15.f2503e
            int r1 = r1 - r2
            int r2 = r6.f2470x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014e:
            androidx.recyclerview.widget.r r1 = r6.f2468v
            int r1 = r1.mo3943b(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017a
        L_0x0159:
            boolean r0 = r14.f2482f
            if (r0 == 0) goto L_0x0164
            androidx.recyclerview.widget.r r0 = r6.f2468v
            int r0 = r0.mo3950f()
            goto L_0x0171
        L_0x0164:
            int r0 = r15.f2503e
            int r1 = r6.f2470x
            int r0 = r0 * r1
            androidx.recyclerview.widget.r r1 = r6.f2468v
            int r1 = r1.mo3950f()
            int r0 = r0 + r1
        L_0x0171:
            androidx.recyclerview.widget.r r1 = r6.f2468v
            int r1 = r1.mo3943b(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017a:
            int r0 = r6.f2469w
            if (r0 != r10) goto L_0x0185
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            goto L_0x018b
        L_0x0185:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
        L_0x018b:
            r0.mo3538a(r1, r2, r3, r4, r5)
            boolean r0 = r14.f2482f
            if (r0 == 0) goto L_0x019a
            androidx.recyclerview.widget.l r0 = r6.f2471y
            int r0 = r0.f2683e
            r6.m3379e(r0, r11)
            goto L_0x01a1
        L_0x019a:
            androidx.recyclerview.widget.l r0 = r6.f2471y
            int r0 = r0.f2683e
            r6.m3370a(r15, r0, r11)
        L_0x01a1:
            androidx.recyclerview.widget.l r0 = r6.f2471y
            r6.m3368a(r7, r0)
            androidx.recyclerview.widget.l r0 = r6.f2471y
            boolean r0 = r0.f2686h
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r14.f2482f
            if (r0 == 0) goto L_0x01bc
            java.util.BitSet r0 = r6.f2450B
            r0.clear()
            goto L_0x01c5
        L_0x01bc:
            java.util.BitSet r0 = r6.f2450B
            int r1 = r15.f2503e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01c6
        L_0x01c5:
            r3 = 0
        L_0x01c6:
            r0 = 1
            r9 = 0
            goto L_0x004d
        L_0x01ca:
            r3 = 0
            if (r0 != 0) goto L_0x01d2
            androidx.recyclerview.widget.l r0 = r6.f2471y
            r6.m3368a(r7, r0)
        L_0x01d2:
            androidx.recyclerview.widget.l r0 = r6.f2471y
            int r0 = r0.f2683e
            if (r0 != r2) goto L_0x01ea
            androidx.recyclerview.widget.r r0 = r6.f2467u
            int r0 = r0.mo3950f()
            int r0 = r6.m3394v(r0)
            androidx.recyclerview.widget.r r1 = r6.f2467u
            int r1 = r1.mo3950f()
            int r1 = r1 - r0
            goto L_0x01fc
        L_0x01ea:
            androidx.recyclerview.widget.r r0 = r6.f2467u
            int r0 = r0.mo3942b()
            int r0 = r6.m3391s(r0)
            androidx.recyclerview.widget.r r1 = r6.f2467u
            int r1 = r1.mo3942b()
            int r1 = r0 - r1
        L_0x01fc:
            if (r1 <= 0) goto L_0x0205
            int r0 = r8.f2680b
            int r9 = java.lang.Math.min(r0, r1)
            goto L_0x0206
        L_0x0205:
            r9 = 0
        L_0x0206:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3361a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.l, androidx.recyclerview.widget.RecyclerView$a0):int");
    }

    /* renamed from: a */
    private C0608f m3362a(C0654l lVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m3395w(lVar.f2683e)) {
            i2 = this.f2465s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f2465s;
            i = 1;
        }
        C0608f fVar = null;
        if (lVar.f2683e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f2467u.mo3950f();
            while (i2 != i3) {
                C0608f fVar2 = this.f2466t[i2];
                int a = fVar2.mo3766a(f);
                if (a < i4) {
                    fVar = fVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int b = this.f2467u.mo3942b();
        while (i2 != i3) {
            C0608f fVar3 = this.f2466t[i2];
            int b2 = fVar3.mo3773b(b);
            if (b2 > i5) {
                fVar = fVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return fVar;
    }

    /* renamed from: a */
    private void m3363a(View view, int i, int i2, boolean z) {
        mo3540a(view, this.f2459K);
        C0602c cVar = (C0602c) view.getLayoutParams();
        int i3 = cVar.leftMargin;
        Rect rect = this.f2459K;
        int c = m3376c(i, i3 + rect.left, cVar.rightMargin + rect.right);
        int i4 = cVar.topMargin;
        Rect rect2 = this.f2459K;
        int c2 = m3376c(i2, i4 + rect2.top, cVar.bottomMargin + rect2.bottom);
        if (z ? mo3573b(view, c, c2, cVar) : mo3554a(view, c, c2, (C0585p) cVar)) {
            view.measure(c, c2);
        }
    }

    /* renamed from: a */
    private void m3364a(View view, C0602c cVar, C0654l lVar) {
        if (lVar.f2683e == 1) {
            if (cVar.f2482f) {
                m3387p(view);
            } else {
                cVar.f2481e.mo3771a(view);
            }
        } else if (cVar.f2482f) {
            m3389q(view);
        } else {
            cVar.f2481e.mo3778c(view);
        }
    }

    /* renamed from: a */
    private void m3365a(View view, C0602c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f2482f) {
            if (this.f2469w == 1) {
                i2 = this.f2458J;
            } else {
                m3363a(view, C0580o.m3112a(mo3617r(), mo3618s(), mo3613o() + mo3615p(), cVar.width, true), this.f2458J, z);
                return;
            }
        } else if (this.f2469w == 1) {
            i2 = C0580o.m3112a(this.f2470x, mo3618s(), 0, cVar.width, false);
        } else {
            i2 = C0580o.m3112a(mo3617r(), mo3618s(), mo3613o() + mo3615p(), cVar.width, true);
            i = C0580o.m3112a(this.f2470x, mo3601i(), 0, cVar.height, false);
            m3363a(view, i2, i, z);
        }
        i = C0580o.m3112a(mo3598h(), mo3601i(), mo3616q() + mo3611n(), cVar.height, true);
        m3363a(view, i2, i, z);
    }

    /* renamed from: a */
    private void m3366a(C0592v vVar, int i) {
        for (int e = mo3587e() - 1; e >= 0; e--) {
            View d = mo3583d(e);
            if (this.f2467u.mo3947d(d) < i || this.f2467u.mo3951f(d) < i) {
                break;
            }
            C0602c cVar = (C0602c) d.getLayoutParams();
            if (cVar.f2482f) {
                int i2 = 0;
                while (i2 < this.f2465s) {
                    if (this.f2466t[i2].f2499a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2465s; i3++) {
                    this.f2466t[i3].mo3786j();
                }
            } else if (cVar.f2481e.f2499a.size() != 1) {
                cVar.f2481e.mo3786j();
            } else {
                return;
            }
            mo3541a(d, vVar);
        }
    }

    /* renamed from: a */
    private void m3367a(C0592v vVar, C0560a0 a0Var, boolean z) {
        int s = m3391s(RecyclerView.UNDEFINED_DURATION);
        if (s != Integer.MIN_VALUE) {
            int b = this.f2467u.mo3942b() - s;
            if (b > 0) {
                int i = b - (-mo3730c(-b, vVar, a0Var));
                if (z && i > 0) {
                    this.f2467u.mo3941a(i);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.f2683e == -1) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3368a(androidx.recyclerview.widget.RecyclerView.C0592v r3, androidx.recyclerview.widget.C0654l r4) {
        /*
            r2 = this;
            boolean r0 = r4.f2679a
            if (r0 == 0) goto L_0x004d
            boolean r0 = r4.f2687i
            if (r0 == 0) goto L_0x0009
            goto L_0x004d
        L_0x0009:
            int r0 = r4.f2680b
            r1 = -1
            if (r0 != 0) goto L_0x001e
            int r0 = r4.f2683e
            if (r0 != r1) goto L_0x0018
        L_0x0012:
            int r4 = r4.f2685g
        L_0x0014:
            r2.m3366a(r3, r4)
            goto L_0x004d
        L_0x0018:
            int r4 = r4.f2684f
        L_0x001a:
            r2.m3374b(r3, r4)
            goto L_0x004d
        L_0x001e:
            int r0 = r4.f2683e
            if (r0 != r1) goto L_0x0037
            int r0 = r4.f2684f
            int r1 = r2.m3392t(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x002c
            goto L_0x0012
        L_0x002c:
            int r1 = r4.f2685g
            int r4 = r4.f2680b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L_0x0014
        L_0x0037:
            int r0 = r4.f2685g
            int r0 = r2.m3393u(r0)
            int r1 = r4.f2685g
            int r0 = r0 - r1
            if (r0 >= 0) goto L_0x0043
            goto L_0x0018
        L_0x0043:
            int r1 = r4.f2684f
            int r4 = r4.f2680b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L_0x001a
        L_0x004d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3368a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.l):void");
    }

    /* renamed from: a */
    private void m3369a(C0601b bVar) {
        boolean z;
        C0606e eVar = this.f2457I;
        int i = eVar.f2491h;
        if (i > 0) {
            if (i == this.f2465s) {
                for (int i2 = 0; i2 < this.f2465s; i2++) {
                    this.f2466t[i2].mo3776c();
                    C0606e eVar2 = this.f2457I;
                    int i3 = eVar2.f2492i[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.f2497n ? this.f2467u.mo3942b() : this.f2467u.mo3950f();
                    }
                    this.f2466t[i2].mo3780d(i3);
                }
            } else {
                eVar.mo3761b();
                C0606e eVar3 = this.f2457I;
                eVar3.f2489f = eVar3.f2490g;
            }
        }
        C0606e eVar4 = this.f2457I;
        this.f2456H = eVar4.f2498o;
        mo3731c(eVar4.f2496m);
        m3360P();
        C0606e eVar5 = this.f2457I;
        int i4 = eVar5.f2489f;
        if (i4 != -1) {
            this.f2451C = i4;
            z = eVar5.f2497n;
        } else {
            z = this.f2449A;
        }
        bVar.f2476c = z;
        C0606e eVar6 = this.f2457I;
        if (eVar6.f2493j > 1) {
            C0603d dVar = this.f2453E;
            dVar.f2483a = eVar6.f2494k;
            dVar.f2484b = eVar6.f2495l;
        }
    }

    /* renamed from: a */
    private void m3370a(C0608f fVar, int i, int i2) {
        int f = fVar.mo3782f();
        if (i == -1) {
            if (fVar.mo3784h() + f > i2) {
                return;
            }
        } else if (fVar.mo3783g() - f < i2) {
            return;
        }
        this.f2450B.set(fVar.f2503e, false);
    }

    /* renamed from: a */
    private boolean m3371a(C0608f fVar) {
        if (this.f2449A) {
            if (fVar.mo3783g() < this.f2467u.mo3942b()) {
                ArrayList<View> arrayList = fVar.f2499a;
                return !fVar.mo3774b((View) arrayList.get(arrayList.size() - 1)).f2482f;
            }
        } else if (fVar.mo3784h() > this.f2467u.mo3950f()) {
            return !fVar.mo3774b((View) fVar.f2499a.get(0)).f2482f;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3372b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f2449A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo3721J()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo3720I()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f2453E
            r4.mo3752e(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2453E
            r9.mo3749b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f2453E
            r7.mo3745a(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2453E
            r9.mo3749b(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f2453E
            r9.mo3745a(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f2449A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo3720I()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo3721J()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo3623z()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3372b(int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3373b(int r5, androidx.recyclerview.widget.RecyclerView.C0560a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.l r0 = r4.f2471y
            r1 = 0
            r0.f2680b = r1
            r0.f2681c = r5
            boolean r0 = r4.mo3622x()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo3387b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f2449A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.r r5 = r4.f2467u
            int r5 = r5.mo3952g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.r r5 = r4.f2467u
            int r5 = r5.mo3952g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo3594f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.l r0 = r4.f2471y
            androidx.recyclerview.widget.r r3 = r4.f2467u
            int r3 = r3.mo3950f()
            int r3 = r3 - r6
            r0.f2684f = r3
            androidx.recyclerview.widget.l r6 = r4.f2471y
            androidx.recyclerview.widget.r r0 = r4.f2467u
            int r0 = r0.mo3942b()
            int r0 = r0 + r5
            r6.f2685g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.l r0 = r4.f2471y
            androidx.recyclerview.widget.r r3 = r4.f2467u
            int r3 = r3.mo3939a()
            int r3 = r3 + r5
            r0.f2685g = r3
            androidx.recyclerview.widget.l r5 = r4.f2471y
            int r6 = -r6
            r5.f2684f = r6
        L_0x005d:
            androidx.recyclerview.widget.l r5 = r4.f2471y
            r5.f2686h = r1
            r5.f2679a = r2
            androidx.recyclerview.widget.r r6 = r4.f2467u
            int r6 = r6.mo3946d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.r r6 = r4.f2467u
            int r6 = r6.mo3939a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f2687i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3373b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    /* renamed from: b */
    private void m3374b(C0592v vVar, int i) {
        while (mo3587e() > 0) {
            View d = mo3583d(0);
            if (this.f2467u.mo3940a(d) > i || this.f2467u.mo3949e(d) > i) {
                break;
            }
            C0602c cVar = (C0602c) d.getLayoutParams();
            if (cVar.f2482f) {
                int i2 = 0;
                while (i2 < this.f2465s) {
                    if (this.f2466t[i2].f2499a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f2465s; i3++) {
                    this.f2466t[i3].mo3787k();
                }
            } else if (cVar.f2481e.f2499a.size() != 1) {
                cVar.f2481e.mo3787k();
            } else {
                return;
            }
            mo3541a(d, vVar);
        }
    }

    /* renamed from: b */
    private void m3375b(C0592v vVar, C0560a0 a0Var, boolean z) {
        int v = m3394v(Integer.MAX_VALUE);
        if (v != Integer.MAX_VALUE) {
            int f = v - this.f2467u.mo3950f();
            if (f > 0) {
                int c = f - mo3730c(f, vVar, a0Var);
                if (z && c > 0) {
                    this.f2467u.mo3941a(-c);
                }
            }
        }
    }

    /* renamed from: c */
    private int m3376c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x014b, code lost:
        if (mo3718G() != false) goto L_0x014f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3377c(androidx.recyclerview.widget.RecyclerView.C0592v r9, androidx.recyclerview.widget.RecyclerView.C0560a0 r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f2460L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2457I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f2451C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo3384a()
            if (r1 != 0) goto L_0x0018
            r8.mo3570b(r9)
            r0.mo3739b()
            return
        L_0x0018:
            boolean r1 = r0.f2478e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f2451C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r8.f2457I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo3739b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2457I
            if (r5 == 0) goto L_0x0037
            r8.m3369a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m3360P()
            boolean r5 = r8.f2449A
            r0.f2476c = r5
        L_0x003e:
            r8.mo3729b(r10, r0)
            r0.f2478e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2457I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f2451C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f2476c
            boolean r6 = r8.f2455G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo3724M()
            boolean r6 = r8.f2456H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r5 = r8.f2453E
            r5.mo3743a()
            r0.f2477d = r4
        L_0x0060:
            int r5 = r8.mo3587e()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r5 = r8.f2457I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f2491h
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f2477d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f2465s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2466t
            r5 = r5[r1]
            r5.mo3776c()
            int r5 = r0.f2475b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r6 = r8.f2466t
            r6 = r6[r1]
            r6.mo3780d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2460L
            int[] r1 = r1.f2479f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f2465s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2466t
            r5 = r5[r1]
            r5.mo3776c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f2460L
            int[] r6 = r6.f2479f
            r6 = r6[r1]
            r5.mo3780d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f2465s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2466t
            r5 = r5[r1]
            boolean r6 = r8.f2449A
            int r7 = r0.f2475b
            r5.mo3772a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f2460L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r5 = r8.f2466t
            r1.mo3738a(r5)
        L_0x00c9:
            r8.mo3545a(r9)
            androidx.recyclerview.widget.l r1 = r8.f2471y
            r1.f2679a = r3
            r8.f2461M = r3
            androidx.recyclerview.widget.r r1 = r8.f2468v
            int r1 = r1.mo3952g()
            r8.mo3734l(r1)
            int r1 = r0.f2474a
            r8.m3373b(r1, r10)
            boolean r1 = r0.f2476c
            if (r1 == 0) goto L_0x00f0
            r8.m3396x(r2)
            androidx.recyclerview.widget.l r1 = r8.f2471y
            r8.m3361a(r9, r1, r10)
            r8.m3396x(r4)
            goto L_0x00fb
        L_0x00f0:
            r8.m3396x(r4)
            androidx.recyclerview.widget.l r1 = r8.f2471y
            r8.m3361a(r9, r1, r10)
            r8.m3396x(r2)
        L_0x00fb:
            androidx.recyclerview.widget.l r1 = r8.f2471y
            int r2 = r0.f2474a
            int r5 = r1.f2682d
            int r2 = r2 + r5
            r1.f2681c = r2
            r8.m3361a(r9, r1, r10)
            r8.m3359O()
            int r1 = r8.mo3587e()
            if (r1 <= 0) goto L_0x0121
            boolean r1 = r8.f2449A
            if (r1 == 0) goto L_0x011b
            r8.m3367a(r9, r10, r4)
            r8.m3375b(r9, r10, r3)
            goto L_0x0121
        L_0x011b:
            r8.m3375b(r9, r10, r4)
            r8.m3367a(r9, r10, r3)
        L_0x0121:
            if (r11 == 0) goto L_0x014e
            boolean r11 = r10.mo3389d()
            if (r11 != 0) goto L_0x014e
            int r11 = r8.f2454F
            if (r11 == 0) goto L_0x013f
            int r11 = r8.mo3587e()
            if (r11 <= 0) goto L_0x013f
            boolean r11 = r8.f2461M
            if (r11 != 0) goto L_0x013d
            android.view.View r11 = r8.mo3722K()
            if (r11 == 0) goto L_0x013f
        L_0x013d:
            r11 = 1
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x014e
            java.lang.Runnable r11 = r8.f2464P
            r8.mo3564a(r11)
            boolean r11 = r8.mo3718G()
            if (r11 == 0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r4 = 0
        L_0x014f:
            boolean r11 = r10.mo3389d()
            if (r11 == 0) goto L_0x015a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2460L
            r11.mo3739b()
        L_0x015a:
            boolean r11 = r0.f2476c
            r8.f2455G = r11
            boolean r11 = r8.mo3724M()
            r8.f2456H = r11
            if (r4 == 0) goto L_0x016e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f2460L
            r11.mo3739b()
            r8.m3377c(r9, r10, r3)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m3377c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    /* renamed from: c */
    private boolean m3378c(C0560a0 a0Var, C0601b bVar) {
        boolean z = this.f2455G;
        int a = a0Var.mo3384a();
        bVar.f2474a = z ? m3390r(a) : m3388q(a);
        bVar.f2475b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    /* renamed from: e */
    private void m3379e(int i, int i2) {
        for (int i3 = 0; i3 < this.f2465s; i3++) {
            if (!this.f2466t[i3].f2499a.isEmpty()) {
                m3370a(this.f2466t[i3], i, i2);
            }
        }
    }

    /* renamed from: h */
    private int m3380h(C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return 0;
        }
        return C0669u.m3811a(a0Var, this.f2467u, mo3728b(!this.f2462N), mo3725a(!this.f2462N), this, this.f2462N);
    }

    /* renamed from: i */
    private int m3381i(C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return 0;
        }
        return C0669u.m3812a(a0Var, this.f2467u, mo3728b(!this.f2462N), mo3725a(!this.f2462N), this, this.f2462N, this.f2449A);
    }

    /* renamed from: j */
    private int m3382j(C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return 0;
        }
        return C0669u.m3813b(a0Var, this.f2467u, mo3728b(!this.f2462N), mo3725a(!this.f2462N), this, this.f2462N);
    }

    /* renamed from: m */
    private int m3383m(int i) {
        int i2 = -1;
        if (mo3587e() == 0) {
            if (this.f2449A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo3720I()) == this.f2449A) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: n */
    private int m3384n(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f2469w != 1 && mo3724M()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f2469w != 1 && mo3724M()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f2469w != 0) {
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
            return i2;
        } else if (i == 33) {
            if (this.f2469w != 1) {
                i2 = RecyclerView.UNDEFINED_DURATION;
            }
            return i2;
        } else if (i == 66) {
            if (this.f2469w != 0) {
                i3 = RecyclerView.UNDEFINED_DURATION;
            }
            return i3;
        } else if (i != 130) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            if (this.f2469w != 1) {
                i3 = RecyclerView.UNDEFINED_DURATION;
            }
            return i3;
        }
    }

    /* renamed from: o */
    private C0604a m3385o(int i) {
        C0604a aVar = new C0604a();
        aVar.f2487h = new int[this.f2465s];
        for (int i2 = 0; i2 < this.f2465s; i2++) {
            aVar.f2487h[i2] = i - this.f2466t[i2].mo3766a(i);
        }
        return aVar;
    }

    /* renamed from: p */
    private C0604a m3386p(int i) {
        C0604a aVar = new C0604a();
        aVar.f2487h = new int[this.f2465s];
        for (int i2 = 0; i2 < this.f2465s; i2++) {
            aVar.f2487h[i2] = this.f2466t[i2].mo3773b(i) - i;
        }
        return aVar;
    }

    /* renamed from: p */
    private void m3387p(View view) {
        for (int i = this.f2465s - 1; i >= 0; i--) {
            this.f2466t[i].mo3771a(view);
        }
    }

    /* renamed from: q */
    private int m3388q(int i) {
        int e = mo3587e();
        for (int i2 = 0; i2 < e; i2++) {
            int l = mo3608l(mo3583d(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: q */
    private void m3389q(View view) {
        for (int i = this.f2465s - 1; i >= 0; i--) {
            this.f2466t[i].mo3778c(view);
        }
    }

    /* renamed from: r */
    private int m3390r(int i) {
        for (int e = mo3587e() - 1; e >= 0; e--) {
            int l = mo3608l(mo3583d(e));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: s */
    private int m3391s(int i) {
        int a = this.f2466t[0].mo3766a(i);
        for (int i2 = 1; i2 < this.f2465s; i2++) {
            int a2 = this.f2466t[i2].mo3766a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: t */
    private int m3392t(int i) {
        int b = this.f2466t[0].mo3773b(i);
        for (int i2 = 1; i2 < this.f2465s; i2++) {
            int b2 = this.f2466t[i2].mo3773b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: u */
    private int m3393u(int i) {
        int a = this.f2466t[0].mo3766a(i);
        for (int i2 = 1; i2 < this.f2465s; i2++) {
            int a2 = this.f2466t[i2].mo3766a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: v */
    private int m3394v(int i) {
        int b = this.f2466t[0].mo3773b(i);
        for (int i2 = 1; i2 < this.f2465s; i2++) {
            int b2 = this.f2466t[i2].mo3773b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: w */
    private boolean m3395w(int i) {
        boolean z = true;
        if (this.f2469w == 0) {
            if ((i == -1) == this.f2449A) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.f2449A) != mo3724M()) {
            z = false;
        }
        return z;
    }

    /* renamed from: x */
    private void m3396x(int i) {
        C0654l lVar = this.f2471y;
        lVar.f2683e = i;
        int i2 = 1;
        if (this.f2449A != (i == -1)) {
            i2 = -1;
        }
        lVar.f2682d = i2;
    }

    /* renamed from: D */
    public boolean mo3099D() {
        return this.f2457I == null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: E */
    public boolean mo3716E() {
        int a = this.f2466t[0].mo3766a((int) RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f2465s; i++) {
            if (this.f2466t[i].mo3766a((int) RecyclerView.UNDEFINED_DURATION) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: F */
    public boolean mo3717F() {
        int b = this.f2466t[0].mo3773b((int) RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.f2465s; i++) {
            if (this.f2466t[i].mo3773b((int) RecyclerView.UNDEFINED_DURATION) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo3718G() {
        int i;
        int i2;
        if (mo3587e() == 0 || this.f2454F == 0 || !mo3620u()) {
            return false;
        }
        if (this.f2449A) {
            i2 = mo3721J();
            i = mo3720I();
        } else {
            i2 = mo3720I();
            i = mo3721J();
        }
        if (i2 == 0 && mo3722K() != null) {
            this.f2453E.mo3743a();
        } else if (!this.f2461M) {
            return false;
        } else {
            int i3 = this.f2449A ? -1 : 1;
            int i4 = i + 1;
            C0604a a = this.f2453E.mo3742a(i2, i4, i3, true);
            if (a == null) {
                this.f2461M = false;
                this.f2453E.mo3748b(i4);
                return false;
            }
            C0604a a2 = this.f2453E.mo3742a(i2, a.f2485f, i3 * -1, true);
            if (a2 == null) {
                this.f2453E.mo3748b(a.f2485f);
            } else {
                this.f2453E.mo3748b(a2.f2485f + 1);
            }
        }
        mo3531A();
        mo3623z();
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public int mo3719H() {
        View a = this.f2449A ? mo3725a(true) : mo3728b(true);
        if (a == null) {
            return -1;
        }
        return mo3608l(a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public int mo3720I() {
        if (mo3587e() == 0) {
            return 0;
        }
        return mo3608l(mo3583d(0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public int mo3721J() {
        int e = mo3587e();
        if (e == 0) {
            return 0;
        }
        return mo3608l(mo3583d(e - 1));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo3722K() {
        /*
            r12 = this;
            int r0 = r12.mo3587e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f2465s
            r2.<init>(r3)
            int r3 = r12.f2465s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f2469w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo3724M()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f2449A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo3583d(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0602c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2481e
            int r9 = r9.f2503e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2481e
            boolean r9 = r12.m3371a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f2481e
            int r9 = r9.f2503e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f2482f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo3583d(r9)
            boolean r10 = r12.f2449A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.r r10 = r12.f2467u
            int r10 = r10.mo3940a(r7)
            androidx.recyclerview.widget.r r11 = r12.f2467u
            int r11 = r11.mo3940a(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.r r10 = r12.f2467u
            int r10 = r10.mo3947d(r7)
            androidx.recyclerview.widget.r r11 = r12.f2467u
            int r11 = r11.mo3947d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.C0602c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f2481e
            int r8 = r8.f2503e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f2481e
            int r9 = r9.f2503e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3722K():android.view.View");
    }

    /* renamed from: L */
    public void mo3723L() {
        this.f2453E.mo3743a();
        mo3623z();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: M */
    public boolean mo3724M() {
        return mo3605k() == 1;
    }

    /* renamed from: a */
    public int mo3101a(int i, C0592v vVar, C0560a0 a0Var) {
        return mo3730c(i, vVar, a0Var);
    }

    /* renamed from: a */
    public int mo3149a(C0560a0 a0Var) {
        return m3380h(a0Var);
    }

    /* renamed from: a */
    public int mo3102a(C0592v vVar, C0560a0 a0Var) {
        return this.f2469w == 1 ? this.f2465s : super.mo3102a(vVar, a0Var);
    }

    /* renamed from: a */
    public PointF mo3151a(int i) {
        int m = m3383m(i);
        PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.f2469w == 0) {
            pointF.x = (float) m;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) m;
        }
        return pointF;
    }

    /* renamed from: a */
    public View mo3103a(View view, int i, C0592v vVar, C0560a0 a0Var) {
        if (mo3587e() == 0) {
            return null;
        }
        View c = mo3575c(view);
        if (c == null) {
            return null;
        }
        m3360P();
        int n = m3384n(i);
        if (n == Integer.MIN_VALUE) {
            return null;
        }
        C0602c cVar = (C0602c) c.getLayoutParams();
        boolean z = cVar.f2482f;
        C0608f fVar = cVar.f2481e;
        int J = n == 1 ? mo3721J() : mo3720I();
        m3373b(J, a0Var);
        m3396x(n);
        C0654l lVar = this.f2471y;
        lVar.f2681c = lVar.f2682d + J;
        lVar.f2680b = (int) (((float) this.f2467u.mo3952g()) * 0.33333334f);
        C0654l lVar2 = this.f2471y;
        lVar2.f2686h = true;
        lVar2.f2679a = false;
        m3361a(vVar, lVar2, a0Var);
        this.f2455G = this.f2449A;
        if (!z) {
            View a = fVar.mo3769a(J, n);
            if (!(a == null || a == c)) {
                return a;
            }
        }
        if (m3395w(n)) {
            for (int i2 = this.f2465s - 1; i2 >= 0; i2--) {
                View a2 = this.f2466t[i2].mo3769a(J, n);
                if (a2 != null && a2 != c) {
                    return a2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.f2465s; i3++) {
                View a3 = this.f2466t[i3].mo3769a(J, n);
                if (a3 != null && a3 != c) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f2472z ^ true) == (n == -1);
        if (!z) {
            View c2 = mo3167c(z2 ? fVar.mo3779d() : fVar.mo3781e());
            if (!(c2 == null || c2 == c)) {
                return c2;
            }
        }
        if (m3395w(n)) {
            for (int i4 = this.f2465s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f2503e) {
                    C0608f[] fVarArr = this.f2466t;
                    View c3 = mo3167c(z2 ? fVarArr[i4].mo3779d() : fVarArr[i4].mo3781e());
                    if (!(c3 == null || c3 == c)) {
                        return c3;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f2465s; i5++) {
                C0608f[] fVarArr2 = this.f2466t;
                View c4 = mo3167c(z2 ? fVarArr2[i5].mo3779d() : fVarArr2[i5].mo3781e());
                if (c4 != null && c4 != c) {
                    return c4;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo3725a(boolean z) {
        int f = this.f2467u.mo3950f();
        int b = this.f2467u.mo3942b();
        View view = null;
        for (int e = mo3587e() - 1; e >= 0; e--) {
            View d = mo3583d(e);
            int d2 = this.f2467u.mo3947d(d);
            int a = this.f2467u.mo3940a(d);
            if (a > f && d2 < b) {
                if (a <= b || !z) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public C0585p mo3105a(Context context, AttributeSet attributeSet) {
        return new C0602c(context, attributeSet);
    }

    /* renamed from: a */
    public C0585p mo3106a(LayoutParams layoutParams) {
        return layoutParams instanceof MarginLayoutParams ? new C0602c((MarginLayoutParams) layoutParams) : new C0602c(layoutParams);
    }

    /* renamed from: a */
    public void mo3154a(int i, int i2, C0560a0 a0Var, C0583c cVar) {
        int i3;
        int i4;
        if (this.f2469w != 0) {
            i = i2;
        }
        if (mo3587e() != 0 && i != 0) {
            mo3726a(i, a0Var);
            int[] iArr = this.f2463O;
            if (iArr == null || iArr.length < this.f2465s) {
                this.f2463O = new int[this.f2465s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f2465s; i6++) {
                C0654l lVar = this.f2471y;
                if (lVar.f2682d == -1) {
                    i4 = lVar.f2684f;
                    i3 = this.f2466t[i6].mo3773b(i4);
                } else {
                    i4 = this.f2466t[i6].mo3766a(lVar.f2685g);
                    i3 = this.f2471y.f2685g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f2463O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f2463O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f2471y.mo3918a(a0Var); i8++) {
                cVar.mo3629a(this.f2471y.f2681c, this.f2463O[i8]);
                C0654l lVar2 = this.f2471y;
                lVar2.f2681c += lVar2.f2682d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3726a(int i, C0560a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo3721J();
            i2 = 1;
        } else {
            i3 = mo3720I();
            i2 = -1;
        }
        this.f2471y.f2679a = true;
        m3373b(i3, a0Var);
        m3396x(i2);
        C0654l lVar = this.f2471y;
        lVar.f2681c = i3 + lVar.f2682d;
        lVar.f2680b = Math.abs(i);
    }

    /* renamed from: a */
    public void mo3107a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int o = mo3613o() + mo3615p();
        int q = mo3616q() + mo3611n();
        if (this.f2469w == 1) {
            i4 = C0580o.m3111a(i2, rect.height() + q, mo3607l());
            i3 = C0580o.m3111a(i, (this.f2470x * this.f2465s) + o, mo3609m());
        } else {
            i3 = C0580o.m3111a(i, rect.width() + o, mo3609m());
            i4 = C0580o.m3111a(i2, (this.f2470x * this.f2465s) + q, mo3607l());
        }
        mo3576c(i3, i4);
    }

    /* renamed from: a */
    public void mo3156a(Parcelable parcelable) {
        if (parcelable instanceof C0606e) {
            this.f2457I = (C0606e) parcelable;
            mo3623z();
        }
    }

    /* renamed from: a */
    public void mo3157a(AccessibilityEvent accessibilityEvent) {
        super.mo3157a(accessibilityEvent);
        if (mo3587e() > 0) {
            View b = mo3728b(false);
            View a = mo3725a(false);
            if (b != null && a != null) {
                int l = mo3608l(b);
                int l2 = mo3608l(a);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    /* renamed from: a */
    public void mo3109a(C0592v vVar, C0560a0 a0Var, View view, C3347c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C0602c)) {
            super.mo3542a(view, cVar);
            return;
        }
        C0602c cVar2 = (C0602c) layoutParams;
        if (this.f2469w == 0) {
            i4 = cVar2.mo3740e();
            i3 = cVar2.f2482f ? this.f2465s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.mo3740e();
            i = cVar2.f2482f ? this.f2465s : 1;
        }
        cVar.mo10755b((Object) C3350c.m13707a(i4, i3, i2, i, false, false));
    }

    /* renamed from: a */
    public void mo3112a(RecyclerView recyclerView, int i, int i2) {
        m3372b(i, i2, 1);
    }

    /* renamed from: a */
    public void mo3113a(RecyclerView recyclerView, int i, int i2, int i3) {
        m3372b(i, i2, 8);
    }

    /* renamed from: a */
    public void mo3114a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m3372b(i, i2, 4);
    }

    /* renamed from: a */
    public void mo3159a(RecyclerView recyclerView, C0560a0 a0Var, int i) {
        C0655m mVar = new C0655m(recyclerView.getContext());
        mVar.mo3706c(i);
        mo3571b((C0597z) mVar);
    }

    /* renamed from: a */
    public void mo3160a(String str) {
        if (this.f2457I == null) {
            super.mo3160a(str);
        }
    }

    /* renamed from: a */
    public boolean mo3162a() {
        return this.f2469w == 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3727a(C0560a0 a0Var, C0601b bVar) {
        int i;
        int i2;
        boolean z = false;
        if (!a0Var.mo3389d()) {
            int i3 = this.f2451C;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= a0Var.mo3384a()) {
                    this.f2451C = -1;
                    this.f2452D = RecyclerView.UNDEFINED_DURATION;
                } else {
                    C0606e eVar = this.f2457I;
                    if (eVar == null || eVar.f2489f == -1 || eVar.f2491h < 1) {
                        View c = mo3167c(this.f2451C);
                        if (c != null) {
                            bVar.f2474a = this.f2449A ? mo3721J() : mo3720I();
                            if (this.f2452D != Integer.MIN_VALUE) {
                                if (bVar.f2476c) {
                                    i2 = this.f2467u.mo3942b() - this.f2452D;
                                    i = this.f2467u.mo3940a(c);
                                } else {
                                    i2 = this.f2467u.mo3950f() + this.f2452D;
                                    i = this.f2467u.mo3947d(c);
                                }
                                bVar.f2475b = i2 - i;
                                return true;
                            } else if (this.f2467u.mo3943b(c) > this.f2467u.mo3952g()) {
                                bVar.f2475b = bVar.f2476c ? this.f2467u.mo3942b() : this.f2467u.mo3950f();
                                return true;
                            } else {
                                int d = this.f2467u.mo3947d(c) - this.f2467u.mo3950f();
                                if (d < 0) {
                                    bVar.f2475b = -d;
                                    return true;
                                }
                                int b = this.f2467u.mo3942b() - this.f2467u.mo3940a(c);
                                if (b < 0) {
                                    bVar.f2475b = b;
                                    return true;
                                }
                                bVar.f2475b = RecyclerView.UNDEFINED_DURATION;
                            }
                        } else {
                            int i4 = this.f2451C;
                            bVar.f2474a = i4;
                            int i5 = this.f2452D;
                            if (i5 == Integer.MIN_VALUE) {
                                if (m3383m(i4) == 1) {
                                    z = true;
                                }
                                bVar.f2476c = z;
                                bVar.mo3736a();
                            } else {
                                bVar.mo3737a(i5);
                            }
                            bVar.f2477d = true;
                        }
                    } else {
                        bVar.f2475b = RecyclerView.UNDEFINED_DURATION;
                        bVar.f2474a = this.f2451C;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo3115a(C0585p pVar) {
        return pVar instanceof C0602c;
    }

    /* renamed from: b */
    public int mo3116b(int i, C0592v vVar, C0560a0 a0Var) {
        return mo3730c(i, vVar, a0Var);
    }

    /* renamed from: b */
    public int mo3117b(C0560a0 a0Var) {
        return m3381i(a0Var);
    }

    /* renamed from: b */
    public int mo3118b(C0592v vVar, C0560a0 a0Var) {
        return this.f2469w == 0 ? this.f2465s : super.mo3118b(vVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo3728b(boolean z) {
        int f = this.f2467u.mo3950f();
        int b = this.f2467u.mo3942b();
        int e = mo3587e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View d = mo3583d(i);
            int d2 = this.f2467u.mo3947d(d);
            if (this.f2467u.mo3940a(d) > f && d2 < b) {
                if (d2 >= f || !z) {
                    return d;
                }
                if (view == null) {
                    view = d;
                }
            }
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo3729b(C0560a0 a0Var, C0601b bVar) {
        if (!mo3727a(a0Var, bVar) && !m3378c(a0Var, bVar)) {
            bVar.mo3736a();
            bVar.f2474a = 0;
        }
    }

    /* renamed from: b */
    public void mo3119b(RecyclerView recyclerView, int i, int i2) {
        m3372b(i, i2, 2);
    }

    /* renamed from: b */
    public void mo3164b(RecyclerView recyclerView, C0592v vVar) {
        super.mo3164b(recyclerView, vVar);
        mo3564a(this.f2464P);
        for (int i = 0; i < this.f2465s; i++) {
            this.f2466t[i].mo3776c();
        }
        recyclerView.requestLayout();
    }

    /* renamed from: b */
    public boolean mo3165b() {
        return this.f2469w == 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo3730c(int i, C0592v vVar, C0560a0 a0Var) {
        if (mo3587e() == 0 || i == 0) {
            return 0;
        }
        mo3726a(i, a0Var);
        int a = m3361a(vVar, this.f2471y, a0Var);
        if (this.f2471y.f2680b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f2467u.mo3941a(-i);
        this.f2455G = this.f2449A;
        C0654l lVar = this.f2471y;
        lVar.f2680b = 0;
        m3368a(vVar, lVar);
        return i;
    }

    /* renamed from: c */
    public int mo3121c(C0560a0 a0Var) {
        return m3382j(a0Var);
    }

    /* renamed from: c */
    public C0585p mo3122c() {
        return this.f2469w == 0 ? new C0602c(-2, -1) : new C0602c(-1, -2);
    }

    /* renamed from: c */
    public void mo3731c(boolean z) {
        mo3160a((String) null);
        C0606e eVar = this.f2457I;
        if (!(eVar == null || eVar.f2496m == z)) {
            eVar.f2496m = z;
        }
        this.f2472z = z;
        mo3623z();
    }

    /* renamed from: d */
    public int mo3168d(C0560a0 a0Var) {
        return m3380h(a0Var);
    }

    /* renamed from: d */
    public void mo3123d(RecyclerView recyclerView) {
        this.f2453E.mo3743a();
        mo3623z();
    }

    /* renamed from: e */
    public int mo3124e(C0560a0 a0Var) {
        return m3381i(a0Var);
    }

    /* renamed from: e */
    public void mo3589e(int i) {
        super.mo3589e(i);
        for (int i2 = 0; i2 < this.f2465s; i2++) {
            this.f2466t[i2].mo3777c(i);
        }
    }

    /* renamed from: e */
    public void mo3125e(C0592v vVar, C0560a0 a0Var) {
        m3377c(vVar, a0Var, true);
    }

    /* renamed from: f */
    public int mo3127f(C0560a0 a0Var) {
        return m3382j(a0Var);
    }

    /* renamed from: f */
    public void mo3592f(int i) {
        super.mo3592f(i);
        for (int i2 = 0; i2 < this.f2465s; i2++) {
            this.f2466t[i2].mo3777c(i);
        }
    }

    /* renamed from: g */
    public void mo3597g(int i) {
        if (i == 0) {
            mo3718G();
        }
    }

    /* renamed from: g */
    public void mo3128g(C0560a0 a0Var) {
        super.mo3128g(a0Var);
        this.f2451C = -1;
        this.f2452D = RecyclerView.UNDEFINED_DURATION;
        this.f2457I = null;
        this.f2460L.mo3739b();
    }

    /* renamed from: i */
    public void mo3171i(int i) {
        C0606e eVar = this.f2457I;
        if (!(eVar == null || eVar.f2489f == i)) {
            eVar.mo3760a();
        }
        this.f2451C = i;
        this.f2452D = RecyclerView.UNDEFINED_DURATION;
        mo3623z();
    }

    /* renamed from: j */
    public void mo3732j(int i) {
        if (i == 0 || i == 1) {
            mo3160a((String) null);
            if (i != this.f2469w) {
                this.f2469w = i;
                C0662r rVar = this.f2467u;
                this.f2467u = this.f2468v;
                this.f2468v = rVar;
                mo3623z();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: k */
    public void mo3733k(int i) {
        mo3160a((String) null);
        if (i != this.f2465s) {
            mo3723L();
            this.f2465s = i;
            this.f2450B = new BitSet(this.f2465s);
            this.f2466t = new C0608f[this.f2465s];
            for (int i2 = 0; i2 < this.f2465s; i2++) {
                this.f2466t[i2] = new C0608f(i2);
            }
            mo3623z();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo3734l(int i) {
        this.f2470x = i / this.f2465s;
        this.f2458J = MeasureSpec.makeMeasureSpec(i, this.f2468v.mo3946d());
    }

    /* renamed from: v */
    public boolean mo3174v() {
        return this.f2454F != 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo3175y() {
        /*
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = r4.f2457I
            if (r0 == 0) goto L_0x000c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r4.f2457I
            r0.<init>(r1)
            return r0
        L_0x000c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$e
            r0.<init>()
            boolean r1 = r4.f2472z
            r0.f2496m = r1
            boolean r1 = r4.f2455G
            r0.f2497n = r1
            boolean r1 = r4.f2456H
            r0.f2498o = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r4.f2453E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f2483a
            if (r3 == 0) goto L_0x0030
            r0.f2494k = r3
            int r3 = r3.length
            r0.f2493j = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r1 = r1.f2484b
            r0.f2495l = r1
            goto L_0x0032
        L_0x0030:
            r0.f2493j = r2
        L_0x0032:
            int r1 = r4.mo3587e()
            if (r1 <= 0) goto L_0x0088
            boolean r1 = r4.f2455G
            if (r1 == 0) goto L_0x0041
            int r1 = r4.mo3721J()
            goto L_0x0045
        L_0x0041:
            int r1 = r4.mo3720I()
        L_0x0045:
            r0.f2489f = r1
            int r1 = r4.mo3719H()
            r0.f2490g = r1
            int r1 = r4.f2465s
            r0.f2491h = r1
            int[] r1 = new int[r1]
            r0.f2492i = r1
        L_0x0055:
            int r1 = r4.f2465s
            if (r2 >= r1) goto L_0x008f
            boolean r1 = r4.f2455G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2466t
            r1 = r1[r2]
            int r1 = r1.mo3766a(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.r r3 = r4.f2467u
            int r3 = r3.mo3942b()
            goto L_0x0080
        L_0x0070:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r4.f2466t
            r1 = r1[r2]
            int r1 = r1.mo3773b(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.r r3 = r4.f2467u
            int r3 = r3.mo3950f()
        L_0x0080:
            int r1 = r1 - r3
        L_0x0081:
            int[] r3 = r0.f2492i
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0088:
            r1 = -1
            r0.f2489f = r1
            r0.f2490g = r1
            r0.f2491h = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo3175y():android.os.Parcelable");
    }
}
