package p255io.stashteam.stashapp.p298ui.game.detail.blocks.custom_lists;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup.C2608c;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import p255io.stashteam.stashapp.p262c.C4993n;
import p255io.stashteam.stashapp.p269e.p280c.C5297f;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p255io.stashteam.stashapp.utils.p304f.C5709l;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.custom_lists.CustomListsBlock */
public final class CustomListsBlock extends LinearLayout {

    /* renamed from: f */
    private final C4993n f14442f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5530a f14443g;

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.custom_lists.CustomListsBlock$a */
    public interface C5530a {
        /* renamed from: a */
        void mo15137a(long j);

        /* renamed from: b */
        void mo15140b(long j);

        /* renamed from: g */
        void mo15143g();
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.custom_lists.CustomListsBlock$b */
    static final class C5531b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ CustomListsBlock f14444f;

        C5531b(CustomListsBlock customListsBlock) {
            this.f14444f = customListsBlock;
        }

        public final void onClick(View view) {
            C5530a a = this.f14444f.f14443g;
            if (a != null) {
                a.mo15143g();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.custom_lists.CustomListsBlock$c */
    static final class C5532c implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5297f f14445f;

        /* renamed from: g */
        final /* synthetic */ CustomListsBlock f14446g;

        C5532c(C5297f fVar, CustomListsBlock customListsBlock) {
            this.f14445f = fVar;
            this.f14446g = customListsBlock;
        }

        public final void onClick(View view) {
            C5530a a = this.f14446g.f14443g;
            if (a != null) {
                a.mo15137a(this.f14445f.mo14903d());
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.custom_lists.CustomListsBlock$d */
    static final class C5533d implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5297f f14447f;

        /* renamed from: g */
        final /* synthetic */ CustomListsBlock f14448g;

        C5533d(C5297f fVar, CustomListsBlock customListsBlock) {
            this.f14447f = fVar;
            this.f14448g = customListsBlock;
        }

        public final void onClick(View view) {
            C5530a a = this.f14448g.f14443g;
            if (a != null) {
                a.mo15140b(this.f14447f.mo14903d());
            }
        }
    }

    public CustomListsBlock() {
        this(null, null, 0, 7, null);
    }

    public CustomListsBlock(Context context) {
        this(context, null, 0, 6, null);
    }

    public CustomListsBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public CustomListsBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4993n a = C4993n.m19996a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "BlockCustomListsBinding.…ater.from(context), this)");
        this.f14442f = a;
    }

    public /* synthetic */ CustomListsBlock(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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

    /* renamed from: a */
    private final Chip m21307a(C5297f fVar) {
        Chip chip = new Chip(getContext(), null, R.attr.customListChipStyle);
        chip.setText(fVar.mo14904e());
        int b = m21309b(fVar);
        chip.setTextColor(b);
        chip.setCloseIconTint(ColorStateList.valueOf(b));
        return chip;
    }

    /* renamed from: b */
    private final int m21309b(C5297f fVar) {
        Context context = getContext();
        C5942k.m22324a((Object) context, "context");
        int a = C5699e.m21783a(context, (int) R.color.color_primary_text);
        if (fVar.mo14899a() == null) {
            return a;
        }
        try {
            return Color.parseColor(fVar.mo14899a());
        } catch (Exception unused) {
            return a;
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14442f.f13127c.setOnClickListener(new C5531b(this));
    }

    public final void setActionListener(C5530a aVar) {
        C5942k.m22327b(aVar, "listener");
        this.f14443g = aVar;
    }

    public final void setUpCustomLists(List<C5297f> list) {
        this.f14442f.f13126b.removeAllViews();
        if (list != null) {
            for (C5297f fVar : list) {
                Chip a = m21307a(fVar);
                a.setOnClickListener(new C5532c(fVar, this));
                a.setOnCloseIconClickListener(new C5533d(fVar, this));
                this.f14442f.f13126b.addView(a);
                LayoutParams layoutParams = a.getLayoutParams();
                if (layoutParams != null) {
                    C2608c cVar = (C2608c) layoutParams;
                    cVar.height = C5709l.m21806a(44);
                    a.setLayoutParams(cVar);
                } else {
                    throw new C5809q("null cannot be cast to non-null type com.google.android.material.chip.ChipGroup.LayoutParams");
                }
            }
        }
    }
}
