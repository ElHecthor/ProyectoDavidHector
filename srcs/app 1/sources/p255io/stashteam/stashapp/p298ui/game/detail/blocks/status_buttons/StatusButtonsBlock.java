package p255io.stashteam.stashapp.p298ui.game.detail.blocks.status_buttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.C0306b;
import com.google.android.material.button.MaterialButton;
import io.stashteam.games.tracker.stashapp.R;
import p071f.p097h.p098e.C3236a;
import p255io.stashteam.stashapp.p262c.C5001r;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5308n;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.status_buttons.StatusButtonsBlock */
public final class StatusButtonsBlock extends ConstraintLayout {

    /* renamed from: A */
    private C5306l f14467A;

    /* renamed from: B */
    private final C5001r f14468B;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C5543a f14469z;

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.status_buttons.StatusButtonsBlock$a */
    public interface C5543a {
        /* renamed from: d */
        void mo15141d();

        /* renamed from: e */
        void mo15142e();

        /* renamed from: i */
        void mo15144i();
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.status_buttons.StatusButtonsBlock$b */
    static final class C5544b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ StatusButtonsBlock f14470f;

        C5544b(StatusButtonsBlock statusButtonsBlock) {
            this.f14470f = statusButtonsBlock;
        }

        public final void onClick(View view) {
            if (this.f14470f.m21327c()) {
                C5543a a = this.f14470f.f14469z;
                if (a != null) {
                    a.mo15144i();
                    return;
                }
                return;
            }
            C5543a a2 = this.f14470f.f14469z;
            if (a2 != null) {
                a2.mo15142e();
            }
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.status_buttons.StatusButtonsBlock$c */
    static final class C5545c implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ StatusButtonsBlock f14471f;

        C5545c(StatusButtonsBlock statusButtonsBlock) {
            this.f14471f = statusButtonsBlock;
        }

        public final void onClick(View view) {
            if (this.f14471f.m21324a() || this.f14471f.m21325b()) {
                C5543a a = this.f14471f.f14469z;
                if (a != null) {
                    a.mo15144i();
                    return;
                }
                return;
            }
            C5543a a2 = this.f14471f.f14469z;
            if (a2 != null) {
                a2.mo15141d();
            }
        }
    }

    public StatusButtonsBlock() {
        this(null, null, 0, 7, null);
    }

    public StatusButtonsBlock(Context context) {
        this(context, null, 0, 6, null);
    }

    public StatusButtonsBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StatusButtonsBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5001r a = C5001r.m20020a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "BlockStatusButtonsBindin…ater.from(context), this)");
        this.f14468B = a;
    }

    public /* synthetic */ StatusButtonsBlock(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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
    private final void m21322a(MaterialButton materialButton) {
        materialButton.setIconResource(0);
        materialButton.setSelected(false);
        LayoutParams layoutParams = materialButton.getLayoutParams();
        if (layoutParams != null) {
            C0306b bVar = (C0306b) layoutParams;
            bVar.f1344D = 1.0f;
            materialButton.setLayoutParams(bVar);
            materialButton.setBackgroundTintList(ColorStateList.valueOf(C3236a.m13263a(materialButton.getContext(), (int) R.color.color_background)));
            materialButton.setTextColor(C3236a.m13263a(materialButton.getContext(), (int) R.color.color_secondary_text));
            View view = this.f14468B.f13168f;
            C5942k.m22324a((Object) view, "binding.spaceButtons");
            view.setVisibility(0);
            AppCompatImageView appCompatImageView = this.f14468B.f13166d;
            C5942k.m22324a((Object) appCompatImageView, "binding.imageDots");
            appCompatImageView.setVisibility(8);
            return;
        }
        throw new C5809q("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    /* renamed from: a */
    private final void m21323a(MaterialButton materialButton, MaterialButton materialButton2) {
        materialButton.setSelected(true);
        LayoutParams layoutParams = materialButton.getLayoutParams();
        String str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        if (layoutParams != null) {
            C0306b bVar = (C0306b) layoutParams;
            bVar.f1344D = 1.0f;
            materialButton.setLayoutParams(bVar);
            Context context = materialButton.getContext();
            C5942k.m22324a((Object) context, "context");
            materialButton.setBackgroundTintList(ColorStateList.valueOf(C5699e.m21783a(context, (int) R.color.color_primary)));
            materialButton.setTextColor(C3236a.m13263a(materialButton.getContext(), (int) R.color.black));
            materialButton.setIconResource(R.drawable.ic_check);
            materialButton2.setSelected(false);
            LayoutParams layoutParams2 = materialButton2.getLayoutParams();
            if (layoutParams2 != null) {
                C0306b bVar2 = (C0306b) layoutParams2;
                bVar2.f1344D = 0.0f;
                materialButton2.setLayoutParams(bVar2);
                View view = this.f14468B.f13168f;
                C5942k.m22324a((Object) view, "binding.spaceButtons");
                view.setVisibility(8);
                AppCompatImageView appCompatImageView = this.f14468B.f13166d;
                C5942k.m22324a((Object) appCompatImageView, "binding.imageDots");
                appCompatImageView.setVisibility(0);
                return;
            }
            throw new C5809q(str);
        }
        throw new C5809q(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final boolean m21324a() {
        C5306l lVar = this.f14467A;
        return (lVar != null ? lVar.mo14963e() : null) == C5308n.f13937i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final boolean m21325b() {
        C5306l lVar = this.f14467A;
        return (lVar != null ? lVar.mo14963e() : null) == C5308n.f13938j;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final boolean m21327c() {
        C5306l lVar = this.f14467A;
        return (lVar != null ? lVar.mo14963e() : null) == C5308n.f13936h;
    }

    private final void setUpStatusButtons(C5306l lVar) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        C5308n e = lVar != null ? lVar.mo14963e() : null;
        String str = "binding.btnPlayed";
        String str2 = "binding.btnWant";
        if (e != null) {
            int i = C5546a.f14472a[e.ordinal()];
            if (i == 1) {
                materialButton = this.f14468B.f13165c;
                C5942k.m22324a((Object) materialButton, str2);
                materialButton2 = this.f14468B.f13164b;
                C5942k.m22324a((Object) materialButton2, str);
            } else if (i == 2 || i == 3) {
                this.f14468B.f13164b.setText(lVar.mo14964f());
                materialButton = this.f14468B.f13164b;
                C5942k.m22324a((Object) materialButton, str);
                materialButton2 = this.f14468B.f13165c;
                C5942k.m22324a((Object) materialButton2, str2);
            }
            m21323a(materialButton, materialButton2);
            return;
        }
        this.f14468B.f13164b.setText(R.string.common_played);
        MaterialButton materialButton3 = this.f14468B.f13165c;
        C5942k.m22324a((Object) materialButton3, str2);
        m21322a(materialButton3);
        MaterialButton materialButton4 = this.f14468B.f13164b;
        C5942k.m22324a((Object) materialButton4, str);
        m21322a(materialButton4);
    }

    /* renamed from: a */
    public final void mo15186a(C5306l lVar) {
        this.f14467A = lVar;
        setUpStatusButtons(lVar);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f14468B.f13165c.setOnClickListener(new C5544b(this));
        this.f14468B.f13164b.setOnClickListener(new C5545c(this));
    }

    public final void setActionListener(C5543a aVar) {
        C5942k.m22327b(aVar, "listener");
        this.f14469z = aVar;
    }

    public final void setLoading(boolean z) {
        MaterialButton materialButton = this.f14468B.f13165c;
        C5942k.m22324a((Object) materialButton, "binding.btnWant");
        int i = 4;
        int i2 = 0;
        materialButton.setVisibility(z ? 4 : 0);
        MaterialButton materialButton2 = this.f14468B.f13164b;
        C5942k.m22324a((Object) materialButton2, "binding.btnPlayed");
        materialButton2.setVisibility(z ? 4 : 0);
        AppCompatImageView appCompatImageView = this.f14468B.f13166d;
        C5942k.m22324a((Object) appCompatImageView, "binding.imageDots");
        if (!(z || this.f14467A == null)) {
            i = 0;
        }
        appCompatImageView.setVisibility(i);
        ProgressBar progressBar = this.f14468B.f13167e;
        C5942k.m22324a((Object) progressBar, "binding.progressBar");
        if (!z) {
            i2 = 8;
        }
        progressBar.setVisibility(i2);
    }
}
