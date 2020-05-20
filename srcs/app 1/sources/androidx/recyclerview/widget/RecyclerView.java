package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.C0667t.C0668a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p071f.p097h.p104i.C3280c;
import p071f.p097h.p107l.C3321h;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3366i;
import p071f.p097h.p108m.C3367j;
import p071f.p097h.p108m.C3368k;
import p071f.p097h.p108m.C3370m;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.C3388w;
import p071f.p097h.p108m.p109f0.C3346b;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3349b;
import p071f.p097h.p108m.p109f0.C3347c.C3350c;
import p071f.p112j.p113a.C3400a;
import p071f.p132s.C3533a;
import p071f.p132s.C3534b;
import p071f.p132s.C3535c;

public class RecyclerView extends ViewGroup implements C3367j, C3368k {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = (VERSION.SDK_INT >= 23);
    static final boolean ALLOW_THREAD_GAP_WORK = (VERSION.SDK_INT >= 21);
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = (VERSION.SDK_INT <= 15);
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = (VERSION.SDK_INT <= 15);
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION = (VERSION.SDK_INT >= 16);
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator = new C0563c();
    C0667t mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    C0569g mAdapter;
    C0609a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C0572j mChildDrawingOrderCallback;
    C0622f mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C0573k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    C0650k mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C0588s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    C0574l mItemAnimator;
    private C0576b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<C0579n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    C0580o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C0594x mObserver;
    private List<C0586q> mOnChildAttachStateListeners;
    private C0587r mOnFlingListener;
    private final ArrayList<C0588s> mOnItemTouchListeners;
    final List<C0566d0> mPendingAccessibilityImportanceChange;
    private C0595y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    C0652b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0592v mRecycler;
    C0593w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C0589t mScrollListener;
    private List<C0589t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C3370m mScrollingChildHelper;
    final C0560a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final C0564c0 mViewFlinger;
    private final C0679b mViewInfoProcessCallback;
    final C0677y mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    class C0559a implements Runnable {
        C0559a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public static class C0560a0 {

        /* renamed from: a */
        int f2331a = -1;

        /* renamed from: b */
        private SparseArray<Object> f2332b;

        /* renamed from: c */
        int f2333c = 0;

        /* renamed from: d */
        int f2334d = 0;

        /* renamed from: e */
        int f2335e = 1;

        /* renamed from: f */
        int f2336f = 0;

        /* renamed from: g */
        boolean f2337g = false;

        /* renamed from: h */
        boolean f2338h = false;

        /* renamed from: i */
        boolean f2339i = false;

        /* renamed from: j */
        boolean f2340j = false;

        /* renamed from: k */
        boolean f2341k = false;

        /* renamed from: l */
        boolean f2342l = false;

        /* renamed from: m */
        int f2343m;

        /* renamed from: n */
        long f2344n;

        /* renamed from: o */
        int f2345o;

        /* renamed from: p */
        int f2346p;

        /* renamed from: q */
        int f2347q;

        /* renamed from: a */
        public int mo3384a() {
            return this.f2338h ? this.f2333c - this.f2334d : this.f2336f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3385a(int i) {
            if ((this.f2335e & i) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.f2335e));
                throw new IllegalStateException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3386a(C0569g gVar) {
            this.f2335e = 1;
            this.f2336f = gVar.mo3472b();
            this.f2338h = false;
            this.f2339i = false;
            this.f2340j = false;
        }

        /* renamed from: b */
        public int mo3387b() {
            return this.f2331a;
        }

        /* renamed from: c */
        public boolean mo3388c() {
            return this.f2331a != -1;
        }

        /* renamed from: d */
        public boolean mo3389d() {
            return this.f2338h;
        }

        /* renamed from: e */
        public boolean mo3390e() {
            return this.f2342l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.f2331a);
            sb.append(", mData=");
            sb.append(this.f2332b);
            sb.append(", mItemCount=");
            sb.append(this.f2336f);
            sb.append(", mIsMeasuring=");
            sb.append(this.f2340j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.f2333c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.f2334d);
            sb.append(", mStructureChanged=");
            sb.append(this.f2337g);
            sb.append(", mInPreLayout=");
            sb.append(this.f2338h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.f2341k);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.f2342l);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    class C0561b implements Runnable {
        C0561b() {
        }

        public void run() {
            C0574l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo3520i();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C0562b0 {
        /* renamed from: a */
        public abstract View mo3393a(C0592v vVar, int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    static class C0563c implements Interpolator {
        C0563c() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c0 */
    class C0564c0 implements Runnable {

        /* renamed from: f */
        private int f2349f;

        /* renamed from: g */
        private int f2350g;

        /* renamed from: h */
        OverScroller f2351h;

        /* renamed from: i */
        Interpolator f2352i = RecyclerView.sQuinticInterpolator;

        /* renamed from: j */
        private boolean f2353j = false;

        /* renamed from: k */
        private boolean f2354k = false;

        C0564c0() {
            this.f2351h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        /* renamed from: a */
        private float m2971a(float f) {
            return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
        }

        /* renamed from: a */
        private int m2972a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f = (float) width;
            float f2 = (float) i6;
            float a = f2 + (m2971a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f)) * f2);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f) + 1.0f) * 300.0f);
            }
            return Math.min(i5, RecyclerView.MAX_SCROLL_DURATION);
        }

        /* renamed from: c */
        private void m2973c() {
            RecyclerView.this.removeCallbacks(this);
            C3379v.m13794a((View) RecyclerView.this, (Runnable) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3395a() {
            if (this.f2353j) {
                this.f2354k = true;
            } else {
                m2973c();
            }
        }

        /* renamed from: a */
        public void mo3396a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2350g = 0;
            this.f2349f = 0;
            Interpolator interpolator = this.f2352i;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f2352i = interpolator2;
                this.f2351h = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.f2351h.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            mo3395a();
        }

        /* renamed from: a */
        public void mo3397a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = m2972a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f2352i != interpolator) {
                this.f2352i = interpolator;
                this.f2351h = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2350g = 0;
            this.f2349f = 0;
            RecyclerView.this.setScrollState(2);
            this.f2351h.startScroll(0, 0, i, i2, i4);
            if (VERSION.SDK_INT < 23) {
                this.f2351h.computeScrollOffset();
            }
            mo3395a();
        }

        /* renamed from: b */
        public void mo3398b() {
            RecyclerView.this.removeCallbacks(this);
            this.f2351h.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                mo3398b();
                return;
            }
            this.f2354k = false;
            this.f2353j = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f2351h;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f2349f;
                int i4 = currY - this.f2350g;
                this.f2349f = currX;
                this.f2350g = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C0597z zVar = recyclerView4.mLayout.f2395g;
                    if (zVar != null && !zVar.mo3707d() && zVar.mo3708e()) {
                        int a = RecyclerView.this.mState.mo3384a();
                        if (a == 0) {
                            zVar.mo3711h();
                        } else {
                            if (zVar.mo3705c() >= a) {
                                zVar.mo3706c(a - 1);
                            }
                            zVar.mo3697a(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    RecyclerView.this.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                C0597z zVar2 = RecyclerView.this.mLayout.f2395g;
                if ((zVar2 != null && zVar2.mo3707d()) || !z) {
                    mo3395a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    C0650k kVar = recyclerView6.mGapWorker;
                    if (kVar != null) {
                        kVar.mo3907a(recyclerView6, i, i2);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.mo3912a();
                    }
                }
            }
            C0597z zVar3 = RecyclerView.this.mLayout.f2395g;
            if (zVar3 != null && zVar3.mo3707d()) {
                zVar3.mo3697a(0, 0);
            }
            this.f2353j = false;
            if (this.f2354k) {
                m2973c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.stopNestedScroll(1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    class C0565d implements C0679b {
        C0565d() {
        }

        /* renamed from: a */
        public void mo3400a(C0566d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.mo3541a(d0Var.f2358a, recyclerView.mRecycler);
        }

        /* renamed from: a */
        public void mo3401a(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        /* renamed from: b */
        public void mo3402b(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
            RecyclerView.this.mRecycler.mo3676c(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        /* renamed from: c */
        public void mo3403c(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
            d0Var.mo3413a(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            C0574l lVar = recyclerView.mItemAnimator;
            if (z) {
                if (!lVar.mo3505a(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.mo3513c(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d0 */
    public static abstract class C0566d0 {

        /* renamed from: s */
        private static final List<Object> f2357s = Collections.emptyList();

        /* renamed from: a */
        public final View f2358a;

        /* renamed from: b */
        WeakReference<RecyclerView> f2359b;

        /* renamed from: c */
        int f2360c = -1;

        /* renamed from: d */
        int f2361d = -1;

        /* renamed from: e */
        long f2362e = -1;

        /* renamed from: f */
        int f2363f = -1;

        /* renamed from: g */
        int f2364g = -1;

        /* renamed from: h */
        C0566d0 f2365h = null;

        /* renamed from: i */
        C0566d0 f2366i = null;

        /* renamed from: j */
        int f2367j;

        /* renamed from: k */
        List<Object> f2368k = null;

        /* renamed from: l */
        List<Object> f2369l = null;

        /* renamed from: m */
        private int f2370m = 0;

        /* renamed from: n */
        C0592v f2371n = null;

        /* renamed from: o */
        boolean f2372o = false;

        /* renamed from: p */
        private int f2373p = 0;

        /* renamed from: q */
        int f2374q = -1;

        /* renamed from: r */
        RecyclerView f2375r;

        public C0566d0(View view) {
            if (view != null) {
                this.f2358a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        /* renamed from: B */
        private void mo4341B() {
            if (this.f2368k == null) {
                ArrayList arrayList = new ArrayList();
                this.f2368k = arrayList;
                this.f2369l = Collections.unmodifiableList(arrayList);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: A */
        public boolean mo3404A() {
            return (this.f2367j & 32) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3405a() {
            this.f2361d = -1;
            this.f2364g = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3406a(int i) {
            this.f2367j = i | this.f2367j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3407a(int i, int i2) {
            this.f2367j = (i & i2) | (this.f2367j & (~i2));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3408a(int i, int i2, boolean z) {
            mo3406a(8);
            mo3409a(i2, z);
            this.f2360c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3409a(int i, boolean z) {
            if (this.f2361d == -1) {
                this.f2361d = this.f2360c;
            }
            if (this.f2364g == -1) {
                this.f2364g = this.f2360c;
            }
            if (z) {
                this.f2364g += i;
            }
            this.f2360c += i;
            if (this.f2358a.getLayoutParams() != null) {
                ((C0585p) this.f2358a.getLayoutParams()).f2415c = true;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3410a(C0592v vVar, boolean z) {
            this.f2371n = vVar;
            this.f2372o = z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3411a(RecyclerView recyclerView) {
            int i = this.f2374q;
            if (i == -1) {
                i = C3379v.m13827n(this.f2358a);
            }
            this.f2373p = i;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3412a(Object obj) {
            if (obj == null) {
                mo3406a(1024);
            } else if ((1024 & this.f2367j) == 0) {
                mo4341B();
                this.f2368k.add(obj);
            }
        }

        /* renamed from: a */
        public final void mo3413a(boolean z) {
            int i;
            int i2 = this.f2370m;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.f2370m = i3;
            if (i3 < 0) {
                this.f2370m = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
                return;
            }
            if (!z && i3 == 1) {
                i = this.f2367j | 16;
            } else if (z && this.f2370m == 0) {
                i = this.f2367j & -17;
            } else {
                return;
            }
            this.f2367j = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3414b() {
            List<Object> list = this.f2368k;
            if (list != null) {
                list.clear();
            }
            this.f2367j &= -1025;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3415b(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.f2373p);
            this.f2373p = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo3416b(int i) {
            return (i & this.f2367j) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3417c() {
            this.f2367j &= -33;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3418d() {
            this.f2367j &= -257;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo3419e() {
            return (this.f2367j & 16) == 0 && C3379v.m13765A(this.f2358a);
        }

        /* renamed from: f */
        public final int mo3420f() {
            RecyclerView recyclerView = this.f2375r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        /* renamed from: g */
        public final long mo3421g() {
            return this.f2362e;
        }

        /* renamed from: h */
        public final int mo3422h() {
            return this.f2363f;
        }

        /* renamed from: i */
        public final int mo3423i() {
            int i = this.f2364g;
            return i == -1 ? this.f2360c : i;
        }

        /* renamed from: j */
        public final int mo3424j() {
            return this.f2361d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public List<Object> mo3425k() {
            if ((this.f2367j & 1024) != 0) {
                return f2357s;
            }
            List<Object> list = this.f2368k;
            return (list == null || list.size() == 0) ? f2357s : this.f2369l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: l */
        public boolean mo3426l() {
            return (this.f2367j & 512) != 0 || mo3429o();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public boolean mo3427m() {
            return (this.f2358a.getParent() == null || this.f2358a.getParent() == this.f2375r) ? false : true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: n */
        public boolean mo3428n() {
            return (this.f2367j & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: o */
        public boolean mo3429o() {
            return (this.f2367j & 4) != 0;
        }

        /* renamed from: p */
        public final boolean mo3430p() {
            return (this.f2367j & 16) == 0 && !C3379v.m13765A(this.f2358a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: q */
        public boolean mo3431q() {
            return (this.f2367j & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: r */
        public boolean mo3432r() {
            return this.f2371n != null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: s */
        public boolean mo3433s() {
            return (this.f2367j & 256) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public boolean mo3434t() {
            return (this.f2367j & 2) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.f2360c);
            sb.append(" id=");
            sb.append(this.f2362e);
            sb.append(", oldPos=");
            sb.append(this.f2361d);
            sb.append(", pLpos:");
            sb.append(this.f2364g);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (mo3432r()) {
                sb2.append(" scrap ");
                sb2.append(this.f2372o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (mo3429o()) {
                sb2.append(" invalid");
            }
            if (!mo3428n()) {
                sb2.append(" unbound");
            }
            if (mo3436u()) {
                sb2.append(" update");
            }
            if (mo3431q()) {
                sb2.append(" removed");
            }
            if (mo3440y()) {
                sb2.append(" ignored");
            }
            if (mo3433s()) {
                sb2.append(" tmpDetached");
            }
            if (!mo3430p()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.f2370m);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (mo3426l()) {
                sb2.append(" undefined adapter position");
            }
            if (this.f2358a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: u */
        public boolean mo3436u() {
            return (this.f2367j & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: v */
        public void mo3437v() {
            this.f2367j = 0;
            this.f2360c = -1;
            this.f2361d = -1;
            this.f2362e = -1;
            this.f2364g = -1;
            this.f2370m = 0;
            this.f2365h = null;
            this.f2366i = null;
            mo3414b();
            this.f2373p = 0;
            this.f2374q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: w */
        public void mo3438w() {
            if (this.f2361d == -1) {
                this.f2361d = this.f2360c;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: x */
        public boolean mo3439x() {
            return (this.f2367j & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: y */
        public boolean mo3440y() {
            return (this.f2367j & 128) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: z */
        public void mo3441z() {
            this.f2371n.mo3676c(this);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    class C0567e implements C0624b {
        C0567e() {
        }

        /* renamed from: a */
        public int mo3442a() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: a */
        public View mo3443a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        /* renamed from: a */
        public void mo3444a(View view) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo3411a(RecyclerView.this);
            }
        }

        /* renamed from: a */
        public void mo3445a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        /* renamed from: a */
        public void mo3446a(View view, int i, LayoutParams layoutParams) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.mo3433s() || childViewHolderInt.mo3440y()) {
                    childViewHolderInt.mo3418d();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(childViewHolderInt);
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        /* renamed from: b */
        public C0566d0 mo3447b(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        /* renamed from: b */
        public void mo3448b() {
            int a = mo3442a();
            for (int i = 0; i < a; i++) {
                View a2 = mo3443a(i);
                RecyclerView.this.dispatchChildDetached(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        /* renamed from: b */
        public void mo3449b(int i) {
            View a = mo3443a(i);
            if (a != null) {
                C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(a);
                if (childViewHolderInt != null) {
                    if (!childViewHolderInt.mo3433s() || childViewHolderInt.mo3440y()) {
                        childViewHolderInt.mo3406a(256);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("called detach on an already detached child ");
                        sb.append(childViewHolderInt);
                        sb.append(RecyclerView.this.exceptionLabel());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        /* renamed from: c */
        public void mo3450c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        /* renamed from: c */
        public void mo3451c(View view) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.mo3415b(RecyclerView.this);
            }
        }

        /* renamed from: d */
        public int mo3452d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    class C0568f implements C0610a {
        C0568f() {
        }

        /* renamed from: a */
        public C0566d0 mo3453a(int i) {
            C0566d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.mo3844c(findViewHolderForPosition.f2358a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        /* renamed from: a */
        public void mo3454a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: a */
        public void mo3455a(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        /* renamed from: a */
        public void mo3456a(C0611b bVar) {
            mo3460c(bVar);
        }

        /* renamed from: b */
        public void mo3457b(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* renamed from: b */
        public void mo3458b(C0611b bVar) {
            mo3460c(bVar);
        }

        /* renamed from: c */
        public void mo3459c(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3460c(C0611b bVar) {
            int i = bVar.f2513a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.mo3112a(recyclerView, bVar.f2514b, bVar.f2516d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.mo3119b(recyclerView2, bVar.f2514b, bVar.f2516d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.mo3114a(recyclerView3, bVar.f2514b, bVar.f2516d, bVar.f2515c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.mo3113a(recyclerView4, bVar.f2514b, bVar.f2516d, 1);
            }
        }

        /* renamed from: d */
        public void mo3461d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f2334d += i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static abstract class C0569g<VH extends C0566d0> {

        /* renamed from: a */
        private final C0570h f2378a = new C0570h();

        /* renamed from: b */
        private boolean f2379b = false;

        /* renamed from: a */
        public long mo3462a(int i) {
            return -1;
        }

        /* renamed from: a */
        public final VH mo3463a(ViewGroup viewGroup, int i) {
            try {
                C3280c.m13445a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH b = mo3474b(viewGroup, i);
                if (b.f2358a.getParent() == null) {
                    b.f2363f = i;
                    return b;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C3280c.m13444a();
            }
        }

        /* renamed from: a */
        public final void mo3464a(int i, int i2) {
            this.f2378a.mo3486a(i, i2);
        }

        /* renamed from: a */
        public final void mo3465a(int i, int i2, Object obj) {
            this.f2378a.mo3487a(i, i2, obj);
        }

        /* renamed from: a */
        public final void mo3466a(VH vh, int i) {
            vh.f2360c = i;
            if (mo3484d()) {
                vh.f2362e = mo3462a(i);
            }
            vh.mo3407a(1, 519);
            C3280c.m13445a(RecyclerView.TRACE_BIND_VIEW_TAG);
            mo3467a(vh, i, vh.mo3425k());
            vh.mo3414b();
            LayoutParams layoutParams = vh.f2358a.getLayoutParams();
            if (layoutParams instanceof C0585p) {
                ((C0585p) layoutParams).f2415c = true;
            }
            C3280c.m13444a();
        }

        /* renamed from: a */
        public void mo3467a(VH vh, int i, List<Object> list) {
            mo3477b(vh, i);
        }

        /* renamed from: a */
        public void mo3468a(C0571i iVar) {
            this.f2378a.registerObserver(iVar);
        }

        /* renamed from: a */
        public void mo3469a(RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo3470a(boolean z) {
            if (!mo3482c()) {
                this.f2379b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        /* renamed from: a */
        public boolean mo3471a(VH vh) {
            return false;
        }

        /* renamed from: b */
        public abstract int mo3472b();

        /* renamed from: b */
        public int mo3473b(int i) {
            return 0;
        }

        /* renamed from: b */
        public abstract VH mo3474b(ViewGroup viewGroup, int i);

        /* renamed from: b */
        public final void mo3475b(int i, int i2) {
            this.f2378a.mo3490b(i, i2);
        }

        /* renamed from: b */
        public void mo3476b(VH vh) {
        }

        /* renamed from: b */
        public abstract void mo3477b(VH vh, int i);

        /* renamed from: b */
        public void mo3478b(C0571i iVar) {
            this.f2378a.unregisterObserver(iVar);
        }

        /* renamed from: b */
        public void mo3479b(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public final void mo3480c(int i, int i2) {
            this.f2378a.mo3491c(i, i2);
        }

        /* renamed from: c */
        public void mo3481c(VH vh) {
        }

        /* renamed from: c */
        public final boolean mo3482c() {
            return this.f2378a.mo3488a();
        }

        /* renamed from: d */
        public void mo3483d(VH vh) {
        }

        /* renamed from: d */
        public final boolean mo3484d() {
            return this.f2379b;
        }

        /* renamed from: e */
        public final void mo3485e() {
            this.f2378a.mo3489b();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    static class C0570h extends Observable<C0571i> {
        C0570h() {
        }

        /* renamed from: a */
        public void mo3486a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0571i) this.mObservers.get(size)).mo3494a(i, i2, 1);
            }
        }

        /* renamed from: a */
        public void mo3487a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0571i) this.mObservers.get(size)).mo3495a(i, i2, obj);
            }
        }

        /* renamed from: a */
        public boolean mo3488a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public void mo3489b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0571i) this.mObservers.get(size)).mo3492a();
            }
        }

        /* renamed from: b */
        public void mo3490b(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0571i) this.mObservers.get(size)).mo3496b(i, i2);
            }
        }

        /* renamed from: c */
        public void mo3491c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C0571i) this.mObservers.get(size)).mo3497c(i, i2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C0571i {
        /* renamed from: a */
        public void mo3492a() {
        }

        /* renamed from: a */
        public void mo3493a(int i, int i2) {
        }

        /* renamed from: a */
        public void mo3494a(int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo3495a(int i, int i2, Object obj) {
            mo3493a(i, i2);
        }

        /* renamed from: b */
        public void mo3496b(int i, int i2) {
        }

        /* renamed from: c */
        public void mo3497c(int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C0572j {
        /* renamed from: a */
        int mo3498a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C0573k {
        /* access modifiers changed from: protected */
        /* renamed from: a */
        public EdgeEffect mo3499a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C0574l {

        /* renamed from: a */
        private C0576b f2380a = null;

        /* renamed from: b */
        private ArrayList<C0575a> f2381b = new ArrayList<>();

        /* renamed from: c */
        private long f2382c = 120;

        /* renamed from: d */
        private long f2383d = 120;

        /* renamed from: e */
        private long f2384e = 250;

        /* renamed from: f */
        private long f2385f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C0575a {
            /* renamed from: a */
            void mo3521a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        interface C0576b {
            /* renamed from: a */
            void mo3522a(C0566d0 d0Var);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C0577c {

            /* renamed from: a */
            public int f2386a;

            /* renamed from: b */
            public int f2387b;

            /* renamed from: a */
            public C0577c mo3523a(C0566d0 d0Var) {
                mo3524a(d0Var, 0);
                return this;
            }

            /* renamed from: a */
            public C0577c mo3524a(C0566d0 d0Var, int i) {
                View view = d0Var.f2358a;
                this.f2386a = view.getLeft();
                this.f2387b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        /* renamed from: e */
        static int m3078e(C0566d0 d0Var) {
            int i = d0Var.f2367j & 14;
            if (d0Var.mo3429o()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int j = d0Var.mo3424j();
                int f = d0Var.mo3420f();
                if (!(j == -1 || f == -1 || j == f)) {
                    i |= 2048;
                }
            }
            return i;
        }

        /* renamed from: a */
        public C0577c mo3500a(C0560a0 a0Var, C0566d0 d0Var) {
            C0577c h = mo3519h();
            h.mo3523a(d0Var);
            return h;
        }

        /* renamed from: a */
        public C0577c mo3501a(C0560a0 a0Var, C0566d0 d0Var, int i, List<Object> list) {
            C0577c h = mo3519h();
            h.mo3523a(d0Var);
            return h;
        }

        /* renamed from: a */
        public final void mo3502a() {
            int size = this.f2381b.size();
            for (int i = 0; i < size; i++) {
                ((C0575a) this.f2381b.get(i)).mo3521a();
            }
            this.f2381b.clear();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3503a(C0576b bVar) {
            this.f2380a = bVar;
        }

        /* renamed from: a */
        public abstract boolean mo3504a(C0566d0 d0Var);

        /* renamed from: a */
        public abstract boolean mo3505a(C0566d0 d0Var, C0566d0 d0Var2, C0577c cVar, C0577c cVar2);

        /* renamed from: a */
        public abstract boolean mo3506a(C0566d0 d0Var, C0577c cVar, C0577c cVar2);

        /* renamed from: a */
        public boolean mo3507a(C0566d0 d0Var, List<Object> list) {
            return mo3504a(d0Var);
        }

        /* renamed from: b */
        public abstract void mo3508b();

        /* renamed from: b */
        public final void mo3509b(C0566d0 d0Var) {
            mo3515d(d0Var);
            C0576b bVar = this.f2380a;
            if (bVar != null) {
                bVar.mo3522a(d0Var);
            }
        }

        /* renamed from: b */
        public abstract boolean mo3510b(C0566d0 d0Var, C0577c cVar, C0577c cVar2);

        /* renamed from: c */
        public long mo3511c() {
            return this.f2382c;
        }

        /* renamed from: c */
        public abstract void mo3512c(C0566d0 d0Var);

        /* renamed from: c */
        public abstract boolean mo3513c(C0566d0 d0Var, C0577c cVar, C0577c cVar2);

        /* renamed from: d */
        public long mo3514d() {
            return this.f2385f;
        }

        /* renamed from: d */
        public void mo3515d(C0566d0 d0Var) {
        }

        /* renamed from: e */
        public long mo3516e() {
            return this.f2384e;
        }

        /* renamed from: f */
        public long mo3517f() {
            return this.f2383d;
        }

        /* renamed from: g */
        public abstract boolean mo3518g();

        /* renamed from: h */
        public C0577c mo3519h() {
            return new C0577c();
        }

        /* renamed from: i */
        public abstract void mo3520i();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    private class C0578m implements C0576b {
        C0578m() {
        }

        /* renamed from: a */
        public void mo3522a(C0566d0 d0Var) {
            d0Var.mo3413a(true);
            if (d0Var.f2365h != null && d0Var.f2366i == null) {
                d0Var.f2365h = null;
            }
            d0Var.f2366i = null;
            if (!d0Var.mo3439x() && !RecyclerView.this.removeAnimatingView(d0Var.f2358a) && d0Var.mo3433s()) {
                RecyclerView.this.removeDetachedView(d0Var.f2358a, false);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C0579n {
        @Deprecated
        /* renamed from: a */
        public void mo3525a(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: a */
        public void mo3526a(Canvas canvas, RecyclerView recyclerView, C0560a0 a0Var) {
            mo3525a(canvas, recyclerView);
        }

        @Deprecated
        /* renamed from: a */
        public void mo3527a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        /* renamed from: a */
        public void mo3528a(Rect rect, View view, RecyclerView recyclerView, C0560a0 a0Var) {
            mo3527a(rect, ((C0585p) view.getLayoutParams()).mo3630a(), recyclerView);
        }

        @Deprecated
        /* renamed from: b */
        public void mo3529b(Canvas canvas, RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo3530b(Canvas canvas, RecyclerView recyclerView, C0560a0 a0Var) {
            mo3529b(canvas, recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C0580o {

        /* renamed from: a */
        C0622f f2389a;

        /* renamed from: b */
        RecyclerView f2390b;

        /* renamed from: c */
        private final C0676b f2391c = new C0581a();

        /* renamed from: d */
        private final C0676b f2392d = new C0582b();

        /* renamed from: e */
        C0674x f2393e = new C0674x(this.f2391c);

        /* renamed from: f */
        C0674x f2394f = new C0674x(this.f2392d);

        /* renamed from: g */
        C0597z f2395g;

        /* renamed from: h */
        boolean f2396h = false;

        /* renamed from: i */
        boolean f2397i = false;

        /* renamed from: j */
        boolean f2398j = false;

        /* renamed from: k */
        private boolean f2399k = true;

        /* renamed from: l */
        private boolean f2400l = true;

        /* renamed from: m */
        int f2401m;

        /* renamed from: n */
        boolean f2402n;

        /* renamed from: o */
        private int f2403o;

        /* renamed from: p */
        private int f2404p;

        /* renamed from: q */
        private int f2405q;

        /* renamed from: r */
        private int f2406r;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        class C0581a implements C0676b {
            C0581a() {
            }

            /* renamed from: a */
            public int mo3624a() {
                return C0580o.this.mo3617r() - C0580o.this.mo3615p();
            }

            /* renamed from: a */
            public int mo3625a(View view) {
                return C0580o.this.mo3591f(view) - ((C0585p) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: a */
            public View mo3626a(int i) {
                return C0580o.this.mo3583d(i);
            }

            /* renamed from: b */
            public int mo3627b() {
                return C0580o.this.mo3613o();
            }

            /* renamed from: b */
            public int mo3628b(View view) {
                return C0580o.this.mo3602i(view) + ((C0585p) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        class C0582b implements C0676b {
            C0582b() {
            }

            /* renamed from: a */
            public int mo3624a() {
                return C0580o.this.mo3598h() - C0580o.this.mo3611n();
            }

            /* renamed from: a */
            public int mo3625a(View view) {
                return C0580o.this.mo3604j(view) - ((C0585p) view.getLayoutParams()).topMargin;
            }

            /* renamed from: a */
            public View mo3626a(int i) {
                return C0580o.this.mo3583d(i);
            }

            /* renamed from: b */
            public int mo3627b() {
                return C0580o.this.mo3616q();
            }

            /* renamed from: b */
            public int mo3628b(View view) {
                return C0580o.this.mo3588e(view) + ((C0585p) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C0583c {
            /* renamed from: a */
            void mo3629a(int i, int i2);
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C0584d {

            /* renamed from: a */
            public int f2409a;

            /* renamed from: b */
            public int f2410b;

            /* renamed from: c */
            public boolean f2411c;

            /* renamed from: d */
            public boolean f2412d;
        }

        /* renamed from: a */
        public static int m3111a(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i);
            int size = MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i2, i3));
            }
            if (mode != 1073741824) {
                size = Math.max(i2, i3);
            }
            return size;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0021;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m3112a(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0021
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0021
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001f
            L_0x001c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L_0x0031
            L_0x001f:
                if (r7 != r1) goto L_0x0023
            L_0x0021:
                r7 = r4
                goto L_0x0031
            L_0x0023:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x002a
                goto L_0x002c
            L_0x002a:
                r5 = 0
                goto L_0x0021
            L_0x002c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L_0x0021
            L_0x002f:
                r5 = 0
                r7 = 0
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0580o.m3112a(int, int, int, int, boolean):int");
        }

        /* renamed from: a */
        public static C0584d m3113a(Context context, AttributeSet attributeSet, int i, int i2) {
            C0584d dVar = new C0584d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3535c.RecyclerView, i, i2);
            dVar.f2409a = obtainStyledAttributes.getInt(C3535c.RecyclerView_android_orientation, 1);
            dVar.f2410b = obtainStyledAttributes.getInt(C3535c.RecyclerView_spanCount, 1);
            dVar.f2411c = obtainStyledAttributes.getBoolean(C3535c.RecyclerView_reverseLayout, false);
            dVar.f2412d = obtainStyledAttributes.getBoolean(C3535c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: a */
        private void m3114a(int i, View view) {
            this.f2389a.mo3834a(i);
        }

        /* renamed from: a */
        private void m3115a(View view, int i, boolean z) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.mo3431q()) {
                this.f2390b.mViewInfoStore.mo3996a(childViewHolderInt);
            } else {
                this.f2390b.mViewInfoStore.mo4007g(childViewHolderInt);
            }
            C0585p pVar = (C0585p) view.getLayoutParams();
            if (childViewHolderInt.mo3404A() || childViewHolderInt.mo3432r()) {
                if (childViewHolderInt.mo3432r()) {
                    childViewHolderInt.mo3441z();
                } else {
                    childViewHolderInt.mo3417c();
                }
                this.f2389a.mo3836a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f2390b) {
                int b = this.f2389a.mo3840b(view);
                if (i == -1) {
                    i = this.f2389a.mo3833a();
                }
                if (b == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.f2390b.indexOfChild(view));
                    sb.append(this.f2390b.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                } else if (b != i) {
                    this.f2390b.mLayout.mo3533a(b, i);
                }
            } else {
                this.f2389a.mo3837a(view, i, false);
                pVar.f2415c = true;
                C0597z zVar = this.f2395g;
                if (zVar != null && zVar.mo3708e()) {
                    this.f2395g.mo3704b(view);
                }
            }
            if (pVar.f2416d) {
                childViewHolderInt.f2358a.invalidate();
                pVar.f2416d = false;
            }
        }

        /* renamed from: a */
        private void m3116a(C0592v vVar, int i, View view) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo3440y()) {
                if (!childViewHolderInt.mo3429o() || childViewHolderInt.mo3431q() || this.f2390b.mAdapter.mo3484d()) {
                    mo3565b(i);
                    vVar.mo3675c(view);
                    this.f2390b.mViewInfoStore.mo4004d(childViewHolderInt);
                } else {
                    mo3600h(i);
                    vVar.mo3671b(childViewHolderInt);
                }
            }
        }

        /* renamed from: b */
        private static boolean m3117b(int i, int i2, int i3) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            boolean z = false;
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i) {
                    z = true;
                }
                return z;
            }
        }

        /* renamed from: c */
        private int[] m3118c(View view, Rect rect) {
            int[] iArr = new int[2];
            int o = mo3613o();
            int q = mo3616q();
            int r = mo3617r() - mo3615p();
            int h = mo3598h() - mo3611n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - o;
            int min = Math.min(0, i);
            int i2 = top - q;
            int min2 = Math.min(0, i2);
            int i3 = width - r;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h);
            if (mo3605k() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        /* renamed from: d */
        private boolean m3119d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o = mo3613o();
            int q = mo3616q();
            int r = mo3617r() - mo3615p();
            int h = mo3598h() - mo3611n();
            Rect rect = this.f2390b.mTempRect;
            mo3569b(focusedChild, rect);
            return rect.left - i < r && rect.right - i > o && rect.top - i2 < h && rect.bottom - i2 > q;
        }

        /* renamed from: A */
        public void mo3531A() {
            this.f2396h = true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: B */
        public boolean mo3139B() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: C */
        public void mo3532C() {
            C0597z zVar = this.f2395g;
            if (zVar != null) {
                zVar.mo3711h();
            }
        }

        /* renamed from: D */
        public boolean mo3099D() {
            return false;
        }

        /* renamed from: a */
        public int mo3101a(int i, C0592v vVar, C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo3149a(C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: a */
        public int mo3102a(C0592v vVar, C0560a0 a0Var) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo3162a()) {
                return 1;
            }
            return this.f2390b.mAdapter.mo3472b();
        }

        /* renamed from: a */
        public View mo3103a(View view, int i, C0592v vVar, C0560a0 a0Var) {
            return null;
        }

        /* renamed from: a */
        public C0585p mo3105a(Context context, AttributeSet attributeSet) {
            return new C0585p(context, attributeSet);
        }

        /* renamed from: a */
        public C0585p mo3106a(LayoutParams layoutParams) {
            return layoutParams instanceof C0585p ? new C0585p((C0585p) layoutParams) : layoutParams instanceof MarginLayoutParams ? new C0585p((MarginLayoutParams) layoutParams) : new C0585p(layoutParams);
        }

        /* renamed from: a */
        public void mo3533a(int i, int i2) {
            View d = mo3583d(i);
            if (d != null) {
                mo3565b(i);
                mo3577c(d, i2);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.f2390b.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public void mo3154a(int i, int i2, C0560a0 a0Var, C0583c cVar) {
        }

        /* renamed from: a */
        public void mo3155a(int i, C0583c cVar) {
        }

        /* renamed from: a */
        public void mo3534a(int i, C0592v vVar) {
            View d = mo3583d(i);
            mo3600h(i);
            vVar.mo3670b(d);
        }

        /* renamed from: a */
        public void mo3107a(Rect rect, int i, int i2) {
            mo3576c(m3111a(i, rect.width() + mo3613o() + mo3615p(), mo3609m()), m3111a(i2, rect.height() + mo3616q() + mo3611n(), mo3607l()));
        }

        /* renamed from: a */
        public void mo3156a(Parcelable parcelable) {
        }

        /* renamed from: a */
        public void mo3535a(View view) {
            mo3536a(view, -1);
        }

        /* renamed from: a */
        public void mo3536a(View view, int i) {
            m3115a(view, i, true);
        }

        /* renamed from: a */
        public void mo3537a(View view, int i, int i2) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f2390b.getItemDecorInsetsForChild(view);
            int i3 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int a = m3112a(mo3617r(), mo3618s(), mo3613o() + mo3615p() + pVar.leftMargin + pVar.rightMargin + i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right, pVar.width, mo3162a());
            int a2 = m3112a(mo3598h(), mo3601i(), mo3616q() + mo3611n() + pVar.topMargin + pVar.bottomMargin + i3, pVar.height, mo3165b());
            if (mo3554a(view, a, a2, pVar)) {
                view.measure(a, a2);
            }
        }

        /* renamed from: a */
        public void mo3538a(View view, int i, int i2, int i3, int i4) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            Rect rect = pVar.f2414b;
            view.layout(i + rect.left + pVar.leftMargin, i2 + rect.top + pVar.topMargin, (i3 - rect.right) - pVar.rightMargin, (i4 - rect.bottom) - pVar.bottomMargin);
        }

        /* renamed from: a */
        public void mo3539a(View view, int i, C0585p pVar) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo3431q()) {
                this.f2390b.mViewInfoStore.mo3996a(childViewHolderInt);
            } else {
                this.f2390b.mViewInfoStore.mo4007g(childViewHolderInt);
            }
            this.f2389a.mo3836a(view, i, pVar, childViewHolderInt.mo3431q());
        }

        /* renamed from: a */
        public void mo3540a(View view, Rect rect) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: a */
        public void mo3541a(View view, C0592v vVar) {
            mo3614o(view);
            vVar.mo3670b(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3542a(View view, C3347c cVar) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.mo3431q() && !this.f2389a.mo3844c(childViewHolderInt.f2358a)) {
                RecyclerView recyclerView = this.f2390b;
                mo3109a(recyclerView.mRecycler, recyclerView.mState, view, cVar);
            }
        }

        /* renamed from: a */
        public void mo3543a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((C0585p) view.getLayoutParams()).f2414b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f2390b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.f2390b.mTempRectF;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: a */
        public void mo3157a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2390b;
            mo3547a(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        /* renamed from: a */
        public void mo3544a(C0569g gVar, C0569g gVar2) {
        }

        /* renamed from: a */
        public void mo3545a(C0592v vVar) {
            for (int e = mo3587e() - 1; e >= 0; e--) {
                m3116a(vVar, e, mo3583d(e));
            }
        }

        /* renamed from: a */
        public void mo3546a(C0592v vVar, C0560a0 a0Var, int i, int i2) {
            this.f2390b.defaultOnMeasure(i, i2);
        }

        /* renamed from: a */
        public void mo3109a(C0592v vVar, C0560a0 a0Var, View view, C3347c cVar) {
            cVar.mo10755b((Object) C3350c.m13707a(mo3165b() ? mo3608l(view) : 0, 1, mo3162a() ? mo3608l(view) : 0, 1, false, false));
        }

        /* renamed from: a */
        public void mo3547a(C0592v vVar, C0560a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f2390b.canScrollVertically(-1) && !this.f2390b.canScrollHorizontally(-1) && !this.f2390b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0569g gVar = this.f2390b.mAdapter;
                if (gVar != null) {
                    accessibilityEvent.setItemCount(gVar.mo3472b());
                }
            }
        }

        /* renamed from: a */
        public void mo3548a(C0592v vVar, C0560a0 a0Var, C3347c cVar) {
            if (this.f2390b.canScrollVertically(-1) || this.f2390b.canScrollHorizontally(-1)) {
                cVar.mo10740a(8192);
                cVar.mo10784k(true);
            }
            if (this.f2390b.canScrollVertically(1) || this.f2390b.canScrollHorizontally(1)) {
                cVar.mo10740a(4096);
                cVar.mo10784k(true);
            }
            cVar.mo10747a((Object) C3349b.m13706a(mo3118b(vVar, a0Var), mo3102a(vVar, a0Var), mo3586d(vVar, a0Var), mo3574c(vVar, a0Var)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3549a(C0597z zVar) {
            if (this.f2395g == zVar) {
                this.f2395g = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3550a(RecyclerView recyclerView) {
            this.f2397i = true;
            mo3572b(recyclerView);
        }

        /* renamed from: a */
        public void mo3112a(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: a */
        public void mo3113a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        /* renamed from: a */
        public void mo3114a(RecyclerView recyclerView, int i, int i2, Object obj) {
            mo3580c(recyclerView, i, i2);
        }

        /* renamed from: a */
        public void mo3159a(RecyclerView recyclerView, C0560a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3551a(RecyclerView recyclerView, C0592v vVar) {
            this.f2397i = false;
            mo3164b(recyclerView, vVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3552a(C3347c cVar) {
            RecyclerView recyclerView = this.f2390b;
            mo3548a(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        /* renamed from: a */
        public void mo3160a(String str) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: a */
        public boolean mo3162a() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3553a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2390b;
            return mo3557a(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3554a(View view, int i, int i2, C0585p pVar) {
            return view.isLayoutRequested() || !this.f2399k || !m3117b(view.getWidth(), i, pVar.width) || !m3117b(view.getHeight(), i2, pVar.height);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3555a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2390b;
            return mo3558a(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3556a(View view, boolean z, boolean z2) {
            boolean z3 = this.f2393e.mo3987a(view, 24579) && this.f2394f.mo3987a(view, 24579);
            return z ? z3 : !z3;
        }

        /* renamed from: a */
        public boolean mo3115a(C0585p pVar) {
            return pVar != null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo3557a(androidx.recyclerview.widget.RecyclerView.C0592v r8, androidx.recyclerview.widget.RecyclerView.C0560a0 r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f2390b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = 0
                r3 = 0
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.mo3598h()
                int r11 = r7.mo3616q()
                int r8 = r8 - r11
                int r11 = r7.mo3611n()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = 0
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f2390b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo3617r()
                int r11 = r7.mo3613o()
                int r10 = r10 - r11
                int r11 = r7.mo3615p()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.mo3598h()
                int r10 = r7.mo3616q()
                int r8 = r8 - r10
                int r10 = r7.mo3611n()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = 0
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f2390b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.mo3617r()
                int r11 = r7.mo3613o()
                int r10 = r10 - r11
                int r11 = r7.mo3615p()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = 0
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f2390b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0580o.mo3557a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, int, android.os.Bundle):boolean");
        }

        /* renamed from: a */
        public boolean mo3558a(C0592v vVar, C0560a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3559a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return mo3560a(recyclerView, view, rect, z, false);
        }

        /* renamed from: a */
        public boolean mo3560a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c = m3118c(view, rect);
            int i = c[0];
            int i2 = c[1];
            if ((z2 && !m3119d(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        @Deprecated
        /* renamed from: a */
        public boolean mo3561a(RecyclerView recyclerView, View view, View view2) {
            return mo3622x() || recyclerView.isComputingLayout();
        }

        /* renamed from: a */
        public boolean mo3562a(RecyclerView recyclerView, C0560a0 a0Var, View view, View view2) {
            return mo3561a(recyclerView, view, view2);
        }

        /* renamed from: a */
        public boolean mo3563a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        /* renamed from: a */
        public boolean mo3564a(Runnable runnable) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        /* renamed from: b */
        public int mo3116b(int i, C0592v vVar, C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo3117b(C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: b */
        public int mo3118b(C0592v vVar, C0560a0 a0Var) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView == null || recyclerView.mAdapter == null || !mo3165b()) {
                return 1;
            }
            return this.f2390b.mAdapter.mo3472b();
        }

        /* renamed from: b */
        public void mo3565b(int i) {
            m3114a(i, mo3583d(i));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3566b(int i, int i2) {
            this.f2405q = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            this.f2403o = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f2405q = 0;
            }
            this.f2406r = MeasureSpec.getSize(i2);
            int mode2 = MeasureSpec.getMode(i2);
            this.f2404p = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f2406r = 0;
            }
        }

        /* renamed from: b */
        public void mo3567b(View view) {
            mo3568b(view, -1);
        }

        /* renamed from: b */
        public void mo3568b(View view, int i) {
            m3115a(view, i, false);
        }

        /* renamed from: b */
        public void mo3569b(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        /* renamed from: b */
        public void mo3570b(C0592v vVar) {
            for (int e = mo3587e() - 1; e >= 0; e--) {
                if (!RecyclerView.getChildViewHolderInt(mo3583d(e)).mo3440y()) {
                    mo3534a(e, vVar);
                }
            }
        }

        /* renamed from: b */
        public void mo3571b(C0597z zVar) {
            C0597z zVar2 = this.f2395g;
            if (!(zVar2 == null || zVar == zVar2 || !zVar2.mo3708e())) {
                this.f2395g.mo3711h();
            }
            this.f2395g = zVar;
            zVar.mo3701a(this.f2390b, this);
        }

        /* renamed from: b */
        public void mo3572b(RecyclerView recyclerView) {
        }

        /* renamed from: b */
        public void mo3119b(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: b */
        public void mo3164b(RecyclerView recyclerView, C0592v vVar) {
            mo3579c(recyclerView);
        }

        /* renamed from: b */
        public boolean mo3165b() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo3573b(View view, int i, int i2, C0585p pVar) {
            return !this.f2399k || !m3117b(view.getMeasuredWidth(), i, pVar.width) || !m3117b(view.getMeasuredHeight(), i2, pVar.height);
        }

        /* renamed from: c */
        public int mo3121c(C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public int mo3574c(C0592v vVar, C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: c */
        public View mo3167c(int i) {
            int e = mo3587e();
            for (int i2 = 0; i2 < e; i2++) {
                View d = mo3583d(i2);
                C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(d);
                if (childViewHolderInt != null && childViewHolderInt.mo3423i() == i && !childViewHolderInt.mo3440y() && (this.f2390b.mState.mo3389d() || !childViewHolderInt.mo3431q())) {
                    return d;
                }
            }
            return null;
        }

        /* renamed from: c */
        public View mo3575c(View view) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView == null) {
                return null;
            }
            View findContainingItemView = recyclerView.findContainingItemView(view);
            if (findContainingItemView != null && !this.f2389a.mo3844c(findContainingItemView)) {
                return findContainingItemView;
            }
            return null;
        }

        /* renamed from: c */
        public abstract C0585p mo3122c();

        /* renamed from: c */
        public void mo3576c(int i, int i2) {
            this.f2390b.setMeasuredDimension(i, i2);
        }

        /* renamed from: c */
        public void mo3577c(View view, int i) {
            mo3539a(view, i, (C0585p) view.getLayoutParams());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3578c(C0592v vVar) {
            int e = vVar.mo3680e();
            for (int i = e - 1; i >= 0; i--) {
                View c = vVar.mo3672c(i);
                C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c);
                if (!childViewHolderInt.mo3440y()) {
                    childViewHolderInt.mo3413a(false);
                    if (childViewHolderInt.mo3433s()) {
                        this.f2390b.removeDetachedView(c, false);
                    }
                    C0574l lVar = this.f2390b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo3512c(childViewHolderInt);
                    }
                    childViewHolderInt.mo3413a(true);
                    vVar.mo3660a(c);
                }
            }
            vVar.mo3673c();
            if (e > 0) {
                this.f2390b.invalidate();
            }
        }

        @Deprecated
        /* renamed from: c */
        public void mo3579c(RecyclerView recyclerView) {
        }

        /* renamed from: c */
        public void mo3580c(RecyclerView recyclerView, int i, int i2) {
        }

        /* renamed from: d */
        public int mo3581d() {
            return -1;
        }

        /* renamed from: d */
        public int mo3582d(View view) {
            return ((C0585p) view.getLayoutParams()).f2414b.bottom;
        }

        /* renamed from: d */
        public int mo3168d(C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: d */
        public View mo3583d(int i) {
            C0622f fVar = this.f2389a;
            if (fVar != null) {
                return fVar.mo3842c(i);
            }
            return null;
        }

        /* renamed from: d */
        public View mo3584d(View view, int i) {
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo3585d(int i, int i2) {
            int e = mo3587e();
            if (e == 0) {
                this.f2390b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = RecyclerView.UNDEFINED_DURATION;
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < e; i7++) {
                View d = mo3583d(i7);
                Rect rect = this.f2390b.mTempRect;
                mo3569b(d, rect);
                int i8 = rect.left;
                if (i8 < i5) {
                    i5 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i6) {
                    i6 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i4) {
                    i4 = i11;
                }
            }
            this.f2390b.mTempRect.set(i5, i6, i3, i4);
            mo3107a(this.f2390b.mTempRect, i, i2);
        }

        /* renamed from: d */
        public void mo3123d(RecyclerView recyclerView) {
        }

        /* renamed from: d */
        public boolean mo3586d(C0592v vVar, C0560a0 a0Var) {
            return false;
        }

        /* renamed from: e */
        public int mo3587e() {
            C0622f fVar = this.f2389a;
            if (fVar != null) {
                return fVar.mo3833a();
            }
            return 0;
        }

        /* renamed from: e */
        public int mo3588e(View view) {
            return view.getBottom() + mo3582d(view);
        }

        /* renamed from: e */
        public int mo3124e(C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: e */
        public void mo3589e(int i) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: e */
        public void mo3125e(C0592v vVar, C0560a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3590e(RecyclerView recyclerView) {
            mo3566b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: f */
        public int mo3591f(View view) {
            return view.getLeft() - mo3606k(view);
        }

        /* renamed from: f */
        public int mo3127f(C0560a0 a0Var) {
            return 0;
        }

        /* renamed from: f */
        public void mo3592f(int i) {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo3593f(RecyclerView recyclerView) {
            int i;
            if (recyclerView == null) {
                this.f2390b = null;
                this.f2389a = null;
                i = 0;
                this.f2405q = 0;
            } else {
                this.f2390b = recyclerView;
                this.f2389a = recyclerView.mChildHelper;
                this.f2405q = recyclerView.getWidth();
                i = recyclerView.getHeight();
            }
            this.f2406r = i;
            this.f2403o = 1073741824;
            this.f2404p = 1073741824;
        }

        /* renamed from: f */
        public boolean mo3594f() {
            RecyclerView recyclerView = this.f2390b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        /* renamed from: g */
        public int mo3595g(View view) {
            Rect rect = ((C0585p) view.getLayoutParams()).f2414b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        /* renamed from: g */
        public View mo3596g() {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.f2389a.mo3844c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        /* renamed from: g */
        public void mo3597g(int i) {
        }

        /* renamed from: g */
        public void mo3128g(C0560a0 a0Var) {
        }

        /* renamed from: h */
        public int mo3598h() {
            return this.f2406r;
        }

        /* renamed from: h */
        public int mo3599h(View view) {
            Rect rect = ((C0585p) view.getLayoutParams()).f2414b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        /* renamed from: h */
        public void mo3600h(int i) {
            if (mo3583d(i) != null) {
                this.f2389a.mo3847e(i);
            }
        }

        /* renamed from: i */
        public int mo3601i() {
            return this.f2404p;
        }

        /* renamed from: i */
        public int mo3602i(View view) {
            return view.getRight() + mo3610m(view);
        }

        /* renamed from: i */
        public void mo3171i(int i) {
        }

        /* renamed from: j */
        public int mo3603j() {
            RecyclerView recyclerView = this.f2390b;
            C0569g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.mo3472b();
            }
            return 0;
        }

        /* renamed from: j */
        public int mo3604j(View view) {
            return view.getTop() - mo3612n(view);
        }

        /* renamed from: k */
        public int mo3605k() {
            return C3379v.m13829p(this.f2390b);
        }

        /* renamed from: k */
        public int mo3606k(View view) {
            return ((C0585p) view.getLayoutParams()).f2414b.left;
        }

        /* renamed from: l */
        public int mo3607l() {
            return C3379v.m13830q(this.f2390b);
        }

        /* renamed from: l */
        public int mo3608l(View view) {
            return ((C0585p) view.getLayoutParams()).mo3630a();
        }

        /* renamed from: m */
        public int mo3609m() {
            return C3379v.m13831r(this.f2390b);
        }

        /* renamed from: m */
        public int mo3610m(View view) {
            return ((C0585p) view.getLayoutParams()).f2414b.right;
        }

        /* renamed from: n */
        public int mo3611n() {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: n */
        public int mo3612n(View view) {
            return ((C0585p) view.getLayoutParams()).f2414b.top;
        }

        /* renamed from: o */
        public int mo3613o() {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: o */
        public void mo3614o(View view) {
            this.f2389a.mo3846d(view);
        }

        /* renamed from: p */
        public int mo3615p() {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: q */
        public int mo3616q() {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: r */
        public int mo3617r() {
            return this.f2405q;
        }

        /* renamed from: s */
        public int mo3618s() {
            return this.f2403o;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: t */
        public boolean mo3619t() {
            int e = mo3587e();
            for (int i = 0; i < e; i++) {
                LayoutParams layoutParams = mo3583d(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: u */
        public boolean mo3620u() {
            return this.f2397i;
        }

        /* renamed from: v */
        public boolean mo3174v() {
            return this.f2398j;
        }

        /* renamed from: w */
        public final boolean mo3621w() {
            return this.f2400l;
        }

        /* renamed from: x */
        public boolean mo3622x() {
            C0597z zVar = this.f2395g;
            return zVar != null && zVar.mo3708e();
        }

        /* renamed from: y */
        public Parcelable mo3175y() {
            return null;
        }

        /* renamed from: z */
        public void mo3623z() {
            RecyclerView recyclerView = this.f2390b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public static class C0585p extends MarginLayoutParams {

        /* renamed from: a */
        C0566d0 f2413a;

        /* renamed from: b */
        final Rect f2414b = new Rect();

        /* renamed from: c */
        boolean f2415c = true;

        /* renamed from: d */
        boolean f2416d = false;

        public C0585p(int i, int i2) {
            super(i, i2);
        }

        public C0585p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0585p(LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0585p(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public C0585p(C0585p pVar) {
            super(pVar);
        }

        /* renamed from: a */
        public int mo3630a() {
            return this.f2413a.mo3423i();
        }

        /* renamed from: b */
        public boolean mo3631b() {
            return this.f2413a.mo3434t();
        }

        /* renamed from: c */
        public boolean mo3632c() {
            return this.f2413a.mo3431q();
        }

        /* renamed from: d */
        public boolean mo3633d() {
            return this.f2413a.mo3429o();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public interface C0586q {
        /* renamed from: a */
        void mo3634a(View view);

        /* renamed from: b */
        void mo3635b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public static abstract class C0587r {
        /* renamed from: a */
        public abstract boolean mo3636a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public interface C0588s {
        /* renamed from: a */
        void mo3637a(boolean z);

        /* renamed from: a */
        boolean mo3638a(RecyclerView recyclerView, MotionEvent motionEvent);

        /* renamed from: b */
        void mo3639b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static abstract class C0589t {
        /* renamed from: a */
        public void mo3640a(RecyclerView recyclerView, int i) {
        }

        /* renamed from: a */
        public void mo3641a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public static class C0590u {

        /* renamed from: a */
        SparseArray<C0591a> f2417a = new SparseArray<>();

        /* renamed from: b */
        private int f2418b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$u$a */
        static class C0591a {

            /* renamed from: a */
            final ArrayList<C0566d0> f2419a = new ArrayList<>();

            /* renamed from: b */
            int f2420b = 5;

            /* renamed from: c */
            long f2421c = 0;

            /* renamed from: d */
            long f2422d = 0;

            C0591a() {
            }
        }

        /* renamed from: b */
        private C0591a m3275b(int i) {
            C0591a aVar = (C0591a) this.f2417a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C0591a aVar2 = new C0591a();
            this.f2417a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo3642a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* renamed from: a */
        public C0566d0 mo3643a(int i) {
            C0591a aVar = (C0591a) this.f2417a.get(i);
            if (aVar != null && !aVar.f2419a.isEmpty()) {
                ArrayList<C0566d0> arrayList = aVar.f2419a;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (!((C0566d0) arrayList.get(size)).mo3427m()) {
                        return (C0566d0) arrayList.remove(size);
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3644a() {
            this.f2418b++;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3645a(int i, long j) {
            C0591a b = m3275b(i);
            b.f2422d = mo3642a(b.f2422d, j);
        }

        /* renamed from: a */
        public void mo3646a(C0566d0 d0Var) {
            int h = d0Var.mo3422h();
            ArrayList<C0566d0> arrayList = m3275b(h).f2419a;
            if (((C0591a) this.f2417a.get(h)).f2420b > arrayList.size()) {
                d0Var.mo3437v();
                arrayList.add(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3647a(C0569g gVar, C0569g gVar2, boolean z) {
            if (gVar != null) {
                mo3652c();
            }
            if (!z && this.f2418b == 0) {
                mo3649b();
            }
            if (gVar2 != null) {
                mo3644a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo3648a(int i, long j, long j2) {
            long j3 = m3275b(i).f2422d;
            return j3 == 0 || j + j3 < j2;
        }

        /* renamed from: b */
        public void mo3649b() {
            for (int i = 0; i < this.f2417a.size(); i++) {
                ((C0591a) this.f2417a.valueAt(i)).f2419a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3650b(int i, long j) {
            C0591a b = m3275b(i);
            b.f2421c = mo3642a(b.f2421c, j);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo3651b(int i, long j, long j2) {
            long j3 = m3275b(i).f2421c;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3652c() {
            this.f2418b--;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public final class C0592v {

        /* renamed from: a */
        final ArrayList<C0566d0> f2423a = new ArrayList<>();

        /* renamed from: b */
        ArrayList<C0566d0> f2424b = null;

        /* renamed from: c */
        final ArrayList<C0566d0> f2425c = new ArrayList<>();

        /* renamed from: d */
        private final List<C0566d0> f2426d = Collections.unmodifiableList(this.f2423a);

        /* renamed from: e */
        private int f2427e = 2;

        /* renamed from: f */
        int f2428f = 2;

        /* renamed from: g */
        C0590u f2429g;

        /* renamed from: h */
        private C0562b0 f2430h;

        public C0592v() {
        }

        /* renamed from: a */
        private void m3287a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m3287a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* renamed from: a */
        private boolean m3288a(C0566d0 d0Var, int i, int i2, long j) {
            d0Var.f2375r = RecyclerView.this;
            int h = d0Var.mo3422h();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS && !this.f2429g.mo3648a(h, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.mAdapter.mo3466a(d0Var, i);
            this.f2429g.mo3645a(d0Var.mo3422h(), RecyclerView.this.getNanoTime() - nanoTime);
            m3289e(d0Var);
            if (RecyclerView.this.mState.mo3389d()) {
                d0Var.f2364g = i2;
            }
            return true;
        }

        /* renamed from: e */
        private void m3289e(C0566d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f2358a;
                if (C3379v.m13827n(view) == 0) {
                    C3379v.m13820h(view, 1);
                }
                C0667t tVar = RecyclerView.this.mAccessibilityDelegate;
                if (tVar != null) {
                    C3323a b = tVar.mo3956b();
                    if (b instanceof C0668a) {
                        ((C0668a) b).mo3964d(view);
                    }
                    C3379v.m13788a(view, b);
                }
            }
        }

        /* renamed from: f */
        private void m3290f(C0566d0 d0Var) {
            View view = d0Var.f2358a;
            if (view instanceof ViewGroup) {
                m3287a((ViewGroup) view, false);
            }
        }

        /* renamed from: a */
        public int mo3653a(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.mo3384a()) {
                return !RecyclerView.this.mState.mo3389d() ? i : RecyclerView.this.mAdapterHelper.mo3797b(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("invalid position ");
            sb.append(i);
            sb.append(". State item count is ");
            sb.append(RecyclerView.this.mState.mo3384a());
            sb.append(RecyclerView.this.exceptionLabel());
            throw new IndexOutOfBoundsException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0566d0 mo3654a(int i, boolean z) {
            int size = this.f2423a.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                C0566d0 d0Var = (C0566d0) this.f2423a.get(i3);
                if (d0Var.mo3404A() || d0Var.mo3423i() != i || d0Var.mo3429o() || (!RecyclerView.this.mState.f2338h && d0Var.mo3431q())) {
                    i3++;
                } else {
                    d0Var.mo3406a(32);
                    return d0Var;
                }
            }
            if (!z) {
                View b = RecyclerView.this.mChildHelper.mo3841b(i);
                if (b != null) {
                    C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(b);
                    RecyclerView.this.mChildHelper.mo3849f(b);
                    int b2 = RecyclerView.this.mChildHelper.mo3840b(b);
                    if (b2 != -1) {
                        RecyclerView.this.mChildHelper.mo3834a(b2);
                        mo3675c(b);
                        childViewHolderInt.mo3406a(8224);
                        return childViewHolderInt;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(childViewHolderInt);
                    sb.append(RecyclerView.this.exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.f2425c.size();
            while (i2 < size2) {
                C0566d0 d0Var2 = (C0566d0) this.f2425c.get(i2);
                if (d0Var2.mo3429o() || d0Var2.mo3423i() != i || d0Var2.mo3427m()) {
                    i2++;
                } else {
                    if (!z) {
                        this.f2425c.remove(i2);
                    }
                    return d0Var2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x01a2  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01c5  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x01fe  */
        /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.C0566d0 mo3655a(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                r0 = r18
                if (r3 < 0) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                int r1 = r1.mo3384a()
                if (r3 >= r1) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                boolean r1 = r1.mo3389d()
                r2 = 0
                r7 = 1
                r8 = 0
                if (r1 == 0) goto L_0x0027
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo3667b(r17)
                if (r1 == 0) goto L_0x0028
                r4 = 1
                goto L_0x0029
            L_0x0027:
                r1 = r2
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r1 != 0) goto L_0x005d
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r16.mo3654a(r17, r18)
                if (r1 == 0) goto L_0x005d
                boolean r5 = r6.mo3679d(r1)
                if (r5 != 0) goto L_0x005c
                if (r0 != 0) goto L_0x005a
                r5 = 4
                r1.mo3406a(r5)
                boolean r5 = r1.mo3432r()
                if (r5 == 0) goto L_0x004e
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r1.f2358a
                r5.removeDetachedView(r9, r8)
                r1.mo3441z()
                goto L_0x0057
            L_0x004e:
                boolean r5 = r1.mo3404A()
                if (r5 == 0) goto L_0x0057
                r1.mo3417c()
            L_0x0057:
                r6.mo3671b(r1)
            L_0x005a:
                r1 = r2
                goto L_0x005d
            L_0x005c:
                r4 = 1
            L_0x005d:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r5 = r5.mAdapterHelper
                int r5 = r5.mo3797b(r3)
                if (r5 < 0) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo3472b()
                if (r5 >= r9) goto L_0x0149
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r9 = r9.mAdapter
                int r9 = r9.mo3473b(r5)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r10 = r10.mAdapter
                boolean r10 = r10.mo3484d()
                if (r10 == 0) goto L_0x0096
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r1 = r1.mAdapter
                long r10 = r1.mo3462a(r5)
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r6.mo3656a(r10, r9, r0)
                if (r1 == 0) goto L_0x0096
                r1.f2360c = r5
                r4 = 1
            L_0x0096:
                if (r1 != 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView$b0 r0 = r6.f2430h
                if (r0 == 0) goto L_0x00eb
                android.view.View r0 = r0.mo3393a(r6, r3, r9)
                if (r0 == 0) goto L_0x00eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$d0 r1 = r1.getChildViewHolder(r0)
                if (r1 == 0) goto L_0x00ce
                boolean r0 = r1.mo3440y()
                if (r0 != 0) goto L_0x00b1
                goto L_0x00eb
            L_0x00b1:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view."
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00ce:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "getViewForPositionAndType returned a view which does not have a ViewHolder"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00eb:
                if (r1 != 0) goto L_0x0102
                androidx.recyclerview.widget.RecyclerView$u r0 = r16.mo3678d()
                androidx.recyclerview.widget.RecyclerView$d0 r0 = r0.mo3643a(r9)
                if (r0 == 0) goto L_0x0101
                r0.mo3437v()
                boolean r1 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r1 == 0) goto L_0x0101
                r6.m3290f(r0)
            L_0x0101:
                r1 = r0
            L_0x0102:
                if (r1 != 0) goto L_0x0181
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                long r0 = r0.getNanoTime()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
                if (r5 == 0) goto L_0x0120
                androidx.recyclerview.widget.RecyclerView$u r10 = r6.f2429g
                r11 = r9
                r12 = r0
                r14 = r19
                boolean r5 = r10.mo3651b(r11, r12, r14)
                if (r5 != 0) goto L_0x0120
                return r2
            L_0x0120:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$g r5 = r2.mAdapter
                androidx.recyclerview.widget.RecyclerView$d0 r2 = r5.mo3463a(r2, r9)
                boolean r5 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r5 == 0) goto L_0x013b
                android.view.View r5 = r2.f2358a
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r5)
                if (r5 == 0) goto L_0x013b
                java.lang.ref.WeakReference r10 = new java.lang.ref.WeakReference
                r10.<init>(r5)
                r2.f2359b = r10
            L_0x013b:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                long r10 = r5.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$u r5 = r6.f2429g
                long r10 = r10 - r0
                r5.mo3650b(r9, r10)
                r9 = r2
                goto L_0x0182
            L_0x0149:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "(offset:"
                r1.append(r2)
                r1.append(r5)
                java.lang.String r2 = ").state:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo3384a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0181:
                r9 = r1
            L_0x0182:
                r10 = r4
                if (r10 == 0) goto L_0x01bb
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo3389d()
                if (r0 != 0) goto L_0x01bb
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r9.mo3416b(r0)
                if (r1 == 0) goto L_0x01bb
                r9.mo3407a(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.f2341k
                if (r0 == 0) goto L_0x01bb
                int r0 = androidx.recyclerview.widget.RecyclerView.C0574l.m3078e(r9)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$a0 r1 = r1.mState
                java.util.List r4 = r9.mo3425k()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = r2.mo3501a(r1, r9, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r9, r0)
            L_0x01bb:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r0 = r0.mState
                boolean r0 = r0.mo3389d()
                if (r0 == 0) goto L_0x01ce
                boolean r0 = r9.mo3428n()
                if (r0 == 0) goto L_0x01ce
                r9.f2364g = r3
                goto L_0x01e1
            L_0x01ce:
                boolean r0 = r9.mo3428n()
                if (r0 == 0) goto L_0x01e3
                boolean r0 = r9.mo3436u()
                if (r0 != 0) goto L_0x01e3
                boolean r0 = r9.mo3429o()
                if (r0 == 0) goto L_0x01e1
                goto L_0x01e3
            L_0x01e1:
                r0 = 0
                goto L_0x01f6
            L_0x01e3:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.mo3797b(r3)
                r0 = r16
                r1 = r9
                r3 = r17
                r4 = r19
                boolean r0 = r0.m3288a(r1, r2, r3, r4)
            L_0x01f6:
                android.view.View r1 = r9.f2358a
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x020c
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            L_0x0204:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0585p) r1
                android.view.View r2 = r9.f2358a
                r2.setLayoutParams(r1)
                goto L_0x021d
            L_0x020c:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x021b
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams(r1)
                goto L_0x0204
            L_0x021b:
                androidx.recyclerview.widget.RecyclerView$p r1 = (androidx.recyclerview.widget.RecyclerView.C0585p) r1
            L_0x021d:
                r1.f2413a = r9
                if (r10 == 0) goto L_0x0224
                if (r0 == 0) goto L_0x0224
                goto L_0x0225
            L_0x0224:
                r7 = 0
            L_0x0225:
                r1.f2416d = r7
                return r9
            L_0x0228:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Invalid item position "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "("
                r1.append(r2)
                r1.append(r3)
                java.lang.String r2 = "). Item count:"
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$a0 r2 = r2.mState
                int r2 = r2.mo3384a()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = r2.exceptionLabel()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C0592v.mo3655a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0566d0 mo3656a(long j, int i, boolean z) {
            for (int size = this.f2423a.size() - 1; size >= 0; size--) {
                C0566d0 d0Var = (C0566d0) this.f2423a.get(size);
                if (d0Var.mo3421g() == j && !d0Var.mo3404A()) {
                    if (i == d0Var.mo3422h()) {
                        d0Var.mo3406a(32);
                        if (d0Var.mo3431q() && !RecyclerView.this.mState.mo3389d()) {
                            d0Var.mo3407a(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f2423a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f2358a, false);
                        mo3660a(d0Var.f2358a);
                    }
                }
            }
            int size2 = this.f2425c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C0566d0 d0Var2 = (C0566d0) this.f2425c.get(size2);
                if (d0Var2.mo3421g() == j && !d0Var2.mo3427m()) {
                    if (i == d0Var2.mo3422h()) {
                        if (!z) {
                            this.f2425c.remove(size2);
                        }
                        return d0Var2;
                    } else if (!z) {
                        mo3681e(size2);
                        return null;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo3657a() {
            this.f2423a.clear();
            mo3686i();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3658a(int i, int i2) {
            int size = this.f2425c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0566d0 d0Var = (C0566d0) this.f2425c.get(i3);
                if (d0Var != null && d0Var.f2360c >= i) {
                    d0Var.mo3409a(i2, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3659a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2425c.size() - 1; size >= 0; size--) {
                C0566d0 d0Var = (C0566d0) this.f2425c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f2360c;
                    if (i4 >= i3) {
                        d0Var.mo3409a(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.mo3406a(8);
                        mo3681e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3660a(View view) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.f2371n = null;
            childViewHolderInt.f2372o = false;
            childViewHolderInt.mo3417c();
            mo3671b(childViewHolderInt);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3661a(C0562b0 b0Var) {
            this.f2430h = b0Var;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3662a(C0566d0 d0Var) {
            C0593w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.mo3688a(d0Var);
            }
            C0569g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.mo3483d(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.mo4008h(d0Var);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3663a(C0566d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f2358a;
            C0667t tVar = RecyclerView.this.mAccessibilityDelegate;
            if (tVar != null) {
                C3323a b = tVar.mo3956b();
                C3379v.m13788a(view, b instanceof C0668a ? ((C0668a) b).mo3962c(view) : null);
            }
            if (z) {
                mo3662a(d0Var);
            }
            d0Var.f2375r = null;
            mo3678d().mo3646a(d0Var);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3664a(C0569g gVar, C0569g gVar2, boolean z) {
            mo3657a();
            mo3678d().mo3647a(gVar, gVar2, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3665a(C0590u uVar) {
            C0590u uVar2 = this.f2429g;
            if (uVar2 != null) {
                uVar2.mo3652c();
            }
            this.f2429g = uVar;
            if (uVar != null && RecyclerView.this.getAdapter() != null) {
                this.f2429g.mo3644a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public View mo3666b(int i, boolean z) {
            return mo3655a(i, z, (long) RecyclerView.FOREVER_NS).f2358a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C0566d0 mo3667b(int i) {
            ArrayList<C0566d0> arrayList = this.f2424b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        C0566d0 d0Var = (C0566d0) this.f2424b.get(i3);
                        if (d0Var.mo3404A() || d0Var.mo3423i() != i) {
                            i3++;
                        } else {
                            d0Var.mo3406a(32);
                            return d0Var;
                        }
                    }
                    if (RecyclerView.this.mAdapter.mo3484d()) {
                        int b = RecyclerView.this.mAdapterHelper.mo3797b(i);
                        if (b > 0 && b < RecyclerView.this.mAdapter.mo3472b()) {
                            long a = RecyclerView.this.mAdapter.mo3462a(b);
                            while (i2 < size) {
                                C0566d0 d0Var2 = (C0566d0) this.f2424b.get(i2);
                                if (d0Var2.mo3404A() || d0Var2.mo3421g() != a) {
                                    i2++;
                                } else {
                                    d0Var2.mo3406a(32);
                                    return d0Var2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3668b() {
            int size = this.f2425c.size();
            for (int i = 0; i < size; i++) {
                ((C0566d0) this.f2425c.get(i)).mo3405a();
            }
            int size2 = this.f2423a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C0566d0) this.f2423a.get(i2)).mo3405a();
            }
            ArrayList<C0566d0> arrayList = this.f2424b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ((C0566d0) this.f2424b.get(i3)).mo3405a();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3669b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            if (i < i2) {
                i5 = -1;
                i4 = i;
                i3 = i2;
            } else {
                i5 = 1;
                i3 = i;
                i4 = i2;
            }
            int size = this.f2425c.size();
            for (int i6 = 0; i6 < size; i6++) {
                C0566d0 d0Var = (C0566d0) this.f2425c.get(i6);
                if (d0Var != null) {
                    int i7 = d0Var.f2360c;
                    if (i7 >= i4 && i7 <= i3) {
                        if (i7 == i) {
                            d0Var.mo3409a(i2 - i, false);
                        } else {
                            d0Var.mo3409a(i5, false);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo3670b(View view) {
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.mo3433s()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.mo3432r()) {
                childViewHolderInt.mo3441z();
            } else if (childViewHolderInt.mo3404A()) {
                childViewHolderInt.mo3417c();
            }
            mo3671b(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.mo3430p()) {
                RecyclerView.this.mItemAnimator.mo3512c(childViewHolderInt);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3671b(C0566d0 d0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (d0Var.mo3432r() || d0Var.f2358a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.mo3432r());
                sb.append(" isAttached:");
                if (d0Var.f2358a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.mo3433s()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(d0Var);
                sb2.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!d0Var.mo3440y()) {
                boolean e = d0Var.mo3419e();
                C0569g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && e && gVar.mo3471a(d0Var)) || d0Var.mo3430p()) {
                    if (this.f2428f <= 0 || d0Var.mo3416b(526)) {
                        z = false;
                    } else {
                        int size = this.f2425c.size();
                        if (size >= this.f2428f && size > 0) {
                            mo3681e(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.mo3914a(d0Var.f2360c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.mo3914a(((C0566d0) this.f2425c.get(i)).f2360c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f2425c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        mo3663a(d0Var, true);
                        z2 = z;
                        RecyclerView.this.mViewInfoStore.mo4008h(d0Var);
                        if (!z2 && !z3 && e) {
                            d0Var.f2375r = null;
                            return;
                        }
                        return;
                    }
                    z2 = z;
                }
                z3 = false;
                RecyclerView.this.mViewInfoStore.mo4008h(d0Var);
                if (!z2) {
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public View mo3672c(int i) {
            return ((C0566d0) this.f2423a.get(i)).f2358a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3673c() {
            this.f2423a.clear();
            ArrayList<C0566d0> arrayList = this.f2424b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3674c(int i, int i2) {
            int i3 = i2 + i;
            for (int size = this.f2425c.size() - 1; size >= 0; size--) {
                C0566d0 d0Var = (C0566d0) this.f2425c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f2360c;
                    if (i4 >= i && i4 < i3) {
                        d0Var.mo3406a(2);
                        mo3681e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3675c(View view) {
            ArrayList<C0566d0> arrayList;
            C0566d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.mo3416b(12) && childViewHolderInt.mo3434t() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f2424b == null) {
                    this.f2424b = new ArrayList<>();
                }
                childViewHolderInt.mo3410a(this, true);
                arrayList = this.f2424b;
            } else if (!childViewHolderInt.mo3429o() || childViewHolderInt.mo3431q() || RecyclerView.this.mAdapter.mo3484d()) {
                childViewHolderInt.mo3410a(this, false);
                arrayList = this.f2423a;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
            arrayList.add(childViewHolderInt);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo3676c(C0566d0 d0Var) {
            (d0Var.f2372o ? this.f2424b : this.f2423a).remove(d0Var);
            d0Var.f2371n = null;
            d0Var.f2372o = false;
            d0Var.mo3417c();
        }

        /* renamed from: d */
        public View mo3677d(int i) {
            return mo3666b(i, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C0590u mo3678d() {
            if (this.f2429g == null) {
                this.f2429g = new C0590u();
            }
            return this.f2429g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo3679d(C0566d0 d0Var) {
            if (d0Var.mo3431q()) {
                return RecyclerView.this.mState.mo3389d();
            }
            int i = d0Var.f2360c;
            if (i < 0 || i >= RecyclerView.this.mAdapter.mo3472b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(d0Var);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.mState.mo3389d() && RecyclerView.this.mAdapter.mo3473b(d0Var.f2360c) != d0Var.mo3422h()) {
                return false;
            }
            if (!RecyclerView.this.mAdapter.mo3484d()) {
                return true;
            }
            if (d0Var.mo3421g() == RecyclerView.this.mAdapter.mo3462a(d0Var.f2360c)) {
                z = true;
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo3680e() {
            return this.f2423a.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo3681e(int i) {
            mo3663a((C0566d0) this.f2425c.get(i), true);
            this.f2425c.remove(i);
        }

        /* renamed from: f */
        public List<C0566d0> mo3682f() {
            return this.f2426d;
        }

        /* renamed from: f */
        public void mo3683f(int i) {
            this.f2427e = i;
            mo3687j();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo3684g() {
            int size = this.f2425c.size();
            for (int i = 0; i < size; i++) {
                C0585p pVar = (C0585p) ((C0566d0) this.f2425c.get(i)).f2358a.getLayoutParams();
                if (pVar != null) {
                    pVar.f2415c = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo3685h() {
            int size = this.f2425c.size();
            for (int i = 0; i < size; i++) {
                C0566d0 d0Var = (C0566d0) this.f2425c.get(i);
                if (d0Var != null) {
                    d0Var.mo3406a(6);
                    d0Var.mo3412a((Object) null);
                }
            }
            C0569g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.mo3484d()) {
                mo3686i();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo3686i() {
            for (int size = this.f2425c.size() - 1; size >= 0; size--) {
                mo3681e(size);
            }
            this.f2425c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.mo3912a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo3687j() {
            C0580o oVar = RecyclerView.this.mLayout;
            this.f2428f = this.f2427e + (oVar != null ? oVar.f2401m : 0);
            for (int size = this.f2425c.size() - 1; size >= 0 && this.f2425c.size() > this.f2428f; size--) {
                mo3681e(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public interface C0593w {
        /* renamed from: a */
        void mo3688a(C0566d0 d0Var);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    private class C0594x extends C0571i {
        C0594x() {
        }

        /* renamed from: a */
        public void mo3492a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f2337g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo3800c()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: a */
        public void mo3494a(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo3795a(i, i2, i3)) {
                mo3689b();
            }
        }

        /* renamed from: a */
        public void mo3495a(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo3796a(i, i2, obj)) {
                mo3689b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo3689b() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    C3379v.m13794a((View) recyclerView, recyclerView.mUpdateChildViewsRunnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }

        /* renamed from: b */
        public void mo3496b(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo3799b(i, i2)) {
                mo3689b();
            }
        }

        /* renamed from: c */
        public void mo3497c(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            if (RecyclerView.this.mAdapterHelper.mo3802c(i, i2)) {
                mo3689b();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C0595y extends C3400a {
        public static final Creator<C0595y> CREATOR = new C0596a();

        /* renamed from: h */
        Parcelable f2433h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$y$a */
        static class C0596a implements ClassLoaderCreator<C0595y> {
            C0596a() {
            }

            public C0595y createFromParcel(Parcel parcel) {
                return new C0595y(parcel, null);
            }

            public C0595y createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0595y(parcel, classLoader);
            }

            public C0595y[] newArray(int i) {
                return new C0595y[i];
            }
        }

        C0595y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C0580o.class.getClassLoader();
            }
            this.f2433h = parcel.readParcelable(classLoader);
        }

        C0595y(Parcelable parcelable) {
            super(parcelable);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3690a(C0595y yVar) {
            this.f2433h = yVar.f2433h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2433h, 0);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C0597z {

        /* renamed from: a */
        private int f2434a = -1;

        /* renamed from: b */
        private RecyclerView f2435b;

        /* renamed from: c */
        private C0580o f2436c;

        /* renamed from: d */
        private boolean f2437d;

        /* renamed from: e */
        private boolean f2438e;

        /* renamed from: f */
        private View f2439f;

        /* renamed from: g */
        private final C0598a f2440g = new C0598a(0, 0);

        /* renamed from: h */
        private boolean f2441h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$a */
        public static class C0598a {

            /* renamed from: a */
            private int f2442a;

            /* renamed from: b */
            private int f2443b;

            /* renamed from: c */
            private int f2444c;

            /* renamed from: d */
            private int f2445d;

            /* renamed from: e */
            private Interpolator f2446e;

            /* renamed from: f */
            private boolean f2447f;

            /* renamed from: g */
            private int f2448g;

            public C0598a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, null);
            }

            public C0598a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2445d = -1;
                this.f2447f = false;
                this.f2448g = 0;
                this.f2442a = i;
                this.f2443b = i2;
                this.f2444c = i3;
                this.f2446e = interpolator;
            }

            /* renamed from: b */
            private void m3352b() {
                if (this.f2446e != null && this.f2444c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.f2444c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            /* renamed from: a */
            public void mo3712a(int i) {
                this.f2445d = i;
            }

            /* renamed from: a */
            public void mo3713a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2442a = i;
                this.f2443b = i2;
                this.f2444c = i3;
                this.f2446e = interpolator;
                this.f2447f = true;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public void mo3714a(RecyclerView recyclerView) {
                int i = this.f2445d;
                if (i >= 0) {
                    this.f2445d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f2447f = false;
                    return;
                }
                if (this.f2447f) {
                    m3352b();
                    recyclerView.mViewFlinger.mo3397a(this.f2442a, this.f2443b, this.f2444c, this.f2446e);
                    int i2 = this.f2448g + 1;
                    this.f2448g = i2;
                    if (i2 > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2447f = false;
                } else {
                    this.f2448g = 0;
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo3715a() {
                return this.f2445d >= 0;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$z$b */
        public interface C0599b {
            /* renamed from: a */
            PointF mo3151a(int i);
        }

        /* renamed from: a */
        public int mo3694a() {
            return this.f2435b.mLayout.mo3587e();
        }

        /* renamed from: a */
        public int mo3695a(View view) {
            return this.f2435b.getChildLayoutPosition(view);
        }

        /* renamed from: a */
        public PointF mo3696a(int i) {
            C0580o b = mo3703b();
            if (b instanceof C0599b) {
                return ((C0599b) b).mo3151a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(C0599b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, sb.toString());
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3697a(int i, int i2) {
            RecyclerView recyclerView = this.f2435b;
            if (this.f2434a == -1 || recyclerView == null) {
                mo3711h();
            }
            if (this.f2437d && this.f2439f == null && this.f2436c != null) {
                PointF a = mo3696a(this.f2434a);
                if (!(a == null || (a.x == 0.0f && a.y == 0.0f))) {
                    recyclerView.scrollStep((int) Math.signum(a.x), (int) Math.signum(a.y), null);
                }
            }
            this.f2437d = false;
            View view = this.f2439f;
            if (view != null) {
                if (mo3695a(view) == this.f2434a) {
                    mo3700a(this.f2439f, recyclerView.mState, this.f2440g);
                    this.f2440g.mo3714a(recyclerView);
                    mo3711h();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f2439f = null;
                }
            }
            if (this.f2438e) {
                mo3698a(i, i2, recyclerView.mState, this.f2440g);
                boolean a2 = this.f2440g.mo3715a();
                this.f2440g.mo3714a(recyclerView);
                if (a2 && this.f2438e) {
                    this.f2437d = true;
                    recyclerView.mViewFlinger.mo3395a();
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3698a(int i, int i2, C0560a0 a0Var, C0598a aVar);

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3699a(PointF pointF) {
            float f = pointF.x;
            float f2 = f * f;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((double) (f2 + (f3 * f3)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract void mo3700a(View view, C0560a0 a0Var, C0598a aVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3701a(RecyclerView recyclerView, C0580o oVar) {
            recyclerView.mViewFlinger.mo3398b();
            if (this.f2441h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, sb.toString());
            }
            this.f2435b = recyclerView;
            this.f2436c = oVar;
            int i = this.f2434a;
            if (i != -1) {
                recyclerView.mState.f2331a = i;
                this.f2438e = true;
                this.f2437d = true;
                this.f2439f = mo3702b(mo3705c());
                mo3709f();
                this.f2435b.mViewFlinger.mo3395a();
                this.f2441h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: b */
        public View mo3702b(int i) {
            return this.f2435b.mLayout.mo3167c(i);
        }

        /* renamed from: b */
        public C0580o mo3703b() {
            return this.f2436c;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo3704b(View view) {
            if (mo3695a(view) == mo3705c()) {
                this.f2439f = view;
            }
        }

        /* renamed from: c */
        public int mo3705c() {
            return this.f2434a;
        }

        /* renamed from: c */
        public void mo3706c(int i) {
            this.f2434a = i;
        }

        /* renamed from: d */
        public boolean mo3707d() {
            return this.f2437d;
        }

        /* renamed from: e */
        public boolean mo3708e() {
            return this.f2438e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo3709f();

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract void mo3710g();

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public final void mo3711h() {
            if (this.f2438e) {
                this.f2438e = false;
                mo3710g();
                this.f2435b.mState.f2331a = -1;
                this.f2439f = null;
                this.f2434a = -1;
                this.f2437d = false;
                this.f2436c.mo3549a(this);
                this.f2436c = null;
                this.f2435b = null;
            }
        }
    }

    static {
        int i = VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i == 18 || i == 19 || i == 20;
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3533a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mObserver = new C0594x();
        this.mRecycler = new C0592v();
        this.mViewInfoStore = new C0677y();
        this.mUpdateChildViewsRunnable = new C0559a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C0573k();
        this.mItemAnimator = new C0625g();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C0564c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C0652b() : null;
        this.mState = new C0560a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C0578m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C0561b();
        this.mViewInfoProcessCallback = new C0565d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = C3388w.m13878b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = C3388w.m13879c(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.mo3503a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (C3379v.m13827n(this) == 0) {
            C3379v.m13820h(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C0667t(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3535c.RecyclerView, i, 0);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C3535c.RecyclerView, attributeSet, obtainStyledAttributes, i, 0);
        }
        String string = obtainStyledAttributes.getString(C3535c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(C3535c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(C3535c.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(C3535c.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(C3535c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(C3535c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(C3535c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(C3535c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i, 0);
        if (VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i, 0);
            if (VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i, 0);
            }
            z = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z);
    }

    private void addAnimatingView(C0566d0 d0Var) {
        View view = d0Var.f2358a;
        boolean z = view.getParent() == this;
        this.mRecycler.mo3676c(getChildViewHolder(view));
        if (d0Var.mo3433s()) {
            this.mChildHelper.mo3836a(view, -1, view.getLayoutParams(), true);
            return;
        }
        C0622f fVar = this.mChildHelper;
        if (!z) {
            fVar.mo3838a(view, true);
        } else {
            fVar.mo3835a(view);
        }
    }

    private void animateChange(C0566d0 d0Var, C0566d0 d0Var2, C0577c cVar, C0577c cVar2, boolean z, boolean z2) {
        d0Var.mo3413a(false);
        if (z) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z2) {
                addAnimatingView(d0Var2);
            }
            d0Var.f2365h = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.mo3676c(d0Var);
            d0Var2.mo3413a(false);
            d0Var2.f2366i = d0Var;
        }
        if (this.mItemAnimator.mo3505a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(C0566d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f2359b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            loop0:
            while (true) {
                View view = (View) obj;
                while (true) {
                    if (view == null) {
                        d0Var.f2359b = null;
                        break loop0;
                    } else if (view != d0Var.f2358a) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                            view = null;
                        }
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    Class asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C0580o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C0580o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(fullClassName);
                    throw new IllegalStateException(sb.toString(), e2);
                } catch (ClassNotFoundException e3) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(fullClassName);
                    throw new IllegalStateException(sb2.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(fullClassName);
                    throw new IllegalStateException(sb3.toString(), e4);
                } catch (InstantiationException e5) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(fullClassName);
                    throw new IllegalStateException(sb4.toString(), e5);
                } catch (IllegalAccessException e6) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(fullClassName);
                    throw new IllegalStateException(sb5.toString(), e6);
                } catch (ClassCastException e7) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(fullClassName);
                    throw new IllegalStateException(sb6.toString(), e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            C3346b.m13627a(obtain, i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z = true;
        this.mState.mo3385a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f2340j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.mo3994a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C0560a0 a0Var = this.mState;
        if (!a0Var.f2341k || !this.mItemsChanged) {
            z = false;
        }
        a0Var.f2339i = z;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        C0560a0 a0Var2 = this.mState;
        a0Var2.f2338h = a0Var2.f2342l;
        a0Var2.f2336f = this.mAdapter.mo3472b();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f2341k) {
            int a = this.mChildHelper.mo3833a();
            for (int i = 0; i < a; i++) {
                C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3842c(i));
                if (!childViewHolderInt.mo3440y() && (!childViewHolderInt.mo3429o() || this.mAdapter.mo3484d())) {
                    this.mViewInfoStore.mo4002c(childViewHolderInt, this.mItemAnimator.mo3501a(this.mState, childViewHolderInt, C0574l.m3078e(childViewHolderInt), childViewHolderInt.mo3425k()));
                    if (this.mState.f2339i && childViewHolderInt.mo3434t() && !childViewHolderInt.mo3431q() && !childViewHolderInt.mo3440y() && !childViewHolderInt.mo3429o()) {
                        this.mViewInfoStore.mo3995a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f2342l) {
            saveOldPositions();
            C0560a0 a0Var3 = this.mState;
            boolean z2 = a0Var3.f2337g;
            a0Var3.f2337g = false;
            this.mLayout.mo3125e(this.mRecycler, a0Var3);
            this.mState.f2337g = z2;
            for (int i2 = 0; i2 < this.mChildHelper.mo3833a(); i2++) {
                C0566d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo3842c(i2));
                if (!childViewHolderInt2.mo3440y() && !this.mViewInfoStore.mo4003c(childViewHolderInt2)) {
                    int e = C0574l.m3078e(childViewHolderInt2);
                    boolean b = childViewHolderInt2.mo3416b(8192);
                    if (!b) {
                        e |= 4096;
                    }
                    C0577c a2 = this.mItemAnimator.mo3501a(this.mState, childViewHolderInt2, e, childViewHolderInt2.mo3425k());
                    if (b) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a2);
                    } else {
                        this.mViewInfoStore.mo3997a(childViewHolderInt2, a2);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f2335e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo3385a(6);
        this.mAdapterHelper.mo3798b();
        this.mState.f2336f = this.mAdapter.mo3472b();
        C0560a0 a0Var = this.mState;
        a0Var.f2334d = 0;
        a0Var.f2338h = false;
        this.mLayout.mo3125e(this.mRecycler, a0Var);
        C0560a0 a0Var2 = this.mState;
        a0Var2.f2337g = false;
        this.mPendingSavedState = null;
        a0Var2.f2341k = a0Var2.f2341k && this.mItemAnimator != null;
        this.mState.f2335e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo3385a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C0560a0 a0Var = this.mState;
        a0Var.f2335e = 1;
        if (a0Var.f2341k) {
            for (int a = this.mChildHelper.mo3833a() - 1; a >= 0; a--) {
                C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3842c(a));
                if (!childViewHolderInt.mo3440y()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    C0577c a2 = this.mItemAnimator.mo3500a(this.mState, childViewHolderInt);
                    C0566d0 a3 = this.mViewInfoStore.mo3993a(changedHolderKey);
                    if (a3 != null && !a3.mo3440y()) {
                        boolean b = this.mViewInfoStore.mo4001b(a3);
                        boolean b2 = this.mViewInfoStore.mo4001b(childViewHolderInt);
                        if (!b || a3 != childViewHolderInt) {
                            C0577c f = this.mViewInfoStore.mo4006f(a3);
                            this.mViewInfoStore.mo4000b(childViewHolderInt, a2);
                            C0577c e = this.mViewInfoStore.mo4005e(childViewHolderInt);
                            if (f == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a3);
                            } else {
                                animateChange(a3, childViewHolderInt, f, e, b, b2);
                            }
                        }
                    }
                    this.mViewInfoStore.mo4000b(childViewHolderInt, a2);
                }
            }
            this.mViewInfoStore.mo3998a(this.mViewInfoProcessCallback);
        }
        this.mLayout.mo3578c(this.mRecycler);
        C0560a0 a0Var2 = this.mState;
        a0Var2.f2333c = a0Var2.f2336f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.f2341k = false;
        a0Var2.f2342l = false;
        this.mLayout.f2396h = false;
        ArrayList<C0566d0> arrayList = this.mRecycler.f2424b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C0580o oVar = this.mLayout;
        if (oVar.f2402n) {
            oVar.f2401m = 0;
            oVar.f2402n = false;
            this.mRecycler.mo3687j();
        }
        this.mLayout.mo3128g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.mo3994a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C0588s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar != null) {
            sVar.mo3639b(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C0588s sVar = (C0588s) this.mOnItemTouchListeners.get(i);
            if (!sVar.mo3638a(this, motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a = this.mChildHelper.mo3833a();
        if (a == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = UNDEFINED_DURATION;
        for (int i3 = 0; i3 < a; i3++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3842c(i3));
            if (!childViewHolderInt.mo3440y()) {
                int i4 = childViewHolderInt.mo3423i();
                if (i4 < i) {
                    i = i4;
                }
                if (i4 > i2) {
                    i2 = i4;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        int i = this.mState.f2343m;
        if (i == -1) {
            i = 0;
        }
        int a = this.mState.mo3384a();
        int i2 = i;
        while (i2 < a) {
            C0566d0 findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition == null) {
                break;
            } else if (findViewHolderForAdapterPosition.f2358a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f2358a;
            } else {
                i2++;
            }
        }
        int min = Math.min(a, i);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            C0566d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(min);
            if (findViewHolderForAdapterPosition2 == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition2.f2358a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f2358a;
            }
        }
    }

    static C0566d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((C0585p) view.getLayoutParams()).f2413a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        C0585p pVar = (C0585p) view.getLayoutParams();
        Rect rect2 = pVar.f2414b;
        rect.set((view.getLeft() - rect2.left) - pVar.leftMargin, (view.getTop() - rect2.top) - pVar.topMargin, view.getRight() + rect2.right + pVar.rightMargin, view.getBottom() + rect2.bottom + pVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0:
        while (true) {
            id = view.getId();
            while (true) {
                if (view.isFocused() || !(view instanceof ViewGroup) || !view.hasFocus()) {
                    return id;
                }
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    private C3370m getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C3370m(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C0566d0 d0Var, C0566d0 d0Var2) {
        int a = this.mChildHelper.mo3833a();
        for (int i = 0; i < a; i++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3842c(i));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j) {
                C0569g gVar = this.mAdapter;
                String str = " \n View Holder 2:";
                if (gVar == null || !gVar.mo3484d()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(str);
                    sb.append(d0Var);
                    sb.append(exceptionLabel());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(str);
                sb2.append(d0Var);
                sb2.append(exceptionLabel());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(d0Var2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(d0Var);
        sb3.append(exceptionLabel());
        Log.e(TAG, sb3.toString());
    }

    private boolean hasUpdatedView() {
        int a = this.mChildHelper.mo3833a();
        for (int i = 0; i < a; i++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3842c(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo3440y() && childViewHolderInt.mo3434t()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (C3379v.m13828o(this) == 0) {
            C3379v.m13822i(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C0622f(new C0567e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        boolean z = false;
        if (!(view2 == null || view2 == this)) {
            if (findContainingItemView(view2) == null) {
                return false;
            }
            if (view == null || findContainingItemView(view) == null) {
                return true;
            }
            this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
            this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.mTempRect);
            offsetDescendantRectToMyCoords(view2, this.mTempRect2);
            char c = 65535;
            int i3 = this.mLayout.mo3605k() == 1 ? -1 : 1;
            Rect rect = this.mTempRect;
            int i4 = rect.left;
            int i5 = this.mTempRect2.left;
            if ((i4 < i5 || rect.right <= i5) && this.mTempRect.right < this.mTempRect2.right) {
                i2 = 1;
            } else {
                Rect rect2 = this.mTempRect;
                int i6 = rect2.right;
                int i7 = this.mTempRect2.right;
                i2 = ((i6 > i7 || rect2.left >= i7) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
            }
            Rect rect3 = this.mTempRect;
            int i8 = rect3.top;
            int i9 = this.mTempRect2.top;
            if ((i8 < i9 || rect3.bottom <= i9) && this.mTempRect.bottom < this.mTempRect2.bottom) {
                c = 1;
            } else {
                Rect rect4 = this.mTempRect;
                int i10 = rect4.bottom;
                int i11 = this.mTempRect2.bottom;
                if ((i10 <= i11 && rect4.top < i11) || this.mTempRect.top <= this.mTempRect2.top) {
                    c = 0;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    if (c > 0 || (c == 0 && i2 * i3 >= 0)) {
                        z = true;
                    }
                    return z;
                } else if (i == 17) {
                    if (i2 < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 33) {
                    if (c < 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 66) {
                    if (i2 > 0) {
                        z = true;
                    }
                    return z;
                } else if (i == 130) {
                    if (c > 0) {
                        z = true;
                    }
                    return z;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i);
                    sb.append(exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c < 0 || (c == 0 && i2 * i3 <= 0)) {
                z = true;
            }
        }
        return z;
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo3099D();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.mo3805f();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo3123d(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo3804e();
        } else {
            this.mAdapterHelper.mo3798b();
        }
        boolean z = false;
        boolean z2 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f2341k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z2 || this.mLayout.f2396h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.mo3484d());
        C0560a0 a0Var = this.mState;
        if (a0Var.f2341k && z2 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z = true;
        }
        a0Var.f2342l = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L_0x001c:
            androidx.core.widget.C0386d.m2010a(r3, r4, r9)
            r9 = 1
            goto L_0x0039
        L_0x0021:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x0038
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L_0x001c
        L_0x0038:
            r9 = 0
        L_0x0039:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L_0x0053
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.C0386d.m2010a(r9, r0, r7)
            goto L_0x006f
        L_0x0053:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L_0x006e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.C0386d.m2010a(r9, r3, r0)
            goto L_0x006f
        L_0x006e:
            r1 = r9
        L_0x006f:
            if (r1 != 0) goto L_0x0079
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0079
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x007c
        L_0x0079:
            p071f.p097h.p108m.C3379v.m13772H(r6)
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (!this.mChildHelper.mo3844c(focusedChild)) {
                        return;
                    }
                } else if (this.mChildHelper.mo3833a() == 0) {
                    requestFocus();
                    return;
                }
            }
            View view = null;
            C0566d0 findViewHolderForItemId = (this.mState.f2344n == -1 || !this.mAdapter.mo3484d()) ? null : findViewHolderForItemId(this.mState.f2344n);
            if (findViewHolderForItemId != null && !this.mChildHelper.mo3844c(findViewHolderForItemId.f2358a) && findViewHolderForItemId.f2358a.hasFocusable()) {
                view = findViewHolderForItemId.f2358a;
            } else if (this.mChildHelper.mo3833a() > 0) {
                view = findNextViewToFocus();
            }
            if (view != null) {
                int i = this.mState.f2345o;
                if (((long) i) != -1) {
                    View findViewById = view.findViewById(i);
                    if (findViewById != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                }
                view.requestFocus();
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C3379v.m13772H(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C0585p) {
            C0585p pVar = (C0585p) layoutParams;
            if (!pVar.f2415c) {
                Rect rect = pVar.f2414b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo3560a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C0560a0 a0Var = this.mState;
        a0Var.f2344n = -1;
        a0Var.f2343m = -1;
        a0Var.f2345o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        C0566d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f2344n = this.mAdapter.mo3484d() ? d0Var.mo3421g() : -1;
        C0560a0 a0Var = this.mState;
        int i = this.mDataSetHasChangedAfterLayout ? -1 : d0Var.mo3431q() ? d0Var.f2361d : d0Var.mo3420f();
        a0Var.f2343m = i;
        this.mState.f2345o = getDeepestFocusedViewWithId(d0Var.f2358a);
    }

    private void setAdapterInternal(C0569g gVar, boolean z, boolean z2) {
        C0569g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.mo3478b((C0571i) this.mObserver);
            this.mAdapter.mo3479b(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.mo3805f();
        C0569g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.mo3468a((C0571i) this.mObserver);
            gVar.mo3469a(this);
        }
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3544a(gVar3, this.mAdapter);
        }
        this.mRecycler.mo3664a(gVar3, this.mAdapter, z);
        this.mState.f2337g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.mo3398b();
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3532C();
        }
    }

    /* access modifiers changed from: 0000 */
    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            C3379v.m13772H(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0580o oVar = this.mLayout;
        if (oVar == null || !oVar.mo3563a(this, arrayList, i, i2)) {
            super.addFocusables(arrayList, i, i2);
        }
    }

    public void addItemDecoration(C0579n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(C0579n nVar, int i) {
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3160a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(C0586q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(C0588s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(C0589t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    /* access modifiers changed from: 0000 */
    public void animateAppearance(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
        d0Var.mo3413a(false);
        if (this.mItemAnimator.mo3506a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: 0000 */
    public void animateDisappearance(C0566d0 d0Var, C0577c cVar, C0577c cVar2) {
        addAnimatingView(d0Var);
        d0Var.mo3413a(false);
        if (this.mItemAnimator.mo3510b(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    /* access modifiers changed from: 0000 */
    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(exceptionLabel());
            throw new IllegalStateException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(exceptionLabel());
        throw new IllegalStateException(sb2.toString());
    }

    /* access modifiers changed from: 0000 */
    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(exceptionLabel());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(exceptionLabel());
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean canReuseUpdatedViewHolder(C0566d0 d0Var) {
        C0574l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo3507a(d0Var, d0Var.mo3425k());
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C0585p) && this.mLayout.mo3115a((C0585p) layoutParams);
    }

    /* access modifiers changed from: 0000 */
    public void clearOldPositions() {
        int b = this.mChildHelper.mo3839b();
        for (int i = 0; i < b; i++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i));
            if (!childViewHolderInt.mo3440y()) {
                childViewHolderInt.mo3405a();
            }
        }
        this.mRecycler.mo3668b();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C0586q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C0589t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C0580o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3162a()) {
            i = this.mLayout.mo3149a(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollOffset() {
        C0580o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3162a()) {
            i = this.mLayout.mo3117b(this.mState);
        }
        return i;
    }

    public int computeHorizontalScrollRange() {
        C0580o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3162a()) {
            i = this.mLayout.mo3121c(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollExtent() {
        C0580o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3165b()) {
            i = this.mLayout.mo3168d(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollOffset() {
        C0580o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3165b()) {
            i = this.mLayout.mo3124e(this.mState);
        }
        return i;
    }

    public int computeVerticalScrollRange() {
        C0580o oVar = this.mLayout;
        int i = 0;
        if (oVar == null) {
            return 0;
        }
        if (oVar.mo3165b()) {
            i = this.mLayout.mo3127f(this.mState);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            C3379v.m13772H(this);
        }
    }

    /* access modifiers changed from: 0000 */
    public void consumePendingUpdateOperations() {
        boolean z = this.mFirstLayoutComplete;
        String str = TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG;
        if (!z || this.mDataSetHasChangedAfterLayout) {
            C3280c.m13445a(str);
            dispatchLayout();
            C3280c.m13444a();
        } else if (this.mAdapterHelper.mo3800c()) {
            if (!this.mAdapterHelper.mo3801c(4) || this.mAdapterHelper.mo3801c(11)) {
                if (this.mAdapterHelper.mo3800c()) {
                    C3280c.m13445a(str);
                    dispatchLayout();
                }
            }
            C3280c.m13445a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            this.mAdapterHelper.mo3804e();
            if (!this.mLayoutWasDefered) {
                if (hasUpdatedView()) {
                    dispatchLayout();
                } else {
                    this.mAdapterHelper.mo3791a();
                }
            }
            stopInterceptRequestLayout(true);
            onExitLayoutOrScroll();
            C3280c.m13444a();
        }
    }

    /* access modifiers changed from: 0000 */
    public void defaultOnMeasure(int i, int i2) {
        setMeasuredDimension(C0580o.m3111a(i, getPaddingLeft() + getPaddingRight(), C3379v.m13831r(this)), C0580o.m3111a(i2, getPaddingTop() + getPaddingBottom(), C3379v.m13830q(this)));
    }

    /* access modifiers changed from: 0000 */
    public void dispatchChildAttached(View view) {
        C0566d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        C0569g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo3476b(childViewHolderInt);
        }
        List<C0586q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0586q) this.mOnChildAttachStateListeners.get(size)).mo3634a(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchChildDetached(View view) {
        C0566d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        C0569g gVar = this.mAdapter;
        if (!(gVar == null || childViewHolderInt == null)) {
            gVar.mo3481c(childViewHolderInt);
        }
        List<C0586q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0586q) this.mOnChildAttachStateListeners.get(size)).mo3635b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchLayout() {
        String str;
        C0569g gVar = this.mAdapter;
        String str2 = TAG;
        if (gVar == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout == null) {
            str = "No layout manager attached; skipping layout";
        } else {
            C0560a0 a0Var = this.mState;
            a0Var.f2340j = false;
            if (a0Var.f2335e == 1) {
                dispatchLayoutStep1();
            } else if (!this.mAdapterHelper.mo3803d() && this.mLayout.mo3617r() == getWidth() && this.mLayout.mo3598h() == getHeight()) {
                this.mLayout.mo3590e(this);
                dispatchLayoutStep3();
                return;
            }
            this.mLayout.mo3590e(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        }
        Log.e(str2, str);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo10820a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo10819a(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo10825a(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo10826a(i, i2, iArr, iArr2, i3);
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo10816a(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo10823a(i, i2, i3, i4, iArr);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo10824a(i, i2, i3, i4, iArr, i5);
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnScrollStateChanged(int i) {
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3597g(i);
        }
        onScrollStateChanged(i);
        C0589t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo3640a(this, i);
        }
        List<C0589t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0589t) this.mScrollListeners.get(size)).mo3640a(this, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C0589t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.mo3641a(this, i, i2);
        }
        List<C0589t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((C0589t) this.mScrollListeners.get(size)).mo3641a(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    /* access modifiers changed from: 0000 */
    public void dispatchPendingImportantForAccessibilityChanges() {
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C0566d0 d0Var = (C0566d0) this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f2358a.getParent() == this && !d0Var.mo3440y()) {
                int i = d0Var.f2374q;
                if (i != -1) {
                    C3379v.m13820h(d0Var.f2358a, i);
                    d0Var.f2374q = -1;
                }
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        int i;
        float f;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((C0579n) this.mItemDecorations.get(i2)).mo3530b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f = (float) ((-getWidth()) + getPaddingRight());
                i = (-getHeight()) + getPaddingBottom();
            } else {
                f = (float) (-getWidth());
                i = -getHeight();
            }
            canvas.translate(f, (float) i);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo3518g()) {
            z3 = z;
        }
        if (z3) {
            C3379v.m13772H(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    /* access modifiers changed from: 0000 */
    public void ensureBottomGlow() {
        int i;
        int i2;
        if (this.mBottomGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo3499a(this, 3);
            this.mBottomGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureLeftGlow() {
        int i;
        int i2;
        if (this.mLeftGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo3499a(this, 0);
            this.mLeftGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureRightGlow() {
        int i;
        int i2;
        if (this.mRightGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo3499a(this, 2);
            this.mRightGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
                i = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                i2 = getMeasuredHeight();
                i = getMeasuredWidth();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void ensureTopGlow() {
        int i;
        int i2;
        if (this.mTopGlow == null) {
            EdgeEffect a = this.mEdgeEffectFactory.mo3499a(this, 1);
            this.mTopGlow = a;
            if (this.mClipToPadding) {
                i2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                i = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                i2 = getMeasuredWidth();
                i = getMeasuredHeight();
            }
            a.setSize(i2, i);
        }
    }

    /* access modifiers changed from: 0000 */
    public String exceptionLabel() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.mAdapter);
        sb.append(", layout:");
        sb.append(this.mLayout);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public final void fillRemainingScrollValues(C0560a0 a0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f2351h;
            a0Var.f2346p = overScroller.getFinalX() - overScroller.getCurrX();
            a0Var.f2347q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        a0Var.f2346p = 0;
        a0Var.f2347q = 0;
    }

    public View findChildViewUnder(float f, float f2) {
        for (int a = this.mChildHelper.mo3833a() - 1; a >= 0; a--) {
            View c = this.mChildHelper.mo3842c(a);
            float translationX = c.getTranslationX();
            float translationY = c.getTranslationY();
            if (f >= ((float) c.getLeft()) + translationX && f <= ((float) c.getRight()) + translationX && f2 >= ((float) c.getTop()) + translationY && f2 <= ((float) c.getBottom()) + translationY) {
                return c;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
        L_0x0000:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L_0x0010
            if (r0 == r2) goto L_0x0010
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L_0x0010
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L_0x0000
        L_0x0010:
            if (r0 != r2) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r3 = 0
        L_0x0014:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public C0566d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C0566d0 findViewHolderForAdapterPosition(int i) {
        C0566d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b = this.mChildHelper.mo3839b();
        for (int i2 = 0; i2 < b; i2++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo3431q() && getAdapterPositionFor(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo3844c(childViewHolderInt.f2358a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public C0566d0 findViewHolderForItemId(long j) {
        C0569g gVar = this.mAdapter;
        C0566d0 d0Var = null;
        if (gVar != null && gVar.mo3484d()) {
            int b = this.mChildHelper.mo3839b();
            for (int i = 0; i < b; i++) {
                C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i));
                if (childViewHolderInt != null && !childViewHolderInt.mo3431q() && childViewHolderInt.mo3421g() == j) {
                    if (!this.mChildHelper.mo3844c(childViewHolderInt.f2358a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public C0566d0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C0566d0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* access modifiers changed from: 0000 */
    public C0566d0 findViewHolderForPosition(int i, boolean z) {
        int b = this.mChildHelper.mo3839b();
        C0566d0 d0Var = null;
        for (int i2 = 0; i2 < b; i2++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.mo3431q()) {
                if (z) {
                    if (childViewHolderInt.f2360c != i) {
                        continue;
                    }
                } else if (childViewHolderInt.mo3423i() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo3844c(childViewHolderInt.f2358a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public boolean fling(int i, int i2) {
        C0580o oVar = this.mLayout;
        int i3 = 0;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean a = oVar.mo3162a();
            boolean b = this.mLayout.mo3165b();
            if (!a || Math.abs(i) < this.mMinFlingVelocity) {
                i = 0;
            }
            if (!b || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (i == 0 && i2 == 0) {
                return false;
            }
            float f = (float) i;
            float f2 = (float) i2;
            if (!dispatchNestedPreFling(f, f2)) {
                boolean z = a || b;
                dispatchNestedFling(f, f2, z);
                C0587r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.mo3636a(i, i2)) {
                    return true;
                }
                if (z) {
                    if (a) {
                        i3 = 1;
                    }
                    if (b) {
                        i3 |= 2;
                    }
                    startNestedScroll(i3, 1);
                    int i4 = this.mMaxFlingVelocity;
                    int max = Math.max(-i4, Math.min(i, i4));
                    int i5 = this.mMaxFlingVelocity;
                    this.mViewFlinger.mo3396a(max, Math.max(-i5, Math.min(i2, i5)));
                    return true;
                }
            }
            return false;
        }
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        View d = this.mLayout.mo3584d(view, i);
        if (d != null) {
            return d;
        }
        boolean z2 = true;
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo3103a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo3165b()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo3162a()) {
                int i3 = (this.mLayout.mo3605k() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo3103a(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!isPreferredNextFocus(view, view2, i)) {
                view2 = super.focusSearch(view, i);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo3122c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo3105a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo3106a(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(exceptionLabel());
        throw new IllegalStateException(sb.toString());
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public C0569g getAdapter() {
        return this.mAdapter;
    }

    /* access modifiers changed from: 0000 */
    public int getAdapterPositionFor(C0566d0 d0Var) {
        if (d0Var.mo3416b(524) || !d0Var.mo3428n()) {
            return -1;
        }
        return this.mAdapterHelper.mo3788a(d0Var.f2360c);
    }

    public int getBaseline() {
        C0580o oVar = this.mLayout;
        return oVar != null ? oVar.mo3581d() : super.getBaseline();
    }

    /* access modifiers changed from: 0000 */
    public long getChangedHolderKey(C0566d0 d0Var) {
        return this.mAdapter.mo3484d() ? d0Var.mo3421g() : (long) d0Var.f2360c;
    }

    public int getChildAdapterPosition(View view) {
        C0566d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo3420f();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        C0572j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo3498a(i, i2);
    }

    public long getChildItemId(View view) {
        C0569g gVar = this.mAdapter;
        if (gVar == null || !gVar.mo3484d()) {
            return -1;
        }
        C0566d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo3421g();
        }
        return -1;
    }

    public int getChildLayoutPosition(View view) {
        C0566d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.mo3423i();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C0566d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C0667t getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C0573k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public C0574l getItemAnimator() {
        return this.mItemAnimator;
    }

    /* access modifiers changed from: 0000 */
    public Rect getItemDecorInsetsForChild(View view) {
        C0585p pVar = (C0585p) view.getLayoutParams();
        if (!pVar.f2415c) {
            return pVar.f2414b;
        }
        if (this.mState.mo3389d() && (pVar.mo3631b() || pVar.mo3633d())) {
            return pVar.f2414b;
        }
        Rect rect = pVar.f2414b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            ((C0579n) this.mItemDecorations.get(i)).mo3528a(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f2415c = false;
        return rect;
    }

    public C0579n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return (C0579n) this.mItemDecorations.get(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public C0580o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public C0587r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C0590u getRecycledViewPool() {
        return this.mRecycler.mo3678d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo10818a();
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo10821a(i);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo3800c();
    }

    /* access modifiers changed from: 0000 */
    public void initAdapterManager() {
        this.mAdapterHelper = new C0609a(new C0568f());
    }

    /* access modifiers changed from: 0000 */
    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(exceptionLabel());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C0645j(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(C3534b.fastscroll_default_thickness), resources.getDimensionPixelSize(C3534b.fastscroll_minimum_range), resources.getDimensionPixelOffset(C3534b.fastscroll_margin));
    }

    /* access modifiers changed from: 0000 */
    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C0580o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo3160a("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C0574l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo3518g();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().mo10827b();
    }

    /* access modifiers changed from: 0000 */
    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo3171i(i);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    public void markItemDecorInsetsDirty() {
        int b = this.mChildHelper.mo3839b();
        for (int i = 0; i < b; i++) {
            ((C0585p) this.mChildHelper.mo3845d(i).getLayoutParams()).f2415c = true;
        }
        this.mRecycler.mo3684g();
    }

    /* access modifiers changed from: 0000 */
    public void markKnownViewsInvalid() {
        int b = this.mChildHelper.mo3839b();
        for (int i = 0; i < b; i++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i));
            if (childViewHolderInt != null && !childViewHolderInt.mo3440y()) {
                childViewHolderInt.mo3406a(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.mo3685h();
    }

    public void offsetChildrenHorizontal(int i) {
        int a = this.mChildHelper.mo3833a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo3842c(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int a = this.mChildHelper.mo3833a();
        for (int i2 = 0; i2 < a; i2++) {
            this.mChildHelper.mo3842c(i2).offsetTopAndBottom(i);
        }
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForInsert(int i, int i2) {
        int b = this.mChildHelper.mo3839b();
        for (int i3 = 0; i3 < b; i3++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.mo3440y() && childViewHolderInt.f2360c >= i) {
                childViewHolderInt.mo3409a(i2, false);
                this.mState.f2337g = true;
            }
        }
        this.mRecycler.mo3658a(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int b = this.mChildHelper.mo3839b();
        if (i < i2) {
            i5 = -1;
            i4 = i;
            i3 = i2;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i6 = 0; i6 < b; i6++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i6));
            if (childViewHolderInt != null) {
                int i7 = childViewHolderInt.f2360c;
                if (i7 >= i4 && i7 <= i3) {
                    if (i7 == i) {
                        childViewHolderInt.mo3409a(i2 - i, false);
                    } else {
                        childViewHolderInt.mo3409a(i5, false);
                    }
                    this.mState.f2337g = true;
                }
            }
        }
        this.mRecycler.mo3669b(i, i2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int b = this.mChildHelper.mo3839b();
        for (int i4 = 0; i4 < b; i4++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.mo3440y()) {
                int i5 = childViewHolderInt.f2360c;
                if (i5 >= i3) {
                    childViewHolderInt.mo3409a(-i2, z);
                } else if (i5 >= i) {
                    childViewHolderInt.mo3408a(i - 1, -i2, z);
                }
                this.mState.f2337g = true;
            }
        }
        this.mRecycler.mo3659a(i, i2, z);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z = false;
        }
        this.mFirstLayoutComplete = z;
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3550a(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            C0650k kVar = (C0650k) C0650k.f2664j.get();
            this.mGapWorker = kVar;
            if (kVar == null) {
                this.mGapWorker = new C0650k();
                Display k = C3379v.m13824k(this);
                float f = 60.0f;
                if (!isInEditMode() && k != null) {
                    float refreshRate = k.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C0650k kVar2 = this.mGapWorker;
                kVar2.f2668h = (long) (1.0E9f / f);
                C0650k.f2664j.set(kVar2);
            }
            this.mGapWorker.mo3906a(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0574l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3508b();
        }
        stopScroll();
        this.mIsAttached = false;
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3551a(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.mo3999b();
        if (ALLOW_THREAD_GAP_WORK) {
            C0650k kVar = this.mGapWorker;
            if (kVar != null) {
                kVar.mo3908b(this);
                this.mGapWorker = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            ((C0579n) this.mItemDecorations.get(i)).mo3526a(canvas, this, this.mState);
        }
    }

    /* access modifiers changed from: 0000 */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    /* access modifiers changed from: 0000 */
    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* access modifiers changed from: 0000 */
    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.mo3165b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo3162a()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo3165b()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo3162a()) {
                        f = axisValue;
                        f2 = 0.0f;
                        scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
                    }
                }
                f2 = 0.0f;
            }
            f = 0.0f;
            scrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C0580o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean a = oVar.mo3162a();
        boolean b = this.mLayout.mo3165b();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i = a ? 1 : 0;
            if (b) {
                i |= 2;
            }
            startNestedScroll(i, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.mScrollPointerId);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, sb.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x2 - this.mInitialTouchX;
                int i3 = y2 - this.mInitialTouchY;
                if (!a || Math.abs(i2) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (b && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            z2 = true;
        }
        return z2;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C3280c.m13445a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        C3280c.m13444a();
        this.mFirstLayoutComplete = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C0580o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo3174v()) {
            int mode = MeasureSpec.getMode(i);
            int mode2 = MeasureSpec.getMode(i2);
            this.mLayout.mo3546a(this.mRecycler, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            if (!z && this.mAdapter != null) {
                if (this.mState.f2335e == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo3566b(i, i2);
                this.mState.f2340j = true;
                dispatchLayoutStep2();
                this.mLayout.mo3585d(i, i2);
                if (this.mLayout.mo3139B()) {
                    this.mLayout.mo3566b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f2340j = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo3585d(i, i2);
                }
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.mo3546a(this.mRecycler, this.mState, i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C0560a0 a0Var = this.mState;
                if (a0Var.f2342l) {
                    a0Var.f2338h = true;
                } else {
                    this.mAdapterHelper.mo3798b();
                    this.mState.f2338h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f2342l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            C0569g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f2336f = gVar.mo3472b();
            } else {
                this.mState.f2336f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.mo3546a(this.mRecycler, this.mState, i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f2338h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0595y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0595y yVar = (C0595y) parcelable;
        this.mPendingSavedState = yVar;
        super.onRestoreInstanceState(yVar.mo10880a());
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            Parcelable parcelable2 = this.mPendingSavedState.f2433h;
            if (parcelable2 != null) {
                oVar.mo3156a(parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0595y yVar = new C0595y(super.onSaveInstanceState());
        C0595y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.mo3690a(yVar2);
        } else {
            C0580o oVar = this.mLayout;
            yVar.f2433h = oVar != null ? oVar.mo3175y() : null;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01e4
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01e4
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo3162a()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.mo3165b()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01b3
            if (r0 == r9) goto L_0x0171
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d9
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d9
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d9
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d9
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error processing scroll; pointer index for id "
            r0.append(r1)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00b2:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00dd
            int r2 = r6.mTouchSlop
            if (r0 <= 0) goto L_0x00d4
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d9
        L_0x00d4:
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d9:
            if (r0 == 0) goto L_0x00dd
            r2 = 1
            goto L_0x00de
        L_0x00dd:
            r2 = 0
        L_0x00de:
            if (r11 == 0) goto L_0x00f2
            int r3 = r6.mTouchSlop
            if (r1 <= 0) goto L_0x00ea
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00ea:
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = 1
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d9
            int[] r0 = r6.mReusableIntPair
            r0[r8] = r8
            r0[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = 0
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = 0
        L_0x010f:
            int[] r3 = r6.mReusableIntPair
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013e
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013e:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x0150
            r1 = r15
            goto L_0x0151
        L_0x0150:
            r1 = 0
        L_0x0151:
            if (r11 == 0) goto L_0x0155
            r2 = r0
            goto L_0x0156
        L_0x0155:
            r2 = 0
        L_0x0156:
            boolean r1 = r6.scrollByInternal(r1, r2, r7)
            if (r1 == 0) goto L_0x0163
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0163:
            androidx.recyclerview.widget.k r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d9
            if (r15 != 0) goto L_0x016b
            if (r0 == 0) goto L_0x01d9
        L_0x016b:
            androidx.recyclerview.widget.k r1 = r6.mGapWorker
            r1.mo3907a(r6, r15, r0)
            goto L_0x01d9
        L_0x0171:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x018d
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018e
        L_0x018d:
            r1 = 0
        L_0x018e:
            if (r11 == 0) goto L_0x019a
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x019b
        L_0x019a:
            r2 = 0
        L_0x019b:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01a3
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01ab
        L_0x01a3:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01ae
        L_0x01ab:
            r6.setScrollState(r8)
        L_0x01ae:
            r17.resetScroll()
            r8 = 1
            goto L_0x01d9
        L_0x01b3:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r10 == 0) goto L_0x01d1
            r0 = 1
            goto L_0x01d2
        L_0x01d1:
            r0 = 0
        L_0x01d2:
            if (r11 == 0) goto L_0x01d6
            r0 = r0 | 2
        L_0x01d6:
            r6.startNestedScroll(r0, r8)
        L_0x01d9:
            if (r8 != 0) goto L_0x01e0
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01e0:
            r12.recycle()
            return r9
        L_0x01e4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: 0000 */
    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            C3379v.m13794a((View) this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    /* access modifiers changed from: 0000 */
    public void recordAnimationInfoIfBouncedHiddenView(C0566d0 d0Var, C0577c cVar) {
        d0Var.mo3407a(0, 8192);
        if (this.mState.f2339i && d0Var.mo3434t() && !d0Var.mo3431q() && !d0Var.mo3440y()) {
            this.mViewInfoStore.mo3995a(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.mo4002c(d0Var, cVar);
    }

    /* access modifiers changed from: 0000 */
    public void removeAndRecycleViews() {
        C0574l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo3508b();
        }
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3570b(this.mRecycler);
            this.mLayout.mo3578c(this.mRecycler);
        }
        this.mRecycler.mo3657a();
    }

    /* access modifiers changed from: 0000 */
    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean e = this.mChildHelper.mo3848e(view);
        if (e) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.mo3676c(childViewHolderInt);
            this.mRecycler.mo3671b(childViewHolderInt);
        }
        stopInterceptRequestLayout(!e);
        return e;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z) {
        C0566d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.mo3433s()) {
                childViewHolderInt.mo3418d();
            } else if (!childViewHolderInt.mo3440y()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                sb.append(exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C0579n nVar) {
        C0580o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo3160a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append(" is an invalid index for size ");
            sb.append(itemDecorationCount);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(C0586q qVar) {
        List<C0586q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(qVar);
        }
    }

    public void removeOnItemTouchListener(C0588s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C0589t tVar) {
        List<C0589t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void repositionShadowingViews() {
        int a = this.mChildHelper.mo3833a();
        for (int i = 0; i < a; i++) {
            View c = this.mChildHelper.mo3842c(i);
            C0566d0 childViewHolder = getChildViewHolder(c);
            if (childViewHolder != null) {
                C0566d0 d0Var = childViewHolder.f2366i;
                if (d0Var != null) {
                    View view = d0Var.f2358a;
                    int left = c.getLeft();
                    int top = c.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.mo3562a(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo3559a(this, view, rect, z);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            ((C0588s) this.mOnItemTouchListeners.get(i)).mo3637a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public void saveOldPositions() {
        int b = this.mChildHelper.mo3839b();
        for (int i = 0; i < b; i++) {
            C0566d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo3845d(i));
            if (!childViewHolderInt.mo3440y()) {
                childViewHolderInt.mo3438w();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C0580o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean a = oVar.mo3162a();
            boolean b = this.mLayout.mo3165b();
            if (a || b) {
                if (!a) {
                    i = 0;
                }
                if (!b) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, null);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i;
        int i8 = i2;
        MotionEvent motionEvent2 = motionEvent;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i7, i8, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i6 = i10;
            i5 = i9;
            i4 = i7 - i9;
            i3 = i8 - i10;
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i5, i6, i4, i3, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i4 - iArr4[0];
        int i12 = i3 - iArr4[1];
        boolean z = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i13 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C3366i.m13729a(motionEvent2, 8194)) {
                pullGlows(motionEvent.getX(), (float) i11, motionEvent.getY(), (float) i12);
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i5 == 0 && i6 == 0)) {
            dispatchOnScrolled(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i5 == 0 && i6 == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C3280c.m13445a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a = i != 0 ? this.mLayout.mo3101a(i, this.mRecycler, this.mState) : 0;
        int b = i2 != 0 ? this.mLayout.mo3116b(i2, this.mRecycler, this.mState) : 0;
        C3280c.m13444a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = a;
            iArr[1] = b;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C0580o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo3171i(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C0667t tVar) {
        this.mAccessibilityDelegate = tVar;
        C3379v.m13788a((View) this, (C3323a) tVar);
    }

    public void setAdapter(C0569g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C0572j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean setChildImportantForAccessibilityInternal(C0566d0 d0Var, int i) {
        if (isComputingLayout()) {
            d0Var.f2374q = i;
            this.mPendingAccessibilityImportanceChange.add(d0Var);
            return false;
        }
        C3379v.m13820h(d0Var.f2358a, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C0573k kVar) {
        C3321h.m13543a(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C0574l lVar) {
        C0574l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo3508b();
            this.mItemAnimator.mo3503a((C0576b) null);
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.mo3503a(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i) {
        this.mRecycler.mo3683f(i);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C0580o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C0574l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo3508b();
                }
                this.mLayout.mo3570b(this.mRecycler);
                this.mLayout.mo3578c(this.mRecycler);
                this.mRecycler.mo3657a();
                if (this.mIsAttached) {
                    this.mLayout.mo3551a(this, this.mRecycler);
                }
                this.mLayout.mo3593f((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.mo3657a();
            }
            this.mChildHelper.mo3843c();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f2390b == null) {
                    oVar.mo3593f(this);
                    if (this.mIsAttached) {
                        this.mLayout.mo3550a(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(oVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(oVar.f2390b.exceptionLabel());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.mRecycler.mo3687j();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().mo10817a(z);
    }

    public void setOnFlingListener(C0587r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(C0589t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C0590u uVar) {
        this.mRecycler.mo3665a(uVar);
    }

    public void setRecyclerListener(C0593w wVar) {
        this.mRecyclerListener = wVar;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        int i2;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i);
                sb.append("; using default value");
                Log.w(TAG, sb.toString());
            } else {
                i2 = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = i2;
            }
        }
        i2 = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = i2;
    }

    public void setViewCacheExtension(C0562b0 b0Var) {
        this.mRecycler.mo3661a(b0Var);
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int a = accessibilityEvent != null ? C3346b.m13626a(accessibilityEvent) : 0;
        if (a != 0) {
            i = a;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, null);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    /* access modifiers changed from: 0000 */
    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C0580o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo3162a()) {
                i = 0;
            }
            if (!this.mLayout.mo3165b()) {
                i2 = 0;
            }
            if (!(i == 0 && i2 == 0)) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo3397a(i, i2, i3, interpolator);
                } else {
                    scrollBy(i, i2);
                }
            }
        }
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C0580o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo3159a(this, this.mState, i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo10828b(i);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo10822a(i, i2);
    }

    /* access modifiers changed from: 0000 */
    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo10829c();
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo10830c(i);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(C0569g gVar, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void viewRangeUpdate(int i, int i2, Object obj) {
        int b = this.mChildHelper.mo3839b();
        int i3 = i + i2;
        for (int i4 = 0; i4 < b; i4++) {
            View d = this.mChildHelper.mo3845d(i4);
            C0566d0 childViewHolderInt = getChildViewHolderInt(d);
            if (childViewHolderInt != null && !childViewHolderInt.mo3440y()) {
                int i5 = childViewHolderInt.f2360c;
                if (i5 >= i && i5 < i3) {
                    childViewHolderInt.mo3406a(2);
                    childViewHolderInt.mo3412a(obj);
                    ((C0585p) d.getLayoutParams()).f2415c = true;
                }
            }
        }
        this.mRecycler.mo3674c(i, i2);
    }
}
