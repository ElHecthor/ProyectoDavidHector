package p242i.p243a.p244a.p245a.p246n.p251d;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4819k;

/* renamed from: i.a.a.a.n.d.b */
public abstract class C4874b<T> {

    /* renamed from: a */
    protected final Context f12698a;

    /* renamed from: b */
    protected final C4873a<T> f12699b;

    /* renamed from: c */
    protected final C4819k f12700c;

    /* renamed from: d */
    protected final C4877c f12701d;

    /* renamed from: e */
    private final int f12702e;

    /* renamed from: f */
    protected final List<C4878d> f12703f = new CopyOnWriteArrayList();

    /* renamed from: i.a.a.a.n.d.b$a */
    class C4875a implements Comparator<C4876b> {
        C4875a(C4874b bVar) {
        }

        /* renamed from: a */
        public int compare(C4876b bVar, C4876b bVar2) {
            return (int) (bVar.f12705b - bVar2.f12705b);
        }
    }

    /* renamed from: i.a.a.a.n.d.b$b */
    static class C4876b {

        /* renamed from: a */
        final File f12704a;

        /* renamed from: b */
        final long f12705b;

        public C4876b(File file, long j) {
            this.f12704a = file;
            this.f12705b = j;
        }
    }

    public C4874b(Context context, C4873a<T> aVar, C4819k kVar, C4877c cVar, int i) {
        this.f12698a = context.getApplicationContext();
        this.f12699b = aVar;
        this.f12701d = cVar;
        this.f12700c = kVar;
        kVar.mo13877a();
        this.f12702e = i;
    }

    /* renamed from: a */
    private void m19546a(int i) {
        if (!this.f12701d.mo13991a(i, mo5471e())) {
            C4813i.m19363a(this.f12698a, 4, "Fabric", String.format(Locale.US, "session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", new Object[]{Integer.valueOf(this.f12701d.mo13986a()), Integer.valueOf(i), Integer.valueOf(mo5471e())}));
            mo13983g();
        }
    }

    /* renamed from: b */
    private void m19547b(String str) {
        for (C4878d a : this.f12703f) {
            try {
                a.mo5419a(str);
            } catch (Exception e) {
                C4813i.m19364a(this.f12698a, "One of the roll over listeners threw an exception", (Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public long mo13976a(String str) {
        String[] split = str.split("_");
        if (split.length != 3) {
            return 0;
        }
        try {
            return Long.valueOf(split[2]).longValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo13977a() {
        C4877c cVar = this.f12701d;
        cVar.mo13989a(cVar.mo13993c());
        this.f12701d.mo13994d();
    }

    /* renamed from: a */
    public void mo13978a(C4878d dVar) {
        if (dVar != null) {
            this.f12703f.add(dVar);
        }
    }

    /* renamed from: a */
    public void mo13979a(T t) {
        byte[] a = this.f12699b.mo5413a(t);
        m19546a(a.length);
        this.f12701d.mo13990a(a);
    }

    /* renamed from: a */
    public void mo13980a(List<File> list) {
        this.f12701d.mo13989a(list);
    }

    /* renamed from: b */
    public void mo13981b() {
        List<File> c = this.f12701d.mo13993c();
        int f = mo5472f();
        if (c.size() > f) {
            int size = c.size() - f;
            C4813i.m19379c(this.f12698a, String.format(Locale.US, "Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", new Object[]{Integer.valueOf(c.size()), Integer.valueOf(f), Integer.valueOf(size)}));
            TreeSet treeSet = new TreeSet(new C4875a(this));
            for (File file : c) {
                treeSet.add(new C4876b(file, mo13976a(file.getName())));
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = treeSet.iterator();
            while (it.hasNext()) {
                arrayList.add(((C4876b) it.next()).f12704a);
                if (arrayList.size() == size) {
                    break;
                }
            }
            this.f12701d.mo13989a((List<File>) arrayList);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract String mo5470c();

    /* renamed from: d */
    public List<File> mo13982d() {
        return this.f12701d.mo13987a(1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo5471e() {
        return 8000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo5472f() {
        return this.f12702e;
    }

    /* renamed from: g */
    public boolean mo13983g() {
        String str;
        boolean z = true;
        if (!this.f12701d.mo13992b()) {
            str = mo5470c();
            this.f12701d.mo13988a(str);
            C4813i.m19363a(this.f12698a, 4, "Fabric", String.format(Locale.US, "generated new file %s", new Object[]{str}));
            this.f12700c.mo13877a();
        } else {
            str = null;
            z = false;
        }
        m19547b(str);
        return z;
    }
}
