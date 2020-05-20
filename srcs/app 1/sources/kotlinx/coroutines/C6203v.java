package kotlinx.coroutines;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.v */
final class C6203v {

    /* renamed from: a */
    public final Object f15312a;

    /* renamed from: b */
    public final Object f15313b;

    /* renamed from: c */
    public final C6099i2 f15314c;

    public C6203v(Object obj, Object obj2, C6099i2 i2Var) {
        C5942k.m22327b(i2Var, "token");
        this.f15312a = obj;
        this.f15313b = obj2;
        this.f15314c = i2Var;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedIdempotentResult[");
        sb.append(this.f15313b);
        sb.append(']');
        return sb.toString();
    }
}
