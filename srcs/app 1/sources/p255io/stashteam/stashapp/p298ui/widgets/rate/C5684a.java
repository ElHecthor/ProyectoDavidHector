package p255io.stashteam.stashapp.p298ui.widgets.rate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView.C0566d0;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import p255io.stashteam.stashapp.p262c.C4974d0;
import p255io.stashteam.stashapp.p269e.p280c.C5318v;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.rate.a */
public final class C5684a extends C0569g<C5685a> {

    /* renamed from: c */
    private int f14772c;

    /* renamed from: d */
    private final C5318v[] f14773d = C5318v.values();

    /* renamed from: e */
    private C5918l<? super C5318v, C5812t> f14774e;

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.a$a */
    public final class C5685a extends C0566d0 {

        /* renamed from: t */
        private final C4974d0 f14775t;

        public C5685a(C5684a aVar, C4974d0 d0Var) {
            C5942k.m22327b(d0Var, "binding");
            super(d0Var.mo11568b());
            this.f14775t = d0Var;
        }

        /* renamed from: a */
        public final void mo15325a(C5318v vVar, boolean z) {
            C5942k.m22327b(vVar, "value");
            AppCompatTextView appCompatTextView = this.f14775t.f13033b;
            String str = "binding.textValue";
            C5942k.m22324a((Object) appCompatTextView, str);
            appCompatTextView.setSelected(z);
            AppCompatTextView appCompatTextView2 = this.f14775t.f13033b;
            C5942k.m22324a((Object) appCompatTextView2, str);
            appCompatTextView2.setText(vVar.mo14998g());
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.a$b */
    static final class C5686b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5684a f14776f;

        /* renamed from: g */
        final /* synthetic */ C5685a f14777g;

        C5686b(C5684a aVar, C5685a aVar2) {
            this.f14776f = aVar;
            this.f14777g = aVar2;
        }

        public final void onClick(View view) {
            this.f14776f.mo15323c(this.f14777g.mo3420f());
        }
    }

    /* renamed from: a */
    public void mo3477b(C5685a aVar, int i) {
        C5942k.m22327b(aVar, "holder");
        aVar.mo15325a(this.f14773d[i], i == this.f14772c);
    }

    /* renamed from: a */
    public final void mo15322a(C5918l<? super C5318v, C5812t> lVar) {
        C5942k.m22327b(lVar, "listener");
        this.f14774e = lVar;
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f14773d.length;
    }

    /* renamed from: b */
    public C5685a m21669b(ViewGroup viewGroup, int i) {
        C5942k.m22327b(viewGroup, "parent");
        C4974d0 a = C4974d0.m19916a(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C5942k.m22324a((Object) a, "ItemRatingCircleBinding.….context), parent, false)");
        C5685a aVar = new C5685a(this, a);
        a.mo11568b().setOnClickListener(new C5686b(this, aVar));
        return aVar;
    }

    /* renamed from: c */
    public final void mo15323c(int i) {
        if (i != this.f14772c) {
            this.f14772c = i;
            mo3485e();
            C5918l<? super C5318v, C5812t> lVar = this.f14774e;
            if (lVar != null) {
                C5812t tVar = (C5812t) lVar.mo4090d(this.f14773d[this.f14772c]);
            }
        }
    }

    /* renamed from: f */
    public final C5318v mo15324f() {
        return this.f14773d[this.f14772c];
    }
}
