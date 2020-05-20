package com.crashlytics.android.p033e;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.C4795l;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4834u;
import p242i.p243a.p244a.p245a.p246n.p248b.C4834u.C4838d;

/* renamed from: com.crashlytics.android.e.m0 */
class C1456m0 implements C1492y {

    /* renamed from: a */
    private final File f4607a;

    /* renamed from: b */
    private final int f4608b;

    /* renamed from: c */
    private C4834u f4609c;

    /* renamed from: com.crashlytics.android.e.m0$a */
    class C1457a implements C4838d {

        /* renamed from: a */
        final /* synthetic */ byte[] f4610a;

        /* renamed from: b */
        final /* synthetic */ int[] f4611b;

        C1457a(C1456m0 m0Var, byte[] bArr, int[] iArr) {
            this.f4610a = bArr;
            this.f4611b = iArr;
        }

        /* renamed from: a */
        public void mo5644a(InputStream inputStream, int i) {
            try {
                inputStream.read(this.f4610a, this.f4611b[0], i);
                int[] iArr = this.f4611b;
                iArr[0] = iArr[0] + i;
            } finally {
                inputStream.close();
            }
        }
    }

    /* renamed from: com.crashlytics.android.e.m0$b */
    public class C1458b {

        /* renamed from: a */
        public final byte[] f4612a;

        /* renamed from: b */
        public final int f4613b;

        public C1458b(C1456m0 m0Var, byte[] bArr, int i) {
            this.f4612a = bArr;
            this.f4613b = i;
        }
    }

    public C1456m0(File file, int i) {
        this.f4607a = file;
        this.f4608b = i;
    }

    /* renamed from: b */
    private void m6624b(long j, String str) {
        String str2 = " ";
        if (this.f4609c != null) {
            if (str == null) {
                str = "null";
            }
            try {
                int i = this.f4608b / 4;
                if (str.length() > i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("...");
                    sb.append(str.substring(str.length() - i));
                    str = sb.toString();
                }
                this.f4609c.mo13905a(String.format(Locale.US, "%d %s%n", new Object[]{Long.valueOf(j), str.replaceAll("\r", str2).replaceAll("\n", str2)}).getBytes("UTF-8"));
                while (!this.f4609c.mo13909d() && this.f4609c.mo13911g() > this.f4608b) {
                    this.f4609c.mo13910f();
                }
            } catch (IOException e) {
                C4781c.m19229f().mo13793c("CrashlyticsCore", "There was a problem writing to the Crashlytics log.", e);
            }
        }
    }

    /* renamed from: e */
    private C1458b m6625e() {
        if (!this.f4607a.exists()) {
            return null;
        }
        m6626f();
        C4834u uVar = this.f4609c;
        if (uVar == null) {
            return null;
        }
        int[] iArr = {0};
        byte[] bArr = new byte[uVar.mo13911g()];
        try {
            this.f4609c.mo13904a((C4838d) new C1457a(this, bArr, iArr));
        } catch (IOException e) {
            C4781c.m19229f().mo13793c("CrashlyticsCore", "A problem occurred while reading the Crashlytics log file.", e);
        }
        return new C1458b(this, bArr, iArr[0]);
    }

    /* renamed from: f */
    private void m6626f() {
        if (this.f4609c == null) {
            try {
                this.f4609c = new C4834u(this.f4607a);
            } catch (IOException e) {
                C4795l f = C4781c.m19229f();
                StringBuilder sb = new StringBuilder();
                sb.append("Could not open log file: ");
                sb.append(this.f4607a);
                f.mo13793c("CrashlyticsCore", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public void mo5490a() {
        C4813i.m19366a((Closeable) this.f4609c, "There was a problem closing the Crashlytics log file.");
        this.f4609c = null;
    }

    /* renamed from: a */
    public void mo5491a(long j, String str) {
        m6626f();
        m6624b(j, str);
    }

    /* renamed from: b */
    public C1380d mo5492b() {
        C1458b e = m6625e();
        if (e == null) {
            return null;
        }
        return C1380d.m6378a(e.f4612a, 0, e.f4613b);
    }

    /* renamed from: c */
    public byte[] mo5493c() {
        C1458b e = m6625e();
        if (e == null) {
            return null;
        }
        return e.f4612a;
    }

    /* renamed from: d */
    public void mo5494d() {
        mo5490a();
        this.f4607a.delete();
    }
}
