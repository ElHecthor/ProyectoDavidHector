package p071f.p139v;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: f.v.i */
class C3596i {
    /* renamed from: a */
    static PropertyValuesHolder m14627a(Property<?, PointF> property, Path path) {
        return VERSION.SDK_INT >= 21 ? PropertyValuesHolder.ofObject(property, null, path) : PropertyValuesHolder.ofFloat(new C3594h(property, path), new float[]{0.0f, 1.0f});
    }
}
