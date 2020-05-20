package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C2213b;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2214a;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2215b;

/* renamed from: com.google.android.gms.dynamite.c */
final class C2220c implements C2213b {
    C2220c() {
    }

    /* renamed from: a */
    public final C2214a mo6994a(Context context, String str, C2215b bVar) {
        C2214a aVar = new C2214a();
        int a = bVar.mo6996a(context, str, true);
        aVar.f6205b = a;
        if (a != 0) {
            aVar.f6206c = 1;
        } else {
            int a2 = bVar.mo6995a(context, str);
            aVar.f6204a = a2;
            if (a2 != 0) {
                aVar.f6206c = -1;
            }
        }
        return aVar;
    }
}
