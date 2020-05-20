package com.appyvet.materialrangebar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Rect;
import android.util.TypedValue;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appyvet.materialrangebar.a */
public class C0824a {

    /* renamed from: a */
    private final Resources f3222a;

    /* renamed from: b */
    private final Paint f3223b;

    /* renamed from: c */
    private final Paint f3224c;

    /* renamed from: d */
    private Paint f3225d;

    /* renamed from: e */
    private final float f3226e;

    /* renamed from: f */
    private final float f3227f;

    /* renamed from: g */
    private final float f3228g;

    /* renamed from: h */
    private int f3229h;

    /* renamed from: i */
    private float f3230i;

    /* renamed from: j */
    private final float f3231j;

    /* renamed from: k */
    private int f3232k;

    /* renamed from: l */
    private int f3233l;

    /* renamed from: m */
    private CharSequence[] f3234m;

    /* renamed from: n */
    private CharSequence[] f3235n;

    /* renamed from: o */
    private String f3236o;

    /* renamed from: p */
    private float f3237p;

    /* renamed from: q */
    private int f3238q;

    /* renamed from: r */
    private List<Integer> f3239r;

    public C0824a(Context context, float f, float f2, float f3, int i, float f4, float f5, int i2, boolean z) {
        this.f3239r = new ArrayList();
        this.f3222a = context.getResources();
        this.f3226e = f;
        this.f3227f = f + f3;
        this.f3228g = f2;
        int i3 = i - 1;
        this.f3229h = i3;
        this.f3230i = f3 / ((float) i3);
        this.f3231j = f4;
        Paint paint = new Paint();
        this.f3223b = paint;
        paint.setColor(i2);
        this.f3223b.setStrokeWidth(f5);
        this.f3223b.setAntiAlias(true);
        if (z) {
            this.f3223b.setStrokeCap(Cap.ROUND);
        }
        Paint paint2 = new Paint();
        this.f3224c = paint2;
        paint2.setStrokeWidth(f5);
        this.f3224c.setAntiAlias(true);
    }

    public C0824a(Context context, float f, float f2, float f3, int i, float f4, float f5, int i2, boolean z, int i3, int i4, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, String str, float f6) {
        this(context, f, f2, f3, i, f4, f5, i2, z);
        if (charSequenceArr != null || charSequenceArr2 != null) {
            Paint paint = new Paint();
            this.f3225d = paint;
            paint.setColor(i3);
            this.f3225d.setAntiAlias(true);
            this.f3232k = i3;
            this.f3233l = i4;
            this.f3234m = charSequenceArr;
            this.f3235n = charSequenceArr2;
            this.f3236o = str;
            this.f3237p = f6;
        }
    }

    public C0824a(Context context, float f, float f2, float f3, int i, float f4, int i2, List<Integer> list, float f5, int i3, boolean z, int i4, int i5, CharSequence[] charSequenceArr, CharSequence[] charSequenceArr2, String str, float f6) {
        this(context, f, f2, f3, i, f4, f5, i3, z, i4, i5, charSequenceArr, charSequenceArr2, str, f6);
        this.f3238q = i2;
        this.f3239r = list;
    }

    /* renamed from: a */
    private Paint m4412a(int i) {
        List<Integer> list = this.f3239r;
        if (list == null || i >= list.size()) {
            this.f3224c.setColor(this.f3238q);
        } else {
            this.f3224c.setColor(((Integer) this.f3239r.get(i)).intValue());
        }
        return this.f3224c;
    }

    /* renamed from: a */
    private String m4413a(int i, CharSequence[] charSequenceArr) {
        return i >= charSequenceArr.length ? this.f3236o : charSequenceArr[i].toString();
    }

    /* renamed from: a */
    private void m4414a(Canvas canvas, String str, float f, float f2, boolean z, boolean z2, boolean z3, C0827d dVar, C0827d dVar2) {
        Rect rect = new Rect();
        boolean z4 = false;
        this.f3225d.getTextBounds(str, 0, str.length(), rect);
        float width = f - ((float) (rect.width() / 2));
        if (z) {
            width += this.f3231j;
        } else if (z2) {
            width -= this.f3231j;
        }
        boolean z5 = dVar.getX() == f;
        if (!z5 && dVar2 != null) {
            if (dVar2.getX() == f) {
                z4 = true;
            }
            z5 = z4;
        }
        this.f3225d.setColor(z5 ? this.f3233l : this.f3232k);
        float f3 = this.f3228g;
        float height = (float) rect.height();
        canvas.drawText(str, width, z3 ? (f3 - height) - f2 : f3 + height + f2, this.f3225d);
    }

    /* renamed from: b */
    private String m4415b(int i) {
        return m4413a(i, this.f3235n);
    }

    /* renamed from: c */
    private String m4416c(int i) {
        return m4413a(i, this.f3234m);
    }

    /* renamed from: a */
    public float mo4488a() {
        return this.f3226e;
    }

    /* renamed from: a */
    public float mo4489a(C0827d dVar) {
        return this.f3226e + (((float) mo4494b(dVar)) * this.f3230i);
    }

    /* renamed from: a */
    public void mo4490a(Canvas canvas) {
        float f = this.f3226e;
        float f2 = this.f3228g;
        canvas.drawLine(f, f2, this.f3227f, f2, this.f3223b);
    }

    /* renamed from: a */
    public void mo4491a(Canvas canvas, float f, C0827d dVar) {
        mo4492a(canvas, f, dVar, null);
    }

    /* renamed from: a */
    public void mo4492a(Canvas canvas, float f, C0827d dVar, C0827d dVar2) {
        boolean z;
        int i;
        float f2;
        Canvas canvas2 = canvas;
        if (this.f3225d != null) {
            this.f3225d.setTextSize((float) ((int) TypedValue.applyDimension(2, this.f3237p, this.f3222a.getDisplayMetrics())));
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (true) {
            i = this.f3229h;
            if (i2 >= i) {
                break;
            }
            float f3 = (((float) i2) * this.f3230i) + this.f3226e;
            canvas2.drawCircle(f3, this.f3228g, this.f3231j, m4412a(i2));
            if (z) {
                if (this.f3234m != null) {
                    f2 = f3;
                    m4414a(canvas, m4416c(i2), f3, f, i2 == 0, false, true, dVar, dVar2);
                } else {
                    f2 = f3;
                }
                if (this.f3235n != null) {
                    m4414a(canvas, m4415b(i2), f2, f, i2 == 0, false, false, dVar, dVar2);
                }
            }
            i2++;
        }
        canvas2.drawCircle(this.f3227f, this.f3228g, this.f3231j, m4412a(i));
        if (z) {
            if (this.f3234m != null) {
                m4414a(canvas, m4416c(this.f3229h), this.f3227f, f, false, true, true, dVar, dVar2);
            }
            if (this.f3235n != null) {
                m4414a(canvas, m4415b(this.f3229h), this.f3227f, f, false, true, false, dVar, dVar2);
            }
        }
    }

    /* renamed from: b */
    public float mo4493b() {
        return this.f3227f;
    }

    /* renamed from: b */
    public int mo4494b(C0827d dVar) {
        float x = dVar.getX() - this.f3226e;
        float f = this.f3230i;
        int i = (int) ((x + (f / 2.0f)) / f);
        int i2 = this.f3229h;
        if (i > i2) {
            return i2;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }
}
