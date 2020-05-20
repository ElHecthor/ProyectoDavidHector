package p071f.p139v;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: f.v.h */
class C3594h<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f10084a;

    /* renamed from: b */
    private final PathMeasure f10085b;

    /* renamed from: c */
    private final float f10086c;

    /* renamed from: d */
    private final float[] f10087d = new float[2];

    /* renamed from: e */
    private final PointF f10088e = new PointF();

    /* renamed from: f */
    private float f10089f;

    C3594h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f10084a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f10085b = pathMeasure;
        this.f10086c = pathMeasure.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f10089f = f.floatValue();
        this.f10085b.getPosTan(this.f10086c * f.floatValue(), this.f10087d, null);
        PointF pointF = this.f10088e;
        float[] fArr = this.f10087d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f10084a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f10089f);
    }
}
