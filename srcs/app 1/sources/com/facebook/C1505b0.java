package com.facebook;

import android.os.Handler;
import com.facebook.C1809s.C1810a;
import com.facebook.C1809s.C1811b;
import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.b0 */
class C1505b0 extends FilterOutputStream implements C1513c0 {

    /* renamed from: f */
    private final Map<C1797q, C1520d0> f4712f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C1809s f4713g;

    /* renamed from: h */
    private final long f4714h = C1787m.m7754o();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f4715i;

    /* renamed from: j */
    private long f4716j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f4717k;

    /* renamed from: l */
    private C1520d0 f4718l;

    /* renamed from: com.facebook.b0$a */
    class C1506a implements Runnable {

        /* renamed from: f */
        final /* synthetic */ C1811b f4719f;

        C1506a(C1811b bVar) {
            this.f4719f = bVar;
        }

        public void run() {
            this.f4719f.mo6236a(C1505b0.this.f4713g, C1505b0.this.f4715i, C1505b0.this.f4717k);
        }
    }

    C1505b0(OutputStream outputStream, C1809s sVar, Map<C1797q, C1520d0> map, long j) {
        super(outputStream);
        this.f4713g = sVar;
        this.f4712f = map;
        this.f4717k = j;
    }

    /* renamed from: a */
    private void m6790a() {
        if (this.f4715i > this.f4716j) {
            for (C1810a aVar : this.f4713g.mo6229i()) {
                if (aVar instanceof C1811b) {
                    Handler h = this.f4713g.mo6228h();
                    C1811b bVar = (C1811b) aVar;
                    if (h == null) {
                        bVar.mo6236a(this.f4713g, this.f4715i, this.f4717k);
                    } else {
                        h.post(new C1506a(bVar));
                    }
                }
            }
            this.f4716j = this.f4715i;
        }
    }

    /* renamed from: d */
    private void m6793d(long j) {
        C1520d0 d0Var = this.f4718l;
        if (d0Var != null) {
            d0Var.mo5729a(j);
        }
        long j2 = this.f4715i + j;
        this.f4715i = j2;
        if (j2 >= this.f4716j + this.f4714h || j2 >= this.f4717k) {
            m6790a();
        }
    }

    /* renamed from: a */
    public void mo5703a(C1797q qVar) {
        this.f4718l = qVar != null ? (C1520d0) this.f4712f.get(qVar) : null;
    }

    public void close() {
        super.close();
        for (C1520d0 a : this.f4712f.values()) {
            a.mo5728a();
        }
        m6790a();
    }

    public void write(int i) {
        this.out.write(i);
        m6793d(1);
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
        m6793d((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        m6793d((long) i2);
    }
}
