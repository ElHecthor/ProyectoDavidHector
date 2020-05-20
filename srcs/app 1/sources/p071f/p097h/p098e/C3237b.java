package p071f.p097h.p098e;

import android.content.Context;
import android.os.Process;
import androidx.core.app.C0352d;

/* renamed from: f.h.e.b */
public final class C3237b {
    /* renamed from: a */
    public static int m13273a(Context context, String str) {
        return m13274a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    /* renamed from: a */
    public static int m13274a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0352d.m1795a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0352d.m1794a(context, a, str2) != 0 ? -2 : 0;
    }
}
