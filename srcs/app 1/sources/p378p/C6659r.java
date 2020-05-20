package p378p;

import java.util.regex.Pattern;
import javax.annotation.Nullable;
import p337m.C6225a0;
import p337m.C6438q.C6439a;
import p337m.C6445s;
import p337m.C6445s.C6446a;
import p337m.C6448t;
import p337m.C6448t.C6449a;
import p337m.C6455v;
import p337m.C6457w;
import p337m.C6457w.C6458a;
import p337m.C6457w.C6460c;
import p337m.C6467z.C6468a;
import p350n.C6480e;
import p350n.C6483f;

/* renamed from: p.r */
final class C6659r {

    /* renamed from: l */
    private static final char[] f16345l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m */
    private static final Pattern f16346m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* renamed from: a */
    private final String f16347a;

    /* renamed from: b */
    private final C6448t f16348b;
    @Nullable

    /* renamed from: c */
    private String f16349c;
    @Nullable

    /* renamed from: d */
    private C6449a f16350d;

    /* renamed from: e */
    private final C6468a f16351e = new C6468a();

    /* renamed from: f */
    private final C6446a f16352f;
    @Nullable

    /* renamed from: g */
    private C6455v f16353g;

    /* renamed from: h */
    private final boolean f16354h;
    @Nullable

    /* renamed from: i */
    private C6458a f16355i;
    @Nullable

    /* renamed from: j */
    private C6439a f16356j;
    @Nullable

    /* renamed from: k */
    private C6225a0 f16357k;

    /* renamed from: p.r$a */
    private static class C6660a extends C6225a0 {

        /* renamed from: b */
        private final C6225a0 f16358b;

        /* renamed from: c */
        private final C6455v f16359c;

        C6660a(C6225a0 a0Var, C6455v vVar) {
            this.f16358b = a0Var;
            this.f16359c = vVar;
        }

        /* renamed from: a */
        public long mo16007a() {
            return this.f16358b.mo16007a();
        }

        /* renamed from: a */
        public void mo16008a(C6483f fVar) {
            this.f16358b.mo16008a(fVar);
        }

        /* renamed from: b */
        public C6455v mo16009b() {
            return this.f16359c;
        }
    }

    C6659r(String str, C6448t tVar, @Nullable String str2, @Nullable C6445s sVar, @Nullable C6455v vVar, boolean z, boolean z2, boolean z3) {
        this.f16347a = str;
        this.f16348b = tVar;
        this.f16349c = str2;
        this.f16353g = vVar;
        this.f16354h = z;
        this.f16352f = sVar != null ? sVar.mo16605c() : new C6446a();
        if (z2) {
            this.f16356j = new C6439a();
        } else if (z3) {
            C6458a aVar = new C6458a();
            this.f16355i = aVar;
            aVar.mo16675a(C6457w.f15983h);
        }
    }

    /* renamed from: a */
    private static String m25004a(String str, boolean z) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                C6480e eVar = new C6480e();
                eVar.mo16785a(str, 0, i);
                m25005a(eVar, str, i, length, z);
                return eVar.mo16826v();
            }
            i += Character.charCount(codePointAt);
        }
        return str;
    }

    /* renamed from: a */
    private static void m25005a(C6480e eVar, String str, int i, int i2, boolean z) {
        C6480e eVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || !(codePointAt == 9 || codePointAt == 10 || codePointAt == 12 || codePointAt == 13)) {
                if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                    if (eVar2 == null) {
                        eVar2 = new C6480e();
                    }
                    eVar2.mo16793c(codePointAt);
                    while (!eVar2.mo16809j()) {
                        byte readByte = eVar2.readByte() & 255;
                        eVar.writeByte(37);
                        eVar.writeByte((int) f16345l[(readByte >> 4) & 15]);
                        eVar.writeByte((int) f16345l[readByte & 15]);
                    }
                } else {
                    eVar.mo16793c(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C6468a mo17115a() {
        C6448t tVar;
        C6449a aVar = this.f16350d;
        if (aVar != null) {
            tVar = aVar.mo16644a();
        } else {
            tVar = this.f16348b.mo16623b(this.f16349c);
            if (tVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.f16348b);
                sb.append(", Relative: ");
                sb.append(this.f16349c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        C6225a0 a0Var = this.f16357k;
        if (a0Var == null) {
            C6439a aVar2 = this.f16356j;
            if (aVar2 != null) {
                a0Var = aVar2.mo16592a();
            } else {
                C6458a aVar3 = this.f16355i;
                if (aVar3 != null) {
                    a0Var = aVar3.mo16677a();
                } else if (this.f16354h) {
                    a0Var = C6225a0.m23319a((C6455v) null, new byte[0]);
                }
            }
        }
        C6455v vVar = this.f16353g;
        if (vVar != null) {
            if (a0Var != null) {
                a0Var = new C6660a(a0Var, vVar);
            } else {
                this.f16352f.mo16613a("Content-Type", vVar.toString());
            }
        }
        C6468a aVar4 = this.f16351e;
        aVar4.mo16764a(tVar);
        aVar4.mo16763a(this.f16352f.mo16614a());
        aVar4.mo16761a(this.f16347a, a0Var);
        return aVar4;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17116a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f16353g = C6455v.m24346a(str2);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed content type: ");
                sb.append(str2);
                throw new IllegalArgumentException(sb.toString(), e);
            }
        } else {
            this.f16352f.mo16613a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17117a(String str, String str2, boolean z) {
        if (z) {
            this.f16356j.mo16593b(str, str2);
        } else {
            this.f16356j.mo16591a(str, str2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17118a(C6225a0 a0Var) {
        this.f16357k = a0Var;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17119a(C6445s sVar, C6225a0 a0Var) {
        this.f16355i.mo16674a(sVar, a0Var);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo17120a(C6460c cVar) {
        this.f16355i.mo16676a(cVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo17121b(String str, String str2, boolean z) {
        if (this.f16349c != null) {
            String a = m25004a(str2, z);
            String str3 = this.f16349c;
            StringBuilder sb = new StringBuilder();
            sb.append("{");
            sb.append(str);
            sb.append("}");
            String replace = str3.replace(sb.toString(), a);
            if (!f16346m.matcher(replace).matches()) {
                this.f16349c = replace;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("@Path parameters shouldn't perform path traversal ('.' or '..'): ");
            sb2.append(str2);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo17122c(String str, @Nullable String str2, boolean z) {
        String str3 = this.f16349c;
        if (str3 != null) {
            C6449a a = this.f16348b.mo16621a(str3);
            this.f16350d = a;
            if (a != null) {
                this.f16349c = null;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Malformed URL. Base: ");
                sb.append(this.f16348b);
                sb.append(", Relative: ");
                sb.append(this.f16349c);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (z) {
            this.f16350d.mo16642a(str, str2);
        } else {
            this.f16350d.mo16647b(str, str2);
        }
    }
}
