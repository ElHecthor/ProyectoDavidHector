package p147g.p153c.p154a.p155a;

import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: g.c.a.a.m */
class C3736m {

    /* renamed from: g.c.a.a.m$a */
    static /* synthetic */ class C3737a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10602a;

        static {
            int[] iArr = new int[ScaleType.values().length];
            f10602a = iArr;
            try {
                iArr[ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    static int m15286a(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: a */
    static void m15287a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: a */
    static boolean m15288a(ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C3737a.f10602a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }

    /* renamed from: a */
    static boolean m15289a(ImageView imageView) {
        return imageView.getDrawable() != null;
    }
}
