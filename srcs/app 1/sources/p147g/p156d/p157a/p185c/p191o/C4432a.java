package p147g.p156d.p157a.p185c.p191o;

import android.graphics.Canvas;
import android.os.Build.VERSION;

/* renamed from: g.d.a.c.o.a */
public class C4432a {
    /* renamed from: a */
    public static int m18091a(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return VERSION.SDK_INT > 21 ? canvas.saveLayerAlpha(f, f2, f3, f4, i) : canvas.saveLayerAlpha(f, f2, f3, f4, i, 31);
    }
}
