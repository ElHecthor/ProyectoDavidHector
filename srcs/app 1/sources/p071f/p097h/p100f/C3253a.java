package p071f.p097h.p100f;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.os.Build.VERSION;

/* renamed from: f.h.f.a */
public class C3253a {
    /* renamed from: a */
    public static ColorFilter m13340a(int i, C3254b bVar) {
        BlendModeColorFilter blendModeColorFilter = null;
        if (VERSION.SDK_INT >= 29) {
            BlendMode a = C3255c.m13341a(bVar);
            if (a != null) {
                blendModeColorFilter = new BlendModeColorFilter(i, a);
            }
            return blendModeColorFilter;
        }
        Mode b = C3255c.m13342b(bVar);
        if (b != null) {
            blendModeColorFilter = new PorterDuffColorFilter(i, b);
        }
        return blendModeColorFilter;
    }
}
