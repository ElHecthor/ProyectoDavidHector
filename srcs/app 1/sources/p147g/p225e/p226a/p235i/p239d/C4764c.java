package p147g.p225e.p226a.p235i.p239d;

import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p071f.p139v.C3563b;
import p071f.p139v.C3607m;
import p071f.p139v.C3616o;
import p071f.p139v.C3620q;
import p147g.p225e.p226a.p227f.p228a.C4722c;
import p147g.p225e.p226a.p227f.p228a.C4724d;
import p308k.C5809q;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: g.e.a.i.d.c */
public final class C4764c {

    /* renamed from: a */
    private boolean f12466a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f12467b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ImageView f12468c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ImageView f12469d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final FrameLayout f12470e;

    /* renamed from: g.e.a.i.d.c$a */
    public static final class C4765a {
        private C4765a() {
        }

        public /* synthetic */ C4765a(C5938g gVar) {
            this();
        }
    }

    /* renamed from: g.e.a.i.d.c$b */
    static final class C4766b extends C5943l implements C5918l<C3607m, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C5907a f12471g;

        C4766b(C5907a aVar) {
            this.f12471g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13772a(C3607m mVar) {
            C5942k.m22327b(mVar, "it");
            C5907a aVar = this.f12471g;
            if (aVar != null) {
                C5812t tVar = (C5812t) aVar.invoke();
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13772a((C3607m) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: g.e.a.i.d.c$c */
    static final class C4767c extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4764c f12472g;

        /* renamed from: h */
        final /* synthetic */ C5907a f12473h;

        C4767c(C4764c cVar, C5907a aVar) {
            this.f12472g = cVar;
            this.f12473h = aVar;
            super(0);
        }

        public final void invoke() {
            this.f12472g.m19176c(this.f12473h);
        }
    }

    /* renamed from: g.e.a.i.d.c$d */
    public static final class C4768d implements Runnable {

        /* renamed from: f */
        final /* synthetic */ View f12474f;

        /* renamed from: g */
        final /* synthetic */ C4764c f12475g;

        /* renamed from: h */
        final /* synthetic */ C5907a f12476h;

        /* renamed from: i */
        final /* synthetic */ int[] f12477i;

        /* renamed from: g.e.a.i.d.c$d$a */
        public static final class C4769a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ View f12478f;

            public C4769a(View view) {
                this.f12478f = view;
            }

            public final void run() {
                ((ImageView) this.f12478f).setVisibility(4);
            }
        }

        /* renamed from: g.e.a.i.d.c$d$b */
        static final class C4770b extends C5943l implements C5907a<C5812t> {

            /* renamed from: g */
            final /* synthetic */ C4768d f12479g;

            C4770b(C4768d dVar) {
                this.f12479g = dVar;
                super(0);
            }

            public final void invoke() {
                if (!this.f12479g.f12475g.f12467b) {
                    this.f12479g.f12475g.mo13768a(false);
                    this.f12479g.f12476h.invoke();
                }
            }
        }

        public C4768d(View view, C4764c cVar, C5907a aVar, int[] iArr) {
            this.f12474f = view;
            this.f12475g = cVar;
            this.f12476h = aVar;
            this.f12477i = iArr;
        }

        public final void run() {
            ViewGroup viewGroup = (ViewGroup) this.f12474f;
            ImageView a = this.f12475g.f12468c;
            if (a != null) {
                a.postDelayed(new C4769a(a), 50);
            }
            C3616o.m14726a(this.f12475g.m19170b(), this.f12475g.m19168a((C5907a<C5812t>) new C4770b<C5812t>(this)));
            C4724d.m19049h(this.f12475g.f12470e);
            C4724d.m19049h(this.f12475g.f12469d);
            C4724d.m19041a(this.f12475g.m19170b(), Integer.valueOf(this.f12477i[0]), Integer.valueOf(this.f12477i[1]), Integer.valueOf(this.f12477i[2]), Integer.valueOf(this.f12477i[3]));
            this.f12475g.f12470e.requestLayout();
        }
    }

    /* renamed from: g.e.a.i.d.c$e */
    static final class C4771e implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C5907a f12480f;

        C4771e(C5907a aVar) {
            this.f12480f = aVar;
        }

        public final void run() {
            this.f12480f.invoke();
        }
    }

    static {
        new C4765a(null);
    }

    public C4764c(ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        C5942k.m22327b(imageView2, "internalImage");
        C5942k.m22327b(frameLayout, "internalImageContainer");
        this.f12468c = imageView;
        this.f12469d = imageView2;
        this.f12470e = frameLayout;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C3607m m19168a(C5907a<C5812t> aVar) {
        C3563b bVar = new C3563b();
        bVar.mo11351a(m19174c());
        C3620q a = bVar.mo11352a((TimeInterpolator) new DecelerateInterpolator());
        C5942k.m22324a((Object) a, "AutoTransition()\n       …DecelerateInterpolator())");
        C3607m a2 = C4722c.m19032a(a, new C4766b(aVar), null, null, null, null, 30, null);
        C5942k.m22324a((Object) a2, "AutoTransition()\n       …ransitionEnd?.invoke() })");
        return a2;
    }

    /* renamed from: a */
    private final void m19169a(int[] iArr, C5907a<C5812t> aVar) {
        this.f12466a = true;
        m19178d();
        ViewGroup b = m19170b();
        b.post(new C4768d(b, this, aVar, iArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final ViewGroup m19170b() {
        ViewParent parent = this.f12470e.getParent();
        if (parent != null) {
            return (ViewGroup) parent;
        }
        throw new C5809q("null cannot be cast to non-null type android.view.ViewGroup");
    }

    /* renamed from: b */
    private final void m19173b(C5907a<C5812t> aVar) {
        this.f12466a = true;
        this.f12467b = true;
        C3616o.m14726a(m19170b(), m19168a((C5907a<C5812t>) new C4767c<C5812t>(this, aVar)));
        m19178d();
        this.f12470e.requestLayout();
    }

    /* renamed from: c */
    private final long m19174c() {
        return this.f12467b ? 250 : 200;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m19176c(C5907a<C5812t> aVar) {
        ImageView imageView = this.f12468c;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        ImageView imageView2 = this.f12468c;
        if (imageView2 != null) {
            imageView2.post(new C4771e(aVar));
        }
        this.f12466a = false;
    }

    /* renamed from: d */
    private final void m19178d() {
        ImageView imageView = this.f12468c;
        if (imageView != null) {
            if (C4724d.m19045d(imageView)) {
                Rect c = C4724d.m19044c(this.f12468c);
                C4724d.m19039a(this.f12469d, imageView.getWidth(), imageView.getHeight());
                C4724d.m19042a(this.f12469d, Integer.valueOf(-c.left), Integer.valueOf(-c.top), null, null, 12, null);
                Rect a = C4724d.m19038a(this.f12468c);
                C4724d.m19039a(this.f12470e, a.width(), a.height());
                C4724d.m19041a(this.f12470e, Integer.valueOf(a.left), Integer.valueOf(a.top), Integer.valueOf(a.right), Integer.valueOf(a.bottom));
            }
            m19179e();
        }
    }

    /* renamed from: e */
    private final void m19179e() {
        m19170b().animate().translationY(0.0f).setDuration(m19174c()).start();
    }

    /* renamed from: a */
    public final void mo13768a(boolean z) {
        this.f12466a = z;
    }

    /* renamed from: a */
    public final void mo13769a(boolean z, C5918l<? super Long, C5812t> lVar, C5907a<C5812t> aVar) {
        C5942k.m22327b(lVar, "onTransitionStart");
        C5942k.m22327b(aVar, "onTransitionEnd");
        if (!C4724d.m19045d(this.f12468c) || z) {
            ImageView imageView = this.f12468c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            aVar.invoke();
            return;
        }
        lVar.mo4090d(Long.valueOf(250));
        m19173b(aVar);
    }

    /* renamed from: a */
    public final void mo13770a(int[] iArr, C5918l<? super Long, C5812t> lVar, C5907a<C5812t> aVar) {
        C5942k.m22327b(iArr, "containerPadding");
        C5942k.m22327b(lVar, "onTransitionStart");
        C5942k.m22327b(aVar, "onTransitionEnd");
        if (C4724d.m19045d(this.f12468c)) {
            lVar.mo4090d(Long.valueOf(200));
            m19169a(iArr, aVar);
            return;
        }
        aVar.invoke();
    }

    /* renamed from: a */
    public final boolean mo13771a() {
        return this.f12466a;
    }
}
