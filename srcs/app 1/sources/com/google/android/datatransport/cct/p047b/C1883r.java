package com.google.android.datatransport.cct.p047b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.google.android.datatransport.cct.b.r */
public abstract class C1883r {

    /* renamed from: com.google.android.datatransport.cct.b.r$a */
    public static abstract class C1884a {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C1884a mo6375a(int i);

        /* renamed from: a */
        public abstract C1884a mo6376a(long j);

        /* renamed from: a */
        public abstract C1884a mo6377a(C1854b bVar);

        /* renamed from: a */
        public abstract C1884a mo6378a(C1875m mVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract C1884a mo6379a(String str);

        /* renamed from: a */
        public abstract C1884a mo6380a(List<C1880p> list);

        /* renamed from: a */
        public abstract C1883r mo6381a();

        /* renamed from: b */
        public C1884a mo6395b(int i) {
            mo6375a(i);
            return this;
        }

        /* renamed from: b */
        public abstract C1884a mo6382b(long j);

        /* renamed from: b */
        public C1884a mo6396b(String str) {
            mo6379a(str);
            return this;
        }
    }

    /* renamed from: a */
    public static C1884a m8050a() {
        C1868b bVar = new C1868b();
        bVar.mo6375a((int) RecyclerView.UNDEFINED_DURATION);
        return bVar;
    }
}
