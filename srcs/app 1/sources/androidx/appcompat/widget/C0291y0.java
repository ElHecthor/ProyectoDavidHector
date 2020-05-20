package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;

/* renamed from: androidx.appcompat.widget.y0 */
public class C0291y0 extends Resources {

    /* renamed from: b */
    private static boolean f1269b = false;

    /* renamed from: a */
    private final WeakReference<Context> f1270a;

    public C0291y0(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1270a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public static boolean m1458a() {
        return f1269b;
    }

    /* renamed from: b */
    public static boolean m1459b() {
        return m1458a() && VERSION.SDK_INT <= 20;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Drawable mo1844a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f1270a.get();
        return context != null ? C0229i0.m1135a().mo1461a(context, this, i) : super.getDrawable(i);
    }
}
