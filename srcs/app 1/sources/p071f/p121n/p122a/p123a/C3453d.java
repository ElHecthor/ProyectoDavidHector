package p071f.p121n.p122a.p123a;

import android.view.animation.Interpolator;

/* renamed from: f.n.a.a.d */
abstract class C3453d implements Interpolator {

    /* renamed from: a */
    private final float[] f9789a;

    /* renamed from: b */
    private final float f9790b;

    protected C3453d(float[] fArr) {
        this.f9789a = fArr;
        this.f9790b = 1.0f / ((float) (fArr.length - 1));
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f9789a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f9790b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f9789a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
