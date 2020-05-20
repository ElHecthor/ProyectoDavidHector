package p147g.p225e.p226a;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;
import java.util.List;
import p147g.p225e.p226a.p234h.C4740a;
import p147g.p225e.p226a.p235i.p237b.C4744a;
import p147g.p225e.p226a.p235i.p238c.C4745a;

/* renamed from: g.e.a.e */
public class C4718e<T> {

    /* renamed from: a */
    private Context f12359a;

    /* renamed from: b */
    private C4744a<T> f12360b;

    /* renamed from: c */
    private C4745a<T> f12361c;

    /* renamed from: g.e.a.e$a */
    public static class C4719a<T> {

        /* renamed from: a */
        private Context f12362a;

        /* renamed from: b */
        private C4744a<T> f12363b;

        public C4719a(Context context, List<T> list, C4740a<T> aVar) {
            this.f12362a = context;
            this.f12363b = new C4744a<>(list, aVar);
        }

        /* renamed from: a */
        public C4719a<T> mo13694a(int i) {
            this.f12363b.mo13720a(i);
            return this;
        }

        /* renamed from: a */
        public C4719a<T> mo13695a(ImageView imageView) {
            this.f12363b.mo13721a(imageView);
            return this;
        }

        /* renamed from: a */
        public C4718e<T> mo13696a() {
            return new C4718e<>(this.f12362a, this.f12363b);
        }

        /* renamed from: a */
        public C4718e<T> mo13697a(boolean z) {
            C4718e<T> a = mo13696a();
            a.mo13693a(z);
            return a;
        }

        /* renamed from: b */
        public C4718e<T> mo13698b() {
            return mo13697a(true);
        }
    }

    protected C4718e(Context context, C4744a<T> aVar) {
        this.f12359a = context;
        this.f12360b = aVar;
        this.f12361c = new C4745a<>(context, aVar);
    }

    /* renamed from: a */
    public void mo13693a(boolean z) {
        if (!this.f12360b.mo13726f().isEmpty()) {
            this.f12361c.mo13734a(z);
        } else {
            Log.w(this.f12359a.getString(C4716c.library_name), "Images list cannot be empty! Viewer ignored.");
        }
    }
}
