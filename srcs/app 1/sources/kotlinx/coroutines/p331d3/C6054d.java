package kotlinx.coroutines.p331d3;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.C6012b0;
import kotlinx.coroutines.C6150j1;
import kotlinx.coroutines.C6165n0;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.d3.d */
public class C6054d extends C6150j1 {

    /* renamed from: f */
    private C6048a f15132f;

    /* renamed from: g */
    private final int f15133g;

    /* renamed from: h */
    private final int f15134h;

    /* renamed from: i */
    private final long f15135i;

    /* renamed from: j */
    private final String f15136j;

    public C6054d(int i, int i2, long j, String str) {
        C5942k.m22327b(str, "schedulerName");
        this.f15133g = i;
        this.f15134h = i2;
        this.f15135i = j;
        this.f15136j = str;
        this.f15132f = mo15796p();
    }

    public C6054d(int i, int i2, String str) {
        C5942k.m22327b(str, "schedulerName");
        this(i, i2, C6063m.f15155e, str);
    }

    public /* synthetic */ C6054d(int i, int i2, String str, int i3, C5938g gVar) {
        if ((i3 & 1) != 0) {
            i = C6063m.f15153c;
        }
        if ((i3 & 2) != 0) {
            i2 = C6063m.f15154d;
        }
        if ((i3 & 4) != 0) {
            str = "DefaultDispatcher";
        }
        this(i, i2, str);
    }

    /* renamed from: p */
    private final C6048a mo15796p() {
        C6048a aVar = new C6048a(this.f15133g, this.f15134h, this.f15135i, this.f15136j);
        return aVar;
    }

    /* renamed from: a */
    public final C6012b0 mo15797a(int i) {
        if (i > 0) {
            return new C6056f(this, i, C6062l.PROBABLY_BLOCKING);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected positive parallelism level, but have ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public final void mo15798a(Runnable runnable, C6060j jVar, boolean z) {
        C5942k.m22327b(runnable, "block");
        C5942k.m22327b(jVar, "context");
        try {
            this.f15132f.mo15774a(runnable, jVar, z);
        } catch (RejectedExecutionException unused) {
            C6165n0.f15278l.mo15823a((Runnable) this.f15132f.mo15773a(runnable, jVar));
        }
    }

    /* renamed from: a */
    public void mo15711a(C5871g gVar, Runnable runnable) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        try {
            C6048a.m22737a(this.f15132f, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            C6165n0.f15278l.mo15711a(gVar, runnable);
        }
    }

    /* renamed from: o */
    public Executor mo15799o() {
        return this.f15132f;
    }
}
