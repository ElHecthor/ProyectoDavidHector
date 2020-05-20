package kotlinx.coroutines.internal;

import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.e0 */
final class C6109e0 {

    /* renamed from: a */
    private Object[] f15201a;

    /* renamed from: b */
    private int f15202b;

    /* renamed from: c */
    private final C5871g f15203c;

    public C6109e0(C5871g gVar, int i) {
        C5942k.m22327b(gVar, "context");
        this.f15203c = gVar;
        this.f15201a = new Object[i];
    }

    /* renamed from: a */
    public final C5871g mo15879a() {
        return this.f15203c;
    }

    /* renamed from: a */
    public final void mo15880a(Object obj) {
        Object[] objArr = this.f15201a;
        int i = this.f15202b;
        this.f15202b = i + 1;
        objArr[i] = obj;
    }

    /* renamed from: b */
    public final void mo15881b() {
        this.f15202b = 0;
    }

    /* renamed from: c */
    public final Object mo15882c() {
        Object[] objArr = this.f15201a;
        int i = this.f15202b;
        this.f15202b = i + 1;
        return objArr[i];
    }
}
