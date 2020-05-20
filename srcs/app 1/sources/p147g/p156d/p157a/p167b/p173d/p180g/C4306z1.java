package p147g.p156d.p157a.p167b.p173d.p180g;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: g.d.a.b.d.g.z1 */
public final class C4306z1 {

    /* renamed from: a */
    private static volatile C4149p2<Boolean> f11455a = C4149p2.m16915c();

    /* renamed from: b */
    private static final Object f11456b = new Object();

    /* renamed from: a */
    private static boolean m17639a(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                return true;
            }
        } catch (NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m17640a(Context context, Uri uri) {
        boolean z;
        String authority = uri.getAuthority();
        boolean z2 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        }
        if (!f11455a.mo12670a()) {
            synchronized (f11456b) {
                if (f11455a.mo12670a()) {
                    boolean booleanValue = ((Boolean) f11455a.mo12671b()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        z = false;
                        if (z && m17639a(context)) {
                            z2 = true;
                        }
                        f11455a = C4149p2.m16914a(Boolean.valueOf(z2));
                    }
                }
                z = true;
                z2 = true;
                f11455a = C4149p2.m16914a(Boolean.valueOf(z2));
            }
        }
        return ((Boolean) f11455a.mo12671b()).booleanValue();
    }
}
