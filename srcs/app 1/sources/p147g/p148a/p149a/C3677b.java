package p147g.p148a.p149a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: g.a.a.b */
public class C3677b {

    /* renamed from: a */
    static final Map<String, C3679d> f10375a = new HashMap();

    /* renamed from: a */
    public static C3679d m14947a() {
        return m14948a(null);
    }

    /* renamed from: a */
    public static synchronized C3679d m14948a(String str) {
        C3679d dVar;
        synchronized (C3677b.class) {
            String b = C3700n.m15139b(str);
            dVar = (C3679d) f10375a.get(b);
            if (dVar == null) {
                dVar = new C3679d(b);
                f10375a.put(b, dVar);
            }
        }
        return dVar;
    }
}
