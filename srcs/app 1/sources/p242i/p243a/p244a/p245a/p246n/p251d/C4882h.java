package p242i.p243a.p244a.p245a.p246n.p251d;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4834u;

/* renamed from: i.a.a.a.n.d.h */
public class C4882h implements C4877c {

    /* renamed from: a */
    private final Context f12706a;

    /* renamed from: b */
    private final File f12707b;

    /* renamed from: c */
    private final String f12708c;

    /* renamed from: d */
    private final File f12709d;

    /* renamed from: e */
    private C4834u f12710e = new C4834u(this.f12709d);

    /* renamed from: f */
    private File f12711f;

    public C4882h(Context context, File file, String str, String str2) {
        this.f12706a = context;
        this.f12707b = file;
        this.f12708c = str2;
        this.f12709d = new File(this.f12707b, str);
        m19575e();
    }

    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v1 */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 6 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m19574a(java.io.File r6, java.io.File r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close output stream"
            java.lang.String r1 = "Failed to close file input stream"
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x0024 }
            r3.<init>(r6)     // Catch:{ all -> 0x0024 }
            java.io.OutputStream r2 = r5.mo13995a(r7)     // Catch:{ all -> 0x001f }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x001f }
            p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19368a(r3, r2, r7)     // Catch:{ all -> 0x001f }
            p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19366a(r3, r1)
            p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19366a(r2, r0)
            r6.delete()
            return
        L_0x001f:
            r7 = move-exception
            r4 = r3
            r3 = r2
            r2 = r4
            goto L_0x0026
        L_0x0024:
            r7 = move-exception
            r3 = r2
        L_0x0026:
            p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19366a(r2, r1)
            p242i.p243a.p244a.p245a.p246n.p248b.C4813i.m19366a(r3, r0)
            r6.delete()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p242i.p243a.p244a.p245a.p246n.p251d.C4882h.m19574a(java.io.File, java.io.File):void");
    }

    /* renamed from: e */
    private void m19575e() {
        File file = new File(this.f12707b, this.f12708c);
        this.f12711f = file;
        if (!file.exists()) {
            this.f12711f.mkdirs();
        }
    }

    /* renamed from: a */
    public int mo13986a() {
        return this.f12710e.mo13911g();
    }

    /* renamed from: a */
    public OutputStream mo13995a(File file) {
        throw null;
    }

    /* renamed from: a */
    public List<File> mo13987a(int i) {
        ArrayList arrayList = new ArrayList();
        for (File add : this.f12711f.listFiles()) {
            arrayList.add(add);
            if (arrayList.size() >= i) {
                break;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo13988a(String str) {
        this.f12710e.close();
        m19574a(this.f12709d, new File(this.f12711f, str));
        this.f12710e = new C4834u(this.f12709d);
    }

    /* renamed from: a */
    public void mo13989a(List<File> list) {
        for (File file : list) {
            C4813i.m19379c(this.f12706a, String.format("deleting sent analytics file %s", new Object[]{file.getName()}));
            file.delete();
        }
    }

    /* renamed from: a */
    public void mo13990a(byte[] bArr) {
        this.f12710e.mo13905a(bArr);
    }

    /* renamed from: a */
    public boolean mo13991a(int i, int i2) {
        return this.f12710e.mo13907a(i, i2);
    }

    /* renamed from: b */
    public boolean mo13992b() {
        return this.f12710e.mo13909d();
    }

    /* renamed from: c */
    public List<File> mo13993c() {
        return Arrays.asList(this.f12711f.listFiles());
    }

    /* renamed from: d */
    public void mo13994d() {
        try {
            this.f12710e.close();
        } catch (IOException unused) {
        }
        this.f12709d.delete();
    }
}
