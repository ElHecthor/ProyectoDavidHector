package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.internal.C1682p;
import com.facebook.internal.C1698v;
import com.facebook.internal.C1703w;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.v */
final class C1844v {

    /* renamed from: c */
    private static final String f5465c = "v";

    /* renamed from: a */
    private String f5466a;

    /* renamed from: b */
    private SharedPreferences f5467b;

    public C1844v(Context context) {
        this(context, null);
    }

    public C1844v(Context context, String str) {
        C1703w.m7423a((Object) context, "context");
        if (C1698v.m7401c(str)) {
            str = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY";
        }
        this.f5466a = str;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        this.f5467b = context.getSharedPreferences(this.f5466a, 0);
    }

    /* renamed from: a */
    public static String m7927a(Bundle bundle) {
        C1703w.m7423a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
    }

    /* renamed from: a */
    static Date m7928a(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        long j = bundle.getLong(str, Long.MIN_VALUE);
        if (j == Long.MIN_VALUE) {
            return null;
        }
        return new Date(j);
    }

    /* renamed from: a */
    private void m7929a(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject(this.f5467b.getString(str, "{}"));
        String string = jSONObject.getString("valueType");
        String str2 = "value";
        if (string.equals("bool")) {
            bundle.putBoolean(str, jSONObject.getBoolean(str2));
            return;
        }
        int i = 0;
        if (string.equals("bool[]")) {
            JSONArray jSONArray = jSONObject.getJSONArray(str2);
            int length = jSONArray.length();
            boolean[] zArr = new boolean[length];
            while (i < length) {
                zArr[i] = jSONArray.getBoolean(i);
                i++;
            }
            bundle.putBooleanArray(str, zArr);
        } else if (string.equals("byte")) {
            bundle.putByte(str, (byte) jSONObject.getInt(str2));
        } else if (string.equals("byte[]")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray(str2);
            int length2 = jSONArray2.length();
            byte[] bArr = new byte[length2];
            while (i < length2) {
                bArr[i] = (byte) jSONArray2.getInt(i);
                i++;
            }
            bundle.putByteArray(str, bArr);
        } else if (string.equals("short")) {
            bundle.putShort(str, (short) jSONObject.getInt(str2));
        } else if (string.equals("short[]")) {
            JSONArray jSONArray3 = jSONObject.getJSONArray(str2);
            int length3 = jSONArray3.length();
            short[] sArr = new short[length3];
            while (i < length3) {
                sArr[i] = (short) jSONArray3.getInt(i);
                i++;
            }
            bundle.putShortArray(str, sArr);
        } else if (string.equals("int")) {
            bundle.putInt(str, jSONObject.getInt(str2));
        } else if (string.equals("int[]")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray(str2);
            int length4 = jSONArray4.length();
            int[] iArr = new int[length4];
            while (i < length4) {
                iArr[i] = jSONArray4.getInt(i);
                i++;
            }
            bundle.putIntArray(str, iArr);
        } else if (string.equals("long")) {
            bundle.putLong(str, jSONObject.getLong(str2));
        } else if (string.equals("long[]")) {
            JSONArray jSONArray5 = jSONObject.getJSONArray(str2);
            int length5 = jSONArray5.length();
            long[] jArr = new long[length5];
            while (i < length5) {
                jArr[i] = jSONArray5.getLong(i);
                i++;
            }
            bundle.putLongArray(str, jArr);
        } else if (string.equals("float")) {
            bundle.putFloat(str, (float) jSONObject.getDouble(str2));
        } else if (string.equals("float[]")) {
            JSONArray jSONArray6 = jSONObject.getJSONArray(str2);
            int length6 = jSONArray6.length();
            float[] fArr = new float[length6];
            while (i < length6) {
                fArr[i] = (float) jSONArray6.getDouble(i);
                i++;
            }
            bundle.putFloatArray(str, fArr);
        } else if (string.equals("double")) {
            bundle.putDouble(str, jSONObject.getDouble(str2));
        } else if (string.equals("double[]")) {
            JSONArray jSONArray7 = jSONObject.getJSONArray(str2);
            int length7 = jSONArray7.length();
            double[] dArr = new double[length7];
            while (i < length7) {
                dArr[i] = jSONArray7.getDouble(i);
                i++;
            }
            bundle.putDoubleArray(str, dArr);
        } else if (string.equals("char")) {
            String string2 = jSONObject.getString(str2);
            if (string2 != null && string2.length() == 1) {
                bundle.putChar(str, string2.charAt(0));
            }
        } else if (string.equals("char[]")) {
            JSONArray jSONArray8 = jSONObject.getJSONArray(str2);
            int length8 = jSONArray8.length();
            char[] cArr = new char[length8];
            for (int i2 = 0; i2 < length8; i2++) {
                String string3 = jSONArray8.getString(i2);
                if (string3 != null && string3.length() == 1) {
                    cArr[i2] = string3.charAt(0);
                }
            }
            bundle.putCharArray(str, cArr);
        } else if (string.equals("string")) {
            bundle.putString(str, jSONObject.getString(str2));
        } else if (string.equals("stringList")) {
            JSONArray jSONArray9 = jSONObject.getJSONArray(str2);
            int length9 = jSONArray9.length();
            ArrayList arrayList = new ArrayList(length9);
            while (i < length9) {
                Object obj = jSONArray9.get(i);
                arrayList.add(i, obj == JSONObject.NULL ? null : (String) obj);
                i++;
            }
            bundle.putStringArrayList(str, arrayList);
        } else if (string.equals("enum")) {
            try {
                bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString(str2)));
            } catch (ClassNotFoundException | IllegalArgumentException unused) {
            }
        }
    }

    /* renamed from: b */
    public static C1519d m7930b(Bundle bundle) {
        C1703w.m7423a((Object) bundle, "bundle");
        String str = "com.facebook.TokenCachingStrategy.AccessTokenSource";
        if (bundle.containsKey(str)) {
            return (C1519d) bundle.getSerializable(str);
        }
        return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? C1519d.FACEBOOK_APPLICATION_WEB : C1519d.WEB_VIEW;
    }

    /* renamed from: c */
    public static String m7931c(Bundle bundle) {
        C1703w.m7423a((Object) bundle, "bundle");
        return bundle.getString("com.facebook.TokenCachingStrategy.Token");
    }

    /* renamed from: d */
    public static boolean m7932d(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        String string = bundle.getString("com.facebook.TokenCachingStrategy.Token");
        return (string == null || string.length() == 0 || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) ? false : true;
    }

    /* renamed from: a */
    public void mo6293a() {
        this.f5467b.edit().clear().apply();
    }

    /* renamed from: b */
    public Bundle mo6294b() {
        Bundle bundle = new Bundle();
        for (String str : this.f5467b.getAll().keySet()) {
            try {
                m7929a(str, bundle);
            } catch (JSONException e) {
                C1845w wVar = C1845w.CACHE;
                String str2 = f5465c;
                StringBuilder sb = new StringBuilder();
                sb.append("Error reading cached value for key: '");
                sb.append(str);
                sb.append("' -- ");
                sb.append(e);
                C1682p.m7280a(wVar, 5, str2, sb.toString());
                return null;
            }
        }
        return bundle;
    }
}
