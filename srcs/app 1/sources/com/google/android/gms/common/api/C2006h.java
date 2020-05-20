package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.C2046o;
import com.google.android.gms.common.internal.C2148s;

/* renamed from: com.google.android.gms.common.api.h */
public final class C2006h {

    /* renamed from: com.google.android.gms.common.api.h$a */
    private static final class C2007a<R extends C2071k> extends BasePendingResult<R> {

        /* renamed from: o */
        private final R f5822o;

        public C2007a(C2001f fVar, R r) {
            super(fVar);
            this.f5822o = r;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final R mo6558a(Status status) {
            return this.f5822o;
        }
    }

    /* renamed from: a */
    public static C2004g<Status> m8366a(Status status, C2001f fVar) {
        C2148s.m8835a(status, (Object) "Result must not be null");
        C2046o oVar = new C2046o(fVar);
        oVar.mo6634a(status);
        return oVar;
    }

    /* renamed from: a */
    public static <R extends C2071k> C2004g<R> m8367a(R r, C2001f fVar) {
        C2148s.m8835a(r, (Object) "Result must not be null");
        C2148s.m8842a(!r.mo6518c().mo6586h(), (Object) "Status code must not be SUCCESS");
        C2007a aVar = new C2007a(fVar, r);
        aVar.mo6634a(r);
        return aVar;
    }
}
