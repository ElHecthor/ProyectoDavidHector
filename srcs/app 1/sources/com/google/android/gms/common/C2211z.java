package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C2147r0;
import com.google.android.gms.common.internal.p048x.C2158a;
import com.google.android.gms.common.internal.p048x.C2161c;
import javax.annotation.Nullable;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3854b;

/* renamed from: com.google.android.gms.common.z */
public final class C2211z extends C2158a {
    public static final Creator<C2211z> CREATOR = new C2081c0();

    /* renamed from: f */
    private final String f6189f;
    @Nullable

    /* renamed from: g */
    private final C2184t f6190g;

    /* renamed from: h */
    private final boolean f6191h;

    /* renamed from: i */
    private final boolean f6192i;

    C2211z(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        this.f6189f = str;
        this.f6190g = m9037a(iBinder);
        this.f6191h = z;
        this.f6192i = z2;
    }

    C2211z(String str, @Nullable C2184t tVar, boolean z, boolean z2) {
        this.f6189f = str;
        this.f6190g = tVar;
        this.f6191h = z;
        this.f6192i = z2;
    }

    @Nullable
    /* renamed from: a */
    private static C2184t m9037a(@Nullable IBinder iBinder) {
        String str = "Could not unwrap certificate";
        String str2 = "GoogleCertificatesQuery";
        C2208w wVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            C3851a b = C2147r0.m8831a(iBinder).mo6933b();
            byte[] bArr = b == null ? null : (byte[]) C3854b.m15593a(b);
            if (bArr != null) {
                wVar = new C2208w(bArr);
            } else {
                Log.e(str2, str);
            }
            return wVar;
        } catch (RemoteException e) {
            Log.e(str2, str, e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C2161c.m8890a(parcel);
        C2161c.m8902a(parcel, 1, this.f6189f, false);
        C2184t tVar = this.f6190g;
        if (tVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            tVar = null;
        } else {
            tVar.asBinder();
        }
        C2161c.m8896a(parcel, 2, (IBinder) tVar, false);
        C2161c.m8904a(parcel, 3, this.f6191h);
        C2161c.m8904a(parcel, 4, this.f6192i);
        C2161c.m8891a(parcel, a);
    }
}
