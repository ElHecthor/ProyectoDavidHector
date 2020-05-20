package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: com.google.firebase.messaging.g */
final class C3059g extends BroadcastReceiver {

    /* renamed from: a */
    private C3060h f8703a;

    /* renamed from: b */
    final /* synthetic */ C3060h f8704b;

    public C3059g(C3060h hVar, C3060h hVar2) {
        this.f8704b = hVar;
        this.f8703a = hVar2;
    }

    public final synchronized void onReceive(Context context, Intent intent) {
        if (this.f8703a != null) {
            if (this.f8703a.m12446b()) {
                if (C3060h.m12448c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f8703a.f8711i.mo9834a(this.f8703a, 0);
                context.unregisterReceiver(this);
                this.f8703a = null;
            }
        }
    }
}
