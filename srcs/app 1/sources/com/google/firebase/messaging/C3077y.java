package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.google.firebase.messaging.y */
public final class C3077y {

    /* renamed from: a */
    private final Bundle f8738a;

    public C3077y(Bundle bundle) {
        if (bundle != null) {
            this.f8738a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    /* renamed from: a */
    public static boolean m12497a(Bundle bundle) {
        String str = "gcm.n.e";
        String str2 = "1";
        return str2.equals(bundle.getString(str)) || str2.equals(bundle.getString(m12501i(str)));
    }

    /* renamed from: b */
    private final String m12498b(Resources resources, String str, String str2) {
        String e = mo9864e(str2);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        int identifier = resources.getIdentifier(e, "string", str);
        String str3 = " Default value will be used.";
        String str4 = "NotificationParams";
        if (identifier == 0) {
            String valueOf = String.valueOf(str2);
            String str5 = "_loc_key";
            String h = m12500h(str5.length() != 0 ? valueOf.concat(str5) : new String(valueOf));
            StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 49 + String.valueOf(str2).length());
            sb.append(h);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(str3);
            Log.w(str4, sb.toString());
            return null;
        }
        Object[] f = mo9866f(str2);
        if (f == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, f);
        } catch (MissingFormatArgumentException e2) {
            String h2 = m12500h(str2);
            String arrays = Arrays.toString(f);
            StringBuilder sb2 = new StringBuilder(String.valueOf(h2).length() + 58 + String.valueOf(arrays).length());
            sb2.append("Missing format argument for ");
            sb2.append(h2);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(str3);
            Log.w(str4, sb2.toString(), e2);
            return null;
        }
    }

    /* renamed from: g */
    private final JSONArray m12499g(String str) {
        String a = mo9856a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return new JSONArray(a);
            } catch (JSONException unused) {
                String h = m12500h(str);
                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 50 + String.valueOf(a).length());
                sb.append("Malformed JSON for key ");
                sb.append(h);
                sb.append(": ");
                sb.append(a);
                sb.append(", falling back to default");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }

    /* renamed from: h */
    private static String m12500h(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    /* renamed from: i */
    private static String m12501i(String str) {
        String str2 = "gcm.n.";
        return !str.startsWith(str2) ? str : str.replace(str2, "gcm.notification.");
    }

    /* renamed from: a */
    public final Uri mo9854a() {
        String a = mo9856a("gcm.n.link_android");
        if (TextUtils.isEmpty(a)) {
            a = mo9856a("gcm.n.link");
        }
        if (!TextUtils.isEmpty(a)) {
            return Uri.parse(a);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo9855a(Resources resources, String str, String str2) {
        String a = mo9856a(str2);
        return !TextUtils.isEmpty(a) ? a : m12498b(resources, str, str2);
    }

    /* renamed from: a */
    public final String mo9856a(String str) {
        Bundle bundle = this.f8738a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String i = m12501i(str);
            if (this.f8738a.containsKey(i)) {
                str = i;
            }
        }
        return bundle.getString(str);
    }

    /* renamed from: b */
    public final String mo9857b() {
        String a = mo9856a("gcm.n.sound2");
        return TextUtils.isEmpty(a) ? mo9856a("gcm.n.sound") : a;
    }

    /* renamed from: b */
    public final boolean mo9858b(String str) {
        String a = mo9856a(str);
        return "1".equals(a) || Boolean.parseBoolean(a);
    }

    /* renamed from: c */
    public final Integer mo9859c(String str) {
        String a = mo9856a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return Integer.valueOf(Integer.parseInt(a));
            } catch (NumberFormatException unused) {
                String h = m12500h(str);
                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(a).length());
                sb.append("Couldn't parse value of ");
                sb.append(h);
                sb.append("(");
                sb.append(a);
                sb.append(") into an int");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    public final long[] mo9860c() {
        JSONArray g = m12499g("gcm.n.vibrate_timings");
        if (g == null) {
            return null;
        }
        try {
            if (g.length() > 1) {
                int length = g.length();
                long[] jArr = new long[length];
                for (int i = 0; i < length; i++) {
                    jArr[i] = g.optLong(i);
                }
                return jArr;
            }
            throw new JSONException("vibrateTimings have invalid length");
        } catch (NumberFormatException | JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 74);
            sb.append("User defined vibrateTimings is invalid: ");
            sb.append(valueOf);
            sb.append(". Skipping setting vibrateTimings.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    /* renamed from: d */
    public final Long mo9861d(String str) {
        String a = mo9856a(str);
        if (!TextUtils.isEmpty(a)) {
            try {
                return Long.valueOf(Long.parseLong(a));
            } catch (NumberFormatException unused) {
                String h = m12500h(str);
                StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 38 + String.valueOf(a).length());
                sb.append("Couldn't parse value of ");
                sb.append(h);
                sb.append("(");
                sb.append(a);
                sb.append(") into a long");
                Log.w("NotificationParams", sb.toString());
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int[] mo9862d() {
        String str;
        String str2 = ". Skipping setting LightSettings";
        String str3 = "LightSettings is invalid: ";
        String str4 = "NotificationParams";
        JSONArray g = m12499g("gcm.n.light_settings");
        if (g == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (g.length() == 3) {
                int parseColor = Color.parseColor(g.optString(0));
                if (parseColor != -16777216) {
                    iArr[0] = parseColor;
                    iArr[1] = g.optInt(1);
                    iArr[2] = g.optInt(2);
                    return iArr;
                }
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            throw new JSONException("lightSettings don't have all three fields");
        } catch (JSONException unused) {
            String valueOf = String.valueOf(g);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 58);
            sb.append(str3);
            sb.append(valueOf);
            sb.append(str2);
            str = sb.toString();
            Log.w(str4, str);
            return null;
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(g);
            String message = e.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 60 + String.valueOf(message).length());
            sb2.append(str3);
            sb2.append(valueOf2);
            sb2.append(". ");
            sb2.append(message);
            sb2.append(str2);
            str = sb2.toString();
            Log.w(str4, str);
            return null;
        }
    }

    /* renamed from: e */
    public final Bundle mo9863e() {
        Bundle bundle = new Bundle(this.f8738a);
        for (String str : this.f8738a.keySet()) {
            if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public final String mo9864e(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_key";
        return mo9856a(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
    }

    /* renamed from: f */
    public final Bundle mo9865f() {
        Bundle bundle = new Bundle(this.f8738a);
        for (String str : this.f8738a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    /* renamed from: f */
    public final Object[] mo9866f(String str) {
        String valueOf = String.valueOf(str);
        String str2 = "_loc_args";
        JSONArray g = m12499g(str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf));
        if (g == null) {
            return null;
        }
        int length = g.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = g.optString(i);
        }
        return strArr;
    }
}
