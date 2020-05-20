package p071f.p115k.p117c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.text.TextPaint;

/* renamed from: f.k.c.g */
public final class C3441g extends C3434d {

    /* renamed from: j */
    private static Paint f9731j;

    public C3441g(C3429b bVar) {
        super(bVar);
    }

    /* renamed from: c */
    private static Paint m14114c() {
        if (f9731j == null) {
            TextPaint textPaint = new TextPaint();
            f9731j = textPaint;
            textPaint.setColor(C3419a.m14025e().mo10926a());
            f9731j.setStyle(Style.FILL);
        }
        return f9731j;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (C3419a.m14025e().mo10935c()) {
            canvas.drawRect(f, (float) i3, f + ((float) mo10964b()), (float) i5, m14114c());
        }
        mo10963a().mo10948a(canvas, f, (float) i4, paint);
    }
}
