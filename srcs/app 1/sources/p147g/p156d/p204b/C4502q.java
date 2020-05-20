package p147g.p156d.p204b;

import java.math.BigInteger;
import p147g.p156d.p204b.p207y.C4517a;
import p147g.p156d.p204b.p207y.C4541g;

/* renamed from: g.d.b.q */
public final class C4502q extends C4497l {

    /* renamed from: b */
    private static final Class<?>[] f11915b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f11916a;

    public C4502q(Boolean bool) {
        mo13377a((Object) bool);
    }

    public C4502q(Number number) {
        mo13377a((Object) number);
    }

    public C4502q(String str) {
        mo13377a((Object) str);
    }

    /* renamed from: a */
    private static boolean m18343a(C4502q qVar) {
        Object obj = qVar.f11916a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    /* renamed from: b */
    private static boolean m18344b(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class cls = obj.getClass();
        for (Class<?> isAssignableFrom : f11915b) {
            if (isAssignableFrom.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13377a(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            C4517a.m18365a((obj instanceof Number) || m18344b(obj));
        }
        this.f11916a = obj;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C4502q.class != obj.getClass()) {
            return false;
        }
        C4502q qVar = (C4502q) obj;
        if (this.f11916a == null) {
            if (qVar.f11916a != null) {
                z = false;
            }
            return z;
        } else if (m18343a(this) && m18343a(qVar)) {
            if (mo13385q().longValue() != qVar.mo13385q().longValue()) {
                z = false;
            }
            return z;
        } else if (!(this.f11916a instanceof Number) || !(qVar.f11916a instanceof Number)) {
            return this.f11916a.equals(qVar.f11916a);
        } else {
            double doubleValue = mo13385q().doubleValue();
            double doubleValue2 = qVar.mo13385q().doubleValue();
            if (doubleValue != doubleValue2 && (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2))) {
                z = false;
            }
            return z;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f11916a == null) {
            return 31;
        }
        if (m18343a(this)) {
            doubleToLongBits = mo13385q().longValue();
        } else {
            Object obj = this.f11916a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo13385q().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: k */
    public boolean mo13380k() {
        return mo13387s() ? mo13381l().booleanValue() : Boolean.parseBoolean(mo13386r());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Boolean mo13381l() {
        return (Boolean) this.f11916a;
    }

    /* renamed from: m */
    public double mo13382m() {
        return mo13388t() ? mo13385q().doubleValue() : Double.parseDouble(mo13386r());
    }

    /* renamed from: o */
    public int mo13383o() {
        return mo13388t() ? mo13385q().intValue() : Integer.parseInt(mo13386r());
    }

    /* renamed from: p */
    public long mo13384p() {
        return mo13388t() ? mo13385q().longValue() : Long.parseLong(mo13386r());
    }

    /* renamed from: q */
    public Number mo13385q() {
        Object obj = this.f11916a;
        return obj instanceof String ? new C4541g((String) this.f11916a) : (Number) obj;
    }

    /* renamed from: r */
    public String mo13386r() {
        return mo13388t() ? mo13385q().toString() : mo13387s() ? mo13381l().toString() : (String) this.f11916a;
    }

    /* renamed from: s */
    public boolean mo13387s() {
        return this.f11916a instanceof Boolean;
    }

    /* renamed from: t */
    public boolean mo13388t() {
        return this.f11916a instanceof Number;
    }

    /* renamed from: u */
    public boolean mo13389u() {
        return this.f11916a instanceof String;
    }
}
