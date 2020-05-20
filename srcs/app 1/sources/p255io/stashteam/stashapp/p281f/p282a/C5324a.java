package p255io.stashteam.stashapp.p281f.p282a;

import android.os.Bundle;
import androidx.appcompat.app.C0067c;
import p071f.p143x.C3657a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.a.a */
public abstract class C5324a<VB extends C3657a> extends C0067c {

    /* renamed from: w */
    protected VB f13992w;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VB v = mo15024v();
        this.f13992w = v;
        if (v != null) {
            setContentView(v.mo11568b());
        } else {
            C5942k.m22329c("binding");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final VB mo15023u() {
        VB vb = this.f13992w;
        if (vb != null) {
            return vb;
        }
        C5942k.m22329c("binding");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract VB mo15024v();
}
