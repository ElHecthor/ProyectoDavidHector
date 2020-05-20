package p255io.stashteam.stashapp.p298ui.widgets.itemviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p255io.stashteam.stashapp.C4935a;
import p255io.stashteam.stashapp.p262c.C4996o0;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.itemviews.SettingItemView */
public final class SettingItemView extends ConstraintLayout {

    /* renamed from: A */
    private int f14754A;

    /* renamed from: B */
    private boolean f14755B;

    /* renamed from: C */
    private boolean f14756C;

    /* renamed from: D */
    private final C4996o0 f14757D;

    /* renamed from: z */
    private int f14758z;

    public SettingItemView() {
        this(null, null, 0, 7, null);
    }

    public SettingItemView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SettingItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SettingItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14755B = true;
        this.f14756C = true;
        C4996o0 a = C4996o0.m20005a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewSettingItemBinding.i…ater.from(context), this)");
        this.f14757D = a;
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, C4935a.SettingItemView) : null;
        if (obtainStyledAttributes != null) {
            this.f14758z = obtainStyledAttributes.getResourceId(2, 0);
            this.f14754A = obtainStyledAttributes.getResourceId(1, 0);
            this.f14755B = obtainStyledAttributes.getBoolean(3, true);
            this.f14756C = obtainStyledAttributes.getBoolean(0, true);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ SettingItemView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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
    public final void mo15310a(boolean z) {
        View view = this.f14757D.f13135b;
        C5942k.m22324a((Object) view, "binding.dividerBottom");
        view.setVisibility(z ^ true ? 0 : 8);
    }

    /* renamed from: b */
    public final void mo15311b(boolean z) {
        View view = this.f14757D.f13136c;
        C5942k.m22324a((Object) view, "binding.dividerTop");
        view.setVisibility(z ^ true ? 0 : 8);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f14758z;
        if (i != 0) {
            setTitle(i);
        }
        setLeftIcon(this.f14754A);
        mo15311b(!this.f14755B);
        mo15310a(!this.f14756C);
    }

    public final void setLeftIcon(int i) {
        AppCompatImageView appCompatImageView = this.f14757D.f13137d;
        if (i == 0) {
            appCompatImageView.setVisibility(8);
            return;
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(i);
    }

    public final void setTitle(int i) {
        this.f14757D.f13138e.setText(i);
    }

    public final void setValueText(String str) {
        AppCompatTextView appCompatTextView = this.f14757D.f13139f;
        C5942k.m22324a((Object) appCompatTextView, "binding.textValue");
        appCompatTextView.setText(str);
    }
}
