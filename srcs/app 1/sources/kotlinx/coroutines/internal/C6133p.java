package kotlinx.coroutines.internal;

import kotlinx.coroutines.C5959a1;
import kotlinx.coroutines.C6087f2;
import kotlinx.coroutines.C6184r0;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.p */
final class C6133p extends C6087f2 implements C6184r0 {

    /* renamed from: f */
    private final Throwable f15241f;

    /* renamed from: g */
    private final String f15242g;

    public C6133p(Throwable th, String str) {
        this.f15241f = th;
        this.f15242g = str;
    }

    public /* synthetic */ C6133p(Throwable th, String str, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            str = null;
        }
        this(th, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        if (r1 != null) goto L_0x0028;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Void m23055o() {
        /*
            r4 = this;
            java.lang.Throwable r0 = r4.f15241f
            if (r0 == 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.append(r1)
            java.lang.String r1 = r4.f15242g
            if (r1 == 0) goto L_0x0026
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ". "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            if (r1 == 0) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.f15241f
            r1.<init>(r0, r2)
            throw r1
        L_0x0037:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android'"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C6133p.m23055o():java.lang.Void");
    }

    /* renamed from: a */
    public Void mo15711a(C5871g gVar, Runnable runnable) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        m23055o();
        throw null;
    }

    /* renamed from: a */
    public C5959a1 mo15710a(long j, Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        m23055o();
        throw null;
    }

    /* renamed from: b */
    public boolean mo15712b(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        m23055o();
        throw null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Main[missing");
        if (this.f15241f != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", cause=");
            sb2.append(this.f15241f);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(']');
        return sb.toString();
    }
}
