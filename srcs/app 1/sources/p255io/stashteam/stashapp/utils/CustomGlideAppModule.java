package p255io.stashteam.stashapp.utils;

import android.content.Context;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0834d;
import com.bumptech.glide.C0840i;
import com.bumptech.glide.integration.okhttp3.C0848c.C0849a;
import com.bumptech.glide.load.p007o.p009b0.C0940a.C0941a;
import com.bumptech.glide.load.p007o.p009b0.C0950f;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.p023p.C1254a;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import p308k.p323z.p325d.C5942k;
import p337m.C6462x.C6463a;

/* renamed from: io.stashteam.stashapp.utils.CustomGlideAppModule */
public final class CustomGlideAppModule extends C1254a {

    /* renamed from: io.stashteam.stashapp.utils.CustomGlideAppModule$a */
    public static final class C5687a {
        private C5687a() {
        }

        public /* synthetic */ C5687a(C5938g gVar) {
            this();
        }
    }

    static {
        new C5687a(null);
    }

    /* renamed from: a */
    public void mo4511a(Context context, C0832c cVar, C0840i iVar) {
        C5942k.m22327b(context, "context");
        C5942k.m22327b(cVar, "glide");
        C5942k.m22327b(iVar, "registry");
        C6463a aVar = new C6463a();
        aVar.mo16713a(15, TimeUnit.SECONDS);
        aVar.mo16717b(15, TimeUnit.SECONDS);
        aVar.mo16719c(15, TimeUnit.SECONDS);
        cVar.mo4525g().mo4556b(C1055g.class, InputStream.class, (C1071o<? extends Model, ? extends Data>) new C0849a<Object,Object>(aVar.mo16715a()));
    }

    /* renamed from: a */
    public void mo4512a(Context context, C0834d dVar) {
        C5942k.m22327b(context, "context");
        C5942k.m22327b(dVar, "builder");
        dVar.mo4532a((C0941a) new C0950f(context, 104857600));
    }
}
