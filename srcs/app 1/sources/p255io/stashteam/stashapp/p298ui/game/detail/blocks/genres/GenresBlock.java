package p255io.stashteam.stashapp.p298ui.game.detail.blocks.genres;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.google.android.material.chip.Chip;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import p255io.stashteam.stashapp.p262c.C4995o;
import p255io.stashteam.stashapp.p269e.p280c.C5309o;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.genres.GenresBlock */
public final class GenresBlock extends LinearLayout {

    /* renamed from: f */
    private final C4995o f14449f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5534a f14450g;

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.genres.GenresBlock$a */
    public interface C5534a {
        /* renamed from: a */
        void mo15139a(C5309o oVar);
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.genres.GenresBlock$b */
    static final class C5535b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5309o f14451f;

        /* renamed from: g */
        final /* synthetic */ GenresBlock f14452g;

        C5535b(C5309o oVar, GenresBlock genresBlock) {
            this.f14451f = oVar;
            this.f14452g = genresBlock;
        }

        public final void onClick(View view) {
            C5534a a = this.f14452g.f14450g;
            if (a != null) {
                a.mo15139a(this.f14451f);
            }
        }
    }

    public GenresBlock() {
        this(null, null, 0, 7, null);
    }

    public GenresBlock(Context context) {
        this(context, null, 0, 6, null);
    }

    public GenresBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public GenresBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4995o a = C4995o.m20002a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "BlockGenresBinding.infla…ater.from(context), this)");
        this.f14449f = a;
        setOrientation(1);
    }

    public /* synthetic */ GenresBlock(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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
    private final Chip m21313a(int i, String str) {
        Chip chip = new Chip(getContext(), null, R.attr.actionChipStyle);
        chip.setId(i);
        chip.setText(str);
        return chip;
    }

    public final void setActionListener(C5534a aVar) {
        C5942k.m22327b(aVar, "listener");
        this.f14450g = aVar;
    }

    public final void setUpGenres(List<? extends C5309o> list) {
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        this.f14449f.f13133b.removeAllViews();
        for (C5309o oVar : list) {
            int j = oVar.mo14977j();
            StringBuilder sb = new StringBuilder();
            sb.append(oVar.mo14973f());
            sb.append(' ');
            sb.append(getContext().getString(oVar.mo14976i()));
            Chip a = m21313a(j, sb.toString());
            a.setOnClickListener(new C5535b(oVar, this));
            this.f14449f.f13133b.addView(a);
        }
    }
}
