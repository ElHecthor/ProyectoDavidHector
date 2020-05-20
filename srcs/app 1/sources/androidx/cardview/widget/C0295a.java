package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* renamed from: androidx.cardview.widget.a */
class C0295a extends C0298c {

    /* renamed from: androidx.cardview.widget.a$a */
    class C0296a implements C0304a {
        C0296a(C0295a aVar) {
        }

        /* renamed from: a */
        public void mo1878a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0295a() {
    }

    /* renamed from: a */
    public void mo1877a() {
        C0303g.f1299r = new C0296a(this);
    }
}
