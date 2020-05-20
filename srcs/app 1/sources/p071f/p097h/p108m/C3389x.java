package p071f.p097h.p108m;

import android.os.Build.VERSION;
import android.view.ViewGroup;
import p071f.p097h.C3234c;

/* renamed from: f.h.m.x */
public final class C3389x {
    /* renamed from: a */
    public static boolean m13881a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C3234c.tag_transition_group);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C3379v.m13835v(viewGroup) == null) ? false : true;
    }
}
