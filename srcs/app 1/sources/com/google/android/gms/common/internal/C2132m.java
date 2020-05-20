package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p147g.p156d.p157a.p167b.p173d.p178e.C3879a;
import p147g.p156d.p157a.p167b.p173d.p178e.C3881c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C2132m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C2133a extends C3879a implements C2132m {
        public C2133a() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final boolean mo6913a(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                mo6860a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C3881c.m15633a(parcel, Bundle.CREATOR));
            } else if (i == 2) {
                mo6859a(parcel.readInt(), (Bundle) C3881c.m15633a(parcel, Bundle.CREATOR));
            } else if (i != 3) {
                return false;
            } else {
                mo6861a(parcel.readInt(), parcel.readStrongBinder(), (C2123i0) C3881c.m15633a(parcel, C2123i0.CREATOR));
            }
            parcel2.writeNoException();
            return true;
        }
    }

    /* renamed from: a */
    void mo6859a(int i, Bundle bundle);

    /* renamed from: a */
    void mo6860a(int i, IBinder iBinder, Bundle bundle);

    /* renamed from: a */
    void mo6861a(int i, IBinder iBinder, C2123i0 i0Var);
}
