package com.google.android.gms.common.stats;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.util.Log;
import com.google.android.gms.common.util.C2189d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.common.stats.a */
public class C2179a {

    /* renamed from: a */
    private static final Object f6157a = new Object();

    /* renamed from: b */
    private static volatile C2179a f6158b;

    private C2179a() {
        List list = Collections.EMPTY_LIST;
    }

    /* renamed from: a */
    public static C2179a m8953a() {
        if (f6158b == null) {
            synchronized (f6157a) {
                if (f6158b == null) {
                    f6158b = new C2179a();
                }
            }
        }
        return f6158b;
    }

    @SuppressLint({"UntrackedBindService"})
    /* renamed from: a */
    public void mo6976a(Context context, ServiceConnection serviceConnection) {
        context.unbindService(serviceConnection);
    }

    /* renamed from: a */
    public boolean mo6977a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return mo6978a(context, context.getClass().getName(), intent, serviceConnection, i);
    }

    /* renamed from: a */
    public final boolean mo6978a(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i) {
        ComponentName component = intent.getComponent();
        if (!(component == null ? false : C2189d.m8976c(context, component.getPackageName()))) {
            return context.bindService(intent, serviceConnection, i);
        }
        Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
        return false;
    }
}
