package androidx.lifecycle;

/* renamed from: androidx.lifecycle.b0 */
public class C0503b0 {

    /* renamed from: a */
    private final C0504a f2219a;

    /* renamed from: b */
    private final C0508c0 f2220b;

    /* renamed from: androidx.lifecycle.b0$a */
    public interface C0504a {
        /* renamed from: a */
        <T extends C0498a0> T mo2866a(Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.b0$b */
    static abstract class C0505b extends C0506c implements C0504a {
        C0505b() {
        }

        /* renamed from: a */
        public <T extends C0498a0> T mo2866a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        /* renamed from: a */
        public abstract <T extends C0498a0> T mo3014a(String str, Class<T> cls);
    }

    /* renamed from: androidx.lifecycle.b0$c */
    static class C0506c {
        C0506c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3015a(C0498a0 a0Var) {
        }
    }

    public C0503b0(C0508c0 c0Var, C0504a aVar) {
        this.f2219a = aVar;
        this.f2220b = c0Var;
    }

    /* renamed from: a */
    public <T extends C0498a0> T mo3012a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            return mo3013a(sb.toString(), cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: a */
    public <T extends C0498a0> T mo3013a(String str, Class<T> cls) {
        T a = this.f2220b.mo3018a(str);
        if (cls.isInstance(a)) {
            C0504a aVar = this.f2219a;
            if (aVar instanceof C0506c) {
                ((C0506c) aVar).mo3015a(a);
            }
            return a;
        }
        C0504a aVar2 = this.f2219a;
        T a2 = aVar2 instanceof C0505b ? ((C0505b) aVar2).mo3014a(str, cls) : aVar2.mo2866a(cls);
        this.f2220b.mo3020a(str, a2);
        return a2;
    }
}
