package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView.BufferType;
import androidx.appcompat.widget.C0223g;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.C2611a.C2612a;
import com.google.android.material.internal.C2714i;
import com.google.android.material.internal.C2715j;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import p071f.p097h.p108m.C3323a;
import p071f.p097h.p108m.C3379v;
import p071f.p097h.p108m.p109f0.C3347c;
import p071f.p097h.p108m.p109f0.C3347c.C3348a;
import p071f.p112j.p114b.C3403a;
import p147g.p156d.p157a.p185c.C4375b;
import p147g.p156d.p157a.p185c.C4414j;
import p147g.p156d.p157a.p185c.C4415k;
import p147g.p156d.p157a.p185c.C4416l;
import p147g.p156d.p157a.p185c.p187b0.C4382g;
import p147g.p156d.p157a.p185c.p187b0.C4386h;
import p147g.p156d.p157a.p185c.p187b0.C4389k;
import p147g.p156d.p157a.p185c.p187b0.C4404n;
import p147g.p156d.p157a.p185c.p189m.C4424h;
import p147g.p156d.p157a.p185c.p202y.C4459c;
import p147g.p156d.p157a.p185c.p202y.C4460d;
import p147g.p156d.p157a.p185c.p202y.C4464f;
import p147g.p156d.p157a.p185c.p203z.C4468b;

public class Chip extends C0223g implements C2612a, C4404n {

    /* renamed from: A */
    private static final int[] f7450A = {16842911};
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final Rect f7451y = new Rect();

    /* renamed from: z */
    private static final int[] f7452z = {16842913};
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C2611a f7453i;

    /* renamed from: j */
    private InsetDrawable f7454j;

    /* renamed from: k */
    private RippleDrawable f7455k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public OnClickListener f7456l;

    /* renamed from: m */
    private OnCheckedChangeListener f7457m;

    /* renamed from: n */
    private boolean f7458n;

    /* renamed from: o */
    private boolean f7459o;

    /* renamed from: p */
    private boolean f7460p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public boolean f7461q;

    /* renamed from: r */
    private boolean f7462r;

    /* renamed from: s */
    private int f7463s;

    /* renamed from: t */
    private int f7464t;

    /* renamed from: u */
    private final C2605c f7465u;

    /* renamed from: v */
    private final Rect f7466v;

    /* renamed from: w */
    private final RectF f7467w;

    /* renamed from: x */
    private final C4464f f7468x;

    /* renamed from: com.google.android.material.chip.Chip$a */
    class C2603a extends C4464f {
        C2603a() {
        }

        /* renamed from: a */
        public void mo8429a(int i) {
        }

        /* renamed from: a */
        public void mo8430a(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            chip.setText(chip.f7453i.mo8523c0() ? Chip.this.f7453i.mo8496T() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$b */
    class C2604b extends ViewOutlineProvider {
        C2604b() {
        }

        @TargetApi(21)
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f7453i != null) {
                Chip.this.f7453i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: com.google.android.material.chip.Chip$c */
    private class C2605c extends C3403a {
        C2605c(Chip chip) {
            super(chip);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public int mo8432a(float f, float f2) {
            return (!Chip.this.m10645i() || !Chip.this.getCloseIconTouchBounds().contains(f, f2)) ? 0 : 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8433a(int i, C3347c cVar) {
            CharSequence charSequence = "";
            if (i == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription == null) {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i2 = C4414j.mtrl_chip_close_icon_content_description;
                    Object[] objArr = new Object[1];
                    if (!TextUtils.isEmpty(text)) {
                        charSequence = text;
                    }
                    objArr[0] = charSequence;
                    closeIconContentDescription = context.getString(i2, objArr).trim();
                }
                cVar.mo10754b(closeIconContentDescription);
                cVar.mo10759c(Chip.this.getCloseIconTouchBoundsInt());
                cVar.mo10744a(C3348a.f9556e);
                cVar.mo10773f(Chip.this.isEnabled());
                return;
            }
            cVar.mo10754b(charSequence);
            cVar.mo10759c(Chip.f7451y);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8434a(int i, boolean z) {
            if (i == 1) {
                Chip.this.f7461q = z;
                Chip.this.refreshDrawableState();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8435a(C3347c cVar) {
            cVar.mo10756b(Chip.this.mo8293b());
            cVar.mo10766d(Chip.this.isClickable());
            String str = (Chip.this.mo8293b() || Chip.this.isClickable()) ? Chip.this.mo8293b() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View";
            cVar.mo10745a((CharSequence) str);
            CharSequence text = Chip.this.getText();
            if (VERSION.SDK_INT >= 23) {
                cVar.mo10775g(text);
            } else {
                cVar.mo10754b(text);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo8436a(List<Integer> list) {
            list.add(Integer.valueOf(0));
            if (Chip.this.m10645i() && Chip.this.mo8294c() && Chip.this.f7456l != null) {
                list.add(Integer.valueOf(1));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public boolean mo8437a(int i, int i2, Bundle bundle) {
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    return Chip.this.mo8295d();
                }
            }
            return false;
        }
    }

    public Chip(Context context) {
        this(context, null);
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C4375b.chipStyle);
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7466v = new Rect();
        this.f7467w = new RectF();
        this.f7468x = new C2603a();
        m10633a(attributeSet);
        C2611a a = C2611a.m10680a(context, attributeSet, i, C4415k.Widget_MaterialComponents_Chip_Action);
        m10632a(context, attributeSet, i);
        setChipDrawable(a);
        a.mo13064b(C3379v.m13825l(this));
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.Chip, i, C4415k.Widget_MaterialComponents_Chip_Action, new int[0]);
        if (VERSION.SDK_INT < 23) {
            setTextColor(C4459c.m18175a(context, c, C4416l.Chip_android_textColor));
        }
        boolean hasValue = c.hasValue(C4416l.Chip_shapeAppearance);
        c.recycle();
        this.f7465u = new C2605c(this);
        m10648l();
        if (!hasValue) {
            m10646j();
        }
        setChecked(this.f7458n);
        setText(a.mo8496T());
        setEllipsize(a.mo8490N());
        setIncludeFontPadding(false);
        m10652p();
        if (!this.f7453i.mo8523c0()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m10651o();
        if (mo8298e()) {
            setMinHeight(this.f7464t);
        }
        this.f7463s = C3379v.m13829p(this);
    }

    /* renamed from: a */
    private void m10631a(int i, int i2, int i3, int i4) {
        InsetDrawable insetDrawable = new InsetDrawable(this.f7453i, i, i2, i3, i4);
        this.f7454j = insetDrawable;
    }

    /* renamed from: a */
    private void m10632a(Context context, AttributeSet attributeSet, int i) {
        TypedArray c = C2714i.m11283c(context, attributeSet, C4416l.Chip, i, C4415k.Widget_MaterialComponents_Chip_Action, new int[0]);
        this.f7462r = c.getBoolean(C4416l.Chip_ensureMinTouchTargetSize, false);
        this.f7464t = (int) Math.ceil((double) c.getDimension(C4416l.Chip_chipMinTouchTargetSize, (float) Math.ceil((double) C2715j.m11285a(getContext(), 48))));
        c.recycle();
    }

    /* renamed from: a */
    private void m10633a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            String str = "http://schemas.android.com/apk/res/android";
            String str2 = "Chip";
            if (attributeSet.getAttributeValue(str, "background") != null) {
                Log.w(str2, "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue(str, "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue(str, "drawableStart") == null) {
                String str3 = "Please set end drawable using R.attr#closeIcon.";
                if (attributeSet.getAttributeValue(str, "drawableEnd") != null) {
                    throw new UnsupportedOperationException(str3);
                } else if (attributeSet.getAttributeValue(str, "drawableRight") != null) {
                    throw new UnsupportedOperationException(str3);
                } else if (attributeSet.getAttributeBooleanValue(str, "singleLine", true) && attributeSet.getAttributeIntValue(str, "lines", 1) == 1 && attributeSet.getAttributeIntValue(str, "minLines", 1) == 1 && attributeSet.getAttributeIntValue(str, "maxLines", 1) == 1) {
                    if (attributeSet.getAttributeIntValue(str, "gravity", 8388627) != 8388627) {
                        Log.w(str2, "Chip text must be vertically center and start aligned");
                    }
                } else {
                    throw new UnsupportedOperationException("Chip does not support multi-line text");
                }
            } else {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
        }
    }

    /* renamed from: a */
    private void m10634a(C2611a aVar) {
        aVar.mo8508a((C2612a) this);
    }

    @SuppressLint({"PrivateApi"})
    /* renamed from: a */
    private boolean m10635a(MotionEvent motionEvent) {
        Class<C3403a> cls = C3403a.class;
        String str = "Unable to send Accessibility Exit event";
        String str2 = "Chip";
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = cls.getDeclaredField("m");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f7465u)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = cls.getDeclaredMethod("i", new Class[]{Integer.TYPE});
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f7465u, new Object[]{Integer.valueOf(RecyclerView.UNDEFINED_DURATION)});
                    return true;
                }
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                Log.e(str2, str, e);
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m10637b(C2611a aVar) {
        if (aVar != null) {
            aVar.mo8508a((C2612a) null);
        }
    }

    /* renamed from: g */
    private int[] m10643g() {
        int i = 0;
        int i2 = isEnabled() ? 1 : 0;
        if (this.f7461q) {
            i2++;
        }
        if (this.f7460p) {
            i2++;
        }
        if (this.f7459o) {
            i2++;
        }
        if (isChecked()) {
            i2++;
        }
        int[] iArr = new int[i2];
        if (isEnabled()) {
            iArr[0] = 16842910;
            i = 1;
        }
        if (this.f7461q) {
            iArr[i] = 16842908;
            i++;
        }
        if (this.f7460p) {
            iArr[i] = 16843623;
            i++;
        }
        if (this.f7459o) {
            iArr[i] = 16842919;
            i++;
        }
        if (isChecked()) {
            iArr[i] = 16842913;
        }
        return iArr;
    }

    /* access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f7467w.setEmpty();
        if (m10645i()) {
            this.f7453i.mo8505a(this.f7467w);
        }
        return this.f7467w;
    }

    /* access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f7466v.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f7466v;
    }

    private C4460d getTextAppearance() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8497U();
        }
        return null;
    }

    /* renamed from: h */
    private void m10644h() {
        if (getBackgroundDrawable() == this.f7454j && this.f7453i.getCallback() == null) {
            this.f7453i.setCallback(this.f7454j);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public boolean m10645i() {
        C2611a aVar = this.f7453i;
        return (aVar == null || aVar.mo8483G() == null) ? false : true;
    }

    /* renamed from: j */
    private void m10646j() {
        if (VERSION.SDK_INT >= 21) {
            setOutlineProvider(new C2604b());
        }
    }

    /* renamed from: k */
    private void m10647k() {
        if (this.f7454j != null) {
            this.f7454j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            m10649m();
        }
    }

    /* renamed from: l */
    private void m10648l() {
        C3379v.m13788a((View) this, (C3323a) (!m10645i() || !mo8294c() || this.f7456l == null) ? null : this.f7465u);
    }

    /* renamed from: m */
    private void m10649m() {
        if (C4468b.f11823a) {
            m10650n();
            return;
        }
        this.f7453i.mo8538g(true);
        C3379v.m13787a((View) this, getBackgroundDrawable());
        m10651o();
        m10644h();
    }

    /* renamed from: n */
    private void m10650n() {
        this.f7455k = new RippleDrawable(C4468b.m18201b(this.f7453i.mo8494R()), getBackgroundDrawable(), null);
        this.f7453i.mo8538g(false);
        C3379v.m13787a((View) this, (Drawable) this.f7455k);
        m10651o();
    }

    /* renamed from: o */
    private void m10651o() {
        if (!TextUtils.isEmpty(getText())) {
            C2611a aVar = this.f7453i;
            if (aVar != null) {
                int y = (int) (aVar.mo8588y() + this.f7453i.mo8498V() + this.f7453i.mo8579u());
                int D = (int) (this.f7453i.mo8479D() + this.f7453i.mo8499W() + this.f7453i.mo8577t());
                if (this.f7454j != null) {
                    Rect rect = new Rect();
                    StringBuilder sb = new StringBuilder();
                    sb.append("padding: ");
                    sb.append(rect.left);
                    sb.append(" ");
                    sb.append(rect.right);
                    Log.w("mdc-chip", sb.toString());
                    this.f7454j.getPadding(rect);
                    if (C3379v.m13829p(this) == 1) {
                        y += rect.right;
                    } else {
                        D += rect.left;
                    }
                }
                C3379v.m13783a(this, D, getPaddingTop(), y, getPaddingBottom());
            }
        }
    }

    /* renamed from: p */
    private void m10652p() {
        TextPaint paint = getPaint();
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C4460d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.mo13271b(getContext(), paint, this.f7468x);
        }
    }

    private void setCloseIconHovered(boolean z) {
        if (this.f7460p != z) {
            this.f7460p = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.f7459o != z) {
            this.f7459o = z;
            refreshDrawableState();
        }
    }

    /* renamed from: a */
    public void mo8291a() {
        mo8292a(this.f7464t);
        requestLayout();
        if (VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007d, code lost:
        if (getMinWidth() != r6) goto L_0x0083;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo8292a(int r6) {
        /*
            r5 = this;
            r5.f7464t = r6
            boolean r0 = r5.mo8298e()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            android.graphics.drawable.InsetDrawable r6 = r5.f7454j
            if (r6 == 0) goto L_0x0011
            r5.m10647k()
            goto L_0x0014
        L_0x0011:
            r5.m10649m()
        L_0x0014:
            return r1
        L_0x0015:
            com.google.android.material.chip.a r0 = r5.f7453i
            int r0 = r0.getIntrinsicHeight()
            int r0 = r6 - r0
            int r0 = java.lang.Math.max(r1, r0)
            com.google.android.material.chip.a r2 = r5.f7453i
            int r2 = r2.getIntrinsicWidth()
            int r2 = r6 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L_0x003d
            if (r0 > 0) goto L_0x003d
            android.graphics.drawable.InsetDrawable r6 = r5.f7454j
            if (r6 == 0) goto L_0x0039
            r5.m10647k()
            goto L_0x003c
        L_0x0039:
            r5.m10649m()
        L_0x003c:
            return r1
        L_0x003d:
            if (r2 <= 0) goto L_0x0042
            int r2 = r2 / 2
            goto L_0x0043
        L_0x0042:
            r2 = 0
        L_0x0043:
            if (r0 <= 0) goto L_0x0047
            int r1 = r0 / 2
        L_0x0047:
            android.graphics.drawable.InsetDrawable r0 = r5.f7454j
            r3 = 1
            if (r0 == 0) goto L_0x006a
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r4 = r5.f7454j
            r4.getPadding(r0)
            int r4 = r0.top
            if (r4 != r1) goto L_0x006a
            int r4 = r0.bottom
            if (r4 != r1) goto L_0x006a
            int r4 = r0.left
            if (r4 != r2) goto L_0x006a
            int r0 = r0.right
            if (r0 != r2) goto L_0x006a
            r5.m10649m()
            return r3
        L_0x006a:
            int r0 = android.os.Build.VERSION.SDK_INT
            r4 = 16
            if (r0 < r4) goto L_0x0080
            int r0 = r5.getMinHeight()
            if (r0 == r6) goto L_0x0079
            r5.setMinHeight(r6)
        L_0x0079:
            int r0 = r5.getMinWidth()
            if (r0 == r6) goto L_0x0086
            goto L_0x0083
        L_0x0080:
            r5.setMinHeight(r6)
        L_0x0083:
            r5.setMinWidth(r6)
        L_0x0086:
            r5.m10631a(r2, r1, r2, r1)
            r5.m10649m()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.mo8292a(int):boolean");
    }

    /* renamed from: b */
    public boolean mo8293b() {
        C2611a aVar = this.f7453i;
        return aVar != null && aVar.mo8501Y();
    }

    /* renamed from: c */
    public boolean mo8294c() {
        C2611a aVar = this.f7453i;
        return aVar != null && aVar.mo8513a0();
    }

    /* renamed from: d */
    public boolean mo8295d() {
        boolean z = false;
        playSoundEffect(0);
        OnClickListener onClickListener = this.f7456l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z = true;
        }
        this.f7465u.mo10889a(1, 1);
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m10635a(motionEvent) || this.f7465u.mo10891a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f7465u.mo10890a(keyEvent) || this.f7465u.mo10895c() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2611a aVar = this.f7453i;
        if ((aVar == null || !aVar.mo8502Z()) ? false : this.f7453i.mo8512a(m10643g())) {
            invalidate();
        }
    }

    /* renamed from: e */
    public boolean mo8298e() {
        return this.f7462r;
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f7454j;
        return insetDrawable == null ? this.f7453i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8582v();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8584w();
        }
        return null;
    }

    public float getChipCornerRadius() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8586x();
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f7453i;
    }

    public float getChipEndPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8588y();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8590z();
        }
        return null;
    }

    public float getChipIconSize() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8473A();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8475B();
        }
        return null;
    }

    public float getChipMinHeight() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8477C();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8479D();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8481E();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8482F();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8483G();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8484H();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8485I();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8486J();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8487K();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8489M();
        }
        return null;
    }

    public TruncateAt getEllipsize() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8490N();
        }
        return null;
    }

    public void getFocusedRect(Rect rect) {
        if (this.f7465u.mo10895c() == 1 || this.f7465u.mo10892b() == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public C4424h getHideMotionSpec() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8491O();
        }
        return null;
    }

    public float getIconEndPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8492P();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8493Q();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8494R();
        }
        return null;
    }

    public C4389k getShapeAppearanceModel() {
        return this.f7453i.mo13083l();
    }

    public C4424h getShowMotionSpec() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8495S();
        }
        return null;
    }

    public float getTextEndPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8498V();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            return aVar.mo8499W();
        }
        return 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4386h.m17877a((View) this, (C4382g) this.f7453i);
    }

    /* access modifiers changed from: protected */
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f7452z);
        }
        if (mo8293b()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, f7450A);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        this.f7465u.mo10887a(z, i, rect);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                z = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        z = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(z);
        return super.onHoverEvent(motionEvent);
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        String str = (mo8293b() || isClickable()) ? mo8293b() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View";
        accessibilityNodeInfo.setClassName(str);
        accessibilityNodeInfo.setCheckable(mo8293b());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f7463s != i) {
            this.f7463s = i;
            m10651o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001e, code lost:
        if (r0 != 3) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0039
            if (r0 == r3) goto L_0x002b
            r4 = 2
            if (r0 == r4) goto L_0x0021
            r1 = 3
            if (r0 == r1) goto L_0x0034
            goto L_0x0040
        L_0x0021:
            boolean r0 = r5.f7459o
            if (r0 == 0) goto L_0x0040
            if (r1 != 0) goto L_0x003e
            r5.setCloseIconPressed(r2)
            goto L_0x003e
        L_0x002b:
            boolean r0 = r5.f7459o
            if (r0 == 0) goto L_0x0034
            r5.mo8295d()
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = 0
        L_0x0035:
            r5.setCloseIconPressed(r2)
            goto L_0x0041
        L_0x0039:
            if (r1 == 0) goto L_0x0040
            r5.setCloseIconPressed(r3)
        L_0x003e:
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 != 0) goto L_0x0049
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L_0x004a
        L_0x0049:
            r2 = 1
        L_0x004a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7455k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f7455k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8517b(z);
        }
    }

    public void setCheckableResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8519c(i);
        }
    }

    public void setChecked(boolean z) {
        C2611a aVar = this.f7453i;
        if (aVar == null) {
            this.f7458n = z;
        } else if (aVar.mo8501Y()) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z) {
                OnCheckedChangeListener onCheckedChangeListener = this.f7457m;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(this, z);
                }
            }
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8506a(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8524d(i);
        }
    }

    public void setCheckedIconVisible(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8528e(i);
        }
    }

    public void setCheckedIconVisible(boolean z) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8522c(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8520c(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8532f(i);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8531f(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8536g(i);
        }
    }

    public void setChipDrawable(C2611a aVar) {
        C2611a aVar2 = this.f7453i;
        if (aVar2 != aVar) {
            m10637b(aVar2);
            this.f7453i = aVar;
            aVar.mo8534f(false);
            m10634a(this.f7453i);
            mo8292a(this.f7464t);
        }
    }

    public void setChipEndPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8535g(f);
        }
    }

    public void setChipEndPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8546h(i);
        }
    }

    public void setChipIcon(Drawable drawable) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8514b(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8548i(i);
        }
    }

    public void setChipIconSize(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8545h(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8552j(i);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8525d(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8554k(i);
        }
    }

    public void setChipIconVisible(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8556l(i);
        }
    }

    public void setChipIconVisible(boolean z) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8526d(z);
        }
    }

    public void setChipMinHeight(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8547i(f);
        }
    }

    public void setChipMinHeightResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8558m(i);
        }
    }

    public void setChipStartPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8551j(f);
        }
    }

    public void setChipStartPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8560n(i);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8529e(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8562o(i);
        }
    }

    public void setChipStrokeWidth(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8553k(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8567p(i);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8521c(drawable);
        }
        m10648l();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8511a(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8555l(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8569q(i);
        }
    }

    public void setCloseIconResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8571r(i);
        }
        m10648l();
    }

    public void setCloseIconSize(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8557m(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8572s(i);
        }
    }

    public void setCloseIconStartPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8559n(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8578t(i);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8533f(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8580u(i);
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8530e(z);
        }
        m10648l();
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo13064b(f);
        }
    }

    public void setEllipsize(TruncateAt truncateAt) {
        if (this.f7453i != null) {
            if (truncateAt != TruncateAt.MARQUEE) {
                super.setEllipsize(truncateAt);
                C2611a aVar = this.f7453i;
                if (aVar != null) {
                    aVar.mo8507a(truncateAt);
                }
                return;
            }
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.f7462r = z;
        mo8292a(this.f7464t);
    }

    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C4424h hVar) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8509a(hVar);
        }
    }

    public void setHideMotionSpecResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8583v(i);
        }
    }

    public void setIconEndPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8561o(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8585w(i);
        }
    }

    public void setIconStartPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8566p(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8587x(i);
        }
    }

    public void setLayoutDirection(int i) {
        if (this.f7453i != null && VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i);
        }
    }

    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8589y(i);
        }
    }

    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* access modifiers changed from: 0000 */
    public void setOnCheckedChangeListenerInternal(OnCheckedChangeListener onCheckedChangeListener) {
        this.f7457m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(OnClickListener onClickListener) {
        this.f7456l = onClickListener;
        m10648l();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8537g(colorStateList);
        }
        if (!this.f7453i.mo8500X()) {
            m10650n();
        }
    }

    public void setRippleColorResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8591z(i);
            if (!this.f7453i.mo8500X()) {
                m10650n();
            }
        }
    }

    public void setShapeAppearanceModel(C4389k kVar) {
        this.f7453i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(C4424h hVar) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8515b(hVar);
        }
    }

    public void setShowMotionSpecResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8474A(i);
        }
    }

    public void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(z);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (this.f7453i != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            super.setText(this.f7453i.mo8523c0() ? null : charSequence, bufferType);
            C2611a aVar = this.f7453i;
            if (aVar != null) {
                aVar.mo8516b(charSequence);
            }
        }
    }

    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8476B(i);
        }
        m10652p();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8476B(i);
        }
        m10652p();
    }

    public void setTextAppearance(C4460d dVar) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8510a(dVar);
        }
        m10652p();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8568q(f);
        }
    }

    public void setTextEndPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8478C(i);
        }
    }

    public void setTextStartPadding(float f) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8570r(f);
        }
    }

    public void setTextStartPaddingResource(int i) {
        C2611a aVar = this.f7453i;
        if (aVar != null) {
            aVar.mo8480D(i);
        }
    }
}
