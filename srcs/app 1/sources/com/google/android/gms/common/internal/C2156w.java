package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.C2166k;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.w */
public class C2156w {

    /* renamed from: a */
    private final Resources f6117a;

    /* renamed from: b */
    private final String f6118b;

    public C2156w(Context context) {
        C2148s.m8834a(context);
        Resources resources = context.getResources();
        this.f6117a = resources;
        this.f6118b = resources.getResourcePackageName(C2166k.common_google_play_services_unknown_issue);
    }

    @Nullable
    /* renamed from: a */
    public String mo6948a(String str) {
        int identifier = this.f6117a.getIdentifier(str, "string", this.f6118b);
        if (identifier == 0) {
            return null;
        }
        return this.f6117a.getString(identifier);
    }
}
