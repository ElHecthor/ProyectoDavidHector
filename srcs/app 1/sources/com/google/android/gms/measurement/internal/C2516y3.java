package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.measurement.internal.y3 */
public final class C2516y3 extends C2507x5 {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public char f7088c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f7089d = -1;

    /* renamed from: e */
    private String f7090e;

    /* renamed from: f */
    private final C2238a4 f7091f = new C2238a4(this, 6, false, false);

    /* renamed from: g */
    private final C2238a4 f7092g = new C2238a4(this, 6, true, false);

    /* renamed from: h */
    private final C2238a4 f7093h = new C2238a4(this, 6, false, true);

    /* renamed from: i */
    private final C2238a4 f7094i = new C2238a4(this, 5, false, false);

    /* renamed from: j */
    private final C2238a4 f7095j = new C2238a4(this, 5, true, false);

    /* renamed from: k */
    private final C2238a4 f7096k = new C2238a4(this, 5, false, true);

    /* renamed from: l */
    private final C2238a4 f7097l = new C2238a4(this, 4, false, false);

    /* renamed from: m */
    private final C2238a4 f7098m = new C2238a4(this, 3, false, false);

    /* renamed from: n */
    private final C2238a4 f7099n = new C2238a4(this, 2, false, false);

    C2516y3(C2263c5 c5Var) {
        super(c5Var);
    }

    /* renamed from: D */
    private final String m10121D() {
        String str;
        String str2;
        synchronized (this) {
            if (this.f7090e == null) {
                if (this.f7100a.mo7191B() != null) {
                    str2 = this.f7100a.mo7191B();
                } else {
                    mo7827m().mo7094f();
                    str2 = "FA";
                }
                this.f7090e = str2;
            }
            str = this.f7090e;
        }
        return str;
    }

    /* renamed from: a */
    protected static Object m10125a(String str) {
        if (str == null) {
            return null;
        }
        return new C2274d4(str);
    }

    /* renamed from: a */
    private static String m10126a(boolean z, Object obj) {
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        String str2 = "-";
        int i = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = str2;
            }
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (!(obj instanceof Throwable)) {
                return obj instanceof C2274d4 ? ((C2274d4) obj).f6357a : z ? str2 : String.valueOf(obj);
            }
            Throwable th = (Throwable) obj;
            StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
            String b = m10129b(C2263c5.class.getCanonicalName());
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod()) {
                    String className = stackTraceElement.getClassName();
                    if (className != null && m10129b(className).equals(b)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                }
                i++;
            }
            return sb2.toString();
        }
    }

    /* renamed from: a */
    static String m10127a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = m10126a(z, obj);
        String a2 = m10126a(z, obj2);
        String a3 = m10126a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static String m10129b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    /* renamed from: A */
    public final C2238a4 mo7809A() {
        return this.f7098m;
    }

    /* renamed from: B */
    public final C2238a4 mo7810B() {
        return this.f7099n;
    }

    /* renamed from: C */
    public final String mo7811C() {
        Pair<String, Long> a = mo7826l().f6621d.mo7617a();
        if (a == null || a == C2370l4.f6615E) {
            return null;
        }
        String valueOf = String.valueOf(a.second);
        String str = (String) a.first;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str).length());
        sb.append(valueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7812a(int i, String str) {
        Log.println(i, m10121D(), str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo7813a(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        String str2;
        if (!z && mo7814a(i)) {
            mo7812a(i, m10127a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            C2148s.m8834a(str);
            C2528z4 t = this.f7100a.mo7216t();
            if (t == null) {
                str2 = "Scheduler not set. Not logging error/warn";
            } else if (!t.mo7745s()) {
                str2 = "Scheduler not initialized. Not logging error/warn";
            } else {
                if (i < 0) {
                    i = 0;
                }
                C2250b4 b4Var = new C2250b4(this, i >= 9 ? 8 : i, str, obj, obj2, obj3);
                t.mo7841a((Runnable) b4Var);
            }
            mo7812a(6, str2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo7814a(int i) {
        return Log.isLoggable(m10121D(), i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final boolean mo7397r() {
        return false;
    }

    /* renamed from: t */
    public final C2238a4 mo7815t() {
        return this.f7091f;
    }

    /* renamed from: u */
    public final C2238a4 mo7816u() {
        return this.f7092g;
    }

    /* renamed from: v */
    public final C2238a4 mo7817v() {
        return this.f7093h;
    }

    /* renamed from: w */
    public final C2238a4 mo7818w() {
        return this.f7094i;
    }

    /* renamed from: x */
    public final C2238a4 mo7819x() {
        return this.f7095j;
    }

    /* renamed from: y */
    public final C2238a4 mo7820y() {
        return this.f7096k;
    }

    /* renamed from: z */
    public final C2238a4 mo7821z() {
        return this.f7097l;
    }
}
