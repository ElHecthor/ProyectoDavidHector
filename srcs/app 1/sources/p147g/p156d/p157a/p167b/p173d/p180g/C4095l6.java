package p147g.p156d.p157a.p167b.p173d.p180g;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* renamed from: g.d.a.b.d.g.l6 */
public final class C4095l6 {

    /* renamed from: b */
    private static final Method f11082b = m16759a();

    /* renamed from: c */
    private static final Method f11083c = m16760b();

    /* renamed from: a */
    private final JobScheduler f11084a;

    private C4095l6(JobScheduler jobScheduler) {
        this.f11084a = jobScheduler;
    }

    /* renamed from: a */
    private final int m16757a(JobInfo jobInfo, String str, int i, String str2) {
        Method method = f11082b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f11084a, new Object[]{jobInfo, str, Integer.valueOf(i), str2})).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f11084a.schedule(jobInfo);
    }

    /* renamed from: a */
    public static int m16758a(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (f11082b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new C4095l6(jobScheduler).m16757a(jobInfo, str, m16761c(), str2);
    }

    /* renamed from: a */
    private static Method m16759a() {
        Class<String> cls = String.class;
        if (VERSION.SDK_INT >= 24) {
            try {
                return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", new Class[]{JobInfo.class, cls, Integer.TYPE, cls});
            } catch (NoSuchMethodException unused) {
                String str = "JobSchedulerCompat";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "No scheduleAsPackage method available, falling back to schedule");
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private static Method m16760b() {
        if (VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                String str = "JobSchedulerCompat";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "No myUserId method available");
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    private static int m16761c() {
        Method method = f11083c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                String str = "JobSchedulerCompat";
                if (Log.isLoggable(str, 6)) {
                    Log.e(str, "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }
}
