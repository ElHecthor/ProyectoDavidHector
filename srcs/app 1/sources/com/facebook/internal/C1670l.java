package com.facebook.internal;

import android.net.Uri;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.l */
public final class C1670l {

    /* renamed from: a */
    private boolean f5093a;

    /* renamed from: b */
    private int f5094b;

    /* renamed from: c */
    private EnumSet<C1697u> f5095c;

    /* renamed from: d */
    private boolean f5096d;

    /* renamed from: e */
    private C1654g f5097e;

    /* renamed from: f */
    private boolean f5098f;

    /* renamed from: g */
    private boolean f5099g;

    /* renamed from: h */
    private String f5100h;

    /* renamed from: i */
    private JSONArray f5101i;

    /* renamed from: j */
    private String f5102j;

    /* renamed from: com.facebook.internal.l$a */
    public static class C1671a {

        /* renamed from: a */
        private String f5103a;

        /* renamed from: b */
        private String f5104b;

        private C1671a(String str, String str2, Uri uri, int[] iArr) {
            this.f5103a = str;
            this.f5104b = str2;
        }

        /* renamed from: a */
        public static C1671a m7255a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            Uri uri = null;
            if (C1698v.m7401c(optString)) {
                return null;
            }
            String[] split = optString.split("\\|");
            if (split.length != 2) {
                return null;
            }
            String str = split[0];
            String str2 = split[1];
            if (C1698v.m7401c(str) || C1698v.m7401c(str2)) {
                return null;
            }
            String optString2 = jSONObject.optString("url");
            if (!C1698v.m7401c(optString2)) {
                uri = Uri.parse(optString2);
            }
            return new C1671a(str, str2, uri, m7256a(jSONObject.optJSONArray("versions")));
        }

        /* renamed from: a */
        private static int[] m7256a(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            int length = jSONArray.length();
            int[] iArr = new int[length];
            for (int i = 0; i < length; i++) {
                int i2 = -1;
                int optInt = jSONArray.optInt(i, -1);
                if (optInt == -1) {
                    String optString = jSONArray.optString(i);
                    if (!C1698v.m7401c(optString)) {
                        try {
                            i2 = Integer.parseInt(optString);
                        } catch (NumberFormatException e) {
                            C1698v.m7380a("FacebookSDK", (Exception) e);
                        }
                        iArr[i] = i2;
                    }
                }
                i2 = optInt;
                iArr[i] = i2;
            }
            return iArr;
        }

        /* renamed from: a */
        public String mo5915a() {
            return this.f5103a;
        }

        /* renamed from: b */
        public String mo5916b() {
            return this.f5104b;
        }
    }

    public C1670l(boolean z, String str, boolean z2, int i, EnumSet<C1697u> enumSet, Map<String, Map<String, C1671a>> map, boolean z3, C1654g gVar, String str2, String str3, boolean z4, boolean z5, JSONArray jSONArray, String str4, boolean z6, String str5) {
        this.f5093a = z;
        this.f5097e = gVar;
        this.f5094b = i;
        this.f5096d = z3;
        this.f5095c = enumSet;
        this.f5098f = z4;
        this.f5099g = z5;
        this.f5101i = jSONArray;
        this.f5100h = str4;
        this.f5102j = str5;
    }

    /* renamed from: a */
    public boolean mo5905a() {
        return this.f5096d;
    }

    /* renamed from: b */
    public boolean mo5906b() {
        return this.f5099g;
    }

    /* renamed from: c */
    public C1654g mo5907c() {
        return this.f5097e;
    }

    /* renamed from: d */
    public JSONArray mo5908d() {
        return this.f5101i;
    }

    /* renamed from: e */
    public boolean mo5909e() {
        return this.f5098f;
    }

    /* renamed from: f */
    public String mo5910f() {
        return this.f5102j;
    }

    /* renamed from: g */
    public String mo5911g() {
        return this.f5100h;
    }

    /* renamed from: h */
    public int mo5912h() {
        return this.f5094b;
    }

    /* renamed from: i */
    public EnumSet<C1697u> mo5913i() {
        return this.f5095c;
    }

    /* renamed from: j */
    public boolean mo5914j() {
        return this.f5093a;
    }
}
