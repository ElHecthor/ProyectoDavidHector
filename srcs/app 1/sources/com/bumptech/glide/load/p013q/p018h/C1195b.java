package com.bumptech.glide.load.p013q.p018h;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.p021n.C1226a.C1227a;

/* renamed from: com.bumptech.glide.load.q.h.b */
public final class C1195b implements C1227a {

    /* renamed from: a */
    private final C0921e f3993a;

    /* renamed from: b */
    private final C0916b f3994b;

    public C1195b(C0921e eVar, C0916b bVar) {
        this.f3993a = eVar;
        this.f3994b = bVar;
    }

    /* renamed from: a */
    public Bitmap mo5084a(int i, int i2, Config config) {
        return this.f3993a.mo4714b(i, i2, config);
    }

    /* renamed from: a */
    public void mo5085a(Bitmap bitmap) {
        this.f3993a.mo4713a(bitmap);
    }

    /* renamed from: a */
    public void mo5086a(byte[] bArr) {
        C0916b bVar = this.f3994b;
        if (bVar != null) {
            bVar.put(bArr);
        }
    }

    /* renamed from: a */
    public void mo5087a(int[] iArr) {
        C0916b bVar = this.f3994b;
        if (bVar != null) {
            bVar.put(iArr);
        }
    }

    /* renamed from: a */
    public byte[] mo5088a(int i) {
        C0916b bVar = this.f3994b;
        return bVar == null ? new byte[i] : (byte[]) bVar.mo4692b(i, byte[].class);
    }

    /* renamed from: b */
    public int[] mo5089b(int i) {
        C0916b bVar = this.f3994b;
        return bVar == null ? new int[i] : (int[]) bVar.mo4692b(i, int[].class);
    }
}
