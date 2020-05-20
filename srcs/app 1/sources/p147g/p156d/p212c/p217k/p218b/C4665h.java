package p147g.p156d.p212c.p217k.p218b;

import java.nio.charset.StandardCharsets;
import p147g.p156d.p212c.C4634b;

/* renamed from: g.d.c.k.b.h */
final class C4665h {

    /* renamed from: a */
    private final String f12233a;

    /* renamed from: b */
    private C4669l f12234b;

    /* renamed from: c */
    private C4634b f12235c;

    /* renamed from: d */
    private C4634b f12236d;

    /* renamed from: e */
    private final StringBuilder f12237e;

    /* renamed from: f */
    int f12238f;

    /* renamed from: g */
    private int f12239g;

    /* renamed from: h */
    private C4668k f12240h;

    /* renamed from: i */
    private int f12241i;

    C4665h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        int i = 0;
        while (i < length) {
            char c = (char) (bytes[i] & 255);
            if (c != '?' || str.charAt(i) == '?') {
                sb.append(c);
                i++;
            } else {
                throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
            }
        }
        this.f12233a = sb.toString();
        this.f12234b = C4669l.FORCE_NONE;
        this.f12237e = new StringBuilder(str.length());
        this.f12239g = -1;
    }

    /* renamed from: l */
    private int m18812l() {
        return this.f12233a.length() - this.f12241i;
    }

    /* renamed from: a */
    public int mo13619a() {
        return this.f12237e.length();
    }

    /* renamed from: a */
    public void mo13620a(char c) {
        this.f12237e.append(c);
    }

    /* renamed from: a */
    public void mo13621a(int i) {
        this.f12241i = i;
    }

    /* renamed from: a */
    public void mo13622a(C4634b bVar, C4634b bVar2) {
        this.f12235c = bVar;
        this.f12236d = bVar2;
    }

    /* renamed from: a */
    public void mo13623a(C4669l lVar) {
        this.f12234b = lVar;
    }

    /* renamed from: a */
    public void mo13624a(String str) {
        this.f12237e.append(str);
    }

    /* renamed from: b */
    public StringBuilder mo13625b() {
        return this.f12237e;
    }

    /* renamed from: b */
    public void mo13626b(int i) {
        this.f12239g = i;
    }

    /* renamed from: c */
    public char mo13627c() {
        return this.f12233a.charAt(this.f12238f);
    }

    /* renamed from: c */
    public void mo13628c(int i) {
        C4668k kVar = this.f12240h;
        if (kVar == null || i > kVar.mo13637a()) {
            this.f12240h = C4668k.m18849a(i, this.f12234b, this.f12235c, this.f12236d, true);
        }
    }

    /* renamed from: d */
    public String mo13629d() {
        return this.f12233a;
    }

    /* renamed from: e */
    public int mo13630e() {
        return this.f12239g;
    }

    /* renamed from: f */
    public int mo13631f() {
        return m18812l() - this.f12238f;
    }

    /* renamed from: g */
    public C4668k mo13632g() {
        return this.f12240h;
    }

    /* renamed from: h */
    public boolean mo13633h() {
        return this.f12238f < m18812l();
    }

    /* renamed from: i */
    public void mo13634i() {
        this.f12239g = -1;
    }

    /* renamed from: j */
    public void mo13635j() {
        this.f12240h = null;
    }

    /* renamed from: k */
    public void mo13636k() {
        mo13628c(mo13619a());
    }
}
