package com.facebook.internal;

import com.facebook.C1730l.C1732b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.g */
public final class C1654g {

    /* renamed from: g */
    private static C1654g f5056g;

    /* renamed from: a */
    private final Map<Integer, Set<Integer>> f5057a;

    /* renamed from: b */
    private final Map<Integer, Set<Integer>> f5058b;

    /* renamed from: c */
    private final Map<Integer, Set<Integer>> f5059c;

    /* renamed from: d */
    private final String f5060d;

    /* renamed from: e */
    private final String f5061e;

    /* renamed from: f */
    private final String f5062f;

    /* renamed from: com.facebook.internal.g$a */
    static class C1655a extends HashMap<Integer, Set<Integer>> {
        C1655a() {
            put(Integer.valueOf(2), null);
            put(Integer.valueOf(4), null);
            put(Integer.valueOf(9), null);
            put(Integer.valueOf(17), null);
            put(Integer.valueOf(341), null);
        }
    }

    /* renamed from: com.facebook.internal.g$b */
    static class C1656b extends HashMap<Integer, Set<Integer>> {
        C1656b() {
            put(Integer.valueOf(102), null);
            put(Integer.valueOf(190), null);
            put(Integer.valueOf(412), null);
        }
    }

    /* renamed from: com.facebook.internal.g$c */
    static /* synthetic */ class C1657c {

        /* renamed from: a */
        static final /* synthetic */ int[] f5063a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.l$b[] r0 = com.facebook.C1730l.C1732b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5063a = r0
                com.facebook.l$b r1 = com.facebook.C1730l.C1732b.OTHER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5063a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.l$b r1 = com.facebook.C1730l.C1732b.LOGIN_RECOVERABLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5063a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.l$b r1 = com.facebook.C1730l.C1732b.TRANSIENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1654g.C1657c.<clinit>():void");
        }
    }

    C1654g(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f5057a = map;
        this.f5058b = map2;
        this.f5059c = map3;
        this.f5060d = str;
        this.f5061e = str2;
        this.f5062f = str3;
    }

    /* renamed from: a */
    public static synchronized C1654g m7212a() {
        C1654g gVar;
        synchronized (C1654g.class) {
            if (f5056g == null) {
                f5056g = m7215b();
            }
            gVar = f5056g;
        }
        return gVar;
    }

    /* renamed from: a */
    public static C1654g m7213a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    String str4 = "recovery_message";
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString(str4, null);
                        map = m7214a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString(str4, null);
                        map2 = m7214a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString(str4, null);
                        map3 = m7214a(optJSONObject);
                    }
                }
            }
        }
        C1654g gVar = new C1654g(map, map2, map3, str, str2, str3);
        return gVar;
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m7214a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    private static C1654g m7215b() {
        C1654g gVar = new C1654g(null, new C1655a(), new C1656b(), null, null, null);
        return gVar;
    }

    /* renamed from: a */
    public C1732b mo5895a(int i, int i2, boolean z) {
        if (z) {
            return C1732b.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.f5057a;
        if (map != null && map.containsKey(Integer.valueOf(i))) {
            Set set = (Set) this.f5057a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return C1732b.OTHER;
            }
        }
        Map<Integer, Set<Integer>> map2 = this.f5059c;
        if (map2 != null && map2.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.f5059c.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2))) {
                return C1732b.LOGIN_RECOVERABLE;
            }
        }
        Map<Integer, Set<Integer>> map3 = this.f5058b;
        if (map3 != null && map3.containsKey(Integer.valueOf(i))) {
            Set set3 = (Set) this.f5058b.get(Integer.valueOf(i));
            if (set3 == null || set3.contains(Integer.valueOf(i2))) {
                return C1732b.TRANSIENT;
            }
        }
        return C1732b.OTHER;
    }

    /* renamed from: a */
    public String mo5896a(C1732b bVar) {
        int i = C1657c.f5063a[bVar.ordinal()];
        if (i == 1) {
            return this.f5060d;
        }
        if (i == 2) {
            return this.f5062f;
        }
        if (i != 3) {
            return null;
        }
        return this.f5061e;
    }
}
