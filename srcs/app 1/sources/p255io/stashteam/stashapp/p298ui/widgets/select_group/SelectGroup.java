package p255io.stashteam.stashapp.p298ui.widgets.select_group;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import java.util.Iterator;
import p071f.p097h.p108m.C3390y;
import p308k.C5812t;
import p308k.p323z.p324c.C5918l;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.ui.widgets.select_group.SelectGroup */
public final class SelectGroup extends LinearLayout implements OnClickListener {

    /* renamed from: f */
    private C5918l<? super Integer, C5812t> f14778f;

    public SelectGroup(Context context) {
        this(context, null, 0, 6, null);
    }

    public SelectGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public SelectGroup(Context context, AttributeSet attributeSet, int i) {
        C5942k.m22327b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ SelectGroup(Context context, AttributeSet attributeSet, int i, int i2, C5938g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    private final void m21674a() {
        for (View onClickListener : C3390y.m13882a(this)) {
            onClickListener.setOnClickListener(this);
        }
    }

    /* renamed from: a */
    public final void mo15327a(int i) {
        for (View view : C3390y.m13882a(this)) {
            view.setSelected(view.getId() == i);
        }
        C5918l<? super Integer, C5812t> lVar = this.f14778f;
        if (lVar != null) {
            C5812t tVar = (C5812t) lVar.mo4090d(Integer.valueOf(i));
        }
    }

    public final Integer getSelectedId() {
        Object obj;
        Iterator it = C3390y.m13882a(this).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj).isSelected()) {
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            return Integer.valueOf(view.getId());
        }
        return null;
    }

    public void invalidate() {
        super.invalidate();
        m21674a();
    }

    public void onClick(View view) {
        if (view != null) {
            mo15327a(view.getId());
        }
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m21674a();
    }

    public final void setOnSelectedChangeListener(C5918l<? super Integer, C5812t> lVar) {
        this.f14778f = lVar;
    }
}
