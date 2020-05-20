package p352o.p353a.p359b.p360a;

import androidx.fragment.app.C0429d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0498a0;
import androidx.lifecycle.C0503b0;
import androidx.lifecycle.C0503b0.C0504a;
import androidx.lifecycle.C0508c0;
import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0523n;
import p308k.C5802l;
import p308k.p323z.C5905a;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;
import p352o.p353a.p364c.C6522a;
import p352o.p353a.p364c.C6523b;
import p352o.p353a.p364c.p369h.C6554b;
import p352o.p353a.p364c.p369h.C6555c;
import p352o.p353a.p364c.p374m.C6565a;
import p352o.p353a.p364c.p375n.C6569a;

/* renamed from: o.a.b.a.b */
public final class C6517b {

    /* renamed from: o.a.b.a.b$a */
    public static final class C6518a implements C0504a {

        /* renamed from: a */
        final /* synthetic */ C6565a f16153a;

        /* renamed from: b */
        final /* synthetic */ C6516a f16154b;

        C6518a(C6565a aVar, C6516a aVar2) {
            this.f16153a = aVar;
            this.f16154b = aVar2;
        }

        /* renamed from: a */
        public <T extends C0498a0> T mo2866a(Class<T> cls) {
            C5942k.m22327b(cls, "modelClass");
            return (C0498a0) this.f16153a.mo17011a(this.f16154b.mo16927a(), this.f16154b.mo16931e(), this.f16154b.mo16930d());
        }
    }

    /* renamed from: o.a.b.a.b$b */
    static final class C6519b extends C5943l implements C5907a<T> {

        /* renamed from: g */
        final /* synthetic */ C0503b0 f16155g;

        /* renamed from: h */
        final /* synthetic */ C6516a f16156h;

        /* renamed from: i */
        final /* synthetic */ Class f16157i;

        C6519b(C0503b0 b0Var, C6516a aVar, Class cls) {
            this.f16155g = b0Var;
            this.f16156h = aVar;
            this.f16157i = cls;
            super(0);
        }

        public final T invoke() {
            return this.f16156h.mo16931e() != null ? this.f16155g.mo3013a(this.f16156h.mo16931e().toString(), this.f16157i) : this.f16155g.mo3012a(this.f16157i);
        }
    }

    /* renamed from: a */
    public static final <T extends C0498a0> T m24716a(C0503b0 b0Var, C6516a<T> aVar) {
        C5942k.m22327b(b0Var, "$this$getInstance");
        C5942k.m22327b(aVar, "parameters");
        Class a = C5905a.m22294a(aVar.mo16927a());
        if (C6523b.f16161c.mo16943b().mo16985a(C6554b.DEBUG)) {
            C6523b.f16161c.mo16943b().mo16984a("!- ViewModelProvider getting instance");
            C5802l a2 = C6569a.m24845a(new C6519b(b0Var, aVar, a));
            T t = (C0498a0) a2.mo15418a();
            double doubleValue = ((Number) a2.mo15419b()).doubleValue();
            C6555c b = C6523b.f16161c.mo16943b();
            StringBuilder sb = new StringBuilder();
            sb.append("!- ViewModelProvider got instance in ");
            sb.append(doubleValue);
            b.mo16984a(sb.toString());
            C5942k.m22324a((Object) t, "instance");
            return t;
        }
        T a3 = aVar.mo16931e() != null ? b0Var.mo3013a(aVar.mo16931e().toString(), a) : b0Var.mo3012a(a);
        C5942k.m22324a((Object) a3, "if (parameters.qualifier….get(javaClass)\n        }");
        return a3;
    }

    /* renamed from: a */
    public static final <T extends C0498a0> T m24717a(C6522a aVar, C6516a<T> aVar2) {
        C5942k.m22327b(aVar, "$this$getViewModel");
        C5942k.m22327b(aVar2, "parameters");
        return m24716a(m24718a(aVar.mo16935b(), m24719a(aVar2.mo16929c(), aVar2), aVar2), aVar2);
    }

    /* renamed from: a */
    public static final <T extends C0498a0> C0503b0 m24718a(C6565a aVar, C0508c0 c0Var, C6516a<T> aVar2) {
        C5942k.m22327b(aVar, "$this$createViewModelProvider");
        C5942k.m22327b(c0Var, "vmStore");
        C5942k.m22327b(aVar2, "parameters");
        return new C0503b0(c0Var, new C6518a(aVar, aVar2));
    }

    /* renamed from: a */
    public static final <T extends C0498a0> C0508c0 m24719a(C0523n nVar, C6516a<T> aVar) {
        C0508c0 h;
        C5942k.m22327b(nVar, "$this$getViewModelStore");
        C5942k.m22327b(aVar, "parameters");
        if (aVar.mo16928b() != null) {
            C0508c0 h2 = ((C0510d0) aVar.mo16928b().invoke()).mo118h();
            C5942k.m22324a((Object) h2, "parameters.from.invoke().viewModelStore");
            return h2;
        }
        String str = "this.viewModelStore";
        if (nVar instanceof C0429d) {
            h = ((C0429d) nVar).mo118h();
        } else if (nVar instanceof Fragment) {
            h = ((Fragment) nVar).mo118h();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Can't getByClass ViewModel '");
            sb.append(aVar.mo16927a());
            sb.append("' on ");
            sb.append(nVar);
            sb.append(" - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner");
            throw new IllegalStateException(sb.toString().toString());
        }
        C5942k.m22324a((Object) h, str);
        return h;
    }
}
