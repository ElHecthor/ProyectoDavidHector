package p308k.p309a0;

import java.util.Random;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.a0.b */
public final class C5721b extends C5720a {

    /* renamed from: c */
    private final C5722a f14803c = new C5722a();

    /* renamed from: k.a0.b$a */
    public static final class C5722a extends ThreadLocal<Random> {
        C5722a() {
        }

        /* access modifiers changed from: protected */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo15359c() {
        Object obj = this.f14803c.get();
        C5942k.m22324a(obj, "implStorage.get()");
        return (Random) obj;
    }
}
