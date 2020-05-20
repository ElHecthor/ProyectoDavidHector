package kotlinx.coroutines.p331d3;

import kotlinx.coroutines.C6012b0;
import kotlinx.coroutines.internal.C6140w;

/* renamed from: kotlinx.coroutines.d3.c */
public final class C6053c extends C6054d {

    /* renamed from: k */
    private static final C6012b0 f15130k;

    /* renamed from: l */
    public static final C6053c f15131l;

    static {
        C6053c cVar = new C6053c();
        f15131l = cVar;
        f15130k = cVar.mo15797a(C6142y.m23091a("kotlinx.coroutines.io.parallelism", C5736g.m21866a(64, C6140w.m23081a()), 0, 0, 12, (Object) null));
    }

    private C6053c() {
        super(0, 0, null, 7, null);
    }

    public void close() {
        throw new UnsupportedOperationException("DefaultDispatcher cannot be closed");
    }

    /* renamed from: p */
    public final C6012b0 mo15796p() {
        return f15130k;
    }

    public String toString() {
        return "DefaultDispatcher";
    }
}
