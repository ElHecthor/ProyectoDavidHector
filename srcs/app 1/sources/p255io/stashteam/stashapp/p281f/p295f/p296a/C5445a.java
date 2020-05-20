package p255io.stashteam.stashapp.p281f.p295f.p296a;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.bottomsheet.C2594b;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import p308k.C5809q;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.f.a.a */
public final class C5445a extends C2594b {

    /* renamed from: q0 */
    private List<C5447b> f14240q0;

    /* renamed from: io.stashteam.stashapp.f.f.a.a$a */
    static final class C5446a implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ C5447b f14241f;

        /* renamed from: g */
        final /* synthetic */ C5445a f14242g;

        C5446a(C5447b bVar, C5445a aVar, LinearLayout linearLayout) {
            this.f14241f = bVar;
            this.f14242g = aVar;
        }

        public final void onClick(View view) {
            Runnable a = this.f14241f.mo15109a();
            if (a != null) {
                a.run();
            }
            this.f14242g.mo2653s0();
        }
    }

    /* renamed from: a */
    public View mo2488a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C5942k.m22327b(layoutInflater, "inflater");
        LinearLayout linearLayout = new LinearLayout(mo2568n());
        linearLayout.setOrientation(1);
        if (viewGroup != null) {
            viewGroup.addView(linearLayout);
        }
        return linearLayout;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        String str;
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view;
        List<C5447b> list = this.f14240q0;
        if (list != null) {
            for (C5447b bVar : list) {
                View inflate = LayoutInflater.from(mo2568n()).inflate(R.layout.item_action_sheet, linearLayout, false);
                if (inflate != null) {
                    AppCompatTextView appCompatTextView = (AppCompatTextView) inflate;
                    if (bVar.mo15111c() != null) {
                        Context n = mo2568n();
                        str = n != null ? n.getString(bVar.mo15111c().intValue()) : null;
                    } else {
                        str = bVar.mo15110b();
                    }
                    appCompatTextView.setText(str);
                    appCompatTextView.setOnClickListener(new C5446a(bVar, this, linearLayout));
                    linearLayout.addView(appCompatTextView);
                } else {
                    throw new C5809q("null cannot be cast to non-null type androidx.appcompat.widget.AppCompatTextView");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo15107a(List<C5447b> list) {
        C5942k.m22327b(list, "items");
        this.f14240q0 = list;
    }
}
