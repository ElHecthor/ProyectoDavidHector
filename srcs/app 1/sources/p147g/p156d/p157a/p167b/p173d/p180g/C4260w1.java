package p147g.p156d.p157a.p167b.p173d.p180g;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import javax.annotation.Nullable;
import p071f.p097h.p098e.C3237b;

/* renamed from: g.d.a.b.d.g.w1 */
final class C4260w1 implements C4177r1 {

    /* renamed from: c */
    private static C4260w1 f11410c;
    @Nullable

    /* renamed from: a */
    private final Context f11411a;
    @Nullable

    /* renamed from: b */
    private final ContentObserver f11412b;

    private C4260w1() {
        this.f11411a = null;
        this.f11412b = null;
    }

    private C4260w1(Context context) {
        this.f11411a = context;
        this.f11412b = new C4291y1(this, null);
        context.getContentResolver().registerContentObserver(C4106m1.f11102a, true, this.f11412b);
    }

    /* renamed from: a */
    static C4260w1 m17437a(Context context) {
        C4260w1 w1Var;
        synchronized (C4260w1.class) {
            if (f11410c == null) {
                f11410c = C3237b.m13273a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new C4260w1(context) : new C4260w1();
            }
            w1Var = f11410c;
        }
        return w1Var;
    }

    /* renamed from: a */
    static synchronized void m17438a() {
        synchronized (C4260w1.class) {
            if (!(f11410c == null || f11410c.f11411a == null || f11410c.f11412b == null)) {
                f11410c.f11411a.getContentResolver().unregisterContentObserver(f11410c.f11412b);
            }
            f11410c = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final String mo12592a(String str) {
        if (this.f11411a == null) {
            return null;
        }
        try {
            return (String) C4231u1.m17248a(new C4245v1(this, str));
        } catch (IllegalStateException | SecurityException e) {
            String str2 = "Unable to read GServices for: ";
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ String mo12885b(String str) {
        return C4106m1.m16799a(this.f11411a.getContentResolver(), str, (String) null);
    }
}
