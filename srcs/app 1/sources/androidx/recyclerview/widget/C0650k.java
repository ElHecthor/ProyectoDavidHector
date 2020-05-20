package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0580o.C0583c;
import androidx.recyclerview.widget.RecyclerView.C0592v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p071f.p097h.p104i.C3280c;

/* renamed from: androidx.recyclerview.widget.k */
final class C0650k implements Runnable {

    /* renamed from: j */
    static final ThreadLocal<C0650k> f2664j = new ThreadLocal<>();

    /* renamed from: k */
    static Comparator<C0653c> f2665k = new C0651a();

    /* renamed from: f */
    ArrayList<RecyclerView> f2666f = new ArrayList<>();

    /* renamed from: g */
    long f2667g;

    /* renamed from: h */
    long f2668h;

    /* renamed from: i */
    private ArrayList<C0653c> f2669i = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.k$a */
    static class C0651a implements Comparator<C0653c> {
        C0651a() {
        }

        /* renamed from: a */
        public int compare(C0653c cVar, C0653c cVar2) {
            int i = 1;
            if ((cVar.f2677d == null) != (cVar2.f2677d == null)) {
                if (cVar.f2677d != null) {
                    i = -1;
                }
                return i;
            }
            boolean z = cVar.f2674a;
            if (z != cVar2.f2674a) {
                if (z) {
                    i = -1;
                }
                return i;
            }
            int i2 = cVar2.f2675b - cVar.f2675b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f2676c - cVar2.f2676c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.k$b */
    static class C0652b implements C0583c {

        /* renamed from: a */
        int f2670a;

        /* renamed from: b */
        int f2671b;

        /* renamed from: c */
        int[] f2672c;

        /* renamed from: d */
        int f2673d;

        C0652b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3912a() {
            int[] iArr = this.f2672c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2673d = 0;
        }

        /* renamed from: a */
        public void mo3629a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f2673d * 2;
                int[] iArr = this.f2672c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f2672c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[(i3 * 2)];
                    this.f2672c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f2672c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f2673d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3913a(RecyclerView recyclerView, boolean z) {
            this.f2673d = 0;
            int[] iArr = this.f2672c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            C0580o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.mo3621w()) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.mo3800c()) {
                        oVar.mo3155a(recyclerView.mAdapter.mo3472b(), (C0583c) this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.mo3154a(this.f2670a, this.f2671b, recyclerView.mState, (C0583c) this);
                }
                int i = this.f2673d;
                if (i > oVar.f2401m) {
                    oVar.f2401m = i;
                    oVar.f2402n = z;
                    recyclerView.mRecycler.mo3687j();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3914a(int i) {
            if (this.f2672c != null) {
                int i2 = this.f2673d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2672c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3915b(int i, int i2) {
            this.f2670a = i;
            this.f2671b = i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.k$c */
    static class C0653c {

        /* renamed from: a */
        public boolean f2674a;

        /* renamed from: b */
        public int f2675b;

        /* renamed from: c */
        public int f2676c;

        /* renamed from: d */
        public RecyclerView f2677d;

        /* renamed from: e */
        public int f2678e;

        C0653c() {
        }

        /* renamed from: a */
        public void mo3916a() {
            this.f2674a = false;
            this.f2675b = 0;
            this.f2676c = 0;
            this.f2677d = null;
            this.f2678e = 0;
        }
    }

    C0650k() {
    }

    /* renamed from: a */
    private C0566d0 m3673a(RecyclerView recyclerView, int i, long j) {
        if (m3677a(recyclerView, i)) {
            return null;
        }
        C0592v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            C0566d0 a = vVar.mo3655a(i, false, j);
            if (a != null) {
                if (!a.mo3428n() || a.mo3429o()) {
                    vVar.mo3663a(a, false);
                } else {
                    vVar.mo3670b(a.f2358a);
                }
            }
            return a;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }

    /* renamed from: a */
    private void m3674a() {
        C0653c cVar;
        int size = this.f2666f.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f2666f.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.mPrefetchRegistry.mo3913a(recyclerView, false);
                i += recyclerView.mPrefetchRegistry.f2673d;
            }
        }
        this.f2669i.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f2666f.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C0652b bVar = recyclerView2.mPrefetchRegistry;
                int abs = Math.abs(bVar.f2670a) + Math.abs(bVar.f2671b);
                for (int i5 = 0; i5 < bVar.f2673d * 2; i5 += 2) {
                    if (i3 >= this.f2669i.size()) {
                        cVar = new C0653c();
                        this.f2669i.add(cVar);
                    } else {
                        cVar = (C0653c) this.f2669i.get(i3);
                    }
                    int i6 = bVar.f2672c[i5 + 1];
                    cVar.f2674a = i6 <= abs;
                    cVar.f2675b = abs;
                    cVar.f2676c = i6;
                    cVar.f2677d = recyclerView2;
                    cVar.f2678e = bVar.f2672c[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2669i, f2665k);
    }

    /* renamed from: a */
    private void m3675a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.mo3839b() != 0) {
                recyclerView.removeAndRecycleViews();
            }
            C0652b bVar = recyclerView.mPrefetchRegistry;
            bVar.mo3913a(recyclerView, true);
            if (bVar.f2673d != 0) {
                try {
                    C3280c.m13445a("RV Nested Prefetch");
                    recyclerView.mState.mo3386a(recyclerView.mAdapter);
                    for (int i = 0; i < bVar.f2673d * 2; i += 2) {
                        m3673a(recyclerView, bVar.f2672c[i], j);
                    }
                } finally {
                    C3280c.m13444a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m3676a(C0653c cVar, long j) {
        C0566d0 a = m3673a(cVar.f2677d, cVar.f2678e, cVar.f2674a ? Long.MAX_VALUE : j);
        if (a != null && a.f2359b != null && a.mo3428n() && !a.mo3429o()) {
            m3675a((RecyclerView) a.f2359b.get(), j);
        }
    }

    /* renamed from: a */
    static boolean m3677a(RecyclerView recyclerView, int i) {
        int b = recyclerView.mChildHelper.mo3839b();
        for (int i2 = 0; i2 < b; i2++) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.mo3845d(i2));
            if (childViewHolderInt.f2360c == i && !childViewHolderInt.mo3429o()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m3678b(long j) {
        int i = 0;
        while (i < this.f2669i.size()) {
            C0653c cVar = (C0653c) this.f2669i.get(i);
            if (cVar.f2677d != null) {
                m3676a(cVar, j);
                cVar.mo3916a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3905a(long j) {
        m3674a();
        m3678b(j);
    }

    /* renamed from: a */
    public void mo3906a(RecyclerView recyclerView) {
        this.f2666f.add(recyclerView);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3907a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2667g == 0) {
            this.f2667g = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.mPrefetchRegistry.mo3915b(i, i2);
    }

    /* renamed from: b */
    public void mo3908b(RecyclerView recyclerView) {
        this.f2666f.remove(recyclerView);
    }

    public void run() {
        try {
            C3280c.m13445a("RV Prefetch");
            if (!this.f2666f.isEmpty()) {
                int size = this.f2666f.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f2666f.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo3905a(TimeUnit.MILLISECONDS.toNanos(j) + this.f2668h);
                    this.f2667g = 0;
                    C3280c.m13444a();
                }
            }
        } finally {
            this.f2667g = 0;
            C3280c.m13444a();
        }
    }
}
