package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.stats.C2179a;
import java.util.HashMap;
import javax.annotation.concurrent.GuardedBy;
import p147g.p156d.p157a.p167b.p173d.p178e.C3886h;

/* renamed from: com.google.android.gms.common.internal.l0 */
final class C2131l0 extends C2121i implements Callback {
    /* access modifiers changed from: private */
    @GuardedBy("mConnectionStatus")

    /* renamed from: c */
    public final HashMap<C2122a, C2136n0> f6079c = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Context f6080d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f6081e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C2179a f6082f;

    /* renamed from: g */
    private final long f6083g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final long f6084h;

    C2131l0(Context context) {
        this.f6080d = context.getApplicationContext();
        this.f6081e = new C3886h(context.getMainLooper(), this);
        this.f6082f = C2179a.m8953a();
        this.f6083g = 5000;
        this.f6084h = 300000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo6890a(C2122a aVar, ServiceConnection serviceConnection, String str) {
        boolean d;
        C2148s.m8835a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f6079c) {
            C2136n0 n0Var = (C2136n0) this.f6079c.get(aVar);
            if (n0Var == null) {
                n0Var = new C2136n0(this, aVar);
                n0Var.mo6917a(serviceConnection, serviceConnection, str);
                n0Var.mo6919a(str);
                this.f6079c.put(aVar, n0Var);
            } else {
                this.f6081e.removeMessages(0, aVar);
                if (!n0Var.mo6920a(serviceConnection)) {
                    n0Var.mo6917a(serviceConnection, serviceConnection, str);
                    int c = n0Var.mo6923c();
                    if (c == 1) {
                        serviceConnection.onServiceConnected(n0Var.mo6921b(), n0Var.mo6916a());
                    } else if (c == 2) {
                        n0Var.mo6919a(str);
                    }
                } else {
                    String valueOf = String.valueOf(aVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 81);
                    sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                    sb.append(valueOf);
                    throw new IllegalStateException(sb.toString());
                }
            }
            d = n0Var.mo6924d();
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo6891b(C2122a aVar, ServiceConnection serviceConnection, String str) {
        C2148s.m8835a(serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f6079c) {
            C2136n0 n0Var = (C2136n0) this.f6079c.get(aVar);
            if (n0Var == null) {
                String valueOf = String.valueOf(aVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 50);
                sb.append("Nonexistent connection status for service config: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            } else if (n0Var.mo6920a(serviceConnection)) {
                n0Var.mo6918a(serviceConnection, str);
                if (n0Var.mo6925e()) {
                    this.f6081e.sendMessageDelayed(this.f6081e.obtainMessage(0, aVar), this.f6083g);
                }
            } else {
                String valueOf2 = String.valueOf(aVar);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 76);
                sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                sb2.append(valueOf2);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            synchronized (this.f6079c) {
                C2122a aVar = (C2122a) message.obj;
                C2136n0 n0Var = (C2136n0) this.f6079c.get(aVar);
                if (n0Var != null && n0Var.mo6925e()) {
                    if (n0Var.mo6924d()) {
                        n0Var.mo6922b("GmsClientSupervisor");
                    }
                    this.f6079c.remove(aVar);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            synchronized (this.f6079c) {
                C2122a aVar2 = (C2122a) message.obj;
                C2136n0 n0Var2 = (C2136n0) this.f6079c.get(aVar2);
                if (n0Var2 != null && n0Var2.mo6923c() == 3) {
                    String valueOf = String.valueOf(aVar2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Timeout waiting for ServiceConnection callback ");
                    sb.append(valueOf);
                    Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                    ComponentName b = n0Var2.mo6921b();
                    if (b == null) {
                        b = aVar2.mo6892a();
                    }
                    if (b == null) {
                        b = new ComponentName(aVar2.mo6894b(), "unknown");
                    }
                    n0Var2.onServiceDisconnected(b);
                }
            }
            return true;
        }
    }
}
