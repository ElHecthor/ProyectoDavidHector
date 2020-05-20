package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.common.internal.n0 */
final class C2136n0 implements ServiceConnection {

    /* renamed from: a */
    private final Map<ServiceConnection, ServiceConnection> f6086a = new HashMap();

    /* renamed from: b */
    private int f6087b = 2;

    /* renamed from: c */
    private boolean f6088c;

    /* renamed from: d */
    private IBinder f6089d;

    /* renamed from: e */
    private final C2122a f6090e;

    /* renamed from: f */
    private ComponentName f6091f;

    /* renamed from: g */
    private final /* synthetic */ C2131l0 f6092g;

    public C2136n0(C2131l0 l0Var, C2122a aVar) {
        this.f6092g = l0Var;
        this.f6090e = aVar;
    }

    /* renamed from: a */
    public final IBinder mo6916a() {
        return this.f6089d;
    }

    /* renamed from: a */
    public final void mo6917a(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f6092g.f6082f;
        this.f6092g.f6080d;
        this.f6090e.mo6893a(this.f6092g.f6080d);
        this.f6086a.put(serviceConnection, serviceConnection2);
    }

    /* renamed from: a */
    public final void mo6918a(ServiceConnection serviceConnection, String str) {
        this.f6092g.f6082f;
        this.f6092g.f6080d;
        this.f6086a.remove(serviceConnection);
    }

    /* renamed from: a */
    public final void mo6919a(String str) {
        this.f6087b = 3;
        boolean a = this.f6092g.f6082f.mo6978a(this.f6092g.f6080d, str, this.f6090e.mo6893a(this.f6092g.f6080d), this, this.f6090e.mo6895c());
        this.f6088c = a;
        if (a) {
            this.f6092g.f6081e.sendMessageDelayed(this.f6092g.f6081e.obtainMessage(1, this.f6090e), this.f6092g.f6084h);
            return;
        }
        this.f6087b = 2;
        try {
            this.f6092g.f6082f.mo6976a(this.f6092g.f6080d, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    /* renamed from: a */
    public final boolean mo6920a(ServiceConnection serviceConnection) {
        return this.f6086a.containsKey(serviceConnection);
    }

    /* renamed from: b */
    public final ComponentName mo6921b() {
        return this.f6091f;
    }

    /* renamed from: b */
    public final void mo6922b(String str) {
        this.f6092g.f6081e.removeMessages(1, this.f6090e);
        this.f6092g.f6082f.mo6976a(this.f6092g.f6080d, this);
        this.f6088c = false;
        this.f6087b = 2;
    }

    /* renamed from: c */
    public final int mo6923c() {
        return this.f6087b;
    }

    /* renamed from: d */
    public final boolean mo6924d() {
        return this.f6088c;
    }

    /* renamed from: e */
    public final boolean mo6925e() {
        return this.f6086a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f6092g.f6079c) {
            this.f6092g.f6081e.removeMessages(1, this.f6090e);
            this.f6089d = iBinder;
            this.f6091f = componentName;
            for (ServiceConnection onServiceConnected : this.f6086a.values()) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f6087b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f6092g.f6079c) {
            this.f6092g.f6081e.removeMessages(1, this.f6090e);
            this.f6089d = null;
            this.f6091f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f6086a.values()) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f6087b = 2;
        }
    }
}
