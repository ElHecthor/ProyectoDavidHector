package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p007o.C0975f.C0976a;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.w */
class C1021w implements C0975f, C0882a<Object> {

    /* renamed from: f */
    private final C0976a f3733f;

    /* renamed from: g */
    private final C0977g<?> f3734g;

    /* renamed from: h */
    private int f3735h;

    /* renamed from: i */
    private int f3736i = -1;

    /* renamed from: j */
    private C0869g f3737j;

    /* renamed from: k */
    private List<C1069n<File, ?>> f3738k;

    /* renamed from: l */
    private int f3739l;

    /* renamed from: m */
    private volatile C1070a<?> f3740m;

    /* renamed from: n */
    private File f3741n;

    /* renamed from: o */
    private C1022x f3742o;

    C1021w(C0977g<?> gVar, C0976a aVar) {
        this.f3734g = gVar;
        this.f3733f = aVar;
    }

    /* renamed from: b */
    private boolean m5075b() {
        return this.f3739l < this.f3738k.size();
    }

    /* renamed from: a */
    public void mo4645a(Exception exc) {
        this.f3733f.mo4790a(this.f3742o, exc, this.f3740m.f3808c, C0856a.RESOURCE_DISK_CACHE);
    }

    /* renamed from: a */
    public void mo4646a(Object obj) {
        this.f3733f.mo4791a(this.f3737j, obj, this.f3740m.f3808c, C0856a.RESOURCE_DISK_CACHE, this.f3742o);
    }

    /* renamed from: a */
    public boolean mo4766a() {
        List c = this.f3734g.mo4803c();
        boolean z = false;
        if (c.isEmpty()) {
            return false;
        }
        List k = this.f3734g.mo4812k();
        if (!k.isEmpty()) {
            while (true) {
                if (this.f3738k == null || !m5075b()) {
                    int i = this.f3736i + 1;
                    this.f3736i = i;
                    if (i >= k.size()) {
                        int i2 = this.f3735h + 1;
                        this.f3735h = i2;
                        if (i2 >= c.size()) {
                            return false;
                        }
                        this.f3736i = 0;
                    }
                    C0869g gVar = (C0869g) c.get(this.f3735h);
                    Class cls = (Class) k.get(this.f3736i);
                    C0869g gVar2 = gVar;
                    C1022x xVar = new C1022x(this.f3734g.mo4801b(), gVar2, this.f3734g.mo4813l(), this.f3734g.mo4815n(), this.f3734g.mo4807f(), this.f3734g.mo4800b(cls), cls, this.f3734g.mo4810i());
                    this.f3742o = xVar;
                    File a = this.f3734g.mo4805d().mo4738a(this.f3742o);
                    this.f3741n = a;
                    if (a != null) {
                        this.f3737j = gVar;
                        this.f3738k = this.f3734g.mo4796a(a);
                        this.f3739l = 0;
                    }
                } else {
                    this.f3740m = null;
                    while (!z && m5075b()) {
                        List<C1069n<File, ?>> list = this.f3738k;
                        int i3 = this.f3739l;
                        this.f3739l = i3 + 1;
                        this.f3740m = ((C1069n) list.get(i3)).mo4571a(this.f3741n, this.f3734g.mo4815n(), this.f3734g.mo4807f(), this.f3734g.mo4810i());
                        if (this.f3740m != null && this.f3734g.mo4804c(this.f3740m.f3808c.mo4563a())) {
                            this.f3740m.f3808c.mo4564a(this.f3734g.mo4811j(), this);
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } else if (File.class.equals(this.f3734g.mo4814m())) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find any load path from ");
            sb.append(this.f3734g.mo4809h());
            sb.append(" to ");
            sb.append(this.f3734g.mo4814m());
            throw new IllegalStateException(sb.toString());
        }
    }

    public void cancel() {
        C1070a<?> aVar = this.f3740m;
        if (aVar != null) {
            aVar.f3808c.cancel();
        }
    }
}
