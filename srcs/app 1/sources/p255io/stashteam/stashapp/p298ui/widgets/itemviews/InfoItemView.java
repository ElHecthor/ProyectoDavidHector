package p255io.stashteam.stashapp.p298ui.widgets.itemviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import p255io.stashteam.stashapp.C4935a;
import p255io.stashteam.stashapp.p262c.C4992m0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.itemviews.InfoItemView */
public final class InfoItemView extends ConstraintLayout {

    /* renamed from: A */
    private int f14749A;

    /* renamed from: B */
    private int f14750B;

    /* renamed from: C */
    private boolean f14751C;

    /* renamed from: D */
    private final C4992m0 f14752D;

    /* renamed from: z */
    private int f14753z;

    public InfoItemView() {
        this(null, null, 0, 7, null);
    }

    public InfoItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public InfoItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public InfoItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14751C = true;
        C4992m0 a = C4992m0.m19993a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewInfoItemBinding.infl…ater.from(context), this)");
        this.f14752D = a;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, C4935a.InfoItemView) : null;
        if (obtainStyledAttributes != null) {
            this.f14753z = obtainStyledAttributes.getResourceId(3, 0);
            this.f14749A = obtainStyledAttributes.getResourceId(2, 0);
            this.f14750B = obtainStyledAttributes.getResourceId(0, 0);
            this.f14751C = obtainStyledAttributes.getBoolean(1, true);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ InfoItemView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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
        setTitle(this.f14753z);
        setSubtitle(this.f14749A);
        this.f14752D.f13122c.setImageResource(this.f14750B);
        AppCompatImageView appCompatImageView = this.f14752D.f13121b;
        C5942k.m22324a((Object) appCompatImageView, "binding.imageArrow");
        appCompatImageView.setVisibility(this.f14751C ? 0 : 8);
    }

    public final void setSubtitle(int i) {
        AppCompatTextView appCompatTextView = this.f14752D.f13123d;
        if (i == 0) {
            appCompatTextView.setVisibility(8);
            return;
        }
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(i);
    }

    public final void setTitle(int i) {
        MaterialTextView materialTextView = this.f14752D.f13124e;
        if (i == 0) {
            materialTextView.setVisibility(8);
            return;
        }
        materialTextView.setVisibility(0);
        materialTextView.setText(i);
    }

    public final void setTitle(String str) {
        MaterialTextView materialTextView = this.f14752D.f13124e;
        int i = 0;
        if (!(str != null)) {
            i = 8;
        }
        materialTextView.setVisibility(i);
        materialTextView.setText(str);
    }
}
