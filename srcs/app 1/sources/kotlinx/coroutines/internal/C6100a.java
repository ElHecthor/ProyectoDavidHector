package kotlinx.coroutines.internal;

import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.a */
public class C6100a<T> {

    /* renamed from: a */
    private Object[] f15190a = new Object[16];

    /* renamed from: b */
    private int f15191b;

    /* renamed from: c */
    private int f15192c;

    /* renamed from: c */
    private final void m22920c() {
        Object[] objArr = this.f15190a;
        int length = objArr.length;
        Object[] objArr2 = new Object[(length << 1)];
        Object[] objArr3 = objArr2;
        C5830g.m22111a(objArr, objArr3, 0, this.f15191b, 0, 10, (Object) null);
        Object[] objArr4 = this.f15190a;
        int length2 = objArr4.length;
        int i = this.f15191b;
        C5830g.m22111a(objArr4, objArr2, length2 - i, 0, i, 4, (Object) null);
        this.f15190a = objArr3;
        this.f15191b = 0;
        this.f15192c = length;
    }

    /* renamed from: a */
    public final void mo15859a(T t) {
        C5942k.m22327b(t, "element");
        Object[] objArr = this.f15190a;
        int i = this.f15192c;
        objArr[i] = t;
        int length = (objArr.length - 1) & (i + 1);
        this.f15192c = length;
        if (length == this.f15191b) {
            m22920c();
        }
    }

    /* renamed from: a */
    public final boolean mo15860a() {
        return this.f15191b == this.f15192c;
    }

    /* renamed from: b */
    public final T mo15861b() {
        int i = this.f15191b;
        if (i == this.f15192c) {
            return null;
        }
        T[] tArr = this.f15190a;
        T t = tArr[i];
        tArr[i] = null;
        this.f15191b = (i + 1) & (tArr.length - 1);
        if (t != null) {
            return t;
        }
        throw new C5809q("null cannot be cast to non-null type T");
    }
}
