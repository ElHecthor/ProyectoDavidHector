package com.facebook.internal;

import com.facebook.C1787m;
import com.facebook.internal.C1666k.C1669c;

/* renamed from: com.facebook.internal.j */
public final class C1661j {

    /* renamed from: com.facebook.internal.j$a */
    static class C1662a implements C1669c {

        /* renamed from: a */
        final /* synthetic */ C1664c f5068a;

        /* renamed from: b */
        final /* synthetic */ C1665d f5069b;

        C1662a(C1664c cVar, C1665d dVar) {
            this.f5068a = cVar;
            this.f5069b = dVar;
        }

        /* renamed from: a */
        public void mo5900a() {
            this.f5068a.mo5768a(C1661j.m7226c(this.f5069b));
        }
    }

    /* renamed from: com.facebook.internal.j$b */
    static /* synthetic */ class C1663b {

        /* renamed from: a */
        static final /* synthetic */ int[] f5070a;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|(3:21|22|24)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|24) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.facebook.internal.j$d[] r0 = com.facebook.internal.C1661j.C1665d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5070a = r0
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.RestrictiveDataFiltering     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.Instrument     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.CrashReport     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.ErrorReport     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.AAM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.Core     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.AppEvents     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.CodelessEvents     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.Login     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.Share     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f5070a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.facebook.internal.j$d r1 = com.facebook.internal.C1661j.C1665d.Places     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1661j.C1663b.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.internal.j$c */
    public interface C1664c {
        /* renamed from: a */
        void mo5768a(boolean z);
    }

    /* renamed from: com.facebook.internal.j$d */
    public enum C1665d {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        Instrument(131072),
        CrashReport(131328),
        ErrorReport(131584),
        Login(16777216),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: f */
        private final int f5084f;

        private C1665d(int i) {
            this.f5084f = i;
        }

        /* renamed from: a */
        static C1665d m7229a(int i) {
            C1665d[] values;
            for (C1665d dVar : values()) {
                if (dVar.f5084f == i) {
                    return dVar;
                }
            }
            return Unknown;
        }

        /* renamed from: f */
        public C1665d mo5901f() {
            int i;
            int i2;
            int i3 = this.f5084f;
            if ((i3 & 255) > 0) {
                i = i3 & -256;
            } else {
                if ((65280 & i3) > 0) {
                    i2 = -65536;
                } else if ((16711680 & i3) > 0) {
                    i2 = -16777216;
                } else {
                    i = 0;
                }
                i = i3 & i2;
            }
            return m7229a(i);
        }

        public String toString() {
            switch (C1663b.f5070a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "ErrorReport";
                case 5:
                    return "AAM";
                case 6:
                    return "CoreKit";
                case 7:
                    return "AppEvents";
                case 8:
                    return "CodelessEvents";
                case 9:
                    return "LoginKit";
                case 10:
                    return "ShareKit";
                case 11:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }
    }

    /* renamed from: a */
    public static void m7223a(C1665d dVar, C1664c cVar) {
        C1666k.m7236a((C1669c) new C1662a(cVar, dVar));
    }

    /* renamed from: a */
    private static boolean m7224a(C1665d dVar) {
        int i = C1663b.f5070a[dVar.ordinal()];
        return (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? false : true;
    }

    /* renamed from: b */
    private static boolean m7225b(C1665d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("FBSDKFeature");
        sb.append(dVar.toString());
        return C1666k.m7237a(sb.toString(), C1787m.m7745f(), m7224a(dVar));
    }

    /* renamed from: c */
    public static boolean m7226c(C1665d dVar) {
        boolean z = false;
        if (C1665d.Unknown == dVar) {
            return false;
        }
        if (C1665d.Core == dVar) {
            return true;
        }
        C1665d f = dVar.mo5901f();
        if (f == dVar) {
            return m7225b(dVar);
        }
        if (m7226c(f) && m7225b(dVar)) {
            z = true;
        }
        return z;
    }
}
