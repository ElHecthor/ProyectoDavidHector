package p255io.stashteam.stashapp.p298ui.leaderboard.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C0387e;
import com.google.android.material.textview.MaterialTextView;
import io.stashteam.games.tracker.stashapp.R;
import p255io.stashteam.stashapp.p262c.C5000q0;
import p255io.stashteam.stashapp.p269e.p280c.C5292c0;
import p255io.stashteam.stashapp.p269e.p280c.C5294d0;
import p255io.stashteam.stashapp.p281f.p282a.p286h.C5344e;
import p255io.stashteam.stashapp.utils.p304f.C5699e;
import p255io.stashteam.stashapp.utils.p304f.C5708k;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.leaderboard.views.TopUserView */
public final class TopUserView extends ConstraintLayout {

    /* renamed from: z */
    private final C5000q0 f14620z;

    /* renamed from: io.stashteam.stashapp.ui.leaderboard.views.TopUserView$a */
    static final class C5619a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5294d0 f14621f;

        /* renamed from: g */
        final /* synthetic */ C5344e f14622g;

        C5619a(TopUserView topUserView, C5294d0 d0Var, C5344e eVar) {
            this.f14621f = d0Var;
            this.f14622g = eVar;
        }

        public final void onClick(View view) {
            C5344e eVar = this.f14622g;
            if (eVar != null) {
                eVar.mo15045a(this.f14621f);
            }
        }
    }

    public TopUserView() {
        this(null, null, 0, 7, null);
    }

    public TopUserView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TopUserView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TopUserView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C5000q0 a = C5000q0.m20017a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewTopUserBinding.infla…ater.from(context), this)");
        this.f14620z = a;
    }

    public /* synthetic */ TopUserView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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

    /* renamed from: c */
    private final int m21497c(int i) {
        return i != 1 ? i != 2 ? i != 3 ? R.color.gray_300 : R.color.bronze : R.color.silver : R.color.gold;
    }

    /* renamed from: a */
    public final void mo15246a(C5294d0 d0Var, C5344e eVar) {
        C5942k.m22327b(d0Var, "user");
        C5000q0 q0Var = this.f14620z;
        C5292c0 g = d0Var.mo14890g();
        if (g != null) {
            int c = m21497c(g.mo14872d());
            AppCompatTextView appCompatTextView = q0Var.f13161f;
            String str = "textPlace";
            C5942k.m22324a((Object) appCompatTextView, str);
            appCompatTextView.setText(String.valueOf(g.mo14872d()));
            AppCompatTextView appCompatTextView2 = q0Var.f13161f;
            C5942k.m22324a((Object) appCompatTextView2, str);
            Context context = getContext();
            String str2 = "context";
            C5942k.m22324a((Object) context, str2);
            appCompatTextView2.setBackground(C5699e.m21784a(context, R.drawable.bg_circle, c));
            AppCompatImageView appCompatImageView = q0Var.f13157b;
            C5942k.m22324a((Object) appCompatImageView, "imageAvatar");
            C5708k.m21801a(appCompatImageView, d0Var.mo14886d());
            q0Var.f13157b.setOnClickListener(new C5619a(this, d0Var, eVar));
            AppCompatImageView appCompatImageView2 = q0Var.f13158c;
            Context context2 = getContext();
            C5942k.m22324a((Object) context2, str2);
            C0387e.m2012a((ImageView) appCompatImageView2, ColorStateList.valueOf(C5699e.m21783a(context2, c)));
            MaterialTextView materialTextView = q0Var.f13159d;
            C5942k.m22324a((Object) materialTextView, "textName");
            materialTextView.setText(d0Var.mo14884b());
            MaterialTextView materialTextView2 = q0Var.f13160e;
            C5942k.m22324a((Object) materialTextView2, "textNickname");
            materialTextView2.setText(d0Var.mo14889f());
            MaterialTextView materialTextView3 = q0Var.f13162g;
            String str3 = "textPoints";
            C5942k.m22324a((Object) materialTextView3, str3);
            materialTextView3.setText(String.valueOf(g.mo14871c()));
            MaterialTextView materialTextView4 = q0Var.f13162g;
            C5942k.m22324a((Object) materialTextView4, str3);
            Context context3 = getContext();
            C5942k.m22324a((Object) context3, str2);
            materialTextView4.setBackground(C5699e.m21784a(context3, R.drawable.bg_rounded_rect_10, c));
        }
    }
}
