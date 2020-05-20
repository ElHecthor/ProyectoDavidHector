package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C2213b;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2214a;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2215b;

/* renamed from: com.google.android.gms.dynamite.b */
final class C2219b implements C2213b {
    C2219b() {
    }

    /* renamed from: a */
    public final C2214a mo6994a(Context context, String str, C2215b bVar) {
        C2214a aVar = new C2214a();
        int a = bVar.mo6995a(context, str);
        aVar.f6204a = a;
        if (a != 0) {
            aVar.f6206c = -1;
        } else {
            int a2 = bVar.mo6996a(context, str, true);
            aVar.f6205b = a2;
            if (a2 != 0) {
                aVar.f6206c = 1;
            }
        }
        return aVar;
    }
}
