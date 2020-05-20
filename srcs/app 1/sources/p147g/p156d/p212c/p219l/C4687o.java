package p147g.p156d.p212c.p219l;

import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4640g;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.l.o */
public final class C4687o implements C4640g {

    /* renamed from: a */
    private final C4682j f12277a = new C4682j();

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        if (aVar == C4633a.UPC_A) {
            return this.f12277a.mo13539a("0".concat(String.valueOf(str)), C4633a.EAN_13, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
