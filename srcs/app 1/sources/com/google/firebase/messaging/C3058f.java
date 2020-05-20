package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.C2928a;
import com.google.firebase.iid.C2945f1;
import com.google.firebase.iid.C2974r;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C3004h;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3043h;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p071f.p088e.C3162a;
import p147g.p156d.p157a.p167b.p184g.C4350h;
import p147g.p156d.p157a.p167b.p184g.C4351i;
import p147g.p156d.p157a.p167b.p184g.C4354k;

/* renamed from: com.google.firebase.messaging.f */
final class C3058f {

    /* renamed from: i */
    private static final long f8694i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a */
    private final FirebaseInstanceId f8695a;

    /* renamed from: b */
    private final Context f8696b;

    /* renamed from: c */
    private final C2974r f8697c;

    /* renamed from: d */
    private final C2945f1 f8698d;

    /* renamed from: e */
    private final Map<String, ArrayDeque<C4351i<Void>>> f8699e = new C3162a();

    /* renamed from: f */
    private final ScheduledExecutorService f8700f;

    /* renamed from: g */
    private boolean f8701g = false;

    /* renamed from: h */
    private final C3054c0 f8702h;

    private C3058f(FirebaseInstanceId firebaseInstanceId, C2974r rVar, C3054c0 c0Var, C2945f1 f1Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f8695a = firebaseInstanceId;
        this.f8697c = rVar;
        this.f8702h = c0Var;
        this.f8698d = f1Var;
        this.f8696b = context;
        this.f8700f = scheduledExecutorService;
    }

    /* renamed from: a */
    static final /* synthetic */ C3058f m12430a(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseInstanceId firebaseInstanceId, C2974r rVar, C2945f1 f1Var) {
        C3058f fVar = new C3058f(firebaseInstanceId, rVar, C3054c0.m12422a(context, scheduledExecutorService), f1Var, context, scheduledExecutorService);
        return fVar;
    }

    /* renamed from: a */
    static C4350h<C3058f> m12431a(FirebaseApp firebaseApp, FirebaseInstanceId firebaseInstanceId, C2974r rVar, C3043h hVar, C2921c cVar, C3004h hVar2, Context context, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        C2945f1 f1Var = new C2945f1(firebaseApp, rVar, executor, hVar, cVar, hVar2);
        C3057e eVar = new C3057e(context, scheduledExecutorService, firebaseInstanceId, rVar, f1Var);
        return C4354k.m17757a((Executor) scheduledExecutorService, (Callable<TResult>) eVar);
    }

    /* renamed from: a */
    private static <T> T m12432a(C4350h<T> hVar) {
        try {
            return C4354k.m17759a(hVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e);
            }
        } catch (InterruptedException | TimeoutException e2) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e2);
        }
    }

    /* renamed from: a */
    private final boolean m12433a(C3056d0 d0Var) {
        String sb;
        String sb2;
        String str = "FirebaseMessaging";
        try {
            String b = d0Var.mo9827b();
            char c = 65535;
            int hashCode = b.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (b.equals("U")) {
                        c = 1;
                    }
                }
            } else if (b.equals("S")) {
                c = 0;
            }
            String str2 = " succeeded.";
            if (c == 0) {
                C2928a aVar = (C2928a) m12432a(this.f8695a.mo9617b());
                m12432a(this.f8698d.mo9660b(aVar.mo9629d(), aVar.mo9628a(), d0Var.mo9826a()));
                if (m12435d()) {
                    String a = d0Var.mo9826a();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a).length() + 31);
                    sb3.append("Subscribe to topic: ");
                    sb3.append(a);
                    sb3.append(str2);
                    sb2 = sb3.toString();
                }
                return true;
            } else if (c != 1) {
                if (m12435d()) {
                    String valueOf = String.valueOf(d0Var);
                    StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 24);
                    sb4.append("Unknown topic operation");
                    sb4.append(valueOf);
                    sb4.append(".");
                    sb2 = sb4.toString();
                }
                return true;
            } else {
                C2928a aVar2 = (C2928a) m12432a(this.f8695a.mo9617b());
                m12432a(this.f8698d.mo9661c(aVar2.mo9629d(), aVar2.mo9628a(), d0Var.mo9826a()));
                if (m12435d()) {
                    String a2 = d0Var.mo9826a();
                    StringBuilder sb5 = new StringBuilder(String.valueOf(a2).length() + 35);
                    sb5.append("Unsubscribe from topic: ");
                    sb5.append(a2);
                    sb5.append(str2);
                    sb2 = sb5.toString();
                }
                return true;
            }
            Log.d(str, sb2);
            return true;
        } catch (IOException e) {
            if (!"SERVICE_NOT_AVAILABLE".equals(e.getMessage())) {
                if (!"INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    if (e.getMessage() == null) {
                        sb = "Topic operation failed without exception message. Will retry Topic operation.";
                        Log.e(str, sb);
                        return false;
                    }
                    throw e;
                }
            }
            String message = e.getMessage();
            StringBuilder sb6 = new StringBuilder(String.valueOf(message).length() + 53);
            sb6.append("Topic operation failed: ");
            sb6.append(message);
            sb6.append(". Will retry Topic operation.");
            sb = sb6.toString();
            Log.e(str, sb);
            return false;
        }
    }

    /* renamed from: c */
    private final synchronized boolean m12434c() {
        return this.f8701g;
    }

    /* renamed from: d */
    private static boolean m12435d() {
        String str = "FirebaseMessaging";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9832a() {
        if ((this.f8702h.mo9824a() != null) && !m12434c()) {
            mo9833a(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9833a(long j) {
        C3060h hVar = new C3060h(this, this.f8696b, this.f8697c, Math.min(Math.max(30, j << 1), f8694i));
        mo9834a(hVar, j);
        mo9835a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9834a(Runnable runnable, long j) {
        this.f8700f.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo9835a(boolean z) {
        this.f8701g = z;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (m12433a(r0) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        r5.f8702h.mo9825a(r0);
        r1 = r5.f8699e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = r0.mo9828c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        if (r5.f8699e.containsKey(r0) != false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r2 = (java.util.ArrayDeque) r5.f8699e.get(r0);
        r3 = (p147g.p156d.p157a.p167b.p184g.C4351i) r2.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r3 == null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r3.mo13027a(null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r2.isEmpty() == false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r5.f8699e.remove(r0);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9836b() {
        /*
            r5 = this;
        L_0x0000:
            monitor-enter(r5)
            com.google.firebase.messaging.c0 r0 = r5.f8702h     // Catch:{ all -> 0x005b }
            com.google.firebase.messaging.d0 r0 = r0.mo9824a()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0019
            boolean r0 = m12435d()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "topic sync succeeded"
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x005b }
        L_0x0016:
            r0 = 1
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            return r0
        L_0x0019:
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            boolean r1 = r5.m12433a(r0)
            if (r1 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            com.google.firebase.messaging.c0 r1 = r5.f8702h
            r1.mo9825a(r0)
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.b.g.i<java.lang.Void>>> r1 = r5.f8699e
            monitor-enter(r1)
            java.lang.String r0 = r0.mo9828c()     // Catch:{ all -> 0x0058 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.b.g.i<java.lang.Void>>> r2 = r5.f8699e     // Catch:{ all -> 0x0058 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0058 }
            if (r2 != 0) goto L_0x0038
        L_0x0036:
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            goto L_0x0000
        L_0x0038:
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.b.g.i<java.lang.Void>>> r2 = r5.f8699e     // Catch:{ all -> 0x0058 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x0058 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0058 }
            java.lang.Object r3 = r2.poll()     // Catch:{ all -> 0x0058 }
            g.d.a.b.g.i r3 = (p147g.p156d.p157a.p167b.p184g.C4351i) r3     // Catch:{ all -> 0x0058 }
            if (r3 == 0) goto L_0x004c
            r4 = 0
            r3.mo13027a(r4)     // Catch:{ all -> 0x0058 }
        L_0x004c:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0058 }
            if (r2 == 0) goto L_0x0036
            java.util.Map<java.lang.String, java.util.ArrayDeque<g.d.a.b.g.i<java.lang.Void>>> r2 = r5.f8699e     // Catch:{ all -> 0x0058 }
            r2.remove(r0)     // Catch:{ all -> 0x0058 }
            goto L_0x0036
        L_0x0058:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0058 }
            throw r0
        L_0x005b:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.C3058f.mo9836b():boolean");
    }
}
