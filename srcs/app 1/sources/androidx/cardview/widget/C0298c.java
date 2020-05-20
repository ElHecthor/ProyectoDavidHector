package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: androidx.cardview.widget.c */
class C0298c implements C0301e {

    /* renamed from: a */
    final RectF f1285a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    class C0299a implements C0304a {
        C0299a() {
        }

        /* renamed from: a */
        public void mo1878a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0298c.this.f1285a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0298c.this.f1285a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0298c.this.f1285a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0298c.this.f1285a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0298c.this.f1285a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = (rectF2.left + f3) - 1.0f;
                float f6 = rectF2.top;
                canvas.drawRect(f5, f6, (rectF2.right - f3) + 1.0f, f6 + f3, paint2);
                float f7 = (rectF2.left + f3) - 1.0f;
                float f8 = rectF2.bottom;
                canvas.drawRect(f7, f8 - f3, (rectF2.right - f3) + 1.0f, f8, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0298c() {
    }

    /* renamed from: a */
    private C0303g m1518a(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0303g gVar = new C0303g(context.getResources(), colorStateList, f, f2, f3);
        return gVar;
    }

    /* renamed from: j */
    private C0303g m1519j(C0300d dVar) {
        return (C0303g) dVar.mo1876d();
    }

    /* renamed from: a */
    public float mo1879a(C0300d dVar) {
        return m1519j(dVar).mo1916c();
    }

    /* renamed from: a */
    public void mo1877a() {
        C0303g.f1299r = new C0299a();
    }

    /* renamed from: a */
    public void mo1880a(C0300d dVar, float f) {
        m1519j(dVar).mo1910a(f);
        mo1887d(dVar);
    }

    /* renamed from: a */
    public void mo1881a(C0300d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0303g a = m1518a(context, colorStateList, f, f2, f3);
        a.mo1913a(dVar.mo1874b());
        dVar.mo1873a(a);
        mo1887d(dVar);
    }

    /* renamed from: a */
    public void mo1882a(C0300d dVar, ColorStateList colorStateList) {
        m1519j(dVar).mo1911a(colorStateList);
    }

    /* renamed from: b */
    public ColorStateList mo1883b(C0300d dVar) {
        return m1519j(dVar).mo1909a();
    }

    /* renamed from: b */
    public void mo1884b(C0300d dVar, float f) {
        m1519j(dVar).mo1917c(f);
    }

    /* renamed from: c */
    public float mo1885c(C0300d dVar) {
        return m1519j(dVar).mo1921f();
    }

    /* renamed from: c */
    public void mo1886c(C0300d dVar, float f) {
        m1519j(dVar).mo1915b(f);
        mo1887d(dVar);
    }

    /* renamed from: d */
    public void mo1887d(C0300d dVar) {
        Rect rect = new Rect();
        m1519j(dVar).mo1912a(rect);
        dVar.mo1871a((int) Math.ceil((double) mo1890g(dVar)), (int) Math.ceil((double) mo1889f(dVar)));
        dVar.mo1872a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: e */
    public float mo1888e(C0300d dVar) {
        return m1519j(dVar).mo1914b();
    }

    /* renamed from: f */
    public float mo1889f(C0300d dVar) {
        return m1519j(dVar).mo1918d();
    }

    /* renamed from: g */
    public float mo1890g(C0300d dVar) {
        return m1519j(dVar).mo1920e();
    }

    /* renamed from: h */
    public void mo1891h(C0300d dVar) {
    }

    /* renamed from: i */
    public void mo1892i(C0300d dVar) {
        m1519j(dVar).mo1913a(dVar.mo1874b());
        mo1887d(dVar);
    }
}
