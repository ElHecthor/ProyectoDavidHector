package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlinx.coroutines.C5959a1;
import kotlinx.coroutines.C6184r0;
import p308k.p316w.C5871g;
import p308k.p323z.p325d.C5942k;

/* renamed from: kotlinx.coroutines.android.a */
public final class C6007a extends C6009b implements C6184r0 {
    private volatile C6007a _immediate;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final Handler f15010f;

    /* renamed from: g */
    private final String f15011g;

    /* renamed from: h */
    private final boolean f15012h;

    /* renamed from: kotlinx.coroutines.android.a$a */
    public static final class C6008a implements C5959a1 {

        /* renamed from: f */
        final /* synthetic */ C6007a f15013f;

        /* renamed from: g */
        final /* synthetic */ Runnable f15014g;

        C6008a(C6007a aVar, Runnable runnable) {
            this.f15013f = aVar;
            this.f15014g = runnable;
        }

        /* renamed from: f */
        public void mo15639f() {
            this.f15013f.f15010f.removeCallbacks(this.f15014g);
        }
    }

    public C6007a(Handler handler, String str) {
        C5942k.m22327b(handler, "handler");
        this(handler, str, false);
    }

    private C6007a(Handler handler, String str, boolean z) {
        C6007a aVar = null;
        super(null);
        this.f15010f = handler;
        this.f15011g = str;
        this.f15012h = z;
        if (z) {
            aVar = this;
        }
        this._immediate = aVar;
        if (this._immediate == null) {
            this._immediate = new C6007a(this.f15010f, this.f15011g, true);
        }
    }

    /* renamed from: a */
    public C5959a1 mo15710a(long j, Runnable runnable) {
        C5942k.m22327b(runnable, "block");
        this.f15010f.postDelayed(runnable, C5736g.m21873b(j, 4611686018427387903L));
        return new C6008a(this, runnable);
    }

    /* renamed from: a */
    public void mo15711a(C5871g gVar, Runnable runnable) {
        C5942k.m22327b(gVar, "context");
        C5942k.m22327b(runnable, "block");
        this.f15010f.post(runnable);
    }

    /* renamed from: b */
    public boolean mo15712b(C5871g gVar) {
        C5942k.m22327b(gVar, "context");
        return !this.f15012h || (C5942k.m22326a((Object) Looper.myLooper(), (Object) this.f15010f.getLooper()) ^ true);
    }

    public boolean equals(Object obj) {
        return (obj instanceof C6007a) && ((C6007a) obj).f15010f == this.f15010f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f15010f);
    }

    public String toString() {
        String str = this.f15011g;
        if (str == null) {
            String handler = this.f15010f.toString();
            C5942k.m22324a((Object) handler, "handler.toString()");
            return handler;
        } else if (!this.f15012h) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f15011g);
            sb.append(" [immediate]");
            return sb.toString();
        }
    }
}
