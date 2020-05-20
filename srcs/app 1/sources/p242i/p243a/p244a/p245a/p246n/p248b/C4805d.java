package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.Context;
import p242i.p243a.p244a.p245a.C4781c;

/* renamed from: i.a.a.a.n.b.d */
class C4805d implements C4810f {

    /* renamed from: a */
    private final Context f12556a;

    public C4805d(Context context) {
        this.f12556a = context.getApplicationContext();
    }

    /* renamed from: b */
    private String m19331b() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(m19332c(), new Object[0]);
        } catch (Exception unused) {
            C4781c.m19229f().mo13787a("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }

    /* renamed from: c */
    private Object m19332c() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f12556a});
        } catch (Exception unused) {
            C4781c.m19229f().mo13787a("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    /* renamed from: d */
    private boolean m19333d() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m19332c(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C4781c.m19229f().mo13787a("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    /* renamed from: a */
    public C4802b mo13858a() {
        if (mo13859a(this.f12556a)) {
            return new C4802b(m19331b(), m19333d());
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo13859a(Context context) {
        try {
            return ((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }
}
