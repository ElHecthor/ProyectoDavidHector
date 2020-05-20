package p147g.p156d.p157a.p167b.p173d.p180g;

import android.util.Log;

/* renamed from: g.d.a.b.d.g.g2 */
final class C4014g2 extends C3927b2<Boolean> {
    C4014g2(C4030h2 h2Var, String str, Boolean bool, boolean z) {
        super(h2Var, str, bool, z, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo12106a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C4106m1.f11104c.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C4106m1.f11105d.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        String a = super.mo12107a();
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 28 + String.valueOf(valueOf).length());
        sb.append("Invalid boolean value for ");
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
