package p255io.stashteam.stashapp.p281f.p288b.p289c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.C0636h.C0640d;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import p071f.p131r.C3511i;
import p255io.stashteam.stashapp.p262c.C4968a0;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5342c;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.b.c.b */
public final class C5381b extends C3511i<C5297f, C5384c> {

    /* renamed from: g */
    private static final C5382a f14093g = new C5382a();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f14094e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5342c f14095f;

    /* renamed from: io.stashteam.stashapp.f.b.c.b$a */
    public static final class C5382a extends C0640d<C5297f> {
        C5382a() {
        }

        /* renamed from: a */
        public boolean mo3888a(C5297f fVar, C5297f fVar2) {
            C5942k.m22327b(fVar, "old");
            C5942k.m22327b(fVar2, "new");
            return C5942k.m22326a((Object) fVar, (Object) fVar2);
        }

        /* renamed from: b */
        public boolean mo3889b(C5297f fVar, C5297f fVar2) {
            C5942k.m22327b(fVar, "old");
            C5942k.m22327b(fVar2, "new");
            return fVar.mo14903d() == fVar2.mo14903d();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.b$b */
    public static final class C5383b {
        private C5383b() {
        }

        public /* synthetic */ C5383b(C5938g gVar) {
            this();
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.b$c */
    public final class C5384c extends C0566d0 {

        /* renamed from: t */
        private final C4968a0 f14096t;

        /* renamed from: u */
        final /* synthetic */ C5381b f14097u;

        public C5384c(C5381b bVar, C4968a0 a0Var) {
            C5942k.m22327b(a0Var, "binding");
            this.f14097u = bVar;
            super(a0Var.mo11568b());
            this.f14096t = a0Var;
        }

        /* renamed from: a */
        public final void mo15070a(C5297f fVar) {
            if (fVar != null) {
                AppCompatTextView appCompatTextView = this.f14096t.f12976f;
                C5942k.m22324a((Object) appCompatTextView, "binding.textTitle");
                appCompatTextView.setText(fVar.mo14904e());
                AppCompatImageView appCompatImageView = this.f14096t.f12973c;
                C5942k.m22324a((Object) appCompatImageView, "binding.imageLock");
                appCompatImageView.setVisibility(fVar.mo14906f() ? 0 : 8);
                AppCompatTextView appCompatTextView2 = this.f14096t.f12975e;
                C5942k.m22324a((Object) appCompatTextView2, "binding.textCount");
                View view = this.f2358a;
                String str = "itemView";
                C5942k.m22324a((Object) view, str);
                Context context = view.getContext();
                String str2 = "itemView.context";
                C5942k.m22324a((Object) context, str2);
                appCompatTextView2.setText(fVar.mo14900a(context));
                View view2 = this.f2358a;
                C5942k.m22324a((Object) view2, str);
                Context context2 = view2.getContext();
                C5942k.m22324a((Object) context2, str2);
                this.f14096t.f12972b.setCardBackgroundColor(fVar.mo14898a(C5699e.m21783a(context2, this.f14097u.f14094e)));
                this.f14096t.f12974d.setBackgroundResource(this.f14097u.f14094e);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.f.b.c.b$d */
    static final class C5385d implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5381b f14098f;

        /* renamed from: g */
        final /* synthetic */ C5384c f14099g;

        C5385d(C5381b bVar, C5384c cVar) {
            this.f14098f = bVar;
            this.f14099g = cVar;
        }

        public final void onClick(View view) {
            int f = this.f14099g.mo3420f();
            if (f != -1) {
                C5297f a = C5381b.m20946a(this.f14098f, f);
                if (a != null) {
                    C5942k.m22324a((Object) a, "getItem(position) ?: return@setOnClickListener");
                    this.f14098f.f14095f.mo15043a(a);
                }
            }
        }
    }

    static {
        new C5383b(null);
    }

    public C5381b(int i, C5342c cVar) {
        C5942k.m22327b(cVar, "clickListener");
        super(f14093g);
        this.f14094e = i;
        this.f14095f = cVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5297f m20946a(C5381b bVar, int i) {
        return (C5297f) bVar.mo11180c(i);
    }

    /* renamed from: a */
    public void mo3477b(C5384c cVar, int i) {
        C5942k.m22327b(cVar, "holder");
        cVar.mo15070a((C5297f) mo11180c(i));
    }

    /* renamed from: b */
    public C5384c m20950b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4968a0 a = C4968a0.m19889a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemCustomListBinding.in….context), parent, false)");
        C5384c cVar = new C5384c(this, a);
        a.mo11568b().setOnClickListener(new C5385d(this, cVar));
        return cVar;
    }
}
