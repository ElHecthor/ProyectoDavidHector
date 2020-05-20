package p337m.p338f0.p344h;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;
import p337m.p338f0.p344h.C6319d.C6321b;
import p350n.C6480e;
import p350n.C6483f;

/* renamed from: m.f0.h.j */
public final class C6353j implements Closeable {

    /* renamed from: l */
    private static final Logger f15780l = Logger.getLogger(C6322e.class.getName());

    /* renamed from: f */
    private final C6480e f15781f;

    /* renamed from: g */
    private int f15782g = 16384;

    /* renamed from: h */
    private boolean f15783h;

    /* renamed from: i */
    private final C6321b f15784i;

    /* renamed from: j */
    private final C6483f f15785j;

    /* renamed from: k */
    private final boolean f15786k;

    /* renamed from: m.f0.h.j$a */
    public static final class C6354a {
        private C6354a() {
        }

        public /* synthetic */ C6354a(C5938g gVar) {
            this();
        }
    }

    static {
        new C6354a(null);
    }

    public C6353j(C6483f fVar, boolean z) {
        C5942k.m22327b(fVar, "sink");
        this.f15785j = fVar;
        this.f15786k = z;
        C6480e eVar = new C6480e();
        this.f15781f = eVar;
        C6321b bVar = new C6321b(0, false, eVar, 3, null);
        this.f15784i = bVar;
    }

    /* renamed from: b */
    private final void m23973b(int i, long j) {
        while (j > 0) {
            long min = Math.min((long) this.f15782g, j);
            j -= min;
            mo16406a(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f15785j.mo16159a(this.f15781f, min);
        }
    }

    /* renamed from: a */
    public final synchronized void mo16405a() {
        if (this.f15783h) {
            throw new IOException("closed");
        } else if (this.f15786k) {
            if (f15780l.isLoggable(Level.FINE)) {
                Logger logger = f15780l;
                StringBuilder sb = new StringBuilder();
                sb.append(">> CONNECTION ");
                sb.append(C6322e.f15652a.mo16864l());
                logger.fine(C6250b.m23446a(sb.toString(), new Object[0]));
            }
            this.f15785j.mo16788a(C6322e.f15652a);
            this.f15785j.flush();
        }
    }

    /* renamed from: a */
    public final void mo16406a(int i, int i2, int i3, int i4) {
        if (f15780l.isLoggable(Level.FINE)) {
            f15780l.fine(C6322e.f15656e.mo16292a(false, i, i2, i3, i4));
        }
        boolean z = true;
        if (i2 <= this.f15782g) {
            if ((((int) 2147483648L) & i) != 0) {
                z = false;
            }
            if (z) {
                C6250b.m23460a(this.f15785j, i2);
                this.f15785j.writeByte(i3 & 255);
                this.f15785j.writeByte(i4 & 255);
                this.f15785j.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("reserved bit set: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FRAME_SIZE_ERROR length > ");
        sb2.append(this.f15782g);
        sb2.append(": ");
        sb2.append(i2);
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    /* renamed from: a */
    public final synchronized void mo16407a(int i, int i2, List<C6317c> list) {
        C5942k.m22327b(list, "requestHeaders");
        if (!this.f15783h) {
            this.f15784i.mo16289a(list);
            long x = this.f15781f.mo16834x();
            int min = (int) Math.min(((long) this.f15782g) - 4, x);
            int i3 = min + 4;
            long j = (long) min;
            int i4 = (x > j ? 1 : (x == j ? 0 : -1));
            mo16406a(i, i3, 5, i4 == 0 ? 4 : 0);
            this.f15785j.writeInt(i2 & Integer.MAX_VALUE);
            this.f15785j.mo16159a(this.f15781f, j);
            if (i4 > 0) {
                m23973b(i, x - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final void mo16408a(int i, int i2, C6480e eVar, int i3) {
        mo16406a(i, i3, 0, i2);
        if (i3 > 0) {
            C6483f fVar = this.f15785j;
            if (eVar != null) {
                fVar.mo16159a(eVar, (long) i3);
            } else {
                C5942k.m22323a();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo16409a(int i, long j) {
        if (!this.f15783h) {
            if (j != 0 && j <= 2147483647L) {
                mo16406a(i, 4, 8, 0);
                this.f15785j.writeInt((int) j);
                this.f15785j.flush();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo16410a(int i, C6315b bVar) {
        C5942k.m22327b(bVar, "errorCode");
        if (!this.f15783h) {
            if (bVar.mo16273f() != -1) {
                mo16406a(i, 4, 3, 0);
                this.f15785j.writeInt(bVar.mo16273f());
                this.f15785j.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo16411a(int i, C6315b bVar, byte[] bArr) {
        C5942k.m22327b(bVar, "errorCode");
        C5942k.m22327b(bArr, "debugData");
        if (!this.f15783h) {
            boolean z = false;
            if (bVar.mo16273f() != -1) {
                mo16406a(0, bArr.length + 8, 7, 0);
                this.f15785j.writeInt(i);
                this.f15785j.writeInt(bVar.mo16273f());
                if (bArr.length == 0) {
                    z = true;
                }
                if (!z) {
                    this.f15785j.write(bArr);
                }
                this.f15785j.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo16412a(C6360m mVar) {
        C5942k.m22327b(mVar, "peerSettings");
        if (!this.f15783h) {
            this.f15782g = mVar.mo16435b(this.f15782g);
            if (mVar.mo16430a() != -1) {
                this.f15784i.mo16287a(mVar.mo16430a());
            }
            mo16406a(0, 0, 4, 1);
            this.f15785j.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo16413a(boolean z, int i, int i2) {
        if (!this.f15783h) {
            mo16406a(0, 8, 6, z ? 1 : 0);
            this.f15785j.writeInt(i);
            this.f15785j.writeInt(i2);
            this.f15785j.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo16414a(boolean z, int i, List<C6317c> list) {
        C5942k.m22327b(list, "headerBlock");
        if (!this.f15783h) {
            this.f15784i.mo16289a(list);
            long x = this.f15781f.mo16834x();
            long min = Math.min((long) this.f15782g, x);
            int i2 = (x > min ? 1 : (x == min ? 0 : -1));
            int i3 = i2 == 0 ? 4 : 0;
            if (z) {
                i3 |= 1;
            }
            mo16406a(i, (int) min, 1, i3);
            this.f15785j.mo16159a(this.f15781f, min);
            if (i2 > 0) {
                m23973b(i, x - min);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public final synchronized void mo16415a(boolean z, int i, C6480e eVar, int i2) {
        if (!this.f15783h) {
            int i3 = 0;
            if (z) {
                i3 = 1;
            }
            mo16408a(i, i3, eVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public final synchronized void mo16416b(C6360m mVar) {
        C5942k.m22327b(mVar, "settings");
        if (!this.f15783h) {
            int i = 0;
            mo16406a(0, mVar.mo16438d() * 6, 4, 0);
            while (i < 10) {
                if (mVar.mo16437c(i)) {
                    int i2 = i != 4 ? i != 7 ? i : 4 : 3;
                    this.f15785j.writeShort(i2);
                    this.f15785j.writeInt(mVar.mo16431a(i));
                }
                i++;
            }
            this.f15785j.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void close() {
        this.f15783h = true;
        this.f15785j.close();
    }

    /* renamed from: d */
    public final int mo16418d() {
        return this.f15782g;
    }

    public final synchronized void flush() {
        if (!this.f15783h) {
            this.f15785j.flush();
        } else {
            throw new IOException("closed");
        }
    }
}
