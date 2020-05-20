package p255io.stashteam.stashapp.p298ui.widgets.stats;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textview.MaterialTextView;
import p255io.stashteam.stashapp.C4935a;
import p255io.stashteam.stashapp.p262c.C4998p0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.stats.StatsView */
public final class StatsView extends ConstraintLayout {

    /* renamed from: A */
    private int f14779A;

    /* renamed from: B */
    private int f14780B;

    /* renamed from: C */
    private int f14781C;

    /* renamed from: D */
    private final C4998p0 f14782D;

    /* renamed from: z */
    private int f14783z;

    public StatsView() {
        this(null, null, 0, 7, null);
    }

    public StatsView(Context context) {
        this(context, null, 0, 6, null);
    }

    public StatsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public StatsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4998p0 a = C4998p0.m20011a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewStatsBinding.inflate…ater.from(context), this)");
        this.f14782D = a;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, C4935a.StatsView) : null;
        if (obtainStyledAttributes != null) {
            this.f14783z = obtainStyledAttributes.getResourceId(2, 0);
            this.f14779A = obtainStyledAttributes.getResourceId(3, 0);
            this.f14780B = obtainStyledAttributes.getResourceId(1, 0);
            this.f14781C = obtainStyledAttributes.getColor(0, 0);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ StatsView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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
        setTitle(this.f14783z);
        setValue(this.f14779A);
        setLeftIcon(this.f14780B);
        setIconTint(this.f14781C);
    }

    public final void setIconTint(int i) {
        AppCompatImageView appCompatImageView = this.f14782D.f13147b;
        if (i != 0) {
            C5942k.m22324a((Object) appCompatImageView, "this");
            appCompatImageView.setImageTintList(ColorStateList.valueOf(i));
        }
    }

    public final void setLeftIcon(int i) {
        AppCompatImageView appCompatImageView = this.f14782D.f13147b;
        if (i == 0) {
            appCompatImageView.setVisibility(8);
            return;
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(i);
    }

    public final void setTitle(int i) {
        if (i != 0) {
            this.f14782D.f13148c.setText(i);
        }
    }

    public final void setValue(int i) {
        if (i != 0) {
            this.f14782D.f13149d.setText(i);
        }
    }

    public final void setValue(String str) {
        C5942k.m22327b(str, "text");
        MaterialTextView materialTextView = this.f14782D.f13149d;
        C5942k.m22324a((Object) materialTextView, "binding.textValue");
        materialTextView.setText(str);
    }
}
