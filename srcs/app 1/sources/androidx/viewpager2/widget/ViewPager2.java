package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.C0665s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import androidx.recyclerview.widget.RecyclerView.C0571i;
import androidx.recyclerview.widget.RecyclerView.C0574l;
import androidx.recyclerview.widget.RecyclerView.C0580o;
import androidx.recyclerview.widget.RecyclerView.C0585p;
import androidx.recyclerview.widget.RecyclerView.C0586q;
import androidx.recyclerview.widget.RecyclerView.C0592v;
import androidx.viewpager2.adapter.C0789b;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p097h.p108m.p109f0.C3347c.C3349b;
import p071f.p097h.p108m.p109f0.C3355f;
import p071f.p097h.p108m.p109f0.C3355f.C3356a;
import p071f.p146z.C3675a;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: z */
    static boolean f3088z = true;

    /* renamed from: f */
    private final Rect f3089f = new Rect();

    /* renamed from: g */
    private final Rect f3090g = new Rect();

    /* renamed from: h */
    private C0811b f3091h = new C0811b(3);

    /* renamed from: i */
    int f3092i;

    /* renamed from: j */
    boolean f3093j = false;

    /* renamed from: k */
    private C0571i f3094k = new C0790a();

    /* renamed from: l */
    private LinearLayoutManager f3095l;

    /* renamed from: m */
    private int f3096m = -1;

    /* renamed from: n */
    private Parcelable f3097n;

    /* renamed from: o */
    RecyclerView f3098o;

    /* renamed from: p */
    private C0665s f3099p;

    /* renamed from: q */
    C0814e f3100q;

    /* renamed from: r */
    private C0811b f3101r;

    /* renamed from: s */
    private C0812c f3102s;

    /* renamed from: t */
    private C0813d f3103t;

    /* renamed from: u */
    private C0574l f3104u = null;

    /* renamed from: v */
    private boolean f3105v = false;

    /* renamed from: w */
    private boolean f3106w = true;

    /* renamed from: x */
    private int f3107x = -1;

    /* renamed from: y */
    C0794e f3108y;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    class C0790a extends C0796g {
        C0790a() {
            super(null);
        }

        /* renamed from: a */
        public void mo3492a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f3093j = true;
            viewPager2.f3100q.mo4420e();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    class C0791b extends C0798i {
        C0791b() {
        }

        /* renamed from: a */
        public void mo4337a(int i) {
            if (i == 0) {
                ViewPager2.this.mo4353e();
            }
        }

        /* renamed from: b */
        public void mo4338b(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f3092i != i) {
                viewPager2.f3092i = i;
                viewPager2.f3108y.mo4392g();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    class C0792c extends C0798i {
        C0792c() {
        }

        /* renamed from: b */
        public void mo4338b(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f3098o.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    class C0793d implements C0586q {
        C0793d(ViewPager2 viewPager2) {
        }

        /* renamed from: a */
        public void mo3634a(View view) {
            C0585p pVar = (C0585p) view.getLayoutParams();
            if (pVar.width != -1 || pVar.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }

        /* renamed from: b */
        public void mo3635b(View view) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    private abstract class C0794e {
        private C0794e(ViewPager2 viewPager2) {
        }

        /* synthetic */ C0794e(ViewPager2 viewPager2, C0790a aVar) {
            this(viewPager2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4376a(AccessibilityEvent accessibilityEvent) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4377a(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4378a(C0569g<?> gVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4379a(C0811b bVar, RecyclerView recyclerView) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4380a(C3347c cVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4381a() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4382a(int i) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo4383a(int i, Bundle bundle) {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4384b(C0569g<?> gVar) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4385b() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4386b(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo4387b(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public String mo4388c() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4389d() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public CharSequence mo4390e() {
            throw new IllegalStateException("Not implemented.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo4391f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo4392g() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo4393h() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo4394i() {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    class C0795f extends C0794e {
        C0795f() {
            super(ViewPager2.this, null);
        }

        /* renamed from: a */
        public void mo4380a(C3347c cVar) {
            if (!ViewPager2.this.mo4348c()) {
                cVar.mo10757b(C3348a.f9558g);
                cVar.mo10757b(C3348a.f9557f);
                cVar.mo10784k(false);
            }
        }

        /* renamed from: a */
        public boolean mo4382a(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.mo4348c();
        }

        /* renamed from: b */
        public boolean mo4385b() {
            return true;
        }

        /* renamed from: b */
        public boolean mo4386b(int i) {
            if (mo4382a(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: e */
        public CharSequence mo4390e() {
            if (mo4385b()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    private static abstract class C0796g extends C0571i {
        private C0796g() {
        }

        /* synthetic */ C0796g(C0790a aVar) {
            this();
        }

        /* renamed from: a */
        public final void mo3493a(int i, int i2) {
            mo3492a();
        }

        /* renamed from: a */
        public final void mo3494a(int i, int i2, int i3) {
            mo3492a();
        }

        /* renamed from: a */
        public final void mo3495a(int i, int i2, Object obj) {
            mo3492a();
        }

        /* renamed from: b */
        public final void mo3496b(int i, int i2) {
            mo3492a();
        }

        /* renamed from: c */
        public final void mo3497c(int i, int i2) {
            mo3492a();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    private class C0797h extends LinearLayoutManager {
        C0797h(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo3158a(C0560a0 a0Var, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo3158a(a0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: a */
        public void mo3548a(C0592v vVar, C0560a0 a0Var, C3347c cVar) {
            super.mo3548a(vVar, a0Var, cVar);
            ViewPager2.this.f3108y.mo4380a(cVar);
        }

        /* renamed from: a */
        public boolean mo3557a(C0592v vVar, C0560a0 a0Var, int i, Bundle bundle) {
            return ViewPager2.this.f3108y.mo4382a(i) ? ViewPager2.this.f3108y.mo4386b(i) : super.mo3557a(vVar, a0Var, i, bundle);
        }

        /* renamed from: a */
        public boolean mo3560a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class C0798i {
        /* renamed from: a */
        public void mo4337a(int i) {
        }

        /* renamed from: a */
        public void mo4395a(int i, float f, int i2) {
        }

        /* renamed from: b */
        public void mo4338b(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    class C0799j extends C0794e {

        /* renamed from: a */
        private final C3355f f3114a = new C0800a();

        /* renamed from: b */
        private final C3355f f3115b = new C0801b();

        /* renamed from: c */
        private C0571i f3116c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        class C0800a implements C3355f {
            C0800a() {
            }

            /* renamed from: a */
            public boolean mo4398a(View view, C3356a aVar) {
                C0799j.this.mo4396c(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        class C0801b implements C3355f {
            C0801b() {
            }

            /* renamed from: a */
            public boolean mo4398a(View view, C3356a aVar) {
                C0799j.this.mo4396c(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$c */
        class C0802c extends C0796g {
            C0802c() {
                super(null);
            }

            /* renamed from: a */
            public void mo3492a() {
                C0799j.this.mo4397j();
            }
        }

        C0799j() {
            super(ViewPager2.this, null);
        }

        /* renamed from: b */
        private void m4321b(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().mo3472b();
            } else {
                i = ViewPager2.this.getAdapter().mo3472b();
                i2 = 0;
                C3347c.m13629a(accessibilityNodeInfo).mo10747a((Object) C3349b.m13706a(i2, i, false, 0));
            }
            i = 0;
            C3347c.m13629a(accessibilityNodeInfo).mo10747a((Object) C3349b.m13706a(i2, i, false, 0));
        }

        /* renamed from: c */
        private void m4322c(AccessibilityNodeInfo accessibilityNodeInfo) {
            C0569g adapter = ViewPager2.this.getAdapter();
            if (adapter != null) {
                int b = adapter.mo3472b();
                if (b != 0 && ViewPager2.this.mo4348c()) {
                    if (ViewPager2.this.f3092i > 0) {
                        accessibilityNodeInfo.addAction(8192);
                    }
                    if (ViewPager2.this.f3092i < b - 1) {
                        accessibilityNodeInfo.addAction(4096);
                    }
                    accessibilityNodeInfo.setScrollable(true);
                }
            }
        }

        /* renamed from: a */
        public void mo4376a(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(mo4388c());
        }

        /* renamed from: a */
        public void mo4377a(AccessibilityNodeInfo accessibilityNodeInfo) {
            m4321b(accessibilityNodeInfo);
            if (VERSION.SDK_INT >= 16) {
                m4322c(accessibilityNodeInfo);
            }
        }

        /* renamed from: a */
        public void mo4378a(C0569g<?> gVar) {
            mo4397j();
            if (gVar != null) {
                gVar.mo3468a(this.f3116c);
            }
        }

        /* renamed from: a */
        public void mo4379a(C0811b bVar, RecyclerView recyclerView) {
            C3379v.m13820h(recyclerView, 2);
            this.f3116c = new C0802c();
            if (C3379v.m13827n(ViewPager2.this) == 0) {
                C3379v.m13820h(ViewPager2.this, 1);
            }
        }

        /* renamed from: a */
        public boolean mo4381a() {
            return true;
        }

        /* renamed from: a */
        public boolean mo4383a(int i, Bundle bundle) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: b */
        public void mo4384b(C0569g<?> gVar) {
            if (gVar != null) {
                gVar.mo3478b(this.f3116c);
            }
        }

        /* renamed from: b */
        public boolean mo4387b(int i, Bundle bundle) {
            if (mo4383a(i, bundle)) {
                mo4396c(i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: c */
        public String mo4388c() {
            if (mo4381a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4396c(int i) {
            if (ViewPager2.this.mo4348c()) {
                ViewPager2.this.mo4345b(i, true);
            }
        }

        /* renamed from: d */
        public void mo4389d() {
            mo4397j();
        }

        /* renamed from: f */
        public void mo4391f() {
            mo4397j();
        }

        /* renamed from: g */
        public void mo4392g() {
            mo4397j();
        }

        /* renamed from: h */
        public void mo4393h() {
            mo4397j();
        }

        /* renamed from: i */
        public void mo4394i() {
            mo4397j();
            if (VERSION.SDK_INT < 21) {
                ViewPager2.this.sendAccessibilityEvent(2048);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo4397j() {
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            C3379v.m13816f(viewPager2, 16908360);
            C3379v.m13816f(viewPager2, 16908361);
            C3379v.m13816f(viewPager2, 16908358);
            C3379v.m13816f(viewPager2, 16908359);
            if (ViewPager2.this.getAdapter() != null) {
                int b = ViewPager2.this.getAdapter().mo3472b();
                if (b != 0 && ViewPager2.this.mo4348c()) {
                    if (ViewPager2.this.getOrientation() == 0) {
                        boolean b2 = ViewPager2.this.mo4347b();
                        int i2 = b2 ? 16908360 : 16908361;
                        if (b2) {
                            i = 16908361;
                        }
                        if (ViewPager2.this.f3092i < b - 1) {
                            C3379v.m13790a(viewPager2, new C3348a(i2, null), null, this.f3114a);
                        }
                        if (ViewPager2.this.f3092i > 0) {
                            C3379v.m13790a(viewPager2, new C3348a(i, null), null, this.f3115b);
                        }
                    } else {
                        if (ViewPager2.this.f3092i < b - 1) {
                            C3379v.m13790a(viewPager2, new C3348a(16908359, null), null, this.f3114a);
                        }
                        if (ViewPager2.this.f3092i > 0) {
                            C3379v.m13790a(viewPager2, new C3348a(16908358, null), null, this.f3115b);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface C0803k {
        /* renamed from: a */
        void mo4399a(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    private class C0804l extends C0665s {
        C0804l() {
        }

        /* renamed from: c */
        public View mo3931c(C0580o oVar) {
            if (ViewPager2.this.mo4344a()) {
                return null;
            }
            return super.mo3931c(oVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    private class C0805m extends RecyclerView {
        C0805m(Context context) {
            super(context);
        }

        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f3108y.mo4385b() ? ViewPager2.this.f3108y.mo4390e() : super.getAccessibilityClassName();
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f3092i);
            accessibilityEvent.setToIndex(ViewPager2.this.f3092i);
            ViewPager2.this.f3108y.mo4376a(accessibilityEvent);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo4348c() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.mo4348c() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    static class C0806n extends BaseSavedState {
        public static final Creator<C0806n> CREATOR = new C0807a();

        /* renamed from: f */
        int f3123f;

        /* renamed from: g */
        int f3124g;

        /* renamed from: h */
        Parcelable f3125h;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$n$a */
        static class C0807a implements ClassLoaderCreator<C0806n> {
            C0807a() {
            }

            public C0806n createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, (ClassLoader) null);
            }

            public C0806n createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return VERSION.SDK_INT >= 24 ? new C0806n(parcel, classLoader) : new C0806n(parcel);
            }

            public C0806n[] newArray(int i) {
                return new C0806n[i];
            }
        }

        C0806n(Parcel parcel) {
            super(parcel);
            m4344a(parcel, null);
        }

        C0806n(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            m4344a(parcel, classLoader);
        }

        C0806n(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        private void m4344a(Parcel parcel, ClassLoader classLoader) {
            this.f3123f = parcel.readInt();
            this.f3124g = parcel.readInt();
            this.f3125h = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3123f);
            parcel.writeInt(this.f3124g);
            parcel.writeParcelable(this.f3125h, i);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$o */
    private static class C0808o implements Runnable {

        /* renamed from: f */
        private final int f3126f;

        /* renamed from: g */
        private final RecyclerView f3127g;

        C0808o(int i, RecyclerView recyclerView) {
            this.f3126f = i;
            this.f3127g = recyclerView;
        }

        public void run() {
            this.f3127g.smoothScrollToPosition(this.f3126f);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        m4264a(context, (AttributeSet) null);
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4264a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4264a(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4264a(context, attributeSet);
    }

    /* renamed from: a */
    private void m4264a(Context context, AttributeSet attributeSet) {
        this.f3108y = f3088z ? new C0799j() : new C0795f();
        C0805m mVar = new C0805m(context);
        this.f3098o = mVar;
        mVar.setId(C3379v.m13800b());
        this.f3098o.setDescendantFocusability(131072);
        C0797h hVar = new C0797h(context);
        this.f3095l = hVar;
        this.f3098o.setLayoutManager(hVar);
        this.f3098o.setScrollingTouchSlop(1);
        m4266b(context, attributeSet);
        this.f3098o.setLayoutParams(new LayoutParams(-1, -1));
        this.f3098o.addOnChildAttachStateChangeListener(m4268f());
        C0814e eVar = new C0814e(this);
        this.f3100q = eVar;
        this.f3102s = new C0812c(this, eVar, this.f3098o);
        C0804l lVar = new C0804l();
        this.f3099p = lVar;
        lVar.mo3984a(this.f3098o);
        this.f3098o.addOnScrollListener(this.f3100q);
        C0811b bVar = new C0811b(3);
        this.f3101r = bVar;
        this.f3100q.mo4416a((C0798i) bVar);
        C0791b bVar2 = new C0791b();
        C0792c cVar = new C0792c();
        this.f3101r.mo4409a((C0798i) bVar2);
        this.f3101r.mo4409a((C0798i) cVar);
        this.f3108y.mo4379a(this.f3101r, this.f3098o);
        this.f3101r.mo4409a((C0798i) this.f3091h);
        C0813d dVar = new C0813d(this.f3095l);
        this.f3103t = dVar;
        this.f3101r.mo4409a((C0798i) dVar);
        RecyclerView recyclerView = this.f3098o;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    /* renamed from: a */
    private void m4265a(C0569g<?> gVar) {
        if (gVar != null) {
            gVar.mo3468a(this.f3094k);
        }
    }

    /* renamed from: b */
    private void m4266b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3675a.ViewPager2);
        if (VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, C3675a.ViewPager2, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C3675a.ViewPager2_android_orientation, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    private void m4267b(C0569g<?> gVar) {
        if (gVar != null) {
            gVar.mo3478b(this.f3094k);
        }
    }

    /* renamed from: f */
    private C0586q m4268f() {
        return new C0793d(this);
    }

    /* renamed from: g */
    private void m4269g() {
        if (this.f3096m != -1) {
            C0569g adapter = getAdapter();
            if (adapter != null) {
                Parcelable parcelable = this.f3097n;
                if (parcelable != null) {
                    if (adapter instanceof C0789b) {
                        ((C0789b) adapter).mo4323a(parcelable);
                    }
                    this.f3097n = null;
                }
                int max = Math.max(0, Math.min(this.f3096m, adapter.mo3472b() - 1));
                this.f3092i = max;
                this.f3096m = -1;
                this.f3098o.scrollToPosition(max);
                this.f3108y.mo4389d();
            }
        }
    }

    /* renamed from: a */
    public void mo4342a(int i, boolean z) {
        if (!mo4344a()) {
            mo4345b(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    /* renamed from: a */
    public void mo4343a(C0798i iVar) {
        this.f3091h.mo4409a(iVar);
    }

    /* renamed from: a */
    public boolean mo4344a() {
        return this.f3102s.mo4411a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4345b(int i, boolean z) {
        C0569g adapter = getAdapter();
        if (adapter == null) {
            if (this.f3096m != -1) {
                this.f3096m = Math.max(i, 0);
            }
        } else if (adapter.mo3472b() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.mo3472b() - 1);
            if (min == this.f3092i && this.f3100q.mo4419d()) {
                return;
            }
            if (min != this.f3092i || !z) {
                double d = (double) this.f3092i;
                this.f3092i = min;
                this.f3108y.mo4392g();
                if (!this.f3100q.mo4419d()) {
                    d = this.f3100q.mo4414a();
                }
                this.f3100q.mo4415a(min, z);
                if (!z) {
                    this.f3098o.scrollToPosition(min);
                    return;
                }
                double d2 = (double) min;
                if (Math.abs(d2 - d) > 3.0d) {
                    this.f3098o.scrollToPosition(d2 > d ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.f3098o;
                    recyclerView.post(new C0808o(min, recyclerView));
                } else {
                    this.f3098o.smoothScrollToPosition(min);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4346b(C0798i iVar) {
        this.f3091h.mo4410b(iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4347b() {
        return this.f3095l.mo3605k() == 1;
    }

    /* renamed from: c */
    public boolean mo4348c() {
        return this.f3106w;
    }

    public boolean canScrollHorizontally(int i) {
        return this.f3098o.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.f3098o.canScrollVertically(i);
    }

    /* renamed from: d */
    public void mo4351d() {
        if (this.f3103t.mo4412a() != null) {
            double a = this.f3100q.mo4414a();
            int i = (int) a;
            float f = (float) (a - ((double) i));
            this.f3103t.mo4395a(i, f, Math.round(((float) getPageSize()) * f));
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof C0806n) {
            int i = ((C0806n) parcelable).f3123f;
            sparseArray.put(this.f3098o.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        m4269g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4353e() {
        C0665s sVar = this.f3099p;
        if (sVar != null) {
            View c = sVar.mo3931c(this.f3095l);
            if (c != null) {
                int l = this.f3095l.mo3608l(c);
                if (l != this.f3092i && getScrollState() == 0) {
                    this.f3101r.mo4338b(l);
                }
                this.f3093j = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public CharSequence getAccessibilityClassName() {
        return this.f3108y.mo4381a() ? this.f3108y.mo4388c() : super.getAccessibilityClassName();
    }

    public C0569g getAdapter() {
        return this.f3098o.getAdapter();
    }

    public int getCurrentItem() {
        return this.f3092i;
    }

    public int getItemDecorationCount() {
        return this.f3098o.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f3107x;
    }

    public int getOrientation() {
        return this.f3095l.mo3145J();
    }

    /* access modifiers changed from: 0000 */
    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.f3098o;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f3100q.mo4417b();
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f3108y.mo4377a(accessibilityNodeInfo);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f3098o.getMeasuredWidth();
        int measuredHeight = this.f3098o.getMeasuredHeight();
        this.f3089f.left = getPaddingLeft();
        this.f3089f.right = (i3 - i) - getPaddingRight();
        this.f3089f.top = getPaddingTop();
        this.f3089f.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f3089f, this.f3090g);
        RecyclerView recyclerView = this.f3098o;
        Rect rect = this.f3090g;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f3093j) {
            mo4353e();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        measureChild(this.f3098o, i, i2);
        int measuredWidth = this.f3098o.getMeasuredWidth();
        int measuredHeight = this.f3098o.getMeasuredHeight();
        int measuredState = this.f3098o.getMeasuredState();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(measuredWidth + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0806n)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0806n nVar = (C0806n) parcelable;
        super.onRestoreInstanceState(nVar.getSuperState());
        this.f3096m = nVar.f3124g;
        this.f3097n = nVar.f3125h;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C0806n nVar = new C0806n(super.onSaveInstanceState());
        nVar.f3123f = this.f3098o.getId();
        int i = this.f3096m;
        if (i == -1) {
            i = this.f3092i;
        }
        nVar.f3124g = i;
        Parcelable parcelable = this.f3097n;
        if (parcelable == null) {
            C0569g adapter = this.f3098o.getAdapter();
            if (adapter instanceof C0789b) {
                parcelable = ((C0789b) adapter).mo4322a();
            }
            return nVar;
        }
        nVar.f3125h = parcelable;
        return nVar;
    }

    public void onViewAdded(View view) {
        StringBuilder sb = new StringBuilder();
        sb.append(ViewPager2.class.getSimpleName());
        sb.append(" does not support direct child views");
        throw new IllegalStateException(sb.toString());
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.f3108y.mo4383a(i, bundle) ? this.f3108y.mo4387b(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void setAdapter(C0569g gVar) {
        C0569g adapter = this.f3098o.getAdapter();
        this.f3108y.mo4384b(adapter);
        m4267b(adapter);
        this.f3098o.setAdapter(gVar);
        this.f3092i = 0;
        m4269g();
        this.f3108y.mo4378a(gVar);
        m4265a(gVar);
    }

    public void setCurrentItem(int i) {
        mo4342a(i, true);
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f3108y.mo4391f();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f3107x = i;
            this.f3098o.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f3095l.mo3173k(i);
        this.f3108y.mo4393h();
    }

    public void setPageTransformer(C0803k kVar) {
        boolean z = this.f3105v;
        if (kVar != null) {
            if (!z) {
                this.f3104u = this.f3098o.getItemAnimator();
                this.f3105v = true;
            }
            this.f3098o.setItemAnimator(null);
        } else if (z) {
            this.f3098o.setItemAnimator(this.f3104u);
            this.f3104u = null;
            this.f3105v = false;
        }
        if (kVar != this.f3103t.mo4412a()) {
            this.f3103t.mo4413a(kVar);
            mo4351d();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f3106w = z;
        this.f3108y.mo4394i();
    }
}
