package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C2148s;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p147g.p156d.p157a.p167b.p173d.p180g.C3988e9;

/* renamed from: com.google.android.gms.measurement.internal.w3 */
public final class C2494w3 extends C2507x5 {

    /* renamed from: c */
    private static final AtomicReference<String[]> f7042c = new AtomicReference<>();

    /* renamed from: d */
    private static final AtomicReference<String[]> f7043d = new AtomicReference<>();

    /* renamed from: e */
    private static final AtomicReference<String[]> f7044e = new AtomicReference<>();

    C2494w3(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: a */
    private static String m10079a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        C2148s.m8834a(strArr);
        C2148s.m8834a(strArr2);
        C2148s.m8834a(atomicReference);
        C2148s.m8841a(strArr.length == strArr2.length);
        for (int i = 0; i < strArr.length; i++) {
            if (C2489v9.m10027c(str, strArr[i])) {
                synchronized (atomicReference) {
                    String[] strArr3 = (String[]) atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[i] == null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(strArr2[i]);
                        sb.append("(");
                        sb.append(strArr[i]);
                        sb.append(")");
                        strArr3[i] = sb.toString();
                    }
                    str2 = strArr3[i];
                }
                return str2;
            }
        }
        return str;
    }

    /* renamed from: a */
    private final String m10080a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Bundle bundle = objArr[i];
            String a = bundle instanceof Bundle ? mo7716a(bundle) : String.valueOf(bundle);
            if (a != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(a);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: t */
    private final boolean m10081t() {
        mo7094f();
        return this.f7100a.mo7221y() && this.f7100a.mo7098j().mo7814a(3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7716a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!m10081t()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo7719b(str));
            sb.append("=");
            if (!C3988e9.m16328b() || !mo7827m().mo7108a(C2457t.f6873F0)) {
                sb.append(bundle.get(str));
            } else {
                Object obj = bundle.get(str);
                String str2 = obj instanceof Bundle ? m10080a(new Object[]{obj}) : obj instanceof Object[] ? m10080a((Object[]) obj) : obj instanceof ArrayList ? m10080a(((ArrayList) obj).toArray()) : String.valueOf(obj);
                sb.append(str2);
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7717a(C2435r rVar) {
        String str = null;
        if (rVar == null) {
            return null;
        }
        if (!m10081t()) {
            return rVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(rVar.f6819h);
        sb.append(",name=");
        sb.append(mo7718a(rVar.f6817f));
        sb.append(",params=");
        C2377m mVar = rVar.f6818g;
        if (mVar != null) {
            str = !m10081t() ? mVar.toString() : mo7716a(mVar.mo7499b());
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo7718a(String str) {
        if (str == null) {
            return null;
        }
        return !m10081t() ? str : m10079a(str, C2264c6.f6344b, C2264c6.f6343a, f7042c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo7719b(String str) {
        if (str == null) {
            return null;
        }
        return !m10081t() ? str : m10079a(str, C2252b6.f6282b, C2252b6.f6281a, f7043d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo7720c(String str) {
        if (str == null) {
            return null;
        }
        if (!m10081t()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m10079a(str, C2288e6.f6378b, C2288e6.f6377a, f7044e);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("experiment_id");
        sb.append("(");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo7397r() {
        return false;
    }
}
