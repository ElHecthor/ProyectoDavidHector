package p255io.stashteam.stashapp.p298ui.game.detail.p301d;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputEditText;
import io.stashteam.games.tracker.stashapp.R;
import java.util.Date;
import p255io.stashteam.stashapp.p262c.C5005v;
import p255io.stashteam.stashapp.p269e.p280c.C5306l;
import p255io.stashteam.stashapp.p269e.p280c.C5308n;
import p255io.stashteam.stashapp.p269e.p280c.C5318v;
import p255io.stashteam.stashapp.p281f.p282a.C5325b;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.d.a */
public final class C5553a extends C5325b<C5005v> implements OnClickListener {

    /* renamed from: r0 */
    private C5555b f14478r0;

    /* renamed from: s0 */
    private C5554a f14479s0;

    /* renamed from: io.stashteam.stashapp.ui.game.detail.d.a$a */
    public static final class C5554a {

        /* renamed from: a */
        private final String f14480a;

        /* renamed from: b */
        private final Date f14481b;

        /* renamed from: c */
        private final C5306l f14482c;

        public C5554a(String str, Date date, C5306l lVar) {
            C5942k.m22327b(str, "gameName");
            this.f14480a = str;
            this.f14481b = date;
            this.f14482c = lVar;
        }

        /* renamed from: a */
        public final String mo15201a() {
            return this.f14480a;
        }

        /* renamed from: b */
        public final C5306l mo15202b() {
            return this.f14482c;
        }

        /* renamed from: c */
        public final Date mo15203c() {
            return this.f14481b;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
            if (p308k.p323z.p325d.C5942k.m22326a((java.lang.Object) r2.f14482c, (java.lang.Object) r3.f14482c) != false) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x0029
                boolean r0 = r3 instanceof p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.C5554a
                if (r0 == 0) goto L_0x0027
                io.stashteam.stashapp.ui.game.detail.d.a$a r3 = (p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.C5554a) r3
                java.lang.String r0 = r2.f14480a
                java.lang.String r1 = r3.f14480a
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0027
                java.util.Date r0 = r2.f14481b
                java.util.Date r1 = r3.f14481b
                boolean r0 = p308k.p323z.p325d.C5942k.m22326a(r0, r1)
                if (r0 == 0) goto L_0x0027
                io.stashteam.stashapp.e.c.l r0 = r2.f14482c
                io.stashteam.stashapp.e.c.l r3 = r3.f14482c
                boolean r3 = p308k.p323z.p325d.C5942k.m22326a(r0, r3)
                if (r3 == 0) goto L_0x0027
                goto L_0x0029
            L_0x0027:
                r3 = 0
                return r3
            L_0x0029:
                r3 = 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.C5554a.equals(java.lang.Object):boolean");
        }

        public int hashCode() {
            String str = this.f14480a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Date date = this.f14481b;
            int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
            C5306l lVar = this.f14482c;
            if (lVar != null) {
                i = lVar.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("GameReviewDialogData(gameName=");
            sb.append(this.f14480a);
            sb.append(", releaseDate=");
            sb.append(this.f14481b);
            sb.append(", gameReview=");
            sb.append(this.f14482c);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.d.a$b */
    public interface C5555b {
        /* renamed from: a */
        void mo15157a(C5306l lVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r1 != null) goto L_0x0035;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m21346b(p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.C5554a r3) {
        /*
            r2 = this;
            f.x.a r0 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r0 = (p255io.stashteam.stashapp.p262c.C5005v) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f13188i
            java.lang.String r1 = "binding.textName"
            p308k.p323z.p325d.C5942k.m22324a(r0, r1)
            java.lang.String r1 = r3.mo15201a()
            r0.setText(r1)
            f.x.a r0 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r0 = (p255io.stashteam.stashapp.p262c.C5005v) r0
            androidx.appcompat.widget.AppCompatTextView r0 = r0.f13189j
            java.lang.String r1 = "binding.textReleaseDate"
            p308k.p323z.p325d.C5942k.m22324a(r0, r1)
            java.util.Date r1 = r3.mo15203c()
            if (r1 == 0) goto L_0x002e
            java.lang.String r1 = p255io.stashteam.stashapp.utils.p304f.C5700f.m21793a(r1)
            if (r1 == 0) goto L_0x002e
            goto L_0x0035
        L_0x002e:
            r1 = 2131755147(0x7f10008b, float:1.9141165E38)
            java.lang.String r1 = r2.mo2491a(r1)
        L_0x0035:
            r0.setText(r1)
            r0 = 2131230871(0x7f080097, float:1.8077807E38)
            io.stashteam.stashapp.e.c.l r3 = r3.mo15202b()
            if (r3 == 0) goto L_0x0096
            f.x.a r0 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r0 = (p255io.stashteam.stashapp.p262c.C5005v) r0
            com.google.android.material.textfield.TextInputEditText r0 = r0.f13186g
            java.lang.String r1 = r3.mo14959a()
            r0.setText(r1)
            f.x.a r0 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r0 = (p255io.stashteam.stashapp.p262c.C5005v) r0
            io.stashteam.stashapp.ui.widgets.rate.RateView r0 = r0.f13187h
            io.stashteam.stashapp.e.c.v r1 = r3.mo14962d()
            r0.setCurrentRating(r1)
            boolean r0 = r3.mo14960b()
            if (r0 == 0) goto L_0x0078
            f.x.a r3 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r3 = (p255io.stashteam.stashapp.p262c.C5005v) r3
            com.google.android.material.chip.Chip r3 = r3.f13182c
            java.lang.String r0 = "binding.chipCompleted"
        L_0x006f:
            p308k.p323z.p325d.C5942k.m22324a(r3, r0)
            int r3 = r3.getId()
            r0 = r3
            goto L_0x0096
        L_0x0078:
            io.stashteam.stashapp.e.c.n r3 = r3.mo14963e()
            io.stashteam.stashapp.e.c.n r0 = p255io.stashteam.stashapp.p269e.p280c.C5308n.f13938j
            if (r3 != r0) goto L_0x008b
            f.x.a r3 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r3 = (p255io.stashteam.stashapp.p262c.C5005v) r3
            com.google.android.material.chip.Chip r3 = r3.f13185f
            java.lang.String r0 = "binding.chipPlaying"
            goto L_0x006f
        L_0x008b:
            f.x.a r3 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r3 = (p255io.stashteam.stashapp.p262c.C5005v) r3
            com.google.android.material.chip.Chip r3 = r3.f13184e
            java.lang.String r0 = "binding.chipPlayed"
            goto L_0x006f
        L_0x0096:
            f.x.a r3 = r2.mo15026x0()
            io.stashteam.stashapp.c.v r3 = (p255io.stashteam.stashapp.p262c.C5005v) r3
            com.google.android.material.chip.ChipGroup r3 = r3.f13183d
            r3.mo8438a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.p301d.C5553a.m21346b(io.stashteam.stashapp.ui.game.detail.d.a$a):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5005v m21348a(ViewGroup viewGroup) {
        C5005v a = C5005v.m20035a(mo2585u(), viewGroup, false);
        C5942k.m22324a((Object) a, "DialogReviewGameBinding.…flater, container, false)");
        return a;
    }

    /* renamed from: a */
    public void mo2506a(View view, Bundle bundle) {
        C5942k.m22327b(view, "view");
        super.mo2506a(view, bundle);
        Context n = mo2568n();
        view.setBackground(n != null ? n.getDrawable(R.drawable.bg_bottom_sheet_white) : null);
        C5554a aVar = this.f14479s0;
        if (aVar != null) {
            m21346b(aVar);
        }
        ((C5005v) mo15026x0()).f13181b.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo15198a(C5554a aVar) {
        C5942k.m22327b(aVar, "data");
        this.f14479s0 = aVar;
    }

    /* renamed from: a */
    public final void mo15199a(C5555b bVar) {
        C5942k.m22327b(bVar, "listener");
        this.f14478r0 = bVar;
    }

    public void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.btn_save) {
            TextInputEditText textInputEditText = ((C5005v) mo15026x0()).f13186g;
            C5942k.m22324a((Object) textInputEditText, "binding.inputReview");
            String valueOf2 = String.valueOf(textInputEditText.getText());
            C5318v currentRating = ((C5005v) mo15026x0()).f13187h.getCurrentRating();
            Chip chip = ((C5005v) mo15026x0()).f13185f;
            C5942k.m22324a((Object) chip, "binding.chipPlaying");
            C5308n nVar = chip.isChecked() ? C5308n.f13938j : C5308n.f13937i;
            Chip chip2 = ((C5005v) mo15026x0()).f13182c;
            C5942k.m22324a((Object) chip2, "binding.chipCompleted");
            C5306l lVar = new C5306l(valueOf2, currentRating, nVar, chip2.isChecked(), null, 16, null);
            C5555b bVar = this.f14478r0;
            if (bVar != null) {
                bVar.mo15157a(lVar);
            }
            mo2653s0();
        }
    }
}
