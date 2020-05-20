package p255io.stashteam.stashapp.p298ui.game.detail.blocks.own_review;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import p255io.stashteam.stashapp.p262c.C4999q;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock */
public final class OwnReviewBlock extends ConstraintLayout {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C5541a f14464A;

    /* renamed from: z */
    private final C4999q f14465z;

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock$a */
    public interface C5541a {
        /* renamed from: j */
        void mo15145j();
    }

    /* renamed from: io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock$b */
    static final class C5542b implements OnClickListener {

        /* renamed from: f */
        final /* synthetic */ OwnReviewBlock f14466f;

        C5542b(OwnReviewBlock ownReviewBlock) {
            this.f14466f = ownReviewBlock;
        }

        public final void onClick(View view) {
            C5541a a = this.f14466f.f14464A;
            if (a != null) {
                a.mo15145j();
            }
        }
    }

    public OwnReviewBlock() {
        this(null, null, 0, 7, null);
    }

    public OwnReviewBlock(Context context) {
        this(context, null, 0, 6, null);
    }

    public OwnReviewBlock(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public OwnReviewBlock(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4999q a = C4999q.m20014a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "BlockOwnReviewBinding.in…ater.from(context), this)");
        this.f14465z = a;
    }

    public /* synthetic */ OwnReviewBlock(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        if ((r4.length() > 0) == true) goto L_0x005c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15183a(p255io.stashteam.stashapp.p269e.p280c.C5306l r7, p255io.stashteam.stashapp.p269e.p280c.C5294d0 r8) {
        /*
            r6 = this;
            r0 = 8
            if (r7 == 0) goto L_0x00b1
            io.stashteam.stashapp.e.c.n r1 = r7.mo14963e()
            io.stashteam.stashapp.e.c.n r2 = p255io.stashteam.stashapp.p269e.p280c.C5308n.f13936h
            if (r1 != r2) goto L_0x000e
            goto L_0x00b1
        L_0x000e:
            r1 = 0
            r6.setVisibility(r1)
            io.stashteam.stashapp.c.q r2 = r6.f14465z
            androidx.appcompat.widget.AppCompatRatingBar r2 = r2.f13153d
            java.lang.String r3 = "binding.ratingBar"
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            io.stashteam.stashapp.e.c.v r4 = r7.mo14962d()
            boolean r4 = r4.mo15000i()
            if (r4 == 0) goto L_0x0027
            r4 = 0
            goto L_0x0029
        L_0x0027:
            r4 = 8
        L_0x0029:
            r2.setVisibility(r4)
            io.stashteam.stashapp.c.q r2 = r6.f14465z
            androidx.appcompat.widget.AppCompatRatingBar r2 = r2.f13153d
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            io.stashteam.stashapp.e.c.v r3 = r7.mo14962d()
            int r3 = r3.mo14999h()
            float r3 = (float) r3
            r2.setRating(r3)
            io.stashteam.stashapp.c.q r2 = r6.f14465z
            androidx.appcompat.widget.AppCompatTextView r2 = r2.f13154e
            java.lang.String r3 = "binding.textReview"
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            java.lang.String r4 = r7.mo14959a()
            r5 = 1
            if (r4 == 0) goto L_0x005b
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0057
            r4 = 1
            goto L_0x0058
        L_0x0057:
            r4 = 0
        L_0x0058:
            if (r4 != r5) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r5 = 0
        L_0x005c:
            if (r5 == 0) goto L_0x0060
            r4 = 0
            goto L_0x0062
        L_0x0060:
            r4 = 8
        L_0x0062:
            r2.setVisibility(r4)
            io.stashteam.stashapp.c.q r2 = r6.f14465z
            androidx.appcompat.widget.AppCompatTextView r2 = r2.f13154e
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            java.lang.String r3 = r7.mo14959a()
            r2.setText(r3)
            io.stashteam.stashapp.c.q r2 = r6.f14465z
            androidx.appcompat.widget.AppCompatImageView r2 = r2.f13152c
            java.lang.String r3 = "binding.imageComplete"
            p308k.p323z.p325d.C5942k.m22324a(r2, r3)
            boolean r7 = r7.mo14960b()
            if (r7 == 0) goto L_0x0083
            r0 = 0
        L_0x0083:
            r2.setVisibility(r0)
            if (r8 == 0) goto L_0x00a8
            io.stashteam.stashapp.c.q r7 = r6.f14465z
            androidx.appcompat.widget.AppCompatTextView r7 = r7.f13155f
            java.lang.String r0 = "binding.textUserName"
            p308k.p323z.p325d.C5942k.m22324a(r7, r0)
            java.lang.String r0 = r8.mo14884b()
            r7.setText(r0)
            io.stashteam.stashapp.c.q r7 = r6.f14465z
            androidx.appcompat.widget.AppCompatImageView r7 = r7.f13151b
            java.lang.String r0 = "binding.imageAvatar"
            p308k.p323z.p325d.C5942k.m22324a(r7, r0)
            java.lang.String r8 = r8.mo14886d()
            p255io.stashteam.stashapp.utils.p304f.C5708k.m21801a(r7, r8)
        L_0x00a8:
            io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock$b r7 = new io.stashteam.stashapp.ui.game.detail.blocks.own_review.OwnReviewBlock$b
            r7.<init>(r6)
            r6.setOnClickListener(r7)
            return
        L_0x00b1:
            r6.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p255io.stashteam.stashapp.p298ui.game.detail.blocks.own_review.OwnReviewBlock.mo15183a(io.stashteam.stashapp.e.c.l, io.stashteam.stashapp.e.c.d0):void");
    }

    public final void setActionListener(C5541a aVar) {
        C5942k.m22327b(aVar, "listener");
        this.f14464A = aVar;
    }
}
