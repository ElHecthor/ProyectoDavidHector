package p147g.p156d.p157a.p185c.p190n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.C2709g;
import com.google.android.material.internal.C2709g.C2711b;
import com.google.android.material.internal.C2714i;
import java.lang.ref.WeakReference;
import p071f.p097h.p108m.C3379v;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4408d;
import p147g.p156d.p157a.p185c.C4413i;
import p147g.p156d.p157a.p185c.C4414j;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p202y.C4459c;
import p147g.p156d.p157a.p185c.p202y.C4460d;

/* renamed from: g.d.a.c.n.a */
public class C4428a extends Drawable implements C2711b {

    /* renamed from: v */
    private static final int f11735v = C4415k.Widget_MaterialComponents_Badge;

    /* renamed from: w */
    private static final int f11736w = C4375b.badgeStyle;

    /* renamed from: f */
    private final WeakReference<Context> f11737f;

    /* renamed from: g */
    private final C4382g f11738g = new C4382g();

    /* renamed from: h */
    private final C2709g f11739h;

    /* renamed from: i */
    private final Rect f11740i = new Rect();

    /* renamed from: j */
    private final float f11741j;

    /* renamed from: k */
    private final float f11742k;

    /* renamed from: l */
    private final float f11743l;

    /* renamed from: m */
    private final C4429a f11744m;

    /* renamed from: n */
    private float f11745n;

    /* renamed from: o */
    private float f11746o;

    /* renamed from: p */
    private int f11747p;

    /* renamed from: q */
    private float f11748q;

    /* renamed from: r */
    private float f11749r;

    /* renamed from: s */
    private float f11750s;

    /* renamed from: t */
    private WeakReference<View> f11751t;

    /* renamed from: u */
    private WeakReference<ViewGroup> f11752u;

    /* renamed from: g.d.a.c.n.a$a */
    public static final class C4429a implements Parcelable {
        public static final Creator<C4429a> CREATOR = new C4430a();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f11753f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f11754g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f11755h = 255;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f11756i = -1;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f11757j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public CharSequence f11758k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f11759l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f11760m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public int f11761n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f11762o;

        /* renamed from: g.d.a.c.n.a$a$a */
        static class C4430a implements Creator<C4429a> {
            C4430a() {
            }

            public C4429a createFromParcel(Parcel parcel) {
                return new C4429a(parcel);
            }

            public C4429a[] newArray(int i) {
                return new C4429a[i];
            }
        }

        public C4429a(Context context) {
            this.f11754g = new C4460d(context, C4415k.TextAppearance_MaterialComponents_Badge).f11803b.getDefaultColor();
            this.f11758k = context.getString(C4414j.mtrl_badge_numberless_content_description);
            this.f11759l = C4413i.mtrl_badge_content_description;
        }

        protected C4429a(Parcel parcel) {
            this.f11753f = parcel.readInt();
            this.f11754g = parcel.readInt();
            this.f11755h = parcel.readInt();
            this.f11756i = parcel.readInt();
            this.f11757j = parcel.readInt();
            this.f11758k = parcel.readString();
            this.f11759l = parcel.readInt();
            this.f11760m = parcel.readInt();
            this.f11761n = parcel.readInt();
            this.f11762o = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f11753f);
            parcel.writeInt(this.f11754g);
            parcel.writeInt(this.f11755h);
            parcel.writeInt(this.f11756i);
            parcel.writeInt(this.f11757j);
            parcel.writeString(this.f11758k.toString());
            parcel.writeInt(this.f11759l);
            parcel.writeInt(this.f11760m);
            parcel.writeInt(this.f11761n);
            parcel.writeInt(this.f11762o);
        }
    }

    private C4428a(Context context) {
        this.f11737f = new WeakReference<>(context);
        C2714i.m11281b(context);
        Resources resources = context.getResources();
        this.f11741j = (float) resources.getDimensionPixelSize(C4408d.mtrl_badge_radius);
        this.f11743l = (float) resources.getDimensionPixelSize(C4408d.mtrl_badge_long_text_horizontal_padding);
        this.f11742k = (float) resources.getDimensionPixelSize(C4408d.mtrl_badge_with_text_radius);
        C2709g gVar = new C2709g(this);
        this.f11739h = gVar;
        gVar.mo8997b().setTextAlign(Align.CENTER);
        this.f11744m = new C4429a(context);
        m18051h(C4415k.TextAppearance_MaterialComponents_Badge);
    }

    /* renamed from: a */
    private static int m18040a(Context context, TypedArray typedArray, int i) {
        return C4459c.m18175a(context, typedArray, i).getDefaultColor();
    }

    /* renamed from: a */
    public static C4428a m18041a(Context context) {
        return m18042a(context, null, f11736w, f11735v);
    }

    /* renamed from: a */
    private static C4428a m18042a(Context context, AttributeSet attributeSet, int i, int i2) {
        C4428a aVar = new C4428a(context);
        aVar.m18048b(context, attributeSet, i, i2);
        return aVar;
    }

    /* renamed from: a */
    static C4428a m18043a(Context context, C4429a aVar) {
        C4428a aVar2 = new C4428a(context);
        aVar2.m18046a(aVar);
        return aVar2;
    }

    /* renamed from: a */
    private void m18044a(Context context, Rect rect, View view) {
        float f;
        int e = this.f11744m.f11760m;
        this.f11746o = (float) ((e == 8388691 || e == 8388693) ? rect.bottom - this.f11744m.f11762o : rect.top + this.f11744m.f11762o);
        if (mo13196d() <= 9) {
            f = !mo13202f() ? this.f11741j : this.f11742k;
            this.f11748q = f;
            this.f11750s = f;
        } else {
            float f2 = this.f11742k;
            this.f11748q = f2;
            this.f11750s = f2;
            f = (this.f11739h.mo8991a(m18049g()) / 2.0f) + this.f11743l;
        }
        this.f11749r = f;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(mo13202f() ? C4408d.mtrl_badge_text_horizontal_edge_offset : C4408d.mtrl_badge_horizontal_edge_offset);
        int e2 = this.f11744m.f11760m;
        this.f11745n = (e2 == 8388659 || e2 == 8388691 ? C3379v.m13829p(view) != 0 : C3379v.m13829p(view) == 0) ? ((((float) rect.right) + this.f11749r) - ((float) dimensionPixelSize)) - ((float) this.f11744m.f11761n) : (((float) rect.left) - this.f11749r) + ((float) dimensionPixelSize) + ((float) this.f11744m.f11761n);
    }

    /* renamed from: a */
    private void m18045a(Canvas canvas) {
        Rect rect = new Rect();
        String g = m18049g();
        this.f11739h.mo8997b().getTextBounds(g, 0, g.length(), rect);
        canvas.drawText(g, this.f11745n, this.f11746o + ((float) (rect.height() / 2)), this.f11739h.mo8997b());
    }

    /* renamed from: a */
    private void m18046a(C4429a aVar) {
        mo13200e(aVar.f11757j);
        if (aVar.f11756i != -1) {
            mo13201f(aVar.f11756i);
        }
        mo13190a(aVar.f11753f);
        mo13195c(aVar.f11754g);
        mo13193b(aVar.f11760m);
        mo13197d(aVar.f11761n);
        mo13203g(aVar.f11762o);
    }

    /* renamed from: a */
    private void m18047a(C4460d dVar) {
        if (this.f11739h.mo8992a() != dVar) {
            Context context = (Context) this.f11737f.get();
            if (context != null) {
                this.f11739h.mo8995a(dVar, context);
                m18050h();
            }
        }
    }

    /* renamed from: b */
    private void m18048b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.Badge, i, i2, new int[0]);
        mo13200e(c.getInt(C4416l.Badge_maxCharacterCount, 4));
        if (c.hasValue(C4416l.Badge_number)) {
            mo13201f(c.getInt(C4416l.Badge_number, 0));
        }
        mo13190a(m18040a(context, c, C4416l.Badge_backgroundColor));
        if (c.hasValue(C4416l.Badge_badgeTextColor)) {
            mo13195c(m18040a(context, c, C4416l.Badge_badgeTextColor));
        }
        mo13193b(c.getInt(C4416l.Badge_badgeGravity, 8388661));
        mo13197d(c.getDimensionPixelOffset(C4416l.Badge_horizontalOffset, 0));
        mo13203g(c.getDimensionPixelOffset(C4416l.Badge_verticalOffset, 0));
        c.recycle();
    }

    /* renamed from: g */
    private String m18049g() {
        if (mo13196d() <= this.f11747p) {
            return Integer.toString(mo13196d());
        }
        Context context = (Context) this.f11737f.get();
        if (context == null) {
            return "";
        }
        return context.getString(C4414j.mtrl_exceed_max_badge_number_suffix, new Object[]{Integer.valueOf(this.f11747p), "+"});
    }

    /* renamed from: h */
    private void m18050h() {
        Context context = (Context) this.f11737f.get();
        WeakReference<View> weakReference = this.f11751t;
        ViewGroup viewGroup = null;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (context != null && view != null) {
            Rect rect = new Rect();
            rect.set(this.f11740i);
            Rect rect2 = new Rect();
            view.getDrawingRect(rect2);
            WeakReference<ViewGroup> weakReference2 = this.f11752u;
            if (weakReference2 != null) {
                viewGroup = (ViewGroup) weakReference2.get();
            }
            if (viewGroup != null || C4431b.f11763a) {
                if (viewGroup == null) {
                    viewGroup = (ViewGroup) view.getParent();
                }
                viewGroup.offsetDescendantRectToMyCoords(view, rect2);
            }
            m18044a(context, rect2, view);
            C4431b.m18087a(this.f11740i, this.f11745n, this.f11746o, this.f11749r, this.f11750s);
            this.f11738g.mo13053a(this.f11748q);
            if (!rect.equals(this.f11740i)) {
                this.f11738g.setBounds(this.f11740i);
            }
        }
    }

    /* renamed from: h */
    private void m18051h(int i) {
        Context context = (Context) this.f11737f.get();
        if (context != null) {
            m18047a(new C4460d(context, i));
        }
    }

    /* renamed from: i */
    private void m18052i() {
        this.f11747p = ((int) Math.pow(10.0d, ((double) mo13194c()) - 1.0d)) - 1;
    }

    /* renamed from: a */
    public void mo8504a() {
        invalidateSelf();
    }

    /* renamed from: a */
    public void mo13190a(int i) {
        this.f11744m.f11753f = i;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (this.f11738g.mo13073f() != valueOf) {
            this.f11738g.mo13059a(valueOf);
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public void mo13191a(View view, ViewGroup viewGroup) {
        this.f11751t = new WeakReference<>(view);
        this.f11752u = new WeakReference<>(viewGroup);
        m18050h();
        invalidateSelf();
    }

    /* renamed from: b */
    public CharSequence mo13192b() {
        if (!isVisible()) {
            return null;
        }
        if (!mo13202f()) {
            return this.f11744m.f11758k;
        }
        if (this.f11744m.f11759l <= 0) {
            return null;
        }
        Context context = (Context) this.f11737f.get();
        if (context == null) {
            return null;
        }
        return context.getResources().getQuantityString(this.f11744m.f11759l, mo13196d(), new Object[]{Integer.valueOf(mo13196d())});
    }

    /* renamed from: b */
    public void mo13193b(int i) {
        if (this.f11744m.f11760m != i) {
            this.f11744m.f11760m = i;
            WeakReference<View> weakReference = this.f11751t;
            if (weakReference != null && weakReference.get() != null) {
                View view = (View) this.f11751t.get();
                WeakReference<ViewGroup> weakReference2 = this.f11752u;
                mo13191a(view, weakReference2 != null ? (ViewGroup) weakReference2.get() : null);
            }
        }
    }

    /* renamed from: c */
    public int mo13194c() {
        return this.f11744m.f11757j;
    }

    /* renamed from: c */
    public void mo13195c(int i) {
        this.f11744m.f11754g = i;
        if (this.f11739h.mo8997b().getColor() != i) {
            this.f11739h.mo8997b().setColor(i);
            invalidateSelf();
        }
    }

    /* renamed from: d */
    public int mo13196d() {
        if (!mo13202f()) {
            return 0;
        }
        return this.f11744m.f11756i;
    }

    /* renamed from: d */
    public void mo13197d(int i) {
        this.f11744m.f11761n = i;
        m18050h();
    }

    public void draw(Canvas canvas) {
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.f11738g.draw(canvas);
            if (mo13202f()) {
                m18045a(canvas);
            }
        }
    }

    /* renamed from: e */
    public C4429a mo13199e() {
        return this.f11744m;
    }

    /* renamed from: e */
    public void mo13200e(int i) {
        if (this.f11744m.f11757j != i) {
            this.f11744m.f11757j = i;
            m18052i();
            this.f11739h.mo8996a(true);
            m18050h();
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public void mo13201f(int i) {
        int max = Math.max(0, i);
        if (this.f11744m.f11756i != max) {
            this.f11744m.f11756i = max;
            this.f11739h.mo8996a(true);
            m18050h();
            invalidateSelf();
        }
    }

    /* renamed from: f */
    public boolean mo13202f() {
        return this.f11744m.f11756i != -1;
    }

    /* renamed from: g */
    public void mo13203g(int i) {
        this.f11744m.f11762o = i;
        m18050h();
    }

    public int getAlpha() {
        return this.f11744m.f11755h;
    }

    public int getIntrinsicHeight() {
        return this.f11740i.height();
    }

    public int getIntrinsicWidth() {
        return this.f11740i.width();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isStateful() {
        return false;
    }

    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void setAlpha(int i) {
        this.f11744m.f11755h = i;
        this.f11739h.mo8997b().setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
