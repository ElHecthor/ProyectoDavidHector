package p378p;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p378p.C6605e.C6606a;

@IgnoreJRERequirement
/* renamed from: p.g */
final class C6608g extends C6606a {

    /* renamed from: a */
    static final C6606a f16252a = new C6608g();

    @IgnoreJRERequirement
    /* renamed from: p.g$a */
    private static final class C6609a<R> implements C6605e<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f16253a;

        /* renamed from: p.g$a$a */
        class C6610a implements C6607f<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f16254a;

            C6610a(C6609a aVar, CompletableFuture completableFuture) {
                this.f16254a = completableFuture;
            }

            /* renamed from: a */
            public void mo17082a(C6604d<R> dVar, Throwable th) {
                this.f16254a.completeExceptionally(th);
            }

            /* renamed from: a */
            public void mo17083a(C6604d<R> dVar, C6663t<R> tVar) {
                if (tVar.mo17128d()) {
                    this.f16254a.complete(tVar.mo17125a());
                } else {
                    this.f16254a.completeExceptionally(new C6620j(tVar));
                }
            }
        }

        C6609a(Type type) {
            this.f16253a = type;
        }

        /* renamed from: a */
        public Type mo17080a() {
            return this.f16253a;
        }

        /* renamed from: a */
        public CompletableFuture<R> m24900a(C6604d<R> dVar) {
            C6611b bVar = new C6611b(dVar);
            dVar.mo17074a(new C6610a(this, bVar));
            return bVar;
        }
    }

    /* renamed from: p.g$b */
    private static final class C6611b<T> extends CompletableFuture<T> {

        /* renamed from: f */
        private final C6604d<?> f16255f;

        C6611b(C6604d<?> dVar) {
            this.f16255f = dVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.f16255f.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* renamed from: p.g$c */
    private static final class C6612c<R> implements C6605e<R, CompletableFuture<C6663t<R>>> {

        /* renamed from: a */
        private final Type f16256a;

        /* renamed from: p.g$c$a */
        class C6613a implements C6607f<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f16257a;

            C6613a(C6612c cVar, CompletableFuture completableFuture) {
                this.f16257a = completableFuture;
            }

            /* renamed from: a */
            public void mo17082a(C6604d<R> dVar, Throwable th) {
                this.f16257a.completeExceptionally(th);
            }

            /* renamed from: a */
            public void mo17083a(C6604d<R> dVar, C6663t<R> tVar) {
                this.f16257a.complete(tVar);
            }
        }

        C6612c(Type type) {
            this.f16256a = type;
        }

        /* renamed from: a */
        public Type mo17080a() {
            return this.f16256a;
        }

        /* renamed from: a */
        public CompletableFuture<C6663t<R>> m24905a(C6604d<R> dVar) {
            C6611b bVar = new C6611b(dVar);
            dVar.mo17074a(new C6613a(this, bVar));
            return bVar;
        }
    }

    C6608g() {
    }

    @Nullable
    /* renamed from: a */
    public C6605e<?, ?> mo17081a(Type type, Annotation[] annotationArr, C6664u uVar) {
        if (C6606a.m24892a(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a = C6606a.m24893a(0, (ParameterizedType) type);
            if (C6606a.m24892a(a) != C6663t.class) {
                return new C6609a(a);
            }
            if (a instanceof ParameterizedType) {
                return new C6612c(C6606a.m24893a(0, (ParameterizedType) a));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
