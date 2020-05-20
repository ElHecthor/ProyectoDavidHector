package p308k.p313e0;

import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: k.e0.h */
class C5777h {
    /* renamed from: a */
    public static <T> void m21955a(Appendable appendable, T t, C5918l<? super T, ? extends CharSequence> lVar) {
        CharSequence valueOf;
        C5942k.m22327b(appendable, "$this$appendElement");
        if (lVar != null) {
            t = lVar.mo4090d(t);
        } else {
            if (!(t != null ? t instanceof CharSequence : true)) {
                if (t instanceof Character) {
                    appendable.append(((Character) t).charValue());
                    return;
                }
                valueOf = String.valueOf(t);
                appendable.append(valueOf);
            }
        }
        valueOf = (CharSequence) t;
        appendable.append(valueOf);
    }
}
