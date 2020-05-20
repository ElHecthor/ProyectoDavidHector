package kotlinx.coroutines.p331d3;

import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d3.i */
public abstract class C6059i implements Runnable {

    /* renamed from: f */
    public long f15145f;

    /* renamed from: g */
    public C6060j f15146g;

    public C6059i() {
        this(0, C6058h.f15144g);
    }

    public C6059i(long j, C6060j jVar) {
        C5942k.m22327b(jVar, "taskContext");
        this.f15145f = j;
        this.f15146g = jVar;
    }

    /* renamed from: a */
    public final C6062l mo15806a() {
        return this.f15146g.mo15804m();
    }
}
