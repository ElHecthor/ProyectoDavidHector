package p255io.stashteam.stashapp.p298ui.widgets.empty_view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.emoji.widget.EmojiAppCompatTextView;
import com.google.android.material.textview.MaterialTextView;
import p255io.stashteam.stashapp.C4935a;
import p255io.stashteam.stashapp.p262c.C4986j0;
import p308k.p309a0.C5723c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.empty_view.EmptyView */
public final class EmptyView extends LinearLayout {

    /* renamed from: f */
    private int f14734f;

    /* renamed from: g */
    private int f14735g;

    /* renamed from: h */
    private final C4986j0 f14736h;

    /* renamed from: io.stashteam.stashapp.ui.widgets.empty_view.EmptyView$a */
    public enum C5671a {
        ;
        

        /* renamed from: f */
        private final String f14738f;

        private C5671a(String str, String str2) {
            this.f14738f = str;
        }

        /* renamed from: f */
        public final String mo15289f() {
            return this.f14738f;
        }
    }

    public EmptyView() {
        this(null, null, 0, 7, null);
    }

    public EmptyView(Context context) {
        this(context, null, 0, 6, null);
    }

    public EmptyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C4986j0 a = C4986j0.m19969a(LayoutInflater.from(context), this);
        C5942k.m22324a((Object) a, "ViewEmptyBinding.inflate…ater.from(context), this)");
        this.f14736h = a;
        setOrientation(1);
        setGravity(1);
        TypedArray obtainStyledAttributes = context != null ? context.obtainStyledAttributes(attributeSet, C4935a.EmptyView) : null;
        if (obtainStyledAttributes != null) {
            this.f14734f = obtainStyledAttributes.getResourceId(1, 0);
            this.f14735g = obtainStyledAttributes.getResourceId(0, 0);
        }
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ EmptyView(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
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
    private final void m21620a() {
        C5671a aVar = (C5671a) C5832h.m22115a((Object[]) C5671a.values(), (C5723c) C5723c.f14805b);
        EmojiAppCompatTextView emojiAppCompatTextView = this.f14736h.f13093c;
        C5942k.m22324a((Object) emojiAppCompatTextView, "binding.textEmoji");
        emojiAppCompatTextView.setText(aVar.mo15289f());
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m21620a();
        setTitle(this.f14734f);
        setDescription(this.f14735g);
    }

    public final void setDescription(int i) {
        MaterialTextView materialTextView = this.f14736h.f13092b;
        if (i == 0) {
            materialTextView.setVisibility(8);
            return;
        }
        materialTextView.setVisibility(0);
        materialTextView.setText(i);
    }

    public final void setDescriptionVisibility(boolean z) {
        MaterialTextView materialTextView = this.f14736h.f13092b;
        C5942k.m22324a((Object) materialTextView, "binding.textDesc");
        materialTextView.setVisibility(z ? 0 : 8);
    }

    public final void setTitle(int i) {
        MaterialTextView materialTextView = this.f14736h.f13094d;
        if (i == 0) {
            materialTextView.setVisibility(8);
            return;
        }
        materialTextView.setVisibility(0);
        materialTextView.setText(i);
    }
}
