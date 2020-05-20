package p378p;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import p337m.C6467z;
import p378p.C6605e.C6606a;

/* renamed from: p.i */
final class C6616i extends C6606a {
    @Nullable

    /* renamed from: a */
    private final Executor f16258a;

    /* renamed from: p.i$a */
    class C6617a implements C6605e<Object, C6604d<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f16259a;

        /* renamed from: b */
        final /* synthetic */ Executor f16260b;

        C6617a(C6616i iVar, Type type, Executor executor) {
            this.f16259a = type;
            this.f16260b = executor;
        }

        /* renamed from: a */
        public Type mo17080a() {
            return this.f16259a;
        }

        /* renamed from: a */
        public C6604d<Object> m24917a(C6604d<Object> dVar) {
            Executor executor = this.f16260b;
            return executor == null ? dVar : new C6618b(executor, dVar);
        }
    }

    /* renamed from: p.i$b */
    static final class C6618b<T> implements C6604d<T> {

        /* renamed from: f */
        final Executor f16261f;

        /* renamed from: g */
        final C6604d<T> f16262g;

        /* renamed from: p.i$b$a */
        class C6619a implements C6607f<T> {

            /* renamed from: a */
            final /* synthetic */ C6607f f16263a;

            C6619a(C6607f fVar) {
                this.f16263a = fVar;
            }

            /* renamed from: a */
            public void mo17082a(C6604d<T> dVar, Throwable th) {
                C6618b.this.f16261f.execute(new C6596b(this, this.f16263a, th));
            }

            /* renamed from: a */
            public void mo17083a(C6604d<T> dVar, C6663t<T> tVar) {
                C6618b.this.f16261f.execute(new C6575a(this, this.f16263a, tVar));
            }

            /* renamed from: a */
            public /* synthetic */ void mo17086a(C6607f fVar, Throwable th) {
                fVar.mo17082a((C6604d<T>) C6618b.this, th);
            }

            /* renamed from: a */
            public /* synthetic */ void mo17087a(C6607f fVar, C6663t tVar) {
                if (C6618b.this.f16262g.mo17078i()) {
                    fVar.mo17082a((C6604d<T>) C6618b.this, (Throwable) new IOException("Canceled"));
                } else {
                    fVar.mo17083a((C6604d<T>) C6618b.this, tVar);
                }
            }
        }

        C6618b(Executor executor, C6604d<T> dVar) {
            this.f16261f = executor;
            this.f16262g = dVar;
        }

        /* renamed from: a */
        public void mo17074a(C6607f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f16262g.mo17074a(new C6619a(fVar));
        }

        public void cancel() {
            this.f16262g.cancel();
        }

        public C6604d<T> clone() {
            return new C6618b(this.f16261f, this.f16262g.clone());
        }

        /* renamed from: g */
        public C6467z mo17077g() {
            return this.f16262g.mo17077g();
        }

        /* renamed from: i */
        public boolean mo17078i() {
            return this.f16262g.mo17078i();
        }
    }

    C6616i(@Nullable Executor executor) {
        this.f16258a = executor;
    }

    @Nullable
    /* renamed from: a */
    public C6605e<?, ?> mo17081a(Type type, Annotation[] annotationArr, C6664u uVar) {
        Executor executor = null;
        if (C6606a.m24892a(type) != C6604d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type b = C6670y.m25071b(0, (ParameterizedType) type);
            if (!C6670y.m25069a(annotationArr, C6668w.class)) {
                executor = this.f16258a;
            }
            return new C6617a(this, b, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
