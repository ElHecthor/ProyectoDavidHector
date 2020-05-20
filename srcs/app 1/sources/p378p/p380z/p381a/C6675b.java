package p378p.p380z.p381a;

import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.p205a0.C4473c;
import p337m.C6225a0;
import p337m.C6455v;
import p350n.C6480e;
import p378p.C6614h;

/* renamed from: p.z.a.b */
final class C6675b<T> implements C6614h<T, C6225a0> {

    /* renamed from: c */
    private static final C6455v f16425c = C6455v.m24346a("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f16426d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C4485f f16427a;

    /* renamed from: b */
    private final C4509v<T> f16428b;

    C6675b(C4485f fVar, C4509v<T> vVar) {
        this.f16427a = fVar;
        this.f16428b = vVar;
    }

    /* renamed from: a */
    public C6225a0 m25079a(T t) {
        C6480e eVar = new C6480e();
        C4473c a = this.f16427a.mo13334a((Writer) new OutputStreamWriter(eVar.mo16813p(), f16426d));
        this.f16428b.mo13285a(a, t);
        a.close();
        return C6225a0.m23318a(f16425c, eVar.mo16821s());
    }
}
