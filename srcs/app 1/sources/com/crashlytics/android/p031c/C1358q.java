package com.crashlytics.android.p031c;

import android.os.Bundle;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import p242i.p243a.p244a.p245a.C4781c;

/* renamed from: com.crashlytics.android.c.q */
public class C1358q {

    /* renamed from: a */
    private static final Set<String> f4416a = new HashSet(Arrays.asList(new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "screen_view", "firebase_extra_parameter"}));

    /* renamed from: a */
    private Double m6296a(Object obj) {
        String valueOf = String.valueOf(obj);
        if (valueOf == null) {
            return null;
        }
        return Double.valueOf(valueOf);
    }

    /* renamed from: a */
    private String m6297a(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_parameter";
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb = new StringBuilder();
            sb.append("fabric_");
            sb.append(replaceAll);
            replaceAll = sb.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005c, code lost:
        if (r11.equals(r1) != false) goto L_0x00ca;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0046  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m6298a(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "purchase"
            java.lang.String r2 = "signUp"
            r3 = -1
            r4 = 2
            r5 = 1
            java.lang.String r6 = "login"
            if (r12 == 0) goto L_0x0049
            int r12 = r11.hashCode()
            r7 = -902468296(0xffffffffca356d38, float:-2972494.0)
            if (r12 == r7) goto L_0x0030
            r7 = 103149417(0x625ef69, float:3.1208942E-35)
            if (r12 == r7) goto L_0x0028
            r7 = 1743324417(0x67e90501, float:2.2008074E24)
            if (r12 == r7) goto L_0x0020
            goto L_0x0038
        L_0x0020:
            boolean r12 = r11.equals(r1)
            if (r12 == 0) goto L_0x0038
            r12 = 0
            goto L_0x0039
        L_0x0028:
            boolean r12 = r11.equals(r6)
            if (r12 == 0) goto L_0x0038
            r12 = 2
            goto L_0x0039
        L_0x0030:
            boolean r12 = r11.equals(r2)
            if (r12 == 0) goto L_0x0038
            r12 = 1
            goto L_0x0039
        L_0x0038:
            r12 = -1
        L_0x0039:
            if (r12 == 0) goto L_0x0046
            if (r12 == r5) goto L_0x0043
            if (r12 == r4) goto L_0x0040
            goto L_0x0049
        L_0x0040:
            java.lang.String r11 = "failed_login"
            return r11
        L_0x0043:
            java.lang.String r11 = "failed_sign_up"
            return r11
        L_0x0046:
            java.lang.String r11 = "failed_ecommerce_purchase"
            return r11
        L_0x0049:
            int r12 = r11.hashCode()
            java.lang.String r7 = "share"
            java.lang.String r8 = "search"
            java.lang.String r9 = "invite"
            switch(r12) {
                case -2131650889: goto L_0x00be;
                case -1183699191: goto L_0x00b5;
                case -938102371: goto L_0x00ab;
                case -906336856: goto L_0x00a3;
                case -902468296: goto L_0x009b;
                case -389087554: goto L_0x0091;
                case 23457852: goto L_0x0087;
                case 103149417: goto L_0x007e;
                case 109400031: goto L_0x0076;
                case 196004670: goto L_0x006b;
                case 1664021448: goto L_0x0060;
                case 1743324417: goto L_0x0058;
                default: goto L_0x0056;
            }
        L_0x0056:
            goto L_0x00c9
        L_0x0058:
            boolean r12 = r11.equals(r1)
            if (r12 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x0060:
            java.lang.String r12 = "startCheckout"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 2
            goto L_0x00ca
        L_0x006b:
            java.lang.String r12 = "levelStart"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 10
            goto L_0x00ca
        L_0x0076:
            boolean r12 = r11.equals(r7)
            if (r12 == 0) goto L_0x00c9
            r0 = 5
            goto L_0x00ca
        L_0x007e:
            boolean r12 = r11.equals(r6)
            if (r12 == 0) goto L_0x00c9
            r0 = 8
            goto L_0x00ca
        L_0x0087:
            java.lang.String r12 = "addToCart"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 1
            goto L_0x00ca
        L_0x0091:
            java.lang.String r12 = "contentView"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 3
            goto L_0x00ca
        L_0x009b:
            boolean r12 = r11.equals(r2)
            if (r12 == 0) goto L_0x00c9
            r0 = 7
            goto L_0x00ca
        L_0x00a3:
            boolean r12 = r11.equals(r8)
            if (r12 == 0) goto L_0x00c9
            r0 = 4
            goto L_0x00ca
        L_0x00ab:
            java.lang.String r12 = "rating"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 6
            goto L_0x00ca
        L_0x00b5:
            boolean r12 = r11.equals(r9)
            if (r12 == 0) goto L_0x00c9
            r0 = 9
            goto L_0x00ca
        L_0x00be:
            java.lang.String r12 = "levelEnd"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x00c9
            r0 = 11
            goto L_0x00ca
        L_0x00c9:
            r0 = -1
        L_0x00ca:
            switch(r0) {
                case 0: goto L_0x00eb;
                case 1: goto L_0x00e8;
                case 2: goto L_0x00e5;
                case 3: goto L_0x00e2;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00e0;
                case 6: goto L_0x00dd;
                case 7: goto L_0x00da;
                case 8: goto L_0x00d9;
                case 9: goto L_0x00d8;
                case 10: goto L_0x00d5;
                case 11: goto L_0x00d2;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.String r11 = r10.m6307c(r11)
            return r11
        L_0x00d2:
            java.lang.String r11 = "level_end"
            return r11
        L_0x00d5:
            java.lang.String r11 = "level_start"
            return r11
        L_0x00d8:
            return r9
        L_0x00d9:
            return r6
        L_0x00da:
            java.lang.String r11 = "sign_up"
            return r11
        L_0x00dd:
            java.lang.String r11 = "rate_content"
            return r11
        L_0x00e0:
            return r7
        L_0x00e1:
            return r8
        L_0x00e2:
            java.lang.String r11 = "select_content"
            return r11
        L_0x00e5:
            java.lang.String r11 = "begin_checkout"
            return r11
        L_0x00e8:
            java.lang.String r11 = "add_to_cart"
            return r11
        L_0x00eb:
            java.lang.String r11 = "ecommerce_purchase"
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.p031c.C1358q.m6298a(java.lang.String, boolean):java.lang.String");
    }

    /* renamed from: a */
    private void m6299a(Bundle bundle, String str, Double d) {
        Double a = m6296a((Object) d);
        if (a != null) {
            bundle.putDouble(str, a.doubleValue());
        }
    }

    /* renamed from: a */
    private void m6300a(Bundle bundle, String str, Integer num) {
        if (num != null) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* renamed from: a */
    private void m6301a(Bundle bundle, String str, Long l) {
        if (l != null) {
            bundle.putLong(str, l.longValue());
        }
    }

    /* renamed from: a */
    private void m6302a(Bundle bundle, String str, String str2) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    private void m6303a(Bundle bundle, Map<String, Object> map) {
        for (Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String a = m6297a((String) entry.getKey());
            if (value instanceof String) {
                bundle.putString(a, entry.getValue().toString());
            } else if (value instanceof Double) {
                bundle.putDouble(a, ((Double) entry.getValue()).doubleValue());
            } else if (value instanceof Long) {
                bundle.putLong(a, ((Long) entry.getValue()).longValue());
            } else if (value instanceof Integer) {
                bundle.putInt(a, ((Integer) entry.getValue()).intValue());
            }
        }
    }

    /* renamed from: b */
    private Bundle m6304b(C1328a0 a0Var) {
        Object obj;
        Bundle bundle = new Bundle();
        String str = "itemType";
        String str2 = "item_category";
        String str3 = "itemName";
        String str4 = "itemId";
        String str5 = "itemPrice";
        String str6 = "value";
        String str7 = "item_name";
        String str8 = "item_id";
        String str9 = "currency";
        if ("purchase".equals(a0Var.f4327g)) {
            m6302a(bundle, str8, (String) a0Var.f4328h.get(str4));
            m6302a(bundle, str7, (String) a0Var.f4328h.get(str3));
            m6302a(bundle, str2, (String) a0Var.f4328h.get(str));
            obj = a0Var.f4328h.get(str5);
        } else {
            String str10 = "quantity";
            if ("addToCart".equals(a0Var.f4327g)) {
                m6302a(bundle, str8, (String) a0Var.f4328h.get(str4));
                m6302a(bundle, str7, (String) a0Var.f4328h.get(str3));
                m6302a(bundle, str2, (String) a0Var.f4328h.get(str));
                m6299a(bundle, "price", m6305b(a0Var.f4328h.get(str5)));
                m6299a(bundle, str6, m6305b(a0Var.f4328h.get(str5)));
                m6302a(bundle, str9, (String) a0Var.f4328h.get(str9));
                bundle.putLong(str10, 1);
            } else {
                if ("startCheckout".equals(a0Var.f4327g)) {
                    m6301a(bundle, str10, Long.valueOf((long) ((Integer) a0Var.f4328h.get("itemCount")).intValue()));
                    obj = a0Var.f4328h.get("totalPrice");
                } else {
                    String str11 = "contentName";
                    String str12 = "contentId";
                    String str13 = "contentType";
                    String str14 = "content_type";
                    if (!"contentView".equals(a0Var.f4327g)) {
                        if ("search".equals(a0Var.f4327g)) {
                            m6302a(bundle, "search_term", (String) a0Var.f4328h.get("query"));
                        } else {
                            String str15 = "method";
                            if ("share".equals(a0Var.f4327g)) {
                                m6302a(bundle, str15, (String) a0Var.f4328h.get(str15));
                            } else {
                                String str16 = "rating";
                                if (str16.equals(a0Var.f4327g)) {
                                    m6302a(bundle, str16, String.valueOf(a0Var.f4328h.get(str16)));
                                } else {
                                    if (!"signUp".equals(a0Var.f4327g)) {
                                        if (!"login".equals(a0Var.f4327g)) {
                                            if (!"invite".equals(a0Var.f4327g)) {
                                                String str17 = "levelName";
                                                String str18 = "level_name";
                                                if ("levelStart".equals(a0Var.f4327g)) {
                                                    m6302a(bundle, str18, (String) a0Var.f4328h.get(str17));
                                                } else {
                                                    if ("levelEnd".equals(a0Var.f4327g)) {
                                                        String str19 = "score";
                                                        m6299a(bundle, str19, m6296a(a0Var.f4328h.get(str19)));
                                                        m6302a(bundle, str18, (String) a0Var.f4328h.get(str17));
                                                        String str20 = "success";
                                                        m6300a(bundle, str20, m6306b((String) a0Var.f4328h.get(str20)));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    m6302a(bundle, str15, (String) a0Var.f4328h.get(str15));
                                }
                            }
                        }
                    }
                    m6302a(bundle, str14, (String) a0Var.f4328h.get(str13));
                    m6302a(bundle, str8, (String) a0Var.f4328h.get(str12));
                    m6302a(bundle, str7, (String) a0Var.f4328h.get(str11));
                }
            }
            m6303a(bundle, a0Var.f4326f);
            return bundle;
        }
        m6299a(bundle, str6, m6305b(obj));
        m6302a(bundle, str9, (String) a0Var.f4328h.get(str9));
        m6303a(bundle, a0Var.f4326f);
        return bundle;
    }

    /* renamed from: b */
    private Double m6305b(Object obj) {
        Long l = (Long) obj;
        if (l == null) {
            return null;
        }
        return Double.valueOf(new BigDecimal(l.longValue()).divide(C1327a.f4320a).doubleValue());
    }

    /* renamed from: b */
    private Integer m6306b(String str) {
        if (str == null) {
            return null;
        }
        return Integer.valueOf(str.equals("true") ? 1 : 0);
    }

    /* renamed from: c */
    private String m6307c(String str) {
        if (str == null || str.length() == 0) {
            return "fabric_unnamed_event";
        }
        String str2 = "fabric_";
        if (f4416a.contains(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            return sb.toString();
        }
        String replaceAll = str.replaceAll("[^\\p{Alnum}_]+", "_");
        if (replaceAll.startsWith("ga_") || replaceAll.startsWith("google_") || replaceAll.startsWith("firebase_") || !Character.isLetter(replaceAll.charAt(0))) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(replaceAll);
            replaceAll = sb2.toString();
        }
        if (replaceAll.length() > 40) {
            replaceAll = replaceAll.substring(0, 40);
        }
        return replaceAll;
    }

    /* renamed from: a */
    public C1357p mo5463a(C1328a0 a0Var) {
        Bundle bundle;
        String str;
        boolean z = true;
        boolean z2 = C1331c.CUSTOM.equals(a0Var.f4323c) && a0Var.f4325e != null;
        boolean z3 = C1331c.PREDEFINED.equals(a0Var.f4323c) && a0Var.f4327g != null;
        if (!z2 && !z3) {
            return null;
        }
        if (z3) {
            bundle = m6304b(a0Var);
        } else {
            bundle = new Bundle();
            Map<String, Object> map = a0Var.f4326f;
            if (map != null) {
                m6303a(bundle, map);
            }
        }
        if (z3) {
            String str2 = (String) a0Var.f4328h.get("success");
            if (str2 == null || Boolean.parseBoolean(str2)) {
                z = false;
            }
            str = m6298a(a0Var.f4327g, z);
        } else {
            str = m6307c(a0Var.f4325e);
        }
        C4781c.m19229f().mo13796e("Answers", "Logging event into firebase...");
        return new C1357p(str, bundle);
    }
}
