package p071f.p115k.p117c;

import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.text.style.ReplacementSpan;
import p071f.p097h.p107l.C3321h;

/* renamed from: f.k.c.d */
public abstract class C3434d extends ReplacementSpan {

    /* renamed from: f */
    private final FontMetricsInt f9715f = new FontMetricsInt();

    /* renamed from: g */
    private final C3429b f9716g;

    /* renamed from: h */
    private short f9717h = -1;

    /* renamed from: i */
    private float f9718i = 1.0f;

    C3434d(C3429b bVar) {
        C3321h.m13544a(bVar, (Object) "metadata cannot be null");
        this.f9716g = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C3429b mo10963a() {
        return this.f9716g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo10964b() {
        return this.f9717h;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f9715f);
        FontMetricsInt fontMetricsInt2 = this.f9715f;
        this.f9718i = (((float) Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent)) * 1.0f) / ((float) this.f9716g.mo10951c());
        this.f9716g.mo10951c();
        this.f9717h = (short) ((int) (((float) this.f9716g.mo10954f()) * this.f9718i));
        if (fontMetricsInt != null) {
            FontMetricsInt fontMetricsInt3 = this.f9715f;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return this.f9717h;
    }
}
