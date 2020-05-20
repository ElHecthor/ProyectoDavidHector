package com.google.android.datatransport.cct.p047b;

import android.util.SparseArray;

/* renamed from: com.google.android.datatransport.cct.b.u */
public abstract class C1887u {

    /* renamed from: com.google.android.datatransport.cct.b.u$a */
    public static abstract class C1888a {
        /* renamed from: a */
        public abstract C1888a mo6392a(C1889b bVar);

        /* renamed from: a */
        public abstract C1888a mo6393a(C1890c cVar);

        /* renamed from: a */
        public abstract C1887u mo6394a();
    }

    /* renamed from: com.google.android.datatransport.cct.b.u$b */
    public enum C1889b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: B */
        private static final SparseArray<C1889b> f5560B = null;

        /* renamed from: f */
        private final int f5581f;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new C1889b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new C1889b("GPRS", 1, 1);
            EDGE = new C1889b("EDGE", 2, 2);
            UMTS = new C1889b("UMTS", 3, 3);
            CDMA = new C1889b("CDMA", 4, 4);
            EVDO_0 = new C1889b("EVDO_0", 5, 5);
            EVDO_A = new C1889b("EVDO_A", 6, 6);
            RTT = new C1889b("RTT", 7, 7);
            HSDPA = new C1889b("HSDPA", 8, 8);
            HSUPA = new C1889b("HSUPA", 9, 9);
            HSPA = new C1889b("HSPA", 10, 10);
            IDEN = new C1889b("IDEN", 11, 11);
            EVDO_B = new C1889b("EVDO_B", 12, 12);
            LTE = new C1889b("LTE", 13, 13);
            EHRPD = new C1889b("EHRPD", 14, 14);
            HSPAP = new C1889b("HSPAP", 15, 15);
            GSM = new C1889b("GSM", 16, 16);
            TD_SCDMA = new C1889b("TD_SCDMA", 17, 17);
            IWLAN = new C1889b("IWLAN", 18, 18);
            LTE_CA = new C1889b("LTE_CA", 19, 19);
            COMBINED = new C1889b("COMBINED", 20, 100);
            SparseArray<C1889b> sparseArray = new SparseArray<>();
            f5560B = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            f5560B.put(1, GPRS);
            f5560B.put(2, EDGE);
            f5560B.put(3, UMTS);
            f5560B.put(4, CDMA);
            f5560B.put(5, EVDO_0);
            f5560B.put(6, EVDO_A);
            f5560B.put(7, RTT);
            f5560B.put(8, HSDPA);
            f5560B.put(9, HSUPA);
            f5560B.put(10, HSPA);
            f5560B.put(11, IDEN);
            f5560B.put(12, EVDO_B);
            f5560B.put(13, LTE);
            f5560B.put(14, EHRPD);
            f5560B.put(15, HSPAP);
            f5560B.put(16, GSM);
            f5560B.put(17, TD_SCDMA);
            f5560B.put(18, IWLAN);
            f5560B.put(19, LTE_CA);
        }

        private C1889b(int i) {
            this.f5581f = i;
        }

        /* renamed from: a */
        public static C1889b m8068a(int i) {
            return (C1889b) f5560B.get(i);
        }

        /* renamed from: a */
        public int mo6397a() {
            return this.f5581f;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.u$c */
    public enum C1890c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: z */
        private static final SparseArray<C1890c> f5601z = null;

        /* renamed from: f */
        private final int f5602f;

        static {
            MOBILE = new C1890c("MOBILE", 0, 0);
            WIFI = new C1890c("WIFI", 1, 1);
            MOBILE_MMS = new C1890c("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new C1890c("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new C1890c("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new C1890c("MOBILE_HIPRI", 5, 5);
            WIMAX = new C1890c("WIMAX", 6, 6);
            BLUETOOTH = new C1890c("BLUETOOTH", 7, 7);
            DUMMY = new C1890c("DUMMY", 8, 8);
            ETHERNET = new C1890c("ETHERNET", 9, 9);
            MOBILE_FOTA = new C1890c("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new C1890c("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new C1890c("MOBILE_CBS", 12, 12);
            WIFI_P2P = new C1890c("WIFI_P2P", 13, 13);
            MOBILE_IA = new C1890c("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new C1890c("MOBILE_EMERGENCY", 15, 15);
            PROXY = new C1890c("PROXY", 16, 16);
            VPN = new C1890c("VPN", 17, 17);
            NONE = new C1890c("NONE", 18, -1);
            SparseArray<C1890c> sparseArray = new SparseArray<>();
            f5601z = sparseArray;
            sparseArray.put(0, MOBILE);
            f5601z.put(1, WIFI);
            f5601z.put(2, MOBILE_MMS);
            f5601z.put(3, MOBILE_SUPL);
            f5601z.put(4, MOBILE_DUN);
            f5601z.put(5, MOBILE_HIPRI);
            f5601z.put(6, WIMAX);
            f5601z.put(7, BLUETOOTH);
            f5601z.put(8, DUMMY);
            f5601z.put(9, ETHERNET);
            f5601z.put(10, MOBILE_FOTA);
            f5601z.put(11, MOBILE_IMS);
            f5601z.put(12, MOBILE_CBS);
            f5601z.put(13, WIFI_P2P);
            f5601z.put(14, MOBILE_IA);
            f5601z.put(15, MOBILE_EMERGENCY);
            f5601z.put(16, PROXY);
            f5601z.put(17, VPN);
            f5601z.put(-1, NONE);
        }

        private C1890c(int i) {
            this.f5602f = i;
        }

        /* renamed from: a */
        public static C1890c m8070a(int i) {
            return (C1890c) f5601z.get(i);
        }

        /* renamed from: a */
        public int mo6398a() {
            return this.f5602f;
        }
    }

    /* renamed from: a */
    public static C1888a m8064a() {
        return new C1872b();
    }
}
