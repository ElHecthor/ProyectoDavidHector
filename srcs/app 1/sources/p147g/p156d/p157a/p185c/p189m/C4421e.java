package p147g.p156d.p157a.p185c.p189m;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Property;
import java.util.WeakHashMap;

/* renamed from: g.d.a.c.m.e */
public class C4421e extends Property<Drawable, Integer> {

    /* renamed from: b */
    public static final Property<Drawable, Integer> f11719b = new C4421e();

    /* renamed from: a */
    private final WeakHashMap<Drawable, Integer> f11720a = new WeakHashMap<>();

    private C4421e() {
        super(Integer.class, "drawableAlphaCompat");
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        return VERSION.SDK_INT >= 19 ? Integer.valueOf(drawable.getAlpha()) : this.f11720a.containsKey(drawable) ? (Integer) this.f11720a.get(drawable) : Integer.valueOf(255);
    }

    /* renamed from: a */
    public void set(Drawable drawable, Integer num) {
        if (VERSION.SDK_INT < 19) {
            this.f11720a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
