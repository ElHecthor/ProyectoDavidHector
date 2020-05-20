package kotlinx.coroutines.internal;

import kotlinx.coroutines.C5957a;
import kotlinx.coroutines.C6163m2;
import kotlinx.coroutines.C6193t;
import p308k.p316w.C5866d;
import p308k.p316w.C5871g;
import p308k.p316w.p318j.p319a.C5890e;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.internal.s */
public class C6136s<T> extends C5957a<T> implements C5890e {

    /* renamed from: i */
    public final C5866d<T> f15244i;

    public C6136s(C5871g gVar, C5866d<? super T> dVar) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(dVar, "uCont");
        super(gVar, true);
        this.f15244i = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15722a(Object obj, int i) {
        if (obj instanceof C6193t) {
            Throwable th = ((C6193t) obj).f15300a;
            if (i != 4) {
                th = C6138u.m23070a(th, this.f15244i);
            }
            C6163m2.m23162a(this.f15244i, th, i);
            return;
        }
        C6163m2.m23164b(this.f15244i, obj, i);
    }

    /* renamed from: e */
    public final C5890e mo15588e() {
        return (C5890e) this.f15244i;
    }

    /* renamed from: j */
    public final StackTraceElement mo15589j() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final boolean mo15745o() {
        return true;
    }

    /* renamed from: s */
    public int mo15636s() {
        return 2;
    }
}
