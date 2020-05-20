package p147g.p156d.p157a.p185c.p202y;

import android.graphics.Typeface;

/* renamed from: g.d.a.c.y.a */
public final class C4456a extends C4464f {

    /* renamed from: a */
    private final Typeface f11799a;

    /* renamed from: b */
    private final C4457a f11800b;

    /* renamed from: c */
    private boolean f11801c;

    /* renamed from: g.d.a.c.y.a$a */
    public interface C4457a {
        /* renamed from: a */
        void mo8965a(Typeface typeface);
    }

    public C4456a(C4457a aVar, Typeface typeface) {
        this.f11799a = typeface;
        this.f11800b = aVar;
    }

    /* renamed from: a */
    private void m18164a(Typeface typeface) {
        if (!this.f11801c) {
            this.f11800b.mo8965a(typeface);
        }
    }

    /* renamed from: a */
    public void mo13265a() {
        this.f11801c = true;
    }

    /* renamed from: a */
    public void mo8429a(int i) {
        m18164a(this.f11799a);
    }

    /* renamed from: a */
    public void mo8430a(Typeface typeface, boolean z) {
        m18164a(typeface);
    }
}
