package p147g.p156d.p157a.p167b.p173d.p180g;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* renamed from: g.d.a.b.d.g.a2 */
public final class C3911a2 {
    /* renamed from: a */
    public static C4149p2<C4275x1> m15708a(Context context) {
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        boolean z = false;
        if ((str.equals("eng") || str.equals("userdebug")) && ((str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            z = true;
        }
        if (!z) {
            return C4149p2.m16915c();
        }
        if (C4134o1.m16876a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        C4149p2 b = m15710b(context);
        return b.mo12670a() ? C4149p2.m16914a(m15709a((File) b.mo12671b())) : C4149p2.m16915c();
    }

    /* renamed from: a */
    private static C4275x1 m15709a(File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                String str = "HermeticFileOverrides";
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        String str2 = "Invalid: ";
                        String valueOf = String.valueOf(readLine);
                        Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    } else {
                        String str3 = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new HashMap());
                        }
                        ((Map) hashMap.get(str3)).put(decode, decode2);
                    }
                } else {
                    String valueOf2 = String.valueOf(file);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf2);
                    Log.i(str, sb.toString());
                    C4275x1 x1Var = new C4275x1(hashMap);
                    bufferedReader.close();
                    return x1Var;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            C4276x2.m17528a(th, th);
        }
        throw th;
    }

    /* renamed from: b */
    private static C4149p2<File> m15710b(Context context) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            return file.exists() ? C4149p2.m16914a(file) : C4149p2.m16915c();
        } catch (RuntimeException e) {
            Log.e("HermeticFileOverrides", "no data dir", e);
            return C4149p2.m16915c();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}
