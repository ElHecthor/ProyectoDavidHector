package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C2034i;

/* renamed from: com.google.android.gms.common.internal.a0 */
final class C2092a0 extends C2115f {

    /* renamed from: f */
    private final /* synthetic */ Intent f5984f;

    /* renamed from: g */
    private final /* synthetic */ C2034i f5985g;

    /* renamed from: h */
    private final /* synthetic */ int f5986h;

    C2092a0(Intent intent, C2034i iVar, int i) {
        this.f5984f = intent;
        this.f5985g = iVar;
        this.f5986h = i;
    }

    /* renamed from: a */
    public final void mo6815a() {
        Intent intent = this.f5984f;
        if (intent != null) {
            this.f5985g.startActivityForResult(intent, this.f5986h);
        }
    }
}
