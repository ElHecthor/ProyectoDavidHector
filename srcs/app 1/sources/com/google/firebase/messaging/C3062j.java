package com.google.firebase.messaging;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.j */
final class C3062j {

    /* renamed from: a */
    private final Executor f8714a;

    /* renamed from: b */
    private final Context f8715b;

    /* renamed from: c */
    private final C3077y f8716c;

    public C3062j(Context context, C3077y yVar, Executor executor) {
        this.f8714a = executor;
        this.f8715b = context;
        this.f8716c = yVar;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9839a() {
        /*
            r10 = this;
            com.google.firebase.messaging.y r0 = r10.f8716c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.mo9858b(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r10.f8715b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 != 0) goto L_0x0058
            boolean r0 = com.google.android.gms.common.util.C2197l.m9005h()
            if (r0 != 0) goto L_0x0028
            r3 = 10
            android.os.SystemClock.sleep(r3)
        L_0x0028:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r10.f8715b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0058
            java.util.Iterator r3 = r3.iterator()
        L_0x0040:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0058
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0040
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x0058
            r0 = 1
            goto L_0x0059
        L_0x0058:
            r0 = 0
        L_0x0059:
            if (r0 == 0) goto L_0x005c
            return r2
        L_0x005c:
            com.google.firebase.messaging.y r0 = r10.f8716c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.mo9856a(r3)
            com.google.firebase.messaging.v r0 = com.google.firebase.messaging.C3074v.m12472c(r0)
            if (r0 == 0) goto L_0x006f
            java.util.concurrent.Executor r3 = r10.f8714a
            r0.mo9850a(r3)
        L_0x006f:
            android.content.Context r3 = r10.f8715b
            com.google.firebase.messaging.y r4 = r10.f8716c
            com.google.firebase.messaging.d r3 = com.google.firebase.messaging.C3061i.m12452a(r3, r4)
            androidx.core.app.i$e r4 = r3.f8683a
            java.lang.String r5 = "FirebaseMessaging"
            if (r0 == 0) goto L_0x00de
            g.d.a.b.g.h r6 = r0.mo9849a()     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            r7 = 5
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            java.lang.Object r6 = p147g.p156d.p157a.p167b.p184g.C4354k.m17759a(r6, r7, r9)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            r4.mo2199a(r6)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            androidx.core.app.i$b r7 = new androidx.core.app.i$b     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            r7.<init>()     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            r7.mo2190b(r6)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            r6 = 0
            r7.mo2188a(r6)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            r4.mo2201a(r7)     // Catch:{ ExecutionException -> 0x00b7, InterruptedException -> 0x00a7, TimeoutException -> 0x009e }
            goto L_0x00de
        L_0x009e:
            java.lang.String r4 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r5, r4)
            r0.close()
            goto L_0x00de
        L_0x00a7:
            java.lang.String r4 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r5, r4)
            r0.close()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            goto L_0x00de
        L_0x00b7:
            r0 = move-exception
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r4 = r4 + 26
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Failed to download image: "
            r6.append(r4)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            android.util.Log.w(r5, r0)
        L_0x00de:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r0)
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "Showing notification"
            android.util.Log.d(r5, r0)
        L_0x00ea:
            android.content.Context r0 = r10.f8715b
            java.lang.String r4 = "notification"
            java.lang.Object r0 = r0.getSystemService(r4)
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            java.lang.String r4 = r3.f8684b
            androidx.core.app.i$e r3 = r3.f8683a
            android.app.Notification r3 = r3.mo2193a()
            r0.notify(r4, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C3062j.mo9839a():boolean");
    }
}
