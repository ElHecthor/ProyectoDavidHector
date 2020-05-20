package p147g.p225e.p226a.p227f.p228a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: g.e.a.f.a.d */
public final class C4724d {

    /* renamed from: g.e.a.f.a.d$a */
    public static final class C4725a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f12369a;

        C4725a(View view, boolean z) {
            this.f12369a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C4724d.m19047f(this.f12369a);
        }
    }

    /* renamed from: a */
    public static final Rect m19038a(View view) {
        Rect rect = new Rect();
        if (view != null) {
            view.getGlobalVisibleRect(rect);
        }
        return rect;
    }

    /* renamed from: a */
    public static final void m19039a(View view, int i, int i2) {
        C5942k.m22327b(view, "$receiver");
        view.getLayoutParams().width = i;
        view.getLayoutParams().height = i2;
        view.setLayoutParams(view.getLayoutParams());
    }

    /* renamed from: a */
    public static final void m19040a(View view, Float f, Float f2, long j) {
        C5942k.m22327b(view, "$receiver");
        float f3 = 0.0f;
        view.setAlpha(f != null ? f.floatValue() : 0.0f);
        view.clearAnimation();
        ViewPropertyAnimator animate = view.animate();
        if (f2 != null) {
            f3 = f2.floatValue();
        }
        animate.alpha(f3).setDuration(j).start();
    }

    /* renamed from: a */
    public static final void m19041a(View view, Integer num, Integer num2, Integer num3, Integer num4) {
        C5942k.m22327b(view, "$receiver");
        if (view.getLayoutParams() instanceof MarginLayoutParams) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(num != null ? num.intValue() : marginLayoutParams.getMarginStart());
                marginLayoutParams.topMargin = num2 != null ? num2.intValue() : marginLayoutParams.topMargin;
                marginLayoutParams.setMarginEnd(num3 != null ? num3.intValue() : marginLayoutParams.getMarginEnd());
                marginLayoutParams.bottomMargin = num4 != null ? num4.intValue() : marginLayoutParams.bottomMargin;
                view.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C5809q("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ void m19042a(View view, Integer num, Integer num2, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            num3 = null;
        }
        if ((i & 8) != 0) {
            num4 = null;
        }
        m19041a(view, num, num2, num3, num4);
    }

    /* renamed from: b */
    public static final Rect m19043b(View view) {
        Rect rect = new Rect();
        if (view != null) {
            view.getHitRect(rect);
        }
        return rect;
    }

    /* renamed from: c */
    public static final Rect m19044c(View view) {
        Rect rect = new Rect();
        if (view != null) {
            view.getLocalVisibleRect(rect);
        }
        return rect;
    }

    /* renamed from: d */
    public static final boolean m19045d(View view) {
        return view != null && (C5942k.m22326a((Object) m19038a(view), (Object) m19044c(view)) ^ true);
    }

    /* renamed from: e */
    public static final boolean m19046e(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: f */
    public static final void m19047f(View view) {
        C5942k.m22327b(view, "$receiver");
        view.setVisibility(8);
    }

    /* renamed from: g */
    public static final void m19048g(View view) {
        C5942k.m22327b(view, "$receiver");
        view.setVisibility(4);
    }

    /* renamed from: h */
    public static final void m19049h(View view) {
        C5942k.m22327b(view, "$receiver");
        Integer valueOf = Integer.valueOf(0);
        m19041a(view, valueOf, valueOf, valueOf, valueOf);
        m19039a(view, -1, -1);
    }

    /* renamed from: i */
    public static final void m19050i(View view) {
        C5942k.m22327b(view, "$receiver");
        view.setVisibility(0);
    }

    /* renamed from: j */
    public static final void m19051j(View view) {
        C5942k.m22327b(view, "$receiver");
        boolean z = view.getVisibility() == 0;
        float f = 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (z) {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{f2, f});
        ofFloat.setDuration((long) ViewConfiguration.getDoubleTapTimeout());
        if (z) {
            ofFloat.addListener(new C4725a(view, z));
        } else {
            m19050i(view);
        }
        ofFloat.start();
    }
}
