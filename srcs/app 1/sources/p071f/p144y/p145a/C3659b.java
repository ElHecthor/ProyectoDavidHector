package p071f.p144y.p145a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p071f.p097h.p098e.C3236a;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3343e0;
import p071f.p097h.p108m.C3375r;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p112j.p113a.C3400a;

/* renamed from: f.y.a.b */
public class C3659b extends ViewGroup {

    /* renamed from: k0 */
    static final int[] f10294k0 = {16842931};

    /* renamed from: l0 */
    private static final Comparator<C3665f> f10295l0 = new C3660a();

    /* renamed from: m0 */
    private static final Interpolator f10296m0 = new C3661b();

    /* renamed from: n0 */
    private static final C3674n f10297n0 = new C3674n();

    /* renamed from: A */
    private boolean f10298A;

    /* renamed from: B */
    private int f10299B = 1;

    /* renamed from: C */
    private boolean f10300C;

    /* renamed from: D */
    private boolean f10301D;

    /* renamed from: E */
    private int f10302E;

    /* renamed from: F */
    private int f10303F;

    /* renamed from: G */
    private int f10304G;

    /* renamed from: H */
    private float f10305H;

    /* renamed from: I */
    private float f10306I;

    /* renamed from: J */
    private float f10307J;

    /* renamed from: K */
    private float f10308K;

    /* renamed from: L */
    private int f10309L = -1;

    /* renamed from: M */
    private VelocityTracker f10310M;

    /* renamed from: N */
    private int f10311N;

    /* renamed from: O */
    private int f10312O;

    /* renamed from: P */
    private int f10313P;

    /* renamed from: Q */
    private int f10314Q;

    /* renamed from: R */
    private boolean f10315R;

    /* renamed from: S */
    private EdgeEffect f10316S;

    /* renamed from: T */
    private EdgeEffect f10317T;

    /* renamed from: U */
    private boolean f10318U = true;

    /* renamed from: V */
    private boolean f10319V;

    /* renamed from: W */
    private int f10320W;

    /* renamed from: a0 */
    private List<C3669j> f10321a0;

    /* renamed from: b0 */
    private C3669j f10322b0;

    /* renamed from: c0 */
    private C3669j f10323c0;

    /* renamed from: d0 */
    private List<C3668i> f10324d0;

    /* renamed from: e0 */
    private C3670k f10325e0;

    /* renamed from: f */
    private int f10326f;

    /* renamed from: f0 */
    private int f10327f0;

    /* renamed from: g */
    private final ArrayList<C3665f> f10328g = new ArrayList<>();

    /* renamed from: g0 */
    private int f10329g0;

    /* renamed from: h */
    private final C3665f f10330h = new C3665f();

    /* renamed from: h0 */
    private ArrayList<View> f10331h0;

    /* renamed from: i */
    private final Rect f10332i = new Rect();

    /* renamed from: i0 */
    private final Runnable f10333i0 = new C3662c();

    /* renamed from: j */
    C3658a f10334j;

    /* renamed from: j0 */
    private int f10335j0 = 0;

    /* renamed from: k */
    int f10336k;

    /* renamed from: l */
    private int f10337l = -1;

    /* renamed from: m */
    private Parcelable f10338m = null;

    /* renamed from: n */
    private ClassLoader f10339n = null;

    /* renamed from: o */
    private Scroller f10340o;

    /* renamed from: p */
    private boolean f10341p;

    /* renamed from: q */
    private C3671l f10342q;

    /* renamed from: r */
    private int f10343r;

    /* renamed from: s */
    private Drawable f10344s;

    /* renamed from: t */
    private int f10345t;

    /* renamed from: u */
    private int f10346u;

    /* renamed from: v */
    private float f10347v = -3.4028235E38f;

    /* renamed from: w */
    private float f10348w = Float.MAX_VALUE;

    /* renamed from: x */
    private int f10349x;

    /* renamed from: y */
    private boolean f10350y;

    /* renamed from: z */
    private boolean f10351z;

    /* renamed from: f.y.a.b$a */
    static class C3660a implements Comparator<C3665f> {
        C3660a() {
        }

        /* renamed from: a */
        public int compare(C3665f fVar, C3665f fVar2) {
            return fVar.f10356b - fVar2.f10356b;
        }
    }

    /* renamed from: f.y.a.b$b */
    static class C3661b implements Interpolator {
        C3661b() {
        }

        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: f.y.a.b$c */
    class C3662c implements Runnable {
        C3662c() {
        }

        public void run() {
            C3659b.this.setScrollState(0);
            C3659b.this.mo11612e();
        }
    }

    /* renamed from: f.y.a.b$d */
    class C3663d implements C3375r {

        /* renamed from: a */
        private final Rect f10353a = new Rect();

        C3663d() {
        }

        /* renamed from: a */
        public C3343e0 mo325a(View view, C3343e0 e0Var) {
            C3343e0 b = C3379v.m13802b(view, e0Var);
            if (b.mo10734e()) {
                return b;
            }
            Rect rect = this.f10353a;
            rect.left = b.mo10731b();
            rect.top = b.mo10733d();
            rect.right = b.mo10732c();
            rect.bottom = b.mo10729a();
            int childCount = C3659b.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C3343e0 a = C3379v.m13777a(C3659b.this.getChildAt(i), b);
                rect.left = Math.min(a.mo10731b(), rect.left);
                rect.top = Math.min(a.mo10733d(), rect.top);
                rect.right = Math.min(a.mo10732c(), rect.right);
                rect.bottom = Math.min(a.mo10729a(), rect.bottom);
            }
            return b.mo10730a(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: f.y.a.b$e */
    public @interface C3664e {
    }

    /* renamed from: f.y.a.b$f */
    static class C3665f {

        /* renamed from: a */
        Object f10355a;

        /* renamed from: b */
        int f10356b;

        /* renamed from: c */
        boolean f10357c;

        /* renamed from: d */
        float f10358d;

        /* renamed from: e */
        float f10359e;

        C3665f() {
        }
    }

    /* renamed from: f.y.a.b$g */
    public static class C3666g extends LayoutParams {

        /* renamed from: a */
        public boolean f10360a;

        /* renamed from: b */
        public int f10361b;

        /* renamed from: c */
        float f10362c = 0.0f;

        /* renamed from: d */
        boolean f10363d;

        /* renamed from: e */
        int f10364e;

        /* renamed from: f */
        int f10365f;

        public C3666g() {
            super(-1, -1);
        }

        public C3666g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3659b.f10294k0);
            this.f10361b = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: f.y.a.b$h */
    class C3667h extends C3323a {
        C3667h() {
        }

        /* renamed from: b */
        private boolean m14937b() {
            C3658a aVar = C3659b.this.f10334j;
            return aVar != null && aVar.mo9887a() > 1;
        }

        /* renamed from: a */
        public void mo2349a(View view, C3347c cVar) {
            super.mo2349a(view, cVar);
            cVar.mo10745a((CharSequence) C3659b.class.getName());
            cVar.mo10784k(m14937b());
            if (C3659b.this.canScrollHorizontally(1)) {
                cVar.mo10740a(4096);
            }
            if (C3659b.this.canScrollHorizontally(-1)) {
                cVar.mo10740a(8192);
            }
        }

        /* renamed from: a */
        public boolean mo2350a(View view, int i, Bundle bundle) {
            C3659b bVar;
            int i2;
            if (super.mo2350a(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !C3659b.this.canScrollHorizontally(-1)) {
                    return false;
                }
                bVar = C3659b.this;
                i2 = bVar.f10336k - 1;
            } else if (!C3659b.this.canScrollHorizontally(1)) {
                return false;
            } else {
                bVar = C3659b.this;
                i2 = bVar.f10336k + 1;
            }
            bVar.setCurrentItem(i2);
            return true;
        }

        /* renamed from: b */
        public void mo2351b(View view, AccessibilityEvent accessibilityEvent) {
            super.mo2351b(view, accessibilityEvent);
            accessibilityEvent.setClassName(C3659b.class.getName());
            accessibilityEvent.setScrollable(m14937b());
            if (accessibilityEvent.getEventType() == 4096) {
                C3658a aVar = C3659b.this.f10334j;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.mo9887a());
                    accessibilityEvent.setFromIndex(C3659b.this.f10336k);
                    accessibilityEvent.setToIndex(C3659b.this.f10336k);
                }
            }
        }
    }

    /* renamed from: f.y.a.b$i */
    public interface C3668i {
        /* renamed from: a */
        void mo9107a(C3659b bVar, C3658a aVar, C3658a aVar2);
    }

    /* renamed from: f.y.a.b$j */
    public interface C3669j {
        /* renamed from: a */
        void mo9144a(int i);

        /* renamed from: a */
        void mo9145a(int i, float f, int i2);

        /* renamed from: b */
        void mo9146b(int i);
    }

    /* renamed from: f.y.a.b$k */
    public interface C3670k {
        /* renamed from: a */
        void mo11642a(View view, float f);
    }

    /* renamed from: f.y.a.b$l */
    private class C3671l extends DataSetObserver {
        C3671l() {
        }

        public void onChanged() {
            C3659b.this.mo11583a();
        }

        public void onInvalidated() {
            C3659b.this.mo11583a();
        }
    }

    /* renamed from: f.y.a.b$m */
    public static class C3672m extends C3400a {
        public static final Creator<C3672m> CREATOR = new C3673a();

        /* renamed from: h */
        int f10368h;

        /* renamed from: i */
        Parcelable f10369i;

        /* renamed from: j */
        ClassLoader f10370j;

        /* renamed from: f.y.a.b$m$a */
        static class C3673a implements ClassLoaderCreator<C3672m> {
            C3673a() {
            }

            public C3672m createFromParcel(Parcel parcel) {
                return new C3672m(parcel, null);
            }

            public C3672m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C3672m(parcel, classLoader);
            }

            public C3672m[] newArray(int i) {
                return new C3672m[i];
            }
        }

        C3672m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = C3672m.class.getClassLoader();
            }
            this.f10368h = parcel.readInt();
            this.f10369i = parcel.readParcelable(classLoader);
            this.f10370j = classLoader;
        }

        public C3672m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("FragmentPager.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" position=");
            sb.append(this.f10368h);
            sb.append("}");
            return sb.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10368h);
            parcel.writeParcelable(this.f10369i, i);
        }
    }

    /* renamed from: f.y.a.b$n */
    static class C3674n implements Comparator<View> {
        C3674n() {
        }

        /* renamed from: a */
        public int compare(View view, View view2) {
            C3666g gVar = (C3666g) view.getLayoutParams();
            C3666g gVar2 = (C3666g) view2.getLayoutParams();
            boolean z = gVar.f10360a;
            if (z == gVar2.f10360a) {
                return gVar.f10364e - gVar2.f10364e;
            }
            return z ? 1 : -1;
        }
    }

    public C3659b(Context context) {
        super(context);
        mo11599b();
    }

    public C3659b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo11599b();
    }

    /* renamed from: a */
    private int m14891a(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.f10313P || Math.abs(i2) <= this.f10311N) {
            i += (int) (f + (i >= this.f10336k ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.f10328g.size() <= 0) {
            return i;
        }
        C3665f fVar = (C3665f) this.f10328g.get(0);
        ArrayList<C3665f> arrayList = this.f10328g;
        return Math.max(fVar.f10356b, Math.min(i, ((C3665f) arrayList.get(arrayList.size() - 1)).f10356b));
    }

    /* renamed from: a */
    private Rect m14892a(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    /* renamed from: a */
    private void m14893a(int i, int i2, int i3, int i4) {
        int min;
        if (i2 <= 0 || this.f10328g.isEmpty()) {
            C3665f b = mo11597b(this.f10336k);
            min = (int) ((b != null ? Math.min(b.f10359e, this.f10348w) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                m14897a(false);
            } else {
                return;
            }
        } else if (!this.f10340o.isFinished()) {
            this.f10340o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            min = (int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3)));
        }
        scrollTo(min, getScrollY());
    }

    /* renamed from: a */
    private void m14894a(int i, boolean z, int i2, boolean z2) {
        C3665f b = mo11597b(i);
        int clientWidth = b != null ? (int) (((float) getClientWidth()) * Math.max(this.f10347v, Math.min(b.f10359e, this.f10348w))) : 0;
        if (z) {
            mo11585a(clientWidth, 0, i2);
            if (z2) {
                m14904d(i);
                return;
            }
            return;
        }
        if (z2) {
            m14904d(i);
        }
        m14897a(false);
        scrollTo(clientWidth, 0);
        m14907f(clientWidth);
    }

    /* renamed from: a */
    private void m14895a(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f10309L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f10305H = motionEvent.getX(i);
            this.f10309L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f10310M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    /* renamed from: a */
    private void m14896a(C3665f fVar, int i, C3665f fVar2) {
        int i2;
        int i3;
        C3665f fVar3;
        C3665f fVar4;
        int a = this.f10334j.mo9887a();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.f10343r) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f10356b;
            int i5 = fVar.f10356b;
            if (i4 < i5) {
                int i6 = 0;
                float f2 = fVar2.f10359e + fVar2.f10358d + f;
                while (true) {
                    i4++;
                    if (i4 > fVar.f10356b || i6 >= this.f10328g.size()) {
                        break;
                    }
                    while (true) {
                        fVar4 = (C3665f) this.f10328g.get(i6);
                        if (i4 > fVar4.f10356b && i6 < this.f10328g.size() - 1) {
                            i6++;
                        }
                    }
                    while (i4 < fVar4.f10356b) {
                        f2 += this.f10334j.mo11574b(i4) + f;
                        i4++;
                    }
                    fVar4.f10359e = f2;
                    f2 += fVar4.f10358d + f;
                }
            } else if (i4 > i5) {
                int size = this.f10328g.size() - 1;
                float f3 = fVar2.f10359e;
                while (true) {
                    int i7 = i4 - 1;
                    if (i7 < fVar.f10356b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = (C3665f) this.f10328g.get(size);
                        if (i7 < fVar3.f10356b && size > 0) {
                            size--;
                        }
                    }
                    while (i4 > fVar3.f10356b) {
                        f3 -= this.f10334j.mo11574b(i4) + f;
                        i7 = i4 - 1;
                    }
                    f3 -= fVar3.f10358d + f;
                    fVar3.f10359e = f3;
                }
            }
        }
        int size2 = this.f10328g.size();
        float f4 = fVar.f10359e;
        int i8 = fVar.f10356b;
        int i9 = i8 - 1;
        this.f10347v = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = a - 1;
        this.f10348w = fVar.f10356b == i10 ? (fVar.f10359e + fVar.f10358d) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C3665f fVar5 = (C3665f) this.f10328g.get(i11);
            while (true) {
                i3 = fVar5.f10356b;
                if (i9 <= i3) {
                    break;
                }
                f4 -= this.f10334j.mo11574b(i9) + f;
                i9--;
            }
            f4 -= fVar5.f10358d + f;
            fVar5.f10359e = f4;
            if (i3 == 0) {
                this.f10347v = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f10359e + fVar.f10358d + f;
        int i12 = fVar.f10356b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C3665f fVar6 = (C3665f) this.f10328g.get(i13);
            while (true) {
                i2 = fVar6.f10356b;
                if (i12 >= i2) {
                    break;
                }
                f5 += this.f10334j.mo11574b(i12) + f;
                i12++;
            }
            if (i2 == i10) {
                this.f10348w = (fVar6.f10358d + f5) - 1.0f;
            }
            fVar6.f10359e = f5;
            f5 += fVar6.f10358d + f;
            i13++;
            i12++;
        }
    }

    /* renamed from: a */
    private void m14897a(boolean z) {
        boolean z2 = this.f10335j0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.f10340o.isFinished()) {
                this.f10340o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f10340o.getCurrX();
                int currY = this.f10340o.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        m14907f(currX);
                    }
                }
            }
        }
        this.f10298A = false;
        for (int i = 0; i < this.f10328g.size(); i++) {
            C3665f fVar = (C3665f) this.f10328g.get(i);
            if (fVar.f10357c) {
                fVar.f10357c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            C3379v.m13794a((View) this, this.f10333i0);
        } else {
            this.f10333i0.run();
        }
    }

    /* renamed from: a */
    private boolean m14898a(float f, float f2) {
        return (f < ((float) this.f10303F) && f2 > 0.0f) || (f > ((float) (getWidth() - this.f10303F)) && f2 < 0.0f);
    }

    /* renamed from: b */
    private void m14899b(int i, float f, int i2) {
        C3669j jVar = this.f10322b0;
        if (jVar != null) {
            jVar.mo9145a(i, f, i2);
        }
        List<C3669j> list = this.f10321a0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C3669j jVar2 = (C3669j) this.f10321a0.get(i3);
                if (jVar2 != null) {
                    jVar2.mo9145a(i, f, i2);
                }
            }
        }
        C3669j jVar3 = this.f10323c0;
        if (jVar3 != null) {
            jVar3.mo9145a(i, f, i2);
        }
    }

    /* renamed from: b */
    private void m14900b(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.f10327f0 : 0, null);
        }
    }

    /* renamed from: b */
    private boolean m14901b(float f) {
        boolean z;
        boolean z2;
        float f2 = this.f10305H - f;
        this.f10305H = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.f10347v * clientWidth;
        float f4 = this.f10348w * clientWidth;
        boolean z3 = false;
        C3665f fVar = (C3665f) this.f10328g.get(0);
        ArrayList<C3665f> arrayList = this.f10328g;
        C3665f fVar2 = (C3665f) arrayList.get(arrayList.size() - 1);
        if (fVar.f10356b != 0) {
            f3 = fVar.f10359e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f10356b != this.f10334j.mo9887a() - 1) {
            f4 = fVar2.f10359e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.f10316S.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.f10317T.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.f10305H += scrollX - ((float) i);
        scrollTo(i, getScrollY());
        m14907f(i);
        return z3;
    }

    /* renamed from: c */
    private void m14902c(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* renamed from: c */
    private static boolean m14903c(View view) {
        return view.getClass().getAnnotation(C3664e.class) != null;
    }

    /* renamed from: d */
    private void m14904d(int i) {
        C3669j jVar = this.f10322b0;
        if (jVar != null) {
            jVar.mo9146b(i);
        }
        List<C3669j> list = this.f10321a0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3669j jVar2 = (C3669j) this.f10321a0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo9146b(i);
                }
            }
        }
        C3669j jVar3 = this.f10323c0;
        if (jVar3 != null) {
            jVar3.mo9146b(i);
        }
    }

    /* renamed from: e */
    private void m14905e(int i) {
        C3669j jVar = this.f10322b0;
        if (jVar != null) {
            jVar.mo9144a(i);
        }
        List<C3669j> list = this.f10321a0;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3669j jVar2 = (C3669j) this.f10321a0.get(i2);
                if (jVar2 != null) {
                    jVar2.mo9144a(i);
                }
            }
        }
        C3669j jVar3 = this.f10323c0;
        if (jVar3 != null) {
            jVar3.mo9144a(i);
        }
    }

    /* renamed from: f */
    private void mo9877f() {
        this.f10300C = false;
        this.f10301D = false;
        VelocityTracker velocityTracker = this.f10310M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f10310M = null;
        }
    }

    /* renamed from: f */
    private boolean m14907f(int i) {
        String str = "onPageScrolled did not call superclass implementation";
        if (this.f10328g.size() != 0) {
            C3665f g = m14908g();
            int clientWidth = getClientWidth();
            int i2 = this.f10343r;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            float f2 = ((float) i2) / f;
            int i4 = g.f10356b;
            float f3 = ((((float) i) / f) - g.f10359e) / (g.f10358d + f2);
            int i5 = (int) (((float) i3) * f3);
            this.f10319V = false;
            mo11584a(i4, f3, i5);
            if (this.f10319V) {
                return true;
            }
            throw new IllegalStateException(str);
        } else if (this.f10318U) {
            return false;
        } else {
            this.f10319V = false;
            mo11584a(0, 0.0f, 0);
            if (this.f10319V) {
                return false;
            }
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: g */
    private C3665f m14908g() {
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.f10343r) / ((float) clientWidth) : 0.0f;
        C3665f fVar = null;
        float f3 = 0.0f;
        int i = -1;
        int i2 = 0;
        boolean z = true;
        while (i2 < this.f10328g.size()) {
            C3665f fVar2 = (C3665f) this.f10328g.get(i2);
            if (!z) {
                int i3 = i + 1;
                if (fVar2.f10356b != i3) {
                    fVar2 = this.f10330h;
                    fVar2.f10359e = f + f3 + f2;
                    fVar2.f10356b = i3;
                    fVar2.f10358d = this.f10334j.mo11574b(i3);
                    i2--;
                }
            }
            f = fVar2.f10359e;
            float f4 = fVar2.f10358d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i2 == this.f10328g.size() - 1) {
                return fVar2;
            }
            i = fVar2.f10356b;
            f3 = fVar2.f10358d;
            i2++;
            fVar = fVar2;
            z = false;
        }
        return fVar;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* renamed from: h */
    private void m14909h() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((C3666g) getChildAt(i).getLayoutParams()).f10360a) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    /* renamed from: i */
    private boolean m14910i() {
        this.f10309L = -1;
        mo9877f();
        this.f10316S.onRelease();
        this.f10317T.onRelease();
        return this.f10316S.isFinished() || this.f10317T.isFinished();
    }

    /* renamed from: j */
    private void m14911j() {
        if (this.f10329g0 != 0) {
            ArrayList<View> arrayList = this.f10331h0;
            if (arrayList == null) {
                this.f10331h0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f10331h0.add(getChildAt(i));
            }
            Collections.sort(this.f10331h0, f10297n0);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.f10351z != z) {
            this.f10351z = z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo11580a(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3665f mo11581a(int i, int i2) {
        C3665f fVar = new C3665f();
        fVar.f10356b = i;
        fVar.f10355a = this.f10334j.mo9889a((ViewGroup) this, i);
        fVar.f10358d = this.f10334j.mo11574b(i);
        if (i2 < 0 || i2 >= this.f10328g.size()) {
            this.f10328g.add(fVar);
        } else {
            this.f10328g.add(i2, fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3665f mo11582a(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return mo11598b(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11583a() {
        int a = this.f10334j.mo9887a();
        this.f10326f = a;
        boolean z = this.f10328g.size() < (this.f10299B * 2) + 1 && this.f10328g.size() < a;
        int i = this.f10336k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.f10328g.size()) {
            C3665f fVar = (C3665f) this.f10328g.get(i2);
            int a2 = this.f10334j.mo9888a(fVar.f10355a);
            if (a2 != -1) {
                if (a2 == -2) {
                    this.f10328g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.f10334j.mo11577b((ViewGroup) this);
                        z2 = true;
                    }
                    this.f10334j.mo9891a((ViewGroup) this, fVar.f10356b, fVar.f10355a);
                    int i3 = this.f10336k;
                    if (i3 == fVar.f10356b) {
                        i = Math.max(0, Math.min(i3, a - 1));
                    }
                } else {
                    int i4 = fVar.f10356b;
                    if (i4 != a2) {
                        if (i4 == this.f10336k) {
                            i = a2;
                        }
                        fVar.f10356b = a2;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.f10334j.mo11573a((ViewGroup) this);
        }
        Collections.sort(this.f10328g, f10295l0);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                C3666g gVar = (C3666g) getChildAt(i5).getLayoutParams();
                if (!gVar.f10360a) {
                    gVar.f10362c = 0.0f;
                }
            }
            mo11587a(i, false, true);
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11584a(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.f10320W
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = 0
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            f.y.a.b$g r9 = (p071f.p144y.p145a.C3659b.C3666g) r9
            boolean r10 = r9.f10360a
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.f10361b
            r9 = r9 & 7
            if (r9 == r2) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.m14899b(r13, r14, r15)
            f.y.a.b$k r13 = r12.f10325e0
            if (r13 == 0) goto L_0x009f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L_0x007a:
            if (r1 >= r14) goto L_0x009f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            f.y.a.b$g r0 = (p071f.p144y.p145a.C3659b.C3666g) r0
            boolean r0 = r0.f10360a
            if (r0 == 0) goto L_0x008b
            goto L_0x009c
        L_0x008b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            f.y.a.b$k r3 = r12.f10325e0
            r3.mo11642a(r15, r0)
        L_0x009c:
            int r1 = r1 + 1
            goto L_0x007a
        L_0x009f:
            r12.f10319V = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.mo11584a(int, float, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11585a(int i, int i2, int i3) {
        int i4;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f10340o;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.f10341p ? this.f10340o.getCurrX() : this.f10340o.getStartX();
            this.f10340o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i5 = i4;
        int scrollY = getScrollY();
        int i6 = i - i5;
        int i7 = i2 - scrollY;
        if (i6 == 0 && i7 == 0) {
            m14897a(false);
            mo11612e();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i8;
        float a = f2 + (mo11580a(Math.min(1.0f, (((float) Math.abs(i6)) * 1.0f) / f)) * f2);
        int abs = Math.abs(i3);
        int min = Math.min(abs > 0 ? Math.round(Math.abs(a / ((float) abs)) * 1000.0f) * 4 : (int) (((((float) Math.abs(i6)) / ((f * this.f10334j.mo11574b(this.f10336k)) + ((float) this.f10343r))) + 1.0f) * 100.0f), 600);
        this.f10341p = false;
        this.f10340o.startScroll(i5, scrollY, i6, i7, min);
        C3379v.m13772H(this);
    }

    /* renamed from: a */
    public void mo11586a(int i, boolean z) {
        this.f10298A = false;
        mo11587a(i, z, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11587a(int i, boolean z, boolean z2) {
        mo11588a(i, z, z2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo11588a(int i, boolean z, boolean z2, int i2) {
        C3658a aVar = this.f10334j;
        boolean z3 = false;
        if (aVar == null || aVar.mo9887a() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.f10336k != i || this.f10328g.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.f10334j.mo9887a()) {
                i = this.f10334j.mo9887a() - 1;
            }
            int i3 = this.f10299B;
            int i4 = this.f10336k;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.f10328g.size(); i5++) {
                    ((C3665f) this.f10328g.get(i5)).f10357c = true;
                }
            }
            if (this.f10336k != i) {
                z3 = true;
            }
            if (this.f10318U) {
                this.f10336k = i;
                if (z3) {
                    m14904d(i);
                }
                requestLayout();
            } else {
                mo11602c(i);
                m14894a(i, z, i2, z3);
            }
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    /* renamed from: a */
    public void mo11589a(C3668i iVar) {
        if (this.f10324d0 == null) {
            this.f10324d0 = new ArrayList();
        }
        this.f10324d0.add(iVar);
    }

    /* renamed from: a */
    public void mo11590a(C3669j jVar) {
        if (this.f10321a0 == null) {
            this.f10321a0 = new ArrayList();
        }
        this.f10321a0.add(jVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo11591a(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000b
        L_0x0009:
            r0 = r3
            goto L_0x0069
        L_0x000b:
            if (r0 == 0) goto L_0x0069
            android.view.ViewParent r4 = r0.getParent()
        L_0x0011:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001e
            if (r4 != r6) goto L_0x0019
            r4 = 1
            goto L_0x001f
        L_0x0019:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0011
        L_0x001e:
            r4 = 0
        L_0x001f:
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0035:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0035
        L_0x004e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.append(r5)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L_0x0009
        L_0x0069:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x009a
            android.graphics.Rect r1 = r6.f10332i
            android.graphics.Rect r1 = r6.m14892a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f10332i
            android.graphics.Rect r2 = r6.m14892a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 < r2) goto L_0x0094
            boolean r0 = r6.mo11603c()
            goto L_0x0098
        L_0x0094:
            boolean r0 = r3.requestFocus()
        L_0x0098:
            r2 = r0
            goto L_0x00c8
        L_0x009a:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.f10332i
            android.graphics.Rect r1 = r6.m14892a(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.f10332i
            android.graphics.Rect r2 = r6.m14892a(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x0094
            if (r1 > r2) goto L_0x0094
            boolean r0 = r6.mo11607d()
            goto L_0x0098
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.mo11607d()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.mo11603c()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.mo11591a(int):boolean");
    }

    /* renamed from: a */
    public boolean mo11592a(KeyEvent keyEvent) {
        int i;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return mo11591a(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return mo11591a(1);
                        }
                    }
                } else if (keyEvent.hasModifiers(2)) {
                    return mo11607d();
                } else {
                    i = 66;
                }
            } else if (keyEvent.hasModifiers(2)) {
                return mo11603c();
            } else {
                i = 17;
            }
            return mo11591a(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo11593a(View view, boolean z, int i, int i2, int i3) {
        View view2 = view;
        boolean z2 = true;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i4 = i2 + scrollX;
                if (i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                    int i5 = i3 + scrollY;
                    if (i5 >= childAt.getTop() && i5 < childAt.getBottom()) {
                        if (mo11593a(childAt, true, i, i4 - childAt.getLeft(), i5 - childAt.getTop())) {
                            return true;
                        }
                    }
                }
            }
        }
        if (!z || !view.canScrollHorizontally(-i)) {
            z2 = false;
        }
        return z2;
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    C3665f b = mo11598b(childAt);
                    if (b != null && b.f10356b == this.f10336k) {
                        childAt.addFocusables(arrayList, i, i2);
                    }
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if (((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) && arrayList != null) {
            arrayList.add(this);
        }
    }

    public void addTouchables(ArrayList<View> arrayList) {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C3665f b = mo11598b(childAt);
                if (b != null && b.f10356b == this.f10336k) {
                    childAt.addTouchables(arrayList);
                }
            }
        }
    }

    public void addView(View view, int i, LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        C3666g gVar = (C3666g) layoutParams;
        boolean c = gVar.f10360a | m14903c(view);
        gVar.f10360a = c;
        if (!this.f10350y) {
            super.addView(view, i, layoutParams);
        } else if (gVar == null || !c) {
            gVar.f10363d = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3665f mo11597b(int i) {
        for (int i2 = 0; i2 < this.f10328g.size(); i2++) {
            C3665f fVar = (C3665f) this.f10328g.get(i2);
            if (fVar.f10356b == i) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C3665f mo11598b(View view) {
        for (int i = 0; i < this.f10328g.size(); i++) {
            C3665f fVar = (C3665f) this.f10328g.get(i);
            if (this.f10334j.mo9893a(view, fVar.f10355a)) {
                return fVar;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo11599b() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f10340o = new Scroller(context, f10296m0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.f10304G = viewConfiguration.getScaledPagingTouchSlop();
        this.f10311N = (int) (400.0f * f);
        this.f10312O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f10316S = new EdgeEffect(context);
        this.f10317T = new EdgeEffect(context);
        this.f10313P = (int) (25.0f * f);
        this.f10314Q = (int) (2.0f * f);
        this.f10302E = (int) (f * 16.0f);
        C3379v.m13788a((View) this, (C3323a) new C3667h());
        if (C3379v.m13827n(this) == 0) {
            C3379v.m13820h(this, 1);
        }
        C3379v.m13792a((View) this, (C3375r) new C3663d());
    }

    /* renamed from: b */
    public void mo11600b(C3668i iVar) {
        List<C3668i> list = this.f10324d0;
        if (list != null) {
            list.remove(iVar);
        }
    }

    /* renamed from: b */
    public void mo11601b(C3669j jVar) {
        List<C3669j> list = this.f10321a0;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0060, code lost:
        if (r9 == r10) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c0, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ce, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r10 >= 0) goto L_0x00de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00e7, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x013c, code lost:
        if (r4 < r0.f10328g.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0147, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x015a, code lost:
        if (r4 < r0.f10328g.size()) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x016c, code lost:
        if (r4 < r0.f10328g.size()) goto L_0x013e;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11602c(int r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.f10336k
            if (r2 == r1) goto L_0x000f
            f.y.a.b$f r2 = r0.mo11597b(r2)
            r0.f10336k = r1
            goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            f.y.a.a r1 = r0.f10334j
            if (r1 != 0) goto L_0x0018
            r17.m14911j()
            return
        L_0x0018:
            boolean r1 = r0.f10298A
            if (r1 == 0) goto L_0x0020
            r17.m14911j()
            return
        L_0x0020:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            f.y.a.a r1 = r0.f10334j
            r1.mo11577b(r0)
            int r1 = r0.f10299B
            int r4 = r0.f10336k
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            f.y.a.a r6 = r0.f10334j
            int r6 = r6.mo9887a()
            int r7 = r6 + -1
            int r8 = r0.f10336k
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.f10326f
            if (r6 != r7) goto L_0x01ef
            r7 = 0
        L_0x004a:
            java.util.ArrayList<f.y.a.b$f> r8 = r0.f10328g
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0066
            java.util.ArrayList<f.y.a.b$f> r8 = r0.f10328g
            java.lang.Object r8 = r8.get(r7)
            f.y.a.b$f r8 = (p071f.p144y.p145a.C3659b.C3665f) r8
            int r9 = r8.f10356b
            int r10 = r0.f10336k
            if (r9 < r10) goto L_0x0063
            if (r9 != r10) goto L_0x0066
            goto L_0x0067
        L_0x0063:
            int r7 = r7 + 1
            goto L_0x004a
        L_0x0066:
            r8 = 0
        L_0x0067:
            if (r8 != 0) goto L_0x0071
            if (r6 <= 0) goto L_0x0071
            int r8 = r0.f10336k
            f.y.a.b$f r8 = r0.mo11581a(r8, r7)
        L_0x0071:
            r9 = 0
            if (r8 == 0) goto L_0x017c
            int r10 = r7 + -1
            if (r10 < 0) goto L_0x0081
            java.util.ArrayList<f.y.a.b$f> r11 = r0.f10328g
            java.lang.Object r11 = r11.get(r10)
            f.y.a.b$f r11 = (p071f.p144y.p145a.C3659b.C3665f) r11
            goto L_0x0082
        L_0x0081:
            r11 = 0
        L_0x0082:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L_0x008c
            r14 = 0
            goto L_0x0098
        L_0x008c:
            float r14 = r8.f10358d
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L_0x0098:
            int r3 = r0.f10336k
            int r3 = r3 + -1
            r15 = 0
        L_0x009d:
            if (r3 < 0) goto L_0x00ed
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x00c3
            if (r3 >= r4) goto L_0x00c3
            if (r11 != 0) goto L_0x00a8
            goto L_0x00ed
        L_0x00a8:
            int r5 = r11.f10356b
            if (r3 != r5) goto L_0x00e9
            boolean r5 = r11.f10357c
            if (r5 != 0) goto L_0x00e9
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            r5.remove(r10)
            f.y.a.a r5 = r0.f10334j
            java.lang.Object r11 = r11.f10355a
            r5.mo9891a(r0, r3, r11)
            int r10 = r10 + -1
            int r7 = r7 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00c3:
            if (r11 == 0) goto L_0x00d1
            int r5 = r11.f10356b
            if (r3 != r5) goto L_0x00d1
            float r5 = r11.f10358d
            float r15 = r15 + r5
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00e7
            goto L_0x00de
        L_0x00d1:
            int r5 = r10 + 1
            f.y.a.b$f r5 = r0.mo11581a(r3, r5)
            float r5 = r5.f10358d
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto L_0x00e7
        L_0x00de:
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            java.lang.Object r5 = r5.get(r10)
            f.y.a.b$f r5 = (p071f.p144y.p145a.C3659b.C3665f) r5
            goto L_0x00e8
        L_0x00e7:
            r5 = 0
        L_0x00e8:
            r11 = r5
        L_0x00e9:
            int r3 = r3 + -1
            r5 = 0
            goto L_0x009d
        L_0x00ed:
            float r3 = r8.f10358d
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L_0x0170
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0106
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            java.lang.Object r5 = r5.get(r4)
            f.y.a.b$f r5 = (p071f.p144y.p145a.C3659b.C3665f) r5
            goto L_0x0107
        L_0x0106:
            r5 = 0
        L_0x0107:
            if (r12 > 0) goto L_0x010b
            r10 = 0
            goto L_0x0113
        L_0x010b:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L_0x0113:
            int r11 = r0.f10336k
        L_0x0115:
            int r11 = r11 + 1
            if (r11 >= r6) goto L_0x0170
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L_0x0149
            if (r11 <= r1) goto L_0x0149
            if (r5 != 0) goto L_0x0122
            goto L_0x0170
        L_0x0122:
            int r12 = r5.f10356b
            if (r11 != r12) goto L_0x016f
            boolean r12 = r5.f10357c
            if (r12 != 0) goto L_0x016f
            java.util.ArrayList<f.y.a.b$f> r12 = r0.f10328g
            r12.remove(r4)
            f.y.a.a r12 = r0.f10334j
            java.lang.Object r5 = r5.f10355a
            r12.mo9891a(r0, r11, r5)
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
        L_0x013e:
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            java.lang.Object r5 = r5.get(r4)
            f.y.a.b$f r5 = (p071f.p144y.p145a.C3659b.C3665f) r5
            goto L_0x016f
        L_0x0147:
            r5 = 0
            goto L_0x016f
        L_0x0149:
            if (r5 == 0) goto L_0x015d
            int r12 = r5.f10356b
            if (r11 != r12) goto L_0x015d
            float r5 = r5.f10358d
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x015d:
            f.y.a.b$f r5 = r0.mo11581a(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.f10358d
            float r3 = r3 + r5
            java.util.ArrayList<f.y.a.b$f> r5 = r0.f10328g
            int r5 = r5.size()
            if (r4 >= r5) goto L_0x0147
            goto L_0x013e
        L_0x016f:
            goto L_0x0115
        L_0x0170:
            r0.m14896a(r8, r7, r2)
            f.y.a.a r1 = r0.f10334j
            int r2 = r0.f10336k
            java.lang.Object r3 = r8.f10355a
            r1.mo11578b(r0, r2, r3)
        L_0x017c:
            f.y.a.a r1 = r0.f10334j
            r1.mo11573a(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L_0x0186:
            if (r2 >= r1) goto L_0x01af
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            f.y.a.b$g r4 = (p071f.p144y.p145a.C3659b.C3666g) r4
            r4.f10365f = r2
            boolean r5 = r4.f10360a
            if (r5 != 0) goto L_0x01ac
            float r5 = r4.f10362c
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x01ac
            f.y.a.b$f r3 = r0.mo11598b(r3)
            if (r3 == 0) goto L_0x01ac
            float r5 = r3.f10358d
            r4.f10362c = r5
            int r3 = r3.f10356b
            r4.f10364e = r3
        L_0x01ac:
            int r2 = r2 + 1
            goto L_0x0186
        L_0x01af:
            r17.m14911j()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L_0x01ee
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L_0x01c3
            f.y.a.b$f r3 = r0.mo11582a(r1)
            goto L_0x01c4
        L_0x01c3:
            r3 = 0
        L_0x01c4:
            if (r3 == 0) goto L_0x01cc
            int r1 = r3.f10356b
            int r2 = r0.f10336k
            if (r1 == r2) goto L_0x01ee
        L_0x01cc:
            r5 = 0
        L_0x01cd:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L_0x01ee
            android.view.View r1 = r0.getChildAt(r5)
            f.y.a.b$f r2 = r0.mo11598b(r1)
            if (r2 == 0) goto L_0x01eb
            int r2 = r2.f10356b
            int r3 = r0.f10336k
            if (r2 != r3) goto L_0x01eb
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L_0x01eb
            goto L_0x01ee
        L_0x01eb:
            int r5 = r5 + 1
            goto L_0x01cd
        L_0x01ee:
            return
        L_0x01ef:
            android.content.res.Resources r1 = r17.getResources()     // Catch:{ NotFoundException -> 0x01fc }
            int r2 = r17.getId()     // Catch:{ NotFoundException -> 0x01fc }
            java.lang.String r1 = r1.getResourceName(r2)     // Catch:{ NotFoundException -> 0x01fc }
            goto L_0x0204
        L_0x01fc:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L_0x0204:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.append(r4)
            int r4 = r0.f10326f
            r3.append(r4)
            java.lang.String r4 = ", found: "
            r3.append(r4)
            r3.append(r6)
            java.lang.String r4 = " Pager id: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " Pager class: "
            r3.append(r1)
            java.lang.Class r1 = r17.getClass()
            r3.append(r1)
            java.lang.String r1 = " Problematic adapter: "
            r3.append(r1)
            f.y.a.a r1 = r0.f10334j
            java.lang.Class r1 = r1.getClass()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.mo11602c(int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo11603c() {
        int i = this.f10336k;
        if (i <= 0) {
            return false;
        }
        mo11586a(i - 1, true);
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        boolean z = false;
        if (this.f10334j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX > ((int) (((float) clientWidth) * this.f10347v))) {
                z = true;
            }
            return z;
        }
        if (i > 0 && scrollX < ((int) (((float) clientWidth) * this.f10348w))) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(LayoutParams layoutParams) {
        return (layoutParams instanceof C3666g) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        this.f10341p = true;
        if (this.f10340o.isFinished() || !this.f10340o.computeScrollOffset()) {
            m14897a(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f10340o.getCurrX();
        int currY = this.f10340o.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!m14907f(currX)) {
                this.f10340o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        C3379v.m13772H(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo11607d() {
        C3658a aVar = this.f10334j;
        if (aVar == null || this.f10336k >= aVar.mo9887a() - 1) {
            return false;
        }
        mo11586a(this.f10336k + 1, true);
        return true;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || mo11592a(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                C3665f b = mo11598b(childAt);
                if (b != null && b.f10356b == this.f10336k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r0.mo9887a() > 1) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L_0x0024
            r2 = 1
            if (r0 != r2) goto L_0x0018
            f.y.a.a r0 = r7.f10334j
            if (r0 == 0) goto L_0x0018
            int r0 = r0.mo9887a()
            if (r0 <= r2) goto L_0x0018
            goto L_0x0024
        L_0x0018:
            android.widget.EdgeEffect r8 = r7.f10316S
            r8.finish()
            android.widget.EdgeEffect r8 = r7.f10317T
            r8.finish()
            goto L_0x00a9
        L_0x0024:
            android.widget.EdgeEffect r0 = r7.f10316S
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x0065
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.f10347v
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f10316S
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.f10316S
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x0065:
            android.widget.EdgeEffect r0 = r7.f10317T
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L_0x00a9
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.f10348w
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.f10317T
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.f10317T
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L_0x00a9:
            if (r1 == 0) goto L_0x00ae
            p071f.p097h.p108m.C3379v.m13772H(r7)
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.draw(android.graphics.Canvas):void");
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10344s;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo11612e() {
        mo11602c(this.f10336k);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new C3666g();
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C3666g(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C3658a getAdapter() {
        return this.f10334j;
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        if (this.f10329g0 == 2) {
            i2 = (i - 1) - i2;
        }
        return ((C3666g) ((View) this.f10331h0.get(i2)).getLayoutParams()).f10365f;
    }

    public int getCurrentItem() {
        return this.f10336k;
    }

    public int getOffscreenPageLimit() {
        return this.f10299B;
    }

    public int getPageMargin() {
        return this.f10343r;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10318U = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f10333i0);
        Scroller scroller = this.f10340o;
        if (scroller != null && !scroller.isFinished()) {
            this.f10340o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.f10343r > 0 && this.f10344s != null && this.f10328g.size() > 0 && this.f10334j != null) {
            int scrollX = getScrollX();
            int width = getWidth();
            float f3 = (float) width;
            float f4 = ((float) this.f10343r) / f3;
            int i = 0;
            C3665f fVar = (C3665f) this.f10328g.get(0);
            float f5 = fVar.f10359e;
            int size = this.f10328g.size();
            int i2 = fVar.f10356b;
            int i3 = ((C3665f) this.f10328g.get(size - 1)).f10356b;
            while (i2 < i3) {
                while (i2 > fVar.f10356b && i < size) {
                    i++;
                    fVar = (C3665f) this.f10328g.get(i);
                }
                if (i2 == fVar.f10356b) {
                    float f6 = fVar.f10359e;
                    float f7 = fVar.f10358d;
                    f = (f6 + f7) * f3;
                    f5 = f6 + f7 + f4;
                } else {
                    float b = this.f10334j.mo11574b(i2);
                    f = (f5 + b) * f3;
                    f5 += b + f4;
                }
                if (((float) this.f10343r) + f > ((float) scrollX)) {
                    f2 = f4;
                    this.f10344s.setBounds(Math.round(f), this.f10345t, Math.round(((float) this.f10343r) + f), this.f10346u);
                    this.f10344s.draw(canvas);
                } else {
                    Canvas canvas2 = canvas;
                    f2 = f4;
                }
                if (f <= ((float) (scrollX + width))) {
                    i2++;
                    f4 = f2;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            m14910i();
            return false;
        }
        if (action != 0) {
            if (this.f10300C) {
                return true;
            }
            if (this.f10301D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.f10307J = x;
            this.f10305H = x;
            float y = motionEvent.getY();
            this.f10308K = y;
            this.f10306I = y;
            this.f10309L = motionEvent2.getPointerId(0);
            this.f10301D = false;
            this.f10341p = true;
            this.f10340o.computeScrollOffset();
            if (this.f10335j0 != 2 || Math.abs(this.f10340o.getFinalX() - this.f10340o.getCurrX()) <= this.f10314Q) {
                m14897a(false);
                this.f10300C = false;
            } else {
                this.f10340o.abortAnimation();
                this.f10298A = false;
                mo11612e();
                this.f10300C = true;
                m14902c(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.f10309L;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.f10305H;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.f10308K);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !m14898a(this.f10305H, f)) {
                    if (mo11593a(this, false, (int) f, (int) x2, (int) y2)) {
                        this.f10305H = x2;
                        this.f10306I = y2;
                        this.f10301D = true;
                        return false;
                    }
                }
                if (abs > ((float) this.f10304G) && abs * 0.5f > abs2) {
                    this.f10300C = true;
                    m14902c(true);
                    setScrollState(1);
                    float f2 = this.f10307J;
                    float f3 = (float) this.f10304G;
                    this.f10305H = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.f10306I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) this.f10304G)) {
                    this.f10301D = true;
                }
                if (this.f10300C && m14901b(x2)) {
                    C3379v.m13772H(this);
                }
            }
        } else if (action == 6) {
            m14895a(motionEvent);
        }
        if (this.f10310M == null) {
            this.f10310M = VelocityTracker.obtain();
        }
        this.f10310M.addMovement(motionEvent2);
        return this.f10300C;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            f.y.a.b$g r12 = (p071f.p144y.p145a.C3659b.C3666g) r12
            boolean r14 = r12.f10360a
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.f10361b
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            f.y.a.b$g r9 = (p071f.p144y.p145a.C3659b.C3666g) r9
            boolean r10 = r9.f10360a
            if (r10 != 0) goto L_0x0105
            f.y.a.b$f r10 = r0.mo11598b(r8)
            if (r10 == 0) goto L_0x0105
            float r13 = (float) r2
            float r10 = r10.f10359e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.f10363d
            if (r14 == 0) goto L_0x00f8
            r14 = 0
            r9.f10363d = r14
            float r9 = r9.f10362c
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0105:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0108:
            r0.f10345t = r5
            int r3 = r3 - r7
            r0.f10346u = r3
            r0.f10320W = r11
            boolean r1 = r0.f10318U
            if (r1 == 0) goto L_0x011a
            int r1 = r0.f10336k
            r2 = 0
            r0.m14894a(r1, r2, r2, r2)
            goto L_0x011b
        L_0x011a:
            r2 = 0
        L_0x011b:
            r0.f10318U = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            r0 = 0
            int r14 = android.view.ViewGroup.getDefaultSize(r0, r14)
            int r15 = android.view.ViewGroup.getDefaultSize(r0, r15)
            r13.setMeasuredDimension(r14, r15)
            int r14 = r13.getMeasuredWidth()
            int r15 = r14 / 10
            int r1 = r13.f10302E
            int r15 = java.lang.Math.min(r15, r1)
            r13.f10303F = r15
            int r15 = r13.getPaddingLeft()
            int r14 = r14 - r15
            int r15 = r13.getPaddingRight()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredHeight()
            int r1 = r13.getPaddingTop()
            int r15 = r15 - r1
            int r1 = r13.getPaddingBottom()
            int r15 = r15 - r1
            int r1 = r13.getChildCount()
            r2 = 0
        L_0x0037:
            r3 = 8
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r2 >= r1) goto L_0x00b2
            android.view.View r6 = r13.getChildAt(r2)
            int r7 = r6.getVisibility()
            if (r7 == r3) goto L_0x00af
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            f.y.a.b$g r3 = (p071f.p144y.p145a.C3659b.C3666g) r3
            if (r3 == 0) goto L_0x00af
            boolean r7 = r3.f10360a
            if (r7 == 0) goto L_0x00af
            int r7 = r3.f10361b
            r8 = r7 & 7
            r7 = r7 & 112(0x70, float:1.57E-43)
            r9 = 48
            if (r7 == r9) goto L_0x0065
            r9 = 80
            if (r7 != r9) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r7 = 0
            goto L_0x0066
        L_0x0065:
            r7 = 1
        L_0x0066:
            r9 = 3
            if (r8 == r9) goto L_0x006e
            r9 = 5
            if (r8 != r9) goto L_0x006d
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r7 == 0) goto L_0x0075
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x007a
        L_0x0075:
            if (r4 == 0) goto L_0x007a
            r9 = 1073741824(0x40000000, float:2.0)
            goto L_0x007c
        L_0x007a:
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x007c:
            int r10 = r3.width
            r11 = -1
            r12 = -2
            if (r10 == r12) goto L_0x0089
            if (r10 == r11) goto L_0x0085
            goto L_0x0086
        L_0x0085:
            r10 = r14
        L_0x0086:
            r8 = 1073741824(0x40000000, float:2.0)
            goto L_0x008a
        L_0x0089:
            r10 = r14
        L_0x008a:
            int r3 = r3.height
            if (r3 == r12) goto L_0x0093
            if (r3 == r11) goto L_0x0091
            goto L_0x0095
        L_0x0091:
            r3 = r15
            goto L_0x0095
        L_0x0093:
            r3 = r15
            r5 = r9
        L_0x0095:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r8)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r5)
            r6.measure(r8, r3)
            if (r7 == 0) goto L_0x00a8
            int r3 = r6.getMeasuredHeight()
            int r15 = r15 - r3
            goto L_0x00af
        L_0x00a8:
            if (r4 == 0) goto L_0x00af
            int r3 = r6.getMeasuredWidth()
            int r14 = r14 - r3
        L_0x00af:
            int r2 = r2 + 1
            goto L_0x0037
        L_0x00b2:
            android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            int r15 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r5)
            r13.f10349x = r15
            r13.f10350y = r4
            r13.mo11612e()
            r13.f10350y = r0
            int r15 = r13.getChildCount()
        L_0x00c6:
            if (r0 >= r15) goto L_0x00f0
            android.view.View r1 = r13.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 == r3) goto L_0x00ed
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            f.y.a.b$g r2 = (p071f.p144y.p145a.C3659b.C3666g) r2
            if (r2 == 0) goto L_0x00de
            boolean r4 = r2.f10360a
            if (r4 != 0) goto L_0x00ed
        L_0x00de:
            float r4 = (float) r14
            float r2 = r2.f10362c
            float r4 = r4 * r2
            int r2 = (int) r4
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r4 = r13.f10349x
            r1.measure(r2, r4)
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x00c6
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.onMeasure(int, int):void");
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0) {
                C3665f b = mo11598b(childAt);
                if (b != null && b.f10356b == this.f10336k && childAt.requestFocus(i, rect)) {
                    return true;
                }
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C3672m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C3672m mVar = (C3672m) parcelable;
        super.onRestoreInstanceState(mVar.mo10880a());
        C3658a aVar = this.f10334j;
        if (aVar != null) {
            aVar.mo9890a(mVar.f10369i, mVar.f10370j);
            mo11587a(mVar.f10368h, false, true);
        } else {
            this.f10337l = mVar.f10368h;
            this.f10338m = mVar.f10369i;
            this.f10339n = mVar.f10370j;
        }
    }

    public Parcelable onSaveInstanceState() {
        C3672m mVar = new C3672m(super.onSaveInstanceState());
        mVar.f10368h = this.f10336k;
        C3658a aVar = this.f10334j;
        if (aVar != null) {
            mVar.f10369i = aVar.mo9894b();
        }
        return mVar;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.f10343r;
            m14893a(i, i3, i5, i5);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0151  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.f10315R
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L_0x0014
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L_0x0014
            return r2
        L_0x0014:
            f.y.a.a r0 = r7.f10334j
            if (r0 == 0) goto L_0x0155
            int r0 = r0.mo9887a()
            if (r0 != 0) goto L_0x0020
            goto L_0x0155
        L_0x0020:
            android.view.VelocityTracker r0 = r7.f10310M
            if (r0 != 0) goto L_0x002a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.f10310M = r0
        L_0x002a:
            android.view.VelocityTracker r0 = r7.f10310M
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x012f
            if (r0 == r1) goto L_0x00e2
            r3 = 2
            if (r0 == r3) goto L_0x0073
            r3 = 3
            if (r0 == r3) goto L_0x0068
            r3 = 5
            if (r0 == r3) goto L_0x0058
            r3 = 6
            if (r0 == r3) goto L_0x0047
            goto L_0x014f
        L_0x0047:
            r7.m14895a(r8)
            int r0 = r7.f10309L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.f10305H = r8
            goto L_0x014f
        L_0x0058:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.f10305H = r3
            int r8 = r8.getPointerId(r0)
            goto L_0x014d
        L_0x0068:
            boolean r8 = r7.f10300C
            if (r8 == 0) goto L_0x014f
            int r8 = r7.f10336k
            r7.m14894a(r8, r1, r2, r2)
            goto L_0x012a
        L_0x0073:
            boolean r0 = r7.f10300C
            if (r0 != 0) goto L_0x00ce
            int r0 = r7.f10309L
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L_0x0082
            goto L_0x012a
        L_0x0082:
            float r3 = r8.getX(r0)
            float r4 = r7.f10305H
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.f10306I
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.f10304G
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ce
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00ce
            r7.f10300C = r1
            r7.m14902c(r1)
            float r4 = r7.f10307J
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x00b7
            int r3 = r7.f10304G
            float r3 = (float) r3
            float r4 = r4 + r3
            goto L_0x00bb
        L_0x00b7:
            int r3 = r7.f10304G
            float r3 = (float) r3
            float r4 = r4 - r3
        L_0x00bb:
            r7.f10305H = r4
            r7.f10306I = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto L_0x00ce
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x00ce:
            boolean r0 = r7.f10300C
            if (r0 == 0) goto L_0x014f
            int r0 = r7.f10309L
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.m14901b(r8)
            r2 = r2 | r8
            goto L_0x014f
        L_0x00e2:
            boolean r0 = r7.f10300C
            if (r0 == 0) goto L_0x014f
            android.view.VelocityTracker r0 = r7.f10310M
            r2 = 1000(0x3e8, float:1.401E-42)
            int r3 = r7.f10312O
            float r3 = (float) r3
            r0.computeCurrentVelocity(r2, r3)
            int r2 = r7.f10309L
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.f10298A = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            f.y.a.b$f r4 = r7.m14908g()
            int r5 = r7.f10343r
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.f10356b
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.f10359e
            float r3 = r3 - r2
            float r2 = r4.f10358d
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.f10309L
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.f10307J
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.m14891a(r6, r3, r0, r8)
            r7.mo11588a(r8, r1, r1, r0)
        L_0x012a:
            boolean r2 = r7.m14910i()
            goto L_0x014f
        L_0x012f:
            android.widget.Scroller r0 = r7.f10340o
            r0.abortAnimation()
            r7.f10298A = r2
            r7.mo11612e()
            float r0 = r8.getX()
            r7.f10307J = r0
            r7.f10305H = r0
            float r0 = r8.getY()
            r7.f10308K = r0
            r7.f10306I = r0
            int r8 = r8.getPointerId(r2)
        L_0x014d:
            r7.f10309L = r8
        L_0x014f:
            if (r2 == 0) goto L_0x0154
            p071f.p097h.p108m.C3379v.m13772H(r7)
        L_0x0154:
            return r1
        L_0x0155:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p144y.p145a.C3659b.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void removeView(View view) {
        if (this.f10350y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C3658a aVar) {
        C3658a aVar2 = this.f10334j;
        if (aVar2 != null) {
            aVar2.mo11575b((DataSetObserver) null);
            this.f10334j.mo11577b((ViewGroup) this);
            for (int i = 0; i < this.f10328g.size(); i++) {
                C3665f fVar = (C3665f) this.f10328g.get(i);
                this.f10334j.mo9891a((ViewGroup) this, fVar.f10356b, fVar.f10355a);
            }
            this.f10334j.mo11573a((ViewGroup) this);
            this.f10328g.clear();
            m14909h();
            this.f10336k = 0;
            scrollTo(0, 0);
        }
        C3658a aVar3 = this.f10334j;
        this.f10334j = aVar;
        this.f10326f = 0;
        if (aVar != null) {
            if (this.f10342q == null) {
                this.f10342q = new C3671l();
            }
            this.f10334j.mo11575b((DataSetObserver) this.f10342q);
            this.f10298A = false;
            boolean z = this.f10318U;
            this.f10318U = true;
            this.f10326f = this.f10334j.mo9887a();
            if (this.f10337l >= 0) {
                this.f10334j.mo9890a(this.f10338m, this.f10339n);
                mo11587a(this.f10337l, false, true);
                this.f10337l = -1;
                this.f10338m = null;
                this.f10339n = null;
            } else if (!z) {
                mo11612e();
            } else {
                requestLayout();
            }
        }
        List<C3668i> list = this.f10324d0;
        if (list != null && !list.isEmpty()) {
            int size = this.f10324d0.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C3668i) this.f10324d0.get(i2)).mo9107a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.f10298A = false;
        mo11587a(i, !this.f10318U, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Requested offscreen page limit ");
            sb.append(i);
            sb.append(" too small; defaulting to ");
            sb.append(1);
            Log.w("ViewPager", sb.toString());
            i = 1;
        }
        if (i != this.f10299B) {
            this.f10299B = i;
            mo11612e();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3669j jVar) {
        this.f10322b0 = jVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.f10343r;
        this.f10343r = i;
        int width = getWidth();
        m14893a(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C3236a.m13271c(getContext(), i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.f10344s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i) {
        if (this.f10335j0 != i) {
            this.f10335j0 = i;
            if (this.f10325e0 != null) {
                m14900b(i != 0);
            }
            m14905e(i);
        }
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f10344s;
    }
}
