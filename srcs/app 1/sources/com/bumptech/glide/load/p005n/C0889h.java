package com.bumptech.glide.load.p005n;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* renamed from: com.bumptech.glide.load.n.h */
public class C0889h extends C0879b<ParcelFileDescriptor> {
    public C0889h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ParcelFileDescriptor m4621a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    /* renamed from: a */
    public Class<ParcelFileDescriptor> mo4563a() {
        return ParcelFileDescriptor.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4639a(ParcelFileDescriptor parcelFileDescriptor) {
        parcelFileDescriptor.close();
    }
}
