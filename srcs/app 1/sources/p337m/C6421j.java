package p337m;

import java.util.concurrent.TimeUnit;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.p340d.C6262d;
import p337m.p338f0.p341e.C6282h;

/* renamed from: m.j */
public final class C6421j {

    /* renamed from: a */
    private final C6282h f15899a;

    public C6421j() {
        this(5, 5, TimeUnit.MINUTES);
    }

    public C6421j(int i, long j, TimeUnit timeUnit) {
        C5942k.m22327b(timeUnit, "timeUnit");
        C6282h hVar = new C6282h(C6262d.f15453h, i, j, timeUnit);
        this(hVar);
    }

    public C6421j(C6282h hVar) {
        C5942k.m22327b(hVar, "delegate");
        this.f15899a = hVar;
    }

    /* renamed from: a */
    public final C6282h mo16532a() {
        return this.f15899a;
    }
}
