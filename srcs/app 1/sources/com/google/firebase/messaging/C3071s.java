package com.google.firebase.messaging;

import com.google.android.datatransport.cct.C1851a;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.C2876e;
import com.google.firebase.components.C2881g;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.installations.C3004h;
import com.google.firebase.messaging.FirebaseMessagingRegistrar.C3045b;
import com.google.firebase.p060g.C2921c;
import com.google.firebase.p066j.C3043h;
import p147g.p156d.p157a.p158a.C3739b;
import p147g.p156d.p157a.p158a.C3744g;

/* renamed from: com.google.firebase.messaging.s */
final /* synthetic */ class C3071s implements C2881g {

    /* renamed from: a */
    static final C2881g f8731a = new C3071s();

    private C3071s() {
    }

    /* renamed from: a */
    public final Object mo9532a(C2876e eVar) {
        FirebaseApp firebaseApp = (FirebaseApp) eVar.mo9535a(FirebaseApp.class);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eVar.mo9535a(FirebaseInstanceId.class);
        C3043h hVar = (C3043h) eVar.mo9535a(C3043h.class);
        C2921c cVar = (C2921c) eVar.mo9535a(C2921c.class);
        C3004h hVar2 = (C3004h) eVar.mo9535a(C3004h.class);
        C3744g gVar = (C3744g) eVar.mo9535a(C3744g.class);
        if (gVar == null || !C1851a.f5493g.mo6309a().contains(C3739b.m15293a("json"))) {
            gVar = new C3045b();
        }
        FirebaseMessaging firebaseMessaging = new FirebaseMessaging(firebaseApp, firebaseInstanceId, hVar, cVar, hVar2, gVar);
        return firebaseMessaging;
    }
}
