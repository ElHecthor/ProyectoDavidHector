package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p147g.p156d.p157a.p185c.p202y.C4460d;
import p147g.p156d.p157a.p185c.p202y.C4464f;

/* renamed from: com.google.android.material.internal.g */
public class C2709g {

    /* renamed from: a */
    private final TextPaint f7882a = new TextPaint(1);

    /* renamed from: b */
    private final C4464f f7883b = new C2710a();

    /* renamed from: c */
    private float f7884c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f7885d = true;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WeakReference<C2711b> f7886e = new WeakReference<>(null);

    /* renamed from: f */
    private C4460d f7887f;

    /* renamed from: com.google.android.material.internal.g$a */
    class C2710a extends C4464f {
        C2710a() {
        }

        /* renamed from: a */
        public void mo8429a(int i) {
            C2709g.this.f7885d = true;
            C2711b bVar = (C2711b) C2709g.this.f7886e.get();
            if (bVar != null) {
                bVar.mo8504a();
            }
        }

        /* renamed from: a */
        public void mo8430a(Typeface typeface, boolean z) {
            if (!z) {
                C2709g.this.f7885d = true;
                C2711b bVar = (C2711b) C2709g.this.f7886e.get();
                if (bVar != null) {
                    bVar.mo8504a();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.internal.g$b */
    public interface C2711b {
        /* renamed from: a */
        void mo8504a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C2709g(C2711b bVar) {
        mo8994a(bVar);
    }

    /* renamed from: a */
    private float m11259a(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f7882a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: a */
    public float mo8991a(String str) {
        if (!this.f7885d) {
            return this.f7884c;
        }
        float a = m11259a((CharSequence) str);
        this.f7884c = a;
        this.f7885d = false;
        return a;
    }

    /* renamed from: a */
    public C4460d mo8992a() {
        return this.f7887f;
    }

    /* renamed from: a */
    public void mo8993a(Context context) {
        this.f7887f.mo13271b(context, this.f7882a, this.f7883b);
    }

    /* renamed from: a */
    public void mo8994a(C2711b bVar) {
        this.f7886e = new WeakReference<>(bVar);
    }

    /* renamed from: a */
    public void mo8995a(C4460d dVar, Context context) {
        if (this.f7887f != dVar) {
            this.f7887f = dVar;
            if (dVar != null) {
                dVar.mo13272c(context, this.f7882a, this.f7883b);
                C2711b bVar = (C2711b) this.f7886e.get();
                if (bVar != null) {
                    this.f7882a.drawableState = bVar.getState();
                }
                dVar.mo13271b(context, this.f7882a, this.f7883b);
                this.f7885d = true;
            }
            C2711b bVar2 = (C2711b) this.f7886e.get();
            if (bVar2 != null) {
                bVar2.mo8504a();
                bVar2.onStateChange(bVar2.getState());
            }
        }
    }

    /* renamed from: a */
    public void mo8996a(boolean z) {
        this.f7885d = z;
    }

    /* renamed from: b */
    public TextPaint mo8997b() {
        return this.f7882a;
    }
}
