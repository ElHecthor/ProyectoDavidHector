package p071f.p097h.p104i;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

/* renamed from: f.h.i.d */
public class C3281d {
    /* renamed from: a */
    public static boolean m13446a(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
        }
        return true;
    }
}
