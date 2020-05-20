package p337m;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import p308k.p323z.p325d.C5942k;
import p337m.C6448t.C6451b;
import p337m.p338f0.C6250b;
import p350n.C6480e;
import p350n.C6483f;

/* renamed from: m.q */
public final class C6438q extends C6225a0 {

    /* renamed from: d */
    private static final C6455v f15936d = C6455v.f15978f.mo16671a("application/x-www-form-urlencoded");

    /* renamed from: b */
    private final List<String> f15937b;

    /* renamed from: c */
    private final List<String> f15938c;

    /* renamed from: m.q$a */
    public static final class C6439a {

        /* renamed from: a */
        private final List<String> f15939a;

        /* renamed from: b */
        private final List<String> f15940b;

        /* renamed from: c */
        private final Charset f15941c;

        public C6439a() {
            this(null, 1, null);
        }

        public C6439a(Charset charset) {
            this.f15941c = charset;
            this.f15939a = new ArrayList();
            this.f15940b = new ArrayList();
        }

        public /* synthetic */ C6439a(Charset charset, int i, C5938g gVar) {
            if ((i & 1) != 0) {
                charset = null;
            }
            this(charset);
        }

        /* renamed from: a */
        public final C6439a mo16591a(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            String str3 = str;
            this.f15939a.add(C6451b.m24327a(C6448t.f15954l, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f15941c, 91, null));
            String str4 = str2;
            this.f15940b.add(C6451b.m24327a(C6448t.f15954l, str4, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, false, this.f15941c, 91, null));
            return this;
        }

        /* renamed from: a */
        public final C6438q mo16592a() {
            return new C6438q(this.f15939a, this.f15940b);
        }

        /* renamed from: b */
        public final C6439a mo16593b(String str, String str2) {
            C5942k.m22327b(str, "name");
            C5942k.m22327b(str2, "value");
            String str3 = str;
            this.f15939a.add(C6451b.m24327a(C6448t.f15954l, str3, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f15941c, 83, null));
            String str4 = str2;
            this.f15940b.add(C6451b.m24327a(C6448t.f15954l, str4, 0, 0, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, false, this.f15941c, 83, null));
            return this;
        }
    }

    /* renamed from: m.q$b */
    public static final class C6440b {
        private C6440b() {
        }

        public /* synthetic */ C6440b(C5938g gVar) {
            this();
        }
    }

    static {
        new C6440b(null);
    }

    public C6438q(List<String> list, List<String> list2) {
        C5942k.m22327b(list, "encodedNames");
        C5942k.m22327b(list2, "encodedValues");
        this.f15937b = C6250b.m23471b(list);
        this.f15938c = C6250b.m23471b(list2);
    }

    /* renamed from: a */
    private final long m24242a(C6483f fVar, boolean z) {
        C6480e eVar;
        if (z) {
            eVar = new C6480e();
        } else if (fVar != null) {
            eVar = fVar.getBuffer();
        } else {
            C5942k.m22323a();
            throw null;
        }
        int size = this.f15937b.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                eVar.writeByte(38);
            }
            eVar.mo16784a((String) this.f15937b.get(i));
            eVar.writeByte(61);
            eVar.mo16784a((String) this.f15938c.get(i));
        }
        if (!z) {
            return 0;
        }
        long x = eVar.mo16834x();
        eVar.mo16797d();
        return x;
    }

    /* renamed from: a */
    public long mo16007a() {
        return m24242a(null, true);
    }

    /* renamed from: a */
    public void mo16008a(C6483f fVar) {
        C5942k.m22327b(fVar, "sink");
        m24242a(fVar, false);
    }

    /* renamed from: b */
    public C6455v mo16009b() {
        return f15936d;
    }
}
