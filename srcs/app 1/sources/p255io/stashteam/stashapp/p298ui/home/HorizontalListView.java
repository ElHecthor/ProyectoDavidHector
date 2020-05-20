package p255io.stashteam.stashapp.p298ui.home;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C0569g;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.C4935a;
import p255io.stashteam.stashapp.p262c.C4990l0;
import p255io.stashteam.stashapp.p281f.p295f.p297b.C5449b;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.home.HorizontalListView */
public final class HorizontalListView extends ConstraintLayout {

    /* renamed from: A */
    private int f14526A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public C5918l<? super View, C5812t> f14527B;

    /* renamed from: C */
    private final C4990l0 f14528C;

    /* renamed from: z */
    private int f14529z;

    /* renamed from: io.stashteam.stashapp.ui.home.HorizontalListView$a */
    static final class C5578a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ HorizontalListView f14530f;

        C5578a(HorizontalListView horizontalListView) {
            this.f14530f = horizontalListView;
        }

        public final void onClick(View view) {
            C5918l a = this.f14530f.f14527B;
            if (a != null) {
                C5812t tVar = (C5812t) a.mo4090d(this.f14530f);
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.home.HorizontalListView$b */
    static final class C5579b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ HorizontalListView f14531f;

        C5579b(HorizontalListView horizontalListView) {
            this.f14531f = horizontalListView;
        }

        public final void onClick(View view) {
            C5918l a = this.f14531f.f14527B;
            if (a != null) {
                C5812t tVar = (C5812t) a.mo4090d(this.f14531f);
            }
        }
    }

    public HorizontalListView() {
        this(null, null, 0, 7, null);
    }

    public HorizontalListView(Context context) {
        this(context, null, 0, 6, null);
    }

    public HorizontalListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public HorizontalListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4990l0 a = C4990l0.m19985a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewHorizontalListBindin…ater.from(context), this)");
        this.f14528C = a;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, C4935a.HorizontalListView) : null;
        if (obtainStyledAttributes != null) {
            this.f14529z = obtainStyledAttributes.getResourceId(0, 0);
            this.f14526A = obtainStyledAttributes.getDimensionPixelSize(1, getResources().getDimensionPixelOffset(R.dimen.text_medium));
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ HorizontalListView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.space_small);
        RecyclerView recyclerView = this.f14528C.f13116c;
        C5942k.m22324a((Object) recyclerView, "binding.recyclerView");
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f14528C.f13116c.addItemDecoration(new C5449b(dimensionPixelOffset));
        int i = this.f14529z;
        if (i != 0) {
            this.f14528C.f13117d.setText(i);
        }
        this.f14528C.f13117d.setTextSize(0, (float) this.f14526A);
        this.f14528C.f13117d.setOnClickListener(new C5578a(this));
        this.f14528C.f13115b.setOnClickListener(new C5579b(this));
    }

    public final void setAdapter(C0569g<?> gVar) {
        C5942k.m22327b(gVar, "adapter");
        RecyclerView recyclerView = this.f14528C.f13116c;
        C5942k.m22324a((Object) recyclerView, "binding.recyclerView");
        recyclerView.setAdapter(gVar);
    }

    public final void setSeeAllListener(C5918l<? super View, C5812t> lVar) {
        C5942k.m22327b(lVar, "listener");
        this.f14527B = lVar;
    }
}
