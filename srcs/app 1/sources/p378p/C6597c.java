package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import p308k.C5812t;
import p337m.C6225a0;
import p337m.C6236c0;
import p378p.C6614h.C6615a;
import p378p.p379a0.C6595t;

/* renamed from: p.c */
final class C6597c extends C6615a {

    /* renamed from: a */
    private boolean f16245a = true;

    /* renamed from: p.c$a */
    static final class C6598a implements C6614h<C6236c0, C6236c0> {

        /* renamed from: a */
        static final C6598a f16246a = new C6598a();

        C6598a() {
        }

        /* renamed from: a */
        public C6236c0 mo17068a(C6236c0 c0Var) {
            try {
                return C6670y.m25065a(c0Var);
            } finally {
                c0Var.close();
            }
        }
    }

    /* renamed from: p.c$b */
    static final class C6599b implements C6614h<C6225a0, C6225a0> {

        /* renamed from: a */
        static final C6599b f16247a = new C6599b();

        C6599b() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo17068a(Object obj) {
            C6225a0 a0Var = (C6225a0) obj;
            mo17070a(a0Var);
            return a0Var;
        }

        /* renamed from: a */
        public C6225a0 mo17070a(C6225a0 a0Var) {
            return a0Var;
        }
    }

    /* renamed from: p.c$c */
    static final class C6600c implements C6614h<C6236c0, C6236c0> {

        /* renamed from: a */
        static final C6600c f16248a = new C6600c();

        C6600c() {
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ Object mo17068a(Object obj) {
            C6236c0 c0Var = (C6236c0) obj;
            mo17071a(c0Var);
            return c0Var;
        }

        /* renamed from: a */
        public C6236c0 mo17071a(C6236c0 c0Var) {
            return c0Var;
        }
    }

    /* renamed from: p.c$d */
    static final class C6601d implements C6614h<Object, String> {

        /* renamed from: a */
        static final C6601d f16249a = new C6601d();

        C6601d() {
        }

        /* renamed from: a */
        public String m24882a(Object obj) {
            return obj.toString();
        }
    }

    /* renamed from: p.c$e */
    static final class C6602e implements C6614h<C6236c0, C5812t> {

        /* renamed from: a */
        static final C6602e f16250a = new C6602e();

        C6602e() {
        }

        /* renamed from: a */
        public C5812t mo17068a(C6236c0 c0Var) {
            c0Var.close();
            return C5812t.f14872a;
        }
    }

    /* renamed from: p.c$f */
    static final class C6603f implements C6614h<C6236c0, Void> {

        /* renamed from: a */
        static final C6603f f16251a = new C6603f();

        C6603f() {
        }

        /* renamed from: a */
        public Void mo17068a(C6236c0 c0Var) {
            c0Var.close();
            return null;
        }
    }

    C6597c() {
    }

    @Nullable
    /* renamed from: a */
    public C6614h<C6236c0, ?> mo17066a(Type type, Annotation[] annotationArr, C6664u uVar) {
        if (type == C6236c0.class) {
            return C6670y.m25069a(annotationArr, C6595t.class) ? C6600c.f16248a : C6598a.f16246a;
        } else if (type == Void.class) {
            return C6603f.f16251a;
        } else {
            if (this.f16245a && type == C5812t.class) {
                try {
                    return C6602e.f16250a;
                } catch (NoClassDefFoundError unused) {
                    this.f16245a = false;
                }
            }
            return null;
        }
    }

    @Nullable
    /* renamed from: a */
    public C6614h<?, C6225a0> mo17067a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, C6664u uVar) {
        if (C6225a0.class.isAssignableFrom(C6670y.m25070b(type))) {
            return C6599b.f16247a;
        }
        return null;
    }
}
