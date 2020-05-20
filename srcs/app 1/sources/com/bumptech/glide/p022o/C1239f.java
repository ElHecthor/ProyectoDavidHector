package com.bumptech.glide.p022o;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.p022o.C1234c.C1235a;
import p071f.p097h.p098e.C3236a;

/* renamed from: com.bumptech.glide.o.f */
public class C1239f implements C1236d {
    /* renamed from: a */
    public C1234c mo5185a(Context context, C1235a aVar) {
        boolean z = C3236a.m13264a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        String str = "ConnectivityMonitor";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new C1237e(context, aVar) : new C1243j();
    }
}
