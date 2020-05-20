package com.bumptech.glide.p021n;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* renamed from: com.bumptech.glide.n.d */
public class C1230d {

    /* renamed from: a */
    private final byte[] f4107a = new byte[256];

    /* renamed from: b */
    private ByteBuffer f4108b;

    /* renamed from: c */
    private C1229c f4109c;

    /* renamed from: d */
    private int f4110d = 0;

    /* renamed from: a */
    private int[] m5758a(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.f4108b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            String str = "GifHeaderParser";
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Format Error Reading Color Table", e);
            }
            this.f4109c.f4095b = 1;
        }
        return iArr;
    }

    /* renamed from: b */
    private void m5759b(int i) {
        boolean z = false;
        while (!z && !m5760c() && this.f4109c.f4096c <= i) {
            int d = m5761d();
            if (d == 33) {
                int d2 = m5761d();
                if (d2 != 1) {
                    if (d2 == 249) {
                        this.f4109c.f4097d = new C1228b();
                        m5765h();
                    } else if (d2 != 254 && d2 == 255) {
                        m5763f();
                        StringBuilder sb = new StringBuilder();
                        for (int i2 = 0; i2 < 11; i2++) {
                            sb.append((char) this.f4107a[i2]);
                        }
                        if (sb.toString().equals("NETSCAPE2.0")) {
                            m5768k();
                        }
                    }
                }
                m5771n();
            } else if (d == 44) {
                C1229c cVar = this.f4109c;
                if (cVar.f4097d == null) {
                    cVar.f4097d = new C1228b();
                }
                m5762e();
            } else if (d != 59) {
                this.f4109c.f4095b = 1;
            } else {
                z = true;
            }
        }
    }

    /* renamed from: c */
    private boolean m5760c() {
        return this.f4109c.f4095b != 0;
    }

    /* renamed from: d */
    private int m5761d() {
        try {
            return this.f4108b.get() & 255;
        } catch (Exception unused) {
            this.f4109c.f4095b = 1;
            return 0;
        }
    }

    /* renamed from: e */
    private void m5762e() {
        this.f4109c.f4097d.f4083a = m5769l();
        this.f4109c.f4097d.f4084b = m5769l();
        this.f4109c.f4097d.f4085c = m5769l();
        this.f4109c.f4097d.f4086d = m5769l();
        int d = m5761d();
        boolean z = false;
        boolean z2 = (d & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        C1228b bVar = this.f4109c.f4097d;
        if ((d & 64) != 0) {
            z = true;
        }
        bVar.f4087e = z;
        C1228b bVar2 = this.f4109c.f4097d;
        if (z2) {
            bVar2.f4093k = m5758a(pow);
        } else {
            bVar2.f4093k = null;
        }
        this.f4109c.f4097d.f4092j = this.f4108b.position();
        m5772o();
        if (!m5760c()) {
            C1229c cVar = this.f4109c;
            cVar.f4096c++;
            cVar.f4098e.add(cVar.f4097d);
        }
    }

    /* renamed from: f */
    private void m5763f() {
        int d = m5761d();
        this.f4110d = d;
        if (d > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.f4110d) {
                try {
                    i2 = this.f4110d - i;
                    this.f4108b.get(this.f4107a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    String str = "GifHeaderParser";
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error Reading Block n: ");
                        sb.append(i);
                        sb.append(" count: ");
                        sb.append(i2);
                        sb.append(" blockSize: ");
                        sb.append(this.f4110d);
                        Log.d(str, sb.toString(), e);
                    }
                    this.f4109c.f4095b = 1;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m5764g() {
        m5759b(Integer.MAX_VALUE);
    }

    /* renamed from: h */
    private void m5765h() {
        m5761d();
        int d = m5761d();
        C1228b bVar = this.f4109c.f4097d;
        int i = (d & 28) >> 2;
        bVar.f4089g = i;
        boolean z = true;
        if (i == 0) {
            bVar.f4089g = 1;
        }
        C1228b bVar2 = this.f4109c.f4097d;
        if ((d & 1) == 0) {
            z = false;
        }
        bVar2.f4088f = z;
        int l = m5769l();
        if (l < 2) {
            l = 10;
        }
        C1228b bVar3 = this.f4109c.f4097d;
        bVar3.f4091i = l * 10;
        bVar3.f4090h = m5761d();
        m5761d();
    }

    /* renamed from: i */
    private void m5766i() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) m5761d());
        }
        if (!sb.toString().startsWith("GIF")) {
            this.f4109c.f4095b = 1;
            return;
        }
        m5767j();
        if (this.f4109c.f4101h && !m5760c()) {
            C1229c cVar = this.f4109c;
            cVar.f4094a = m5758a(cVar.f4102i);
            C1229c cVar2 = this.f4109c;
            cVar2.f4105l = cVar2.f4094a[cVar2.f4103j];
        }
    }

    /* renamed from: j */
    private void m5767j() {
        this.f4109c.f4099f = m5769l();
        this.f4109c.f4100g = m5769l();
        int d = m5761d();
        this.f4109c.f4101h = (d & 128) != 0;
        this.f4109c.f4102i = (int) Math.pow(2.0d, (double) ((d & 7) + 1));
        this.f4109c.f4103j = m5761d();
        this.f4109c.f4104k = m5761d();
    }

    /* renamed from: k */
    private void m5768k() {
        do {
            m5763f();
            byte[] bArr = this.f4107a;
            if (bArr[0] == 1) {
                this.f4109c.f4106m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f4110d <= 0) {
                return;
            }
        } while (!m5760c());
    }

    /* renamed from: l */
    private int m5769l() {
        return this.f4108b.getShort();
    }

    /* renamed from: m */
    private void m5770m() {
        this.f4108b = null;
        Arrays.fill(this.f4107a, 0);
        this.f4109c = new C1229c();
        this.f4110d = 0;
    }

    /* renamed from: n */
    private void m5771n() {
        int d;
        do {
            d = m5761d();
            this.f4108b.position(Math.min(this.f4108b.position() + d, this.f4108b.limit()));
        } while (d > 0);
    }

    /* renamed from: o */
    private void m5772o() {
        m5761d();
        m5771n();
    }

    /* renamed from: a */
    public C1230d mo5175a(ByteBuffer byteBuffer) {
        m5770m();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f4108b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f4108b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }

    /* renamed from: a */
    public void mo5176a() {
        this.f4108b = null;
        this.f4109c = null;
    }

    /* renamed from: b */
    public C1229c mo5177b() {
        if (this.f4108b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (m5760c()) {
            return this.f4109c;
        } else {
            m5766i();
            if (!m5760c()) {
                m5764g();
                C1229c cVar = this.f4109c;
                if (cVar.f4096c < 0) {
                    cVar.f4095b = 1;
                }
            }
            return this.f4109c;
        }
    }
}
