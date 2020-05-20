package p352o.p353a.p364c.p371j;

import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.p367f.C6543f;

/* renamed from: o.a.c.j.a */
public final class C6557a {

    /* renamed from: a */
    private final Object[] f16204a;

    /* renamed from: o.a.c.j.a$a */
    public static final class C6558a {
        private C6558a() {
        }

        public /* synthetic */ C6558a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6558a(null);
    }

    public C6557a(Object... objArr) {
        C5942k.m22327b(objArr, "values");
        this.f16204a = objArr;
    }

    /* renamed from: a */
    private final <T> T m24796a(int i) {
        T[] tArr = this.f16204a;
        if (tArr.length > i) {
            return tArr[i];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't get parameter value #");
        sb.append(i);
        sb.append(" from ");
        sb.append(this);
        throw new C6543f(sb.toString());
    }

    /* renamed from: a */
    public final <T> T mo16993a() {
        return m24796a(0);
    }

    /* renamed from: b */
    public final <T> T mo16994b() {
        return m24796a(1);
    }

    /* renamed from: c */
    public final <T> T mo16995c() {
        return m24796a(2);
    }
}
