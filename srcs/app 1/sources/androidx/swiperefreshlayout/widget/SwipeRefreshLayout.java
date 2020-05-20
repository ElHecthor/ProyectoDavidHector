package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.widget.C0389g;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p108m.C3369l;
import p071f.p097h.p108m.C3370m;
import p071f.p097h.p108m.C3373p;
import p071f.p097h.p108m.C3374q;
import p071f.p097h.p108m.C3379v;

public class SwipeRefreshLayout extends ViewGroup implements C3373p, C3369l {

    /* renamed from: T */
    private static final String f2957T = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: U */
    private static final int[] f2958U = {16842766};

    /* renamed from: A */
    private int f2959A;

    /* renamed from: B */
    protected int f2960B;

    /* renamed from: C */
    float f2961C;

    /* renamed from: D */
    protected int f2962D;

    /* renamed from: E */
    int f2963E;

    /* renamed from: F */
    int f2964F;

    /* renamed from: G */
    C0771b f2965G;

    /* renamed from: H */
    private Animation f2966H;

    /* renamed from: I */
    private Animation f2967I;

    /* renamed from: J */
    private Animation f2968J;

    /* renamed from: K */
    private Animation f2969K;

    /* renamed from: L */
    private Animation f2970L;

    /* renamed from: M */
    boolean f2971M;

    /* renamed from: N */
    private int f2972N;

    /* renamed from: O */
    boolean f2973O;

    /* renamed from: P */
    private C0767i f2974P;

    /* renamed from: Q */
    private AnimationListener f2975Q;

    /* renamed from: R */
    private final Animation f2976R;

    /* renamed from: S */
    private final Animation f2977S;

    /* renamed from: f */
    private View f2978f;

    /* renamed from: g */
    C0768j f2979g;

    /* renamed from: h */
    boolean f2980h;

    /* renamed from: i */
    private int f2981i;

    /* renamed from: j */
    private float f2982j;

    /* renamed from: k */
    private float f2983k;

    /* renamed from: l */
    private final C3374q f2984l;

    /* renamed from: m */
    private final C3370m f2985m;

    /* renamed from: n */
    private final int[] f2986n;

    /* renamed from: o */
    private final int[] f2987o;

    /* renamed from: p */
    private boolean f2988p;

    /* renamed from: q */
    private int f2989q;

    /* renamed from: r */
    int f2990r;

    /* renamed from: s */
    private float f2991s;

    /* renamed from: t */
    private float f2992t;

    /* renamed from: u */
    private boolean f2993u;

    /* renamed from: v */
    private int f2994v;

    /* renamed from: w */
    boolean f2995w;

    /* renamed from: x */
    private boolean f2996x;

    /* renamed from: y */
    private final DecelerateInterpolator f2997y;

    /* renamed from: z */
    C0769a f2998z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C0759a implements AnimationListener {
        C0759a() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f2980h) {
                swipeRefreshLayout.f2965G.setAlpha(255);
                SwipeRefreshLayout.this.f2965G.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f2971M) {
                    C0768j jVar = swipeRefreshLayout2.f2979g;
                    if (jVar != null) {
                        jVar.mo4225a();
                    }
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f2990r = swipeRefreshLayout3.f2998z.getTop();
                return;
            }
            swipeRefreshLayout.mo4178b();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C0760b extends Animation {
        C0760b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C0761c extends Animation {
        C0761c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C0762d extends Animation {

        /* renamed from: f */
        final /* synthetic */ int f3002f;

        /* renamed from: g */
        final /* synthetic */ int f3003g;

        C0762d(int i, int i2) {
            this.f3002f = i;
            this.f3003g = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C0771b bVar = SwipeRefreshLayout.this.f2965G;
            int i = this.f3002f;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f3003g - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C0763e implements AnimationListener {
        C0763e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f2995w) {
                swipeRefreshLayout.mo4176a((AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C0764f extends Animation {
        C0764f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int abs = !swipeRefreshLayout.f2973O ? swipeRefreshLayout.f2963E - Math.abs(swipeRefreshLayout.f2962D) : swipeRefreshLayout.f2963E;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i = swipeRefreshLayout2.f2960B;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i + ((int) (((float) (abs - i)) * f))) - swipeRefreshLayout2.f2998z.getTop());
            SwipeRefreshLayout.this.f2965G.mo4233a(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C0765g extends Animation {
        C0765g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo4175a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C0766h extends Animation {
        C0766h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f2961C;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo4175a(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C0767i {
        /* renamed from: a */
        boolean mo4224a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C0768j {
        /* renamed from: a */
        void mo4225a();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2980h = false;
        this.f2982j = -1.0f;
        this.f2986n = new int[2];
        this.f2987o = new int[2];
        this.f2994v = -1;
        this.f2959A = -1;
        this.f2975Q = new C0759a();
        this.f2976R = new C0764f();
        this.f2977S = new C0765g();
        this.f2981i = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f2989q = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f2997y = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f2972N = (int) (displayMetrics.density * 40.0f);
        m4100c();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f2963E = i;
        this.f2982j = (float) i;
        this.f2984l = new C3374q(this);
        this.f2985m = new C3370m(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f2972N;
        this.f2990r = i2;
        this.f2962D = i2;
        mo4175a(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2958U);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private Animation m4092a(int i, int i2) {
        C0762d dVar = new C0762d(i, i2);
        dVar.setDuration(300);
        this.f2998z.mo4226a(null);
        this.f2998z.clearAnimation();
        this.f2998z.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: a */
    private void m4093a(int i, AnimationListener animationListener) {
        this.f2960B = i;
        this.f2976R.reset();
        this.f2976R.setDuration(200);
        this.f2976R.setInterpolator(this.f2997y);
        if (animationListener != null) {
            this.f2998z.mo4226a(animationListener);
        }
        this.f2998z.clearAnimation();
        this.f2998z.startAnimation(this.f2976R);
    }

    /* renamed from: a */
    private void m4094a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2994v) {
            this.f2994v = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: a */
    private void m4095a(boolean z, boolean z2) {
        if (this.f2980h != z) {
            this.f2971M = z2;
            m4103d();
            this.f2980h = z;
            if (z) {
                m4093a(this.f2990r, this.f2975Q);
            } else {
                mo4176a(this.f2975Q);
            }
        }
    }

    /* renamed from: a */
    private boolean m4096a(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: b */
    private void m4097b(float f) {
        if (f > this.f2982j) {
            m4095a(true, true);
            return;
        }
        this.f2980h = false;
        this.f2965G.mo4234a(0.0f, 0.0f);
        C0763e eVar = null;
        if (!this.f2995w) {
            eVar = new C0763e();
        }
        m4098b(this.f2990r, eVar);
        this.f2965G.mo4238a(false);
    }

    /* renamed from: b */
    private void m4098b(int i, AnimationListener animationListener) {
        if (this.f2995w) {
            m4102c(i, animationListener);
            return;
        }
        this.f2960B = i;
        this.f2977S.reset();
        this.f2977S.setDuration(200);
        this.f2977S.setInterpolator(this.f2997y);
        if (animationListener != null) {
            this.f2998z.mo4226a(animationListener);
        }
        this.f2998z.clearAnimation();
        this.f2998z.startAnimation(this.f2977S);
    }

    /* renamed from: b */
    private void m4099b(AnimationListener animationListener) {
        this.f2998z.setVisibility(0);
        this.f2965G.setAlpha(255);
        C0760b bVar = new C0760b();
        this.f2966H = bVar;
        bVar.setDuration((long) this.f2989q);
        if (animationListener != null) {
            this.f2998z.mo4226a(animationListener);
        }
        this.f2998z.clearAnimation();
        this.f2998z.startAnimation(this.f2966H);
    }

    /* renamed from: c */
    private void m4100c() {
        this.f2998z = new C0769a(getContext(), -328966);
        C0771b bVar = new C0771b(getContext());
        this.f2965G = bVar;
        bVar.mo4237a(1);
        this.f2998z.setImageDrawable(this.f2965G);
        this.f2998z.setVisibility(8);
        addView(this.f2998z);
    }

    /* renamed from: c */
    private void m4101c(float f) {
        this.f2965G.mo4238a(true);
        float min = Math.min(1.0f, Math.abs(f / this.f2982j));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f2982j;
        int i = this.f2964F;
        if (i <= 0) {
            i = this.f2973O ? this.f2963E - this.f2962D : this.f2963E;
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f2962D + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f2998z.getVisibility() != 0) {
            this.f2998z.setVisibility(0);
        }
        if (!this.f2995w) {
            this.f2998z.setScaleX(1.0f);
            this.f2998z.setScaleY(1.0f);
        }
        if (this.f2995w) {
            setAnimationProgress(Math.min(1.0f, f / this.f2982j));
        }
        if (f < this.f2982j) {
            if (this.f2965G.getAlpha() > 76 && !m4096a(this.f2968J)) {
                m4106f();
            }
        } else if (this.f2965G.getAlpha() < 255 && !m4096a(this.f2969K)) {
            m4105e();
        }
        this.f2965G.mo4234a(0.0f, Math.min(0.8f, max * 0.8f));
        this.f2965G.mo4233a(Math.min(1.0f, max));
        this.f2965G.mo4240b((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f2990r);
    }

    /* renamed from: c */
    private void m4102c(int i, AnimationListener animationListener) {
        this.f2960B = i;
        this.f2961C = this.f2998z.getScaleX();
        C0766h hVar = new C0766h();
        this.f2970L = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f2998z.mo4226a(animationListener);
        }
        this.f2998z.clearAnimation();
        this.f2998z.startAnimation(this.f2970L);
    }

    /* renamed from: d */
    private void m4103d() {
        if (this.f2978f == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f2998z)) {
                    this.f2978f = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: d */
    private void m4104d(float f) {
        float f2 = this.f2992t;
        float f3 = f - f2;
        int i = this.f2981i;
        if (f3 > ((float) i) && !this.f2993u) {
            this.f2991s = f2 + ((float) i);
            this.f2993u = true;
            this.f2965G.setAlpha(76);
        }
    }

    /* renamed from: e */
    private void m4105e() {
        this.f2969K = m4092a(this.f2965G.getAlpha(), 255);
    }

    /* renamed from: f */
    private void m4106f() {
        this.f2968J = m4092a(this.f2965G.getAlpha(), 76);
    }

    private void setColorViewAlpha(int i) {
        this.f2998z.getBackground().setAlpha(i);
        this.f2965G.setAlpha(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4175a(float f) {
        int i = this.f2960B;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f2962D - i)) * f))) - this.f2998z.getTop());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4176a(AnimationListener animationListener) {
        C0761c cVar = new C0761c();
        this.f2967I = cVar;
        cVar.setDuration(150);
        this.f2998z.mo4226a(animationListener);
        this.f2998z.clearAnimation();
        this.f2998z.startAnimation(this.f2967I);
    }

    /* renamed from: a */
    public boolean mo4177a() {
        C0767i iVar = this.f2974P;
        if (iVar != null) {
            return iVar.mo4224a(this, this.f2978f);
        }
        View view = this.f2978f;
        return view instanceof ListView ? C0389g.m2018a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4178b() {
        this.f2998z.clearAnimation();
        this.f2965G.stop();
        this.f2998z.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f2995w) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f2962D - this.f2990r);
        }
        this.f2990r = this.f2998z.getTop();
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2985m.mo10820a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2985m.mo10819a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f2985m.mo10825a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2985m.mo10823a(i, i2, i3, i4, iArr);
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f2959A;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }

    public int getNestedScrollAxes() {
        return this.f2984l.mo10831a();
    }

    public int getProgressCircleDiameter() {
        return this.f2972N;
    }

    public int getProgressViewEndOffset() {
        return this.f2963E;
    }

    public int getProgressViewStartOffset() {
        return this.f2962D;
    }

    public boolean hasNestedScrollingParent() {
        return this.f2985m.mo10818a();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f2985m.mo10827b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo4178b();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m4103d();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2996x && actionMasked == 0) {
            this.f2996x = false;
        }
        if (!isEnabled() || this.f2996x || mo4177a() || this.f2980h || this.f2988p) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f2994v;
                    if (i == -1) {
                        Log.e(f2957T, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m4104d(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m4094a(motionEvent);
                    }
                }
            }
            this.f2993u = false;
            this.f2994v = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f2962D - this.f2998z.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f2994v = pointerId;
            this.f2993u = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f2992t = motionEvent.getY(findPointerIndex2);
        }
        return this.f2993u;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f2978f == null) {
                m4103d();
            }
            View view = this.f2978f;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f2998z.getMeasuredWidth();
                int measuredHeight2 = this.f2998z.getMeasuredHeight();
                C0769a aVar = this.f2998z;
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = i5 - i6;
                int i8 = this.f2990r;
                aVar.layout(i7, i8, i5 + i6, measuredHeight2 + i8);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f2978f == null) {
            m4103d();
        }
        View view = this.f2978f;
        if (view != null) {
            view.measure(MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f2998z.measure(MeasureSpec.makeMeasureSpec(this.f2972N, 1073741824), MeasureSpec.makeMeasureSpec(this.f2972N, 1073741824));
            this.f2959A = -1;
            int i3 = 0;
            while (true) {
                if (i3 >= getChildCount()) {
                    break;
                } else if (getChildAt(i3) == this.f2998z) {
                    this.f2959A = i3;
                    break;
                } else {
                    i3++;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f2983k;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.f2983k = 0.0f;
                } else {
                    this.f2983k = f - f2;
                    iArr[1] = i2;
                }
                m4101c(this.f2983k);
            }
        }
        if (this.f2973O && i2 > 0 && this.f2983k == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f2998z.setVisibility(8);
        }
        int[] iArr2 = this.f2986n;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.f2987o);
        int i5 = i4 + this.f2987o[1];
        if (i5 < 0 && !mo4177a()) {
            float abs = this.f2983k + ((float) Math.abs(i5));
            this.f2983k = abs;
            m4101c(abs);
        }
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f2984l.mo10834a(view, view2, i);
        startNestedScroll(i & 2);
        this.f2983k = 0.0f;
        this.f2988p = true;
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f2996x && !this.f2980h && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f2984l.mo10832a(view);
        this.f2988p = false;
        float f = this.f2983k;
        if (f > 0.0f) {
            m4097b(f);
            this.f2983k = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f2996x && actionMasked == 0) {
            this.f2996x = false;
        }
        if (!isEnabled() || this.f2996x || mo4177a() || this.f2980h || this.f2988p) {
            return false;
        }
        if (actionMasked == 0) {
            this.f2994v = motionEvent.getPointerId(0);
            this.f2993u = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f2994v);
            if (findPointerIndex < 0) {
                Log.e(f2957T, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f2993u) {
                float y = (motionEvent.getY(findPointerIndex) - this.f2991s) * 0.5f;
                this.f2993u = false;
                m4097b(y);
            }
            this.f2994v = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f2994v);
            if (findPointerIndex2 < 0) {
                Log.e(f2957T, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y2 = motionEvent.getY(findPointerIndex2);
            m4104d(y2);
            if (this.f2993u) {
                float f = (y2 - this.f2991s) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                m4101c(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f2957T, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f2994v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m4094a(motionEvent);
            }
        }
        return true;
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (VERSION.SDK_INT >= 21 || !(this.f2978f instanceof AbsListView)) {
            View view = this.f2978f;
            if (view == null || C3379v.m13769E(view)) {
                super.requestDisallowInterceptTouchEvent(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void setAnimationProgress(float f) {
        this.f2998z.setScaleX(f);
        this.f2998z.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m4103d();
        this.f2965G.mo4239a(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C3236a.m13263a(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f2982j = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo4178b();
        }
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f2985m.mo10817a(z);
    }

    public void setOnChildScrollUpCallback(C0767i iVar) {
        this.f2974P = iVar;
    }

    public void setOnRefreshListener(C0768j jVar) {
        this.f2979g = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f2998z.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C3236a.m13263a(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        if (!z || this.f2980h == z) {
            m4095a(z, false);
            return;
        }
        this.f2980h = z;
        setTargetOffsetTopAndBottom((!this.f2973O ? this.f2963E + this.f2962D : this.f2963E) - this.f2990r);
        this.f2971M = false;
        m4099b(this.f2975Q);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            this.f2972N = (int) (getResources().getDisplayMetrics().density * (i == 0 ? 56.0f : 40.0f));
            this.f2998z.setImageDrawable(null);
            this.f2965G.mo4237a(i);
            this.f2998z.setImageDrawable(this.f2965G);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f2964F = i;
    }

    /* access modifiers changed from: 0000 */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f2998z.bringToFront();
        C3379v.m13814e(this.f2998z, i);
        this.f2990r = this.f2998z.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f2985m.mo10828b(i);
    }

    public void stopNestedScroll() {
        this.f2985m.mo10829c();
    }
}
