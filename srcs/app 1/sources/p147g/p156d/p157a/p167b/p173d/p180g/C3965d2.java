package p147g.p156d.p157a.p167b.p173d.p180g;

import android.util.Log;

/* renamed from: g.d.a.b.d.g.d2 */
final class C3965d2 extends C3927b2<Long> {
    C3965d2(C4030h2 h2Var, String str, Long l, boolean z) {
        super(h2Var, str, l, z, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Long mo12106a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo12107a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 25 + String.valueOf(valueOf).length());
        sb.append("Invalid long value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
