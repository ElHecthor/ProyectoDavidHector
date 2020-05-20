package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.api.internal.i */
public interface C2034i {
    /* renamed from: a */
    <T extends LifecycleCallback> T mo6671a(String str, Class<T> cls);

    /* renamed from: a */
    void mo6672a(String str, LifecycleCallback lifecycleCallback);

    /* renamed from: d */
    Activity mo6673d();

    void startActivityForResult(Intent intent, int i);
}
