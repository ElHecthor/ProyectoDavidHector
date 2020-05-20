package com.google.firebase.iid;

import com.google.firebase.p059f.C2915a;
import com.google.firebase.p059f.C2916b;

/* renamed from: com.google.firebase.iid.c1 */
final /* synthetic */ class C2936c1 implements C2916b {

    /* renamed from: a */
    private final C2926a f8460a;

    C2936c1(C2926a aVar) {
        this.f8460a = aVar;
    }

    /* renamed from: a */
    public final void mo9529a(C2915a aVar) {
        C2926a aVar2 = this.f8460a;
        synchronized (aVar2) {
            if (aVar2.mo9626a()) {
                FirebaseInstanceId.this.m12070m();
            }
        }
    }
}
