package p147g.p156d.p204b.p205a0;

import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import p147g.p156d.p204b.p207y.C4540f;
import p147g.p156d.p204b.p207y.p208n.C4568e;

/* renamed from: g.d.b.a0.a */
public class C4470a implements Closeable {

    /* renamed from: u */
    private static final char[] f11837u = ")]}'\n".toCharArray();

    /* renamed from: f */
    private final Reader f11838f;

    /* renamed from: g */
    private boolean f11839g = false;

    /* renamed from: h */
    private final char[] f11840h = new char[1024];

    /* renamed from: i */
    private int f11841i = 0;

    /* renamed from: j */
    private int f11842j = 0;

    /* renamed from: k */
    private int f11843k = 0;

    /* renamed from: l */
    private int f11844l = 0;

    /* renamed from: m */
    int f11845m = 0;

    /* renamed from: n */
    private long f11846n;

    /* renamed from: o */
    private int f11847o;

    /* renamed from: p */
    private String f11848p;

    /* renamed from: q */
    private int[] f11849q;

    /* renamed from: r */
    private int f11850r;

    /* renamed from: s */
    private String[] f11851s;

    /* renamed from: t */
    private int[] f11852t;

    /* renamed from: g.d.b.a0.a$a */
    static class C4471a extends C4540f {
        C4471a() {
        }

        /* renamed from: a */
        public void mo13309a(C4470a aVar) {
            int i;
            if (aVar instanceof C4568e) {
                ((C4568e) aVar).mo13479y();
                return;
            }
            int i2 = aVar.f11845m;
            if (i2 == 0) {
                i2 = aVar.mo13292f();
            }
            if (i2 == 13) {
                i = 9;
            } else if (i2 == 12) {
                i = 8;
            } else if (i2 == 14) {
                i = 10;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(aVar.mo13307w());
                sb.append(aVar.mo13298m());
                throw new IllegalStateException(sb.toString());
            }
            aVar.f11845m = i;
        }
    }

    static {
        C4540f.f11953a = new C4471a();
    }

    public C4470a(Reader reader) {
        int[] iArr = new int[32];
        this.f11849q = iArr;
        this.f11850r = 0;
        this.f11850r = 0 + 1;
        iArr[0] = 6;
        this.f11851s = new String[32];
        this.f11852t = new int[32];
        if (reader != null) {
            this.f11838f = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        mo13479y();
     */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m18208A() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f11841i
            int r4 = r3 + r2
            int r5 = r6.f11842j
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f11840h
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.mo13479y()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f11840h
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.m18215a(r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f11840h
            int r4 = r6.f11841i
            r1.append(r3, r4, r2)
            int r3 = r6.f11841i
            int r3 = r3 + r2
            r6.f11841i = r3
            r2 = 1
            boolean r2 = r6.m18215a(r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f11840h
            int r3 = r6.f11841i
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f11840h
            int r3 = r6.f11841i
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f11841i
            int r2 = r2 + r0
            r6.f11841i = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p205a0.C4470a.m18208A():java.lang.String");
    }

    /* renamed from: B */
    private int m18209B() {
        String str;
        String str2;
        int i;
        char c = this.f11840h[this.f11841i];
        if (c == 't' || c == 'T') {
            i = 5;
            str2 = "true";
            str = "TRUE";
        } else if (c == 'f' || c == 'F') {
            i = 6;
            str2 = "false";
            str = "FALSE";
        } else if (c != 'n' && c != 'N') {
            return 0;
        } else {
            i = 7;
            str2 = "null";
            str = "NULL";
        }
        int length = str2.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f11841i + i2 >= this.f11842j && !m18215a(i2 + 1)) {
                return 0;
            }
            char c2 = this.f11840h[this.f11841i + i2];
            if (c2 != str2.charAt(i2) && c2 != str.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f11841i + length < this.f11842j || m18215a(length + 1)) && m18214a(this.f11840h[this.f11841i + length])) {
            return 0;
        }
        this.f11841i += length;
        this.f11845m = i;
        return i;
    }

    /* renamed from: C */
    private int m18210C() {
        int i;
        char c;
        char[] cArr = this.f11840h;
        int i2 = this.f11841i;
        int i3 = this.f11842j;
        int i4 = 0;
        int i5 = 0;
        char c2 = 0;
        boolean z = true;
        long j = 0;
        boolean z2 = false;
        while (true) {
            if (i2 + i5 == i3) {
                if (i5 == cArr.length) {
                    return i4;
                }
                if (!m18215a(i5 + 1)) {
                    break;
                }
                i2 = this.f11841i;
                i3 = this.f11842j;
            }
            c = cArr[i2 + i5];
            if (c == '+') {
                i4 = 0;
                if (c2 != 5) {
                    return 0;
                }
            } else if (c == 'E' || c == 'e') {
                i4 = 0;
                if (c2 != 2 && c2 != 4) {
                    return 0;
                }
                c2 = 5;
                i5++;
            } else {
                if (c == '-') {
                    i4 = 0;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (c == '.') {
                    i4 = 0;
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                } else if (c >= '0' && c <= '9') {
                    if (c2 == 1 || c2 == 0) {
                        j = (long) (-(c - '0'));
                        i4 = 0;
                        c2 = 2;
                    } else {
                        if (c2 == 2) {
                            if (j == 0) {
                                return 0;
                            }
                            long j2 = (10 * j) - ((long) (c - '0'));
                            int i6 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                            z &= i6 > 0 || (i6 == 0 && j2 < j);
                            j = j2;
                        } else if (c2 == 3) {
                            i4 = 0;
                            c2 = 4;
                        } else if (c2 == 5 || c2 == 6) {
                            i4 = 0;
                            c2 = 7;
                        }
                        i4 = 0;
                    }
                }
                i5++;
            }
            c2 = 6;
            i5++;
        }
        if (m18214a(c)) {
            return 0;
        }
        if (c2 == 2 && z && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.f11846n = j;
            this.f11841i += i5;
            i = 15;
        } else if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        } else {
            this.f11847o = i5;
            i = 16;
        }
        this.f11845m = i;
        return i;
    }

    /* renamed from: D */
    private char m18211D() {
        int i;
        int i2;
        String str = "Unterminated escape sequence";
        if (this.f11841i != this.f11842j || m18215a(1)) {
            char[] cArr = this.f11840h;
            int i3 = this.f11841i;
            int i4 = i3 + 1;
            this.f11841i = i4;
            char c = cArr[i3];
            if (c == 10) {
                this.f11843k++;
                this.f11844l = i4;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    m18221d("Invalid escape sequence");
                    throw null;
                } else if (i4 + 4 <= this.f11842j || m18215a(4)) {
                    char c2 = 0;
                    int i5 = this.f11841i;
                    int i6 = i5 + 4;
                    while (i5 < i6) {
                        char c3 = this.f11840h[i5];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder sb = new StringBuilder();
                                sb.append("\\u");
                                sb.append(new String(this.f11840h, this.f11841i, 4));
                                throw new NumberFormatException(sb.toString());
                            } else {
                                i = c3 - 'A';
                            }
                            i2 = i + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (c4 + i2);
                        i5++;
                    }
                    this.f11841i += 4;
                    return c2;
                } else {
                    m18221d(str);
                    throw null;
                }
            }
            return c;
        }
        m18221d(str);
        throw null;
    }

    /* renamed from: E */
    private void m18212E() {
        char c;
        do {
            if (this.f11841i < this.f11842j || m18215a(1)) {
                char[] cArr = this.f11840h;
                int i = this.f11841i;
                int i2 = i + 1;
                this.f11841i = i2;
                c = cArr[i];
                if (c == 10) {
                    this.f11843k++;
                    this.f11844l = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0048, code lost:
        mo13479y();
     */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18213F() {
        /*
            r4 = this;
        L_0x0000:
            r0 = 0
        L_0x0001:
            int r1 = r4.f11841i
            int r2 = r1 + r0
            int r3 = r4.f11842j
            if (r2 >= r3) goto L_0x0051
            char[] r2 = r4.f11840h
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L_0x004b
            r2 = 10
            if (r1 == r2) goto L_0x004b
            r2 = 12
            if (r1 == r2) goto L_0x004b
            r2 = 13
            if (r1 == r2) goto L_0x004b
            r2 = 32
            if (r1 == r2) goto L_0x004b
            r2 = 35
            if (r1 == r2) goto L_0x0048
            r2 = 44
            if (r1 == r2) goto L_0x004b
            r2 = 47
            if (r1 == r2) goto L_0x0048
            r2 = 61
            if (r1 == r2) goto L_0x0048
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L_0x004b
            r2 = 58
            if (r1 == r2) goto L_0x004b
            r2 = 59
            if (r1 == r2) goto L_0x0048
            switch(r1) {
                case 91: goto L_0x004b;
                case 92: goto L_0x0048;
                case 93: goto L_0x004b;
                default: goto L_0x0045;
            }
        L_0x0045:
            int r0 = r0 + 1
            goto L_0x0001
        L_0x0048:
            r4.mo13479y()
        L_0x004b:
            int r1 = r4.f11841i
            int r1 = r1 + r0
            r4.f11841i = r1
            return
        L_0x0051:
            int r1 = r1 + r0
            r4.f11841i = r1
            r0 = 1
            boolean r0 = r4.m18215a(r0)
            if (r0 != 0) goto L_0x0000
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p205a0.C4470a.m18213F():void");
    }

    /* renamed from: a */
    private boolean m18214a(char c) {
        if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
            if (c != '#') {
                if (c != ',') {
                    if (!(c == '/' || c == '=')) {
                        if (!(c == '{' || c == '}' || c == ':')) {
                            if (c != ';') {
                                switch (c) {
                                    case '[':
                                    case ']':
                                        break;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        }
                    }
                }
            }
            mo13479y();
        }
        return false;
    }

    /* renamed from: a */
    private boolean m18215a(int i) {
        char[] cArr = this.f11840h;
        int i2 = this.f11844l;
        int i3 = this.f11841i;
        this.f11844l = i2 - i3;
        int i4 = this.f11842j;
        if (i4 != i3) {
            int i5 = i4 - i3;
            this.f11842j = i5;
            System.arraycopy(cArr, i3, cArr, 0, i5);
        } else {
            this.f11842j = 0;
        }
        this.f11841i = 0;
        do {
            Reader reader = this.f11838f;
            int i6 = this.f11842j;
            int read = reader.read(cArr, i6, cArr.length - i6);
            if (read == -1) {
                return false;
            }
            int i7 = this.f11842j + read;
            this.f11842j = i7;
            if (this.f11843k == 0) {
                int i8 = this.f11844l;
                if (i8 == 0 && i7 > 0 && cArr[0] == 65279) {
                    this.f11841i++;
                    this.f11844l = i8 + 1;
                    i++;
                }
            }
        } while (this.f11842j < i);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r1 != '/') goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        r7.f11841i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if (r4 != r2) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r7.f11841i = r4 - 1;
        r2 = m18215a(2);
        r7.f11841i++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r2 != false) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0069, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006a, code lost:
        mo13479y();
        r2 = r7.f11841i;
        r3 = r0[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        if (r3 == '*') goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0075, code lost:
        if (r3 == '/') goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        r7.f11841i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0080, code lost:
        r7.f11841i = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008a, code lost:
        if (m18220c("*/") == false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0091, code lost:
        m18221d("Unterminated comment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        r7.f11841i = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009c, code lost:
        if (r1 != '#') goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        mo13479y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m18216b(boolean r8) {
        /*
            r7 = this;
            char[] r0 = r7.f11840h
        L_0x0002:
            int r1 = r7.f11841i
        L_0x0004:
            int r2 = r7.f11842j
        L_0x0006:
            r3 = 1
            if (r1 != r2) goto L_0x0034
            r7.f11841i = r1
            boolean r1 = r7.m18215a(r3)
            if (r1 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0015
            r8 = -1
            return r8
        L_0x0015:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.mo13298m()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0030:
            int r1 = r7.f11841i
            int r2 = r7.f11842j
        L_0x0034:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L_0x0044
            int r1 = r7.f11843k
            int r1 = r1 + r3
            r7.f11843k = r1
            r7.f11844l = r4
            goto L_0x00a3
        L_0x0044:
            r5 = 32
            if (r1 == r5) goto L_0x00a3
            r5 = 13
            if (r1 == r5) goto L_0x00a3
            r5 = 9
            if (r1 != r5) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            r5 = 47
            if (r1 != r5) goto L_0x0098
            r7.f11841i = r4
            r6 = 2
            if (r4 != r2) goto L_0x006a
            int r4 = r4 + -1
            r7.f11841i = r4
            boolean r2 = r7.m18215a(r6)
            int r4 = r7.f11841i
            int r4 = r4 + r3
            r7.f11841i = r4
            if (r2 != 0) goto L_0x006a
            return r1
        L_0x006a:
            r7.mo13479y()
            int r2 = r7.f11841i
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L_0x0080
            if (r3 == r5) goto L_0x0078
            return r1
        L_0x0078:
            int r2 = r2 + 1
            r7.f11841i = r2
        L_0x007c:
            r7.m18212E()
            goto L_0x0002
        L_0x0080:
            int r2 = r2 + 1
            r7.f11841i = r2
            java.lang.String r1 = "*/"
            boolean r1 = r7.m18220c(r1)
            if (r1 == 0) goto L_0x0091
            int r1 = r7.f11841i
            int r1 = r1 + r6
            goto L_0x0004
        L_0x0091:
            java.lang.String r8 = "Unterminated comment"
            r7.m18221d(r8)
            r8 = 0
            throw r8
        L_0x0098:
            r2 = 35
            r7.f11841i = r4
            if (r1 != r2) goto L_0x00a2
            r7.mo13479y()
            goto L_0x007c
        L_0x00a2:
            return r1
        L_0x00a3:
            r1 = r4
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p205a0.C4470a.m18216b(boolean):int");
    }

    /* renamed from: b */
    private String m18217b(char c) {
        char[] cArr = this.f11840h;
        StringBuilder sb = null;
        while (true) {
            int i = this.f11841i;
            int i2 = this.f11842j;
            int i3 = i;
            while (true) {
                if (i < i2) {
                    int i4 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f11841i = i4;
                        int i5 = (i4 - i3) - 1;
                        if (sb == null) {
                            return new String(cArr, i3, i5);
                        }
                        sb.append(cArr, i3, i5);
                        return sb.toString();
                    } else if (c2 == '\\') {
                        this.f11841i = i4;
                        int i6 = (i4 - i3) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((i6 + 1) * 2, 16));
                        }
                        sb.append(cArr, i3, i6);
                        sb.append(m18211D());
                    } else {
                        if (c2 == 10) {
                            this.f11843k++;
                            this.f11844l = i4;
                        }
                        i = i4;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((i - i3) * 2, 16));
                    }
                    sb.append(cArr, i3, i - i3);
                    this.f11841i = i;
                    if (!m18215a(1)) {
                        m18221d("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m18218b(int i) {
        int i2 = this.f11850r;
        int[] iArr = this.f11849q;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[(i2 * 2)];
            int[] iArr3 = new int[(i2 * 2)];
            String[] strArr = new String[(i2 * 2)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f11852t, 0, iArr3, 0, this.f11850r);
            System.arraycopy(this.f11851s, 0, strArr, 0, this.f11850r);
            this.f11849q = iArr2;
            this.f11852t = iArr3;
            this.f11851s = strArr;
        }
        int[] iArr4 = this.f11849q;
        int i3 = this.f11850r;
        this.f11850r = i3 + 1;
        iArr4[i3] = i;
    }

    /* renamed from: c */
    private void m18219c(char c) {
        char[] cArr = this.f11840h;
        while (true) {
            int i = this.f11841i;
            int i2 = this.f11842j;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f11841i = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f11841i = i3;
                        m18211D();
                        break;
                    } else {
                        if (c2 == 10) {
                            this.f11843k++;
                            this.f11844l = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f11841i = i;
                    if (!m18215a(1)) {
                        m18221d("Unterminated string");
                        throw null;
                    }
                }
            }
        }
    }

    /* renamed from: c */
    private boolean m18220c(String str) {
        int length = str.length();
        while (true) {
            int i = 0;
            if (this.f11841i + length > this.f11842j && !m18215a(length)) {
                return false;
            }
            char[] cArr = this.f11840h;
            int i2 = this.f11841i;
            if (cArr[i2] == 10) {
                this.f11843k++;
                this.f11844l = i2 + 1;
            } else {
                while (i < length) {
                    if (this.f11840h[this.f11841i + i] == str.charAt(i)) {
                        i++;
                    }
                }
                return true;
            }
            this.f11841i++;
        }
    }

    /* renamed from: d */
    private IOException m18221d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(mo13298m());
        throw new C4474d(sb.toString());
    }

    /* renamed from: y */
    private void mo13479y() {
        if (!this.f11839g) {
            m18221d("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* renamed from: z */
    private void m18223z() {
        m18216b(true);
        int i = this.f11841i - 1;
        this.f11841i = i;
        char[] cArr = f11837u;
        if (i + cArr.length <= this.f11842j || m18215a(cArr.length)) {
            int i2 = 0;
            while (true) {
                char[] cArr2 = f11837u;
                if (i2 >= cArr2.length) {
                    this.f11841i += cArr2.length;
                    return;
                } else if (this.f11840h[this.f11841i + i2] == cArr2[i2]) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo13288a() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 3) {
            m18218b(1);
            this.f11852t[this.f11850r - 1] = 0;
            this.f11845m = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(mo13307w());
        sb.append(mo13298m());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo13289a(boolean z) {
        this.f11839g = z;
    }

    public void close() {
        this.f11845m = 0;
        this.f11849q[0] = 8;
        this.f11850r = 1;
        this.f11838f.close();
    }

    /* renamed from: d */
    public void mo13291d() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 1) {
            m18218b(3);
            this.f11845m = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(mo13307w());
        sb.append(mo13298m());
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x010c  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13292f() {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = r0.f11849q
            int r2 = r0.f11850r
            int r3 = r2 + -1
            r3 = r1[r3]
            r4 = 8
            r5 = 39
            r6 = 34
            r7 = 93
            r8 = 3
            r9 = 7
            r10 = 59
            r11 = 44
            r12 = 4
            r13 = 2
            r14 = 0
            r15 = 1
            if (r3 != r15) goto L_0x0023
            int r2 = r2 - r15
            r1[r2] = r13
            goto L_0x00a3
        L_0x0023:
            if (r3 != r13) goto L_0x003c
            int r1 = r0.m18216b(r15)
            if (r1 == r11) goto L_0x00a3
            if (r1 == r10) goto L_0x0038
            if (r1 != r7) goto L_0x0032
            r0.f11845m = r12
            return r12
        L_0x0032:
            java.lang.String r1 = "Unterminated array"
            r0.m18221d(r1)
            throw r14
        L_0x0038:
            r16.mo13479y()
            goto L_0x00a3
        L_0x003c:
            r13 = 5
            if (r3 == r8) goto L_0x0117
            if (r3 != r13) goto L_0x0043
            goto L_0x0117
        L_0x0043:
            if (r3 != r12) goto L_0x0077
            int r2 = r2 - r15
            r1[r2] = r13
            int r1 = r0.m18216b(r15)
            r2 = 58
            if (r1 == r2) goto L_0x00a3
            r2 = 61
            if (r1 != r2) goto L_0x0071
            r16.mo13479y()
            int r1 = r0.f11841i
            int r2 = r0.f11842j
            if (r1 < r2) goto L_0x0063
            boolean r1 = r0.m18215a(r15)
            if (r1 == 0) goto L_0x00a3
        L_0x0063:
            char[] r1 = r0.f11840h
            int r2 = r0.f11841i
            char r1 = r1[r2]
            r13 = 62
            if (r1 != r13) goto L_0x00a3
            int r2 = r2 + r15
            r0.f11841i = r2
            goto L_0x00a3
        L_0x0071:
            java.lang.String r1 = "Expected ':'"
            r0.m18221d(r1)
            throw r14
        L_0x0077:
            r1 = 6
            if (r3 != r1) goto L_0x0089
            boolean r1 = r0.f11839g
            if (r1 == 0) goto L_0x0081
            r16.m18223z()
        L_0x0081:
            int[] r1 = r0.f11849q
            int r2 = r0.f11850r
            int r2 = r2 - r15
            r1[r2] = r9
            goto L_0x00a3
        L_0x0089:
            if (r3 != r9) goto L_0x00a1
            r1 = 0
            int r1 = r0.m18216b(r1)
            r2 = -1
            if (r1 != r2) goto L_0x0098
            r1 = 17
        L_0x0095:
            r0.f11845m = r1
            return r1
        L_0x0098:
            r16.mo13479y()
            int r1 = r0.f11841i
            int r1 = r1 - r15
            r0.f11841i = r1
            goto L_0x00a3
        L_0x00a1:
            if (r3 == r4) goto L_0x010f
        L_0x00a3:
            int r1 = r0.m18216b(r15)
            if (r1 == r6) goto L_0x010c
            if (r1 == r5) goto L_0x0106
            if (r1 == r11) goto L_0x00ef
            if (r1 == r10) goto L_0x00ef
            r2 = 91
            if (r1 == r2) goto L_0x00ec
            if (r1 == r7) goto L_0x00e7
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x00e4
            int r1 = r0.f11841i
            int r1 = r1 - r15
            r0.f11841i = r1
            int r1 = r16.m18209B()
            if (r1 == 0) goto L_0x00c5
            return r1
        L_0x00c5:
            int r1 = r16.m18210C()
            if (r1 == 0) goto L_0x00cc
            return r1
        L_0x00cc:
            char[] r1 = r0.f11840h
            int r2 = r0.f11841i
            char r1 = r1[r2]
            boolean r1 = r0.m18214a(r1)
            if (r1 == 0) goto L_0x00de
            r16.mo13479y()
            r1 = 10
            goto L_0x0095
        L_0x00de:
            java.lang.String r1 = "Expected value"
            r0.m18221d(r1)
            throw r14
        L_0x00e4:
            r0.f11845m = r15
            return r15
        L_0x00e7:
            if (r3 != r15) goto L_0x00ef
            r0.f11845m = r12
            return r12
        L_0x00ec:
            r0.f11845m = r8
            return r8
        L_0x00ef:
            if (r3 == r15) goto L_0x00fb
            r1 = 2
            if (r3 != r1) goto L_0x00f5
            goto L_0x00fb
        L_0x00f5:
            java.lang.String r1 = "Unexpected value"
            r0.m18221d(r1)
            throw r14
        L_0x00fb:
            r16.mo13479y()
            int r1 = r0.f11841i
            int r1 = r1 - r15
            r0.f11841i = r1
            r0.f11845m = r9
            return r9
        L_0x0106:
            r16.mo13479y()
            r0.f11845m = r4
            return r4
        L_0x010c:
            r1 = 9
            goto L_0x0095
        L_0x010f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x0117:
            int[] r1 = r0.f11849q
            int r2 = r0.f11850r
            int r2 = r2 - r15
            r1[r2] = r12
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r13) goto L_0x0138
            int r2 = r0.m18216b(r15)
            if (r2 == r11) goto L_0x0138
            if (r2 == r10) goto L_0x0135
            if (r2 != r1) goto L_0x012f
        L_0x012c:
            r1 = 2
            goto L_0x0095
        L_0x012f:
            java.lang.String r1 = "Unterminated object"
            r0.m18221d(r1)
            throw r14
        L_0x0135:
            r16.mo13479y()
        L_0x0138:
            int r2 = r0.m18216b(r15)
            if (r2 == r6) goto L_0x0169
            if (r2 == r5) goto L_0x0162
            java.lang.String r4 = "Expected name"
            if (r2 == r1) goto L_0x015b
            r16.mo13479y()
            int r1 = r0.f11841i
            int r1 = r1 - r15
            r0.f11841i = r1
            char r1 = (char) r2
            boolean r1 = r0.m18214a(r1)
            if (r1 == 0) goto L_0x0157
            r1 = 14
            goto L_0x0095
        L_0x0157:
            r0.m18221d(r4)
            throw r14
        L_0x015b:
            if (r3 == r13) goto L_0x015e
            goto L_0x012c
        L_0x015e:
            r0.m18221d(r4)
            throw r14
        L_0x0162:
            r16.mo13479y()
            r1 = 12
            goto L_0x0095
        L_0x0169:
            r1 = 13
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p205a0.C4470a.mo13292f():int");
    }

    /* renamed from: g */
    public void mo13293g() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 4) {
            int i2 = this.f11850r - 1;
            this.f11850r = i2;
            int[] iArr = this.f11852t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f11845m = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_ARRAY but was ");
        sb.append(mo13307w());
        sb.append(mo13298m());
        throw new IllegalStateException(sb.toString());
    }

    public String getPath() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.f11850r;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f11849q[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.f11852t[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String[] strArr = this.f11851s;
                if (strArr[i2] != null) {
                    sb.append(strArr[i2]);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public void mo13295h() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 2) {
            int i2 = this.f11850r - 1;
            this.f11850r = i2;
            this.f11851s[i2] = null;
            int[] iArr = this.f11852t;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f11845m = 0;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected END_OBJECT but was ");
        sb.append(mo13307w());
        sb.append(mo13298m());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: i */
    public boolean mo13296i() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    /* renamed from: l */
    public final boolean mo13297l() {
        return this.f11839g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public String mo13298m() {
        int i = this.f11843k + 1;
        int i2 = (this.f11841i - this.f11844l) + 1;
        StringBuilder sb = new StringBuilder();
        sb.append(" at line ");
        sb.append(i);
        sb.append(" column ");
        sb.append(i2);
        sb.append(" path ");
        sb.append(getPath());
        return sb.toString();
    }

    /* renamed from: o */
    public boolean mo13299o() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 5) {
            this.f11845m = 0;
            int[] iArr = this.f11852t;
            int i2 = this.f11850r - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f11845m = 0;
            int[] iArr2 = this.f11852t;
            int i3 = this.f11850r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected a boolean but was ");
            sb.append(mo13307w());
            sb.append(mo13298m());
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: p */
    public double mo13300p() {
        String str;
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 15) {
            this.f11845m = 0;
            int[] iArr = this.f11852t;
            int i2 = this.f11850r - 1;
            iArr[i2] = iArr[i2] + 1;
            return (double) this.f11846n;
        }
        if (i == 16) {
            this.f11848p = new String(this.f11840h, this.f11841i, this.f11847o);
            this.f11841i += this.f11847o;
        } else {
            if (i == 8 || i == 9) {
                str = m18217b(i == 8 ? '\'' : '\"');
            } else if (i == 10) {
                str = m18208A();
            } else if (i != 11) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a double but was ");
                sb.append(mo13307w());
                sb.append(mo13298m());
                throw new IllegalStateException(sb.toString());
            }
            this.f11848p = str;
        }
        this.f11845m = 11;
        double parseDouble = Double.parseDouble(this.f11848p);
        if (this.f11839g || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f11848p = null;
            this.f11845m = 0;
            int[] iArr2 = this.f11852t;
            int i3 = this.f11850r - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("JSON forbids NaN and infinities: ");
        sb2.append(parseDouble);
        sb2.append(mo13298m());
        throw new C4474d(sb2.toString());
    }

    /* renamed from: q */
    public int mo13301q() {
        String b;
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        String str = "Expected an int but was ";
        if (i == 15) {
            long j = this.f11846n;
            int i2 = (int) j;
            if (j == ((long) i2)) {
                this.f11845m = 0;
                int[] iArr = this.f11852t;
                int i3 = this.f11850r - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.f11846n);
            sb.append(mo13298m());
            throw new NumberFormatException(sb.toString());
        }
        if (i == 16) {
            this.f11848p = new String(this.f11840h, this.f11841i, this.f11847o);
            this.f11841i += this.f11847o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                b = m18208A();
            } else {
                b = m18217b(i == 8 ? '\'' : '\"');
            }
            this.f11848p = b;
            try {
                int parseInt = Integer.parseInt(this.f11848p);
                this.f11845m = 0;
                int[] iArr2 = this.f11852t;
                int i4 = this.f11850r - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(mo13307w());
            sb2.append(mo13298m());
            throw new IllegalStateException(sb2.toString());
        }
        this.f11845m = 11;
        double parseDouble = Double.parseDouble(this.f11848p);
        int i5 = (int) parseDouble;
        if (((double) i5) == parseDouble) {
            this.f11848p = null;
            this.f11845m = 0;
            int[] iArr3 = this.f11852t;
            int i6 = this.f11850r - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(this.f11848p);
        sb3.append(mo13298m());
        throw new NumberFormatException(sb3.toString());
    }

    /* renamed from: s */
    public long mo13302s() {
        String b;
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 15) {
            this.f11845m = 0;
            int[] iArr = this.f11852t;
            int i2 = this.f11850r - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f11846n;
        }
        String str = "Expected a long but was ";
        if (i == 16) {
            this.f11848p = new String(this.f11840h, this.f11841i, this.f11847o);
            this.f11841i += this.f11847o;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                b = m18208A();
            } else {
                b = m18217b(i == 8 ? '\'' : '\"');
            }
            this.f11848p = b;
            try {
                long parseLong = Long.parseLong(this.f11848p);
                this.f11845m = 0;
                int[] iArr2 = this.f11852t;
                int i3 = this.f11850r - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(mo13307w());
            sb.append(mo13298m());
            throw new IllegalStateException(sb.toString());
        }
        this.f11845m = 11;
        double parseDouble = Double.parseDouble(this.f11848p);
        long j = (long) parseDouble;
        if (((double) j) == parseDouble) {
            this.f11848p = null;
            this.f11845m = 0;
            int[] iArr3 = this.f11852t;
            int i4 = this.f11850r - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.f11848p);
        sb2.append(mo13298m());
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: t */
    public String mo13303t() {
        String str;
        char c;
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 14) {
            str = m18208A();
        } else {
            if (i == 12) {
                c = '\'';
            } else if (i == 13) {
                c = '\"';
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a name but was ");
                sb.append(mo13307w());
                sb.append(mo13298m());
                throw new IllegalStateException(sb.toString());
            }
            str = m18217b(c);
        }
        this.f11845m = 0;
        this.f11851s[this.f11850r - 1] = str;
        return str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(mo13298m());
        return sb.toString();
    }

    /* renamed from: u */
    public void mo13305u() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 7) {
            this.f11845m = 0;
            int[] iArr = this.f11852t;
            int i2 = this.f11850r - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Expected null but was ");
        sb.append(mo13307w());
        sb.append(mo13298m());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: v */
    public String mo13306v() {
        String str;
        char c;
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        if (i == 10) {
            str = m18208A();
        } else {
            if (i == 8) {
                c = '\'';
            } else if (i == 9) {
                c = '\"';
            } else if (i == 11) {
                str = this.f11848p;
                this.f11848p = null;
            } else if (i == 15) {
                str = Long.toString(this.f11846n);
            } else if (i == 16) {
                str = new String(this.f11840h, this.f11841i, this.f11847o);
                this.f11841i += this.f11847o;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected a string but was ");
                sb.append(mo13307w());
                sb.append(mo13298m());
                throw new IllegalStateException(sb.toString());
            }
            str = m18217b(c);
        }
        this.f11845m = 0;
        int[] iArr = this.f11852t;
        int i2 = this.f11850r - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: w */
    public C4472b mo13307w() {
        int i = this.f11845m;
        if (i == 0) {
            i = mo13292f();
        }
        switch (i) {
            case 1:
                return C4472b.BEGIN_OBJECT;
            case 2:
                return C4472b.END_OBJECT;
            case 3:
                return C4472b.BEGIN_ARRAY;
            case 4:
                return C4472b.END_ARRAY;
            case 5:
            case 6:
                return C4472b.BOOLEAN;
            case 7:
                return C4472b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return C4472b.STRING;
            case 12:
            case 13:
            case 14:
                return C4472b.NAME;
            case 15:
            case 16:
                return C4472b.NUMBER;
            case 17:
                return C4472b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: x */
    public void mo13308x() {
        char c;
        int i = 0;
        do {
            int i2 = this.f11845m;
            if (i2 == 0) {
                i2 = mo13292f();
            }
            if (i2 == 3) {
                m18218b(1);
            } else if (i2 == 1) {
                m18218b(3);
            } else if (i2 == 4 || i2 == 2) {
                this.f11850r--;
                i--;
                this.f11845m = 0;
            } else if (i2 == 14 || i2 == 10) {
                m18213F();
                this.f11845m = 0;
            } else {
                if (i2 == 8 || i2 == 12) {
                    c = '\'';
                } else if (i2 == 9 || i2 == 13) {
                    c = '\"';
                } else {
                    if (i2 == 16) {
                        this.f11841i += this.f11847o;
                    }
                    this.f11845m = 0;
                }
                m18219c(c);
                this.f11845m = 0;
            }
            i++;
            this.f11845m = 0;
        } while (i != 0);
        int[] iArr = this.f11852t;
        int i3 = this.f11850r;
        int i4 = i3 - 1;
        iArr[i4] = iArr[i4] + 1;
        this.f11851s[i3 - 1] = "null";
    }
}
