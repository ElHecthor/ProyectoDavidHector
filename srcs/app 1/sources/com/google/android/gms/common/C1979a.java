package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.C2148s;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.common.a */
public class C1979a implements ServiceConnection {

    /* renamed from: a */
    private boolean f5791a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f5792b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo6569a(long j, TimeUnit timeUnit) {
        C2148s.m8847c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f5791a) {
            this.f5791a = true;
            IBinder iBinder = (IBinder) this.f5792b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f5792b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
