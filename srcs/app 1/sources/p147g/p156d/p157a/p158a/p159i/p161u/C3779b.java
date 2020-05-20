package p147g.p156d.p157a.p158a.p159i.p161u;

/* renamed from: g.d.a.a.i.u.b */
public final class C3779b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m15421a(int i, TInput tinput, C3778a<TInput, TResult, TException> aVar, C3780c<TInput, TResult> cVar) {
        TResult a;
        if (i < 1) {
            return aVar.mo6399a(tinput);
        }
        do {
            a = aVar.mo6399a(tinput);
            tinput = cVar.mo6400a(tinput, a);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i >= 1);
        return a;
    }
}
