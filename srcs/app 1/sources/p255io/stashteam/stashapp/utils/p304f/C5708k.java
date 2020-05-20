package p255io.stashteam.stashapp.utils.p304f;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bumptech.glide.C0832c;
import com.bumptech.glide.C0850j;
import com.bumptech.glide.load.C0877m;
import com.bumptech.glide.load.p013q.p014d.C1181z;
import com.bumptech.glide.p025r.C1267a;
import com.bumptech.glide.p025r.C1273f;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p269e.p280c.C5312q;
import p255io.stashteam.stashapp.utils.C5688a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.k */
public final class C5708k {
    /* renamed from: a */
    public static final void m21801a(ImageView imageView, String str) {
        C5942k.m22327b(imageView, "$this$loadAvatar");
        ((C0850j) C0832c.m4452d(imageView.getContext()).mo4586a(str).m4528a((C1267a<?>) C1273f.m5998M()).mo5257a((int) R.drawable.ic_profile_circle)).mo4583a(imageView);
    }

    /* renamed from: a */
    public static final void m21802a(ImageView imageView, String str, C5312q qVar, int i, int i2) {
        C5942k.m22327b(imageView, "$this$loadCover");
        C5942k.m22327b(qVar, "quality");
        ((C0850j) C0832c.m4452d(imageView.getContext()).mo4586a(C5688a.f14784a.mo15341a(str, C5312q.COVER_BIG, qVar)).mo4576a(qVar == C5312q.ORIGINAL ? C0832c.m4452d(imageView.getContext()).mo4586a(str) : null).m4528a((C1267a<?>) C1273f.m6000b((C0877m<Bitmap>) new C1181z<Bitmap>(i))).mo5257a(i2)).mo4583a(imageView);
    }

    /* renamed from: a */
    public static /* synthetic */ void m21803a(ImageView imageView, String str, C5312q qVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            qVar = C5312q.COVER_BIG;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        m21802a(imageView, str, qVar, i, i2);
    }

    /* renamed from: b */
    public static final void m21804b(ImageView imageView, String str, C5312q qVar, int i, int i2) {
        C5942k.m22327b(imageView, "$this$loadScreenshot");
        C5942k.m22327b(qVar, "quality");
        C1267a a = C0832c.m4452d(imageView.getContext()).mo4586a(C5688a.f14784a.mo15341a(str, C5312q.COVER_BIG, qVar)).mo4576a(qVar == C5312q.SCREENSHOT_HUGE ? C0832c.m4452d(imageView.getContext()).mo4586a(C5688a.f14784a.mo15341a(str, C5312q.COVER_BIG, C5312q.SCREENSHOT_MEDIUM)) : null).mo5257a(i2);
        C5942k.m22324a((Object) a, "Glide.with(context)\n    …      .error(errorImgRes)");
        C0850j jVar = (C0850j) a;
        if (i > 0) {
            jVar.m4528a((C1267a<?>) C1273f.m6000b((C0877m<Bitmap>) new C1181z<Bitmap>(i)));
        }
        jVar.mo4583a(imageView);
    }

    /* renamed from: b */
    public static /* synthetic */ void m21805b(ImageView imageView, String str, C5312q qVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            qVar = C5312q.SCREENSHOT_MEDIUM;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        m21804b(imageView, str, qVar, i, i2);
    }
}
