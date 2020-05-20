package p071f.p097h.p100f;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build.VERSION;
import p071f.p097h.p107l.C3317d;

/* renamed from: f.h.f.e */
public final class C3258e {

    /* renamed from: a */
    private static final ThreadLocal<C3317d<Rect, Rect>> f9376a = new ThreadLocal<>();

    /* renamed from: a */
    private static C3317d<Rect, Rect> m13347a() {
        C3317d<Rect, Rect> dVar = (C3317d) f9376a.get();
        if (dVar == null) {
            C3317d<Rect, Rect> dVar2 = new C3317d<>(new Rect(), new Rect());
            f9376a.set(dVar2);
            return dVar2;
        }
        ((Rect) dVar.f9493a).setEmpty();
        ((Rect) dVar.f9494b).setEmpty();
        return dVar;
    }

    /* renamed from: a */
    public static boolean m13348a(Paint paint, String str) {
        if (VERSION.SDK_INT >= 23) {
            return paint.hasGlyph(str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        String str2 = "󟿽";
        float measureText = paint.measureText(str2);
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        C3317d a = m13347a();
        paint.getTextBounds(str2, 0, 2, (Rect) a.f9493a);
        paint.getTextBounds(str, 0, length, (Rect) a.f9494b);
        return !((Rect) a.f9493a).equals(a.f9494b);
    }
}
