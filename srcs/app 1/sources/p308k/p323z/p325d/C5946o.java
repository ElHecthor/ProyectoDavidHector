package p308k.p323z.p325d;

import p308k.p311c0.C5738a;
import p308k.p311c0.C5742e;

/* renamed from: k.z.d.o */
public abstract class C5946o extends C5932c implements C5742e {
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof C5946o) {
            C5946o oVar = (C5946o) obj;
            if (!mo9885f().equals(oVar.mo9885f()) || !mo9884e().equals(oVar.mo9884e()) || !mo9886i().equals(oVar.mo9886i()) || !C5942k.m22326a(mo15608c(), oVar.mo15608c())) {
                z = false;
            }
            return z;
        } else if (obj instanceof C5742e) {
            return obj.equals(mo15606a());
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C5742e m22338h() {
        return (C5742e) super.mo15609h();
    }

    public int hashCode() {
        return (((mo9885f().hashCode() * 31) + mo9884e().hashCode()) * 31) + mo9886i().hashCode();
    }

    public String toString() {
        C5738a a = mo15606a();
        if (a != this) {
            return a.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("property ");
        sb.append(mo9884e());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
