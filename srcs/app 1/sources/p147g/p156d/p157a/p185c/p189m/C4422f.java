package p147g.p156d.p157a.p185c.p189m;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: g.d.a.c.m.f */
public class C4422f extends Property<ImageView, Matrix> {

    /* renamed from: a */
    private final Matrix f11721a = new Matrix();

    public C4422f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f11721a.set(imageView.getImageMatrix());
        return this.f11721a;
    }

    /* renamed from: a */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
