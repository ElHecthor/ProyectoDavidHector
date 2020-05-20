package com.google.android.gms.measurement.internal;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.C2087f;
import com.google.android.gms.common.C2090i;
import com.google.android.gms.common.internal.C2148s;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2191f;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import p147g.p156d.p157a.p167b.p173d.p180g.C3988e9;
import p147g.p156d.p157a.p167b.p173d.p180g.C4157pa;
import p147g.p156d.p157a.p167b.p173d.p180g.C4317zc;

/* renamed from: com.google.android.gms.measurement.internal.v9 */
public final class C2489v9 extends C2507x5 {

    /* renamed from: g */
    private static final String[] f7032g = {"firebase_", "google_", "ga_"};

    /* renamed from: h */
    private static final String[] f7033h = {"_err"};

    /* renamed from: c */
    private SecureRandom f7034c;

    /* renamed from: d */
    private final AtomicLong f7035d = new AtomicLong(0);

    /* renamed from: e */
    private int f7036e;

    /* renamed from: f */
    private Integer f7037f = null;

    C2489v9(C2263c5 c5Var) {
        super(c5Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0166 A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int m10002a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.mo7274c()
            boolean r2 = p147g.p156d.p157a.p167b.p173d.p180g.C3988e9.m16328b()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 0
            if (r2 == 0) goto L_0x007f
            com.google.android.gms.measurement.internal.b r2 = r17.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r5 = com.google.android.gms.measurement.internal.C2457t.f6881J0
            boolean r2 = r2.mo7108a(r5)
            if (r2 == 0) goto L_0x007f
            boolean r2 = m10015a(r21)
            if (r2 == 0) goto L_0x008a
            if (r25 == 0) goto L_0x007c
            java.lang.String[] r2 = com.google.android.gms.measurement.internal.C2252b6.f6283c
            boolean r2 = m10017a(r8, r2)
            if (r2 != 0) goto L_0x0035
            r0 = 20
            return r0
        L_0x0035:
            com.google.android.gms.measurement.internal.c5 r2 = r7.f7100a
            com.google.android.gms.measurement.internal.t7 r2 = r2.mo7194E()
            boolean r2 = r2.mo7635I()
            if (r2 != 0) goto L_0x0044
            r0 = 25
            return r0
        L_0x0044:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.m10024b(r4, r8, r2, r0)
            if (r5 != 0) goto L_0x008a
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x0060
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0079
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0079
        L_0x0060:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0079
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0079
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r9, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0079:
            r10 = 17
            goto L_0x008b
        L_0x007c:
            r0 = 21
            return r0
        L_0x007f:
            if (r25 == 0) goto L_0x008a
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.m10024b(r4, r8, r1, r0)
            if (r1 != 0) goto L_0x008a
            return r3
        L_0x008a:
            r10 = 0
        L_0x008b:
            com.google.android.gms.measurement.internal.b r1 = r17.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6896R
            r11 = r18
            boolean r1 = r1.mo7116e(r11, r2)
            if (r1 == 0) goto L_0x009f
            boolean r1 = m10029f(r19)
            if (r1 != 0) goto L_0x00a5
        L_0x009f:
            boolean r1 = m10029f(r20)
            if (r1 == 0) goto L_0x00a8
        L_0x00a5:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00aa
        L_0x00a8:
            r1 = 100
        L_0x00aa:
            boolean r1 = r7.mo7702a(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00b1
            return r10
        L_0x00b1:
            if (r25 == 0) goto L_0x0167
            boolean r1 = p147g.p156d.p157a.p167b.p173d.p180g.C3988e9.m16328b()
            r12 = 1
            if (r1 == 0) goto L_0x00c8
            com.google.android.gms.measurement.internal.b r1 = r17.mo7827m()
            com.google.android.gms.measurement.internal.r3<java.lang.Boolean> r2 = com.google.android.gms.measurement.internal.C2457t.f6879I0
            boolean r1 = r1.mo7108a(r2)
            if (r1 == 0) goto L_0x00c8
            r13 = 1
            goto L_0x00c9
        L_0x00c8:
            r13 = 0
        L_0x00c9:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00e4
            if (r13 == 0) goto L_0x00e1
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m10010a(r1, r2, r3, r4, r5, r6)
        L_0x00e1:
            r9 = 1
            goto L_0x0164
        L_0x00e4:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0123
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x00ed:
            if (r6 >= r15) goto L_0x00e1
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x0107
            com.google.android.gms.measurement.internal.y3 r1 = r17.mo7098j()
            com.google.android.gms.measurement.internal.a4 r1 = r1.mo7820y()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.mo7090a(r2, r0, r8)
            goto L_0x0164
        L_0x0107:
            if (r13 == 0) goto L_0x011e
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.m10010a(r1, r2, r3, r4, r5, r6)
            goto L_0x0120
        L_0x011e:
            r16 = r6
        L_0x0120:
            int r6 = r16 + 1
            goto L_0x00ed
        L_0x0123:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0164
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x012f:
            if (r0 >= r15) goto L_0x00e1
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x014d
            com.google.android.gms.measurement.internal.y3 r0 = r17.mo7098j()
            com.google.android.gms.measurement.internal.a4 r0 = r0.mo7820y()
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.mo7090a(r2, r1, r8)
            goto L_0x0164
        L_0x014d:
            if (r13 == 0) goto L_0x0161
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.m10010a(r1, r2, r3, r4, r5, r6)
        L_0x0161:
            r0 = r16
            goto L_0x012f
        L_0x0164:
            if (r9 == 0) goto L_0x0167
            return r10
        L_0x0167:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2489v9.m10002a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    /* renamed from: a */
    public static long m10003a(long j, long j2) {
        return (j + (j2 * 60000)) / 86400000;
    }

    /* renamed from: a */
    public static long m10004a(C2377m mVar) {
        long j = 0;
        if (mVar == null) {
            return 0;
        }
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            Object a = mVar.mo7498a((String) it.next());
            if (a instanceof Parcelable[]) {
                j += (long) ((Parcelable[]) a).length;
            }
        }
        return j;
    }

    /* renamed from: a */
    static long m10005a(byte[] bArr) {
        C2148s.m8834a(bArr);
        int i = 0;
        C2148s.m8845b(bArr.length > 0);
        long j = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j += (((long) bArr[length]) & 255) << i;
            i += 8;
            length--;
        }
        return j;
    }

    /* renamed from: a */
    public static Bundle m10006a(List<C2478u9> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (C2478u9 u9Var : list) {
            String str = u9Var.f7001j;
            if (str != null) {
                bundle.putString(u9Var.f6998g, str);
            } else {
                Long l = u9Var.f7000i;
                if (l != null) {
                    bundle.putLong(u9Var.f6998g, l.longValue());
                } else {
                    Double d = u9Var.f7003l;
                    if (d != null) {
                        bundle.putDouble(u9Var.f6998g, d.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private final Object m10007a(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return m10008a(String.valueOf(obj), i, z);
            }
            if (!C3988e9.m16328b() || !mo7827m().mo7108a(C2457t.f6879I0) || !mo7827m().mo7108a(C2457t.f6877H0) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle a = mo7683a((Bundle) parcelable);
                    if (a != null && !a.isEmpty()) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* renamed from: a */
    public static String m10008a(String str, int i, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i))).concat("...");
        }
        return null;
    }

    /* renamed from: a */
    private static void m10009a(Bundle bundle, int i, String str, String str2, Object obj) {
        if (m10023b(bundle, i)) {
            bundle.putString("_ev", m10008a(str, 40, true));
            if (obj != null) {
                C2148s.m8834a(bundle);
                if (obj == null) {
                    return;
                }
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    /* renamed from: a */
    private final void m10010a(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i;
        String str4;
        int i2;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean a = mo7827m().mo7108a(C2457t.f6881J0);
            int n = a ? 0 : mo7827m().mo7121n();
            int i3 = 0;
            for (String str7 : new TreeSet(bundle.keySet())) {
                if (list2 == null || !list2.contains(str7)) {
                    i = z ? m10031h(str7) : 0;
                    if (i == 0) {
                        i = m10032i(str7);
                    }
                } else {
                    i = 0;
                }
                if (i != 0) {
                    m10009a(bundle2, i, str7, str7, (Object) i == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (m10015a(bundle2.get(str7))) {
                        mo7098j().mo7820y().mo7091a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i2 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i2 = m10002a(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i2 != 0 && !"_ev".equals(str4)) {
                        m10009a(bundle2, i2, str4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (m10028e(str4) && (!a || !m10017a(str4, C2252b6.f6284d))) {
                        int i4 = i3 + 1;
                        if (i4 > n) {
                            if (a) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(n);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            mo7098j().mo7817v().mo7090a(str5, mo7824e().mo7718a(str6), mo7824e().mo7716a(bundle2));
                            m10023b(bundle2, a ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i3 = i4;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static boolean m10011a(Context context, boolean z) {
        C2148s.m8834a(context);
        return m10022b(context, VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService");
    }

    /* renamed from: a */
    static boolean m10012a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    /* renamed from: a */
    static boolean m10013a(Bundle bundle, int i) {
        int i2 = 0;
        if (bundle.size() <= i) {
            return false;
        }
        for (String str : new TreeSet(bundle.keySet())) {
            i2++;
            if (i2 > i) {
                bundle.remove(str);
            }
        }
        return true;
    }

    /* renamed from: a */
    static boolean m10014a(Boolean bool, Boolean bool2) {
        if (bool == null && bool2 == null) {
            return true;
        }
        if (bool == null) {
            return false;
        }
        return bool.equals(bool2);
    }

    /* renamed from: a */
    static boolean m10015a(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    /* renamed from: a */
    static boolean m10016a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    /* renamed from: a */
    private static boolean m10017a(String str, String[] strArr) {
        C2148s.m8834a(strArr);
        for (String c : strArr) {
            if (m10027c(str, c)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m10018a(List<String> list, List<String> list2) {
        if (list == null && list2 == null) {
            return true;
        }
        if (list == null) {
            return false;
        }
        return list.equals(list2);
    }

    /* renamed from: a */
    static byte[] m10019a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    /* renamed from: b */
    public static Bundle m10020b(Bundle bundle) {
        if (bundle == null) {
            return new Bundle();
        }
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle2.keySet()) {
            Object obj = bundle2.get(str);
            if (obj instanceof Bundle) {
                bundle2.putBundle(str, new Bundle((Bundle) obj));
            } else {
                int i = 0;
                if (obj instanceof Parcelable[]) {
                    Parcelable[] parcelableArr = (Parcelable[]) obj;
                    while (i < parcelableArr.length) {
                        if (parcelableArr[i] instanceof Bundle) {
                            parcelableArr[i] = new Bundle((Bundle) parcelableArr[i]);
                        }
                        i++;
                    }
                } else if (obj instanceof List) {
                    List list = (List) obj;
                    while (i < list.size()) {
                        Object obj2 = list.get(i);
                        if (obj2 instanceof Bundle) {
                            list.set(i, new Bundle((Bundle) obj2));
                        }
                        i++;
                    }
                }
            }
        }
        return bundle2;
    }

    /* renamed from: b */
    public static ArrayList<Bundle> m10021b(List<C2388ma> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (C2388ma maVar : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", maVar.f6680f);
            bundle.putString("origin", maVar.f6681g);
            bundle.putLong("creation_timestamp", maVar.f6683i);
            bundle.putString("name", maVar.f6682h.f6998g);
            C2529z5.m10195a(bundle, maVar.f6682h.mo7665a());
            bundle.putBoolean("active", maVar.f6684j);
            String str = maVar.f6685k;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            C2435r rVar = maVar.f6686l;
            if (rVar != null) {
                bundle.putString("timed_out_event_name", rVar.f6817f);
                C2377m mVar = maVar.f6686l.f6818g;
                if (mVar != null) {
                    bundle.putBundle("timed_out_event_params", mVar.mo7499b());
                }
            }
            bundle.putLong("trigger_timeout", maVar.f6687m);
            C2435r rVar2 = maVar.f6688n;
            if (rVar2 != null) {
                bundle.putString("triggered_event_name", rVar2.f6817f);
                C2377m mVar2 = maVar.f6688n.f6818g;
                if (mVar2 != null) {
                    bundle.putBundle("triggered_event_params", mVar2.mo7499b());
                }
            }
            bundle.putLong("triggered_timestamp", maVar.f6682h.f6999h);
            bundle.putLong("time_to_live", maVar.f6689o);
            C2435r rVar3 = maVar.f6690p;
            if (rVar3 != null) {
                bundle.putString("expired_event_name", rVar3.f6817f);
                C2377m mVar3 = maVar.f6690p.f6818g;
                if (mVar3 != null) {
                    bundle.putBundle("expired_event_params", mVar3.mo7499b());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m10022b(Context context, String str) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0);
            if (serviceInfo != null && serviceInfo.enabled) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
        }
    }

    /* renamed from: b */
    static boolean m10023b(Bundle bundle, int i) {
        if (bundle == null) {
            return false;
        }
        String str = "_err";
        if (bundle.getLong(str) != 0) {
            return false;
        }
        bundle.putLong(str, (long) i);
        return true;
    }

    /* renamed from: b */
    private final boolean m10024b(String str, String str2, int i, Object obj) {
        int i2;
        if (obj instanceof Parcelable[]) {
            i2 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i2 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i2 > i) {
            mo7098j().mo7820y().mo7091a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i2));
            return false;
        }
        return true;
    }

    /* renamed from: b */
    static Bundle[] m10025b(Object obj) {
        Object[] array;
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        }
        if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            array = Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            array = arrayList.toArray(new Bundle[arrayList.size()]);
        }
        return (Bundle[]) array;
    }

    /* renamed from: c */
    private final boolean m10026c(Context context, String str) {
        C2238a4 a4Var;
        String str2;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = C2175c.m8939a(context).mo6964b(str, 64);
            if (!(b == null || b.signatures == null || b.signatures.length <= 0)) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(b.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
        } catch (CertificateException e) {
            e = e;
            a4Var = mo7098j().mo7815t();
            str2 = "Error obtaining certificate";
            a4Var.mo7089a(str2, e);
            return true;
        } catch (NameNotFoundException e2) {
            e = e2;
            a4Var = mo7098j().mo7815t();
            str2 = "Package name not found";
            a4Var.mo7089a(str2, e);
            return true;
        }
        return true;
    }

    /* renamed from: c */
    static boolean m10027c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    /* renamed from: e */
    static boolean m10028e(String str) {
        C2148s.m8844b(str);
        return str.charAt(0) != '_' || str.equals("_ep");
    }

    /* renamed from: f */
    static boolean m10029f(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith("_");
    }

    /* renamed from: g */
    public static boolean m10030g(String str) {
        for (String equals : f7033h) {
            if (equals.equals(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private final int m10031h(String str) {
        String str2 = "event param";
        if (!mo7701a(str2, str)) {
            return 3;
        }
        if (!mo7704a(str2, (String[]) null, str)) {
            return 14;
        }
        return !mo7700a(str2, 40, str) ? 3 : 0;
    }

    /* renamed from: i */
    private final int m10032i(String str) {
        String str2 = "event param";
        if (!mo7707b(str2, str)) {
            return 3;
        }
        if (!mo7704a(str2, (String[]) null, str)) {
            return 14;
        }
        return !mo7700a(str2, 40, str) ? 3 : 0;
    }

    /* renamed from: j */
    private static boolean m10033j(String str) {
        C2148s.m8834a(str);
        return str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$");
    }

    /* renamed from: k */
    private final int m10034k(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!mo7827m().mo7108a(C2457t.f6931m0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    /* renamed from: y */
    static MessageDigest m10035y() {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int mo7679a(int i) {
        return C2087f.m8630a().mo6797a(mo7096h(), (int) C2090i.GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo7680a(String str) {
        String str2 = "event";
        if (!mo7707b(str2, str)) {
            return 2;
        }
        if (!mo7704a(str2, C2264c6.f6343a, str)) {
            return 13;
        }
        return !mo7700a(str2, 40, str) ? 2 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final long mo7681a(Context context, String str) {
        mo7274c();
        C2148s.m8834a(context);
        C2148s.m8844b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest y = m10035y();
        if (y == null) {
            mo7098j().mo7815t().mo7088a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!m10026c(context, str)) {
                    PackageInfo b = C2175c.m8939a(context).mo6964b(mo7096h().getPackageName(), 64);
                    if (b.signatures != null && b.signatures.length > 0) {
                        return m10005a(y.digest(b.signatures[0].toByteArray()));
                    }
                    mo7098j().mo7818w().mo7088a("Could not get signatures");
                    return -1;
                }
            } catch (NameNotFoundException e) {
                mo7098j().mo7815t().mo7089a("Package name not found", e);
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo7682a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            String str5 = "gclid";
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter(str5);
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString(str5, str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String str6 = "aclid";
            String queryParameter3 = uri.getQueryParameter(str6);
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString(str6, queryParameter3);
            }
            String str7 = "cp1";
            String queryParameter4 = uri.getQueryParameter(str7);
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString(str7, queryParameter4);
            }
            String str8 = "anid";
            String queryParameter5 = uri.getQueryParameter(str8);
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString(str8, queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e) {
            mo7098j().mo7818w().mo7089a("Install referrer url isn't a hierarchical URI", e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo7683a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = mo7686a(str, bundle.get(str));
                if (a == null) {
                    mo7098j().mo7820y().mo7089a("Param value can't be null", mo7824e().mo7719b(str));
                } else {
                    mo7690a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Bundle mo7684a(String str, String str2, Bundle bundle, List<String> list, boolean z, boolean z2) {
        int i;
        int i2;
        Bundle bundle2;
        String str3;
        int i3;
        String str4 = str2;
        Bundle bundle3 = bundle;
        List<String> list2 = list;
        boolean z3 = C3988e9.m16328b() && mo7827m().mo7108a(C2457t.f6881J0);
        boolean a = z3 ? m10017a(str4, C2264c6.f6345c) : z2;
        if (bundle3 == null) {
            return null;
        }
        Bundle bundle4 = new Bundle(bundle3);
        int n = mo7827m().mo7121n();
        int i4 = 0;
        for (String str5 : mo7827m().mo7116e(str, C2457t.f6911c0) ? new TreeSet(bundle.keySet()) : bundle.keySet()) {
            if (list2 == null || !list2.contains(str5)) {
                i = z ? m10031h(str5) : 0;
                if (i == 0) {
                    i = m10032i(str5);
                }
            } else {
                i = 0;
            }
            if (i != 0) {
                m10009a(bundle4, i, str5, str5, (Object) i == 3 ? str5 : null);
                bundle4.remove(str5);
                i2 = n;
                bundle2 = bundle4;
            } else {
                String str6 = str5;
                i2 = n;
                Bundle bundle5 = bundle4;
                int a2 = m10002a(str, str2, str5, bundle3.get(str5), bundle4, list, z, a);
                if (!z3 || a2 != 17) {
                    str3 = str6;
                    bundle2 = bundle5;
                    if (a2 != 0 && !"_ev".equals(str3)) {
                        m10009a(bundle2, a2, a2 == 21 ? str4 : str3, str3, bundle3.get(str3));
                        bundle2.remove(str3);
                    }
                } else {
                    str3 = str6;
                    bundle2 = bundle5;
                    m10009a(bundle2, a2, str3, str3, (Object) Boolean.valueOf(false));
                }
                if (m10028e(str3)) {
                    int i5 = i4 + 1;
                    i3 = i2;
                    if (i5 > i3) {
                        StringBuilder sb = new StringBuilder(48);
                        sb.append("Event can't contain more than ");
                        sb.append(i3);
                        sb.append(" params");
                        mo7098j().mo7817v().mo7090a(sb.toString(), mo7824e().mo7718a(str4), mo7824e().mo7716a(bundle3));
                        m10023b(bundle2, 5);
                        bundle2.remove(str3);
                        String str7 = str;
                        i4 = i5;
                        n = i3;
                        bundle4 = bundle2;
                    } else {
                        i4 = i5;
                    }
                } else {
                    i3 = i2;
                }
                String str8 = str;
                n = i3;
                bundle4 = bundle2;
            }
            String str9 = str;
            bundle4 = bundle2;
            n = i2;
        }
        return bundle4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2435r mo7685a(String str, String str2, Bundle bundle, String str3, long j, boolean z, boolean z2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (mo7680a(str2) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            Bundle bundle3 = bundle2;
            String str4 = "_o";
            bundle3.putString(str4, str3);
            String str5 = str2;
            C2435r rVar = new C2435r(str5, new C2377m(mo7683a(mo7684a(str, str2, bundle3, C2191f.m8981a(str4), false, false))), str3, j);
            return rVar;
        }
        mo7098j().mo7815t().mo7089a("Invalid conditional property event name", mo7824e().mo7720c(str2));
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Object mo7686a(String str, Object obj) {
        int i = 256;
        if ("_ev".equals(str)) {
            return m10007a(256, obj, true, true);
        }
        if (!m10029f(str)) {
            i = 100;
        }
        return m10007a(i, obj, false, true);
    }

    /* renamed from: a */
    public final URL mo7687a(long j, String str, String str2, long j2) {
        try {
            C2148s.m8844b(str2);
            C2148s.m8844b(str);
            String format = String.format("https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=%s&rdid=%s&bundleid=%s&retry=%s", new Object[]{String.format("v%s.%s", new Object[]{Long.valueOf(j), Integer.valueOf(mo7713v())}), str2, str, Long.valueOf(j2)});
            if (str.equals(mo7827m().mo7128u())) {
                format = format.concat("&ddl_test=1");
            }
            return new URL(format);
        } catch (IllegalArgumentException | MalformedURLException e) {
            mo7098j().mo7815t().mo7089a("Failed to create BOW URL for Deferred Deep Link. exception", e.getMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final void mo7688a(int i, String str, String str2, int i2) {
        mo7698a((String) null, i, str, str2, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7689a(Bundle bundle, long j) {
        String str = "_et";
        long j2 = bundle.getLong(str);
        if (j2 != 0) {
            mo7098j().mo7818w().mo7089a("Params already contained engagement", Long.valueOf(j2));
        }
        bundle.putLong(str, j + j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7690a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!C3988e9.m16328b() || !mo7827m().mo7108a(C2457t.f6879I0) || !mo7827m().mo7108a(C2457t.f6877H0) || !(obj instanceof Bundle[])) {
                if (str != null) {
                    mo7098j().mo7820y().mo7090a("Not putting event parameter. Invalid value type. name, type", mo7824e().mo7719b(str), obj != null ? obj.getClass().getSimpleName() : null);
                }
            } else {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            }
        }
    }

    /* renamed from: a */
    public final void mo7691a(C4317zc zcVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning int value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo7692a(C4317zc zcVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning long value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo7693a(C4317zc zcVar, Bundle bundle) {
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning bundle value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo7694a(C4317zc zcVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning string value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo7695a(C4317zc zcVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning bundle list to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo7696a(C4317zc zcVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning boolean value to wrapper", e);
        }
    }

    /* renamed from: a */
    public final void mo7697a(C4317zc zcVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            zcVar.mo12121a(bundle);
        } catch (RemoteException e) {
            this.f7100a.mo7098j().mo7818w().mo7089a("Error returning byte array to wrapper", e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo7698a(String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        m10023b(bundle, i);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", (long) i2);
        }
        this.f7100a.mo7094f();
        this.f7100a.mo7217u().mo7431a("auto", "_err", bundle);
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"ApplySharedPref"})
    /* renamed from: a */
    public final boolean mo7699a(String str, double d) {
        try {
            Editor edit = mo7096h().getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d));
            return edit.commit();
        } catch (Exception e) {
            mo7098j().mo7815t().mo7089a("Failed to persist Deferred Deep Link. exception", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7700a(String str, int i, String str2) {
        if (str2 == null) {
            mo7098j().mo7817v().mo7089a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i) {
            return true;
        } else {
            mo7098j().mo7817v().mo7091a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7701a(String str, String str2) {
        if (str2 == null) {
            mo7098j().mo7817v().mo7089a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo7098j().mo7817v().mo7089a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                mo7098j().mo7817v().mo7090a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    mo7098j().mo7817v().mo7090a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7702a(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i) {
                mo7098j().mo7820y().mo7091a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7703a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            if (!m10033j(str)) {
                if (this.f7100a.mo7221y()) {
                    mo7098j().mo7817v().mo7089a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", C2516y3.m10125a(str));
                }
                return false;
            }
        } else if (!C4157pa.m16931b() || !mo7827m().mo7108a(C2457t.f6937p0) || TextUtils.isEmpty(str3)) {
            if (TextUtils.isEmpty(str2)) {
                if (this.f7100a.mo7221y()) {
                    mo7098j().mo7817v().mo7088a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                return false;
            } else if (!m10033j(str2)) {
                mo7098j().mo7817v().mo7089a("Invalid admob_app_id. Analytics disabled.", C2516y3.m10125a(str2));
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo7704a(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            mo7098j().mo7817v().mo7089a("Name is required and can't be null. Type", str);
            return false;
        }
        C2148s.m8834a(str2);
        String[] strArr2 = f7032g;
        int length = strArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i])) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo7098j().mo7817v().mo7090a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !m10017a(str2, strArr)) {
            return true;
        } else {
            mo7098j().mo7817v().mo7090a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo7705b(String str) {
        String str2 = "user property";
        if (!mo7707b(str2, str)) {
            return 6;
        }
        if (!mo7704a(str2, C2288e6.f6377a, str)) {
            return 15;
        }
        return !mo7700a(str2, 24, str) ? 6 : 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo7706b(String str, Object obj) {
        String str2;
        int i;
        if ("_ldl".equals(str)) {
            i = m10034k(str);
            str2 = "user property referrer";
        } else {
            i = m10034k(str);
            str2 = "user property";
        }
        return mo7702a(str2, str, i, obj) ? 0 : 7;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo7707b(String str, String str2) {
        if (str2 == null) {
            mo7098j().mo7817v().mo7089a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            mo7098j().mo7817v().mo7089a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        mo7098j().mo7817v().mo7090a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            mo7098j().mo7817v().mo7090a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Object mo7708c(String str, Object obj) {
        boolean equals = "_ldl".equals(str);
        int k = m10034k(str);
        return equals ? m10007a(k, obj, true, false) : m10007a(k, obj, false, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo7709c(String str) {
        mo7274c();
        if (C2175c.m8939a(mo7096h()).mo6957a(str) == 0) {
            return true;
        }
        mo7098j().mo7809A().mo7089a("Permission not granted", str);
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo7710d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String t = mo7827m().mo7127t();
        mo7094f();
        return t.equals(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo7477n() {
        mo7274c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                mo7098j().mo7818w().mo7088a("Utils falling back to Random for random id");
            }
        }
        this.f7035d.set(nextLong);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo7397r() {
        return true;
    }

    /* renamed from: t */
    public final long mo7711t() {
        int i = (this.f7035d.get() > 0 ? 1 : (this.f7035d.get() == 0 ? 0 : -1));
        synchronized (this.f7035d) {
            if (i == 0) {
                long nextLong = new Random(System.nanoTime() ^ mo7095g().mo6988b()).nextLong();
                int i2 = this.f7036e + 1;
                this.f7036e = i2;
                long j = nextLong + ((long) i2);
                return j;
            }
            this.f7035d.compareAndSet(-1, 1);
            long andIncrement = this.f7035d.getAndIncrement();
            return andIncrement;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final SecureRandom mo7712u() {
        mo7274c();
        if (this.f7034c == null) {
            this.f7034c = new SecureRandom();
        }
        return this.f7034c;
    }

    /* renamed from: v */
    public final int mo7713v() {
        if (this.f7037f == null) {
            this.f7037f = Integer.valueOf(C2087f.m8630a().mo6812a(mo7096h()) / 1000);
        }
        return this.f7037f.intValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final String mo7714w() {
        byte[] bArr = new byte[16];
        mo7712u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    /* renamed from: x */
    public final boolean mo7715x() {
        try {
            mo7096h().getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
