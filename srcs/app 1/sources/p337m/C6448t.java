package p337m;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p308k.C5809q;
import p308k.p310b0.C5729b;
import p308k.p313e0.C5772f;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6249a;
import p337m.p338f0.C6250b;
import p350n.C6480e;

/* renamed from: m.t */
public final class C6448t {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final char[] f15953k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: l */
    public static final C6451b f15954l = new C6451b(null);

    /* renamed from: a */
    private final boolean f15955a;

    /* renamed from: b */
    private final String f15956b;

    /* renamed from: c */
    private final String f15957c;

    /* renamed from: d */
    private final String f15958d;

    /* renamed from: e */
    private final String f15959e;

    /* renamed from: f */
    private final int f15960f;

    /* renamed from: g */
    private final List<String> f15961g;

    /* renamed from: h */
    private final List<String> f15962h;

    /* renamed from: i */
    private final String f15963i;

    /* renamed from: j */
    private final String f15964j;

    /* renamed from: m.t$a */
    public static final class C6449a {

        /* renamed from: i */
        public static final C6450a f15965i = new C6450a(null);

        /* renamed from: a */
        private String f15966a;

        /* renamed from: b */
        private String f15967b;

        /* renamed from: c */
        private String f15968c;

        /* renamed from: d */
        private String f15969d;

        /* renamed from: e */
        private int f15970e = -1;

        /* renamed from: f */
        private final List<String> f15971f;

        /* renamed from: g */
        private List<String> f15972g;

        /* renamed from: h */
        private String f15973h;

        /* renamed from: m.t$a$a */
        public static final class C6450a {
            private C6450a() {
            }

            public /* synthetic */ C6450a(C5938g gVar) {
                this();
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public final int m24319a(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(C6451b.m24327a(C6448t.f15954l, str, i, i2, "", false, false, false, false, null, 248, null));
                    if (1 <= parseInt && 65535 >= parseInt) {
                        return parseInt;
                    }
                    return -1;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public final int m24321b(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == ':') {
                        return i;
                    }
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i >= i2) {
                                break;
                            }
                        } while (str.charAt(i) != ']');
                    }
                    i++;
                }
                return i2;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public final int m24323c(String str, int i, int i2) {
                int i3 = -1;
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                    while (true) {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                        char charAt2 = str.charAt(i);
                        if (('a' > charAt2 || 'z' < charAt2) && (('A' > charAt2 || 'Z' < charAt2) && (('0' > charAt2 || '9' < charAt2) && charAt2 != '+' && charAt2 != '-' && charAt2 != '.'))) {
                            if (charAt2 == ':') {
                                i3 = i;
                            }
                        }
                    }
                }
                return i3;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public final int m24325d(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }
        }

        public C6449a() {
            String str = "";
            this.f15967b = str;
            this.f15968c = str;
            ArrayList arrayList = new ArrayList();
            this.f15971f = arrayList;
            arrayList.add(str);
        }

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Regions count limit reached
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:89)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
            	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:695)
            	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
            	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0044 A[SYNTHETIC] */
        /* renamed from: a */
        private final void m24295a(java.lang.String r11, int r12, int r13) {
            /*
                r10 = this;
                if (r12 != r13) goto L_0x0003
                return
            L_0x0003:
                char r0 = r11.charAt(r12)
                r1 = 47
                java.lang.String r2 = ""
                r3 = 1
                if (r0 == r1) goto L_0x001e
                r1 = 92
                if (r0 != r1) goto L_0x0013
                goto L_0x001e
            L_0x0013:
                java.util.List<java.lang.String> r0 = r10.f15971f
                int r1 = r0.size()
                int r1 = r1 - r3
                r0.set(r1, r2)
                goto L_0x0029
            L_0x001e:
                java.util.List<java.lang.String> r0 = r10.f15971f
                r0.clear()
                java.util.List<java.lang.String> r0 = r10.f15971f
                r0.add(r2)
                goto L_0x0041
            L_0x0029:
                r6 = r12
                if (r6 >= r13) goto L_0x0044
                java.lang.String r12 = "/\\"
                int r12 = p337m.p338f0.C6250b.m23438a(r11, r12, r6, r13)
                if (r12 >= r13) goto L_0x0036
                r0 = 1
                goto L_0x0037
            L_0x0036:
                r0 = 0
            L_0x0037:
                r9 = 1
                r4 = r10
                r5 = r11
                r7 = r12
                r8 = r0
                r4.m24296a(r5, r6, r7, r8, r9)
                if (r0 == 0) goto L_0x0029
            L_0x0041:
                int r12 = r12 + 1
                goto L_0x0029
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6448t.C6449a.m24295a(java.lang.String, int, int):void");
        }

        /* renamed from: a */
        private final void m24296a(String str, int i, int i2, boolean z, boolean z2) {
            String a = C6451b.m24327a(C6448t.f15954l, str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, false, null, 240, null);
            if (!m24299k(a)) {
                if (m24300l(a)) {
                    m24298e();
                    return;
                }
                List<String> list = this.f15971f;
                if (((CharSequence) list.get(list.size() - 1)).length() == 0) {
                    List<String> list2 = this.f15971f;
                    list2.set(list2.size() - 1, a);
                } else {
                    this.f15971f.add(a);
                }
                if (z) {
                    this.f15971f.add("");
                }
            }
        }

        /* renamed from: d */
        private final int m24297d() {
            int i = this.f15970e;
            if (i != -1) {
                return i;
            }
            C6451b bVar = C6448t.f15954l;
            String str = this.f15966a;
            if (str != null) {
                return bVar.mo16659a(str);
            }
            C5942k.m22323a();
            throw null;
        }

        /* renamed from: e */
        private final void m24298e() {
            List<String> list = this.f15971f;
            String str = "";
            if (!(((String) list.remove(list.size() - 1)).length() == 0) || !(!this.f15971f.isEmpty())) {
                this.f15971f.add(str);
                return;
            }
            List<String> list2 = this.f15971f;
            list2.set(list2.size() - 1, str);
        }

        /* renamed from: k */
        private final boolean m24299k(String str) {
            return C5942k.m22326a((Object) str, (Object) ".") || C5787p.m21979b(str, "%2e", true);
        }

        /* renamed from: l */
        private final boolean m24300l(String str) {
            return C5942k.m22326a((Object) str, (Object) "..") || C5787p.m21979b(str, "%2e.", true) || C5787p.m21979b(str, ".%2e", true) || C5787p.m21979b(str, "%2e%2e", true);
        }

        /* renamed from: a */
        public final C6449a mo16640a(int i) {
            boolean z = true;
            if (1 > i || 65535 < i) {
                z = false;
            }
            if (z) {
                this.f15970e = i;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }

        /* renamed from: a */
        public final C6449a mo16641a(String str) {
            List<String> list;
            if (str != null) {
                String a = C6451b.m24327a(C6448t.f15954l, str, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                if (a != null) {
                    list = C6448t.f15954l.mo16665c(a);
                    this.f15972g = list;
                    return this;
                }
            }
            list = null;
            this.f15972g = list;
            return this;
        }

        /* renamed from: a */
        public final C6449a mo16642a(String str, String str2) {
            C5942k.m22327b(str, "encodedName");
            if (this.f15972g == null) {
                this.f15972g = new ArrayList();
            }
            List<String> list = this.f15972g;
            String str3 = null;
            if (list != null) {
                list.add(C6451b.m24327a(C6448t.f15954l, str, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
                List<String> list2 = this.f15972g;
                if (list2 != null) {
                    if (str2 != null) {
                        str3 = C6451b.m24327a(C6448t.f15954l, str2, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null);
                    }
                    list2.add(str3);
                    return this;
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        }

        /* renamed from: a */
        public final C6449a mo16643a(C6448t tVar, String str) {
            int i;
            int a;
            int i2;
            String str2;
            int i3;
            String str3;
            int i4;
            boolean z;
            boolean z2;
            String str4 = str;
            C5942k.m22327b(str4, "input");
            int a2 = C6250b.m23436a(str4, 0, 0, 3, null);
            int b = C6250b.m23470b(str4, a2, 0, 2, null);
            int c = f15965i.m24323c(str4, a2, b);
            String str5 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
            char c2 = 65535;
            if (c != -1) {
                if (C5787p.m21975a(str4, "https:", a2, true)) {
                    this.f15966a = "https";
                    a2 += 6;
                } else if (C5787p.m21975a(str4, "http:", a2, true)) {
                    this.f15966a = "http";
                    a2 += 5;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected URL scheme 'http' or 'https' but was '");
                    String substring = str4.substring(0, c);
                    C5942k.m22324a((Object) substring, str5);
                    sb.append(substring);
                    sb.append("'");
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (tVar != null) {
                this.f15966a = tVar.mo16637n();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d = f15965i.m24325d(str4, a2, b);
            char c3 = '?';
            char c4 = '#';
            if (d >= 2 || tVar == null || (!C5942k.m22326a((Object) tVar.mo16637n(), (Object) this.f15966a))) {
                int i5 = a2 + d;
                boolean z3 = false;
                boolean z4 = false;
                while (true) {
                    a = C6250b.m23438a(str4, "@/\\?#", i5, b);
                    char charAt = a != b ? str4.charAt(a) : 65535;
                    if (charAt == c2 || charAt == c4 || charAt == '/' || charAt == '\\' || charAt == c3) {
                        int i6 = a;
                        String str6 = str5;
                        i = b;
                        int b2 = f15965i.m24321b(str4, i5, i6);
                        int i7 = b2 + 1;
                    } else {
                        if (charAt != '@') {
                            str3 = str5;
                            i3 = b;
                        } else {
                            String str7 = "%40";
                            if (!z3) {
                                int a3 = C6250b.m23432a(str4, ':', i5, a);
                                i4 = a;
                                String str8 = str7;
                                str3 = str5;
                                i3 = b;
                                String a4 = C6451b.m24327a(C6448t.f15954l, str, i5, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                if (z4) {
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(this.f15967b);
                                    sb2.append(str8);
                                    sb2.append(a4);
                                    a4 = sb2.toString();
                                }
                                this.f15967b = a4;
                                int i8 = a3;
                                if (i8 != i4) {
                                    this.f15968c = C6451b.m24327a(C6448t.f15954l, str, i8 + 1, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                                    z2 = true;
                                } else {
                                    z2 = z3;
                                }
                                z3 = z2;
                                z = true;
                            } else {
                                String str9 = str7;
                                i4 = a;
                                str3 = str5;
                                i3 = b;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(this.f15968c);
                                sb3.append(str9);
                                StringBuilder sb4 = sb3;
                                sb4.append(C6451b.m24327a(C6448t.f15954l, str, i5, i4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                                this.f15968c = sb4.toString();
                                z = z4;
                            }
                            i5 = i4 + 1;
                            z4 = z;
                        }
                        str5 = str3;
                        b = i3;
                        c4 = '#';
                        c3 = '?';
                        c2 = 65535;
                    }
                }
                int i62 = a;
                String str62 = str5;
                i = b;
                int b22 = f15965i.m24321b(str4, i5, i62);
                int i72 = b22 + 1;
                if (i72 < i62) {
                    i2 = i5;
                    this.f15969d = C6249a.m23429b(C6451b.m24328a(C6448t.f15954l, str, i5, b22, false, 4, null));
                    int a5 = f15965i.m24319a(str4, i72, i62);
                    this.f15970e = a5;
                    if (a5 != -1) {
                        str2 = str62;
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append("Invalid URL port: \"");
                        String substring2 = str4.substring(i72, i62);
                        C5942k.m22324a((Object) substring2, str62);
                        sb5.append(substring2);
                        sb5.append('\"');
                        throw new IllegalArgumentException(sb5.toString().toString());
                    }
                } else {
                    i2 = i5;
                    str2 = str62;
                    this.f15969d = C6249a.m23429b(C6451b.m24328a(C6448t.f15954l, str, i2, b22, false, 4, null));
                    C6451b bVar = C6448t.f15954l;
                    String str10 = this.f15966a;
                    if (str10 != null) {
                        this.f15970e = bVar.mo16659a(str10);
                    } else {
                        C5942k.m22323a();
                        throw null;
                    }
                }
                if (this.f15969d != null) {
                    a2 = i62;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("Invalid URL host: \"");
                    String substring3 = str4.substring(i2, b22);
                    C5942k.m22324a((Object) substring3, str2);
                    sb6.append(substring3);
                    sb6.append('\"');
                    throw new IllegalArgumentException(sb6.toString().toString());
                }
            } else {
                this.f15967b = tVar.mo16628f();
                this.f15968c = tVar.mo16622b();
                this.f15969d = tVar.mo16629g();
                this.f15970e = tVar.mo16634k();
                this.f15971f.clear();
                this.f15971f.addAll(tVar.mo16625d());
                if (a2 == b || str4.charAt(a2) == '#') {
                    mo16641a(tVar.mo16626e());
                }
                i = b;
            }
            int i9 = i;
            int a6 = C6250b.m23438a(str4, "?#", a2, i9);
            m24295a(str4, a2, a6);
            if (a6 < i9 && str4.charAt(a6) == '?') {
                int a7 = C6250b.m23432a(str4, '#', a6, i9);
                C6451b bVar2 = C6448t.f15954l;
                this.f15972g = bVar2.mo16665c(C6451b.m24327a(bVar2, str, a6 + 1, a7, " \"'<>#", true, false, true, false, null, 208, null));
                a6 = a7;
            }
            if (a6 < i9 && str4.charAt(a6) == '#') {
                this.f15973h = C6451b.m24327a(C6448t.f15954l, str, a6 + 1, i9, "", true, false, false, true, null, 176, null);
            }
            return this;
        }

        /* renamed from: a */
        public final C6448t mo16644a() {
            String str = this.f15966a;
            if (str != null) {
                String a = C6451b.m24328a(C6448t.f15954l, this.f15967b, 0, 0, false, 7, null);
                String a2 = C6451b.m24328a(C6448t.f15954l, this.f15968c, 0, 0, false, 7, null);
                String str2 = this.f15969d;
                if (str2 != null) {
                    int d = m24297d();
                    List a3 = C6451b.m24331a(C6448t.f15954l, (List) this.f15971f, false, 1, (Object) null);
                    if (a3 != null) {
                        List<String> list = this.f15972g;
                        List a4 = list != null ? C6448t.f15954l.m24329a(list, true) : null;
                        String str3 = this.f15973h;
                        C6448t tVar = new C6448t(str, a, a2, str2, d, a3, a4, str3 != null ? C6451b.m24328a(C6448t.f15954l, str3, 0, 0, false, 7, null) : null, toString());
                        return tVar;
                    }
                    throw new C5809q("null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* renamed from: b */
        public final List<String> mo16645b() {
            return this.f15971f;
        }

        /* renamed from: b */
        public final C6449a mo16646b(String str) {
            C5942k.m22327b(str, "host");
            String b = C6249a.m23429b(C6451b.m24328a(C6448t.f15954l, str, 0, 0, false, 7, null));
            if (b != null) {
                this.f15969d = b;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected host: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: b */
        public final C6449a mo16647b(String str, String str2) {
            C5942k.m22327b(str, "name");
            if (this.f15972g == null) {
                this.f15972g = new ArrayList();
            }
            List<String> list = this.f15972g;
            String str3 = null;
            if (list != null) {
                list.add(C6451b.m24327a(C6448t.f15954l, str, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
                List<String> list2 = this.f15972g;
                if (list2 != null) {
                    if (str2 != null) {
                        str3 = C6451b.m24327a(C6448t.f15954l, str2, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null);
                    }
                    list2.add(str3);
                    return this;
                }
                C5942k.m22323a();
                throw null;
            }
            C5942k.m22323a();
            throw null;
        }

        /* renamed from: b */
        public final void mo16648b(int i) {
            this.f15970e = i;
        }

        /* renamed from: c */
        public final C6449a mo16649c() {
            String str = this.f15969d;
            String str2 = null;
            this.f15969d = str != null ? new C5772f("[\"<>^`{|}]").mo15404a(str, "") : null;
            int size = this.f15971f.size();
            for (int i = 0; i < size; i++) {
                List<String> list = this.f15971f;
                list.set(i, C6451b.m24327a(C6448t.f15954l, (String) list.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            List<String> list2 = this.f15972g;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str3 = (String) list2.get(i2);
                    list2.set(i2, str3 != null ? C6451b.m24327a(C6448t.f15954l, str3, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null) : null);
                }
            }
            String str4 = this.f15973h;
            if (str4 != null) {
                str2 = C6451b.m24327a(C6448t.f15954l, str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.f15973h = str2;
            return this;
        }

        /* renamed from: c */
        public final C6449a mo16650c(String str) {
            C5942k.m22327b(str, "password");
            this.f15968c = C6451b.m24327a(C6448t.f15954l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* renamed from: d */
        public final C6449a mo16651d(String str) {
            C5942k.m22327b(str, "scheme");
            String str2 = "http";
            if (!C5787p.m21979b(str, str2, true)) {
                str2 = "https";
                if (!C5787p.m21979b(str, str2, true)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unexpected scheme: ");
                    sb.append(str);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.f15966a = str2;
            return this;
        }

        /* renamed from: e */
        public final void mo16652e(String str) {
            this.f15973h = str;
        }

        /* renamed from: f */
        public final void mo16653f(String str) {
            C5942k.m22327b(str, "<set-?>");
            this.f15968c = str;
        }

        /* renamed from: g */
        public final void mo16654g(String str) {
            C5942k.m22327b(str, "<set-?>");
            this.f15967b = str;
        }

        /* renamed from: h */
        public final void mo16655h(String str) {
            this.f15969d = str;
        }

        /* renamed from: i */
        public final void mo16656i(String str) {
            this.f15966a = str;
        }

        /* renamed from: j */
        public final C6449a mo16657j(String str) {
            C5942k.m22327b(str, "username");
            this.f15967b = C6451b.m24327a(C6448t.f15954l, str, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
            if ((r6.f15968c.length() > 0) != false) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
            if (r1 != r5.mo16659a(r3)) goto L_0x0098;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r6.f15966a
                if (r1 == 0) goto L_0x000f
                r0.append(r1)
                java.lang.String r1 = "://"
                goto L_0x0011
            L_0x000f:
                java.lang.String r1 = "//"
            L_0x0011:
                r0.append(r1)
                java.lang.String r1 = r6.f15967b
                int r1 = r1.length()
                r2 = 1
                r3 = 0
                if (r1 <= 0) goto L_0x0020
                r1 = 1
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                r4 = 58
                if (r1 != 0) goto L_0x0032
                java.lang.String r1 = r6.f15968c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x002f
                r1 = 1
                goto L_0x0030
            L_0x002f:
                r1 = 0
            L_0x0030:
                if (r1 == 0) goto L_0x0050
            L_0x0032:
                java.lang.String r1 = r6.f15967b
                r0.append(r1)
                java.lang.String r1 = r6.f15968c
                int r1 = r1.length()
                if (r1 <= 0) goto L_0x0040
                goto L_0x0041
            L_0x0040:
                r2 = 0
            L_0x0041:
                if (r2 == 0) goto L_0x004b
                r0.append(r4)
                java.lang.String r1 = r6.f15968c
                r0.append(r1)
            L_0x004b:
                r1 = 64
                r0.append(r1)
            L_0x0050:
                java.lang.String r1 = r6.f15969d
                r2 = 0
                if (r1 == 0) goto L_0x0078
                if (r1 == 0) goto L_0x0074
                r5 = 2
                boolean r1 = p308k.p313e0.C5788q.m22006a(r1, r4, r3, r5, r2)
                if (r1 == 0) goto L_0x006e
                r1 = 91
                r0.append(r1)
                java.lang.String r1 = r6.f15969d
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                goto L_0x0078
            L_0x006e:
                java.lang.String r1 = r6.f15969d
                r0.append(r1)
                goto L_0x0078
            L_0x0074:
                p308k.p323z.p325d.C5942k.m22323a()
                throw r2
            L_0x0078:
                int r1 = r6.f15970e
                r3 = -1
                if (r1 != r3) goto L_0x0081
                java.lang.String r1 = r6.f15966a
                if (r1 == 0) goto L_0x009e
            L_0x0081:
                int r1 = r6.m24297d()
                java.lang.String r3 = r6.f15966a
                if (r3 == 0) goto L_0x0098
                m.t$b r5 = p337m.C6448t.f15954l
                if (r3 == 0) goto L_0x0094
                int r3 = r5.mo16659a(r3)
                if (r1 == r3) goto L_0x009e
                goto L_0x0098
            L_0x0094:
                p308k.p323z.p325d.C5942k.m22323a()
                throw r2
            L_0x0098:
                r0.append(r4)
                r0.append(r1)
            L_0x009e:
                m.t$b r1 = p337m.C6448t.f15954l
                java.util.List<java.lang.String> r3 = r6.f15971f
                r1.mo16662a(r3, r0)
                java.util.List<java.lang.String> r1 = r6.f15972g
                if (r1 == 0) goto L_0x00bc
                r1 = 63
                r0.append(r1)
                m.t$b r1 = p337m.C6448t.f15954l
                java.util.List<java.lang.String> r3 = r6.f15972g
                if (r3 == 0) goto L_0x00b8
                r1.mo16664b(r3, r0)
                goto L_0x00bc
            L_0x00b8:
                p308k.p323z.p325d.C5942k.m22323a()
                throw r2
            L_0x00bc:
                java.lang.String r1 = r6.f15973h
                if (r1 == 0) goto L_0x00ca
                r1 = 35
                r0.append(r1)
                java.lang.String r1 = r6.f15973h
                r0.append(r1)
            L_0x00ca:
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
                p308k.p323z.p325d.C5942k.m22324a(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6448t.C6449a.toString():java.lang.String");
        }
    }

    /* renamed from: m.t$b */
    public static final class C6451b {
        private C6451b() {
        }

        public /* synthetic */ C6451b(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ String m24327a(C6451b bVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3, Object obj) {
            int i4 = i3;
            return bVar.mo16660a(str, (i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? str.length() : i2, str2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? false : z2, (i4 & 32) != 0 ? false : z3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? null : charset);
        }

        /* renamed from: a */
        public static /* synthetic */ String m24328a(C6451b bVar, String str, int i, int i2, boolean z, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            return bVar.mo16661a(str, i, i2, z);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final List<String> m24329a(List<String> list, boolean z) {
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                arrayList.add(str != null ? m24328a(this, str, 0, 0, z, 3, null) : null);
            }
            List<String> unmodifiableList = Collections.unmodifiableList(arrayList);
            C5942k.m22324a((Object) unmodifiableList, "Collections.unmodifiableList(result)");
            return unmodifiableList;
        }

        /* renamed from: a */
        static /* synthetic */ List m24331a(C6451b bVar, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return bVar.m24329a(list, z);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0062, code lost:
            if (m24334a(r1, r5, r2) == false) goto L_0x006f;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void m24332a(p350n.C6480e r15, java.lang.String r16, int r17, int r18, java.lang.String r19, boolean r20, boolean r21, boolean r22, boolean r23, java.nio.charset.Charset r24) {
            /*
                r14 = this;
                r0 = r15
                r1 = r16
                r2 = r18
                r3 = r24
                r4 = 0
                r5 = r17
                r6 = r4
            L_0x000b:
                if (r5 >= r2) goto L_0x00c5
                if (r1 == 0) goto L_0x00bc
                int r7 = r1.codePointAt(r5)
                if (r20 == 0) goto L_0x002b
                r8 = 9
                if (r7 == r8) goto L_0x0026
                r8 = 10
                if (r7 == r8) goto L_0x0026
                r8 = 12
                if (r7 == r8) goto L_0x0026
                r8 = 13
                if (r7 == r8) goto L_0x0026
                goto L_0x002b
            L_0x0026:
                r8 = r14
                r12 = r19
                goto L_0x00b5
            L_0x002b:
                r8 = 43
                if (r7 != r8) goto L_0x003c
                if (r22 == 0) goto L_0x003c
                if (r20 == 0) goto L_0x0036
                java.lang.String r8 = "+"
                goto L_0x0038
            L_0x0036:
                java.lang.String r8 = "%2B"
            L_0x0038:
                r15.mo16784a(r8)
                goto L_0x0026
            L_0x003c:
                r8 = 32
                r9 = 37
                if (r7 < r8) goto L_0x006c
                r8 = 127(0x7f, float:1.78E-43)
                if (r7 == r8) goto L_0x006c
                r8 = 128(0x80, float:1.794E-43)
                if (r7 < r8) goto L_0x004c
                if (r23 == 0) goto L_0x006c
            L_0x004c:
                char r8 = (char) r7
                r10 = 0
                r11 = 2
                r12 = r19
                boolean r8 = p308k.p313e0.C5788q.m22006a(r12, r8, r10, r11, r4)
                if (r8 != 0) goto L_0x006a
                if (r7 != r9) goto L_0x0065
                if (r20 == 0) goto L_0x006a
                if (r21 == 0) goto L_0x0065
                r8 = r14
                boolean r10 = r14.m24334a(r1, r5, r2)
                if (r10 != 0) goto L_0x0066
                goto L_0x006f
            L_0x0065:
                r8 = r14
            L_0x0066:
                r15.mo16793c(r7)
                goto L_0x00b5
            L_0x006a:
                r8 = r14
                goto L_0x006f
            L_0x006c:
                r8 = r14
                r12 = r19
            L_0x006f:
                if (r6 != 0) goto L_0x0076
                n.e r6 = new n.e
                r6.<init>()
            L_0x0076:
                if (r3 == 0) goto L_0x008a
                java.nio.charset.Charset r10 = java.nio.charset.StandardCharsets.UTF_8
                boolean r10 = p308k.p323z.p325d.C5942k.m22326a(r3, r10)
                if (r10 == 0) goto L_0x0081
                goto L_0x008a
            L_0x0081:
                int r10 = java.lang.Character.charCount(r7)
                int r10 = r10 + r5
                r6.mo16786a(r1, r5, r10, r3)
                goto L_0x008d
            L_0x008a:
                r6.mo16793c(r7)
            L_0x008d:
                boolean r10 = r6.mo16809j()
                if (r10 != 0) goto L_0x00b5
                byte r10 = r6.readByte()
                r10 = r10 & 255(0xff, float:3.57E-43)
                r15.writeByte(r9)
                char[] r11 = p337m.C6448t.f15953k
                int r13 = r10 >> 4
                r13 = r13 & 15
                char r11 = r11[r13]
                r15.writeByte(r11)
                char[] r11 = p337m.C6448t.f15953k
                r10 = r10 & 15
                char r10 = r11[r10]
                r15.writeByte(r10)
                goto L_0x008d
            L_0x00b5:
                int r7 = java.lang.Character.charCount(r7)
                int r5 = r5 + r7
                goto L_0x000b
            L_0x00bc:
                r8 = r14
                k.q r0 = new k.q
                java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                r0.<init>(r1)
                throw r0
            L_0x00c5:
                r8 = r14
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p337m.C6448t.C6451b.m24332a(n.e, java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.nio.charset.Charset):void");
        }

        /* renamed from: a */
        private final void m24333a(C6480e eVar, String str, int i, int i2, boolean z) {
            while (i < i2) {
                if (str != null) {
                    int codePointAt = str.codePointAt(i);
                    if (codePointAt == 37) {
                        int i3 = i + 2;
                        if (i3 < i2) {
                            int a = C6250b.m23431a(str.charAt(i + 1));
                            int a2 = C6250b.m23431a(str.charAt(i3));
                            if (!(a == -1 || a2 == -1)) {
                                eVar.writeByte((a << 4) + a2);
                                i = Character.charCount(codePointAt) + i3;
                            }
                            eVar.mo16793c(codePointAt);
                            i += Character.charCount(codePointAt);
                        }
                    }
                    if (codePointAt == 43 && z) {
                        eVar.writeByte(32);
                        i++;
                    }
                    eVar.mo16793c(codePointAt);
                    i += Character.charCount(codePointAt);
                } else {
                    throw new C5809q("null cannot be cast to non-null type java.lang.String");
                }
            }
        }

        /* renamed from: a */
        private final boolean m24334a(String str, int i, int i2) {
            int i3 = i + 2;
            return i3 < i2 && str.charAt(i) == '%' && C6250b.m23431a(str.charAt(i + 1)) != -1 && C6250b.m23431a(str.charAt(i3)) != -1;
        }

        /* renamed from: a */
        public final int mo16659a(String str) {
            C5942k.m22327b(str, "scheme");
            int hashCode = str.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003 && str.equals("https")) {
                    return 443;
                }
            } else if (str.equals("http")) {
                return 80;
            }
            return -1;
        }

        /* renamed from: a */
        public final String mo16660a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
            String str3 = str;
            int i3 = i2;
            String str4 = str2;
            C5942k.m22327b(str, "$this$canonicalize");
            C5942k.m22327b(str4, "encodeSet");
            int i4 = i;
            while (i4 < i3) {
                int codePointAt = str.codePointAt(i4);
                if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || z4) && !C5788q.m22006a((CharSequence) str4, (char) codePointAt, false, 2, (Object) null))) {
                    if (codePointAt == 37) {
                        if (z) {
                            if (z2) {
                                if (!m24334a(str, i4, i3)) {
                                    C6480e eVar = new C6480e();
                                    int i5 = i;
                                    eVar.mo16785a(str, i, i4);
                                    m24332a(eVar, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return eVar.mo16826v();
                                }
                                if (codePointAt == 43 || !z3) {
                                    i4 += Character.charCount(codePointAt);
                                } else {
                                    C6480e eVar2 = new C6480e();
                                    int i52 = i;
                                    eVar2.mo16785a(str, i, i4);
                                    m24332a(eVar2, str, i4, i2, str2, z, z2, z3, z4, charset);
                                    return eVar2.mo16826v();
                                }
                            }
                        }
                    }
                    if (codePointAt == 43) {
                    }
                    i4 += Character.charCount(codePointAt);
                }
                C6480e eVar22 = new C6480e();
                int i522 = i;
                eVar22.mo16785a(str, i, i4);
                m24332a(eVar22, str, i4, i2, str2, z, z2, z3, z4, charset);
                return eVar22.mo16826v();
            }
            int i6 = i;
            String substring = str.substring(i, i2);
            C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: a */
        public final String mo16661a(String str, int i, int i2, boolean z) {
            C5942k.m22327b(str, "$this$percentDecode");
            for (int i3 = i; i3 < i2; i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '%' || (charAt == '+' && z)) {
                    C6480e eVar = new C6480e();
                    eVar.mo16785a(str, i, i3);
                    m24333a(eVar, str, i3, i2, z);
                    return eVar.mo16826v();
                }
            }
            String substring = str.substring(i, i2);
            C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        /* renamed from: a */
        public final void mo16662a(List<String> list, StringBuilder sb) {
            C5942k.m22327b(list, "$this$toPathString");
            C5942k.m22327b(sb, "out");
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append('/');
                sb.append((String) list.get(i));
            }
        }

        /* renamed from: b */
        public final C6448t mo16663b(String str) {
            C5942k.m22327b(str, "$this$toHttpUrl");
            C6449a aVar = new C6449a();
            aVar.mo16643a((C6448t) null, str);
            return aVar.mo16644a();
        }

        /* renamed from: b */
        public final void mo16664b(List<String> list, StringBuilder sb) {
            C5942k.m22327b(list, "$this$toQueryString");
            C5942k.m22327b(sb, "out");
            C5729b a = C5736g.m21870a((C5729b) C5736g.m21875d(0, list.size()), 2);
            int c = a.mo15363c();
            int d = a.mo15364d();
            int e = a.mo15365e();
            if (e >= 0) {
                if (c > d) {
                    return;
                }
            } else if (c < d) {
                return;
            }
            while (true) {
                String str = (String) list.get(c);
                String str2 = (String) list.get(c + 1);
                if (c > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (c != d) {
                    c += e;
                } else {
                    return;
                }
            }
        }

        /* renamed from: c */
        public final List<String> mo16665c(String str) {
            String str2;
            C5942k.m22327b(str, "$this$toQueryNamesAndValues");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                int a = C5788q.m21984a((CharSequence) str, '&', i, false, 4, (Object) null);
                if (a == -1) {
                    a = str.length();
                }
                int i2 = a;
                int a2 = C5788q.m21984a((CharSequence) str, '=', i, false, 4, (Object) null);
                String str3 = "(this as java.lang.Strin…ing(startIndex, endIndex)";
                if (a2 == -1 || a2 > i2) {
                    String substring = str.substring(i, i2);
                    C5942k.m22324a((Object) substring, str3);
                    arrayList.add(substring);
                    str2 = null;
                } else {
                    String substring2 = str.substring(i, a2);
                    C5942k.m22324a((Object) substring2, str3);
                    arrayList.add(substring2);
                    str2 = str.substring(a2 + 1, i2);
                    C5942k.m22324a((Object) str2, str3);
                }
                arrayList.add(str2);
                i = i2 + 1;
            }
            return arrayList;
        }
    }

    public C6448t(String str, String str2, String str3, String str4, int i, List<String> list, List<String> list2, String str5, String str6) {
        C5942k.m22327b(str, "scheme");
        C5942k.m22327b(str2, "username");
        C5942k.m22327b(str3, "password");
        C5942k.m22327b(str4, "host");
        C5942k.m22327b(list, "pathSegments");
        C5942k.m22327b(str6, "url");
        this.f15956b = str;
        this.f15957c = str2;
        this.f15958d = str3;
        this.f15959e = str4;
        this.f15960f = i;
        this.f15961g = list;
        this.f15962h = list2;
        this.f15963i = str5;
        this.f15964j = str6;
        this.f15955a = C5942k.m22326a((Object) str, (Object) "https");
    }

    /* renamed from: c */
    public static final C6448t m24276c(String str) {
        return f15954l.mo16663b(str);
    }

    /* renamed from: a */
    public final String mo16620a() {
        if (this.f15963i == null) {
            return null;
        }
        int a = C5788q.m21984a((CharSequence) this.f15964j, '#', 0, false, 6, (Object) null) + 1;
        String str = this.f15964j;
        if (str != null) {
            String substring = str.substring(a);
            C5942k.m22324a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            return substring;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    public final C6449a mo16621a(String str) {
        C5942k.m22327b(str, "link");
        try {
            C6449a aVar = new C6449a();
            aVar.mo16643a(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final String mo16622b() {
        if (this.f15958d.length() == 0) {
            return "";
        }
        int a = C5788q.m21984a((CharSequence) this.f15964j, ':', this.f15956b.length() + 3, false, 4, (Object) null) + 1;
        int a2 = C5788q.m21984a((CharSequence) this.f15964j, '@', 0, false, 6, (Object) null);
        String str = this.f15964j;
        if (str != null) {
            String substring = str.substring(a, a2);
            C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: b */
    public final C6448t mo16623b(String str) {
        C5942k.m22327b(str, "link");
        C6449a a = mo16621a(str);
        if (a != null) {
            return a.mo16644a();
        }
        return null;
    }

    /* renamed from: c */
    public final String mo16624c() {
        int a = C5788q.m21984a((CharSequence) this.f15964j, '/', this.f15956b.length() + 3, false, 4, (Object) null);
        String str = this.f15964j;
        int a2 = C6250b.m23438a(str, "?#", a, str.length());
        String str2 = this.f15964j;
        if (str2 != null) {
            String substring = str2.substring(a, a2);
            C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: d */
    public final List<String> mo16625d() {
        int a = C5788q.m21984a((CharSequence) this.f15964j, '/', this.f15956b.length() + 3, false, 4, (Object) null);
        String str = this.f15964j;
        int a2 = C6250b.m23438a(str, "?#", a, str.length());
        ArrayList arrayList = new ArrayList();
        while (a < a2) {
            int i = a + 1;
            int a3 = C6250b.m23432a(this.f15964j, '/', i, a2);
            String str2 = this.f15964j;
            if (str2 != null) {
                String substring = str2.substring(i, a3);
                C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(substring);
                a = a3;
            } else {
                throw new C5809q("null cannot be cast to non-null type java.lang.String");
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    public final String mo16626e() {
        if (this.f15962h == null) {
            return null;
        }
        int a = C5788q.m21984a((CharSequence) this.f15964j, '?', 0, false, 6, (Object) null) + 1;
        String str = this.f15964j;
        int a2 = C6250b.m23432a(str, '#', a, str.length());
        String str2 = this.f15964j;
        if (str2 != null) {
            String substring = str2.substring(a, a2);
            C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6448t) && C5942k.m22326a((Object) ((C6448t) obj).f15964j, (Object) this.f15964j);
    }

    /* renamed from: f */
    public final String mo16628f() {
        if (this.f15957c.length() == 0) {
            return "";
        }
        int length = this.f15956b.length() + 3;
        String str = this.f15964j;
        int a = C6250b.m23438a(str, ":@", length, str.length());
        String str2 = this.f15964j;
        if (str2 != null) {
            String substring = str2.substring(length, a);
            C5942k.m22324a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C5809q("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: g */
    public final String mo16629g() {
        return this.f15959e;
    }

    /* renamed from: h */
    public final boolean mo16630h() {
        return this.f15955a;
    }

    public int hashCode() {
        return this.f15964j.hashCode();
    }

    /* renamed from: i */
    public final C6449a mo16632i() {
        C6449a aVar = new C6449a();
        aVar.mo16656i(this.f15956b);
        aVar.mo16654g(mo16628f());
        aVar.mo16653f(mo16622b());
        aVar.mo16655h(this.f15959e);
        aVar.mo16648b(this.f15960f != f15954l.mo16659a(this.f15956b) ? this.f15960f : -1);
        aVar.mo16645b().clear();
        aVar.mo16645b().addAll(mo16625d());
        aVar.mo16641a(mo16626e());
        aVar.mo16652e(mo16620a());
        return aVar;
    }

    /* renamed from: j */
    public final List<String> mo16633j() {
        return this.f15961g;
    }

    /* renamed from: k */
    public final int mo16634k() {
        return this.f15960f;
    }

    /* renamed from: l */
    public final String mo16635l() {
        if (this.f15962h == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        f15954l.mo16664b(this.f15962h, sb);
        return sb.toString();
    }

    /* renamed from: m */
    public final String mo16636m() {
        C6449a a = mo16621a("/...");
        if (a != null) {
            String str = "";
            a.mo16657j(str);
            a.mo16650c(str);
            return a.mo16644a().toString();
        }
        C5942k.m22323a();
        throw null;
    }

    /* renamed from: n */
    public final String mo16637n() {
        return this.f15956b;
    }

    /* renamed from: o */
    public final URI mo16638o() {
        C6449a i = mo16632i();
        i.mo16649c();
        String aVar = i.toString();
        try {
            return new URI(aVar);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new C5772f("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").mo15404a(aVar, ""));
                C5942k.m22324a((Object) create, "URI.create(stripped)");
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public String toString() {
        return this.f15964j;
    }
}
