package kotlinx.coroutines.p327a3;

/* renamed from: kotlinx.coroutines.a3.r */
public class C5998r<E> extends C5961a<E> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Object mo15677a(E e) {
        C6004x b;
        do {
            Object a = super.mo15677a(e);
            Object obj = C5970b.f14968a;
            if (a == obj) {
                return obj;
            }
            if (a == C5970b.f14969b) {
                b = mo15682b(e);
                if (b == null) {
                    return C5970b.f14968a;
                }
            } else if (a instanceof C5989m) {
                return a;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid offerInternal result ");
                sb.append(a);
                throw new IllegalStateException(sb.toString().toString());
            }
        } while (!(b instanceof C5989m));
        return b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo15685f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo15686h() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo15651m() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final boolean mo15652n() {
        return true;
    }
}
