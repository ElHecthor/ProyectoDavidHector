package p352o.p353a.p354a.p356b.p358b;

import android.app.Application;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5950s;
import p352o.p353a.p354a.p355a.C6510a;
import p352o.p353a.p364c.p372k.C6560a;
import p352o.p353a.p364c.p374m.C6565a;

/* renamed from: o.a.a.b.b.b */
public final class C6515b {
    /* renamed from: a */
    public static final Application m24710a(C6565a aVar) {
        C5942k.m22327b(aVar, "$this$androidApplication");
        try {
            return (Application) aVar.mo17011a(C5950s.m22341a(Application.class), (C6560a) null, null);
        } catch (Exception unused) {
            throw new C6510a("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
