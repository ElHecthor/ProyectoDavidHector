package p255io.stashteam.stashapp.p298ui.widgets.rate;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.emoji.widget.EmojiAppCompatTextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0560a0;
import androidx.recyclerview.widget.RecyclerView.C0579n;
import androidx.recyclerview.widget.RecyclerView.C0589t;
import p255io.stashteam.stashapp.p262c.C4994n0;
import p255io.stashteam.stashapp.p269e.p280c.C5318v;
import p308k.C5797g;
import p308k.C5812t;
import p308k.p323z.p324c.C5907a;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5943l;

/* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView */
public final class RateView extends LinearLayout {

    /* renamed from: f */
    private final C5797g f14761f;

    /* renamed from: g */
    private final C5797g f14762g;

    /* renamed from: h */
    private final C5682e f14763h;

    /* renamed from: i */
    private final C4994n0 f14764i;

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView$a */
    static final class C5678a extends C5943l implements C5918l<C5318v, C5812t> {

        /* renamed from: g */
        final /* synthetic */ RateView f14765g;

        C5678a(RateView rateView) {
            this.f14765g = rateView;
            super(1);
        }

        /* renamed from: a */
        public final void mo15319a(C5318v vVar) {
            C5942k.m22327b(vVar, "ratingValue");
            this.f14765g.m21656a(vVar);
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo4090d(Object obj) {
            mo15319a((C5318v) obj);
            return C5812t.f14872a;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView$b */
    private static final class C5679b extends C0579n {

        /* renamed from: a */
        private final int f14766a;

        public C5679b(int i) {
            this.f14766a = i;
        }

        /* renamed from: a */
        public void mo3528a(Rect rect, View view, RecyclerView recyclerView, C0560a0 a0Var) {
            C5942k.m22327b(rect, "outRect");
            C5942k.m22327b(view, "view");
            C5942k.m22327b(recyclerView, "parent");
            C5942k.m22327b(a0Var, "state");
            rect.right = this.f14766a;
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView$c */
    static final class C5680c extends C5943l implements C5907a<C5684a> {

        /* renamed from: g */
        public static final C5680c f14767g = new C5680c();

        C5680c() {
            super(0);
        }

        public final C5684a invoke() {
            return new C5684a();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView$d */
    static final class C5681d extends C5943l implements C5907a<LinearLayoutManager> {

        /* renamed from: g */
        final /* synthetic */ Context f14768g;

        C5681d(Context context) {
            this.f14768g = context;
            super(0);
        }

        public final LinearLayoutManager invoke() {
            return new LinearLayoutManager(this.f14768g, 0, false);
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView$e */
    public static final class C5682e extends C0589t {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f14769a;

        /* renamed from: b */
        final /* synthetic */ RateView f14770b;

        /* renamed from: io.stashteam.stashapp.ui.widgets.rate.RateView$e$a */
        static final class C5683a implements Runnable {

            /* renamed from: f */
            final /* synthetic */ C5682e f14771f;

            C5683a(C5682e eVar) {
                this.f14771f = eVar;
            }

            public final void run() {
                int G = this.f14771f.f14770b.getLayoutManager().mo3142G();
                if (this.f14771f.f14769a != G) {
                    this.f14771f.f14770b.getAdapter().mo15323c(G);
                    this.f14771f.f14769a = G;
                }
            }
        }

        C5682e(RateView rateView) {
            this.f14770b = rateView;
        }

        /* renamed from: a */
        public void mo3641a(RecyclerView recyclerView, int i, int i2) {
            C5942k.m22327b(recyclerView, "recyclerView");
            super.mo3641a(recyclerView, i, i2);
            recyclerView.post(new C5683a(this));
        }
    }

    public RateView() {
        this(null, null, 0, 7, null);
    }

    public RateView(Context context) {
        this(context, null, 0, 6, null);
    }

    public RateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public RateView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r1.<init>(r2, r3, r4)
            io.stashteam.stashapp.ui.widgets.rate.RateView$c r3 = p255io.stashteam.stashapp.p298ui.widgets.rate.RateView.C5680c.f14767g
            k.g r3 = p308k.C5799i.m22044a(r3)
            r1.f14761f = r3
            io.stashteam.stashapp.ui.widgets.rate.RateView$d r3 = new io.stashteam.stashapp.ui.widgets.rate.RateView$d
            r3.<init>(r2)
            k.g r3 = p308k.C5799i.m22044a(r3)
            r1.f14762g = r3
            io.stashteam.stashapp.ui.widgets.rate.RateView$e r3 = new io.stashteam.stashapp.ui.widgets.rate.RateView$e
            r3.<init>(r1)
            r1.f14763h = r3
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r2)
            io.stashteam.stashapp.c.n0 r3 = p255io.stashteam.stashapp.p262c.C4994n0.m19999a(r3, r1)
            java.lang.String r4 = "ViewRateBinding.inflate(…ater.from(context), this)"
            p308k.p323z.p325d.C5942k.m22324a(r3, r4)
            r1.f14764i = r3
            io.stashteam.stashapp.ui.widgets.rate.a r3 = r1.getAdapter()
            io.stashteam.stashapp.ui.widgets.rate.RateView$a r4 = new io.stashteam.stashapp.ui.widgets.rate.RateView$a
            r4.<init>(r1)
            r3.mo15322a(r4)
            if (r2 == 0) goto L_0x004c
            android.content.res.Resources r2 = r2.getResources()
            if (r2 == 0) goto L_0x004c
            r3 = 2131100021(0x7f060175, float:1.7812412E38)
            int r2 = r2.getDimensionPixelOffset(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            io.stashteam.stashapp.c.n0 r3 = r1.f14764i
            androidx.recyclerview.widget.RecyclerView r3 = r3.f13130c
            java.lang.String r4 = "binding.recyclerView"
            p308k.p323z.p325d.C5942k.m22324a(r3, r4)
            androidx.recyclerview.widget.LinearLayoutManager r0 = r1.getLayoutManager()
            r3.setLayoutManager(r0)
            if (r2 == 0) goto L_0x006f
            int r2 = r2.intValue()
            io.stashteam.stashapp.c.n0 r3 = r1.f14764i
            androidx.recyclerview.widget.RecyclerView r3 = r3.f13130c
            io.stashteam.stashapp.ui.widgets.rate.RateView$b r0 = new io.stashteam.stashapp.ui.widgets.rate.RateView$b
            r0.<init>(r2)
            r3.addItemDecoration(r0)
        L_0x006f:
            io.stashteam.stashapp.c.n0 r2 = r1.f14764i
            androidx.recyclerview.widget.RecyclerView r2 = r2.f13130c
            r3 = 1
            r2.setHasFixedSize(r3)
            io.stashteam.stashapp.c.n0 r2 = r1.f14764i
            androidx.recyclerview.widget.RecyclerView r2 = r2.f13130c
            p308k.p323z.p325d.C5942k.m22324a(r2, r4)
            io.stashteam.stashapp.ui.widgets.rate.a r3 = r1.getAdapter()
            r2.setAdapter(r3)
            io.stashteam.stashapp.c.n0 r2 = r1.f14764i
            androidx.recyclerview.widget.RecyclerView r2 = r2.f13130c
            io.stashteam.stashapp.ui.widgets.rate.RateView$e r3 = r1.f14763h
            r2.addOnScrollListener(r3)
            io.stashteam.stashapp.e.c.v r2 = r1.getCurrentRating()
            r1.m21656a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.widgets.rate.RateView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ RateView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
        if ((i2 & 1) != 0) {
            context = null;
        }
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m21656a(C5318v vVar) {
        C4994n0 n0Var = this.f14764i;
        String str = "imageEmoji";
        String str2 = "textEmoji";
        if (vVar.mo14997f() == null) {
            AppCompatImageView appCompatImageView = n0Var.f13129b;
            C5942k.m22324a((Object) appCompatImageView, str);
            appCompatImageView.setVisibility(0);
            EmojiAppCompatTextView emojiAppCompatTextView = n0Var.f13131d;
            C5942k.m22324a((Object) emojiAppCompatTextView, str2);
            emojiAppCompatTextView.setVisibility(8);
            return;
        }
        AppCompatImageView appCompatImageView2 = n0Var.f13129b;
        C5942k.m22324a((Object) appCompatImageView2, str);
        appCompatImageView2.setVisibility(8);
        EmojiAppCompatTextView emojiAppCompatTextView2 = n0Var.f13131d;
        C5942k.m22324a((Object) emojiAppCompatTextView2, str2);
        emojiAppCompatTextView2.setVisibility(0);
        EmojiAppCompatTextView emojiAppCompatTextView3 = n0Var.f13131d;
        C5942k.m22324a((Object) emojiAppCompatTextView3, str2);
        emojiAppCompatTextView3.setText(vVar.mo14997f());
    }

    /* access modifiers changed from: private */
    public final C5684a getAdapter() {
        return (C5684a) this.f14761f.getValue();
    }

    /* access modifiers changed from: private */
    public final LinearLayoutManager getLayoutManager() {
        return (LinearLayoutManager) this.f14762g.getValue();
    }

    public final C5318v getCurrentRating() {
        return getAdapter().mo15324f();
    }

    public final void setCurrentRating(C5318v vVar) {
        C5318v[] values = C5318v.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (values[i] == vVar) {
                break;
            }
            i++;
        }
        getLayoutManager().mo3171i(i);
        getAdapter().mo15323c(i);
    }
}
