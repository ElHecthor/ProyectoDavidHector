package com.google.firebase.messaging;

import android.content.Intent;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.firebase.messaging.o */
final /* synthetic */ class C3067o implements Runnable {

    /* renamed from: f */
    private final C3065m f8725f;

    /* renamed from: g */
    private final Intent f8726g;

    /* renamed from: h */
    private final C4351i f8727h;

    C3067o(C3065m mVar, Intent intent, C4351i iVar) {
        this.f8725f = mVar;
        this.f8726g = intent;
        this.f8727h = iVar;
    }

    public final void run() {
        C3065m mVar = this.f8725f;
        Intent intent = this.f8726g;
        C4351i iVar = this.f8727h;
        try {
            mVar.mo9815c(intent);
        } finally {
            iVar.mo13027a(null);
        }
    }
}
