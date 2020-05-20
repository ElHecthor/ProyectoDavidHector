package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.C2078b;
import com.google.android.gms.common.api.internal.C2014b;
import java.util.ArrayList;
import p071f.p088e.C3162a;

/* renamed from: com.google.android.gms.common.api.c */
public class C1996c extends Exception {

    /* renamed from: f */
    private final C3162a<C2014b<?>, C2078b> f5808f;

    public C1996c(C3162a<C2014b<?>, C2078b> aVar) {
        this.f5808f = aVar;
    }

    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (C2014b bVar : this.f5808f.keySet()) {
            C2078b bVar2 = (C2078b) this.f5808f.get(bVar);
            if (bVar2.mo6781k()) {
                z = false;
            }
            String a = bVar.mo6651a();
            String valueOf = String.valueOf(bVar2);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 2 + String.valueOf(valueOf).length());
            sb.append(a);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z ? "None of the queried APIs are available. " : "Some of the queried APIs are unavailable. ");
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }
}
