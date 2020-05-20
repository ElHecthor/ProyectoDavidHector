package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C2213b;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2214a;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2215b;

/* renamed from: com.google.android.gms.dynamite.g */
final class C2224g implements C2213b {
    C2224g() {
    }

    /* renamed from: a */
    public final C2214a mo6994a(Context context, String str, C2215b bVar) {
        int i;
        C2214a aVar = new C2214a();
        aVar.f6204a = bVar.mo6995a(context, str);
        int a = bVar.mo6996a(context, str, true);
        aVar.f6205b = a;
        if (aVar.f6204a == 0 && a == 0) {
            i = 0;
        } else if (aVar.f6205b >= aVar.f6204a) {
            aVar.f6206c = 1;
            return aVar;
        } else {
            i = -1;
        }
        aVar.f6206c = i;
        return aVar;
    }
}
