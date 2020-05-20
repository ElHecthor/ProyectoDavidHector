package p337m.p338f0.p340d;

import p308k.p323z.p325d.C5942k;

/* renamed from: m.f0.d.a */
public abstract class C6259a {

    /* renamed from: a */
    private C6261c f15443a;

    /* renamed from: b */
    private long f15444b;

    /* renamed from: c */
    private final String f15445c;

    /* renamed from: d */
    private final boolean f15446d;

    public C6259a(String str, boolean z) {
        C5942k.m22327b(str, "name");
        this.f15445c = str;
        this.f15446d = z;
        this.f15444b = -1;
    }

    public /* synthetic */ C6259a(String str, boolean z, int i, C5938g gVar) {
        if ((i & 2) != 0) {
            z = true;
        }
        this(str, z);
    }

    /* renamed from: a */
    public final void mo16106a(long j) {
        this.f15444b = j;
    }

    /* renamed from: a */
    public final void mo16107a(C6261c cVar) {
        C5942k.m22327b(cVar, "queue");
        C6261c cVar2 = this.f15443a;
        if (cVar2 != cVar) {
            if (cVar2 == null) {
                this.f15443a = cVar;
                return;
            }
            throw new IllegalStateException("task is in multiple queues".toString());
        }
    }

    /* renamed from: a */
    public final boolean mo16108a() {
        return this.f15446d;
    }

    /* renamed from: b */
    public final String mo16109b() {
        return this.f15445c;
    }

    /* renamed from: c */
    public final long mo16110c() {
        return this.f15444b;
    }

    /* renamed from: d */
    public final C6261c mo16111d() {
        return this.f15443a;
    }

    /* renamed from: e */
    public abstract long mo16112e();

    public String toString() {
        return this.f15445c;
    }
}
