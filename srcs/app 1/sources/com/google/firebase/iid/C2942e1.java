package com.google.firebase.iid;

import android.os.Bundle;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.firebase.iid.e1 */
final /* synthetic */ class C2942e1 implements Runnable {

    /* renamed from: f */
    private final C2945f1 f8471f;

    /* renamed from: g */
    private final String f8472g;

    /* renamed from: h */
    private final String f8473h;

    /* renamed from: i */
    private final String f8474i;

    /* renamed from: j */
    private final Bundle f8475j;

    /* renamed from: k */
    private final C4351i f8476k;

    C2942e1(C2945f1 f1Var, String str, String str2, String str3, Bundle bundle, C4351i iVar) {
        this.f8471f = f1Var;
        this.f8472g = str;
        this.f8473h = str2;
        this.f8474i = str3;
        this.f8475j = bundle;
        this.f8476k = iVar;
    }

    public final void run() {
        this.f8471f.mo9659a(this.f8472g, this.f8473h, this.f8474i, this.f8475j, this.f8476k);
    }
}
