package com.facebook.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.facebook.internal.r */
public abstract class C1692r implements ServiceConnection {

    /* renamed from: a */
    private final Context f5141a;

    /* renamed from: b */
    private final Handler f5142b;

    /* renamed from: c */
    private C1694b f5143c;

    /* renamed from: d */
    private boolean f5144d;

    /* renamed from: e */
    private Messenger f5145e;

    /* renamed from: f */
    private int f5146f;

    /* renamed from: g */
    private int f5147g;

    /* renamed from: h */
    private final String f5148h;

    /* renamed from: i */
    private final int f5149i;

    /* renamed from: com.facebook.internal.r$a */
    class C1693a extends Handler {
        C1693a() {
        }

        public void handleMessage(Message message) {
            C1692r.this.mo5936a(message);
        }
    }

    /* renamed from: com.facebook.internal.r$b */
    public interface C1694b {
        /* renamed from: a */
        void mo5942a(Bundle bundle);
    }

    public C1692r(Context context, int i, int i2, int i3, String str) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f5141a = context;
        this.f5146f = i;
        this.f5147g = i2;
        this.f5148h = str;
        this.f5149i = i3;
        this.f5142b = new C1693a();
    }

    /* renamed from: b */
    private void m7337b(Bundle bundle) {
        if (this.f5144d) {
            this.f5144d = false;
            C1694b bVar = this.f5143c;
            if (bVar != null) {
                bVar.mo5942a(bundle);
            }
        }
    }

    /* renamed from: c */
    private void m7338c() {
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f5148h);
        mo5935a(bundle);
        Message obtain = Message.obtain(null, this.f5146f);
        obtain.arg1 = this.f5149i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f5142b);
        try {
            this.f5145e.send(obtain);
        } catch (RemoteException unused) {
            m7337b(null);
        }
    }

    /* renamed from: a */
    public void mo5934a() {
        this.f5144d = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo5935a(Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo5936a(Message message) {
        if (message.what == this.f5147g) {
            Bundle data = message.getData();
            if (data.getString("com.facebook.platform.status.ERROR_TYPE") != null) {
                data = null;
            }
            m7337b(data);
            try {
                this.f5141a.unbindService(this);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: a */
    public void mo5937a(C1694b bVar) {
        this.f5143c = bVar;
    }

    /* renamed from: b */
    public boolean mo5938b() {
        if (this.f5144d || C1683q.m7293a(this.f5149i) == -1) {
            return false;
        }
        Intent a = C1683q.m7295a(this.f5141a);
        if (a == null) {
            return false;
        }
        this.f5144d = true;
        this.f5141a.bindService(a, this, 1);
        return true;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5145e = new Messenger(iBinder);
        m7338c();
    }

    public void onServiceDisconnected(ComponentName componentName) {
        this.f5145e = null;
        try {
            this.f5141a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        m7337b(null);
    }
}
