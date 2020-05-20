package com.facebook.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.os.Parcel;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.view.autofill.AutofillManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.facebook.C1499a;
import com.facebook.C1631i;
import com.facebook.C1787m;
import com.facebook.C1797q;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.C1843u;
import com.facebook.p034f0.C1563p;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.facebook.internal.v */
public final class C1698v {

    /* renamed from: a */
    private static int f5160a = 0;

    /* renamed from: b */
    private static long f5161b = -1;

    /* renamed from: c */
    private static long f5162c = -1;

    /* renamed from: d */
    private static long f5163d = -1;

    /* renamed from: e */
    private static String f5164e = "";

    /* renamed from: f */
    private static String f5165f = "";

    /* renamed from: g */
    private static String f5166g = "NoCarrier";

    /* renamed from: com.facebook.internal.v$a */
    static class C1699a implements C1802e {

        /* renamed from: a */
        final /* synthetic */ C1701c f5167a;

        /* renamed from: b */
        final /* synthetic */ String f5168b;

        C1699a(C1701c cVar, String str) {
            this.f5167a = cVar;
            this.f5168b = str;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            if (tVar.mo6290a() != null) {
                this.f5167a.mo5945a(tVar.mo6290a().mo6008d());
                return;
            }
            C1695s.m7346a(this.f5168b, tVar.mo6291b());
            this.f5167a.mo5946a(tVar.mo6291b());
        }
    }

    /* renamed from: com.facebook.internal.v$b */
    static class C1700b implements FilenameFilter {
        C1700b() {
        }

        public boolean accept(File file, String str) {
            return Pattern.matches("cpu[0-9]+", str);
        }
    }

    /* renamed from: com.facebook.internal.v$c */
    public interface C1701c {
        /* renamed from: a */
        void mo5945a(C1631i iVar);

        /* renamed from: a */
        void mo5946a(JSONObject jSONObject);
    }

    /* renamed from: com.facebook.internal.v$d */
    public static class C1702d {

        /* renamed from: a */
        List<String> f5169a;

        /* renamed from: b */
        List<String> f5170b;

        /* renamed from: c */
        List<String> f5171c;

        public C1702d(List<String> list, List<String> list2, List<String> list3) {
            this.f5169a = list;
            this.f5170b = list2;
            this.f5171c = list3;
        }

        /* renamed from: a */
        public List<String> mo5947a() {
            return this.f5170b;
        }

        /* renamed from: b */
        public List<String> mo5948b() {
            return this.f5171c;
        }

        /* renamed from: c */
        public List<String> mo5949c() {
            return this.f5169a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7353a(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0024 }
            r1.<init>(r6)     // Catch:{ all -> 0x0024 }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0021 }
            r2 = 0
            r3 = 0
        L_0x000c:
            int r4 = r1.read(r0)     // Catch:{ all -> 0x0021 }
            r5 = -1
            if (r4 == r5) goto L_0x0018
            r7.write(r0, r2, r4)     // Catch:{ all -> 0x0021 }
            int r3 = r3 + r4
            goto L_0x000c
        L_0x0018:
            r1.close()
            if (r6 == 0) goto L_0x0020
            r6.close()
        L_0x0020:
            return r3
        L_0x0021:
            r7 = move-exception
            r0 = r1
            goto L_0x0025
        L_0x0024:
            r7 = move-exception
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            r0.close()
        L_0x002a:
            if (r6 == 0) goto L_0x002f
            r6.close()
        L_0x002f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1698v.m7353a(java.io.InputStream, java.io.OutputStream):int");
    }

    /* renamed from: a */
    private static long m7354a(double d) {
        return Math.round(d / 1.073741824E9d);
    }

    /* renamed from: a */
    public static long m7355a(Uri uri) {
        Cursor cursor = null;
        try {
            cursor = C1787m.m7744e().getContentResolver().query(uri, null, null, null, null);
            int columnIndex = cursor.getColumnIndex("_size");
            cursor.moveToFirst();
            return cursor.getLong(columnIndex);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    /* renamed from: a */
    public static Uri m7356a(String str, String str2, Bundle bundle) {
        Builder builder = new Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                Object obj = bundle.get(str3);
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    /* renamed from: a */
    public static Object m7357a(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Object m7358a(JSONObject jSONObject, String str, String str2) {
        Object opt = jSONObject.opt(str);
        if (opt != null && (opt instanceof String)) {
            opt = new JSONTokener((String) opt).nextValue();
        }
        if (opt == null || (opt instanceof JSONObject) || (opt instanceof JSONArray)) {
            return opt;
        }
        if (str2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt(str2, opt);
            return jSONObject2;
        }
        throw new C1631i("Got an unexpected non-JSON object.");
    }

    /* renamed from: a */
    public static String m7359a(int i) {
        return new BigInteger(i * 5, new Random()).toString(32);
    }

    /* renamed from: a */
    public static String m7360a(InputStream inputStream) {
        InputStreamReader inputStreamReader;
        BufferedInputStream bufferedInputStream;
        Throwable th;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                inputStreamReader = new InputStreamReader(bufferedInputStream);
                try {
                    StringBuilder sb = new StringBuilder();
                    char[] cArr = new char[2048];
                    while (true) {
                        int read = inputStreamReader.read(cArr);
                        if (read != -1) {
                            sb.append(cArr, 0, read);
                        } else {
                            String sb2 = sb.toString();
                            m7378a((Closeable) bufferedInputStream);
                            m7378a((Closeable) inputStreamReader);
                            return sb2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    m7378a((Closeable) bufferedInputStream);
                    m7378a((Closeable) inputStreamReader);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStreamReader = null;
                m7378a((Closeable) bufferedInputStream);
                m7378a((Closeable) inputStreamReader);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            inputStreamReader = null;
            m7378a((Closeable) bufferedInputStream);
            m7378a((Closeable) inputStreamReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m7361a(String str, String str2) {
        return m7401c(str) ? str2 : str;
    }

    /* renamed from: a */
    private static String m7362a(String str, byte[] bArr) {
        try {
            return m7363a(MessageDigest.getInstance(str), bArr);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m7363a(MessageDigest messageDigest, byte[] bArr) {
        messageDigest.update(bArr);
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b : digest) {
            sb.append(Integer.toHexString((b >> 4) & 15));
            sb.append(Integer.toHexString((b >> 0) & 15));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m7364a(byte[] bArr) {
        return m7362a("SHA-1", bArr);
    }

    /* renamed from: a */
    public static Method m7365a(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m7366a(String str, String str2, Class<?>... clsArr) {
        try {
            return m7365a(Class.forName(str), str2, clsArr);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Date m7367a(Bundle bundle, String str, Date date) {
        long j;
        Date date2 = null;
        if (bundle == null) {
            return null;
        }
        Object obj = bundle.get(str);
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    j = Long.parseLong((String) obj);
                } catch (NumberFormatException unused) {
                }
            }
            return date2;
        }
        if (j == 0) {
            return new Date(Long.MAX_VALUE);
        }
        date2 = new Date(date.getTime() + (j * 1000));
        return date2;
    }

    /* renamed from: a */
    public static List<String> m7368a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static <T> List<T> m7369a(T... tArr) {
        ArrayList arrayList = new ArrayList();
        for (T t : tArr) {
            if (t != null) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static Map<String, String> m7370a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt < 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static Map<String, String> m7371a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            String optString = jSONObject.optString(str);
            if (optString != null) {
                hashMap.put(str, optString);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static JSONObject m7372a(String str) {
        JSONObject a = C1695s.m7345a(str);
        if (a != null) {
            return a;
        }
        C1842t a2 = m7391b(str).mo6168a();
        if (a2.mo6290a() != null) {
            return null;
        }
        return a2.mo6291b();
    }

    /* renamed from: a */
    public static void m7373a(Context context) {
        m7374a(context, "facebook.com");
        m7374a(context, ".facebook.com");
        m7374a(context, "https://facebook.com");
        m7374a(context, "https://.facebook.com");
    }

    /* renamed from: a */
    private static void m7374a(Context context, String str) {
        CookieSyncManager.createInstance(context).sync();
        CookieManager instance = CookieManager.getInstance();
        String cookie = instance.getCookie(str);
        if (cookie != null) {
            for (String split : cookie.split(";")) {
                String[] split2 = split.split("=");
                if (split2.length > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(split2[0].trim());
                    sb.append("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;");
                    instance.setCookie(str, sb.toString());
                }
            }
            instance.removeExpiredCookie();
        }
    }

    /* renamed from: a */
    public static void m7375a(Bundle bundle, String str, Uri uri) {
        if (uri != null) {
            m7376a(bundle, str, uri.toString());
        }
    }

    /* renamed from: a */
    public static void m7376a(Bundle bundle, String str, String str2) {
        if (!m7401c(str2)) {
            bundle.putString(str, str2);
        }
    }

    /* renamed from: a */
    public static void m7377a(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Entry entry : map.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    /* renamed from: a */
    public static void m7378a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m7379a(String str, C1701c cVar) {
        JSONObject a = C1695s.m7345a(str);
        if (a != null) {
            cVar.mo5946a(a);
            return;
        }
        C1699a aVar = new C1699a(cVar, str);
        C1797q b = m7391b(str);
        b.mo6170a((C1802e) aVar);
        b.mo6175b();
    }

    /* renamed from: a */
    public static void m7380a(String str, Exception exc) {
        if (C1787m.m7756q() && str != null && exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
            Log.d(str, sb.toString());
        }
    }

    /* renamed from: a */
    public static void m7381a(String str, String str2, Throwable th) {
        if (C1787m.m7756q() && !m7401c(str)) {
            Log.d(str, str2, th);
        }
    }

    /* renamed from: a */
    public static void m7382a(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    /* renamed from: a */
    public static void m7383a(JSONObject jSONObject, Context context) {
        String str;
        Locale locale;
        int i;
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("a2");
        m7414h(context);
        String packageName = context.getPackageName();
        int i2 = 0;
        int i3 = -1;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            i3 = packageInfo.versionCode;
            str = packageInfo.versionName;
        } catch (NameNotFoundException unused) {
            str = "";
        }
        jSONArray.put(packageName);
        jSONArray.put(i3);
        jSONArray.put(str);
        jSONArray.put(VERSION.RELEASE);
        jSONArray.put(Build.MODEL);
        try {
            locale = context.getResources().getConfiguration().locale;
        } catch (Exception unused2) {
            locale = Locale.getDefault();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        sb.append("_");
        sb.append(locale.getCountry());
        jSONArray.put(sb.toString());
        jSONArray.put(f5164e);
        jSONArray.put(f5166g);
        double d = 0.0d;
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                int i4 = displayMetrics.widthPixels;
                try {
                    try {
                        d = (double) displayMetrics.density;
                    } catch (Exception unused3) {
                    }
                    i2 = i4;
                    i = displayMetrics.heightPixels;
                } catch (Exception unused4) {
                    i2 = i4;
                }
                jSONArray.put(i2);
                jSONArray.put(i);
                jSONArray.put(new DecimalFormat("#.##").format(d));
                jSONArray.put(m7406e());
                jSONArray.put(f5162c);
                jSONArray.put(f5163d);
                jSONArray.put(f5165f);
                jSONObject.put("extinfo", jSONArray.toString());
            }
        } catch (Exception unused5) {
        }
        i = 0;
        jSONArray.put(i2);
        jSONArray.put(i);
        jSONArray.put(new DecimalFormat("#.##").format(d));
        jSONArray.put(m7406e());
        jSONArray.put(f5162c);
        jSONArray.put(f5163d);
        jSONArray.put(f5165f);
        jSONObject.put("extinfo", jSONArray.toString());
    }

    /* renamed from: a */
    public static void m7384a(JSONObject jSONObject, C1633a aVar, String str, boolean z) {
        jSONObject.put("anon_id", str);
        jSONObject.put("application_tracking_enabled", !z);
        if (aVar != null) {
            if (aVar.mo5878c() != null) {
                jSONObject.put("attribution", aVar.mo5878c());
            }
            if (aVar.mo5876a() != null) {
                jSONObject.put("advertiser_id", aVar.mo5876a());
                jSONObject.put("advertiser_tracking_enabled", !aVar.mo5879d());
            }
            if (!aVar.mo5879d()) {
                String d = C1563p.m6945d();
                if (!d.isEmpty()) {
                    jSONObject.put("ud", d);
                }
            }
            if (aVar.mo5877b() != null) {
                jSONObject.put("installer_package", aVar.mo5877b());
            }
        }
    }

    /* renamed from: a */
    private static boolean m7385a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: a */
    public static boolean m7386a(Bundle bundle, String str, Object obj) {
        String obj2;
        if (obj == null) {
            bundle.remove(str);
        } else if (obj instanceof Boolean) {
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            bundle.putBooleanArray(str, (boolean[]) obj);
        } else if (obj instanceof Double) {
            bundle.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            bundle.putDoubleArray(str, (double[]) obj);
        } else if (obj instanceof Integer) {
            bundle.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            bundle.putIntArray(str, (int[]) obj);
        } else if (obj instanceof Long) {
            bundle.putLong(str, ((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            bundle.putLongArray(str, (long[]) obj);
        } else {
            if (obj instanceof String) {
                obj2 = (String) obj;
            } else if (!(obj instanceof JSONArray) && !(obj instanceof JSONObject)) {
                return false;
            } else {
                obj2 = obj.toString();
            }
            bundle.putString(str, obj2);
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m7387a(C1499a aVar) {
        return aVar != null && aVar.equals(C1499a.m6759r());
    }

    /* renamed from: a */
    public static <T> boolean m7388a(T t, T t2) {
        if (t != null) {
            return t.equals(t2);
        }
        return t2 == null;
    }

    /* renamed from: a */
    public static <T> boolean m7389a(Collection<T> collection) {
        return collection == null || collection.size() == 0;
    }

    /* renamed from: b */
    public static C1702d m7390b(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        ArrayList arrayList2 = new ArrayList(jSONArray.length());
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("permission");
            if (optString != null && !optString.equals("installed")) {
                String optString2 = optJSONObject.optString("status");
                if (optString2 != null) {
                    if (optString2.equals("granted")) {
                        arrayList.add(optString);
                    } else if (optString2.equals("declined")) {
                        arrayList2.add(optString);
                    } else if (optString2.equals("expired")) {
                        arrayList3.add(optString);
                    }
                }
            }
        }
        return new C1702d(arrayList, arrayList2, arrayList3);
    }

    /* renamed from: b */
    private static C1797q m7391b(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,name,first_name,middle_name,last_name,link");
        bundle.putString("access_token", str);
        C1797q qVar = new C1797q(null, "me", bundle, C1843u.GET, null);
        return qVar;
    }

    /* renamed from: b */
    public static String m7392b() {
        Context e = C1787m.m7744e();
        if (e == null) {
            return null;
        }
        try {
            return e.getPackageManager().getPackageInfo(e.getPackageName(), 0).versionName;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m7393b(Context context) {
        return context == null ? "null" : context == context.getApplicationContext() ? "unknown" : context.getClass().getSimpleName();
    }

    /* renamed from: b */
    private static String m7394b(String str, String str2) {
        return m7362a(str, str2.getBytes());
    }

    /* renamed from: b */
    public static <T> Collection<T> m7395b(T... tArr) {
        return Collections.unmodifiableCollection(Arrays.asList(tArr));
    }

    /* renamed from: b */
    public static boolean m7396b(Uri uri) {
        if (uri != null) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static String m7397c(Context context) {
        C1703w.m7423a((Object) context, "context");
        C1787m.m7742c(context);
        return C1787m.m7745f();
    }

    /* renamed from: c */
    public static Locale m7398c() {
        try {
            return C1787m.m7744e().getResources().getConfiguration().locale;
        } catch (Exception unused) {
            return Locale.getDefault();
        }
    }

    /* renamed from: c */
    public static void m7399c(String str, String str2) {
        if (C1787m.m7756q() && str != null && str2 != null) {
            Log.d(str, str2);
        }
    }

    /* renamed from: c */
    public static boolean m7400c(Uri uri) {
        if (uri != null) {
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m7401c(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: d */
    public static String m7402d(String str) {
        return m7394b("MD5", str);
    }

    /* renamed from: d */
    private static void m7403d() {
        try {
            if (m7385a()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f5163d = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
            f5163d = m7354a((double) f5163d);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static boolean m7404d(Context context) {
        boolean z = false;
        if (VERSION.SDK_INT < 26) {
            return false;
        }
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && autofillManager.isAutofillSupported() && autofillManager.isEnabled()) {
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if ("fbstaging".equalsIgnoreCase(r2.getScheme()) != false) goto L_0x0026;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m7405d(android.net.Uri r2) {
        /*
            if (r2 == 0) goto L_0x0028
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "http"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = r2.getScheme()
            java.lang.String r1 = "https"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L_0x0026
            java.lang.String r2 = r2.getScheme()
            java.lang.String r0 = "fbstaging"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C1698v.m7405d(android.net.Uri):boolean");
    }

    /* renamed from: e */
    private static int m7406e() {
        int i = f5160a;
        if (i > 0) {
            return i;
        }
        try {
            File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(new C1700b());
            if (listFiles != null) {
                f5160a = listFiles.length;
            }
        } catch (Exception unused) {
        }
        if (f5160a <= 0) {
            f5160a = Math.max(Runtime.getRuntime().availableProcessors(), 1);
        }
        return f5160a;
    }

    /* renamed from: e */
    public static Bundle m7407e(String str) {
        Bundle bundle = new Bundle();
        if (!m7401c(str)) {
            for (String split : str.split("&")) {
                String[] split2 = split.split("=");
                try {
                    String str2 = "UTF-8";
                    if (split2.length == 2) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), URLDecoder.decode(split2[1], str2));
                    } else if (split2.length == 1) {
                        bundle.putString(URLDecoder.decode(split2[0], str2), "");
                    }
                } catch (UnsupportedEncodingException e) {
                    m7380a("FacebookSDK", (Exception) e);
                }
            }
        }
        return bundle;
    }

    /* renamed from: e */
    public static boolean m7408e(Context context) {
        if (VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        return str != null && str.matches(".+_cheets|cheets_.+");
    }

    /* renamed from: f */
    public static String m7409f(String str) {
        if (str == null) {
            return null;
        }
        return m7394b("SHA-256", str);
    }

    /* renamed from: f */
    private static void m7410f() {
        try {
            TimeZone timeZone = TimeZone.getDefault();
            f5164e = timeZone.getDisplayName(timeZone.inDaylightTime(new Date()), 0);
            f5165f = timeZone.getID();
        } catch (AssertionError | Exception unused) {
        }
    }

    /* renamed from: f */
    public static boolean m7411f(Context context) {
        return m7404d(context);
    }

    /* renamed from: g */
    private static void m7412g() {
        try {
            if (m7385a()) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                f5162c = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
            f5162c = m7354a((double) f5162c);
        } catch (Exception unused) {
        }
    }

    /* renamed from: g */
    private static void m7413g(Context context) {
        if (f5166g.equals("NoCarrier")) {
            try {
                f5166g = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    private static void m7414h(Context context) {
        if (f5161b == -1 || System.currentTimeMillis() - f5161b >= 1800000) {
            f5161b = System.currentTimeMillis();
            m7410f();
            m7413g(context);
            m7412g();
            m7403d();
        }
    }
}
