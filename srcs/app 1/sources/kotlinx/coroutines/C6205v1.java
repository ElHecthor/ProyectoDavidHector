package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.v1 */
public final class C6205v1 extends CancellationException implements C6219z<C6205v1> {

    /* renamed from: f */
    public final C6199u1 f15316f;

    public C6205v1(String str, Throwable th, C6199u1 u1Var) {
        C5942k.m22327b(str, "message");
        C5942k.m22327b(u1Var, "job");
        super(str);
        this.f15316f = u1Var;
        if (th != null) {
            initCause(th);
        }
    }

    /* renamed from: a */
    public C6205v1 m23263a() {
        if (!C6157l0.m23151c()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new C6205v1(message, this, this.f15316f);
        }
        C5942k.m22323a();
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r3.getCause(), (java.lang.Object) getCause()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r3 == r2) goto L_0x0031
            boolean r0 = r3 instanceof kotlinx.coroutines.C6205v1
            if (r0 == 0) goto L_0x002f
            kotlinx.coroutines.v1 r3 = (kotlinx.coroutines.C6205v1) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x002f
            kotlinx.coroutines.u1 r0 = r3.f15316f
            kotlinx.coroutines.u1 r1 = r2.f15316f
            boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r3, r0)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C6205v1.equals(java.lang.Object):boolean");
    }

    public Throwable fillInStackTrace() {
        if (!C6157l0.m23151c()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        C5942k.m22324a((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.f15316f.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        C5942k.m22323a();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.f15316f);
        return sb.toString();
    }
}
