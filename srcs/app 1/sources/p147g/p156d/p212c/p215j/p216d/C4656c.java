package p147g.p156d.p212c.p215j.p216d;

import java.util.ArrayList;
import java.util.List;

/* renamed from: g.d.c.j.d.c */
public final class C4656c {

    /* renamed from: a */
    private final C4654a f12227a;

    /* renamed from: b */
    private final List<C4655b> f12228b;

    public C4656c(C4654a aVar) {
        this.f12227a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f12228b = arrayList;
        arrayList.add(new C4655b(aVar, new int[]{1}));
    }

    /* renamed from: a */
    private C4655b m18776a(int i) {
        if (i >= this.f12228b.size()) {
            List<C4655b> list = this.f12228b;
            C4655b bVar = (C4655b) list.get(list.size() - 1);
            for (int size = this.f12228b.size(); size <= i; size++) {
                C4654a aVar = this.f12227a;
                bVar = bVar.mo13604c(new C4655b(aVar, new int[]{1, aVar.mo13591a((size - 1) + aVar.mo13590a())}));
                this.f12228b.add(bVar);
            }
        }
        return (C4655b) this.f12228b.get(i);
    }

    /* renamed from: a */
    public void mo13607a(int[] iArr, int i) {
        if (i != 0) {
            int length = iArr.length - i;
            if (length > 0) {
                C4655b a = m18776a(i);
                int[] iArr2 = new int[length];
                System.arraycopy(iArr, 0, iArr2, 0, length);
                int[] a2 = new C4655b(this.f12227a, iArr2).mo13599a(i, 1).mo13603b(a)[1].mo13601a();
                int length2 = i - a2.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    iArr[length + i2] = 0;
                }
                System.arraycopy(a2, 0, iArr, length + length2, a2.length);
                return;
            }
            throw new IllegalArgumentException("No data bytes provided");
        }
        throw new IllegalArgumentException("No error correction bytes");
    }
}
