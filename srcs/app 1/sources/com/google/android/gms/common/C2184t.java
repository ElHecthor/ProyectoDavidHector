package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.C2140p0;
import com.google.android.gms.common.internal.C2147r0;
import com.google.android.gms.common.internal.C2148s;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p147g.p156d.p157a.p167b.p172c.C3851a;
import p147g.p156d.p157a.p167b.p172c.C3854b;

/* renamed from: com.google.android.gms.common.t */
abstract class C2184t extends C2147r0 {

    /* renamed from: a */
    private int f6162a;

    protected C2184t(byte[] bArr) {
        C2148s.m8841a(bArr.length == 25);
        this.f6162a = Arrays.hashCode(bArr);
    }

    /* renamed from: a */
    protected static byte[] m8965a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public final C3851a mo6933b() {
        return C3854b.m15592a(mo6985t());
    }

    /* renamed from: c */
    public final int mo6934c() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C2140p0)) {
            try {
                C2140p0 p0Var = (C2140p0) obj;
                if (p0Var.mo6934c() != hashCode()) {
                    return false;
                }
                C3851a b = p0Var.mo6933b();
                if (b == null) {
                    return false;
                }
                return Arrays.equals(mo6985t(), (byte[]) C3854b.m15593a(b));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f6162a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public abstract byte[] mo6985t();
}
