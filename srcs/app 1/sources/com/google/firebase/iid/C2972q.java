package com.google.firebase.iid;

import android.os.Bundle;
import android.util.Log;
import p147g.p156d.p157a.p167b.p184g.C4351i;

/* renamed from: com.google.firebase.iid.q */
abstract class C2972q<T> {

    /* renamed from: a */
    final int f8527a;

    /* renamed from: b */
    final C4351i<T> f8528b = new C4351i<>();

    /* renamed from: c */
    final int f8529c;

    /* renamed from: d */
    final Bundle f8530d;

    C2972q(int i, int i2, Bundle bundle) {
        this.f8527a = i;
        this.f8529c = i2;
        this.f8530d = bundle;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo9680a(Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9686a(C2970p pVar) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(pVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14 + String.valueOf(valueOf2).length());
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f8528b.mo13026a((Exception) pVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo9687a(T t) {
        String str = "MessengerIpcClient";
        if (Log.isLoggable(str, 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16 + String.valueOf(valueOf2).length());
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d(str, sb.toString());
        }
        this.f8528b.mo13027a(t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo9681a();

    public String toString() {
        int i = this.f8529c;
        int i2 = this.f8527a;
        boolean a = mo9681a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i);
        sb.append(" id=");
        sb.append(i2);
        sb.append(" oneWay=");
        sb.append(a);
        sb.append("}");
        return sb.toString();
    }
}
