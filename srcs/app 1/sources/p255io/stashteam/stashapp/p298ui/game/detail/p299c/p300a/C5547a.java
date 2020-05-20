package p255io.stashteam.stashapp.p298ui.game.detail.p299c.p300a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.C0657o;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import io.stashteam.games.tracker.stashapp.R;
import p147g.p225e.p226a.C4718e.C4719a;
import p147g.p225e.p226a.p234h.C4740a;
import p255io.stashteam.stashapp.p262c.C4978f0;
import p255io.stashteam.stashapp.p269e.p280c.C5311p;
import p255io.stashteam.stashapp.p269e.p280c.C5312q;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.c.a.a */
public final class C5547a extends C0657o<C5311p, C5550c> {

    /* renamed from: e */
    private static final C0640d<C5311p> f14473e = new C5548a();

    /* renamed from: io.stashteam.stashapp.ui.game.detail.c.a.a$a */
    public static final class C5548a extends C0640d<C5311p> {
        C5548a() {
        }

        /* renamed from: a */
        public boolean mo3888a(C5311p pVar, C5311p pVar2) {
            C5942k.m22327b(pVar, "old");
            C5942k.m22327b(pVar2, "new");
            return C5942k.m22326a((Object) pVar, (Object) pVar2);
        }

        /* renamed from: b */
        public boolean mo3889b(C5311p pVar, C5311p pVar2) {
            C5942k.m22327b(pVar, "old");
            C5942k.m22327b(pVar2, "new");
            return C5942k.m22326a((Object) pVar.mo14981b(), (Object) pVar2.mo14981b());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.c.a.a$b */
    public static final class C5549b {
        private C5549b() {
        }

        public /* synthetic */ C5549b(C5938g gVar) {
            this();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.c.a.a$c */
    public final class C5550c extends C0566d0 {
        /* access modifiers changed from: private */

        /* renamed from: t */
        public final C4978f0 f14474t;

        /* renamed from: u */
        final /* synthetic */ C5547a f14475u;

        /* renamed from: io.stashteam.stashapp.ui.game.detail.c.a.a$c$a */
        static final class C5551a implements OnClickListener {

            /* renamed from: f */
            final /* synthetic */ C5550c f14476f;

            /* renamed from: io.stashteam.stashapp.ui.game.detail.c.a.a$c$a$a */
            static final class C5552a<T> implements C4740a<T> {

                /* renamed from: a */
                public static final C5552a f14477a = new C5552a();

                C5552a() {
                }

                /* renamed from: a */
                public final void mo13712a(ImageView imageView, C5311p pVar) {
                    C5942k.m22324a((Object) imageView, "view");
                    C5708k.m21805b(imageView, pVar.mo14981b(), C5312q.SCREENSHOT_HUGE, 0, 0, 12, null);
                }
            }

            C5551a(C5550c cVar) {
                this.f14476f = cVar;
            }

            public final void onClick(View view) {
                View view2 = this.f14476f.f2358a;
                C5942k.m22324a((Object) view2, "itemView");
                C4719a aVar = new C4719a(view2.getContext(), this.f14476f.f14475u.mo3935f(), C5552a.f14477a);
                aVar.mo13694a(this.f14476f.mo3420f());
                aVar.mo13695a((ImageView) this.f14476f.f14474t.f13051b);
                aVar.mo13698b();
            }
        }

        public C5550c(C5547a aVar, C4978f0 f0Var) {
            C5942k.m22327b(f0Var, "binding");
            this.f14475u = aVar;
            super(f0Var.mo11568b());
            this.f14474t = f0Var;
        }

        /* renamed from: a */
        public final void mo15195a(C5311p pVar) {
            C5942k.m22327b(pVar, "image");
            View view = this.f2358a;
            C5942k.m22324a((Object) view, "itemView");
            Context context = view.getContext();
            C5942k.m22324a((Object) context, "itemView.context");
            int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.image_corner_radius);
            AppCompatImageView appCompatImageView = this.f14474t.f13051b;
            C5942k.m22324a((Object) appCompatImageView, "binding.imageScreenshot");
            C5708k.m21805b(appCompatImageView, pVar.mo14981b(), C5312q.SCREENSHOT_MEDIUM, dimensionPixelOffset, 0, 8, null);
            this.f2358a.setOnClickListener(new C5551a(this));
        }
    }

    static {
        new C5549b(null);
    }

    public C5547a() {
        super(f14473e);
    }

    /* renamed from: a */
    public void mo3477b(C5550c cVar, int i) {
        C5942k.m22327b(cVar, "holder");
        Object c = mo3934c(i);
        C5942k.m22324a(c, "getItem(position)");
        cVar.mo15195a((C5311p) c);
    }

    /* renamed from: b */
    public C5550c m21336b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4978f0 a = C4978f0.m19934a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemScreenshotBinding.in….context), parent, false)");
        return new C5550c(this, a);
    }
}
