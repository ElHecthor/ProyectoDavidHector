package p147g.p156d.p204b.p207y.p208n;

import java.util.ArrayList;
import p147g.p156d.p204b.C4485f;
import p147g.p156d.p204b.C4509v;
import p147g.p156d.p204b.C4511w;
import p147g.p156d.p204b.p205a0.C4470a;
import p147g.p156d.p204b.p205a0.C4473c;
import p147g.p156d.p204b.p207y.C4542h;
import p147g.p156d.p204b.p211z.C4632a;

/* renamed from: g.d.b.y.n.h */
public final class C4574h extends C4509v<Object> {

    /* renamed from: b */
    public static final C4511w f12011b = new C4575a();

    /* renamed from: a */
    private final C4485f f12012a;

    /* renamed from: g.d.b.y.n.h$a */
    static class C4575a implements C4511w {
        C4575a() {
        }

        /* renamed from: a */
        public <T> C4509v<T> mo13393a(C4485f fVar, C4632a<T> aVar) {
            if (aVar.mo13529a() == Object.class) {
                return new C4574h(fVar);
            }
            return null;
        }
    }

    /* renamed from: g.d.b.y.n.h$b */
    static /* synthetic */ class C4576b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12013a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                g.d.b.a0.b[] r0 = p147g.p156d.p204b.p205a0.C4472b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12013a = r0
                g.d.b.a0.b r1 = p147g.p156d.p204b.p205a0.C4472b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12013a     // Catch:{ NoSuchFieldError -> 0x001d }
                g.d.b.a0.b r1 = p147g.p156d.p204b.p205a0.C4472b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12013a     // Catch:{ NoSuchFieldError -> 0x0028 }
                g.d.b.a0.b r1 = p147g.p156d.p204b.p205a0.C4472b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12013a     // Catch:{ NoSuchFieldError -> 0x0033 }
                g.d.b.a0.b r1 = p147g.p156d.p204b.p205a0.C4472b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12013a     // Catch:{ NoSuchFieldError -> 0x003e }
                g.d.b.a0.b r1 = p147g.p156d.p204b.p205a0.C4472b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12013a     // Catch:{ NoSuchFieldError -> 0x0049 }
                g.d.b.a0.b r1 = p147g.p156d.p204b.p205a0.C4472b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p147g.p156d.p204b.p207y.p208n.C4574h.C4576b.<clinit>():void");
        }
    }

    C4574h(C4485f fVar) {
        this.f12012a = fVar;
    }

    /* renamed from: a */
    public Object mo13284a(C4470a aVar) {
        switch (C4576b.f12013a[aVar.mo13307w().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.mo13288a();
                while (aVar.mo13296i()) {
                    arrayList.add(mo13284a(aVar));
                }
                aVar.mo13293g();
                return arrayList;
            case 2:
                C4542h hVar = new C4542h();
                aVar.mo13291d();
                while (aVar.mo13296i()) {
                    hVar.put(aVar.mo13303t(), mo13284a(aVar));
                }
                aVar.mo13295h();
                return hVar;
            case 3:
                return aVar.mo13306v();
            case 4:
                return Double.valueOf(aVar.mo13300p());
            case 5:
                return Boolean.valueOf(aVar.mo13299o());
            case 6:
                aVar.mo13305u();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public void mo13285a(C4473c cVar, Object obj) {
        if (obj == null) {
            cVar.mo13329m();
            return;
        }
        C4509v a = this.f12012a.mo13337a(obj.getClass());
        if (a instanceof C4574h) {
            cVar.mo13318d();
            cVar.mo13325g();
            return;
        }
        a.mo13285a(cVar, obj);
    }
}
