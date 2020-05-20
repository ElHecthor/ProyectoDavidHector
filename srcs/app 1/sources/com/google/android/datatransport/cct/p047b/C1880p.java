package com.google.android.datatransport.cct.p047b;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.datatransport.cct.b.p */
public abstract class C1880p {

    /* renamed from: com.google.android.datatransport.cct.b.p$a */
    public static abstract class C1881a {
        /* renamed from: a */
        public abstract C1881a mo6358a(int i);

        /* renamed from: a */
        public abstract C1881a mo6359a(long j);

        /* renamed from: a */
        public abstract C1881a mo6360a(C1887u uVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C1881a mo6361a(String str);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C1881a mo6362a(byte[] bArr);

        /* renamed from: a */
        public abstract C1880p mo6363a();

        /* renamed from: b */
        public abstract C1881a mo6364b(long j);

        /* renamed from: c */
        public abstract C1881a mo6365c(long j);
    }

    /* renamed from: a */
    public static C1881a m8036a(String str) {
        C1865b bVar = new C1865b();
        bVar.mo6358a((int) RecyclerView.UNDEFINED_DURATION);
        bVar.mo6361a(str);
        return bVar;
    }

    /* renamed from: a */
    public static C1881a m8037a(byte[] bArr) {
        C1865b bVar = new C1865b();
        bVar.mo6358a((int) RecyclerView.UNDEFINED_DURATION);
        bVar.mo6362a(bArr);
        return bVar;
    }

    /* renamed from: a */
    public abstract long mo6348a();

    /* renamed from: b */
    public abstract long mo6349b();

    /* renamed from: c */
    public abstract long mo6350c();
}
