package p071f.p124o.p125a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
/* renamed from: f.o.a.a */
public abstract class C3454a extends BroadcastReceiver {

    /* renamed from: a */
    private static final SparseArray<WakeLock> f9791a = new SparseArray<>();

    /* renamed from: b */
    private static int f9792b = 1;

    /* renamed from: a */
    public static boolean m14161a(Intent intent) {
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f9791a) {
            WakeLock wakeLock = (WakeLock) f9791a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f9791a.remove(intExtra);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("No active wake lock id #");
            sb.append(intExtra);
            Log.w("WakefulBroadcastReceiv.", sb.toString());
            return true;
        }
    }

    /* renamed from: b */
    public static ComponentName m14162b(Context context, Intent intent) {
        synchronized (f9791a) {
            int i = f9792b;
            int i2 = f9792b + 1;
            f9792b = i2;
            if (i2 <= 0) {
                f9792b = 1;
            }
            intent.putExtra("androidx.contentpager.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.core:wake:");
            sb.append(startService.flattenToShortString());
            WakeLock newWakeLock = powerManager.newWakeLock(1, sb.toString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f9791a.put(i, newWakeLock);
            return startService;
        }
    }
}
