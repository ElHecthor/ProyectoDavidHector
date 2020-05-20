package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0371a;
import androidx.core.widget.C0391i;
import p071f.p072a.C3093a;
import p071f.p072a.C3102j;
import p071f.p072a.p073k.p074a.C3103a;
import p071f.p072a.p078n.C3122a;
import p071f.p097h.p108m.C3379v;

/* renamed from: androidx.appcompat.widget.n0 */
public class C0251n0 extends CompoundButton {

    /* renamed from: S */
    private static final Property<C0251n0, Float> f1090S = new C0252a(Float.class, "thumbPos");

    /* renamed from: T */
    private static final int[] f1091T = {16842912};

    /* renamed from: A */
    private VelocityTracker f1092A;

    /* renamed from: B */
    private int f1093B;

    /* renamed from: C */
    float f1094C;

    /* renamed from: D */
    private int f1095D;

    /* renamed from: E */
    private int f1096E;

    /* renamed from: F */
    private int f1097F;

    /* renamed from: G */
    private int f1098G;

    /* renamed from: H */
    private int f1099H;

    /* renamed from: I */
    private int f1100I;

    /* renamed from: J */
    private int f1101J;

    /* renamed from: K */
    private final TextPaint f1102K;

    /* renamed from: L */
    private ColorStateList f1103L;

    /* renamed from: M */
    private Layout f1104M;

    /* renamed from: N */
    private Layout f1105N;

    /* renamed from: O */
    private TransformationMethod f1106O;

    /* renamed from: P */
    ObjectAnimator f1107P;

    /* renamed from: Q */
    private final C0280v f1108Q;

    /* renamed from: R */
    private final Rect f1109R;

    /* renamed from: f */
    private Drawable f1110f;

    /* renamed from: g */
    private ColorStateList f1111g;

    /* renamed from: h */
    private Mode f1112h;

    /* renamed from: i */
    private boolean f1113i;

    /* renamed from: j */
    private boolean f1114j;

    /* renamed from: k */
    private Drawable f1115k;

    /* renamed from: l */
    private ColorStateList f1116l;

    /* renamed from: m */
    private Mode f1117m;

    /* renamed from: n */
    private boolean f1118n;

    /* renamed from: o */
    private boolean f1119o;

    /* renamed from: p */
    private int f1120p;

    /* renamed from: q */
    private int f1121q;

    /* renamed from: r */
    private int f1122r;

    /* renamed from: s */
    private boolean f1123s;

    /* renamed from: t */
    private CharSequence f1124t;

    /* renamed from: u */
    private CharSequence f1125u;

    /* renamed from: v */
    private boolean f1126v;

    /* renamed from: w */
    private int f1127w;

    /* renamed from: x */
    private int f1128x;

    /* renamed from: y */
    private float f1129y;

    /* renamed from: z */
    private float f1130z;

    /* renamed from: androidx.appcompat.widget.n0$a */
    static class C0252a extends Property<C0251n0, Float> {
        C0252a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(C0251n0 n0Var) {
            return Float.valueOf(n0Var.f1094C);
        }

        /* renamed from: a */
        public void set(C0251n0 n0Var, Float f) {
            n0Var.setThumbPosition(f.floatValue());
        }
    }

    public C0251n0(Context context) {
        this(context, null);
    }

    public C0251n0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C3093a.switchStyle);
    }

    public C0251n0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1111g = null;
        this.f1112h = null;
        this.f1113i = false;
        this.f1114j = false;
        this.f1116l = null;
        this.f1117m = null;
        this.f1118n = false;
        this.f1119o = false;
        this.f1092A = VelocityTracker.obtain();
        this.f1109R = new Rect();
        this.f1102K = new TextPaint(1);
        Resources resources = getResources();
        this.f1102K.density = resources.getDisplayMetrics().density;
        C0275t0 a = C0275t0.m1311a(context, attributeSet, C3102j.SwitchCompat, i, 0);
        Drawable b = a.mo1741b(C3102j.SwitchCompat_android_thumb);
        this.f1110f = b;
        if (b != null) {
            b.setCallback(this);
        }
        Drawable b2 = a.mo1741b(C3102j.SwitchCompat_track);
        this.f1115k = b2;
        if (b2 != null) {
            b2.setCallback(this);
        }
        this.f1124t = a.mo1747e(C3102j.SwitchCompat_android_textOn);
        this.f1125u = a.mo1747e(C3102j.SwitchCompat_android_textOff);
        this.f1126v = a.mo1738a(C3102j.SwitchCompat_showText, true);
        this.f1120p = a.mo1742c(C3102j.SwitchCompat_thumbTextPadding, 0);
        this.f1121q = a.mo1742c(C3102j.SwitchCompat_switchMinWidth, 0);
        this.f1122r = a.mo1742c(C3102j.SwitchCompat_switchPadding, 0);
        this.f1123s = a.mo1738a(C3102j.SwitchCompat_splitTrack, false);
        ColorStateList a2 = a.mo1735a(C3102j.SwitchCompat_thumbTint);
        if (a2 != null) {
            this.f1111g = a2;
            this.f1113i = true;
        }
        Mode a3 = C0189a0.m975a(a.mo1744d(C3102j.SwitchCompat_thumbTintMode, -1), null);
        if (this.f1112h != a3) {
            this.f1112h = a3;
            this.f1114j = true;
        }
        if (this.f1113i || this.f1114j) {
            m1239a();
        }
        ColorStateList a4 = a.mo1735a(C3102j.SwitchCompat_trackTint);
        if (a4 != null) {
            this.f1116l = a4;
            this.f1118n = true;
        }
        Mode a5 = C0189a0.m975a(a.mo1744d(C3102j.SwitchCompat_trackTintMode, -1), null);
        if (this.f1117m != a5) {
            this.f1117m = a5;
            this.f1119o = true;
        }
        if (this.f1118n || this.f1119o) {
            m1244b();
        }
        int g = a.mo1750g(C3102j.SwitchCompat_switchTextAppearance, 0);
        if (g != 0) {
            mo1590a(context, g);
        }
        C0280v vVar = new C0280v(this);
        this.f1108Q = vVar;
        vVar.mo1801a(attributeSet, i);
        a.mo1737a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1128x = viewConfiguration.getScaledTouchSlop();
        this.f1093B = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    private static float m1237a(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    /* renamed from: a */
    private Layout m1238a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1106O;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        TextPaint textPaint = this.f1102K;
        StaticLayout staticLayout = new StaticLayout(charSequence2, textPaint, charSequence2 != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence2, textPaint)) : 0, Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
        return staticLayout;
    }

    /* renamed from: a */
    private void m1239a() {
        if (this.f1110f == null) {
            return;
        }
        if (this.f1113i || this.f1114j) {
            Drawable mutate = C0371a.m1913i(this.f1110f).mutate();
            this.f1110f = mutate;
            if (this.f1113i) {
                C0371a.m1898a(mutate, this.f1111g);
            }
            if (this.f1114j) {
                C0371a.m1901a(this.f1110f, this.f1112h);
            }
            if (this.f1110f.isStateful()) {
                this.f1110f.setState(getDrawableState());
            }
        }
    }

    /* renamed from: a */
    private void m1240a(int i, int i2) {
        Typeface typeface = i != 1 ? i != 2 ? i != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
        mo1591a(typeface, i2);
    }

    /* renamed from: a */
    private void m1241a(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* renamed from: a */
    private void m1242a(boolean z) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1090S, new float[]{z ? 1.0f : 0.0f});
        this.f1107P = ofFloat;
        ofFloat.setDuration(250);
        if (VERSION.SDK_INT >= 18) {
            this.f1107P.setAutoCancel(true);
        }
        this.f1107P.start();
    }

    /* renamed from: a */
    private boolean m1243a(float f, float f2) {
        boolean z = false;
        if (this.f1110f == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f1110f.getPadding(this.f1109R);
        int i = this.f1099H;
        int i2 = this.f1128x;
        int i3 = i - i2;
        int i4 = (this.f1098G + thumbOffset) - i2;
        int i5 = this.f1097F + i4;
        Rect rect = this.f1109R;
        int i6 = i5 + rect.left + rect.right + i2;
        int i7 = this.f1101J + i2;
        if (f > ((float) i4) && f < ((float) i6) && f2 > ((float) i3) && f2 < ((float) i7)) {
            z = true;
        }
        return z;
    }

    /* renamed from: b */
    private void m1244b() {
        if (this.f1115k == null) {
            return;
        }
        if (this.f1118n || this.f1119o) {
            Drawable mutate = C0371a.m1913i(this.f1115k).mutate();
            this.f1115k = mutate;
            if (this.f1118n) {
                C0371a.m1898a(mutate, this.f1116l);
            }
            if (this.f1119o) {
                C0371a.m1901a(this.f1115k, this.f1117m);
            }
            if (this.f1115k.isStateful()) {
                this.f1115k.setState(getDrawableState());
            }
        }
    }

    /* renamed from: b */
    private void m1245b(MotionEvent motionEvent) {
        this.f1127w = 0;
        boolean z = true;
        boolean z2 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z2) {
            this.f1092A.computeCurrentVelocity(1000);
            float xVelocity = this.f1092A.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.f1093B)) {
                z = getTargetCheckedState();
            } else if (!C0293z0.m1487a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z = false;
            }
        } else {
            z = isChecked;
        }
        if (z != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z);
        m1241a(motionEvent);
    }

    /* renamed from: c */
    private void m1246c() {
        ObjectAnimator objectAnimator = this.f1107P;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private boolean getTargetCheckedState() {
        return this.f1094C > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((C0293z0.m1487a(this) ? 1.0f - this.f1094C : this.f1094C) * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f1115k;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f1109R;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f1110f;
        Rect d = drawable2 != null ? C0189a0.m979d(drawable2) : C0189a0.f869c;
        return ((((this.f1095D - this.f1097F) - rect.left) - rect.right) - d.left) - d.right;
    }

    /* renamed from: a */
    public void mo1590a(Context context, int i) {
        C0275t0 a = C0275t0.m1309a(context, i, C3102j.TextAppearance);
        ColorStateList a2 = a.mo1735a(C3102j.TextAppearance_android_textColor);
        if (a2 == null) {
            a2 = getTextColors();
        }
        this.f1103L = a2;
        int c = a.mo1742c(C3102j.TextAppearance_android_textSize, 0);
        if (c != 0) {
            float f = (float) c;
            if (f != this.f1102K.getTextSize()) {
                this.f1102K.setTextSize(f);
                requestLayout();
            }
        }
        m1240a(a.mo1744d(C3102j.TextAppearance_android_typeface, -1), a.mo1744d(C3102j.TextAppearance_android_textStyle, -1));
        this.f1106O = a.mo1738a(C3102j.TextAppearance_textAllCaps, false) ? new C3122a(getContext()) : null;
        a.mo1737a();
    }

    /* renamed from: a */
    public void mo1591a(Typeface typeface, int i) {
        float f = 0.0f;
        boolean z = false;
        if (i > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i) : Typeface.create(typeface, i);
            setSwitchTypeface(defaultFromStyle);
            int i2 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i;
            TextPaint textPaint = this.f1102K;
            if ((i2 & 1) != 0) {
                z = true;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f1102K;
            if ((i2 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f1102K.setFakeBoldText(false);
        this.f1102K.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void draw(Canvas canvas) {
        int i;
        int i2;
        Rect rect = this.f1109R;
        int i3 = this.f1098G;
        int i4 = this.f1099H;
        int i5 = this.f1100I;
        int i6 = this.f1101J;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f1110f;
        Rect d = drawable != null ? C0189a0.m979d(drawable) : C0189a0.f869c;
        Drawable drawable2 = this.f1115k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i7 = rect.left;
            thumbOffset += i7;
            if (d != null) {
                int i8 = d.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = d.top;
                int i10 = rect.top;
                i = i9 > i10 ? (i9 - i10) + i4 : i4;
                int i11 = d.right;
                int i12 = rect.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = d.bottom;
                int i14 = rect.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f1115k.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f1115k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1110f;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i15 = thumbOffset - rect.left;
            int i16 = thumbOffset + this.f1097F + rect.right;
            this.f1110f.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                C0371a.m1897a(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f, f2);
        }
        Drawable drawable = this.f1110f;
        if (drawable != null) {
            C0371a.m1896a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1115k;
        if (drawable2 != null) {
            C0371a.m1896a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1110f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1115k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!C0293z0.m1487a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1095D;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingLeft += this.f1122r;
        }
        return compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (C0293z0.m1487a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1095D;
        if (!TextUtils.isEmpty(getText())) {
            compoundPaddingRight += this.f1122r;
        }
        return compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f1126v;
    }

    public boolean getSplitTrack() {
        return this.f1123s;
    }

    public int getSwitchMinWidth() {
        return this.f1121q;
    }

    public int getSwitchPadding() {
        return this.f1122r;
    }

    public CharSequence getTextOff() {
        return this.f1125u;
    }

    public CharSequence getTextOn() {
        return this.f1124t;
    }

    public Drawable getThumbDrawable() {
        return this.f1110f;
    }

    public int getThumbTextPadding() {
        return this.f1120p;
    }

    public ColorStateList getThumbTintList() {
        return this.f1111g;
    }

    public Mode getThumbTintMode() {
        return this.f1112h;
    }

    public Drawable getTrackDrawable() {
        return this.f1115k;
    }

    public ColorStateList getTrackTintList() {
        return this.f1116l;
    }

    public Mode getTrackTintMode() {
        return this.f1117m;
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1110f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1115k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1107P;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1107P.end();
            this.f1107P = null;
        }
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, f1091T);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1109R;
        Drawable drawable = this.f1115k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1099H + rect.top;
        int i3 = this.f1101J - rect.bottom;
        Drawable drawable2 = this.f1110f;
        if (drawable != null) {
            if (!this.f1123s || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d = C0189a0.m979d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d.left;
                rect.right -= d.right;
                int save = canvas.save();
                canvas.clipRect(rect, Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f1104M : this.f1105N;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1103L;
            if (colorStateList != null) {
                this.f1102K.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1102K.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i2 + i3) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f1124t : this.f1125u;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        super.onLayout(z, i, i2, i3, i4);
        int i11 = 0;
        if (this.f1110f != null) {
            Rect rect = this.f1109R;
            Drawable drawable = this.f1115k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d = C0189a0.m979d(this.f1110f);
            i5 = Math.max(0, d.left - rect.left);
            i11 = Math.max(0, d.right - rect.right);
        } else {
            i5 = 0;
        }
        if (C0293z0.m1487a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1095D + i7) - i5) - i11;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i11;
            i7 = (i6 - this.f1095D) + i5 + i11;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i10 = this.f1096E;
            i9 = paddingTop - (i10 / 2);
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i10 = this.f1096E;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1096E;
            this.f1098G = i7;
            this.f1099H = i9;
            this.f1101J = i8;
            this.f1100I = i6;
        }
        i8 = i10 + i9;
        this.f1098G = i7;
        this.f1099H = i9;
        this.f1101J = i8;
        this.f1100I = i6;
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        if (this.f1126v) {
            if (this.f1104M == null) {
                this.f1104M = m1238a(this.f1124t);
            }
            if (this.f1105N == null) {
                this.f1105N = m1238a(this.f1125u);
            }
        }
        Rect rect = this.f1109R;
        Drawable drawable = this.f1110f;
        int i5 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1110f.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1110f.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        this.f1097F = Math.max(this.f1126v ? Math.max(this.f1104M.getWidth(), this.f1105N.getWidth()) + (this.f1120p * 2) : 0, i4);
        Drawable drawable2 = this.f1115k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i5 = this.f1115k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i6 = rect.left;
        int i7 = rect.right;
        Drawable drawable3 = this.f1110f;
        if (drawable3 != null) {
            Rect d = C0189a0.m979d(drawable3);
            i6 = Math.max(i6, d.left);
            i7 = Math.max(i7, d.right);
        }
        int max = Math.max(this.f1121q, (this.f1097F * 2) + i6 + i7);
        int max2 = Math.max(i5, i3);
        this.f1095D = max;
        this.f1096E = max2;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f1124t : this.f1125u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f1092A
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L_0x009f
            r2 = 2
            if (r0 == r1) goto L_0x008b
            if (r0 == r2) goto L_0x0016
            r3 = 3
            if (r0 == r3) goto L_0x008b
            goto L_0x00b9
        L_0x0016:
            int r0 = r6.f1127w
            if (r0 == r1) goto L_0x0057
            if (r0 == r2) goto L_0x001e
            goto L_0x00b9
        L_0x001e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f1129y
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L_0x0032
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L_0x003d
        L_0x0032:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x003d
        L_0x0039:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x003d:
            boolean r0 = androidx.appcompat.widget.C0293z0.m1487a(r6)
            if (r0 == 0) goto L_0x0044
            float r2 = -r2
        L_0x0044:
            float r0 = r6.f1094C
            float r0 = r0 + r2
            float r0 = m1237a(r0, r4, r3)
            float r2 = r6.f1094C
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0056
            r6.f1129y = r7
            r6.setThumbPosition(r0)
        L_0x0056:
            return r1
        L_0x0057:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f1129y
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1128x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x007d
            float r4 = r6.f1130z
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f1128x
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b9
        L_0x007d:
            r6.f1127w = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f1129y = r0
            r6.f1130z = r3
            return r1
        L_0x008b:
            int r0 = r6.f1127w
            if (r0 != r2) goto L_0x0096
            r6.m1245b(r7)
            super.onTouchEvent(r7)
            return r1
        L_0x0096:
            r0 = 0
            r6.f1127w = r0
            android.view.VelocityTracker r0 = r6.f1092A
            r0.clear()
            goto L_0x00b9
        L_0x009f:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto L_0x00b9
            boolean r3 = r6.m1243a(r0, r2)
            if (r3 == 0) goto L_0x00b9
            r6.f1127w = r1
            r6.f1129y = r0
            r6.f1130z = r2
        L_0x00b9:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0251n0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !C3379v.m13768D(this)) {
            m1246c();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        m1242a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0391i.m2025a((TextView) this, callback));
    }

    public void setShowText(boolean z) {
        if (this.f1126v != z) {
            this.f1126v = z;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z) {
        this.f1123s = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.f1121q = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.f1122r = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f1102K.getTypeface() != null && !this.f1102K.getTypeface().equals(typeface)) || (this.f1102K.getTypeface() == null && typeface != null)) {
            this.f1102K.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.f1125u = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f1124t = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1110f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1110f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void setThumbPosition(float f) {
        this.f1094C = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(C3103a.m12557c(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.f1120p = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f1111g = colorStateList;
        this.f1113i = true;
        m1239a();
    }

    public void setThumbTintMode(Mode mode) {
        this.f1112h = mode;
        this.f1114j = true;
        m1239a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1115k;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1115k = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(C3103a.m12557c(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f1116l = colorStateList;
        this.f1118n = true;
        m1244b();
    }

    public void setTrackTintMode(Mode mode) {
        this.f1117m = mode;
        this.f1119o = true;
        m1244b();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1110f || drawable == this.f1115k;
    }
}
