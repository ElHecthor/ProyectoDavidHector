package com.facebook.p040g0.p041a;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdManager.RegistrationListener;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.C1787m;
import com.facebook.internal.C1672m;
import com.facebook.internal.C1697u;
import com.facebook.internal.C1698v;
import java.util.EnumMap;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4637e;
import p147g.p156d.p212c.C4641h;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: com.facebook.g0.a.a */
public class C1628a {

    /* renamed from: a */
    private static final String f5018a = "com.facebook.g0.a.a";

    /* renamed from: b */
    private static HashMap<String, RegistrationListener> f5019b = new HashMap<>();

    /* renamed from: com.facebook.g0.a.a$a */
    static class C1629a implements RegistrationListener {

        /* renamed from: a */
        final /* synthetic */ String f5020a;

        /* renamed from: b */
        final /* synthetic */ String f5021b;

        C1629a(String str, String str2) {
            this.f5020a = str;
            this.f5021b = str2;
        }

        public void onRegistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
            C1628a.m7157a(this.f5021b);
        }

        public void onServiceRegistered(NsdServiceInfo nsdServiceInfo) {
            if (!this.f5020a.equals(nsdServiceInfo.getServiceName())) {
                C1628a.m7157a(this.f5021b);
            }
        }

        public void onServiceUnregistered(NsdServiceInfo nsdServiceInfo) {
        }

        public void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo, int i) {
        }
    }

    /* renamed from: a */
    public static String m7156a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device", Build.DEVICE);
            jSONObject.put("model", Build.MODEL);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static void m7157a(String str) {
        m7158b(str);
    }

    @TargetApi(16)
    /* renamed from: b */
    private static void m7158b(String str) {
        RegistrationListener registrationListener = (RegistrationListener) f5019b.get(str);
        if (registrationListener != null) {
            try {
                ((NsdManager) C1787m.m7744e().getSystemService("servicediscovery")).unregisterService(registrationListener);
            } catch (IllegalArgumentException e) {
                C1698v.m7380a(f5018a, (Exception) e);
            }
            f5019b.remove(str);
        }
    }

    /* renamed from: b */
    public static boolean m7159b() {
        return VERSION.SDK_INT >= 16 && C1672m.m7268c(C1787m.m7745f()).mo5913i().contains(C1697u.f5155h);
    }

    /* renamed from: c */
    public static Bitmap m7160c(String str) {
        EnumMap enumMap = new EnumMap(C4635c.class);
        enumMap.put(C4635c.MARGIN, Integer.valueOf(2));
        try {
            C4652b a = new C4637e().mo13539a(str, C4633a.QR_CODE, 200, 200, enumMap);
            int c = a.mo13583c();
            int d = a.mo13585d();
            int[] iArr = new int[(c * d)];
            for (int i = 0; i < c; i++) {
                int i2 = i * d;
                for (int i3 = 0; i3 < d; i3++) {
                    iArr[i2 + i3] = a.mo13580a(i3, i) ? -16777216 : -1;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(d, c, Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, d, 0, 0, d, c);
            return createBitmap;
        } catch (C4641h unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static boolean m7161d(String str) {
        if (m7159b()) {
            return m7162e(str);
        }
        return false;
    }

    @TargetApi(16)
    /* renamed from: e */
    private static boolean m7162e(String str) {
        if (f5019b.containsKey(str)) {
            return true;
        }
        String format = String.format("%s_%s_%s", new Object[]{"fbsdk", String.format("%s-%s", new Object[]{"android", C1787m.m7755p().replace('.', '|')}), str});
        NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
        nsdServiceInfo.setServiceType("_fb._tcp.");
        nsdServiceInfo.setServiceName(format);
        nsdServiceInfo.setPort(80);
        NsdManager nsdManager = (NsdManager) C1787m.m7744e().getSystemService("servicediscovery");
        C1629a aVar = new C1629a(format, str);
        f5019b.put(str, aVar);
        nsdManager.registerService(nsdServiceInfo, 1, aVar);
        return true;
    }
}
