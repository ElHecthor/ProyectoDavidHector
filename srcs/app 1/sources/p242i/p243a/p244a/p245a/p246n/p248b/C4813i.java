package p242i.p243a.p244a.p245a.p246n.p248b;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Debug;
import android.os.StatFs;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.b.i */
public class C4813i {

    /* renamed from: a */
    private static Boolean f12561a;

    /* renamed from: b */
    private static final char[] f12562b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static long f12563c = -1;

    /* renamed from: d */
    public static final Comparator<File> f12564d = new C4814a();

    /* renamed from: i.a.a.a.n.b.i$a */
    static class C4814a implements Comparator<File> {
        C4814a() {
        }

        /* renamed from: a */
        public int compare(File file, File file2) {
            return (int) (file.lastModified() - file2.lastModified());
        }
    }

    /* renamed from: i.a.a.a.n.b.i$b */
    enum C4815b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: p */
        private static final Map<String, C4815b> f12575p = null;

        static {
            HashMap hashMap = new HashMap(4);
            f12575p = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f12575p.put("armeabi", ARMV6);
            f12575p.put("arm64-v8a", ARM64);
            f12575p.put("x86", X86_32);
        }

        /* renamed from: f */
        static C4815b m19395f() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                C4781c.m19229f().mo13796e("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty");
                return UNKNOWN;
            }
            C4815b bVar = (C4815b) f12575p.get(str.toLowerCase(Locale.US));
            if (bVar == null) {
                bVar = UNKNOWN;
            }
            return bVar;
        }
    }

    /* renamed from: a */
    public static int m19348a() {
        return C4815b.m19395f().ordinal();
    }

    /* renamed from: a */
    public static int m19349a(Context context, String str, String str2) {
        return context.getResources().getIdentifier(str, str2, m19386h(context));
    }

    /* renamed from: a */
    public static int m19350a(Context context, boolean z) {
        Float e = m19383e(context);
        if (!z || e == null) {
            return 1;
        }
        if (((double) e.floatValue()) >= 99.0d) {
            return 3;
        }
        return ((double) e.floatValue()) < 99.0d ? 2 : 0;
    }

    /* renamed from: a */
    public static long m19351a(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    /* renamed from: a */
    public static long m19352a(String str) {
        StatFs statFs = new StatFs(str);
        long blockSize = (long) statFs.getBlockSize();
        return (((long) statFs.getBlockCount()) * blockSize) - (blockSize * ((long) statFs.getAvailableBlocks()));
    }

    /* renamed from: a */
    static long m19353a(String str, String str2, int i) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i);
    }

    /* renamed from: a */
    public static RunningAppProcessInfo m19354a(String str, Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.processName.equals(str)) {
                    return runningAppProcessInfo;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m19355a(int i) {
        switch (i) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY]]
      uses: [java.lang.String, java.io.Closeable]
      mth insns count: 41
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 7 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m19356a(java.io.File r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r7.exists()
            r2 = 0
            if (r1 == 0) goto L_0x0061
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r7)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r7 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r7
        L_0x0036:
            m19366a(r1, r0)
            goto L_0x0061
        L_0x003a:
            r8 = move-exception
            goto L_0x0040
        L_0x003c:
            r7 = move-exception
            goto L_0x005d
        L_0x003e:
            r8 = move-exception
            r1 = r2
        L_0x0040:
            i.a.a.a.l r3 = p242i.p243a.p244a.p245a.C4781c.m19229f()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "Fabric"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r5.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = "Error parsing "
            r5.append(r6)     // Catch:{ all -> 0x005b }
            r5.append(r7)     // Catch:{ all -> 0x005b }
            java.lang.String r7 = r5.toString()     // Catch:{ all -> 0x005b }
            r3.mo13793c(r4, r7, r8)     // Catch:{ all -> 0x005b }
            goto L_0x0036
        L_0x005b:
            r7 = move-exception
            r2 = r1
        L_0x005d:
            m19366a(r2, r0)
            throw r7
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19356a(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static String m19357a(InputStream inputStream) {
        return m19358a(inputStream, "SHA-1");
    }

    /* renamed from: a */
    private static String m19358a(InputStream inputStream, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return m19360a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            C4781c.m19229f().mo13793c("Fabric", "Could not calculate hash for app icon.", e);
            return "";
        }
    }

    /* renamed from: a */
    private static String m19359a(String str, String str2) {
        return m19361a(str.getBytes(), str2);
    }

    /* renamed from: a */
    public static String m19360a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            char[] cArr2 = f12562b;
            cArr[i2] = cArr2[b >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    private static String m19361a(byte[] bArr, String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            return m19360a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create hashing algorithm: ");
            sb.append(str);
            sb.append(", returning empty string.");
            f.mo13793c("Fabric", sb.toString(), e);
            return "";
        }
    }

    /* renamed from: a */
    public static String m19362a(String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : strArr) {
            if (str != null) {
                arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
            }
        }
        Collections.sort(arrayList);
        StringBuilder sb = new StringBuilder();
        for (String append : arrayList) {
            sb.append(append);
        }
        String sb2 = sb.toString();
        if (sb2.length() > 0) {
            return m19378c(sb2);
        }
        return null;
    }

    /* renamed from: a */
    public static void m19363a(Context context, int i, String str, String str2) {
        if (m19389k(context)) {
            C4781c.m19229f().mo13785a(i, "Fabric", str2);
        }
    }

    /* renamed from: a */
    public static void m19364a(Context context, String str, Throwable th) {
        if (m19389k(context)) {
            C4781c.m19229f().mo13792c("Fabric", str);
        }
    }

    /* renamed from: a */
    public static void m19365a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m19366a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                C4781c.m19229f().mo13793c("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m19367a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                C4781c.m19229f().mo13793c("Fabric", str, e);
            }
        }
    }

    /* renamed from: a */
    public static void m19368a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static boolean m19369a(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* renamed from: a */
    public static boolean m19370a(Context context, String str, boolean z) {
        if (context != null) {
            Resources resources = context.getResources();
            if (resources != null) {
                int a = m19349a(context, str, "bool");
                if (a > 0) {
                    return resources.getBoolean(a);
                }
                int a2 = m19349a(context, str, "string");
                if (a2 > 0) {
                    return Boolean.parseBoolean(context.getString(a2));
                }
            }
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized long m19371b() {
        long j;
        synchronized (C4813i.class) {
            if (f12563c == -1) {
                long j2 = 0;
                String a = m19356a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a)) {
                    String upperCase = a.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j2 = m19353a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j2 = m19353a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j2 = m19353a(upperCase, "GB", 1073741824);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Unexpected meminfo format while computing RAM: ");
                            sb.append(upperCase);
                            C4781c.m19229f().mo13796e("Fabric", sb.toString());
                        }
                    } catch (NumberFormatException e) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unexpected meminfo format while computing RAM: ");
                        sb2.append(upperCase);
                        C4781c.m19229f().mo13793c("Fabric", sb2.toString(), e);
                    }
                }
                f12563c = j2;
            }
            j = f12563c;
        }
        return j;
    }

    /* renamed from: b */
    public static String m19372b(int i) {
        if (i >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* renamed from: b */
    public static String m19373b(Context context, String str) {
        int a = m19349a(context, str, "string");
        return a > 0 ? context.getString(a) : "";
    }

    /* renamed from: b */
    public static String m19374b(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public static boolean m19375b(Context context) {
        if (!m19369a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    /* renamed from: b */
    public static boolean m19376b(String str) {
        return str == null || str.length() == 0;
    }

    /* renamed from: c */
    public static String m19377c(Context context) {
        InputStream inputStream;
        String str = "Failed to close icon input stream.";
        String str2 = null;
        try {
            inputStream = context.getResources().openRawResource(m19381d(context));
            try {
                String a = m19357a(inputStream);
                if (!m19376b(a)) {
                    str2 = a;
                }
                m19366a((Closeable) inputStream, str);
                return str2;
            } catch (Exception e) {
                e = e;
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not calculate hash for app icon:");
                    sb.append(e.getMessage());
                    C4781c.m19229f().mo13787a("Fabric", sb.toString());
                    m19366a((Closeable) inputStream, str);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    m19366a((Closeable) inputStream, str);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            inputStream = null;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not calculate hash for app icon:");
            sb2.append(e.getMessage());
            C4781c.m19229f().mo13787a("Fabric", sb2.toString());
            m19366a((Closeable) inputStream, str);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            m19366a((Closeable) inputStream, str);
            throw th;
        }
    }

    /* renamed from: c */
    public static String m19378c(String str) {
        return m19359a(str, "SHA-1");
    }

    /* renamed from: c */
    public static void m19379c(Context context, String str) {
        if (m19389k(context)) {
            C4781c.m19229f().mo13796e("Fabric", str);
        }
    }

    /* renamed from: c */
    public static boolean m19380c() {
        return Debug.isDebuggerConnected() || Debug.waitingForDebugger();
    }

    /* renamed from: d */
    public static int m19381d(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    /* renamed from: d */
    public static String m19382d(String str) {
        return m19359a(str, "SHA-256");
    }

    /* renamed from: e */
    public static Float m19383e(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    /* renamed from: f */
    public static int m19384f(Context context) {
        int i = m19390l(context) ? 1 : 0;
        if (m19391m(context)) {
            i |= 2;
        }
        return m19380c() ? i | 4 : i;
    }

    /* renamed from: g */
    public static boolean m19385g(Context context) {
        boolean z = false;
        if (m19390l(context)) {
            return false;
        }
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) != null) {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    public static String m19386h(Context context) {
        int i = context.getApplicationContext().getApplicationInfo().icon;
        if (i > 0) {
            try {
                return context.getResources().getResourcePackageName(i);
            } catch (NotFoundException unused) {
            }
        }
        return context.getPackageName();
    }

    /* renamed from: i */
    public static SharedPreferences m19387i(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    /* renamed from: j */
    public static boolean m19388j(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    /* renamed from: k */
    public static boolean m19389k(Context context) {
        if (f12561a == null) {
            f12561a = Boolean.valueOf(m19370a(context, "com.crashlytics.Trace", false));
        }
        return f12561a.booleanValue();
    }

    /* renamed from: l */
    public static boolean m19390l(Context context) {
        String string = Secure.getString(context.getContentResolver(), "android_id");
        if (!"sdk".equals(Build.PRODUCT)) {
            if (!"google_sdk".equals(Build.PRODUCT) && string != null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public static boolean m19391m(Context context) {
        boolean l = m19390l(context);
        String str = Build.TAGS;
        if ((!l && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        return !l && new File("/system/xbin/su").exists();
    }

    /* renamed from: n */
    public static String m19392n(Context context) {
        String str = "string";
        int a = m19349a(context, "io.fabric.android.build_id", str);
        if (a == 0) {
            a = m19349a(context, "com.crashlytics.android.build_id", str);
        }
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Build ID is: ");
        sb.append(string);
        f.mo13796e("Fabric", sb.toString());
        return string;
    }

    /* renamed from: o */
    public static String m19393o(Context context) {
        int a = m19349a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a == 0) {
            return null;
        }
        String string = context.getResources().getString(a);
        C4795l f = C4781c.m19229f();
        StringBuilder sb = new StringBuilder();
        sb.append("Unity Editor version is: ");
        sb.append(string);
        f.mo13796e("Fabric", sb.toString());
        return string;
    }
}
