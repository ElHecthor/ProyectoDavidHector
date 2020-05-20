package p337m.p338f0;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import p308k.C5809q;
import p308k.p310b0.C5732d;
import p308k.p313e0.C5769d;
import p308k.p313e0.C5772f;
import p308k.p314u.C5851y;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5952u;
import p337m.C6225a0;
import p337m.C6225a0.C6226a;
import p337m.C6232b0;
import p337m.C6236c0;
import p337m.C6236c0.C6238b;
import p337m.C6244e;
import p337m.C6434p;
import p337m.C6434p.C6437c;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6448t;
import p337m.C6455v;
import p337m.C6462x;
import p337m.p338f0.p344h.C6317c;
import p350n.C6483f;
import p350n.C6484g;
import p350n.C6485h;
import p350n.C6494p;
import p350n.C6506y;

/* renamed from: m.f0.b */
public final class C6250b {

    /* renamed from: a */
    public static final byte[] f15415a = new byte[0];

    /* renamed from: b */
    public static final C6445s f15416b = C6445s.f15950g.mo16619a(new String[0]);

    /* renamed from: c */
    public static final C6236c0 f15417c = C6238b.m23389a(C6236c0.f15373g, f15415a, null, 1, null);

    /* renamed from: d */
    private static final C6494p f15418d = C6494p.f16116i.mo16896a(C6485h.f16098j.mo16873a("efbbbf"), C6485h.f16098j.mo16873a("feff"), C6485h.f16098j.mo16873a("fffe"), C6485h.f16098j.mo16873a("0000ffff"), C6485h.f16098j.mo16873a("ffff0000"));

    /* renamed from: e */
    public static final TimeZone f15419e;

    /* renamed from: f */
    private static final C5772f f15420f = new C5772f("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    /* renamed from: g */
    public static final boolean f15421g = C6462x.class.desiredAssertionStatus();

    /* renamed from: h */
    public static final String f15422h;

    /* renamed from: m.f0.b$a */
    public static final class C6251a implements C6437c {

        /* renamed from: a */
        final /* synthetic */ C6434p f15423a;

        C6251a(C6434p pVar) {
            this.f15423a = pVar;
        }

        /* renamed from: a */
        public C6434p mo16100a(C6244e eVar) {
            C5942k.m22327b(eVar, "call");
            return this.f15423a;
        }
    }

    /* renamed from: m.f0.b$b */
    static final class C6252b implements ThreadFactory {

        /* renamed from: a */
        final /* synthetic */ String f15424a;

        /* renamed from: b */
        final /* synthetic */ boolean f15425b;

        C6252b(String str, boolean z) {
            this.f15424a = str;
            this.f15425b = z;
        }

        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f15424a);
            thread.setDaemon(this.f15425b);
            return thread;
        }
    }

    static {
        C6226a.m23326a(C6225a0.f15338a, f15415a, (C6455v) null, 0, 0, 7, (Object) null);
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        if (timeZone != null) {
            f15419e = timeZone;
            String name = C6462x.class.getName();
            C5942k.m22324a((Object) name, "OkHttpClient::class.java.name");
            f15422h = C5788q.m22017b(C5788q.m21993a(name, (CharSequence) "okhttp3."), "Client");
            return;
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: a */
    public static final int m23430a(byte b, int i) {
        return b & i;
    }

    /* renamed from: a */
    public static final int m23431a(char c) {
        if ('0' <= c && '9' >= c) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' > c || 'f' < c) {
            c2 = 'A';
            if ('A' > c || 'F' < c) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static final int m23432a(String str, char c, int i, int i2) {
        C5942k.m22327b(str, "$this$delimiterOffset");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static /* synthetic */ int m23433a(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return m23432a(str, c, i, i2);
    }

    /* renamed from: a */
    public static final int m23434a(String str, int i) {
        C5942k.m22327b(str, "$this$indexOfNonWhitespace");
        int length = str.length();
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                return i;
            }
            i++;
        }
        return str.length();
    }

    /* renamed from: a */
    public static final int m23435a(String str, int i, int i2) {
        C5942k.m22327b(str, "$this$indexOfFirstNonAsciiWhitespace");
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static /* synthetic */ int m23436a(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m23435a(str, i, i2);
    }

    /* renamed from: a */
    public static final int m23437a(String str, long j, TimeUnit timeUnit) {
        C5942k.m22327b(str, "name");
        boolean z = true;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis <= ((long) Integer.MAX_VALUE)) {
                    if (millis == 0 && i > 0) {
                        z = false;
                    }
                    if (z) {
                        return (int) millis;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(" too small.");
                    throw new IllegalArgumentException(sb.toString().toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString().toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" < 0");
        throw new IllegalStateException(sb3.toString().toString());
    }

    /* renamed from: a */
    public static final int m23438a(String str, String str2, int i, int i2) {
        C5942k.m22327b(str, "$this$delimiterOffset");
        C5942k.m22327b(str2, "delimiters");
        while (i < i2) {
            if (C5788q.m22006a((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static final int m23439a(C6484g gVar) {
        C5942k.m22327b(gVar, "$this$readMedium");
        return m23430a(gVar.readByte(), 255) | (m23430a(gVar.readByte(), 255) << 16) | (m23430a(gVar.readByte(), 255) << 8);
    }

    /* renamed from: a */
    public static final int m23440a(short s, int i) {
        return s & i;
    }

    /* renamed from: a */
    public static final int m23441a(String[] strArr, String str, Comparator<String> comparator) {
        C5942k.m22327b(strArr, "$this$indexOf");
        C5942k.m22327b(str, "value");
        C5942k.m22327b(comparator, "comparator");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static final long m23442a(int i, long j) {
        return ((long) i) & j;
    }

    /* renamed from: a */
    public static final long m23443a(String str, long j) {
        C5942k.m22327b(str, "$this$toLongOrDefault");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    /* renamed from: a */
    public static final long m23444a(C6232b0 b0Var) {
        C5942k.m22327b(b0Var, "$this$headersContentLength");
        String a = b0Var.mo16025l().mo16602a("Content-Length");
        if (a != null) {
            return m23443a(a, -1);
        }
        return -1;
    }

    /* renamed from: a */
    public static final String m23445a(int i) {
        String hexString = Integer.toHexString(i);
        C5942k.m22324a((Object) hexString, "Integer.toHexString(this)");
        return hexString;
    }

    /* renamed from: a */
    public static final String m23446a(String str, Object... objArr) {
        C5942k.m22327b(str, "format");
        C5942k.m22327b(objArr, "args");
        C5952u uVar = C5952u.f14949a;
        Locale locale = Locale.US;
        C5942k.m22324a((Object) locale, "Locale.US");
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
        C5942k.m22324a((Object) format, "java.lang.String.format(locale, format, *args)");
        return format;
    }

    /* renamed from: a */
    public static final String m23447a(C6448t tVar, boolean z) {
        String str;
        C5942k.m22327b(tVar, "$this$toHostHeader");
        if (C5788q.m22009a((CharSequence) tVar.mo16629g(), (CharSequence) ":", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(tVar.mo16629g());
            sb.append(']');
            str = sb.toString();
        } else {
            str = tVar.mo16629g();
        }
        if (!z && tVar.mo16634k() == C6448t.f15954l.mo16659a(tVar.mo16637n())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(':');
        sb2.append(tVar.mo16634k());
        return sb2.toString();
    }

    /* renamed from: a */
    public static /* synthetic */ String m23448a(C6448t tVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m23447a(tVar, z);
    }

    /* renamed from: a */
    public static final Charset m23449a(C6484g gVar, Charset charset) {
        Charset charset2;
        String str;
        C5942k.m22327b(gVar, "$this$readBomAsCharset");
        C5942k.m22327b(charset, "default");
        int a = gVar.mo16777a(f15418d);
        if (a == -1) {
            return charset;
        }
        if (a == 0) {
            charset2 = StandardCharsets.UTF_8;
            str = "UTF_8";
        } else if (a == 1) {
            charset2 = StandardCharsets.UTF_16BE;
            str = "UTF_16BE";
        } else if (a == 2) {
            charset2 = StandardCharsets.UTF_16LE;
            str = "UTF_16LE";
        } else if (a == 3) {
            return C5769d.f14837d.mo15399a();
        } else {
            if (a == 4) {
                return C5769d.f14837d.mo15400b();
            }
            throw new AssertionError();
        }
        C5942k.m22324a((Object) charset2, str);
        return charset2;
    }

    /* renamed from: a */
    public static final List<C6317c> m23450a(C6445s sVar) {
        C5942k.m22327b(sVar, "$this$toHeaderList");
        C5732d d = C5736g.m21875d(0, sVar.size());
        ArrayList arrayList = new ArrayList(C5838m.m22166a(d, 10));
        Iterator it = d.iterator();
        while (it.hasNext()) {
            int b = ((C5851y) it).mo15372b();
            arrayList.add(new C6317c(sVar.mo16604c(b), sVar.mo16606d(b)));
        }
        return arrayList;
    }

    @SafeVarargs
    /* renamed from: a */
    public static final <T> List<T> m23451a(T... tArr) {
        C5942k.m22327b(tArr, "elements");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> unmodifiableList = Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, objArr.length)));
        C5942k.m22324a((Object) unmodifiableList, "Collections.unmodifiable…sList(*elements.clone()))");
        return unmodifiableList;
    }

    /* renamed from: a */
    public static final <K, V> Map<K, V> m23452a(Map<K, ? extends V> map) {
        C5942k.m22327b(map, "$this$toImmutableMap");
        if (map.isEmpty()) {
            return C5823c0.m22073a();
        }
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        C5942k.m22324a((Object) unmodifiableMap, "Collections.unmodifiableMap(LinkedHashMap(this))");
        return unmodifiableMap;
    }

    /* renamed from: a */
    public static final ThreadFactory m23453a(String str, boolean z) {
        C5942k.m22327b(str, "name");
        return new C6252b(str, z);
    }

    /* renamed from: a */
    public static final C6437c m23454a(C6434p pVar) {
        C5942k.m22327b(pVar, "$this$asFactory");
        return new C6251a(pVar);
    }

    /* renamed from: a */
    public static final C6445s m23455a(List<C6317c> list) {
        C5942k.m22327b(list, "$this$toHeaders");
        C6446a aVar = new C6446a();
        for (C6317c cVar : list) {
            aVar.mo16617b(cVar.mo16275a().mo16870r(), cVar.mo16276b().mo16870r());
        }
        return aVar.mo16614a();
    }

    /* renamed from: a */
    public static final void m23456a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static final void m23457a(Closeable closeable) {
        C5942k.m22327b(closeable, "$this$closeQuietly");
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final void m23458a(Socket socket) {
        C5942k.m22327b(socket, "$this$closeQuietly");
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static final <E> void m23459a(List<E> list, E e) {
        C5942k.m22327b(list, "$this$addIfAbsent");
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    /* renamed from: a */
    public static final void m23460a(C6483f fVar, int i) {
        C5942k.m22327b(fVar, "$this$writeMedium");
        fVar.writeByte((i >>> 16) & 255);
        fVar.writeByte((i >>> 8) & 255);
        fVar.writeByte(i & 255);
    }

    /* renamed from: a */
    public static final boolean m23461a(String str) {
        C5942k.m22327b(str, "$this$canParseAsIpAddress");
        return f15420f.mo15405a(str);
    }

    /* renamed from: a */
    public static final boolean m23462a(Socket socket, C6484g gVar) {
        int soTimeout;
        C5942k.m22327b(socket, "$this$isHealthy");
        C5942k.m22327b(gVar, "source");
        try {
            soTimeout = socket.getSoTimeout();
            socket.setSoTimeout(1);
            boolean z = !gVar.mo16809j();
            socket.setSoTimeout(soTimeout);
            return z;
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        } catch (Throwable th) {
            socket.setSoTimeout(soTimeout);
            throw th;
        }
    }

    /* renamed from: a */
    public static final boolean m23463a(C6448t tVar, C6448t tVar2) {
        C5942k.m22327b(tVar, "$this$canReuseConnectionFor");
        C5942k.m22327b(tVar2, "other");
        return C5942k.m22326a((Object) tVar.mo16629g(), (Object) tVar2.mo16629g()) && tVar.mo16634k() == tVar2.mo16634k() && C5942k.m22326a((Object) tVar.mo16637n(), (Object) tVar2.mo16637n());
    }

    /* renamed from: a */
    public static final boolean m23464a(C6506y yVar, int i, TimeUnit timeUnit) {
        C5942k.m22327b(yVar, "$this$discard");
        C5942k.m22327b(timeUnit, "timeUnit");
        try {
            return m23472b(yVar, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m23465a(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C5942k.m22327b(strArr, "$this$hasIntersection");
        C5942k.m22327b(comparator, "comparator");
        if (!(strArr.length == 0) && strArr2 != null) {
            if (!(strArr2.length == 0)) {
                for (String str : strArr) {
                    for (String compare : strArr2) {
                        if (comparator.compare(str, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static final String[] m23466a(String[] strArr, String str) {
        C5942k.m22327b(strArr, "$this$concat");
        C5942k.m22327b(str, "value");
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length + 1);
        C5942k.m22324a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
        String[] strArr2 = (String[]) copyOf;
        strArr2[C5832h.m22120c(strArr2)] = str;
        if (strArr2 != null) {
            return strArr2;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Array<kotlin.String>");
    }

    /* renamed from: b */
    public static final int m23467b(String str) {
        C5942k.m22327b(str, "$this$indexOfControlOrNonAscii");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m23468b(String str, int i) {
        if (str != null) {
            try {
                long parseLong = Long.parseLong(str);
                int i2 = Integer.MAX_VALUE;
                if (parseLong <= ((long) Integer.MAX_VALUE)) {
                    i2 = parseLong < 0 ? 0 : (int) parseLong;
                }
                return i2;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: b */
    public static final int m23469b(String str, int i, int i2) {
        C5942k.m22327b(str, "$this$indexOfLastNonAsciiWhitespace");
        int i3 = i2 - 1;
        if (i3 >= i) {
            while (true) {
                char charAt = str.charAt(i3);
                if (charAt == 9 || charAt == 10 || charAt == 12 || charAt == 13 || charAt == ' ') {
                    if (i3 == i) {
                        break;
                    }
                    i3--;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public static /* synthetic */ int m23470b(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m23469b(str, i, i2);
    }

    /* renamed from: b */
    public static final <T> List<T> m23471b(List<? extends T> list) {
        C5942k.m22327b(list, "$this$toImmutableList");
        List<T> unmodifiableList = Collections.unmodifiableList(C5845t.m22180b((Collection<? extends T>) list));
        C5942k.m22324a((Object) unmodifiableList, "Collections.unmodifiableList(toMutableList())");
        return unmodifiableList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0051, code lost:
        if (r5 == Long.MAX_VALUE) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0053, code lost:
        r11.mo16270b().mo16880a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005b, code lost:
        r11.mo16270b().mo16881a(r0 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r5 != Long.MAX_VALUE) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        return r12;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m23472b(p350n.C6506y r11, int r12, java.util.concurrent.TimeUnit r13) {
        /*
            java.lang.String r0 = "$this$skipAll"
            p308k.p323z.p325d.C5942k.m22327b(r11, r0)
            java.lang.String r0 = "timeUnit"
            p308k.p323z.p325d.C5942k.m22327b(r13, r0)
            long r0 = java.lang.System.nanoTime()
            n.z r2 = r11.mo16270b()
            boolean r2 = r2.mo16885d()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L_0x0027
            n.z r2 = r11.mo16270b()
            long r5 = r2.mo16884c()
            long r5 = r5 - r0
            goto L_0x0028
        L_0x0027:
            r5 = r3
        L_0x0028:
            n.z r2 = r11.mo16270b()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.mo16881a(r12)
            n.e r12 = new n.e     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            r12.<init>()     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
        L_0x003e:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.mo16163b(r12, r7)     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L_0x004e
            r12.mo16797d()     // Catch:{ InterruptedIOException -> 0x0076, all -> 0x0064 }
            goto L_0x003e
        L_0x004e:
            r12 = 1
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
        L_0x0053:
            n.z r11 = r11.mo16270b()
            r11.mo16880a()
            goto L_0x007d
        L_0x005b:
            n.z r11 = r11.mo16270b()
            long r0 = r0 + r5
            r11.mo16881a(r0)
            goto L_0x007d
        L_0x0064:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            n.z r11 = r11.mo16270b()
            if (r13 != 0) goto L_0x0071
            r11.mo16880a()
            goto L_0x0075
        L_0x0071:
            long r0 = r0 + r5
            r11.mo16881a(r0)
        L_0x0075:
            throw r12
        L_0x0076:
            r12 = 0
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x005b
            goto L_0x0053
        L_0x007d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p337m.p338f0.C6250b.m23472b(n.y, int, java.util.concurrent.TimeUnit):boolean");
    }

    /* renamed from: b */
    public static final String[] m23473b(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        C5942k.m22327b(strArr, "$this$intersect");
        C5942k.m22327b(strArr2, "other");
        C5942k.m22327b(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new C5809q("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: c */
    public static final String m23474c(String str, int i, int i2) {
        C5942k.m22327b(str, "$this$trimSubstring");
        int a = m23435a(str, i, i2);
        String substring = str.substring(a, m23469b(str, a, i2));
        C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static /* synthetic */ String m23475c(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return m23474c(str, i, i2);
    }
}
