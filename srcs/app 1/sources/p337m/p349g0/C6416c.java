package p337m.p349g0;

import java.io.EOFException;
import p308k.p323z.p325d.C5942k;
import p350n.C6480e;

/* renamed from: m.g0.c */
public final class C6416c {
    /* renamed from: a */
    public static final boolean m24159a(C6480e eVar) {
        C5942k.m22327b(eVar, "$this$isProbablyUtf8");
        try {
            C6480e eVar2 = new C6480e();
            eVar.mo16787a(eVar2, 0, C5736g.m21873b(eVar.mo16834x(), 64));
            int i = 0;
            while (true) {
                if (i >= 16) {
                    break;
                } else if (eVar2.mo16809j()) {
                    break;
                } else {
                    int w = eVar2.mo16827w();
                    if (Character.isISOControl(w) && !Character.isWhitespace(w)) {
                        return false;
                    }
                    i++;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
