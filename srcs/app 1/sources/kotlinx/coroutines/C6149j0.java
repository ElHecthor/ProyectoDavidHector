package kotlinx.coroutines;

import kotlinx.coroutines.p330c3.C6042a;
import kotlinx.coroutines.p330c3.C6043b;
import p308k.C5801k;
import p308k.p316w.C5866d;
import p308k.p316w.C5870f;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.j0 */
public enum C6149j0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    /* renamed from: a */
    public final <R, T> void mo15937a(C5922p<? super R, ? super C5866d<? super T>, ? extends Object> pVar, R r, C5866d<? super T> dVar) {
        C5942k.m22327b(pVar, "block");
        C5942k.m22327b(dVar, "completion");
        int i = C6097i0.f15189b[ordinal()];
        if (i == 1) {
            C6042a.m22711a(pVar, r, dVar);
        } else if (i == 2) {
            C5870f.m22231a(pVar, r, dVar);
        } else if (i == 3) {
            C6043b.m22714a(pVar, r, dVar);
        } else if (i != 4) {
            throw new C5801k();
        }
    }

    /* renamed from: f */
    public final boolean mo15938f() {
        return this == LAZY;
    }
}
