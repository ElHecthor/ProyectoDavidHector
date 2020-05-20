package p147g.p148a.p149a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: g.a.a.k */
public class C3695k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f10462d = "g.a.a.k";

    /* renamed from: a */
    private boolean f10463a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f10464b;

    /* renamed from: c */
    private C3697b f10465c;

    /* renamed from: g.a.a.k$b */
    private class C3697b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f10466a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f10467b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f10468c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f10469d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f10470e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f10471f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f10472g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f10473h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f10474i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f10475j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f10476k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f10477l;

        private C3697b() {
            this.f10466a = m15089b();
            this.f10468c = m15114p();
            this.f10469d = m15112n();
            this.f10470e = m15113o();
            this.f10471f = m15095e();
            this.f10472g = m15109l();
            this.f10473h = m15111m();
            this.f10474i = m15097f();
            this.f10467b = m15099g();
            this.f10475j = m15107k();
            this.f10477l = m15088a();
        }

        /* renamed from: a */
        private boolean m15088a() {
            String str;
            C3690f fVar;
            String str2 = "Google Play Services Util not found!";
            boolean z = false;
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{C3695k.this.f10464b});
                if (num != null && num.intValue() == 0) {
                    z = true;
                }
                return z;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                fVar = C3690f.m15021a();
                str = C3695k.f10462d;
                fVar.mo11715d(str, str2);
                return false;
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                C3690f.m15021a().mo11715d(C3695k.f10462d, "Google Play Services not available");
                return false;
            } catch (Exception e) {
                fVar = C3690f.m15021a();
                str = C3695k.f10462d;
                StringBuilder sb = new StringBuilder();
                sb.append("Error when checking for Google Play Services: ");
                sb.append(e);
                str2 = sb.toString();
                fVar.mo11715d(str, str2);
                return false;
            }
        }

        /* renamed from: b */
        private String m15089b() {
            return "Amazon".equals(m15109l()) ? m15091c() : m15093d();
        }

        /* renamed from: c */
        private String m15091c() {
            ContentResolver contentResolver = C3695k.this.f10464b.getContentResolver();
            boolean z = false;
            if (Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1) {
                z = true;
            }
            this.f10476k = z;
            String string = Secure.getString(contentResolver, "advertising_id");
            this.f10466a = string;
            return string;
        }

        /* renamed from: d */
        private String m15093d() {
            String str;
            String str2;
            C3690f fVar;
            try {
                boolean z = true;
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{C3695k.this.f10464b});
                Boolean bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f10476k = z;
                this.f10466a = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException unused) {
                fVar = C3690f.m15021a();
                str2 = C3695k.f10462d;
                str = "Google Play Services SDK not found!";
                fVar.mo11715d(str2, str);
            } catch (InvocationTargetException unused2) {
                fVar = C3690f.m15021a();
                str2 = C3695k.f10462d;
                str = "Google Play Services not available";
                fVar.mo11715d(str2, str);
            } catch (Exception e) {
                C3690f.m15021a().mo11711a(C3695k.f10462d, "Encountered an error connecting to Google Play Services", e);
            }
            return this.f10466a;
        }

        /* renamed from: e */
        private String m15095e() {
            return Build.BRAND;
        }

        /* renamed from: f */
        private String m15097f() {
            try {
                return ((TelephonyManager) C3695k.this.f10464b.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: g */
        private String m15099g() {
            String i = m15103i();
            if (!C3700n.m15138a(i)) {
                return i;
            }
            String j = m15105j();
            return !C3700n.m15138a(j) ? j : m15101h();
        }

        /* renamed from: h */
        private String m15101h() {
            return Locale.getDefault().getCountry();
        }

        /* renamed from: i */
        private String m15103i() {
            if (!C3695k.this.mo11758o()) {
                return null;
            }
            Location i = C3695k.this.mo11752i();
            if (i != null) {
                try {
                    if (Geocoder.isPresent()) {
                        List<Address> fromLocation = C3695k.this.mo11748e().getFromLocation(i.getLatitude(), i.getLongitude(), 1);
                        if (fromLocation != null) {
                            for (Address address : fromLocation) {
                                if (address != null) {
                                    return address.getCountryCode();
                                }
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException unused) {
                }
            }
            return null;
        }

        /* renamed from: j */
        private String m15105j() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C3695k.this.f10464b.getSystemService("phone");
                if (telephonyManager.getPhoneType() != 2) {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (networkCountryIso != null) {
                        return networkCountryIso.toUpperCase(Locale.US);
                    }
                }
            } catch (Exception unused) {
            }
            return null;
        }

        /* renamed from: k */
        private String m15107k() {
            return Locale.getDefault().getLanguage();
        }

        /* renamed from: l */
        private String m15109l() {
            return Build.MANUFACTURER;
        }

        /* renamed from: m */
        private String m15111m() {
            return Build.MODEL;
        }

        /* renamed from: n */
        private String m15112n() {
            return "android";
        }

        /* renamed from: o */
        private String m15113o() {
            return VERSION.RELEASE;
        }

        /* renamed from: p */
        private String m15114p() {
            try {
                return C3695k.this.f10464b.getPackageManager().getPackageInfo(C3695k.this.f10464b.getPackageName(), 0).versionName;
            } catch (NameNotFoundException | Exception unused) {
                return null;
            }
        }
    }

    public C3695k(Context context) {
        this.f10464b = context;
    }

    /* renamed from: r */
    public static String m15069r() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: s */
    private C3697b m15070s() {
        if (this.f10465c == null) {
            this.f10465c = new C3697b();
        }
        return this.f10465c;
    }

    /* renamed from: a */
    public String mo11744a() {
        return m15070s().f10466a;
    }

    /* renamed from: b */
    public String mo11745b() {
        return m15070s().f10471f;
    }

    /* renamed from: c */
    public String mo11746c() {
        return m15070s().f10474i;
    }

    /* renamed from: d */
    public String mo11747d() {
        return m15070s().f10467b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Geocoder mo11748e() {
        return new Geocoder(this.f10464b, Locale.ENGLISH);
    }

    /* renamed from: f */
    public String mo11749f() {
        return m15070s().f10475j;
    }

    /* renamed from: g */
    public String mo11750g() {
        return m15070s().f10472g;
    }

    /* renamed from: h */
    public String mo11751h() {
        return m15070s().f10473h;
    }

    /* renamed from: i */
    public Location mo11752i() {
        List<String> list;
        Object obj;
        String str = "Failed to get most recent location";
        Location location = null;
        if (!mo11758o()) {
            return null;
        }
        LocationManager locationManager = (LocationManager) this.f10464b.getSystemService("location");
        if (locationManager == null) {
            return null;
        }
        try {
            list = locationManager.getProviders(true);
        } catch (SecurityException unused) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList<Location> arrayList = new ArrayList<>();
        for (String lastKnownLocation : list) {
            try {
                obj = locationManager.getLastKnownLocation(lastKnownLocation);
            } catch (Exception | SecurityException unused2) {
                C3690f.m15021a().mo11715d(f10462d, str);
                obj = null;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        long j = -1;
        for (Location location2 : arrayList) {
            if (location2.getTime() > j) {
                j = location2.getTime();
                location = location2;
            }
        }
        return location;
    }

    /* renamed from: j */
    public String mo11753j() {
        return m15070s().f10469d;
    }

    /* renamed from: k */
    public String mo11754k() {
        return m15070s().f10470e;
    }

    /* renamed from: l */
    public String mo11755l() {
        return m15070s().f10468c;
    }

    /* renamed from: m */
    public boolean mo11756m() {
        return m15070s().f10477l;
    }

    /* renamed from: n */
    public boolean mo11757n() {
        return m15070s().f10476k;
    }

    /* renamed from: o */
    public boolean mo11758o() {
        return this.f10463a;
    }

    /* renamed from: p */
    public void mo11759p() {
        m15070s();
    }
}
