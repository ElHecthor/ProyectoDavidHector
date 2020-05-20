package p147g.p156d.p157a.p167b.p173d.p180g;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

/* renamed from: g.d.a.b.d.g.o1 */
public class C4134o1 {

    /* renamed from: a */
    private static UserManager f11201a;

    /* renamed from: b */
    private static volatile boolean f11202b = (!m16876a());

    private C4134o1() {
    }

    /* renamed from: a */
    public static boolean m16876a() {
        return VERSION.SDK_INT >= 24;
    }

    /* renamed from: a */
    public static boolean m16877a(Context context) {
        return !m16876a() || m16879c(context);
    }

    @TargetApi(24)
    /* renamed from: b */
    private static boolean m16878b(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (f11201a == null) {
                f11201a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = f11201a;
            if (userManager == null) {
                return true;
            }
            try {
                if (!userManager.isUserUnlocked() && userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
                z = z2;
            } catch (NullPointerException e) {
                Log.w("DirectBootUtils", "Failed to check if user is unlocked.", e);
                f11201a = null;
                i++;
            }
        }
        if (z) {
            f11201a = null;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0018, code lost:
        return r3;
     */
    @android.annotation.TargetApi(24)
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m16879c(android.content.Context r3) {
        /*
            boolean r0 = f11202b
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.Class<g.d.a.b.d.g.o1> r0 = p147g.p156d.p157a.p167b.p173d.p180g.C4134o1.class
            monitor-enter(r0)
            boolean r2 = f11202b     // Catch:{ all -> 0x0019 }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r1
        L_0x000f:
            boolean r3 = m16878b(r3)     // Catch:{ all -> 0x0019 }
            if (r3 == 0) goto L_0x0017
            f11202b = r3     // Catch:{ all -> 0x0019 }
        L_0x0017:
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            return r3
        L_0x0019:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0019 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p157a.p167b.p173d.p180g.C4134o1.m16879c(android.content.Context):boolean");
    }
}
