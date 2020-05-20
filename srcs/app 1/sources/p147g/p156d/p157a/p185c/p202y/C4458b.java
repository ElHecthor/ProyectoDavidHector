package p147g.p156d.p157a.p185c.p202y;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: g.d.a.c.y.b */
public class C4458b {
    /* renamed from: a */
    public static int m18169a(Context context, int i, String str) {
        TypedValue a = m18171a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)}));
    }

    /* renamed from: a */
    public static int m18170a(View view, int i) {
        return m18169a(view.getContext(), i, view.getClass().getCanonicalName());
    }

    /* renamed from: a */
    public static TypedValue m18171a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m18172a(Context context, int i, boolean z) {
        TypedValue a = m18171a(context, i);
        return (a == null || a.type != 18) ? z : a.data != 0;
    }
}
