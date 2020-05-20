package p071f.p097h.p107l;

/* renamed from: f.h.l.g */
public class C3320g<T> extends C3319f<T> {

    /* renamed from: c */
    private final Object f9497c = new Object();

    public C3320g(int i) {
        super(i);
    }

    /* renamed from: a */
    public T mo5387a() {
        T a;
        synchronized (this.f9497c) {
            a = super.mo5387a();
        }
        return a;
    }

    /* renamed from: a */
    public boolean mo5388a(T t) {
        boolean a;
        synchronized (this.f9497c) {
            a = super.mo5388a(t);
        }
        return a;
    }
}
