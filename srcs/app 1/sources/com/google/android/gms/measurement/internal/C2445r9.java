package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C2148s;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3909a1.C3910a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3925b1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3941c1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3941c1.C3942a;
import p147g.p156d.p157a.p167b.p173d.p180g.C3969d6;
import p147g.p156d.p157a.p167b.p173d.p180g.C3979e1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3988e9;
import p147g.p156d.p157a.p167b.p173d.p180g.C3995f1;
import p147g.p156d.p157a.p167b.p173d.p180g.C3999f4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4012g1;
import p147g.p156d.p157a.p167b.p173d.p180g.C4012g1.C4013a;
import p147g.p156d.p157a.p167b.p173d.p180g.C4042i0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4057j0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4072k0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4088l0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4103m0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4214t4;
import p147g.p156d.p157a.p167b.p173d.p180g.C4258w0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4273x0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0;
import p147g.p156d.p157a.p167b.p173d.p180g.C4289y0.C4290a;

/* renamed from: com.google.android.gms.measurement.internal.r9 */
public final class C2445r9 extends C2363k9 {
    C2445r9(C2399n9 n9Var) {
        super(n9Var);
    }

    /* renamed from: a */
    static int m9769a(C3942a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i = 0; i < aVar.mo12235s(); i++) {
            if (str.equals(aVar.mo12206d(i).mo12468r())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    static <Builder extends C3969d6> Builder m9770a(Builder builder, byte[] bArr) {
        C3999f4 b = C3999f4.m16367b();
        if (b != null) {
            builder.mo12345a(bArr, b);
            return builder;
        }
        builder.mo12344a(bArr);
        return builder;
    }

    /* renamed from: a */
    private static String m9771a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    static List<Long> m9772a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i << 6) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static List<C3909a1> m9773a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                C3910a z = C3909a1.m15685z();
                for (String str : bundle.keySet()) {
                    C3910a z2 = C3909a1.m15685z();
                    z2.mo12071a(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        z2.mo12068a(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        z2.mo12072b((String) obj);
                    } else if (obj instanceof Double) {
                        z2.mo12067a(((Double) obj).doubleValue());
                    }
                    z.mo12069a(z2);
                }
                if (z.mo12075r() > 0) {
                    arrayList.add((C3909a1) ((C4214t4) z.mo12346f()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m9774a(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: a */
    private final void m9775a(StringBuilder sb, int i, C4057j0 j0Var) {
        if (j0Var != null) {
            m9774a(sb, i);
            sb.append("filter {\n");
            if (j0Var.mo12556t()) {
                m9778a(sb, i, "complement", (Object) Boolean.valueOf(j0Var.mo12557u()));
            }
            if (j0Var.mo12558v()) {
                m9778a(sb, i, "param_name", (Object) mo7824e().mo7719b(j0Var.mo12559w()));
            }
            String str = "}\n";
            if (j0Var.mo12552a()) {
                int i2 = i + 1;
                C4103m0 q = j0Var.mo12553q();
                if (q != null) {
                    m9774a(sb, i2);
                    sb.append("string_filter");
                    sb.append(" {\n");
                    if (q.mo12641a()) {
                        m9778a(sb, i2, "match_type", (Object) q.mo12642q().name());
                    }
                    if (q.mo12643r()) {
                        m9778a(sb, i2, "expression", (Object) q.mo12644s());
                    }
                    if (q.mo12645t()) {
                        m9778a(sb, i2, "case_sensitive", (Object) Boolean.valueOf(q.mo12646u()));
                    }
                    if (q.mo12648w() > 0) {
                        m9774a(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String str2 : q.mo12647v()) {
                            m9774a(sb, i2 + 2);
                            sb.append(str2);
                            sb.append("\n");
                        }
                        sb.append(str);
                    }
                    m9774a(sb, i2);
                    sb.append(str);
                }
            }
            if (j0Var.mo12554r()) {
                m9777a(sb, i + 1, "number_filter", j0Var.mo12555s());
            }
            m9774a(sb, i);
            sb.append(str);
        }
    }

    /* renamed from: a */
    private static void m9776a(StringBuilder sb, int i, String str, C3979e1 e1Var, String str2) {
        if (e1Var != null) {
            m9774a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            String str3 = ", ";
            if (e1Var.mo12372s() != 0) {
                m9774a(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long l : e1Var.mo12371r()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (e1Var.mo12370q() != 0) {
                m9774a(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long l2 : e1Var.mo12367a()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(str3);
                    }
                    sb.append(l2);
                    i4 = i5;
                }
                sb.append(10);
            }
            String str4 = "}\n";
            if (e1Var.mo12374u() != 0) {
                m9774a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (C4273x0 x0Var : e1Var.mo12373t()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(str3);
                    }
                    sb.append(x0Var.mo12900a() ? Integer.valueOf(x0Var.mo12901q()) : null);
                    sb.append(":");
                    sb.append(x0Var.mo12902r() ? Long.valueOf(x0Var.mo12903s()) : null);
                    i6 = i7;
                }
                sb.append(str4);
            }
            if (e1Var.mo12376w() != 0) {
                m9774a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (C3995f1 f1Var : e1Var.mo12375v()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(str3);
                    }
                    sb.append(f1Var.mo12439a() ? Integer.valueOf(f1Var.mo12441q()) : null);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : f1Var.mo12442r()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(str3);
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append(str4);
            }
            m9774a(sb, 3);
            sb.append(str4);
        }
    }

    /* renamed from: a */
    private final void m9777a(StringBuilder sb, int i, String str, C4072k0 k0Var) {
        if (k0Var != null) {
            m9774a(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (k0Var.mo12579a()) {
                m9778a(sb, i, "comparison_type", (Object) k0Var.mo12580q().name());
            }
            if (k0Var.mo12581r()) {
                m9778a(sb, i, "match_as_float", (Object) Boolean.valueOf(k0Var.mo12582s()));
            }
            if (k0Var.mo12583t()) {
                m9778a(sb, i, "comparison_value", (Object) k0Var.mo12584u());
            }
            if (k0Var.mo12585v()) {
                m9778a(sb, i, "min_comparison_value", (Object) k0Var.mo12586w());
            }
            if (k0Var.mo12587x()) {
                m9778a(sb, i, "max_comparison_value", (Object) k0Var.mo12588y());
            }
            m9774a(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: a */
    private static void m9778a(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m9774a(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: a */
    private final void m9779a(StringBuilder sb, int i, List<C3909a1> list) {
        if (list != null) {
            int i2 = i + 1;
            for (C3909a1 a1Var : list) {
                if (a1Var != null) {
                    m9774a(sb, i2);
                    sb.append("param {\n");
                    String str = "double_value";
                    String str2 = "int_value";
                    String str3 = "string_value";
                    String str4 = "name";
                    Double d = null;
                    if (!C3988e9.m16328b() || !mo7827m().mo7108a(C2457t.f6873F0)) {
                        m9778a(sb, i2, str4, (Object) mo7824e().mo7719b(a1Var.mo12057q()));
                        m9778a(sb, i2, str3, (Object) a1Var.mo12059s());
                        m9778a(sb, i2, str2, a1Var.mo12060t() ? Long.valueOf(a1Var.mo12061u()) : null);
                        if (a1Var.mo12062v()) {
                            d = Double.valueOf(a1Var.mo12063w());
                        }
                        m9778a(sb, i2, str, (Object) d);
                    } else {
                        m9778a(sb, i2, str4, a1Var.mo12056a() ? mo7824e().mo7719b(a1Var.mo12057q()) : null);
                        m9778a(sb, i2, str3, a1Var.mo12058r() ? a1Var.mo12059s() : null);
                        m9778a(sb, i2, str2, a1Var.mo12060t() ? Long.valueOf(a1Var.mo12061u()) : null);
                        if (a1Var.mo12062v()) {
                            d = Double.valueOf(a1Var.mo12063w());
                        }
                        m9778a(sb, i2, str, (Object) d);
                        if (a1Var.mo12065y() > 0) {
                            m9779a(sb, i2, a1Var.mo12064x());
                        }
                    }
                    m9774a(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m9780a(C2435r rVar, C2244aa aaVar) {
        C2148s.m8834a(rVar);
        C2148s.m8834a(aaVar);
        return !TextUtils.isEmpty(aaVar.f6244g) || !TextUtils.isEmpty(aaVar.f6260w);
    }

    /* renamed from: a */
    static boolean m9781a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    /* renamed from: a */
    static boolean m9782a(List<Long> list, int i) {
        if (i < (list.size() << 6)) {
            if (((1 << (i % 64)) & ((Long) list.get(i / 64)).longValue()) != 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static C3909a1 m9783b(C4289y0 y0Var, String str) {
        for (C3909a1 a1Var : y0Var.mo12909a()) {
            if (a1Var.mo12057q().equals(str)) {
                return a1Var;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo7603a(byte[] bArr) {
        C2148s.m8834a(bArr);
        mo7825k().mo7274c();
        MessageDigest y = C2489v9.m10035y();
        if (y != null) {
            return C2489v9.m10005a(y.digest(bArr));
        }
        mo7098j().mo7815t().mo7088a("Failed to get MD5");
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:9|10|11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        mo7098j().mo7815t().mo7088a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo7604a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ a -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ a -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ a -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ a -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ a -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002d
        L_0x001c:
            com.google.android.gms.measurement.internal.y3 r5 = r4.mo7098j()     // Catch:{ all -> 0x001a }
            com.google.android.gms.measurement.internal.a4 r5 = r5.mo7815t()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo7088a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002d:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2445r9.mo7604a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo7605a(C4289y0 y0Var, String str) {
        C3909a1 b = m9783b(y0Var, str);
        if (b != null) {
            if (b.mo12058r()) {
                return b.mo12059s();
            }
            if (b.mo12060t()) {
                return Long.valueOf(b.mo12061u());
            }
            if (b.mo12062v()) {
                return Double.valueOf(b.mo12063w());
            }
            if (C3988e9.m16328b() && mo7827m().mo7108a(C2457t.f6877H0) && b.mo12065y() > 0) {
                List<C3909a1> x = b.mo12064x();
                ArrayList arrayList = new ArrayList();
                for (C3909a1 a1Var : x) {
                    if (a1Var != null) {
                        Bundle bundle = new Bundle();
                        for (C3909a1 a1Var2 : a1Var.mo12064x()) {
                            if (a1Var2.mo12058r()) {
                                bundle.putString(a1Var2.mo12057q(), a1Var2.mo12059s());
                            } else if (a1Var2.mo12060t()) {
                                bundle.putLong(a1Var2.mo12057q(), a1Var2.mo12061u());
                            } else if (a1Var2.mo12062v()) {
                                bundle.putDouble(a1Var2.mo12057q(), a1Var2.mo12063w());
                            }
                        }
                        if (!bundle.isEmpty()) {
                            arrayList.add(bundle);
                        }
                    }
                }
                return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo7606a(C3925b1 b1Var) {
        if (b1Var == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        Iterator it = b1Var.mo12102a().iterator();
        while (true) {
            String str = "}\n";
            if (it.hasNext()) {
                C3941c1 c1Var = (C3941c1) it.next();
                if (c1Var != null) {
                    m9774a(sb, 1);
                    sb.append("bundle {\n");
                    if (c1Var.mo12148a()) {
                        m9778a(sb, 1, "protocol_version", (Object) Integer.valueOf(c1Var.mo12138Q()));
                    }
                    m9778a(sb, 1, "platform", (Object) c1Var.mo12162k0());
                    if (c1Var.mo12172r0()) {
                        m9778a(sb, 1, "gmp_version", (Object) Long.valueOf(c1Var.mo12169q()));
                    }
                    if (c1Var.mo12171r()) {
                        m9778a(sb, 1, "uploading_gmp_version", (Object) Long.valueOf(c1Var.mo12173s()));
                    }
                    if (c1Var.mo12141T()) {
                        m9778a(sb, 1, "dynamite_version", (Object) Long.valueOf(c1Var.mo12142U()));
                    }
                    if (c1Var.mo12132K()) {
                        m9778a(sb, 1, "config_version", (Object) Long.valueOf(c1Var.mo12133L()));
                    }
                    m9778a(sb, 1, "gmp_app_id", (Object) c1Var.mo12124C());
                    m9778a(sb, 1, "admob_app_id", (Object) c1Var.mo12140S());
                    m9778a(sb, 1, "app_id", (Object) c1Var.mo12168p0());
                    m9778a(sb, 1, "app_version", (Object) c1Var.mo12170q0());
                    if (c1Var.mo12129H()) {
                        m9778a(sb, 1, "app_version_major", (Object) Integer.valueOf(c1Var.mo12130I()));
                    }
                    m9778a(sb, 1, "firebase_instance_id", (Object) c1Var.mo12128G());
                    if (c1Var.mo12178x()) {
                        m9778a(sb, 1, "dev_cert_hash", (Object) Long.valueOf(c1Var.mo12179y()));
                    }
                    m9778a(sb, 1, "app_store", (Object) c1Var.mo12167o0());
                    if (c1Var.mo12149a0()) {
                        m9778a(sb, 1, "upload_timestamp_millis", (Object) Long.valueOf(c1Var.mo12151b0()));
                    }
                    if (c1Var.mo12153c0()) {
                        m9778a(sb, 1, "start_timestamp_millis", (Object) Long.valueOf(c1Var.mo12154d0()));
                    }
                    if (c1Var.mo12155e0()) {
                        m9778a(sb, 1, "end_timestamp_millis", (Object) Long.valueOf(c1Var.mo12157f0()));
                    }
                    if (c1Var.mo12158g0()) {
                        m9778a(sb, 1, "previous_bundle_start_timestamp_millis", (Object) Long.valueOf(c1Var.mo12159h0()));
                    }
                    if (c1Var.mo12160i0()) {
                        m9778a(sb, 1, "previous_bundle_end_timestamp_millis", (Object) Long.valueOf(c1Var.mo12161j0()));
                    }
                    m9778a(sb, 1, "app_instance_id", (Object) c1Var.mo12177w());
                    m9778a(sb, 1, "resettable_device_id", (Object) c1Var.mo12174t());
                    m9778a(sb, 1, "device_id", (Object) c1Var.mo12131J());
                    m9778a(sb, 1, "ds_id", (Object) c1Var.mo12136O());
                    if (c1Var.mo12175u()) {
                        m9778a(sb, 1, "limited_ad_tracking", (Object) Boolean.valueOf(c1Var.mo12176v()));
                    }
                    m9778a(sb, 1, "os_version", (Object) c1Var.mo12163l0());
                    m9778a(sb, 1, "device_model", (Object) c1Var.mo12165m0());
                    m9778a(sb, 1, "user_default_language", (Object) c1Var.mo12164m());
                    if (c1Var.mo12156f()) {
                        m9778a(sb, 1, "time_zone_offset_minutes", (Object) Integer.valueOf(c1Var.mo12166n0()));
                    }
                    if (c1Var.mo12180z()) {
                        m9778a(sb, 1, "bundle_sequential_index", (Object) Integer.valueOf(c1Var.mo12122A()));
                    }
                    if (c1Var.mo12125D()) {
                        m9778a(sb, 1, "service_upload", (Object) Boolean.valueOf(c1Var.mo12126E()));
                    }
                    m9778a(sb, 1, "health_monitor", (Object) c1Var.mo12123B());
                    if (!mo7827m().mo7108a(C2457t.f6889N0) && c1Var.mo12134M() && c1Var.mo12135N() != 0) {
                        m9778a(sb, 1, "android_id", (Object) Long.valueOf(c1Var.mo12135N()));
                    }
                    if (c1Var.mo12137P()) {
                        m9778a(sb, 1, "retry_counter", (Object) Integer.valueOf(c1Var.mo12139R()));
                    }
                    List<C4012g1> Y = c1Var.mo12146Y();
                    String str2 = "name";
                    if (Y != null) {
                        for (C4012g1 g1Var : Y) {
                            if (g1Var != null) {
                                m9774a(sb, 2);
                                sb.append("user_property {\n");
                                Double d = null;
                                m9778a(sb, 2, "set_timestamp_millis", g1Var.mo12466a() ? Long.valueOf(g1Var.mo12467q()) : null);
                                m9778a(sb, 2, str2, (Object) mo7824e().mo7720c(g1Var.mo12468r()));
                                m9778a(sb, 2, "string_value", (Object) g1Var.mo12470t());
                                m9778a(sb, 2, "int_value", g1Var.mo12471u() ? Long.valueOf(g1Var.mo12472v()) : null);
                                if (g1Var.mo12473w()) {
                                    d = Double.valueOf(g1Var.mo12474x());
                                }
                                m9778a(sb, 2, "double_value", (Object) d);
                                m9774a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    List<C4258w0> F = c1Var.mo12127F();
                    String p0 = c1Var.mo12168p0();
                    if (F != null) {
                        for (C4258w0 w0Var : F) {
                            if (w0Var != null) {
                                m9774a(sb, 2);
                                sb.append("audience_membership {\n");
                                if (w0Var.mo12874a()) {
                                    m9778a(sb, 2, "audience_id", (Object) Integer.valueOf(w0Var.mo12875q()));
                                }
                                if (w0Var.mo12879u()) {
                                    m9778a(sb, 2, "new_audience", (Object) Boolean.valueOf(w0Var.mo12880v()));
                                }
                                m9776a(sb, 2, "current_data", w0Var.mo12876r(), p0);
                                if (w0Var.mo12877s()) {
                                    m9776a(sb, 2, "previous_data", w0Var.mo12878t(), p0);
                                }
                                m9774a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    List<C4289y0> W = c1Var.mo12144W();
                    if (W != null) {
                        for (C4289y0 y0Var : W) {
                            if (y0Var != null) {
                                m9774a(sb, 2);
                                sb.append("event {\n");
                                m9778a(sb, 2, str2, (Object) mo7824e().mo7718a(y0Var.mo12912r()));
                                if (y0Var.mo12913s()) {
                                    m9778a(sb, 2, "timestamp_millis", (Object) Long.valueOf(y0Var.mo12914t()));
                                }
                                if (y0Var.mo12915u()) {
                                    m9778a(sb, 2, "previous_timestamp_millis", (Object) Long.valueOf(y0Var.mo12916v()));
                                }
                                if (y0Var.mo12917w()) {
                                    m9778a(sb, 2, "count", (Object) Integer.valueOf(y0Var.mo12918x()));
                                }
                                if (y0Var.mo12911q() != 0) {
                                    m9779a(sb, 2, y0Var.mo12909a());
                                }
                                m9774a(sb, 2);
                                sb.append(str);
                            }
                        }
                    }
                    m9774a(sb, 1);
                    sb.append(str);
                }
            } else {
                sb.append(str);
                return sb.toString();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo7607a(C4042i0 i0Var) {
        if (i0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (i0Var.mo12520a()) {
            m9778a(sb, 0, "filter_id", (Object) Integer.valueOf(i0Var.mo12522q()));
        }
        m9778a(sb, 0, "event_name", (Object) mo7824e().mo7718a(i0Var.mo12523r()));
        String a = m9771a(i0Var.mo12528w(), i0Var.mo12529x(), i0Var.mo12531z());
        if (!a.isEmpty()) {
            m9778a(sb, 0, "filter_type", (Object) a);
        }
        if (i0Var.mo12526u()) {
            m9777a(sb, 1, "event_count_filter", i0Var.mo12527v());
        }
        if (i0Var.mo12525t() > 0) {
            sb.append("  filters {\n");
            for (C4057j0 a2 : i0Var.mo12524s()) {
                m9775a(sb, 2, a2);
            }
        }
        m9774a(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final String mo7608a(C4088l0 l0Var) {
        if (l0Var == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (l0Var.mo12597a()) {
            m9778a(sb, 0, "filter_id", (Object) Integer.valueOf(l0Var.mo12598q()));
        }
        m9778a(sb, 0, "property_name", (Object) mo7824e().mo7720c(l0Var.mo12599r()));
        String a = m9771a(l0Var.mo12601t(), l0Var.mo12602u(), l0Var.mo12604w());
        if (!a.isEmpty()) {
            m9778a(sb, 0, "filter_type", (Object) a);
        }
        m9775a(sb, 1, l0Var.mo12600s());
        sb.append("}\n");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final List<Long> mo7609a(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer num : list2) {
            if (num.intValue() < 0) {
                mo7098j().mo7818w().mo7089a("Ignoring negative bit index to be cleared", num);
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    mo7098j().mo7818w().mo7090a("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7610a(C3910a aVar, Object obj) {
        C2148s.m8834a(obj);
        aVar.mo12066a();
        aVar.mo12073p();
        aVar.mo12074q();
        aVar.mo12076s();
        if (obj instanceof String) {
            aVar.mo12072b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo12068a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo12067a(((Double) obj).doubleValue());
        } else if (!C3988e9.m16328b() || !mo7827m().mo7108a(C2457t.f6877H0) || !(obj instanceof Bundle[])) {
            mo7098j().mo7815t().mo7089a("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.mo12070a((Iterable<? extends C3909a1>) m9773a((Bundle[]) obj));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7611a(C4013a aVar, Object obj) {
        C2148s.m8834a(obj);
        aVar.mo12475a();
        aVar.mo12481p();
        aVar.mo12482q();
        if (obj instanceof String) {
            aVar.mo12480b((String) obj);
        } else if (obj instanceof Long) {
            aVar.mo12479b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.mo12476a(((Double) obj).doubleValue());
        } else {
            mo7098j().mo7815t().mo7089a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7612a(C4290a aVar, String str, Object obj) {
        List a = aVar.mo12927a();
        int i = 0;
        while (true) {
            if (i >= a.size()) {
                i = -1;
                break;
            } else if (str.equals(((C3909a1) a.get(i)).mo12057q())) {
                break;
            } else {
                i++;
            }
        }
        C3910a z = C3909a1.m15685z();
        z.mo12071a(str);
        if (obj instanceof Long) {
            z.mo12068a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            z.mo12072b((String) obj);
        } else if (obj instanceof Double) {
            z.mo12067a(((Double) obj).doubleValue());
        } else if (C3988e9.m16328b() && mo7827m().mo7108a(C2457t.f6877H0) && (obj instanceof Bundle[])) {
            z.mo12070a((Iterable<? extends C3909a1>) m9773a((Bundle[]) obj));
        }
        if (i >= 0) {
            aVar.mo12920a(i, z);
        } else {
            aVar.mo12923a(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7613a(long j, long j2) {
        return j == 0 || j2 <= 0 || Math.abs(mo7095g().mo6988b() - j) > j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final byte[] mo7614b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            mo7098j().mo7815t().mo7089a("Failed to ungzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final byte[] mo7615c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            mo7098j().mo7815t().mo7089a("Failed to gzip content", e);
            throw e;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo7181t() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final List<Integer> mo7616u() {
        Map a = C2457t.m9868a(this.f6652b.mo7096h());
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = ((Integer) C2457t.f6892P.mo7587a(null)).intValue();
        Iterator it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Entry entry = (Entry) it.next();
            if (((String) entry.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) entry.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            mo7098j().mo7818w().mo7089a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    mo7098j().mo7818w().mo7089a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }
}
