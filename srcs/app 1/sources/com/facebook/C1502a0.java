package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.a0 */
class C1502a0 extends OutputStream implements C1513c0 {

    /* renamed from: f */
    private final Map<C1797q, C1520d0> f4704f = new HashMap();

    /* renamed from: g */
    private final Handler f4705g;

    /* renamed from: h */
    private C1797q f4706h;

    /* renamed from: i */
    private C1520d0 f4707i;

    /* renamed from: j */
    private int f4708j;

    C1502a0(Handler handler) {
        this.f4705g = handler;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5702a() {
        return this.f4708j;
    }

    /* renamed from: a */
    public void mo5703a(C1797q qVar) {
        this.f4706h = qVar;
        this.f4707i = qVar != null ? (C1520d0) this.f4704f.get(qVar) : null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public Map<C1797q, C1520d0> mo5704d() {
        return this.f4704f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5705d(long j) {
        if (this.f4707i == null) {
            C1520d0 d0Var = new C1520d0(this.f4705g, this.f4706h);
            this.f4707i = d0Var;
            this.f4704f.put(this.f4706h, d0Var);
        }
        this.f4707i.mo5730b(j);
        this.f4708j = (int) (((long) this.f4708j) + j);
    }

    public void write(int i) {
        mo5705d(1);
    }

    public void write(byte[] bArr) {
        mo5705d((long) bArr.length);
    }

    public void write(byte[] bArr, int i, int i2) {
        mo5705d((long) i2);
    }
}
