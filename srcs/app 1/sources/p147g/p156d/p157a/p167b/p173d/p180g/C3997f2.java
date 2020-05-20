package p147g.p156d.p157a.p167b.p173d.p180g;

import android.util.Log;

/* renamed from: g.d.a.b.d.g.f2 */
final class C3997f2 extends C3927b2<Double> {
    C3997f2(C4030h2 h2Var, String str, Double d, boolean z) {
        super(h2Var, str, d, z, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final Double mo12106a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String a = super.mo12107a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 27 + String.valueOf(valueOf).length());
        sb.append("Invalid double value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
