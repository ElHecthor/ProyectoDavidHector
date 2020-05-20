package p147g.p225e.p226a.p227f.p229b.p232c;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import p147g.p225e.p226a.p227f.p228a.C4724d;
import p147g.p225e.p226a.p227f.p228a.C4728f;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: g.e.a.f.b.c.a */
public final class C4734a implements OnTouchListener {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f12389f;

    /* renamed from: g */
    private boolean f12390g;

    /* renamed from: h */
    private float f12391h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final View f12392i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C5907a<C5812t> f12393j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C5922p<Float, Integer, C5812t> f12394k;

    /* renamed from: l */
    private final C5907a<Boolean> f12395l;

    /* renamed from: g.e.a.f.b.c.a$a */
    public static final class C4735a {
        private C4735a() {
        }

        public /* synthetic */ C4735a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: g.e.a.f.b.c.a$b */
    static final class C4736b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C4734a f12396a;

        C4736b(C4734a aVar) {
            this.f12396a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f12396a.f12394k.mo4018c(Float.valueOf(this.f12396a.f12392i.getTranslationY()), Integer.valueOf(this.f12396a.f12389f));
        }
    }

    /* renamed from: g.e.a.f.b.c.a$c */
    static final class C4737c extends C5943l implements C5918l<Animator, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4734a f12397g;

        /* renamed from: h */
        final /* synthetic */ float f12398h;

        C4737c(C4734a aVar, float f) {
            this.f12397g = aVar;
            this.f12398h = f;
            super(1);
        }

        /* renamed from: a */
        public final void mo13709a(Animator animator) {
            if (this.f12398h != 0.0f) {
                this.f12397g.f12393j.invoke();
            }
            this.f12397g.f12392i.animate().setUpdateListener(null);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13709a((Animator) obj);
            return C5812t.f14872a;
        }
    }

    static {
        new C4735a(null);
    }

    public C4734a(View view, C5907a<C5812t> aVar, C5922p<? super Float, ? super Integer, C5812t> pVar, C5907a<Boolean> aVar2) {
        C5942k.m22327b(view, "swipeView");
        C5942k.m22327b(aVar, "onDismiss");
        C5942k.m22327b(pVar, "onSwipeViewMove");
        C5942k.m22327b(aVar2, "shouldAnimateDismiss");
        this.f12392i = view;
        this.f12393j = aVar;
        this.f12394k = pVar;
        this.f12395l = aVar2;
        this.f12389f = view.getHeight() / 4;
    }

    /* renamed from: a */
    private final void m19065a(float f, long j) {
        ViewPropertyAnimator updateListener = this.f12392i.animate().translationY(f).setDuration(j).setInterpolator(new AccelerateInterpolator()).setUpdateListener(new C4736b(this));
        C5942k.m22324a((Object) updateListener, "swipeView.animate()\n    …ionY, translationLimit) }");
        C4728f.m19058a(updateListener, new C4737c(this, f), null, 2, null).start();
    }

    /* renamed from: a */
    private final void m19066a(int i) {
        float f = this.f12392i.getTranslationY() < ((float) (-this.f12389f)) ? -((float) i) : this.f12392i.getTranslationY() > ((float) this.f12389f) ? (float) i : 0.0f;
        if (f == 0.0f || ((Boolean) this.f12395l.invoke()).booleanValue()) {
            m19065a(f, 200);
        } else {
            this.f12393j.invoke();
        }
    }

    /* renamed from: a */
    public final void mo13706a() {
        m19065a((float) this.f12392i.getHeight(), 200);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        C5942k.m22327b(view, "v");
        C5942k.m22327b(motionEvent, "event");
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (this.f12390g) {
                        float y = motionEvent.getY() - this.f12391h;
                        this.f12392i.setTranslationY(y);
                        this.f12394k.mo4018c(Float.valueOf(y), Integer.valueOf(this.f12389f));
                    }
                    return true;
                } else if (action != 3) {
                    return false;
                }
            }
            if (this.f12390g) {
                this.f12390g = false;
                m19066a(view.getHeight());
            }
            return true;
        }
        if (C4724d.m19043b(this.f12392i).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            this.f12390g = true;
        }
        this.f12391h = motionEvent.getY();
        return true;
    }
}
