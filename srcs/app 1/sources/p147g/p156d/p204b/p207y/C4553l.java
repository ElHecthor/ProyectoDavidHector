package p147g.p156d.p204b.p207y;

import java.io.Writer;
import p147g.p156d.p204b.C4497l;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.p208n.C4589n;

/* renamed from: g.d.b.y.l */
public final class C4553l {

    /* renamed from: g.d.b.y.l$a */
    private static final class C4554a extends Writer {

        /* renamed from: f */
        private final Appendable f11978f;

        /* renamed from: g */
        private final C4555a f11979g = new C4555a();

        /* renamed from: g.d.b.y.l$a$a */
        static class C4555a implements CharSequence {

            /* renamed from: f */
            char[] f11980f;

            C4555a() {
            }

            public char charAt(int i) {
                return this.f11980f[i];
            }

            public int length() {
                return this.f11980f.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f11980f, i, i2 - i);
            }
        }

        C4554a(Appendable appendable) {
            this.f11978f = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.f11978f.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            C4555a aVar = this.f11979g;
            aVar.f11980f = cArr;
            this.f11978f.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p147g.p156d.p204b.C4498m((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p147g.p156d.p204b.C4505t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p147g.p156d.p204b.C4499n.f11913a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p147g.p156d.p204b.C4505t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p147g.p156d.p204b.C4505t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' g.d.b.a0.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p147g.p156d.p204b.C4497l m18447a(p147g.p156d.p204b.p205a0.C4470a r2) {
        /*
            r2.mo13307w()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            g.d.b.v<g.d.b.l> r1 = p147g.p156d.p204b.p207y.p208n.C4589n.f12067X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo13284a(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            g.d.b.l r2 = (p147g.p156d.p204b.C4497l) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            g.d.b.t r0 = new g.d.b.t
            r0.<init>(r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            g.d.b.m r0 = new g.d.b.m
            r0.<init>(r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            g.d.b.t r0 = new g.d.b.t
            r0.<init>(r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            g.d.b.n r2 = p147g.p156d.p204b.C4499n.f11913a
            return r2
        L_0x002b:
            g.d.b.t r0 = new g.d.b.t
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p207y.C4553l.m18447a(g.d.b.a0.a):g.d.b.l");
    }

    /* renamed from: a */
    public static Writer m18448a(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C4554a(appendable);
    }

    /* renamed from: a */
    public static void m18449a(C4497l lVar, C4473c cVar) {
        C4589n.f12067X.mo13285a(cVar, lVar);
    }
}
