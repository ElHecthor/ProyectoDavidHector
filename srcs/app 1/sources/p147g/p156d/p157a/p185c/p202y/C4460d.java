package p147g.p156d.p157a.p185c.p202y;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import p071f.p097h.p098e.p099c.C3248f;
import p071f.p097h.p098e.p099c.C3248f.C3249a;
import p147g.p156d.p157a.p185c.C4416l;

/* renamed from: g.d.a.c.y.d */
public class C4460d {

    /* renamed from: a */
    public final float f11802a;

    /* renamed from: b */
    public final ColorStateList f11803b;

    /* renamed from: c */
    public final int f11804c;

    /* renamed from: d */
    public final int f11805d;

    /* renamed from: e */
    public final String f11806e;

    /* renamed from: f */
    public final ColorStateList f11807f;

    /* renamed from: g */
    public final float f11808g;

    /* renamed from: h */
    public final float f11809h;

    /* renamed from: i */
    public final float f11810i;

    /* renamed from: j */
    private final int f11811j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f11812k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Typeface f11813l;

    /* renamed from: g.d.a.c.y.d$a */
    class C4461a extends C3249a {

        /* renamed from: a */
        final /* synthetic */ C4464f f11814a;

        C4461a(C4464f fVar) {
            this.f11814a = fVar;
        }

        /* renamed from: a */
        public void mo1816a(int i) {
            C4460d.this.f11812k = true;
            this.f11814a.mo8429a(i);
        }

        /* renamed from: a */
        public void mo1817a(Typeface typeface) {
            C4460d dVar = C4460d.this;
            dVar.f11813l = Typeface.create(typeface, dVar.f11804c);
            C4460d.this.f11812k = true;
            this.f11814a.mo8430a(C4460d.this.f11813l, false);
        }
    }

    /* renamed from: g.d.a.c.y.d$b */
    class C4462b extends C4464f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f11816a;

        /* renamed from: b */
        final /* synthetic */ C4464f f11817b;

        C4462b(TextPaint textPaint, C4464f fVar) {
            this.f11816a = textPaint;
            this.f11817b = fVar;
        }

        /* renamed from: a */
        public void mo8429a(int i) {
            this.f11817b.mo8429a(i);
        }

        /* renamed from: a */
        public void mo8430a(Typeface typeface, boolean z) {
            C4460d.this.mo13270a(this.f11816a, typeface);
            this.f11817b.mo8430a(typeface, z);
        }
    }

    public C4460d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, C4416l.TextAppearance);
        this.f11802a = obtainStyledAttributes.getDimension(C4416l.TextAppearance_android_textSize, 0.0f);
        this.f11803b = C4459c.m18175a(context, obtainStyledAttributes, C4416l.TextAppearance_android_textColor);
        C4459c.m18175a(context, obtainStyledAttributes, C4416l.TextAppearance_android_textColorHint);
        C4459c.m18175a(context, obtainStyledAttributes, C4416l.TextAppearance_android_textColorLink);
        this.f11804c = obtainStyledAttributes.getInt(C4416l.TextAppearance_android_textStyle, 0);
        this.f11805d = obtainStyledAttributes.getInt(C4416l.TextAppearance_android_typeface, 1);
        int a = C4459c.m18174a(obtainStyledAttributes, C4416l.TextAppearance_fontFamily, C4416l.TextAppearance_android_fontFamily);
        this.f11811j = obtainStyledAttributes.getResourceId(a, 0);
        this.f11806e = obtainStyledAttributes.getString(a);
        obtainStyledAttributes.getBoolean(C4416l.TextAppearance_textAllCaps, false);
        this.f11807f = C4459c.m18175a(context, obtainStyledAttributes, C4416l.TextAppearance_android_shadowColor);
        this.f11808g = obtainStyledAttributes.getFloat(C4416l.TextAppearance_android_shadowDx, 0.0f);
        this.f11809h = obtainStyledAttributes.getFloat(C4416l.TextAppearance_android_shadowDy, 0.0f);
        this.f11810i = obtainStyledAttributes.getFloat(C4416l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    private void m18182b() {
        if (this.f11813l == null) {
            String str = this.f11806e;
            if (str != null) {
                this.f11813l = Typeface.create(str, this.f11804c);
            }
        }
        if (this.f11813l == null) {
            int i = this.f11805d;
            Typeface typeface = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f11813l = typeface;
            this.f11813l = Typeface.create(this.f11813l, this.f11804c);
        }
    }

    /* renamed from: a */
    public Typeface mo13266a() {
        m18182b();
        return this.f11813l;
    }

    /* renamed from: a */
    public Typeface mo13267a(Context context) {
        if (this.f11812k) {
            return this.f11813l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a = C3248f.m13318a(context, this.f11811j);
                this.f11813l = a;
                if (a != null) {
                    this.f11813l = Typeface.create(a, this.f11804c);
                }
            } catch (NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error loading font ");
                sb.append(this.f11806e);
                Log.d("TextAppearance", sb.toString(), e);
            }
        }
        m18182b();
        this.f11812k = true;
        return this.f11813l;
    }

    /* renamed from: a */
    public void mo13268a(Context context, TextPaint textPaint, C4464f fVar) {
        mo13270a(textPaint, mo13266a());
        mo13269a(context, (C4464f) new C4462b(textPaint, fVar));
    }

    /* renamed from: a */
    public void mo13269a(Context context, C4464f fVar) {
        if (C4463e.m18194a()) {
            mo13267a(context);
        } else {
            m18182b();
        }
        if (this.f11811j == 0) {
            this.f11812k = true;
        }
        if (this.f11812k) {
            fVar.mo8430a(this.f11813l, true);
            return;
        }
        try {
            C3248f.m13323a(context, this.f11811j, new C4461a(fVar), null);
        } catch (NotFoundException unused) {
            this.f11812k = true;
            fVar.mo8429a(1);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error loading font ");
            sb.append(this.f11806e);
            Log.d("TextAppearance", sb.toString(), e);
            this.f11812k = true;
            fVar.mo8429a(-3);
        }
    }

    /* renamed from: a */
    public void mo13270a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f11804c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f11802a);
    }

    /* renamed from: b */
    public void mo13271b(Context context, TextPaint textPaint, C4464f fVar) {
        mo13272c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f11803b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.f11810i;
        float f2 = this.f11808g;
        float f3 = this.f11809h;
        ColorStateList colorStateList2 = this.f11807f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: c */
    public void mo13272c(Context context, TextPaint textPaint, C4464f fVar) {
        if (C4463e.m18194a()) {
            mo13270a(textPaint, mo13267a(context));
        } else {
            mo13268a(context, textPaint, fVar);
        }
    }
}
