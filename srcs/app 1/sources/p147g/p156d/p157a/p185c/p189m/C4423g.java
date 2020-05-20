package p147g.p156d.p157a.p185c.p189m;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: g.d.a.c.m.g */
public class C4423g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f11722a = new float[9];

    /* renamed from: b */
    private final float[] f11723b = new float[9];

    /* renamed from: c */
    private final Matrix f11724c = new Matrix();

    /* renamed from: a */
    public Matrix mo8898a(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f11722a);
        matrix2.getValues(this.f11723b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f11723b;
            float f2 = fArr[i];
            float[] fArr2 = this.f11722a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f11724c.setValues(this.f11723b);
        return this.f11724c;
    }
}
