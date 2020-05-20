package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.f0 */
final class C2944f0 implements Runnable {

    /* renamed from: f */
    private final long f8483f;

    /* renamed from: g */
    private final WakeLock f8484g;

    /* renamed from: h */
    private final FirebaseInstanceId f8485h;

    C2944f0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f8485h = firebaseInstanceId;
        this.f8483f = j;
        WakeLock newWakeLock = ((PowerManager) mo9655a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f8484g = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    /* renamed from: c */
    private final boolean m12139c() {
        String str;
        String str2 = "FirebaseInstanceId";
        C2932b0 d = this.f8485h.mo9619d();
        boolean z = true;
        if (!this.f8485h.mo9616a(d)) {
            return true;
        }
        try {
            String e = this.f8485h.mo9620e();
            if (e == null) {
                Log.e(str2, "Token retrieval failed: null");
                return false;
            }
            if (Log.isLoggable(str2, 3)) {
                Log.d(str2, "Token successfully retrieved");
            }
            if ((d == null || (d != null && !e.equals(d.f8446a))) && "[DEFAULT]".equals(this.f8485h.mo9618c().mo9510b())) {
                if (Log.isLoggable(str2, 3)) {
                    String str3 = "Invoking onNewToken for app: ";
                    String valueOf = String.valueOf(this.f8485h.mo9618c().mo9510b());
                    Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", e);
                Context a = mo9655a();
                Intent intent2 = new Intent(a, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                a.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e2) {
            String message = e2.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e2.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                str = sb.toString();
            } else if (e2.getMessage() == null) {
                str = "Token retrieval failed without exception message. Will retry token retrieval";
            } else {
                throw e2;
            }
            Log.w(str2, str);
            return false;
        } catch (SecurityException unused) {
            str = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w(str2, str);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Context mo9655a() {
        return this.f8485h.mo9618c().mo9508a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo9656b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo9655a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        if (com.google.firebase.iid.C2991z.m12211b().mo9709a(mo9655a()) != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        r5.f8484g.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (com.google.firebase.iid.C2991z.m12211b().mo9709a(mo9655a()) == false) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        return;
     */
    @android.annotation.SuppressLint({"Wakelock"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.firebase.iid.z r0 = com.google.firebase.iid.C2991z.m12211b()
            android.content.Context r1 = r5.mo9655a()
            boolean r0 = r0.mo9709a(r1)
            if (r0 == 0) goto L_0x0013
            android.os.PowerManager$WakeLock r0 = r5.f8484g
            r0.acquire()
        L_0x0013:
            r0 = 0
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f8485h     // Catch:{ IOException -> 0x0094 }
            r2 = 1
            r1.mo9615a(r2)     // Catch:{ IOException -> 0x0094 }
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f8485h     // Catch:{ IOException -> 0x0094 }
            boolean r1 = r1.mo9622g()     // Catch:{ IOException -> 0x0094 }
            if (r1 != 0) goto L_0x003b
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f8485h     // Catch:{ IOException -> 0x0094 }
            r1.mo9615a(r0)     // Catch:{ IOException -> 0x0094 }
            com.google.firebase.iid.z r0 = com.google.firebase.iid.C2991z.m12211b()
            android.content.Context r1 = r5.mo9655a()
            boolean r0 = r0.mo9709a(r1)
            if (r0 == 0) goto L_0x003a
            android.os.PowerManager$WakeLock r0 = r5.f8484g
            r0.release()
        L_0x003a:
            return
        L_0x003b:
            com.google.firebase.iid.z r1 = com.google.firebase.iid.C2991z.m12211b()     // Catch:{ IOException -> 0x0094 }
            android.content.Context r2 = r5.mo9655a()     // Catch:{ IOException -> 0x0094 }
            boolean r1 = r1.mo9710b(r2)     // Catch:{ IOException -> 0x0094 }
            if (r1 == 0) goto L_0x006b
            boolean r1 = r5.mo9656b()     // Catch:{ IOException -> 0x0094 }
            if (r1 != 0) goto L_0x006b
            com.google.firebase.iid.e0 r1 = new com.google.firebase.iid.e0     // Catch:{ IOException -> 0x0094 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x0094 }
            r1.mo9643a()     // Catch:{ IOException -> 0x0094 }
            com.google.firebase.iid.z r0 = com.google.firebase.iid.C2991z.m12211b()
            android.content.Context r1 = r5.mo9655a()
            boolean r0 = r0.mo9709a(r1)
            if (r0 == 0) goto L_0x006a
            android.os.PowerManager$WakeLock r0 = r5.f8484g
            r0.release()
        L_0x006a:
            return
        L_0x006b:
            boolean r1 = r5.m12139c()     // Catch:{ IOException -> 0x0094 }
            if (r1 == 0) goto L_0x0077
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f8485h     // Catch:{ IOException -> 0x0094 }
            r1.mo9615a(r0)     // Catch:{ IOException -> 0x0094 }
            goto L_0x007e
        L_0x0077:
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f8485h     // Catch:{ IOException -> 0x0094 }
            long r2 = r5.f8483f     // Catch:{ IOException -> 0x0094 }
            r1.mo9614a(r2)     // Catch:{ IOException -> 0x0094 }
        L_0x007e:
            com.google.firebase.iid.z r0 = com.google.firebase.iid.C2991z.m12211b()
            android.content.Context r1 = r5.mo9655a()
            boolean r0 = r0.mo9709a(r1)
            if (r0 == 0) goto L_0x00d2
        L_0x008c:
            android.os.PowerManager$WakeLock r0 = r5.f8484g
            r0.release()
            return
        L_0x0092:
            r0 = move-exception
            goto L_0x00d3
        L_0x0094:
            r1 = move-exception
            java.lang.String r2 = "FirebaseInstanceId"
            java.lang.String r1 = r1.getMessage()     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0092 }
            int r3 = r3.length()     // Catch:{ all -> 0x0092 }
            int r3 = r3 + 93
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r4.<init>(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r4.append(r3)     // Catch:{ all -> 0x0092 }
            r4.append(r1)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = ". Won't retry the operation."
            r4.append(r1)     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0092 }
            android.util.Log.e(r2, r1)     // Catch:{ all -> 0x0092 }
            com.google.firebase.iid.FirebaseInstanceId r1 = r5.f8485h     // Catch:{ all -> 0x0092 }
            r1.mo9615a(r0)     // Catch:{ all -> 0x0092 }
            com.google.firebase.iid.z r0 = com.google.firebase.iid.C2991z.m12211b()
            android.content.Context r1 = r5.mo9655a()
            boolean r0 = r0.mo9709a(r1)
            if (r0 == 0) goto L_0x00d2
            goto L_0x008c
        L_0x00d2:
            return
        L_0x00d3:
            com.google.firebase.iid.z r1 = com.google.firebase.iid.C2991z.m12211b()
            android.content.Context r2 = r5.mo9655a()
            boolean r1 = r1.mo9709a(r2)
            if (r1 == 0) goto L_0x00e6
            android.os.PowerManager$WakeLock r1 = r5.f8484g
            r1.release()
        L_0x00e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2944f0.run():void");
    }
}
