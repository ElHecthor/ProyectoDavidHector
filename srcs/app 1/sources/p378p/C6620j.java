package p378p;

import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: p.j */
public class C6620j extends RuntimeException {

    /* renamed from: f */
    private final transient C6663t<?> f16265f;

    public C6620j(C6663t<?> tVar) {
        super(m24925a(tVar));
        tVar.mo17126b();
        tVar.mo17129e();
        this.f16265f = tVar;
    }

    /* renamed from: a */
    private static String m24925a(C6663t<?> tVar) {
        Objects.requireNonNull(tVar, "response == null");
        StringBuilder sb = new StringBuilder();
        sb.append("HTTP ");
        sb.append(tVar.mo17126b());
        sb.append(" ");
        sb.append(tVar.mo17129e());
        return sb.toString();
    }

    @Nullable
    /* renamed from: a */
    public C6663t<?> mo17088a() {
        return this.f16265f;
    }
}
