package p071f.p097h.p108m.p109f0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: f.h.m.f0.a */
public final class C3345a extends ClickableSpan {

    /* renamed from: f */
    private final int f9549f;

    /* renamed from: g */
    private final C3347c f9550g;

    /* renamed from: h */
    private final int f9551h;

    public C3345a(int i, C3347c cVar, int i2) {
        this.f9549f = i;
        this.f9550g = cVar;
        this.f9551h = i2;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f9549f);
        this.f9550g.mo10749a(this.f9551h, bundle);
    }
}
