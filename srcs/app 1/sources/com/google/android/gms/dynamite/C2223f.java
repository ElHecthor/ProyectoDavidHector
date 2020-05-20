package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C2213b;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2214a;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2215b;

/* renamed from: com.google.android.gms.dynamite.f */
final class C2223f implements C2213b {
    C2223f() {
    }

    /* renamed from: a */
    public final C2214a mo6994a(Context context, String str, C2215b bVar) {
        C2214a aVar = new C2214a();
        int a = bVar.mo6995a(context, str);
        aVar.f6204a = a;
        aVar.f6205b = a != 0 ? bVar.mo6996a(context, str, false) : bVar.mo6996a(context, str, true);
        if (aVar.f6204a == 0 && aVar.f6205b == 0) {
            aVar.f6206c = 0;
        } else if (aVar.f6205b >= aVar.f6204a) {
            aVar.f6206c = 1;
        } else {
            aVar.f6206c = -1;
        }
        return aVar;
    }
}
