package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.stats.C2179a;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p173d.p179f.C3892e;

/* renamed from: com.google.firebase.iid.f */
final class C2943f implements ServiceConnection {
    @GuardedBy("this")

    /* renamed from: a */
    int f8477a;

    /* renamed from: b */
    final Messenger f8478b;

    /* renamed from: c */
    C2968o f8479c;
    @GuardedBy("this")

    /* renamed from: d */
    final Queue<C2972q<?>> f8480d;
    @GuardedBy("this")

    /* renamed from: e */
    final SparseArray<C2972q<?>> f8481e;

    /* renamed from: f */
    final /* synthetic */ C2940e f8482f;

    private C2943f(C2940e eVar) {
        this.f8482f = eVar;
        this.f8477a = 0;
        this.f8478b = new Messenger(new C3892e(Looper.getMainLooper(), new C2952i(this)));
        this.f8480d = new ArrayDeque();
        this.f8481e = new SparseArray<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9646a() {
        this.f8482f.f8467b.execute(new C2955j(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo9647a(int i) {
        C2972q qVar = (C2972q) this.f8481e.get(i);
        if (qVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            Log.w("MessengerIpcClient", sb.toString());
            this.f8481e.remove(i);
            qVar.mo9686a(new C2970p(3, "Timed out waiting for response"));
            mo9651b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo9648a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "MessengerIpcClient";
            String str3 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            Log.d(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
        }
        int i2 = this.f8477a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f8477a = 4;
            C2179a.m8953a().mo6976a(this.f8482f.f8466a, this);
            C2970p pVar = new C2970p(i, str);
            for (C2972q a : this.f8480d) {
                a.mo9686a(pVar);
            }
            this.f8480d.clear();
            for (int i3 = 0; i3 < this.f8481e.size(); i3++) {
                ((C2972q) this.f8481e.valueAt(i3)).mo9686a(pVar);
            }
            this.f8481e.clear();
        } else if (i2 == 3) {
            this.f8477a = 4;
        } else if (i2 != 4) {
            int i4 = this.f8477a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: used method not loaded: com.google.firebase.iid.q.a(com.google.firebase.iid.p):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.google.firebase.iid.q.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        r1.mo9686a(new com.google.firebase.iid.C2970p(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006b, code lost:
        r1.mo9680a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006e, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo9649a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x0023
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "MessengerIpcClient"
            android.util.Log.d(r2, r1)
        L_0x0023:
            monitor-enter(r4)
            android.util.SparseArray<com.google.firebase.iid.q<?>> r1 = r4.f8481e     // Catch:{ all -> 0x006f }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x006f }
            com.google.firebase.iid.q r1 = (com.google.firebase.iid.C2972q) r1     // Catch:{ all -> 0x006f }
            r2 = 1
            if (r1 != 0) goto L_0x0049
            java.lang.String r5 = "MessengerIpcClient"
            r1 = 50
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r3.<init>(r1)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Received response for unknown request: "
            r3.append(r1)     // Catch:{ all -> 0x006f }
            r3.append(r0)     // Catch:{ all -> 0x006f }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x006f }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return r2
        L_0x0049:
            android.util.SparseArray<com.google.firebase.iid.q<?>> r3 = r4.f8481e     // Catch:{ all -> 0x006f }
            r3.remove(r0)     // Catch:{ all -> 0x006f }
            r4.mo9651b()     // Catch:{ all -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x006b
            com.google.firebase.iid.p r5 = new com.google.firebase.iid.p
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.mo9686a(r5)
            goto L_0x006e
        L_0x006b:
            r1.mo9680a(r5)
        L_0x006e:
            return r2
        L_0x006f:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2943f.mo9649a(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0096, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo9650a(com.google.firebase.iid.C2972q<?> r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.f8477a     // Catch:{ all -> 0x0097 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0097 }
            int r0 = r5.f8477a     // Catch:{ all -> 0x0097 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r2.<init>(r1)     // Catch:{ all -> 0x0097 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x0097 }
            r2.append(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0097 }
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            throw r6     // Catch:{ all -> 0x0097 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<com.google.firebase.iid.q<?>> r0 = r5.f8480d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            r5.mo9646a()     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<com.google.firebase.iid.q<?>> r0 = r5.f8480d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<com.google.firebase.iid.q<?>> r0 = r5.f8480d     // Catch:{ all -> 0x0097 }
            r0.add(r6)     // Catch:{ all -> 0x0097 }
            int r6 = r5.f8477a     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            com.google.android.gms.common.internal.C2148s.m8845b(r6)     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "MessengerIpcClient"
            boolean r6 = android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x005f
            java.lang.String r6 = "MessengerIpcClient"
            java.lang.String r0 = "Starting bind to GmsCore"
            android.util.Log.v(r6, r0)     // Catch:{ all -> 0x0097 }
        L_0x005f:
            r5.f8477a = r3     // Catch:{ all -> 0x0097 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0097 }
            com.google.android.gms.common.stats.a r0 = com.google.android.gms.common.stats.C2179a.m8953a()     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.e r1 = r5.f8482f     // Catch:{ all -> 0x0097 }
            android.content.Context r1 = r1.f8466a     // Catch:{ all -> 0x0097 }
            boolean r6 = r0.mo6977a(r1, r6, r5, r3)     // Catch:{ all -> 0x0097 }
            if (r6 != 0) goto L_0x0083
            java.lang.String r6 = "Unable to bind to service"
            r5.mo9648a(r2, r6)     // Catch:{ all -> 0x0097 }
            goto L_0x0095
        L_0x0083:
            com.google.firebase.iid.e r6 = r5.f8482f     // Catch:{ all -> 0x0097 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.f8467b     // Catch:{ all -> 0x0097 }
            com.google.firebase.iid.h r0 = new com.google.firebase.iid.h     // Catch:{ all -> 0x0097 }
            r0.<init>(r5)     // Catch:{ all -> 0x0097 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0097 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x0097 }
        L_0x0095:
            monitor-exit(r5)
            return r3
        L_0x0097:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C2943f.mo9650a(com.google.firebase.iid.q):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final synchronized void mo9651b() {
        if (this.f8477a == 2 && this.f8480d.isEmpty() && this.f8481e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f8477a = 3;
            C2179a.m8953a().mo6976a(this.f8482f.f8466a, this);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final synchronized void mo9652c() {
        if (this.f8477a == 1) {
            mo9648a(1, "Timed out while binding");
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Service connected");
        }
        this.f8482f.f8467b.execute(new C2958k(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 2)) {
            Log.v(str, "Service disconnected");
        }
        this.f8482f.f8467b.execute(new C2964m(this));
    }
}
