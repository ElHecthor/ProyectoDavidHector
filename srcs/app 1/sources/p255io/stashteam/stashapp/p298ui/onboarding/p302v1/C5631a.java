package p255io.stashteam.stashapp.p298ui.onboarding.p302v1;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import p255io.stashteam.stashapp.p262c.C4972c0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.onboarding.v1.a */
public final class C5631a extends C0569g<C5632a> {

    /* renamed from: c */
    private final C5633b[] f14646c = C5633b.values();

    /* renamed from: io.stashteam.stashapp.ui.onboarding.v1.a$a */
    public static final class C5632a extends C0566d0 {

        /* renamed from: t */
        private final C4972c0 f14647t;

        public C5632a(C4972c0 c0Var) {
            C5942k.m22327b(c0Var, "binding");
            super(c0Var.mo11568b());
            this.f14647t = c0Var;
        }

        /* renamed from: a */
        public final void mo15255a(C5633b bVar) {
            C5942k.m22327b(bVar, "item");
            C4972c0 c0Var = this.f14647t;
            c0Var.f13019b.setImageResource(bVar.mo15257g());
            c0Var.f13021d.setText(bVar.mo15258h());
            c0Var.f13020c.setText(bVar.mo15256f());
        }
    }

    /* renamed from: a */
    public void mo3477b(C5632a aVar, int i) {
        C5942k.m22327b(aVar, "holder");
        aVar.mo15255a(this.f14646c[i]);
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f14646c.length;
    }

    /* renamed from: b */
    public C5632a m21527b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4972c0 a = C4972c0.m19907a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemOnboardingPageBindin….context), parent, false)");
        return new C5632a(a);
    }
}
