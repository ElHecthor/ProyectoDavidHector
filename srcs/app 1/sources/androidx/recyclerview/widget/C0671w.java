package androidx.recyclerview.widget;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0587r;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import androidx.recyclerview.widget.RecyclerView.C0597z;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0598a;
import androidx.recyclerview.widget.RecyclerView.C0597z.C0599b;

/* renamed from: androidx.recyclerview.widget.w */
public abstract class C0671w extends C0587r {

    /* renamed from: a */
    RecyclerView f2713a;

    /* renamed from: b */
    private Scroller f2714b;

    /* renamed from: c */
    private final C0589t f2715c = new C0672a();

    /* renamed from: androidx.recyclerview.widget.w$a */
    class C0672a extends C0589t {

        /* renamed from: a */
        boolean f2716a = false;

        C0672a() {
        }

        /* renamed from: a */
        public void mo3640a(RecyclerView recyclerView, int i) {
            super.mo3640a(recyclerView, i);
            if (i == 0 && this.f2716a) {
                this.f2716a = false;
                C0671w.this.mo3983a();
            }
        }

        /* renamed from: a */
        public void mo3641a(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f2716a = true;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    class C0673b extends C0655m {
        C0673b(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo3920a(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3700a(View view, C0560a0 a0Var, C0598a aVar) {
            C0671w wVar = C0671w.this;
            RecyclerView recyclerView = wVar.f2713a;
            if (recyclerView != null) {
                int[] a = wVar.mo3930a(recyclerView.getLayoutManager(), view);
                int i = a[0];
                int i2 = a[1];
                int d = mo3925d(Math.max(Math.abs(i), Math.abs(i2)));
                if (d > 0) {
                    aVar.mo3713a(i, i2, d, this.f2689j);
                }
            }
        }
    }

    /* renamed from: b */
    private void m3839b() {
        this.f2713a.removeOnScrollListener(this.f2715c);
        this.f2713a.setOnFlingListener(null);
    }

    /* renamed from: b */
    private boolean m3840b(C0580o oVar, int i, int i2) {
        if (!(oVar instanceof C0599b)) {
            return false;
        }
        C0597z a = mo3982a(oVar);
        if (a == null) {
            return false;
        }
        int a2 = mo3929a(oVar, i, i2);
        if (a2 == -1) {
            return false;
        }
        a.mo3706c(a2);
        oVar.mo3571b(a);
        return true;
    }

    /* renamed from: c */
    private void m3841c() {
        if (this.f2713a.getOnFlingListener() == null) {
            this.f2713a.addOnScrollListener(this.f2715c);
            this.f2713a.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    /* renamed from: a */
    public abstract int mo3929a(C0580o oVar, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C0597z mo3982a(C0580o oVar) {
        return mo3955b(oVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3983a() {
        RecyclerView recyclerView = this.f2713a;
        if (recyclerView != null) {
            C0580o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View c = mo3931c(layoutManager);
                if (c != null) {
                    int[] a = mo3930a(layoutManager, c);
                    if (!(a[0] == 0 && a[1] == 0)) {
                        this.f2713a.smoothScrollBy(a[0], a[1]);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3984a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2713a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                m3839b();
            }
            this.f2713a = recyclerView;
            if (recyclerView != null) {
                m3841c();
                this.f2714b = new Scroller(this.f2713a.getContext(), new DecelerateInterpolator());
                mo3983a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo3636a(int i, int i2) {
        C0580o layoutManager = this.f2713a.getLayoutManager();
        boolean z = false;
        if (layoutManager == null || this.f2713a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2713a.getMinFlingVelocity();
        if ((Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && m3840b(layoutManager, i, i2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public abstract int[] mo3930a(C0580o oVar, View view);

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: b */
    public C0655m mo3955b(C0580o oVar) {
        if (!(oVar instanceof C0599b)) {
            return null;
        }
        return new C0673b(this.f2713a.getContext());
    }

    /* renamed from: b */
    public int[] mo3985b(int i, int i2) {
        this.f2714b.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
        return new int[]{this.f2714b.getFinalX(), this.f2714b.getFinalY()};
    }

    /* renamed from: c */
    public abstract View mo3931c(C0580o oVar);
}
