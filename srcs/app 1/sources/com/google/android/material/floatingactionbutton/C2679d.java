package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.graphics.drawable.C0371a;
import com.google.android.material.internal.C2706f;
import java.util.ArrayList;
import java.util.Iterator;
import p071f.p097h.p107l.C3321h;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4372a;
import p147g.p156d.p157a.p185c.p186a0.C4374b;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;
import p147g.p156d.p157a.p185c.p189m.C4417a;
import p147g.p156d.p157a.p185c.p189m.C4418b;
import p147g.p156d.p157a.p185c.p189m.C4422f;
import p147g.p156d.p157a.p185c.p189m.C4423g;
import p147g.p156d.p157a.p185c.p189m.C4424h;
import p147g.p156d.p157a.p185c.p203z.C4465a;
import p147g.p156d.p157a.p185c.p203z.C4468b;

/* renamed from: com.google.android.material.floatingactionbutton.d */
class C2679d {

    /* renamed from: F */
    static final TimeInterpolator f7740F = C4417a.f11714c;

    /* renamed from: G */
    static final int[] f7741G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f7742H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f7743I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f7744J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f7745K = {16842910};

    /* renamed from: L */
    static final int[] f7746L = new int[0];

    /* renamed from: A */
    private final Rect f7747A = new Rect();

    /* renamed from: B */
    private final RectF f7748B = new RectF();

    /* renamed from: C */
    private final RectF f7749C = new RectF();

    /* renamed from: D */
    private final Matrix f7750D = new Matrix();

    /* renamed from: E */
    private OnPreDrawListener f7751E;

    /* renamed from: a */
    C4389k f7752a;

    /* renamed from: b */
    C4382g f7753b;

    /* renamed from: c */
    Drawable f7754c;

    /* renamed from: d */
    C2676c f7755d;

    /* renamed from: e */
    Drawable f7756e;

    /* renamed from: f */
    boolean f7757f;

    /* renamed from: g */
    boolean f7758g = true;

    /* renamed from: h */
    float f7759h;

    /* renamed from: i */
    float f7760i;

    /* renamed from: j */
    float f7761j;

    /* renamed from: k */
    int f7762k;

    /* renamed from: l */
    private final C2706f f7763l;

    /* renamed from: m */
    private C4424h f7764m;

    /* renamed from: n */
    private C4424h f7765n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Animator f7766o;

    /* renamed from: p */
    private C4424h f7767p;

    /* renamed from: q */
    private C4424h f7768q;

    /* renamed from: r */
    private float f7769r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f7770s = 1.0f;

    /* renamed from: t */
    private int f7771t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f7772u = 0;

    /* renamed from: v */
    private ArrayList<AnimatorListener> f7773v;

    /* renamed from: w */
    private ArrayList<AnimatorListener> f7774w;

    /* renamed from: x */
    private ArrayList<C2688i> f7775x;

    /* renamed from: y */
    final FloatingActionButton f7776y;

    /* renamed from: z */
    final C4374b f7777z;

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    class C2680a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f7778a;

        /* renamed from: b */
        final /* synthetic */ boolean f7779b;

        /* renamed from: c */
        final /* synthetic */ C2689j f7780c;

        C2680a(boolean z, C2689j jVar) {
            this.f7779b = z;
            this.f7780c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f7778a = true;
        }

        public void onAnimationEnd(Animator animator) {
            C2679d.this.f7772u = 0;
            C2679d.this.f7766o = null;
            if (!this.f7778a) {
                C2679d.this.f7776y.mo9006a(this.f7779b ? 8 : 4, this.f7779b);
                C2689j jVar = this.f7780c;
                if (jVar != null) {
                    jVar.mo8811b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C2679d.this.f7776y.mo9006a(0, this.f7779b);
            C2679d.this.f7772u = 1;
            C2679d.this.f7766o = animator;
            this.f7778a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    class C2681b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f7782a;

        /* renamed from: b */
        final /* synthetic */ C2689j f7783b;

        C2681b(boolean z, C2689j jVar) {
            this.f7782a = z;
            this.f7783b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            C2679d.this.f7772u = 0;
            C2679d.this.f7766o = null;
            C2689j jVar = this.f7783b;
            if (jVar != null) {
                jVar.mo8810a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C2679d.this.f7776y.mo9006a(0, this.f7782a);
            C2679d.this.f7772u = 2;
            C2679d.this.f7766o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    class C2682c extends C4423g {
        C2682c() {
        }

        /* renamed from: a */
        public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
            C2679d.this.f7770s = f;
            return super.mo8898a(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    class C2683d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f7786a = new FloatEvaluator();

        C2683d(C2679d dVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f7786a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    class C2684e implements OnPreDrawListener {
        C2684e() {
        }

        public boolean onPreDraw() {
            C2679d.this.mo8884p();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    private class C2685f extends C2691l {
        C2685f(C2679d dVar) {
            super(dVar, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8903a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    private class C2686g extends C2691l {
        C2686g() {
            super(C2679d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8903a() {
            C2679d dVar = C2679d.this;
            return dVar.f7759h + dVar.f7760i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    private class C2687h extends C2691l {
        C2687h() {
            super(C2679d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8903a() {
            C2679d dVar = C2679d.this;
            return dVar.f7759h + dVar.f7761j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    interface C2688i {
        /* renamed from: a */
        void mo8815a();

        /* renamed from: b */
        void mo8816b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    interface C2689j {
        /* renamed from: a */
        void mo8810a();

        /* renamed from: b */
        void mo8811b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    private class C2690k extends C2691l {
        C2690k() {
            super(C2679d.this, null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo8903a() {
            return C2679d.this.f7759h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    private abstract class C2691l extends AnimatorListenerAdapter implements AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f7791a;

        /* renamed from: b */
        private float f7792b;

        /* renamed from: c */
        private float f7793c;

        private C2691l() {
        }

        /* synthetic */ C2691l(C2679d dVar, C2680a aVar) {
            this();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo8903a();

        public void onAnimationEnd(Animator animator) {
            C2679d.this.mo8873e((float) ((int) this.f7793c));
            this.f7791a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f7791a) {
                C4382g gVar = C2679d.this.f7753b;
                this.f7792b = gVar == null ? 0.0f : gVar.mo13071e();
                this.f7793c = mo8903a();
                this.f7791a = true;
            }
            C2679d dVar = C2679d.this;
            float f = this.f7792b;
            dVar.mo8873e((float) ((int) (f + ((this.f7793c - f) * valueAnimator.getAnimatedFraction()))));
        }
    }

    C2679d(FloatingActionButton floatingActionButton, C4374b bVar) {
        this.f7776y = floatingActionButton;
        this.f7777z = bVar;
        C2706f fVar = new C2706f();
        this.f7763l = fVar;
        fVar.mo8989a(f7741G, m11098a((C2691l) new C2687h()));
        this.f7763l.mo8989a(f7742H, m11098a((C2691l) new C2686g()));
        this.f7763l.mo8989a(f7743I, m11098a((C2691l) new C2686g()));
        this.f7763l.mo8989a(f7744J, m11098a((C2691l) new C2686g()));
        this.f7763l.mo8989a(f7745K, m11098a((C2691l) new C2690k()));
        this.f7763l.mo8989a(f7746L, m11098a((C2691l) new C2685f(this)));
        this.f7769r = this.f7776y.getRotation();
    }

    /* renamed from: A */
    private OnPreDrawListener m11092A() {
        if (this.f7751E == null) {
            this.f7751E = new C2684e();
        }
        return this.f7751E;
    }

    /* renamed from: B */
    private boolean m11093B() {
        return C3379v.m13768D(this.f7776y) && !this.f7776y.isInEditMode();
    }

    /* renamed from: a */
    private AnimatorSet m11097a(C4424h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f7776y, View.ALPHA, new float[]{f});
        hVar.mo13173b("opacity").mo13180a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f7776y, View.SCALE_X, new float[]{f2});
        String str = "scale";
        hVar.mo13173b(str).mo13180a((Animator) ofFloat2);
        m11100a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f7776y, View.SCALE_Y, new float[]{f2});
        hVar.mo13173b(str).mo13180a((Animator) ofFloat3);
        m11100a(ofFloat3);
        arrayList.add(ofFloat3);
        m11099a(f3, this.f7750D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f7776y, new C4422f(), new C2682c(), new Matrix[]{new Matrix(this.f7750D)});
        hVar.mo13173b("iconScale").mo13180a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C4418b.m18007a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: a */
    private ValueAnimator m11098a(C2691l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f7740F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: a */
    private void m11099a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f7776y.getDrawable();
        if (drawable != null && this.f7771t != 0) {
            RectF rectF = this.f7748B;
            RectF rectF2 = this.f7749C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f7771t;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
            int i2 = this.f7771t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: a */
    private void m11100a(ObjectAnimator objectAnimator) {
        if (VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C2683d(this));
        }
    }

    /* renamed from: y */
    private C4424h m11101y() {
        if (this.f7765n == null) {
            this.f7765n = C4424h.m18017a(this.f7776y.getContext(), C4372a.design_fab_hide_motion_spec);
        }
        C4424h hVar = this.f7765n;
        C3321h.m13543a(hVar);
        return hVar;
    }

    /* renamed from: z */
    private C4424h m11102z() {
        if (this.f7764m == null) {
            this.f7764m = C4424h.m18017a(this.f7776y.getContext(), C4372a.design_fab_show_motion_spec);
        }
        C4424h hVar = this.f7764m;
        C3321h.m13543a(hVar);
        return hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C4382g mo8844a() {
        C4389k kVar = this.f7752a;
        C3321h.m13543a(kVar);
        return new C4382g(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo8845a(float f) {
        if (this.f7759h != f) {
            this.f7759h = f;
            mo8846a(f, this.f7760i, this.f7761j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8846a(float f, float f2, float f3) {
        mo8892x();
        mo8873e(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo8847a(int i) {
        if (this.f7771t != i) {
            this.f7771t = i;
            mo8891w();
        }
    }

    /* renamed from: a */
    public void mo8848a(AnimatorListener animatorListener) {
        if (this.f7774w == null) {
            this.f7774w = new ArrayList<>();
        }
        this.f7774w.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8849a(ColorStateList colorStateList) {
        C4382g gVar = this.f7753b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        C2676c cVar = this.f7755d;
        if (cVar != null) {
            cVar.mo8830a(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8850a(ColorStateList colorStateList, Mode mode, ColorStateList colorStateList2, int i) {
        C4382g a = mo8844a();
        this.f7753b = a;
        a.setTintList(colorStateList);
        if (mode != null) {
            this.f7753b.setTintMode(mode);
        }
        this.f7753b.mo13056a(-12303292);
        this.f7753b.mo13058a(this.f7776y.getContext());
        C4465a aVar = new C4465a(this.f7753b.mo13083l());
        aVar.setTintList(C4468b.m18201b(colorStateList2));
        this.f7754c = aVar;
        C4382g gVar = this.f7753b;
        C3321h.m13543a(gVar);
        this.f7756e = new LayerDrawable(new Drawable[]{gVar, aVar});
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8851a(Mode mode) {
        C4382g gVar = this.f7753b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8852a(Rect rect) {
        int sizeDimension = this.f7757f ? (this.f7762k - this.f7776y.getSizeDimension()) / 2 : 0;
        float c = this.f7758g ? mo8868c() + this.f7761j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) c));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (c * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8853a(C2688i iVar) {
        if (this.f7775x == null) {
            this.f7775x = new ArrayList<>();
        }
        this.f7775x.add(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8854a(C2689j jVar, boolean z) {
        if (!mo8878j()) {
            Animator animator = this.f7766o;
            if (animator != null) {
                animator.cancel();
            }
            if (m11093B()) {
                C4424h hVar = this.f7768q;
                if (hVar == null) {
                    hVar = m11101y();
                }
                AnimatorSet a = m11097a(hVar, 0.0f, 0.0f, 0.0f);
                a.addListener(new C2680a(z, jVar));
                ArrayList<AnimatorListener> arrayList = this.f7774w;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f7776y.mo9006a(z ? 8 : 4, z);
                if (jVar != null) {
                    jVar.mo8811b();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo8855a(C4389k kVar) {
        this.f7752a = kVar;
        C4382g gVar = this.f7753b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f7754c;
        if (drawable instanceof C4404n) {
            ((C4404n) drawable).setShapeAppearanceModel(kVar);
        }
        C2676c cVar = this.f7755d;
        if (cVar != null) {
            cVar.mo8831a(kVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo8856a(C4424h hVar) {
        this.f7768q = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8857a(boolean z) {
        this.f7757f = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8858a(int[] iArr) {
        this.f7763l.mo8988a(iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Drawable mo8859b() {
        return this.f7756e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo8860b(float f) {
        if (this.f7760i != f) {
            this.f7760i = f;
            mo8846a(this.f7759h, f, this.f7761j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8861b(int i) {
        this.f7762k = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8862b(AnimatorListener animatorListener) {
        if (this.f7773v == null) {
            this.f7773v = new ArrayList<>();
        }
        this.f7773v.add(animatorListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8863b(ColorStateList colorStateList) {
        Drawable drawable = this.f7754c;
        if (drawable != null) {
            C0371a.m1898a(drawable, C4468b.m18201b(colorStateList));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.drawable.Drawable] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8864b(android.graphics.Rect r8) {
        /*
            r7 = this;
            android.graphics.drawable.Drawable r0 = r7.f7756e
            java.lang.String r1 = "Didn't initialize content background"
            p071f.p097h.p107l.C3321h.m13544a(r0, r1)
            boolean r0 = r7.mo8888t()
            if (r0 == 0) goto L_0x0020
            android.graphics.drawable.InsetDrawable r0 = new android.graphics.drawable.InsetDrawable
            android.graphics.drawable.Drawable r2 = r7.f7756e
            int r3 = r8.left
            int r4 = r8.top
            int r5 = r8.right
            int r6 = r8.bottom
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            g.d.a.c.a0.b r8 = r7.f7777z
            goto L_0x0024
        L_0x0020:
            g.d.a.c.a0.b r8 = r7.f7777z
            android.graphics.drawable.Drawable r0 = r7.f7756e
        L_0x0024:
            r8.mo8813a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.C2679d.mo8864b(android.graphics.Rect):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8865b(C2689j jVar, boolean z) {
        if (!mo8879k()) {
            Animator animator = this.f7766o;
            if (animator != null) {
                animator.cancel();
            }
            if (m11093B()) {
                if (this.f7776y.getVisibility() != 0) {
                    this.f7776y.setAlpha(0.0f);
                    this.f7776y.setScaleY(0.0f);
                    this.f7776y.setScaleX(0.0f);
                    mo8869c(0.0f);
                }
                C4424h hVar = this.f7767p;
                if (hVar == null) {
                    hVar = m11102z();
                }
                AnimatorSet a = m11097a(hVar, 1.0f, 1.0f, 1.0f);
                a.addListener(new C2681b(z, jVar));
                ArrayList<AnimatorListener> arrayList = this.f7773v;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        a.addListener((AnimatorListener) it.next());
                    }
                }
                a.start();
            } else {
                this.f7776y.mo9006a(0, z);
                this.f7776y.setAlpha(1.0f);
                this.f7776y.setScaleY(1.0f);
                this.f7776y.setScaleX(1.0f);
                mo8869c(1.0f);
                if (jVar != null) {
                    jVar.mo8810a();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo8866b(C4424h hVar) {
        this.f7767p = hVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8867b(boolean z) {
        this.f7758g = z;
        mo8892x();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo8868c() {
        return this.f7759h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo8869c(float f) {
        this.f7770s = f;
        Matrix matrix = this.f7750D;
        m11099a(f, matrix);
        this.f7776y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo8870d(float f) {
        if (this.f7761j != f) {
            this.f7761j = f;
            mo8846a(this.f7759h, this.f7760i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo8871d() {
        return this.f7757f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C4424h mo8872e() {
        return this.f7768q;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8873e(float f) {
        C4382g gVar = this.f7753b;
        if (gVar != null) {
            gVar.mo13064b(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo8874f() {
        return this.f7760i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo8875g() {
        return this.f7761j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C4389k mo8876h() {
        return this.f7752a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final C4424h mo8877i() {
        return this.f7767p;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo8878j() {
        boolean z = false;
        if (this.f7776y.getVisibility() == 0) {
            if (this.f7772u == 1) {
                z = true;
            }
            return z;
        }
        if (this.f7772u != 2) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo8879k() {
        boolean z = false;
        if (this.f7776y.getVisibility() != 0) {
            if (this.f7772u == 2) {
                z = true;
            }
            return z;
        }
        if (this.f7772u != 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo8880l() {
        this.f7763l.mo8987a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo8881m() {
        C4382g gVar = this.f7753b;
        if (gVar != null) {
            C4386h.m17877a((View) this.f7776y, gVar);
        }
        if (mo8887s()) {
            this.f7776y.getViewTreeObserver().addOnPreDrawListener(m11092A());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public void mo8882n() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo8883o() {
        ViewTreeObserver viewTreeObserver = this.f7776y.getViewTreeObserver();
        OnPreDrawListener onPreDrawListener = this.f7751E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f7751E = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo8884p() {
        float rotation = this.f7776y.getRotation();
        if (this.f7769r != rotation) {
            this.f7769r = rotation;
            mo8890v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public void mo8885q() {
        ArrayList<C2688i> arrayList = this.f7775x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2688i) it.next()).mo8816b();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public void mo8886r() {
        ArrayList<C2688i> arrayList = this.f7775x;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C2688i) it.next()).mo8815a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo8887s() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public boolean mo8888t() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final boolean mo8889u() {
        return !this.f7757f || this.f7776y.getSizeDimension() >= this.f7762k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo8890v() {
        int i;
        FloatingActionButton floatingActionButton;
        if (VERSION.SDK_INT == 19) {
            if (this.f7769r % 90.0f != 0.0f) {
                i = 1;
                if (this.f7776y.getLayerType() != 1) {
                    floatingActionButton = this.f7776y;
                }
            } else if (this.f7776y.getLayerType() != 0) {
                floatingActionButton = this.f7776y;
                i = 0;
            }
            floatingActionButton.setLayerType(i, null);
        }
        C4382g gVar = this.f7753b;
        if (gVar != null) {
            gVar.mo13065b((int) this.f7769r);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final void mo8891w() {
        mo8869c(this.f7770s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: x */
    public final void mo8892x() {
        Rect rect = this.f7747A;
        mo8852a(rect);
        mo8864b(rect);
        this.f7777z.mo8812a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
