package p352o.p353a.p364c.p368g;

import java.util.ArrayList;
import p308k.p323z.p324c.C5922p;
import p308k.p323z.p325d.C5942k;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p366e.C6532b;
import p352o.p353a.p364c.p367f.C6540c;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p371j.C6557a;
import p352o.p353a.p364c.p374m.C6565a;

/* renamed from: o.a.c.g.a */
public abstract class C6547a<T> {

    /* renamed from: a */
    private final C6532b<T> f16188a;

    /* renamed from: o.a.c.g.a$a */
    public static final class C6548a {
        private C6548a() {
        }

        public /* synthetic */ C6548a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6548a(null);
    }

    public C6547a(C6532b<T> bVar) {
        C5942k.m22327b(bVar, "beanDefinition");
        this.f16188a = bVar;
    }

    /* renamed from: a */
    public <T> T mo16975a(C6550c cVar) {
        C5942k.m22327b(cVar, "context");
        if (C6523b.f16161c.mo16943b().mo16985a(C6554b.DEBUG)) {
            C6555c b = C6523b.f16161c.mo16943b();
            StringBuilder sb = new StringBuilder();
            sb.append("| create instance for ");
            sb.append(this.f16188a);
            b.mo16984a(sb.toString());
        }
        try {
            C6557a b2 = cVar.mo16981b();
            C5922p c = this.f16188a.mo16950c();
            C6565a c2 = cVar.mo16982c();
            if (c2 != null) {
                return c.mo4018c(c2, b2);
            }
            throw new IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e.toString());
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            C5942k.m22324a((Object) stackTrace, "e.stackTrace");
            ArrayList arrayList = new ArrayList();
            for (StackTraceElement stackTraceElement : stackTrace) {
                C5942k.m22324a((Object) stackTraceElement, "it");
                String className = stackTraceElement.getClassName();
                C5942k.m22324a((Object) className, "it.className");
                if (!(!C5788q.m22009a((CharSequence) className, (CharSequence) "sun.reflect", false, 2, (Object) null))) {
                    break;
                }
                arrayList.add(stackTraceElement);
            }
            sb2.append(C5845t.m22174a(arrayList, "\n\t", null, null, 0, null, null, 62, null));
            String sb3 = sb2.toString();
            C6555c b3 = C6523b.f16161c.mo16943b();
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Instance creation error : could not create instance for ");
            sb4.append(this.f16188a);
            sb4.append(": ");
            sb4.append(sb3);
            b3.mo16986b(sb4.toString());
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Could not create instance for ");
            sb5.append(this.f16188a);
            throw new C6540c(sb5.toString(), e);
        }
    }

    /* renamed from: a */
    public abstract void mo16976a();

    /* renamed from: b */
    public abstract <T> T mo16977b(C6550c cVar);

    /* renamed from: b */
    public final C6532b<T> mo16978b() {
        return this.f16188a;
    }

    /* renamed from: c */
    public abstract void mo16979c(C6550c cVar);
}
