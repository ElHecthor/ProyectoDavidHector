package p147g.p225e.p226a.p235i.p239d;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.stfalcon.imageviewer.common.pager.MultiTouchViewPager;
import java.util.List;
import p071f.p097h.p108m.C3333c;
import p147g.p225e.p226a.C4714a;
import p147g.p225e.p226a.C4715b;
import p147g.p225e.p226a.p227f.p228a.C4720a;
import p147g.p225e.p226a.p227f.p228a.C4724d;
import p147g.p225e.p226a.p227f.p228a.C4726e;
import p147g.p225e.p226a.p227f.p229b.p230a.C4730a;
import p147g.p225e.p226a.p227f.p229b.p231b.C4731a;
import p147g.p225e.p226a.p227f.p229b.p231b.C4733b;
import p147g.p225e.p226a.p227f.p229b.p232c.C4734a;
import p147g.p225e.p226a.p234h.C4740a;
import p147g.p225e.p226a.p235i.p236a.C4741a;
import p308k.C5812t;
import p308k.p311c0.C5740c;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5940i;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p308k.p323z.p325d.C5950s;

/* renamed from: g.e.a.i.d.a */
public final class C4751a<T> extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C4731a f12429A;

    /* renamed from: B */
    private List<? extends T> f12430B;

    /* renamed from: C */
    private C4740a<T> f12431C;

    /* renamed from: D */
    private C4764c f12432D;

    /* renamed from: E */
    private int f12433E;

    /* renamed from: f */
    private boolean f12434f;

    /* renamed from: g */
    private boolean f12435g;

    /* renamed from: h */
    private C5907a<C5812t> f12436h;

    /* renamed from: i */
    private C5918l<? super Integer, C5812t> f12437i;

    /* renamed from: j */
    private int[] f12438j;

    /* renamed from: k */
    private View f12439k;

    /* renamed from: l */
    private ViewGroup f12440l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public View f12441m;

    /* renamed from: n */
    private ViewGroup f12442n;

    /* renamed from: o */
    private final FrameLayout f12443o;

    /* renamed from: p */
    private final ImageView f12444p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public ImageView f12445q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public MultiTouchViewPager f12446r;

    /* renamed from: s */
    private C4741a<T> f12447s;

    /* renamed from: t */
    private C4733b f12448t;

    /* renamed from: u */
    private C3333c f12449u;

    /* renamed from: v */
    private ScaleGestureDetector f12450v;

    /* renamed from: w */
    private C4734a f12451w;

    /* renamed from: x */
    private boolean f12452x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f12453y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f12454z;

    /* renamed from: g.e.a.i.d.a$a */
    static final class C4752a extends C5943l implements C5918l<Integer, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12455g;

        C4752a(C4751a aVar) {
            this.f12455g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13761a(int i) {
            ImageView c = this.f12455g.f12445q;
            if (c != null) {
                if (this.f12455g.m19141j()) {
                    C4724d.m19048g(c);
                } else {
                    C4724d.m19050i(c);
                }
            }
            C5918l onPageChange$imageviewer_release = this.f12455g.getOnPageChange$imageviewer_release();
            if (onPageChange$imageviewer_release != null) {
                C5812t tVar = (C5812t) onPageChange$imageviewer_release.mo4090d(Integer.valueOf(i));
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13761a(((Number) obj).intValue());
            return C5812t.f14872a;
        }
    }

    /* renamed from: g.e.a.i.d.a$b */
    static final class C4753b extends C5943l implements C5918l<Long, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12456g;

        C4753b(C4751a aVar) {
            this.f12456g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13762a(long j) {
            View b = this.f12456g.f12441m;
            Float valueOf = Float.valueOf(this.f12456g.f12441m.getAlpha());
            Float valueOf2 = Float.valueOf(0.0f);
            C4724d.m19040a(b, valueOf, valueOf2, j);
            View overlayView$imageviewer_release = this.f12456g.getOverlayView$imageviewer_release();
            if (overlayView$imageviewer_release != null) {
                View overlayView$imageviewer_release2 = this.f12456g.getOverlayView$imageviewer_release();
                C4724d.m19040a(overlayView$imageviewer_release, overlayView$imageviewer_release2 != null ? Float.valueOf(overlayView$imageviewer_release2.getAlpha()) : null, valueOf2, j);
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13762a(((Number) obj).longValue());
            return C5812t.f14872a;
        }
    }

    /* renamed from: g.e.a.i.d.a$c */
    static final class C4754c extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12457g;

        C4754c(C4751a aVar) {
            this.f12457g = aVar;
            super(0);
        }

        public final void invoke() {
            C5907a onDismiss$imageviewer_release = this.f12457g.getOnDismiss$imageviewer_release();
            if (onDismiss$imageviewer_release != null) {
                C5812t tVar = (C5812t) onDismiss$imageviewer_release.invoke();
            }
        }
    }

    /* renamed from: g.e.a.i.d.a$d */
    static final class C4755d extends C5943l implements C5918l<Long, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12458g;

        C4755d(C4751a aVar) {
            this.f12458g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13763a(long j) {
            View b = this.f12458g.f12441m;
            Float valueOf = Float.valueOf(0.0f);
            Float valueOf2 = Float.valueOf(1.0f);
            C4724d.m19040a(b, valueOf, valueOf2, j);
            View overlayView$imageviewer_release = this.f12458g.getOverlayView$imageviewer_release();
            if (overlayView$imageviewer_release != null) {
                C4724d.m19040a(overlayView$imageviewer_release, valueOf, valueOf2, j);
            }
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13763a(((Number) obj).longValue());
            return C5812t.f14872a;
        }
    }

    /* renamed from: g.e.a.i.d.a$e */
    static final class C4756e extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12459g;

        C4756e(C4751a aVar) {
            this.f12459g = aVar;
            super(0);
        }

        public final void invoke() {
            this.f12459g.m19143l();
        }
    }

    /* renamed from: g.e.a.i.d.a$f */
    static final class C4757f extends C5943l implements C5918l<MotionEvent, Boolean> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12460g;

        C4757f(C4751a aVar) {
            this.f12460g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo13764a(MotionEvent motionEvent) {
            C5942k.m22327b(motionEvent, "it");
            if (this.f12460g.f12446r.mo9877f()) {
                C4751a aVar = this.f12460g;
                aVar.m19116a(motionEvent, aVar.f12454z);
            }
            return false;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            return Boolean.valueOf(mo13764a((MotionEvent) obj));
        }
    }

    /* renamed from: g.e.a.i.d.a$g */
    static final class C4758g extends C5943l implements C5918l<MotionEvent, Boolean> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12461g;

        C4758g(C4751a aVar) {
            this.f12461g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final boolean mo13765a(MotionEvent motionEvent) {
            C5942k.m22327b(motionEvent, "it");
            C4751a aVar = this.f12461g;
            aVar.f12453y = !aVar.mo13743b();
            return false;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            return Boolean.valueOf(mo13765a((MotionEvent) obj));
        }
    }

    /* renamed from: g.e.a.i.d.a$h */
    static final class C4759h extends C5943l implements C5918l<C4731a, C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12462g;

        C4759h(C4751a aVar) {
            this.f12462g = aVar;
            super(1);
        }

        /* renamed from: a */
        public final void mo13766a(C4731a aVar) {
            C5942k.m22327b(aVar, "it");
            this.f12462g.f12429A = aVar;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo13766a((C4731a) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: g.e.a.i.d.a$i */
    static final class C4760i extends C5943l implements C5907a<Boolean> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12463g;

        C4760i(C4751a aVar) {
            this.f12463g = aVar;
            super(0);
        }

        public final boolean invoke() {
            return this.f12463g.getShouldDismissToBottom();
        }
    }

    /* renamed from: g.e.a.i.d.a$j */
    static final class C4761j extends C5943l implements C5907a<C5812t> {

        /* renamed from: g */
        final /* synthetic */ C4751a f12464g;

        C4761j(C4751a aVar) {
            this.f12464g = aVar;
            super(0);
        }

        public final void invoke() {
            this.f12464g.m19129d();
        }
    }

    /* renamed from: g.e.a.i.d.a$k */
    static final class C4762k extends C5940i implements C5922p<Float, Integer, C5812t> {
        C4762k(C4751a aVar) {
            super(2, aVar);
        }

        /* renamed from: a */
        public final void mo13767a(float f, int i) {
            ((C4751a) this.f14932g).m19124b(f, i);
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Object mo4018c(Object obj, Object obj2) {
            mo13767a(((Number) obj).floatValue(), ((Number) obj2).intValue());
            return C5812t.f14872a;
        }

        /* renamed from: e */
        public final String mo9884e() {
            return "handleSwipeViewMove";
        }

        /* renamed from: f */
        public final C5740c mo9885f() {
            return C5950s.m22341a(C4751a.class);
        }

        /* renamed from: i */
        public final String mo9886i() {
            return "handleSwipeViewMove(FI)V";
        }
    }

    public C4751a(Context context, AttributeSet attributeSet, int i) {
        C5942k.m22327b(context, "context");
        super(context, attributeSet, i);
        this.f12434f = true;
        this.f12435g = true;
        this.f12438j = new int[]{0, 0, 0, 0};
        this.f12430B = C5837l.m22159a();
        View.inflate(context, C4715b.view_image_viewer, this);
        View findViewById = findViewById(C4714a.rootContainer);
        C5942k.m22324a((Object) findViewById, "findViewById(R.id.rootContainer)");
        this.f12440l = (ViewGroup) findViewById;
        View findViewById2 = findViewById(C4714a.backgroundView);
        C5942k.m22324a((Object) findViewById2, "findViewById(R.id.backgroundView)");
        this.f12441m = findViewById2;
        View findViewById3 = findViewById(C4714a.dismissContainer);
        C5942k.m22324a((Object) findViewById3, "findViewById(R.id.dismissContainer)");
        this.f12442n = (ViewGroup) findViewById3;
        View findViewById4 = findViewById(C4714a.transitionImageContainer);
        C5942k.m22324a((Object) findViewById4, "findViewById(R.id.transitionImageContainer)");
        this.f12443o = (FrameLayout) findViewById4;
        View findViewById5 = findViewById(C4714a.transitionImageView);
        C5942k.m22324a((Object) findViewById5, "findViewById(R.id.transitionImageView)");
        this.f12444p = (ImageView) findViewById5;
        View findViewById6 = findViewById(C4714a.imagesPager);
        C5942k.m22324a((Object) findViewById6, "findViewById(R.id.imagesPager)");
        MultiTouchViewPager multiTouchViewPager = (MultiTouchViewPager) findViewById6;
        this.f12446r = multiTouchViewPager;
        C4726e.m19053a(multiTouchViewPager, null, new C4752a(this), null, 5, null);
        this.f12448t = m19138h();
        this.f12449u = m19134f();
        this.f12450v = m19136g();
    }

    public /* synthetic */ C4751a(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final float m19114a(float f, int i) {
        return 1.0f - (((1.0f / ((float) i)) / 4.0f) * Math.abs(f));
    }

    /* renamed from: a */
    private final C4764c m19115a(ImageView imageView) {
        return new C4764c(imageView, this.f12444p, this.f12443o);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m19116a(MotionEvent motionEvent, boolean z) {
        View view = this.f12439k;
        if (view != null && !z) {
            if (view != null) {
                C4724d.m19051j(view);
            }
            super.dispatchTouchEvent(motionEvent);
        }
    }

    /* renamed from: a */
    private final boolean m19122a(MotionEvent motionEvent) {
        View view = this.f12439k;
        return view != null && C4724d.m19046e(view) && view.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m19124b(float f, int i) {
        float a = m19114a(f, i);
        this.f12441m.setAlpha(a);
        View view = this.f12439k;
        if (view != null) {
            view.setAlpha(a);
        }
    }

    /* renamed from: b */
    private final void m19125b(MotionEvent motionEvent) {
        this.f12429A = null;
        this.f12452x = false;
        this.f12446r.dispatchTouchEvent(motionEvent);
        C4734a aVar = this.f12451w;
        if (aVar != null) {
            aVar.onTouch(this.f12440l, motionEvent);
            this.f12454z = m19122a(motionEvent);
            return;
        }
        C5942k.m22329c("swipeDismissHandler");
        throw null;
    }

    /* renamed from: c */
    private final void m19127c(MotionEvent motionEvent) {
        this.f12453y = false;
        C4734a aVar = this.f12451w;
        if (aVar != null) {
            aVar.onTouch(this.f12440l, motionEvent);
            this.f12446r.dispatchTouchEvent(motionEvent);
            this.f12454z = m19122a(motionEvent);
            return;
        }
        C5942k.m22329c("swipeDismissHandler");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m19129d() {
        m19142k();
        ViewGroup viewGroup = this.f12442n;
        Integer valueOf = Integer.valueOf(0);
        C4724d.m19041a(viewGroup, valueOf, valueOf, valueOf, valueOf);
        C4764c cVar = this.f12432D;
        if (cVar != null) {
            cVar.mo13769a(getShouldDismissToBottom(), (C5918l<? super Long, C5812t>) new C4753b<Object,C5812t>(this), (C5907a<C5812t>) new C4754c<C5812t>(this));
        } else {
            C5942k.m22329c("transitionImageAnimator");
            throw null;
        }
    }

    /* renamed from: d */
    private final boolean m19130d(MotionEvent motionEvent) {
        this.f12448t.mo13705a(motionEvent);
        C4731a aVar = this.f12429A;
        if (aVar == null) {
            return true;
        }
        int i = C4763b.f12465a[aVar.ordinal()];
        if (i == 1 || i == 2) {
            if (!this.f12435g || this.f12452x || !this.f12446r.mo9877f()) {
                return true;
            }
            C4734a aVar2 = this.f12451w;
            if (aVar2 != null) {
                return aVar2.onTouch(this.f12440l, motionEvent);
            }
            C5942k.m22329c("swipeDismissHandler");
            throw null;
        } else if (i == 3 || i == 4) {
            return this.f12446r.dispatchTouchEvent(motionEvent);
        } else {
            return true;
        }
    }

    /* renamed from: e */
    private final void m19131e() {
        C4764c cVar = this.f12432D;
        if (cVar != null) {
            cVar.mo13770a(this.f12438j, (C5918l<? super Long, C5812t>) new C4755d<Object,C5812t>(this), (C5907a<C5812t>) new C4756e<C5812t>(this));
        } else {
            C5942k.m22329c("transitionImageAnimator");
            throw null;
        }
    }

    /* renamed from: e */
    private final void m19132e(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            m19127c(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            m19125b(motionEvent);
        }
        this.f12450v.onTouchEvent(motionEvent);
        this.f12449u.mo10724a(motionEvent);
    }

    /* renamed from: f */
    private final C3333c m19134f() {
        return new C3333c(getContext(), new C4730a(new C4757f(this), new C4758g(this)));
    }

    /* renamed from: g */
    private final ScaleGestureDetector m19136g() {
        return new ScaleGestureDetector(getContext(), new SimpleOnScaleGestureListener());
    }

    /* access modifiers changed from: private */
    public final boolean getShouldDismissToBottom() {
        ImageView imageView = this.f12445q;
        return imageView == null || !C4724d.m19045d(imageView) || !m19141j();
    }

    /* renamed from: h */
    private final C4733b m19138h() {
        Context context = getContext();
        C5942k.m22324a((Object) context, "context");
        return new C4733b(context, new C4759h(this));
    }

    /* renamed from: i */
    private final C4734a m19140i() {
        return new C4734a(this.f12442n, new C4761j(this), new C4762k(this), new C4760i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m19141j() {
        return getCurrentPosition$imageviewer_release() == this.f12433E;
    }

    /* renamed from: k */
    private final void m19142k() {
        C4724d.m19050i(this.f12443o);
        C4724d.m19047f(this.f12446r);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m19143l() {
        C4724d.m19047f(this.f12443o);
        C4724d.m19050i(this.f12446r);
    }

    private final void setStartPosition(int i) {
        this.f12433E = i;
        setCurrentPosition$imageviewer_release(i);
    }

    /* renamed from: a */
    public final void mo13740a() {
        if (getShouldDismissToBottom()) {
            C4734a aVar = this.f12451w;
            if (aVar != null) {
                aVar.mo13706a();
            } else {
                C5942k.m22329c("swipeDismissHandler");
                throw null;
            }
        } else {
            m19129d();
        }
    }

    /* renamed from: a */
    public final void mo13741a(ImageView imageView, boolean z) {
        m19142k();
        this.f12445q = imageView;
        C4740a<T> aVar = this.f12431C;
        if (aVar != null) {
            aVar.mo13712a(this.f12444p, this.f12430B.get(this.f12433E));
        }
        C4720a.m19029a(this.f12444p, imageView);
        this.f12432D = m19115a(imageView);
        C4734a i = m19140i();
        this.f12451w = i;
        ViewGroup viewGroup = this.f12440l;
        if (i != null) {
            viewGroup.setOnTouchListener(i);
            if (z) {
                m19131e();
            } else {
                m19143l();
            }
        } else {
            C5942k.m22329c("swipeDismissHandler");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo13742a(List<? extends T> list, int i, C4740a<T> aVar) {
        C5942k.m22327b(list, "images");
        C5942k.m22327b(aVar, "imageLoader");
        this.f12430B = list;
        this.f12431C = aVar;
        Context context = getContext();
        C5942k.m22324a((Object) context, "context");
        C4741a<T> aVar2 = new C4741a<>(context, list, aVar, this.f12434f);
        this.f12447s = aVar2;
        this.f12446r.setAdapter(aVar2);
        setStartPosition(i);
    }

    /* renamed from: b */
    public final boolean mo13743b() {
        C4741a<T> aVar = this.f12447s;
        if (aVar != null) {
            return aVar.mo13714c(getCurrentPosition$imageviewer_release());
        }
        return false;
    }

    /* renamed from: c */
    public final void mo13744c() {
        C4741a<T> aVar = this.f12447s;
        if (aVar != null) {
            aVar.mo13715d(getCurrentPosition$imageviewer_release());
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C5942k.m22327b(motionEvent, "event");
        if (C4724d.m19046e(this.f12439k)) {
            View view = this.f12439k;
            if (view != null && view.dispatchTouchEvent(motionEvent)) {
                return true;
            }
        }
        C4764c cVar = this.f12432D;
        if (cVar == null) {
            C5942k.m22329c("transitionImageAnimator");
            throw null;
        } else if (cVar.mo13771a()) {
            return true;
        } else {
            if (this.f12453y && motionEvent.getAction() == 2 && motionEvent.getPointerCount() == 1) {
                return true;
            }
            m19132e(motionEvent);
            if (this.f12429A != null || (!this.f12450v.isInProgress() && motionEvent.getPointerCount() <= 1 && !this.f12452x)) {
                return mo13743b() ? super.dispatchTouchEvent(motionEvent) : m19130d(motionEvent);
            }
            this.f12452x = true;
            return this.f12446r.dispatchTouchEvent(motionEvent);
        }
    }

    public final int[] getContainerPadding$imageviewer_release() {
        return this.f12438j;
    }

    public final int getCurrentPosition$imageviewer_release() {
        return this.f12446r.getCurrentItem();
    }

    public final int getImagesMargin$imageviewer_release() {
        return this.f12446r.getPageMargin();
    }

    public final C5907a<C5812t> getOnDismiss$imageviewer_release() {
        return this.f12436h;
    }

    public final C5918l<Integer, C5812t> getOnPageChange$imageviewer_release() {
        return this.f12437i;
    }

    public final View getOverlayView$imageviewer_release() {
        return this.f12439k;
    }

    public void setBackgroundColor(int i) {
        findViewById(C4714a.backgroundView).setBackgroundColor(i);
    }

    public final void setContainerPadding$imageviewer_release(int[] iArr) {
        C5942k.m22327b(iArr, "<set-?>");
        this.f12438j = iArr;
    }

    public final void setCurrentPosition$imageviewer_release(int i) {
        this.f12446r.setCurrentItem(i);
    }

    public final void setImagesMargin$imageviewer_release(int i) {
        this.f12446r.setPageMargin(i);
    }

    public final void setOnDismiss$imageviewer_release(C5907a<C5812t> aVar) {
        this.f12436h = aVar;
    }

    public final void setOnPageChange$imageviewer_release(C5918l<? super Integer, C5812t> lVar) {
        this.f12437i = lVar;
    }

    public final void setOverlayView$imageviewer_release(View view) {
        this.f12439k = view;
        if (view != null) {
            this.f12440l.addView(view);
        }
    }

    public final void setSwipeToDismissAllowed$imageviewer_release(boolean z) {
        this.f12435g = z;
    }

    public final void setZoomingAllowed$imageviewer_release(boolean z) {
        this.f12434f = z;
    }
}
