package com.facebook.p034f0.p038s;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.IBinder;
import com.facebook.C1787m;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.f0.s.g */
class C1621g {

    /* renamed from: a */
    private static final HashMap<String, Method> f4997a = new HashMap<>();

    /* renamed from: b */
    private static final HashMap<String, Class<?>> f4998b = new HashMap<>();

    /* renamed from: c */
    private static final String f4999c = C1787m.m7744e().getPackageName();

    /* renamed from: d */
    private static final SharedPreferences f5000d = C1787m.m7744e().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);

    /* renamed from: e */
    private static final SharedPreferences f5001e = C1787m.m7744e().getSharedPreferences("com.facebook.internal.PURCHASE", 0);

    /* renamed from: a */
    private static Class<?> m7112a(Context context, String str) {
        Class<?> cls = (Class) f4998b.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            cls = context.getClassLoader().loadClass(str);
            f4998b.put(str, cls);
        } catch (ClassNotFoundException unused) {
        }
        return cls;
    }

    /* renamed from: a */
    static Object m7113a(Context context, IBinder iBinder) {
        return m7114a(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{iBinder});
    }

    /* renamed from: a */
    private static Object m7114a(Context context, String str, String str2, Object obj, Object[] objArr) {
        Class a = m7112a(context, str);
        if (a == null) {
            return null;
        }
        Method a2 = m7115a(a, str2);
        if (a2 == null) {
            return null;
        }
        if (obj != null) {
            obj = a.cast(obj);
        }
        try {
            return a2.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static Method m7115a(Class<?> cls, String str) {
        Class<String> cls2 = String.class;
        Method method = (Method) f4997a.get(str);
        if (method != null) {
            return method;
        }
        Class[] clsArr = null;
        char c = 65535;
        try {
            switch (str.hashCode()) {
                case -1801122596:
                    if (str.equals("getPurchases")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1450694211:
                    if (str.equals("isBillingSupported")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1123215065:
                    if (str.equals("asInterface")) {
                        c = 0;
                        break;
                    }
                    break;
                case -594356707:
                    if (str.equals("getPurchaseHistory")) {
                        c = 4;
                        break;
                    }
                    break;
                case -573310373:
                    if (str.equals("getSkuDetails")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                clsArr = new Class[]{IBinder.class};
            } else if (c == 1) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, Bundle.class};
            } else if (c == 2) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2};
            } else if (c == 3) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, cls2};
            } else if (c == 4) {
                clsArr = new Class[]{Integer.TYPE, cls2, cls2, cls2, Bundle.class};
            }
            method = cls.getDeclaredMethod(str, clsArr);
            f4997a.put(str, method);
        } catch (NoSuchMethodException unused) {
        }
        return method;
    }

    /* renamed from: a */
    static ArrayList<String> m7116a(Context context, Object obj) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (obj == null) {
            return arrayList;
        }
        Class a = m7112a(context, "com.android.vending.billing.IInAppBillingService");
        return (a == null || m7115a(a, "getPurchaseHistory") == null) ? arrayList : m7118a(m7117a(context, obj, "inapp"));
    }

    /* renamed from: a */
    private static ArrayList<String> m7117a(Context context, Object obj, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (m7127c(context, obj, str).booleanValue()) {
            Object obj2 = null;
            int i = 0;
            boolean z = false;
            do {
                Context context2 = context;
                Object a = m7114a(context2, "com.android.vending.billing.IInAppBillingService", "getPurchaseHistory", obj, new Object[]{Integer.valueOf(6), f4999c, str, obj2, new Bundle()});
                if (a != null) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    Bundle bundle = (Bundle) a;
                    if (bundle.getInt("RESPONSE_CODE") == 0) {
                        ArrayList stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        if (stringArrayList != null) {
                            Iterator it = stringArrayList.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                String str2 = (String) it.next();
                                try {
                                    if (currentTimeMillis - (new JSONObject(str2).getLong("purchaseTime") / 1000) > 1200) {
                                        z = true;
                                        break;
                                    }
                                    arrayList.add(str2);
                                    i++;
                                } catch (JSONException unused) {
                                }
                            }
                            obj2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
                            if (i >= 30 || obj2 == null) {
                                break;
                            }
                        }
                    }
                }
                obj2 = null;
            } while (!z);
        }
        return arrayList;
    }

    /* renamed from: a */
    private static ArrayList<String> m7118a(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        Editor edit = f5001e.edit();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("productId");
                long j = jSONObject.getLong("purchaseTime");
                String string2 = jSONObject.getString("purchaseToken");
                if (currentTimeMillis - (j / 1000) <= 86400) {
                    if (!f5001e.getString(string, "").equals(string2)) {
                        edit.putString(string, string2);
                        arrayList2.add(str);
                    }
                }
            } catch (JSONException unused) {
            }
        }
        edit.apply();
        return arrayList2;
    }

    /* renamed from: a */
    static Map<String, String> m7119a(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        Map<String, String> b = m7126b(arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!b.containsKey(str)) {
                arrayList2.add(str);
            }
        }
        b.putAll(m7125b(context, arrayList2, obj, z));
        return b;
    }

    /* renamed from: a */
    static void m7120a() {
        Editor clear;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String str = "LAST_CLEARED_TIME";
        long j = f5000d.getLong(str, 0);
        if (j == 0) {
            clear = f5000d.edit();
        } else if (currentTimeMillis - j > 604800) {
            clear = f5000d.edit().clear();
        } else {
            return;
        }
        clear.putLong(str, currentTimeMillis).apply();
    }

    /* renamed from: a */
    private static void m7121a(Map<String, String> map) {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Editor edit = f5000d.edit();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis);
            sb.append(";");
            sb.append((String) entry.getValue());
            edit.putString(str, sb.toString());
        }
        edit.apply();
    }

    /* renamed from: a */
    static boolean m7122a(String str) {
        try {
            String optString = new JSONObject(str).optString("freeTrialPeriod");
            return optString != null && !optString.isEmpty();
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: b */
    static ArrayList<String> m7123b(Context context, Object obj) {
        return m7118a(m7124b(context, obj, "inapp"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c A[EDGE_INSN: B:19:0x005c->B:17:0x005c ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList<java.lang.String> m7124b(android.content.Context r9, java.lang.Object r10, java.lang.String r11) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r10 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.lang.Boolean r1 = m7127c(r9, r10, r11)
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x005c
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = 0
        L_0x0016:
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5[r1] = r7
            r7 = 1
            java.lang.String r8 = f4999c
            r5[r7] = r8
            r7 = 2
            r5[r7] = r11
            r5[r6] = r3
            java.lang.String r3 = "com.android.vending.billing.IInAppBillingService"
            java.lang.String r6 = "getPurchases"
            java.lang.Object r3 = m7114a(r9, r3, r6, r10, r5)
            if (r3 == 0) goto L_0x0055
            android.os.Bundle r3 = (android.os.Bundle) r3
            java.lang.String r5 = "RESPONSE_CODE"
            int r5 = r3.getInt(r5)
            if (r5 != 0) goto L_0x0055
            java.lang.String r5 = "INAPP_PURCHASE_DATA_LIST"
            java.util.ArrayList r5 = r3.getStringArrayList(r5)
            if (r5 == 0) goto L_0x005c
            int r6 = r5.size()
            int r4 = r4 + r6
            r0.addAll(r5)
            java.lang.String r5 = "INAPP_CONTINUATION_TOKEN"
            java.lang.String r3 = r3.getString(r5)
            goto L_0x0056
        L_0x0055:
            r3 = r2
        L_0x0056:
            r5 = 30
            if (r4 >= r5) goto L_0x005c
            if (r3 != 0) goto L_0x0016
        L_0x005c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.p038s.C1621g.m7124b(android.content.Context, java.lang.Object, java.lang.String):java.util.ArrayList");
    }

    /* renamed from: b */
    private static Map<String, String> m7125b(Context context, ArrayList<String> arrayList, Object obj, boolean z) {
        HashMap hashMap = new HashMap();
        if (obj != null && !arrayList.isEmpty()) {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList);
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(3);
            objArr[1] = f4999c;
            objArr[2] = z ? "subs" : "inapp";
            objArr[3] = bundle;
            Object a = m7114a(context, "com.android.vending.billing.IInAppBillingService", "getSkuDetails", obj, objArr);
            if (a != null) {
                Bundle bundle2 = (Bundle) a;
                if (bundle2.getInt("RESPONSE_CODE") == 0) {
                    ArrayList stringArrayList = bundle2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList != null && arrayList.size() == stringArrayList.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            hashMap.put(arrayList.get(i), stringArrayList.get(i));
                        }
                    }
                    m7121a((Map<String, String>) hashMap);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static Map<String, String> m7126b(ArrayList<String> arrayList) {
        HashMap hashMap = new HashMap();
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            String string = f5000d.getString(str, null);
            if (string != null) {
                String[] split = string.split(";", 2);
                if (currentTimeMillis - Long.parseLong(split[0]) < 43200) {
                    hashMap.put(str, split[1]);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: c */
    private static Boolean m7127c(Context context, Object obj, String str) {
        boolean z = false;
        if (obj == null) {
            return Boolean.valueOf(false);
        }
        Object a = m7114a(context, "com.android.vending.billing.IInAppBillingService", "isBillingSupported", obj, new Object[]{Integer.valueOf(3), f4999c, str});
        if (a != null && ((Integer) a).intValue() == 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    static ArrayList<String> m7128c(Context context, Object obj) {
        return m7118a(m7124b(context, obj, "subs"));
    }
}
