package p147g.p156d.p204b.p207y.p208n;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import p147g.p156d.p204b.C4494i;
import p147g.p156d.p204b.C4497l;
import p147g.p156d.p204b.C4499n;
import p147g.p156d.p204b.C4500o;
import p147g.p156d.p204b.C4502q;
import p147g.p156d.p204b.p205a0.C4473c;

/* renamed from: g.d.b.y.n.f */
public final class C4570f extends C4473c {

    /* renamed from: t */
    private static final Writer f12000t = new C4571a();

    /* renamed from: u */
    private static final C4502q f12001u = new C4502q("closed");

    /* renamed from: q */
    private final List<C4497l> f12002q = new ArrayList();

    /* renamed from: r */
    private String f12003r;

    /* renamed from: s */
    private C4497l f12004s = C4499n.f11913a;

    /* renamed from: g.d.b.y.n.f$a */
    static class C4571a extends Writer {
        C4571a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C4570f() {
        super(f12000t);
    }

    /* renamed from: a */
    private void m18493a(C4497l lVar) {
        if (this.f12003r != null) {
            if (!lVar.mo13367g() || mo13326h()) {
                ((C4500o) m18494p()).mo13373a(this.f12003r, lVar);
            }
            this.f12003r = null;
        } else if (this.f12002q.isEmpty()) {
            this.f12004s = lVar;
        } else {
            C4497l p = m18494p();
            if (p instanceof C4494i) {
                ((C4494i) p).mo13358a(lVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    private C4497l m18494p() {
        List<C4497l> list = this.f12002q;
        return (C4497l) list.get(list.size() - 1);
    }

    /* renamed from: a */
    public C4473c mo13310a() {
        C4494i iVar = new C4494i();
        m18493a((C4497l) iVar);
        this.f12002q.add(iVar);
        return this;
    }

    /* renamed from: a */
    public C4473c mo13311a(Boolean bool) {
        if (bool == null) {
            mo13329m();
            return this;
        }
        m18493a((C4497l) new C4502q(bool));
        return this;
    }

    /* renamed from: a */
    public C4473c mo13312a(Number number) {
        if (number == null) {
            mo13329m();
            return this;
        }
        if (!mo13328l()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m18493a((C4497l) new C4502q(number));
        return this;
    }

    /* renamed from: c */
    public C4473c mo13315c(String str) {
        if (this.f12002q.isEmpty() || this.f12003r != null) {
            throw new IllegalStateException();
        } else if (m18494p() instanceof C4500o) {
            this.f12003r = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f12002q.isEmpty()) {
            this.f12002q.add(f12001u);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public C4473c mo13318d() {
        C4500o oVar = new C4500o();
        m18493a((C4497l) oVar);
        this.f12002q.add(oVar);
        return this;
    }

    /* renamed from: d */
    public C4473c mo13319d(long j) {
        m18493a((C4497l) new C4502q((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: d */
    public C4473c mo13320d(boolean z) {
        m18493a((C4497l) new C4502q(Boolean.valueOf(z)));
        return this;
    }

    /* renamed from: e */
    public C4473c mo13322e(String str) {
        if (str == null) {
            mo13329m();
            return this;
        }
        m18493a((C4497l) new C4502q(str));
        return this;
    }

    /* renamed from: f */
    public C4473c mo13323f() {
        if (this.f12002q.isEmpty() || this.f12003r != null) {
            throw new IllegalStateException();
        } else if (m18494p() instanceof C4494i) {
            List<C4497l> list = this.f12002q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void flush() {
    }

    /* renamed from: g */
    public C4473c mo13325g() {
        if (this.f12002q.isEmpty() || this.f12003r != null) {
            throw new IllegalStateException();
        } else if (m18494p() instanceof C4500o) {
            List<C4497l> list = this.f12002q;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: m */
    public C4473c mo13329m() {
        m18493a((C4497l) C4499n.f11913a);
        return this;
    }

    /* renamed from: o */
    public C4497l mo13482o() {
        if (this.f12002q.isEmpty()) {
            return this.f12004s;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected one JSON element but was ");
        sb.append(this.f12002q);
        throw new IllegalStateException(sb.toString());
    }
}
