package p147g.p156d.p204b;

import java.io.IOException;
import java.io.StringWriter;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4553l;

/* renamed from: g.d.b.l */
public abstract class C4497l {
    /* renamed from: c */
    public C4494i mo13363c() {
        if (mo13366f()) {
            return (C4494i) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: d */
    public C4500o mo13364d() {
        if (mo13368h()) {
            return (C4500o) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public C4502q mo13365e() {
        if (mo13369i()) {
            return (C4502q) this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public boolean mo13366f() {
        return this instanceof C4494i;
    }

    /* renamed from: g */
    public boolean mo13367g() {
        return this instanceof C4499n;
    }

    /* renamed from: h */
    public boolean mo13368h() {
        return this instanceof C4500o;
    }

    /* renamed from: i */
    public boolean mo13369i() {
        return this instanceof C4502q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C4473c cVar = new C4473c(stringWriter);
            cVar.mo13314b(true);
            C4553l.m18449a(this, cVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
