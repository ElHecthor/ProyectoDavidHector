package p242i.p243a.p244a.p245a.p246n.p248b;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: i.a.a.a.n.b.u */
public class C4834u implements Closeable {

    /* renamed from: l */
    private static final Logger f12626l = Logger.getLogger(C4834u.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final RandomAccessFile f12627f;

    /* renamed from: g */
    int f12628g;

    /* renamed from: h */
    private int f12629h;

    /* renamed from: i */
    private C4836b f12630i;

    /* renamed from: j */
    private C4836b f12631j;

    /* renamed from: k */
    private final byte[] f12632k = new byte[16];

    /* renamed from: i.a.a.a.n.b.u$a */
    class C4835a implements C4838d {

        /* renamed from: a */
        boolean f12633a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f12634b;

        C4835a(C4834u uVar, StringBuilder sb) {
            this.f12634b = sb;
        }

        /* renamed from: a */
        public void mo5644a(InputStream inputStream, int i) {
            if (this.f12633a) {
                this.f12633a = false;
            } else {
                this.f12634b.append(", ");
            }
            this.f12634b.append(i);
        }
    }

    /* renamed from: i.a.a.a.n.b.u$b */
    static class C4836b {

        /* renamed from: c */
        static final C4836b f12635c = new C4836b(0, 0);

        /* renamed from: a */
        final int f12636a;

        /* renamed from: b */
        final int f12637b;

        C4836b(int i, int i2) {
            this.f12636a = i;
            this.f12637b = i2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C4836b.class.getSimpleName());
            sb.append("[position = ");
            sb.append(this.f12636a);
            sb.append(", length = ");
            sb.append(this.f12637b);
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: i.a.a.a.n.b.u$c */
    private final class C4837c extends InputStream {

        /* renamed from: f */
        private int f12638f;

        /* renamed from: g */
        private int f12639g;

        private C4837c(C4836b bVar) {
            this.f12638f = C4834u.this.m19459d(bVar.f12636a + 4);
            this.f12639g = bVar.f12637b;
        }

        /* synthetic */ C4837c(C4834u uVar, C4836b bVar, C4835a aVar) {
            this(bVar);
        }

        public int read() {
            if (this.f12639g == 0) {
                return -1;
            }
            C4834u.this.f12627f.seek((long) this.f12638f);
            int read = C4834u.this.f12627f.read();
            this.f12638f = C4834u.this.m19459d(this.f12638f + 1);
            this.f12639g--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            C4834u.m19455b(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f12639g;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C4834u.this.m19449a(this.f12638f, bArr, i, i2);
            this.f12638f = C4834u.this.m19459d(this.f12638f + i2);
            this.f12639g -= i2;
            return i2;
        }
    }

    /* renamed from: i.a.a.a.n.b.u$d */
    public interface C4838d {
        /* renamed from: a */
        void mo5644a(InputStream inputStream, int i);
    }

    public C4834u(File file) {
        if (!file.exists()) {
            m19451a(file);
        }
        this.f12627f = m19454b(file);
        m19460h();
    }

    /* renamed from: a */
    private static int m19444a(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: a */
    private void m19447a(int i) {
        int i2 = i + 4;
        int i3 = m19461i();
        if (i3 < i2) {
            int i4 = this.f12628g;
            do {
                i3 += i4;
                i4 <<= 1;
            } while (i3 < i2);
            m19458c(i4);
            C4836b bVar = this.f12631j;
            int d = m19459d(bVar.f12636a + 4 + bVar.f12637b);
            if (d < this.f12630i.f12636a) {
                FileChannel channel = this.f12627f.getChannel();
                channel.position((long) this.f12628g);
                long j = (long) (d - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i5 = this.f12631j.f12636a;
            int i6 = this.f12630i.f12636a;
            if (i5 < i6) {
                int i7 = (this.f12628g + i5) - 16;
                m19448a(i4, this.f12629h, i6, i7);
                this.f12631j = new C4836b(i7, this.f12631j.f12637b);
            } else {
                m19448a(i4, this.f12629h, i6, i5);
            }
            this.f12628g = i4;
        }
    }

    /* renamed from: a */
    private void m19448a(int i, int i2, int i3, int i4) {
        m19452a(this.f12632k, i, i2, i3, i4);
        this.f12627f.seek(0);
        this.f12627f.write(this.f12632k);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19449a(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int d = m19459d(i);
        int i4 = d + i3;
        int i5 = this.f12628g;
        if (i4 <= i5) {
            this.f12627f.seek((long) d);
            randomAccessFile = this.f12627f;
        } else {
            int i6 = i5 - d;
            this.f12627f.seek((long) d);
            this.f12627f.readFully(bArr, i2, i6);
            this.f12627f.seek(16);
            randomAccessFile = this.f12627f;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static void m19451a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(file.getPath());
        sb.append(".tmp");
        File file2 = new File(sb.toString());
        RandomAccessFile b = m19454b(file2);
        try {
            b.setLength(4096);
            b.seek(0);
            byte[] bArr = new byte[16];
            m19452a(bArr, 4096, 0, 0, 0);
            b.write(bArr);
            b.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            b.close();
            throw th;
        }
    }

    /* renamed from: a */
    private static void m19452a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int b : iArr) {
            m19457b(bArr, i, b);
            i += 4;
        }
    }

    /* renamed from: b */
    private C4836b m19453b(int i) {
        if (i == 0) {
            return C4836b.f12635c;
        }
        this.f12627f.seek((long) i);
        return new C4836b(i, this.f12627f.readInt());
    }

    /* renamed from: b */
    private static RandomAccessFile m19454b(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static <T> T m19455b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: b */
    private void m19456b(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int d = m19459d(i);
        int i4 = d + i3;
        int i5 = this.f12628g;
        if (i4 <= i5) {
            this.f12627f.seek((long) d);
            randomAccessFile = this.f12627f;
        } else {
            int i6 = i5 - d;
            this.f12627f.seek((long) d);
            this.f12627f.write(bArr, i2, i6);
            this.f12627f.seek(16);
            randomAccessFile = this.f12627f;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: b */
    private static void m19457b(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: c */
    private void m19458c(int i) {
        this.f12627f.setLength((long) i);
        this.f12627f.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public int m19459d(int i) {
        int i2 = this.f12628g;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: h */
    private void m19460h() {
        this.f12627f.seek(0);
        this.f12627f.readFully(this.f12632k);
        int a = m19444a(this.f12632k, 0);
        this.f12628g = a;
        if (((long) a) <= this.f12627f.length()) {
            this.f12629h = m19444a(this.f12632k, 4);
            int a2 = m19444a(this.f12632k, 8);
            int a3 = m19444a(this.f12632k, 12);
            this.f12630i = m19453b(a2);
            this.f12631j = m19453b(a3);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("File is truncated. Expected length: ");
        sb.append(this.f12628g);
        sb.append(", Actual length: ");
        sb.append(this.f12627f.length());
        throw new IOException(sb.toString());
    }

    /* renamed from: i */
    private int m19461i() {
        return this.f12628g - mo13911g();
    }

    /* renamed from: a */
    public synchronized void mo13903a() {
        m19448a(4096, 0, 0, 0);
        this.f12629h = 0;
        this.f12630i = C4836b.f12635c;
        this.f12631j = C4836b.f12635c;
        if (this.f12628g > 4096) {
            m19458c(4096);
        }
        this.f12628g = 4096;
    }

    /* renamed from: a */
    public synchronized void mo13904a(C4838d dVar) {
        int i = this.f12630i.f12636a;
        for (int i2 = 0; i2 < this.f12629h; i2++) {
            C4836b b = m19453b(i);
            dVar.mo5644a(new C4837c(this, b, null), b.f12637b);
            i = m19459d(b.f12636a + 4 + b.f12637b);
        }
    }

    /* renamed from: a */
    public void mo13905a(byte[] bArr) {
        mo13906a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public synchronized void mo13906a(byte[] bArr, int i, int i2) {
        m19455b(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m19447a(i2);
        boolean d = mo13909d();
        C4836b bVar = new C4836b(d ? 16 : m19459d(this.f12631j.f12636a + 4 + this.f12631j.f12637b), i2);
        m19457b(this.f12632k, 0, i2);
        m19456b(bVar.f12636a, this.f12632k, 0, 4);
        m19456b(bVar.f12636a + 4, bArr, i, i2);
        m19448a(this.f12628g, this.f12629h + 1, d ? bVar.f12636a : this.f12630i.f12636a, bVar.f12636a);
        this.f12631j = bVar;
        this.f12629h++;
        if (d) {
            this.f12630i = bVar;
        }
    }

    /* renamed from: a */
    public boolean mo13907a(int i, int i2) {
        return (mo13911g() + 4) + i <= i2;
    }

    public synchronized void close() {
        this.f12627f.close();
    }

    /* renamed from: d */
    public synchronized boolean mo13909d() {
        return this.f12629h == 0;
    }

    /* renamed from: f */
    public synchronized void mo13910f() {
        if (mo13909d()) {
            throw new NoSuchElementException();
        } else if (this.f12629h == 1) {
            mo13903a();
        } else {
            int d = m19459d(this.f12630i.f12636a + 4 + this.f12630i.f12637b);
            m19449a(d, this.f12632k, 0, 4);
            int a = m19444a(this.f12632k, 0);
            m19448a(this.f12628g, this.f12629h - 1, d, this.f12631j.f12636a);
            this.f12629h--;
            this.f12630i = new C4836b(d, a);
        }
    }

    /* renamed from: g */
    public int mo13911g() {
        if (this.f12629h == 0) {
            return 16;
        }
        C4836b bVar = this.f12631j;
        int i = bVar.f12636a;
        int i2 = this.f12630i.f12636a;
        return i >= i2 ? (i - i2) + 4 + bVar.f12637b + 16 : (((i + 4) + bVar.f12637b) + this.f12628g) - i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C4834u.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f12628g);
        sb.append(", size=");
        sb.append(this.f12629h);
        sb.append(", first=");
        sb.append(this.f12630i);
        sb.append(", last=");
        sb.append(this.f12631j);
        sb.append(", element lengths=[");
        try {
            mo13904a((C4838d) new C4835a(this, sb));
        } catch (IOException e) {
            f12626l.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
