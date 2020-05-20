package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;
import p071f.p097h.p098e.C3237b;

/* renamed from: androidx.appcompat.app.l */
class C0101l {

    /* renamed from: d */
    private static C0101l f351d;

    /* renamed from: a */
    private final Context f352a;

    /* renamed from: b */
    private final LocationManager f353b;

    /* renamed from: c */
    private final C0102a f354c = new C0102a();

    /* renamed from: androidx.appcompat.app.l$a */
    private static class C0102a {

        /* renamed from: a */
        boolean f355a;

        /* renamed from: b */
        long f356b;

        /* renamed from: c */
        long f357c;

        /* renamed from: d */
        long f358d;

        /* renamed from: e */
        long f359e;

        /* renamed from: f */
        long f360f;

        C0102a() {
        }
    }

    C0101l(Context context, LocationManager locationManager) {
        this.f352a = context;
        this.f353b = locationManager;
    }

    /* renamed from: a */
    private Location m455a(String str) {
        try {
            if (this.f353b.isProviderEnabled(str)) {
                return this.f353b.getLastKnownLocation(str);
            }
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
        }
        return null;
    }

    /* renamed from: a */
    static C0101l m456a(Context context) {
        if (f351d == null) {
            Context applicationContext = context.getApplicationContext();
            f351d = new C0101l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f351d;
    }

    /* renamed from: a */
    private void m457a(Location location) {
        long j;
        C0102a aVar = this.f354c;
        long currentTimeMillis = System.currentTimeMillis();
        C0100k a = C0100k.m453a();
        C0100k kVar = a;
        kVar.mo383a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j2 = a.f348a;
        kVar.mo383a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = a.f350c == 1;
        long j3 = a.f349b;
        long j4 = j2;
        long j5 = a.f348a;
        long j6 = j3;
        boolean z2 = z;
        a.mo383a(86400000 + currentTimeMillis, location.getLatitude(), location.getLongitude());
        long j7 = a.f349b;
        if (j6 == -1 || j5 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            long j8 = currentTimeMillis > j5 ? 0 + j7 : currentTimeMillis > j6 ? 0 + j5 : 0 + j6;
            j = j8 + 60000;
        }
        aVar.f355a = z2;
        aVar.f356b = j4;
        aVar.f357c = j6;
        aVar.f358d = j5;
        aVar.f359e = j7;
        aVar.f360f = j;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m458b() {
        Location location = null;
        Location a = C3237b.m13273a(this.f352a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m455a("network") : null;
        if (C3237b.m13273a(this.f352a, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            location = m455a("gps");
        }
        if (location == null || a == null) {
            if (location != null) {
                a = location;
            }
            return a;
        }
        if (location.getTime() > a.getTime()) {
            a = location;
        }
        return a;
    }

    /* renamed from: c */
    private boolean m459c() {
        return this.f354c.f360f > System.currentTimeMillis();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo384a() {
        C0102a aVar = this.f354c;
        if (m459c()) {
            return aVar.f355a;
        }
        Location b = m458b();
        if (b != null) {
            m457a(b);
            return aVar.f355a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
