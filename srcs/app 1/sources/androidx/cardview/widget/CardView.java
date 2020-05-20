package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import p071f.p087d.C3157a;
import p071f.p087d.C3158b;
import p071f.p087d.C3160d;
import p071f.p087d.C3161e;

public class CardView extends FrameLayout {

    /* renamed from: m */
    private static final int[] f1274m = {16842801};

    /* renamed from: n */
    private static final C0301e f1275n;

    /* renamed from: f */
    private boolean f1276f;

    /* renamed from: g */
    private boolean f1277g;

    /* renamed from: h */
    int f1278h;

    /* renamed from: i */
    int f1279i;

    /* renamed from: j */
    final Rect f1280j;

    /* renamed from: k */
    final Rect f1281k;

    /* renamed from: l */
    private final C0300d f1282l;

    /* renamed from: androidx.cardview.widget.CardView$a */
    class C0294a implements C0300d {

        /* renamed from: a */
        private Drawable f1283a;

        C0294a() {
        }

        /* renamed from: a */
        public View mo1870a() {
            return CardView.this;
        }

        /* renamed from: a */
        public void mo1871a(int i, int i2) {
            CardView cardView = CardView.this;
            if (i > cardView.f1278h) {
                CardView.super.setMinimumWidth(i);
            }
            CardView cardView2 = CardView.this;
            if (i2 > cardView2.f1279i) {
                CardView.super.setMinimumHeight(i2);
            }
        }

        /* renamed from: a */
        public void mo1872a(int i, int i2, int i3, int i4) {
            CardView.this.f1281k.set(i, i2, i3, i4);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1280j;
            CardView.super.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
        }

        /* renamed from: a */
        public void mo1873a(Drawable drawable) {
            this.f1283a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        /* renamed from: b */
        public boolean mo1874b() {
            return CardView.this.getPreventCornerOverlap();
        }

        /* renamed from: c */
        public boolean mo1875c() {
            return CardView.this.getUseCompatPadding();
        }

        /* renamed from: d */
        public Drawable mo1876d() {
            return this.f1283a;
        }
    }

    static {
        int i = VERSION.SDK_INT;
        C0301e cVar = i >= 21 ? new C0297b() : i >= 17 ? new C0295a() : new C0298c();
        f1275n = cVar;
        f1275n.mo1877a();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3157a.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        Resources resources;
        int i2;
        ColorStateList valueOf;
        super(context, attributeSet, i);
        this.f1280j = new Rect();
        this.f1281k = new Rect();
        this.f1282l = new C0294a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3161e.CardView, i, C3160d.CardView);
        if (obtainStyledAttributes.hasValue(C3161e.CardView_cardBackgroundColor)) {
            valueOf = obtainStyledAttributes.getColorStateList(C3161e.CardView_cardBackgroundColor);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1274m);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i2 = C3158b.cardview_light_background;
            } else {
                resources = getResources();
                i2 = C3158b.cardview_dark_background;
            }
            valueOf = ColorStateList.valueOf(resources.getColor(i2));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(C3161e.CardView_cardCornerRadius, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(C3161e.CardView_cardElevation, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(C3161e.CardView_cardMaxElevation, 0.0f);
        this.f1276f = obtainStyledAttributes.getBoolean(C3161e.CardView_cardUseCompatPadding, false);
        this.f1277g = obtainStyledAttributes.getBoolean(C3161e.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_contentPadding, 0);
        this.f1280j.left = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_contentPaddingLeft, dimensionPixelSize);
        this.f1280j.top = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_contentPaddingTop, dimensionPixelSize);
        this.f1280j.right = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_contentPaddingRight, dimensionPixelSize);
        this.f1280j.bottom = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1278h = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_android_minWidth, 0);
        this.f1279i = obtainStyledAttributes.getDimensionPixelSize(C3161e.CardView_android_minHeight, 0);
        obtainStyledAttributes.recycle();
        f1275n.mo1881a(this.f1282l, context, colorStateList, dimension, dimension2, f);
    }

    /* renamed from: a */
    public void mo1847a(int i, int i2, int i3, int i4) {
        this.f1280j.set(i, i2, i3, i4);
        f1275n.mo1887d(this.f1282l);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1275n.mo1883b(this.f1282l);
    }

    public float getCardElevation() {
        return f1275n.mo1885c(this.f1282l);
    }

    public int getContentPaddingBottom() {
        return this.f1280j.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1280j.left;
    }

    public int getContentPaddingRight() {
        return this.f1280j.right;
    }

    public int getContentPaddingTop() {
        return this.f1280j.top;
    }

    public float getMaxCardElevation() {
        return f1275n.mo1879a(this.f1282l);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1277g;
    }

    public float getRadius() {
        return f1275n.mo1888e(this.f1282l);
    }

    public boolean getUseCompatPadding() {
        return this.f1276f;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!(f1275n instanceof C0297b)) {
            int mode = MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1275n.mo1890g(this.f1282l)), MeasureSpec.getSize(i)), mode);
            }
            int mode2 = MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) f1275n.mo1889f(this.f1282l)), MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f1275n.mo1882a(this.f1282l, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1275n.mo1882a(this.f1282l, colorStateList);
    }

    public void setCardElevation(float f) {
        f1275n.mo1884b(this.f1282l, f);
    }

    public void setMaxCardElevation(float f) {
        f1275n.mo1886c(this.f1282l, f);
    }

    public void setMinimumHeight(int i) {
        this.f1279i = i;
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        this.f1278h = i;
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f1277g) {
            this.f1277g = z;
            f1275n.mo1892i(this.f1282l);
        }
    }

    public void setRadius(float f) {
        f1275n.mo1880a(this.f1282l, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f1276f != z) {
            this.f1276f = z;
            f1275n.mo1891h(this.f1282l);
        }
    }
}
