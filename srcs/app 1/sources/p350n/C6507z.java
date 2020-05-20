package p350n;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.z */
public class C6507z {

    /* renamed from: d */
    public static final C6507z f16142d = new C6508a();

    /* renamed from: a */
    private boolean f16143a;

    /* renamed from: b */
    private long f16144b;

    /* renamed from: c */
    private long f16145c;

    /* renamed from: n.z$a */
    public static final class C6508a extends C6507z {
        C6508a() {
        }

        /* renamed from: a */
        public C6507z mo16881a(long j) {
            return this;
        }

        /* renamed from: a */
        public C6507z mo16882a(long j, TimeUnit timeUnit) {
            C5942k.m22327b(timeUnit, "unit");
            return this;
        }

        /* renamed from: e */
        public void mo16886e() {
        }
    }

    /* renamed from: n.z$b */
    public static final class C6509b {
        private C6509b() {
        }

        public /* synthetic */ C6509b(C5938g gVar) {
            this();
        }
    }

    static {
        new C6509b(null);
    }

    /* renamed from: a */
    public C6507z mo16880a() {
        this.f16143a = false;
        return this;
    }

    /* renamed from: a */
    public C6507z mo16881a(long j) {
        this.f16143a = true;
        this.f16144b = j;
        return this;
    }

    /* renamed from: a */
    public C6507z mo16882a(long j, TimeUnit timeUnit) {
        C5942k.m22327b(timeUnit, "unit");
        if (j >= 0) {
            this.f16145c = timeUnit.toNanos(j);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("timeout < 0: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: b */
    public C6507z mo16883b() {
        this.f16145c = 0;
        return this;
    }

    /* renamed from: c */
    public long mo16884c() {
        if (this.f16143a) {
            return this.f16144b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* renamed from: d */
    public boolean mo16885d() {
        return this.f16143a;
    }

    /* renamed from: e */
    public void mo16886e() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.f16143a && this.f16144b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: f */
    public long mo16887f() {
        return this.f16145c;
    }
}
