package p333l.p334a.p335a.p336a;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: l.a.a.a.a */
public class C6223a {
    /* renamed from: a */
    static View m23304a(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    /* renamed from: b */
    public static boolean m23305b(Activity activity) {
        Rect rect = new Rect();
        View a = m23304a(activity);
        a.getWindowVisibleDisplayFrame(rect);
        int height = a.getRootView().getHeight();
        return ((double) (height - rect.height())) > ((double) height) * 0.15d;
    }
}
