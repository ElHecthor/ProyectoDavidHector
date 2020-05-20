package p255io.stashteam.stashapp.utils.p304f;

import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0533u;
import androidx.lifecycle.LiveData;
import io.stashteam.games.tracker.stashapp.R;
import java.net.UnknownHostException;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.m */
public final class C5710m {

    /* renamed from: io.stashteam.stashapp.utils.f.m$a */
    public static final class C5711a<T> implements C0533u<T> {

        /* renamed from: a */
        final /* synthetic */ C5918l f14796a;

        /* renamed from: b */
        final /* synthetic */ int f14797b;

        /* renamed from: c */
        final /* synthetic */ Context f14798c;

        public C5711a(C5918l lVar, int i, Context context) {
            this.f14796a = lVar;
            this.f14797b = i;
            this.f14798c = context;
        }

        /* renamed from: a */
        public final void mo3048a(T t) {
            Throwable th = (Throwable) t;
            C5918l lVar = this.f14796a;
            if (!C5942k.m22326a((Object) lVar != null ? (Boolean) lVar.mo4090d(th) : null, (Object) Boolean.valueOf(true))) {
                Toast.makeText(this.f14798c, th instanceof UnknownHostException ? R.string.error_no_network : this.f14797b, 0).show();
            }
        }
    }

    /* renamed from: a */
    public static final void m21807a(C0523n nVar, Context context, LiveData<Throwable> liveData, int i, C5918l<? super Throwable, Boolean> lVar) {
        C5942k.m22327b(nVar, "$this$handleErrors");
        C5942k.m22327b(context, "context");
        C5942k.m22327b(liveData, "errorLiveData");
        liveData.mo2976a(nVar, new C5711a(lVar, i, context));
    }

    /* renamed from: a */
    public static /* synthetic */ void m21808a(C0523n nVar, Context context, LiveData liveData, int i, C5918l lVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = R.string.error_common;
        }
        if ((i2 & 8) != 0) {
            lVar = null;
        }
        m21807a(nVar, context, liveData, i, lVar);
    }
}
