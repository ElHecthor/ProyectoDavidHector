package p308k.p310b0;

import p308k.p323z.p325d.C5942k;

/* renamed from: k.b0.f */
class C5735f {
    /* renamed from: a */
    public static final void m21865a(boolean z, Number number) {
        C5942k.m22327b(number, "step");
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Step must be positive, was: ");
            sb.append(number);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
