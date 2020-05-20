package kotlinx.coroutines.p331d3;

import kotlinx.coroutines.C6161m0;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d3.k */
public final class C6061k extends C6059i {

    /* renamed from: h */
    public final Runnable f15147h;

    public C6061k(Runnable runnable, long j, C6060j jVar) {
        C5942k.m22327b(runnable, "block");
        C5942k.m22327b(jVar, "taskContext");
        super(j, jVar);
        this.f15147h = runnable;
    }

    public void run() {
        try {
            this.f15147h.run();
        } finally {
            this.f15146g.mo15803h();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        sb.append(C6161m0.m23157a((Object) this.f15147h));
        sb.append('@');
        sb.append(C6161m0.m23159b(this.f15147h));
        String str = ", ";
        sb.append(str);
        sb.append(this.f15145f);
        sb.append(str);
        sb.append(this.f15146g);
        sb.append(']');
        return sb.toString();
    }
}
