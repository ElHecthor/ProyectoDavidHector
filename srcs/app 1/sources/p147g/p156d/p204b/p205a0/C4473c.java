package p147g.p156d.p204b.p205a0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

/* renamed from: g.d.b.a0.c */
public class C4473c implements Closeable, Flushable {

    /* renamed from: o */
    private static final String[] f11864o = new String[128];

    /* renamed from: p */
    private static final String[] f11865p;

    /* renamed from: f */
    private final Writer f11866f;

    /* renamed from: g */
    private int[] f11867g = new int[32];

    /* renamed from: h */
    private int f11868h = 0;

    /* renamed from: i */
    private String f11869i;

    /* renamed from: j */
    private String f11870j;

    /* renamed from: k */
    private boolean f11871k;

    /* renamed from: l */
    private boolean f11872l;

    /* renamed from: m */
    private String f11873m;

    /* renamed from: n */
    private boolean f11874n;

    static {
        for (int i = 0; i <= 31; i++) {
            f11864o[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f11864o;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f11865p = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C4473c(Writer writer) {
        m18245a(6);
        this.f11870j = ":";
        this.f11874n = true;
        if (writer != null) {
            this.f11866f = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: a */
    private C4473c m18243a(int i, int i2, String str) {
        int s = m18251s();
        if (s != i2 && s != i) {
            throw new IllegalStateException("Nesting problem.");
        } else if (this.f11873m == null) {
            this.f11868h--;
            if (s == i2) {
                m18250q();
            }
            this.f11866f.write(str);
            return this;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Dangling name: ");
            sb.append(this.f11873m);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private C4473c m18244a(int i, String str) {
        m18249p();
        m18245a(i);
        this.f11866f.write(str);
        return this;
    }

    /* renamed from: a */
    private void m18245a(int i) {
        int i2 = this.f11868h;
        int[] iArr = this.f11867g;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f11867g = iArr2;
        }
        int[] iArr3 = this.f11867g;
        int i3 = this.f11868h;
        this.f11868h = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: b */
    private void m18246b(int i) {
        this.f11867g[this.f11868h - 1] = i;
    }

    /* renamed from: f */
    private void m18247f(String str) {
        String str2;
        String[] strArr = this.f11872l ? f11865p : f11864o;
        String str3 = "\"";
        this.f11866f.write(str3);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                this.f11866f.write(str, i, i2 - i);
            }
            this.f11866f.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.f11866f.write(str, i, length - i);
        }
        this.f11866f.write(str3);
    }

    /* renamed from: o */
    private void mo13482o() {
        int s = m18251s();
        if (s == 5) {
            this.f11866f.write(44);
        } else if (s != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m18250q();
        m18246b(4);
    }

    /* renamed from: p */
    private void m18249p() {
        int s = m18251s();
        if (s == 1) {
            m18246b(2);
        } else if (s == 2) {
            this.f11866f.append(',');
        } else if (s != 4) {
            if (s != 6) {
                if (s != 7) {
                    throw new IllegalStateException("Nesting problem.");
                } else if (!this.f11871k) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            m18246b(7);
            return;
        } else {
            this.f11866f.append(this.f11870j);
            m18246b(5);
            return;
        }
        m18250q();
    }

    /* renamed from: q */
    private void m18250q() {
        if (this.f11869i != null) {
            this.f11866f.write("\n");
            int i = this.f11868h;
            for (int i2 = 1; i2 < i; i2++) {
                this.f11866f.write(this.f11869i);
            }
        }
    }

    /* renamed from: s */
    private int m18251s() {
        int i = this.f11868h;
        if (i != 0) {
            return this.f11867g[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: t */
    private void m18252t() {
        if (this.f11873m != null) {
            mo13482o();
            m18247f(this.f11873m);
            this.f11873m = null;
        }
    }

    /* renamed from: a */
    public C4473c mo13310a() {
        m18252t();
        m18244a(1, "[");
        return this;
    }

    /* renamed from: a */
    public C4473c mo13311a(Boolean bool) {
        if (bool == null) {
            return mo13329m();
        }
        m18252t();
        m18249p();
        this.f11866f.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public C4473c mo13312a(Number number) {
        if (number == null) {
            return mo13329m();
        }
        m18252t();
        String obj = number.toString();
        if (this.f11871k || (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN"))) {
            m18249p();
            this.f11866f.append(obj);
            return this;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Numeric values must be finite, but was ");
        sb.append(number);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final void mo13313a(boolean z) {
        this.f11872l = z;
    }

    /* renamed from: b */
    public final void mo13314b(boolean z) {
        this.f11871k = z;
    }

    /* renamed from: c */
    public C4473c mo13315c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.f11873m != null) {
            throw new IllegalStateException();
        } else if (this.f11868h != 0) {
            this.f11873m = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    /* renamed from: c */
    public final void mo13316c(boolean z) {
        this.f11874n = z;
    }

    public void close() {
        this.f11866f.close();
        int i = this.f11868h;
        if (i > 1 || (i == 1 && this.f11867g[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f11868h = 0;
    }

    /* renamed from: d */
    public C4473c mo13318d() {
        m18252t();
        m18244a(3, "{");
        return this;
    }

    /* renamed from: d */
    public C4473c mo13319d(long j) {
        m18252t();
        m18249p();
        this.f11866f.write(Long.toString(j));
        return this;
    }

    /* renamed from: d */
    public C4473c mo13320d(boolean z) {
        m18252t();
        m18249p();
        this.f11866f.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: d */
    public final void mo13321d(String str) {
        String str2;
        if (str.length() == 0) {
            this.f11869i = null;
            str2 = ":";
        } else {
            this.f11869i = str;
            str2 = ": ";
        }
        this.f11870j = str2;
    }

    /* renamed from: e */
    public C4473c mo13322e(String str) {
        if (str == null) {
            return mo13329m();
        }
        m18252t();
        m18249p();
        m18247f(str);
        return this;
    }

    /* renamed from: f */
    public C4473c mo13323f() {
        m18243a(1, 2, "]");
        return this;
    }

    public void flush() {
        if (this.f11868h != 0) {
            this.f11866f.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public C4473c mo13325g() {
        m18243a(3, 5, "}");
        return this;
    }

    /* renamed from: h */
    public final boolean mo13326h() {
        return this.f11874n;
    }

    /* renamed from: i */
    public final boolean mo13327i() {
        return this.f11872l;
    }

    /* renamed from: l */
    public boolean mo13328l() {
        return this.f11871k;
    }

    /* renamed from: m */
    public C4473c mo13329m() {
        if (this.f11873m != null) {
            if (this.f11874n) {
                m18252t();
            } else {
                this.f11873m = null;
                return this;
            }
        }
        m18249p();
        this.f11866f.write("null");
        return this;
    }
}
