package com.bumptech.glide.load.p005n;

import android.content.res.AssetManager;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.n */
public class C0900n extends C0879b<InputStream> {
    public C0900n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m4661a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    /* renamed from: a */
    public Class<InputStream> mo4563a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4639a(InputStream inputStream) {
        inputStream.close();
    }
}
