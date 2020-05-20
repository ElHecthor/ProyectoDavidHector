package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6139v;

/* renamed from: kotlinx.coroutines.c2 */
public final class C6041c2 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6139v f15091a = new C6139v("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6040c1 f15092b = new C6040c1(false);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C6040c1 f15093c = new C6040c1(true);

    /* renamed from: a */
    public static final Object m22705a(Object obj) {
        return obj instanceof C6174p1 ? new C6179q1((C6174p1) obj) : obj;
    }

    /* renamed from: b */
    public static final Object m22707b(Object obj) {
        C6179q1 q1Var = (C6179q1) (!(obj instanceof C6179q1) ? null : obj);
        if (q1Var == null) {
            return obj;
        }
        C6174p1 p1Var = q1Var.f15290a;
        return p1Var != null ? p1Var : obj;
    }
}
