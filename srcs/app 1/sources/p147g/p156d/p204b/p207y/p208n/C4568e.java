package p147g.p156d.p204b.p207y.p208n;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;
import p147g.p156d.p204b.C4494i;
import p147g.p156d.p204b.C4499n;
import p147g.p156d.p204b.C4500o;
import p147g.p156d.p204b.C4502q;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4472b;

/* renamed from: g.d.b.y.n.e */
public final class C4568e extends C4470a {

    /* renamed from: z */
    private static final Object f11995z = new Object();

    /* renamed from: v */
    private Object[] f11996v;

    /* renamed from: w */
    private int f11997w;

    /* renamed from: x */
    private String[] f11998x;

    /* renamed from: y */
    private int[] f11999y;

    /* renamed from: g.d.b.y.n.e$a */
    static class C4569a extends Reader {
        C4569a() {
        }

        public void close() {
            throw new AssertionError();
        }

        public int read(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    static {
        new C4569a();
    }

    /* renamed from: A */
    private Object m18473A() {
        Object[] objArr = this.f11996v;
        int i = this.f11997w - 1;
        this.f11997w = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: a */
    private void m18474a(C4472b bVar) {
        if (mo13307w() != bVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected ");
            sb.append(bVar);
            sb.append(" but was ");
            sb.append(mo13307w());
            sb.append(m18476m());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m18475a(Object obj) {
        int i = this.f11997w;
        Object[] objArr = this.f11996v;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[(i * 2)];
            int[] iArr = new int[(i * 2)];
            String[] strArr = new String[(i * 2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(this.f11999y, 0, iArr, 0, this.f11997w);
            System.arraycopy(this.f11998x, 0, strArr, 0, this.f11997w);
            this.f11996v = objArr2;
            this.f11999y = iArr;
            this.f11998x = strArr;
        }
        Object[] objArr3 = this.f11996v;
        int i2 = this.f11997w;
        this.f11997w = i2 + 1;
        objArr3[i2] = obj;
    }

    /* renamed from: m */
    private String m18476m() {
        StringBuilder sb = new StringBuilder();
        sb.append(" at path ");
        sb.append(getPath());
        return sb.toString();
    }

    /* renamed from: z */
    private Object m18477z() {
        return this.f11996v[this.f11997w - 1];
    }

    /* renamed from: a */
    public void mo13288a() {
        m18474a(C4472b.BEGIN_ARRAY);
        m18475a((Object) ((C4494i) m18477z()).iterator());
        this.f11999y[this.f11997w - 1] = 0;
    }

    public void close() {
        this.f11996v = new Object[]{f11995z};
        this.f11997w = 1;
    }

    /* renamed from: d */
    public void mo13291d() {
        m18474a(C4472b.BEGIN_OBJECT);
        m18475a((Object) ((C4500o) m18477z()).mo13376k().iterator());
    }

    /* renamed from: g */
    public void mo13293g() {
        m18474a(C4472b.END_ARRAY);
        m18473A();
        m18473A();
        int i = this.f11997w;
        if (i > 0) {
            int[] iArr = this.f11999y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = 0;
        while (i < this.f11997w) {
            Object[] objArr = this.f11996v;
            if (objArr[i] instanceof C4494i) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f11999y[i]);
                    sb.append(']');
                }
            } else if (objArr[i] instanceof C4500o) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String[] strArr = this.f11998x;
                    if (strArr[i] != null) {
                        sb.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: h */
    public void mo13295h() {
        m18474a(C4472b.END_OBJECT);
        m18473A();
        m18473A();
        int i = this.f11997w;
        if (i > 0) {
            int[] iArr = this.f11999y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: i */
    public boolean mo13296i() {
        C4472b w = mo13307w();
        return (w == C4472b.END_OBJECT || w == C4472b.END_ARRAY) ? false : true;
    }

    /* renamed from: o */
    public boolean mo13299o() {
        m18474a(C4472b.BOOLEAN);
        boolean k = ((C4502q) m18473A()).mo13380k();
        int i = this.f11997w;
        if (i > 0) {
            int[] iArr = this.f11999y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return k;
    }

    /* renamed from: p */
    public double mo13300p() {
        C4472b w = mo13307w();
        if (w == C4472b.NUMBER || w == C4472b.STRING) {
            double m = ((C4502q) m18477z()).mo13382m();
            if (mo13297l() || (!Double.isNaN(m) && !Double.isInfinite(m))) {
                m18473A();
                int i = this.f11997w;
                if (i > 0) {
                    int[] iArr = this.f11999y;
                    int i2 = i - 1;
                    iArr[i2] = iArr[i2] + 1;
                }
                return m;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("JSON forbids NaN and infinities: ");
            sb.append(m);
            throw new NumberFormatException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Expected ");
        sb2.append(C4472b.NUMBER);
        sb2.append(" but was ");
        sb2.append(w);
        sb2.append(m18476m());
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: q */
    public int mo13301q() {
        C4472b w = mo13307w();
        if (w == C4472b.NUMBER || w == C4472b.STRING) {
            int o = ((C4502q) m18477z()).mo13383o();
            m18473A();
            int i = this.f11997w;
            if (i > 0) {
                int[] iArr = this.f11999y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return o;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C4472b.NUMBER);
        sb.append(" but was ");
        sb.append(w);
        sb.append(m18476m());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: s */
    public long mo13302s() {
        C4472b w = mo13307w();
        if (w == C4472b.NUMBER || w == C4472b.STRING) {
            long p = ((C4502q) m18477z()).mo13384p();
            m18473A();
            int i = this.f11997w;
            if (i > 0) {
                int[] iArr = this.f11999y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return p;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C4472b.NUMBER);
        sb.append(" but was ");
        sb.append(w);
        sb.append(m18476m());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: t */
    public String mo13303t() {
        m18474a(C4472b.NAME);
        Entry entry = (Entry) ((Iterator) m18477z()).next();
        String str = (String) entry.getKey();
        this.f11998x[this.f11997w - 1] = str;
        m18475a(entry.getValue());
        return str;
    }

    public String toString() {
        return C4568e.class.getSimpleName();
    }

    /* renamed from: u */
    public void mo13305u() {
        m18474a(C4472b.NULL);
        m18473A();
        int i = this.f11997w;
        if (i > 0) {
            int[] iArr = this.f11999y;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    /* renamed from: v */
    public String mo13306v() {
        C4472b w = mo13307w();
        if (w == C4472b.STRING || w == C4472b.NUMBER) {
            String r = ((C4502q) m18473A()).mo13386r();
            int i = this.f11997w;
            if (i > 0) {
                int[] iArr = this.f11999y;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return r;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected ");
        sb.append(C4472b.STRING);
        sb.append(" but was ");
        sb.append(w);
        sb.append(m18476m());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: w */
    public C4472b mo13307w() {
        if (this.f11997w == 0) {
            return C4472b.END_DOCUMENT;
        }
        Object z = m18477z();
        if (z instanceof Iterator) {
            boolean z2 = this.f11996v[this.f11997w - 2] instanceof C4500o;
            Iterator it = (Iterator) z;
            if (!it.hasNext()) {
                return z2 ? C4472b.END_OBJECT : C4472b.END_ARRAY;
            } else if (z2) {
                return C4472b.NAME;
            } else {
                m18475a(it.next());
                return mo13307w();
            }
        } else if (z instanceof C4500o) {
            return C4472b.BEGIN_OBJECT;
        } else {
            if (z instanceof C4494i) {
                return C4472b.BEGIN_ARRAY;
            }
            if (z instanceof C4502q) {
                C4502q qVar = (C4502q) z;
                if (qVar.mo13389u()) {
                    return C4472b.STRING;
                }
                if (qVar.mo13387s()) {
                    return C4472b.BOOLEAN;
                }
                if (qVar.mo13388t()) {
                    return C4472b.NUMBER;
                }
                throw new AssertionError();
            } else if (z instanceof C4499n) {
                return C4472b.NULL;
            } else {
                if (z == f11995z) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    /* renamed from: x */
    public void mo13308x() {
        String str = "null";
        if (mo13307w() == C4472b.NAME) {
            mo13303t();
            this.f11998x[this.f11997w - 2] = str;
        } else {
            m18473A();
            int i = this.f11997w;
            if (i > 0) {
                this.f11998x[i - 1] = str;
            }
        }
        int i2 = this.f11997w;
        if (i2 > 0) {
            int[] iArr = this.f11999y;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: y */
    public void mo13479y() {
        m18474a(C4472b.NAME);
        Entry entry = (Entry) ((Iterator) m18477z()).next();
        m18475a(entry.getValue());
        m18475a((Object) new C4502q((String) entry.getKey()));
    }
}
