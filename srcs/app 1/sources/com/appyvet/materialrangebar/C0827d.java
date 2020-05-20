package com.appyvet.materialrangebar;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.drawable.C0371a;
import p071f.p097h.p098e.C3236a;

/* renamed from: com.appyvet.materialrangebar.d */
class C0827d extends View {

    /* renamed from: A */
    private boolean f3244A = false;

    /* renamed from: B */
    private int f3245B;

    /* renamed from: f */
    private float f3246f;

    /* renamed from: g */
    private boolean f3247g = false;

    /* renamed from: h */
    private float f3248h;

    /* renamed from: i */
    private float f3249i;

    /* renamed from: j */
    private Paint f3250j;

    /* renamed from: k */
    private Drawable f3251k;

    /* renamed from: l */
    private String f3252l;

    /* renamed from: m */
    private int f3253m;

    /* renamed from: n */
    private float f3254n;

    /* renamed from: o */
    private float f3255o;

    /* renamed from: p */
    private Rect f3256p = new Rect();

    /* renamed from: q */
    private Resources f3257q;

    /* renamed from: r */
    private float f3258r;

    /* renamed from: s */
    private Paint f3259s;

    /* renamed from: t */
    private Paint f3260t;

    /* renamed from: u */
    private float f3261u;

    /* renamed from: v */
    private float f3262v;

    /* renamed from: w */
    private C0826c f3263w;

    /* renamed from: x */
    private float f3264x = 8.0f;

    /* renamed from: y */
    private float f3265y = 24.0f;

    /* renamed from: z */
    private boolean f3266z;

    public C0827d(Context context) {
        super(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001d, code lost:
        if (r4 > r3) goto L_0x0017;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4428a(android.graphics.Paint r2, java.lang.String r3, float r4) {
        /*
            r1 = this;
            r0 = 1092616192(0x41200000, float:10.0)
            r2.setTextSize(r0)
            float r3 = r2.measureText(r3)
            r0 = 1090519040(0x41000000, float:8.0)
            float r4 = r4 * r0
            float r4 = r4 / r3
            float r3 = r1.f3258r
            float r4 = r4 / r3
            float r3 = r1.f3264x
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
        L_0x0017:
            r4 = r3
            goto L_0x0020
        L_0x0019:
            float r3 = r1.f3265y
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            goto L_0x0017
        L_0x0020:
            float r3 = r1.f3258r
            float r4 = r4 * r3
            r2.setTextSize(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appyvet.materialrangebar.C0827d.m4428a(android.graphics.Paint, java.lang.String, float):void");
    }

    /* renamed from: a */
    public void mo4498a() {
        this.f3247g = true;
        this.f3244A = true;
    }

    /* renamed from: a */
    public void mo4499a(Context context, float f, float f2, int i, int i2, float f3, int i3, int i4, float f4, float f5, float f6, boolean z) {
        this.f3257q = context.getResources();
        this.f3251k = C3236a.m13271c(context, C0828e.rotate);
        float f7 = getResources().getDisplayMetrics().density;
        this.f3258r = f7;
        this.f3264x = f5 / f7;
        this.f3265y = f6 / f7;
        this.f3266z = z;
        this.f3254n = (float) ((int) TypedValue.applyDimension(1, 15.0f, this.f3257q.getDisplayMetrics()));
        this.f3261u = f3;
        this.f3255o = (float) ((int) TypedValue.applyDimension(1, 3.5f, this.f3257q.getDisplayMetrics()));
        this.f3253m = (int) (f2 == -1.0f ? TypedValue.applyDimension(1, 14.0f, this.f3257q.getDisplayMetrics()) : TypedValue.applyDimension(1, f2, this.f3257q.getDisplayMetrics()));
        int applyDimension = (int) TypedValue.applyDimension(2, 15.0f, this.f3257q.getDisplayMetrics());
        Paint paint = new Paint();
        this.f3250j = paint;
        paint.setColor(i2);
        this.f3250j.setAntiAlias(true);
        this.f3250j.setTextSize((float) applyDimension);
        Paint paint2 = new Paint();
        this.f3259s = paint2;
        paint2.setColor(i3);
        this.f3259s.setAntiAlias(true);
        if (f4 != 0.0f) {
            Paint paint3 = new Paint();
            this.f3260t = paint3;
            paint3.setStyle(Style.STROKE);
            this.f3260t.setColor(i4);
            this.f3260t.setStrokeWidth(f4);
            this.f3260t.setAntiAlias(true);
            this.f3262v = this.f3261u - (this.f3260t.getStrokeWidth() / 2.0f);
        }
        this.f3245B = i;
        this.f3246f = TypedValue.applyDimension(1, (float) ((int) Math.max(24.0f, (float) this.f3253m)), this.f3257q.getDisplayMetrics());
        this.f3248h = f;
    }

    /* renamed from: a */
    public void mo4500a(C0826c cVar) {
        this.f3263w = cVar;
    }

    /* renamed from: a */
    public void mo4501a(String str) {
        this.f3252l = str;
    }

    /* renamed from: a */
    public boolean mo4502a(float f, float f2) {
        return Math.abs(f - this.f3249i) <= this.f3246f && Math.abs((f2 - this.f3248h) + this.f3254n) <= this.f3246f;
    }

    /* renamed from: b */
    public void mo4503b() {
        this.f3247g = false;
    }

    /* renamed from: b */
    public void mo4504b(float f, float f2) {
        this.f3254n = (float) ((int) f2);
        this.f3253m = (int) f;
        invalidate();
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(this.f3249i, this.f3248h, this.f3261u, this.f3259s);
        Paint paint = this.f3260t;
        if (paint != null) {
            canvas.drawCircle(this.f3249i, this.f3248h, this.f3262v, paint);
        }
        if (this.f3253m > 0 && (this.f3244A || !this.f3266z)) {
            Rect rect = this.f3256p;
            float f = this.f3249i;
            int i = (int) f;
            int i2 = this.f3253m;
            int i3 = i - i2;
            float f2 = this.f3248h;
            int i4 = ((int) f2) - (i2 * 2);
            float f3 = this.f3254n;
            rect.set(i3, i4 - ((int) f3), ((int) f) + i2, ((int) f2) - ((int) f3));
            this.f3251k.setBounds(this.f3256p);
            String str = this.f3252l;
            C0826c cVar = this.f3263w;
            if (cVar != null) {
                str = cVar.mo4497a(str);
            }
            m4428a(this.f3250j, str, (float) this.f3256p.width());
            this.f3250j.getTextBounds(str, 0, str.length(), this.f3256p);
            this.f3250j.setTextAlign(Align.CENTER);
            C0371a.m1906b(this.f3251k, this.f3245B);
            this.f3251k.draw(canvas);
            canvas.drawText(str, this.f3249i, ((this.f3248h - ((float) this.f3253m)) - this.f3254n) + this.f3255o, this.f3250j);
        }
        super.draw(canvas);
    }

    public float getX() {
        return this.f3249i;
    }

    public boolean isPressed() {
        return this.f3247g;
    }

    public void setX(float f) {
        this.f3249i = f;
    }
}
