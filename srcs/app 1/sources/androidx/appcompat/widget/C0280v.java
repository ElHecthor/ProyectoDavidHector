package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.widget.C0384b;
import androidx.core.widget.C0391i;
import java.lang.ref.WeakReference;
import java.util.Locale;
import p071f.p072a.C3102j;
import p071f.p097h.p098e.p099c.C3248f.C3249a;

/* renamed from: androidx.appcompat.widget.v */
class C0280v {

    /* renamed from: a */
    private final TextView f1217a;

    /* renamed from: b */
    private C0260r0 f1218b;

    /* renamed from: c */
    private C0260r0 f1219c;

    /* renamed from: d */
    private C0260r0 f1220d;

    /* renamed from: e */
    private C0260r0 f1221e;

    /* renamed from: f */
    private C0260r0 f1222f;

    /* renamed from: g */
    private C0260r0 f1223g;

    /* renamed from: h */
    private C0260r0 f1224h;

    /* renamed from: i */
    private final C0284w f1225i;

    /* renamed from: j */
    private int f1226j = 0;

    /* renamed from: k */
    private int f1227k = -1;

    /* renamed from: l */
    private Typeface f1228l;

    /* renamed from: m */
    private boolean f1229m;

    /* renamed from: androidx.appcompat.widget.v$a */
    private static class C0281a extends C3249a {

        /* renamed from: a */
        private final WeakReference<C0280v> f1230a;

        /* renamed from: b */
        private final int f1231b;

        /* renamed from: c */
        private final int f1232c;

        /* renamed from: androidx.appcompat.widget.v$a$a */
        private class C0282a implements Runnable {

            /* renamed from: f */
            private final WeakReference<C0280v> f1233f;

            /* renamed from: g */
            private final Typeface f1234g;

            C0282a(C0281a aVar, WeakReference<C0280v> weakReference, Typeface typeface) {
                this.f1233f = weakReference;
                this.f1234g = typeface;
            }

            public void run() {
                C0280v vVar = (C0280v) this.f1233f.get();
                if (vVar != null) {
                    vVar.mo1800a(this.f1234g);
                }
            }
        }

        C0281a(C0280v vVar, int i, int i2) {
            this.f1230a = new WeakReference<>(vVar);
            this.f1231b = i;
            this.f1232c = i2;
        }

        /* renamed from: a */
        public void mo1816a(int i) {
        }

        /* renamed from: a */
        public void mo1817a(Typeface typeface) {
            C0280v vVar = (C0280v) this.f1230a.get();
            if (vVar != null) {
                if (VERSION.SDK_INT >= 28) {
                    int i = this.f1231b;
                    if (i != -1) {
                        typeface = Typeface.create(typeface, i, (this.f1232c & 2) != 0);
                    }
                }
                vVar.mo1802a((Runnable) new C0282a(this, this.f1230a, typeface));
            }
        }
    }

    C0280v(TextView textView) {
        this.f1217a = textView;
        this.f1225i = new C0284w(this.f1217a);
    }

    /* renamed from: a */
    private static C0260r0 m1373a(Context context, C0236j jVar, int i) {
        ColorStateList b = jVar.mo1477b(context, i);
        if (b == null) {
            return null;
        }
        C0260r0 r0Var = new C0260r0();
        r0Var.f1154d = true;
        r0Var.f1151a = b;
        return r0Var;
    }

    /* renamed from: a */
    private void m1374a(Context context, C0275t0 t0Var) {
        Typeface typeface;
        Typeface typeface2;
        this.f1226j = t0Var.mo1744d(C3102j.TextAppearance_android_textStyle, this.f1226j);
        boolean z = false;
        if (VERSION.SDK_INT >= 28) {
            int d = t0Var.mo1744d(C3102j.TextAppearance_android_textFontWeight, -1);
            this.f1227k = d;
            if (d != -1) {
                this.f1226j = (this.f1226j & 2) | 0;
            }
        }
        if (t0Var.mo1751g(C3102j.TextAppearance_android_fontFamily) || t0Var.mo1751g(C3102j.TextAppearance_fontFamily)) {
            this.f1228l = null;
            int i = t0Var.mo1751g(C3102j.TextAppearance_fontFamily) ? C3102j.TextAppearance_fontFamily : C3102j.TextAppearance_android_fontFamily;
            int i2 = this.f1227k;
            int i3 = this.f1226j;
            if (!context.isRestricted()) {
                try {
                    Typeface a = t0Var.mo1736a(i, this.f1226j, (C3249a) new C0281a(this, i2, i3));
                    if (a != null) {
                        if (VERSION.SDK_INT >= 28 && this.f1227k != -1) {
                            a = Typeface.create(Typeface.create(a, 0), this.f1227k, (this.f1226j & 2) != 0);
                        }
                        this.f1228l = a;
                    }
                    this.f1229m = this.f1228l == null;
                } catch (NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f1228l == null) {
                String d2 = t0Var.mo1745d(i);
                if (d2 != null) {
                    if (VERSION.SDK_INT < 28 || this.f1227k == -1) {
                        typeface = Typeface.create(d2, this.f1226j);
                    } else {
                        Typeface create = Typeface.create(d2, 0);
                        int i4 = this.f1227k;
                        if ((this.f1226j & 2) != 0) {
                            z = true;
                        }
                        typeface = Typeface.create(create, i4, z);
                    }
                    this.f1228l = typeface;
                }
            }
            return;
        }
        if (t0Var.mo1751g(C3102j.TextAppearance_android_typeface)) {
            this.f1229m = false;
            int d3 = t0Var.mo1744d(C3102j.TextAppearance_android_typeface, 1);
            if (d3 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (d3 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (d3 == 3) {
                typeface2 = Typeface.MONOSPACE;
            }
            this.f1228l = typeface2;
        }
    }

    /* renamed from: a */
    private void m1375a(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (VERSION.SDK_INT >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1217a.getCompoundDrawablesRelative();
            TextView textView = this.f1217a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (!(drawable == null && drawable2 == null && drawable3 == null && drawable4 == null)) {
            if (VERSION.SDK_INT >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f1217a.getCompoundDrawablesRelative();
                if (!(compoundDrawablesRelative2[0] == null && compoundDrawablesRelative2[2] == null)) {
                    TextView textView2 = this.f1217a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f1217a.getCompoundDrawables();
            TextView textView3 = this.f1217a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: a */
    private void m1376a(Drawable drawable, C0260r0 r0Var) {
        if (drawable != null && r0Var != null) {
            C0236j.m1168a(drawable, r0Var, this.f1217a.getDrawableState());
        }
    }

    /* renamed from: b */
    private void m1377b(int i, float f) {
        this.f1225i.mo1822a(i, f);
    }

    /* renamed from: l */
    private void m1378l() {
        C0260r0 r0Var = this.f1224h;
        this.f1218b = r0Var;
        this.f1219c = r0Var;
        this.f1220d = r0Var;
        this.f1221e = r0Var;
        this.f1222f = r0Var;
        this.f1223g = r0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1793a() {
        if (!(this.f1218b == null && this.f1219c == null && this.f1220d == null && this.f1221e == null)) {
            Drawable[] compoundDrawables = this.f1217a.getCompoundDrawables();
            m1376a(compoundDrawables[0], this.f1218b);
            m1376a(compoundDrawables[1], this.f1219c);
            m1376a(compoundDrawables[2], this.f1220d);
            m1376a(compoundDrawables[3], this.f1221e);
        }
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (this.f1222f != null || this.f1223g != null) {
            Drawable[] compoundDrawablesRelative = this.f1217a.getCompoundDrawablesRelative();
            m1376a(compoundDrawablesRelative[0], this.f1222f);
            m1376a(compoundDrawablesRelative[2], this.f1223g);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1794a(int i) {
        this.f1225i.mo1827b(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1795a(int i, float f) {
        if (!C0384b.f1807a && !mo1814j()) {
            m1377b(i, f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1796a(int i, int i2, int i3, int i4) {
        this.f1225i.mo1823a(i, i2, i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1797a(Context context, int i) {
        C0275t0 a = C0275t0.m1309a(context, i, C3102j.TextAppearance);
        if (a.mo1751g(C3102j.TextAppearance_textAllCaps)) {
            mo1803a(a.mo1738a(C3102j.TextAppearance_textAllCaps, false));
        }
        if (VERSION.SDK_INT < 23 && a.mo1751g(C3102j.TextAppearance_android_textColor)) {
            ColorStateList a2 = a.mo1735a(C3102j.TextAppearance_android_textColor);
            if (a2 != null) {
                this.f1217a.setTextColor(a2);
            }
        }
        if (a.mo1751g(C3102j.TextAppearance_android_textSize) && a.mo1742c(C3102j.TextAppearance_android_textSize, -1) == 0) {
            this.f1217a.setTextSize(0, 0.0f);
        }
        m1374a(context, a);
        if (VERSION.SDK_INT >= 26 && a.mo1751g(C3102j.TextAppearance_fontVariationSettings)) {
            String d = a.mo1745d(C3102j.TextAppearance_fontVariationSettings);
            if (d != null) {
                this.f1217a.setFontVariationSettings(d);
            }
        }
        a.mo1737a();
        Typeface typeface = this.f1228l;
        if (typeface != null) {
            this.f1217a.setTypeface(typeface, this.f1226j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1798a(ColorStateList colorStateList) {
        if (this.f1224h == null) {
            this.f1224h = new C0260r0();
        }
        C0260r0 r0Var = this.f1224h;
        r0Var.f1151a = colorStateList;
        r0Var.f1154d = colorStateList != null;
        m1378l();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1799a(Mode mode) {
        if (this.f1224h == null) {
            this.f1224h = new C0260r0();
        }
        C0260r0 r0Var = this.f1224h;
        r0Var.f1152b = mode;
        r0Var.f1153c = mode != null;
        m1378l();
    }

    /* renamed from: a */
    public void mo1800a(Typeface typeface) {
        if (this.f1229m) {
            this.f1217a.setTypeface(typeface);
            this.f1228l = typeface;
        }
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public void mo1801a(AttributeSet attributeSet, int i) {
        ColorStateList colorStateList;
        boolean z;
        boolean z2;
        ColorStateList colorStateList2;
        String str;
        ColorStateList colorStateList3;
        String str2;
        C0236j jVar;
        int i2;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i;
        Context context = this.f1217a.getContext();
        C0236j b = C0236j.m1169b();
        C0275t0 a = C0275t0.m1311a(context, attributeSet2, C3102j.AppCompatTextHelper, i3, 0);
        int g = a.mo1750g(C3102j.AppCompatTextHelper_android_textAppearance, -1);
        if (a.mo1751g(C3102j.AppCompatTextHelper_android_drawableLeft)) {
            this.f1218b = m1373a(context, b, a.mo1750g(C3102j.AppCompatTextHelper_android_drawableLeft, 0));
        }
        if (a.mo1751g(C3102j.AppCompatTextHelper_android_drawableTop)) {
            this.f1219c = m1373a(context, b, a.mo1750g(C3102j.AppCompatTextHelper_android_drawableTop, 0));
        }
        if (a.mo1751g(C3102j.AppCompatTextHelper_android_drawableRight)) {
            this.f1220d = m1373a(context, b, a.mo1750g(C3102j.AppCompatTextHelper_android_drawableRight, 0));
        }
        if (a.mo1751g(C3102j.AppCompatTextHelper_android_drawableBottom)) {
            this.f1221e = m1373a(context, b, a.mo1750g(C3102j.AppCompatTextHelper_android_drawableBottom, 0));
        }
        if (VERSION.SDK_INT >= 17) {
            if (a.mo1751g(C3102j.AppCompatTextHelper_android_drawableStart)) {
                this.f1222f = m1373a(context, b, a.mo1750g(C3102j.AppCompatTextHelper_android_drawableStart, 0));
            }
            if (a.mo1751g(C3102j.AppCompatTextHelper_android_drawableEnd)) {
                this.f1223g = m1373a(context, b, a.mo1750g(C3102j.AppCompatTextHelper_android_drawableEnd, 0));
            }
        }
        a.mo1737a();
        boolean z3 = this.f1217a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (g != -1) {
            C0275t0 a2 = C0275t0.m1309a(context, g, C3102j.TextAppearance);
            if (z3 || !a2.mo1751g(C3102j.TextAppearance_textAllCaps)) {
                z2 = false;
                z = false;
            } else {
                z2 = a2.mo1738a(C3102j.TextAppearance_textAllCaps, false);
                z = true;
            }
            m1374a(context, a2);
            if (VERSION.SDK_INT < 23) {
                colorStateList = a2.mo1751g(C3102j.TextAppearance_android_textColor) ? a2.mo1735a(C3102j.TextAppearance_android_textColor) : null;
                colorStateList3 = a2.mo1751g(C3102j.TextAppearance_android_textColorHint) ? a2.mo1735a(C3102j.TextAppearance_android_textColorHint) : null;
                colorStateList2 = a2.mo1751g(C3102j.TextAppearance_android_textColorLink) ? a2.mo1735a(C3102j.TextAppearance_android_textColorLink) : null;
            } else {
                colorStateList3 = null;
                colorStateList2 = null;
                colorStateList = null;
            }
            str2 = a2.mo1751g(C3102j.TextAppearance_textLocale) ? a2.mo1745d(C3102j.TextAppearance_textLocale) : null;
            str = (VERSION.SDK_INT < 26 || !a2.mo1751g(C3102j.TextAppearance_fontVariationSettings)) ? null : a2.mo1745d(C3102j.TextAppearance_fontVariationSettings);
            a2.mo1737a();
        } else {
            str2 = null;
            colorStateList3 = null;
            str = null;
            colorStateList2 = null;
            z2 = false;
            z = false;
            colorStateList = null;
        }
        C0275t0 a3 = C0275t0.m1311a(context, attributeSet2, C3102j.TextAppearance, i3, 0);
        if (!z3 && a3.mo1751g(C3102j.TextAppearance_textAllCaps)) {
            z2 = a3.mo1738a(C3102j.TextAppearance_textAllCaps, false);
            z = true;
        }
        if (VERSION.SDK_INT < 23) {
            if (a3.mo1751g(C3102j.TextAppearance_android_textColor)) {
                colorStateList = a3.mo1735a(C3102j.TextAppearance_android_textColor);
            }
            if (a3.mo1751g(C3102j.TextAppearance_android_textColorHint)) {
                colorStateList3 = a3.mo1735a(C3102j.TextAppearance_android_textColorHint);
            }
            if (a3.mo1751g(C3102j.TextAppearance_android_textColorLink)) {
                colorStateList2 = a3.mo1735a(C3102j.TextAppearance_android_textColorLink);
            }
        }
        if (a3.mo1751g(C3102j.TextAppearance_textLocale)) {
            str2 = a3.mo1745d(C3102j.TextAppearance_textLocale);
        }
        if (VERSION.SDK_INT >= 26 && a3.mo1751g(C3102j.TextAppearance_fontVariationSettings)) {
            str = a3.mo1745d(C3102j.TextAppearance_fontVariationSettings);
        }
        if (VERSION.SDK_INT < 28 || !a3.mo1751g(C3102j.TextAppearance_android_textSize) || a3.mo1742c(C3102j.TextAppearance_android_textSize, -1) != 0) {
            jVar = b;
        } else {
            jVar = b;
            this.f1217a.setTextSize(0, 0.0f);
        }
        m1374a(context, a3);
        a3.mo1737a();
        if (colorStateList != null) {
            this.f1217a.setTextColor(colorStateList);
        }
        if (colorStateList3 != null) {
            this.f1217a.setHintTextColor(colorStateList3);
        }
        if (colorStateList2 != null) {
            this.f1217a.setLinkTextColor(colorStateList2);
        }
        if (!z3 && z) {
            mo1803a(z2);
        }
        Typeface typeface = this.f1228l;
        if (typeface != null) {
            if (this.f1227k == -1) {
                this.f1217a.setTypeface(typeface, this.f1226j);
            } else {
                this.f1217a.setTypeface(typeface);
            }
        }
        if (str != null) {
            this.f1217a.setFontVariationSettings(str);
        }
        if (str2 != null) {
            int i4 = VERSION.SDK_INT;
            if (i4 >= 24) {
                this.f1217a.setTextLocales(LocaleList.forLanguageTags(str2));
            } else if (i4 >= 21) {
                this.f1217a.setTextLocale(Locale.forLanguageTag(str2.substring(0, str2.indexOf(44))));
            }
        }
        this.f1225i.mo1824a(attributeSet2, i3);
        if (C0384b.f1807a && this.f1225i.mo1831f() != 0) {
            int[] e = this.f1225i.mo1830e();
            if (e.length > 0) {
                if (((float) this.f1217a.getAutoSizeStepGranularity()) != -1.0f) {
                    this.f1217a.setAutoSizeTextTypeUniformWithConfiguration(this.f1225i.mo1828c(), this.f1225i.mo1826b(), this.f1225i.mo1829d(), 0);
                } else {
                    this.f1217a.setAutoSizeTextTypeUniformWithPresetSizes(e, 0);
                }
            }
        }
        C0275t0 a4 = C0275t0.m1310a(context, attributeSet2, C3102j.AppCompatTextView);
        int g2 = a4.mo1750g(C3102j.AppCompatTextView_drawableLeftCompat, -1);
        C0236j jVar2 = jVar;
        Drawable a5 = g2 != -1 ? jVar2.mo1474a(context, g2) : null;
        int g3 = a4.mo1750g(C3102j.AppCompatTextView_drawableTopCompat, -1);
        Drawable a6 = g3 != -1 ? jVar2.mo1474a(context, g3) : null;
        int g4 = a4.mo1750g(C3102j.AppCompatTextView_drawableRightCompat, -1);
        Drawable a7 = g4 != -1 ? jVar2.mo1474a(context, g4) : null;
        int g5 = a4.mo1750g(C3102j.AppCompatTextView_drawableBottomCompat, -1);
        Drawable a8 = g5 != -1 ? jVar2.mo1474a(context, g5) : null;
        int g6 = a4.mo1750g(C3102j.AppCompatTextView_drawableStartCompat, -1);
        Drawable a9 = g6 != -1 ? jVar2.mo1474a(context, g6) : null;
        int g7 = a4.mo1750g(C3102j.AppCompatTextView_drawableEndCompat, -1);
        m1375a(a5, a6, a7, a8, a9, g7 != -1 ? jVar2.mo1474a(context, g7) : null);
        if (a4.mo1751g(C3102j.AppCompatTextView_drawableTint)) {
            C0391i.m2028a(this.f1217a, a4.mo1735a(C3102j.AppCompatTextView_drawableTint));
        }
        if (a4.mo1751g(C3102j.AppCompatTextView_drawableTintMode)) {
            i2 = -1;
            C0391i.m2029a(this.f1217a, C0189a0.m975a(a4.mo1744d(C3102j.AppCompatTextView_drawableTintMode, -1), null));
        } else {
            i2 = -1;
        }
        int c = a4.mo1742c(C3102j.AppCompatTextView_firstBaselineToTopHeight, i2);
        int c2 = a4.mo1742c(C3102j.AppCompatTextView_lastBaselineToBottomHeight, i2);
        int c3 = a4.mo1742c(C3102j.AppCompatTextView_lineHeight, i2);
        a4.mo1737a();
        if (c != i2) {
            C0391i.m2027a(this.f1217a, c);
        }
        if (c2 != i2) {
            C0391i.m2035b(this.f1217a, c2);
        }
        if (c3 != i2) {
            C0391i.m2037c(this.f1217a, c3);
        }
    }

    /* renamed from: a */
    public void mo1802a(Runnable runnable) {
        this.f1217a.post(runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1803a(boolean z) {
        this.f1217a.setAllCaps(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1804a(boolean z, int i, int i2, int i3, int i4) {
        if (!C0384b.f1807a) {
            mo1806b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1805a(int[] iArr, int i) {
        this.f1225i.mo1825a(iArr, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo1806b() {
        this.f1225i.mo1820a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo1807c() {
        return this.f1225i.mo1826b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo1808d() {
        return this.f1225i.mo1828c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo1809e() {
        return this.f1225i.mo1829d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int[] mo1810f() {
        return this.f1225i.mo1830e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo1811g() {
        return this.f1225i.mo1831f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public ColorStateList mo1812h() {
        C0260r0 r0Var = this.f1224h;
        if (r0Var != null) {
            return r0Var.f1151a;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public Mode mo1813i() {
        C0260r0 r0Var = this.f1224h;
        if (r0Var != null) {
            return r0Var.f1152b;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public boolean mo1814j() {
        return this.f1225i.mo1832g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1815k() {
        mo1793a();
    }
}
