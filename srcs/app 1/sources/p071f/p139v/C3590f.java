package p071f.p139v;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: f.v.f */
class C3590f {
    /* renamed from: a */
    static <T> ObjectAnimator m14616a(T t, Property<T, PointF> property, Path path) {
        return VERSION.SDK_INT >= 21 ? ObjectAnimator.ofObject(t, property, null, path) : ObjectAnimator.ofFloat(t, new C3594h(property, path), new float[]{0.0f, 1.0f});
    }
}
