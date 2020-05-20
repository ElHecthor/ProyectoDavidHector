package androidx.room;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;
import p071f.p133t.p134a.C3543d;
import p071f.p133t.p134a.C3544e;

/* renamed from: androidx.room.p */
public class C0728p implements C3544e, C3543d {

    /* renamed from: n */
    static final TreeMap<Integer, C0728p> f2867n = new TreeMap<>();

    /* renamed from: f */
    private volatile String f2868f;

    /* renamed from: g */
    final long[] f2869g;

    /* renamed from: h */
    final double[] f2870h;

    /* renamed from: i */
    final String[] f2871i;

    /* renamed from: j */
    final byte[][] f2872j;

    /* renamed from: k */
    private final int[] f2873k;

    /* renamed from: l */
    final int f2874l;

    /* renamed from: m */
    int f2875m;

    /* renamed from: androidx.room.p$a */
    static class C0729a implements C3543d {

        /* renamed from: f */
        final /* synthetic */ C0728p f2876f;

        C0729a(C0728p pVar) {
            this.f2876f = pVar;
        }

        public void bindBlob(int i, byte[] bArr) {
            this.f2876f.bindBlob(i, bArr);
        }

        public void bindDouble(int i, double d) {
            this.f2876f.bindDouble(i, d);
        }

        public void bindLong(int i, long j) {
            this.f2876f.bindLong(i, j);
        }

        public void bindNull(int i) {
            this.f2876f.bindNull(i);
        }

        public void bindString(int i, String str) {
            this.f2876f.bindString(i, str);
        }

        public void close() {
        }
    }

    private C0728p(int i) {
        this.f2874l = i;
        int i2 = i + 1;
        this.f2873k = new int[i2];
        this.f2869g = new long[i2];
        this.f2870h = new double[i2];
        this.f2871i = new String[i2];
        this.f2872j = new byte[i2][];
    }

    /* renamed from: b */
    public static C0728p m4017b(C3544e eVar) {
        C0728p b = m4018b(eVar.mo4105a(), eVar.mo4115d());
        eVar.mo4107a(new C0729a(b));
        return b;
    }

    /* renamed from: b */
    public static C0728p m4018b(String str, int i) {
        synchronized (f2867n) {
            Entry ceilingEntry = f2867n.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                f2867n.remove(ceilingEntry.getKey());
                C0728p pVar = (C0728p) ceilingEntry.getValue();
                pVar.mo4108a(str, i);
                return pVar;
            }
            C0728p pVar2 = new C0728p(i);
            pVar2.mo4108a(str, i);
            return pVar2;
        }
    }

    /* renamed from: g */
    private static void m4019g() {
        if (f2867n.size() > 15) {
            int size = f2867n.size() - 10;
            Iterator it = f2867n.descendingKeySet().iterator();
            while (true) {
                int i = size - 1;
                if (size > 0) {
                    it.next();
                    it.remove();
                    size = i;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public String mo4105a() {
        return this.f2868f;
    }

    /* renamed from: a */
    public void mo4106a(C0728p pVar) {
        int d = pVar.mo4115d() + 1;
        System.arraycopy(pVar.f2873k, 0, this.f2873k, 0, d);
        System.arraycopy(pVar.f2869g, 0, this.f2869g, 0, d);
        System.arraycopy(pVar.f2871i, 0, this.f2871i, 0, d);
        System.arraycopy(pVar.f2872j, 0, this.f2872j, 0, d);
        System.arraycopy(pVar.f2870h, 0, this.f2870h, 0, d);
    }

    /* renamed from: a */
    public void mo4107a(C3543d dVar) {
        for (int i = 1; i <= this.f2875m; i++) {
            int i2 = this.f2873k[i];
            if (i2 == 1) {
                dVar.bindNull(i);
            } else if (i2 == 2) {
                dVar.bindLong(i, this.f2869g[i]);
            } else if (i2 == 3) {
                dVar.bindDouble(i, this.f2870h[i]);
            } else if (i2 == 4) {
                dVar.bindString(i, this.f2871i[i]);
            } else if (i2 == 5) {
                dVar.bindBlob(i, this.f2872j[i]);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4108a(String str, int i) {
        this.f2868f = str;
        this.f2875m = i;
    }

    public void bindBlob(int i, byte[] bArr) {
        this.f2873k[i] = 5;
        this.f2872j[i] = bArr;
    }

    public void bindDouble(int i, double d) {
        this.f2873k[i] = 3;
        this.f2870h[i] = d;
    }

    public void bindLong(int i, long j) {
        this.f2873k[i] = 2;
        this.f2869g[i] = j;
    }

    public void bindNull(int i) {
        this.f2873k[i] = 1;
    }

    public void bindString(int i, String str) {
        this.f2873k[i] = 4;
        this.f2871i[i] = str;
    }

    public void close() {
    }

    /* renamed from: d */
    public int mo4115d() {
        return this.f2875m;
    }

    /* renamed from: f */
    public void mo4116f() {
        synchronized (f2867n) {
            f2867n.put(Integer.valueOf(this.f2874l), this);
            m4019g();
        }
    }
}
