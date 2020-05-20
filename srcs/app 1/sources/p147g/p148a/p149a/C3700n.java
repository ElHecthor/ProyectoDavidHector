package p147g.p148a.p149a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.n */
public class C3700n {

    /* renamed from: a */
    private static final String f10485a = "g.a.a.n";

    /* renamed from: b */
    private static C3690f f10486b = C3690f.m15021a();

    /* renamed from: a */
    static SharedPreferences m15134a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("com.amplitude.api.");
        sb.append(str);
        sb.append(".");
        sb.append(context.getPackageName());
        return context.getSharedPreferences(sb.toString(), 4);
    }

    /* renamed from: a */
    static String m15135a(Context context, String str, String str2) {
        return m15134a(context, str).getString(str2, null);
    }

    /* renamed from: a */
    static JSONObject m15136a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject == null) {
            return null;
        }
        if (jSONObject.length() == 0) {
            return new JSONObject();
        }
        try {
            jSONArray = jSONObject.names();
        } catch (ArrayIndexOutOfBoundsException e) {
            f10486b.mo11713b(f10485a, e.toString());
            jSONArray = null;
        }
        int length = jSONArray != null ? jSONArray.length() : 0;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArray.optString(i);
        }
        try {
            return new JSONObject(jSONObject, strArr);
        } catch (JSONException e2) {
            f10486b.mo11713b(f10485a, e2.toString());
            return null;
        }
    }

    /* renamed from: a */
    static void m15137a(Context context, String str, String str2, String str3) {
        Editor edit = m15134a(context, str).edit();
        edit.putString(str2, str3);
        edit.apply();
    }

    /* renamed from: a */
    public static boolean m15138a(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: b */
    static String m15139b(String str) {
        if (m15138a(str)) {
            str = "$default_instance";
        }
        return str.toLowerCase();
    }
}
