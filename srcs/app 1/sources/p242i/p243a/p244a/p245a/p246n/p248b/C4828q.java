package p242i.p243a.p244a.p245a.p246n.p248b;

import android.content.Context;
import java.lang.reflect.Method;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;

/* renamed from: i.a.a.a.n.b.q */
final class C4828q implements C4827p {

    /* renamed from: a */
    private final Method f12599a;

    /* renamed from: b */
    private final Object f12600b;

    private C4828q(Class cls, Object obj) {
        this.f12600b = obj;
        this.f12599a = cls.getDeclaredMethod("isDataCollectionDefaultEnabled", new Class[0]);
    }

    /* renamed from: a */
    public static C4827p m19413a(Context context) {
        String str = "Fabric";
        try {
            Class loadClass = context.getClassLoader().loadClass("com.google.firebase.FirebaseApp");
            return new C4828q(loadClass, loadClass.getDeclaredMethod("getInstance", new Class[0]).invoke(loadClass, new Object[0]));
        } catch (ClassNotFoundException unused) {
            C4781c.m19229f().mo13796e(str, "Could not find class: com.google.firebase.FirebaseApp");
            return null;
        } catch (NoSuchMethodException e) {
            C4795l f = C4781c.m19229f();
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find method: ");
            sb.append(e.getMessage());
            f.mo13796e(str, sb.toString());
            return null;
        } catch (Exception e2) {
            C4781c.m19229f().mo13788a(str, "Unexpected error loading FirebaseApp instance.", (Throwable) e2);
            return null;
        }
    }

    /* renamed from: a */
    public boolean mo13883a() {
        try {
            return ((Boolean) this.f12599a.invoke(this.f12600b, new Object[0])).booleanValue();
        } catch (Exception e) {
            C4781c.m19229f().mo13788a("Fabric", "Cannot check isDataCollectionDefaultEnabled on FirebaseApp.", (Throwable) e);
            return false;
        }
    }
}
