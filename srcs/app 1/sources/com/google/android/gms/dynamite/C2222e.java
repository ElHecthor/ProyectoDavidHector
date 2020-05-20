package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule.C2213b;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2214a;
import com.google.android.gms.dynamite.DynamiteModule.C2213b.C2215b;

/* renamed from: com.google.android.gms.dynamite.e */
final class C2222e implements C2213b {
    C2222e() {
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
        } else if (aVar.f6204a >= aVar.f6205b) {
            i = -1;
        } else {
            aVar.f6206c = 1;
            return aVar;
        }
        aVar.f6206c = i;
        return aVar;
    }
}
