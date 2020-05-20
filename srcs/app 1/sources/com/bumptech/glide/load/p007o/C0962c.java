package com.bumptech.glide.load.p007o;

import com.bumptech.glide.load.C0856a;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p005n.C0881d.C0882a;
import com.bumptech.glide.load.p007o.C0975f.C0976a;
import com.bumptech.glide.load.p011p.C1069n;
import com.bumptech.glide.load.p011p.C1069n.C1070a;
import java.io.File;
import java.util.List;

/* renamed from: com.bumptech.glide.load.o.c */
class C0962c implements C0975f, C0882a<Object> {

    /* renamed from: f */
    private final List<C0869g> f3531f;

    /* renamed from: g */
    private final C0977g<?> f3532g;

    /* renamed from: h */
    private final C0976a f3533h;

    /* renamed from: i */
    private int f3534i;

    /* renamed from: j */
    private C0869g f3535j;

    /* renamed from: k */
    private List<C1069n<File, ?>> f3536k;

    /* renamed from: l */
    private int f3537l;

    /* renamed from: m */
    private volatile C1070a<?> f3538m;

    /* renamed from: n */
    private File f3539n;

    C0962c(C0977g<?> gVar, C0976a aVar) {
        this(gVar.mo4803c(), gVar, aVar);
    }

    C0962c(List<C0869g> list, C0977g<?> gVar, C0976a aVar) {
        this.f3534i = -1;
        this.f3531f = list;
        this.f3532g = gVar;
        this.f3533h = aVar;
    }

    /* renamed from: b */
    private boolean m4864b() {
        return this.f3537l < this.f3536k.size();
    }

    /* renamed from: a */
    public void mo4645a(Exception exc) {
        this.f3533h.mo4790a(this.f3535j, exc, this.f3538m.f3808c, C0856a.DATA_DISK_CACHE);
    }

    /* renamed from: a */
    public void mo4646a(Object obj) {
        this.f3533h.mo4791a(this.f3535j, obj, this.f3538m.f3808c, C0856a.DATA_DISK_CACHE, this.f3535j);
    }

    /* renamed from: a */
    public boolean mo4766a() {
        while (true) {
            boolean z = false;
            if (this.f3536k == null || !m4864b()) {
                int i = this.f3534i + 1;
                this.f3534i = i;
                if (i >= this.f3531f.size()) {
                    return false;
                }
                C0869g gVar = (C0869g) this.f3531f.get(this.f3534i);
                File a = this.f3532g.mo4805d().mo4738a(new C0973d(gVar, this.f3532g.mo4813l()));
                this.f3539n = a;
                if (a != null) {
                    this.f3535j = gVar;
                    this.f3536k = this.f3532g.mo4796a(a);
                    this.f3537l = 0;
                }
            } else {
                this.f3538m = null;
                while (!z && m4864b()) {
                    List<C1069n<File, ?>> list = this.f3536k;
                    int i2 = this.f3537l;
                    this.f3537l = i2 + 1;
                    this.f3538m = ((C1069n) list.get(i2)).mo4571a(this.f3539n, this.f3532g.mo4815n(), this.f3532g.mo4807f(), this.f3532g.mo4810i());
                    if (this.f3538m != null && this.f3532g.mo4804c(this.f3538m.f3808c.mo4563a())) {
                        this.f3538m.f3808c.mo4564a(this.f3532g.mo4811j(), this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }

    public void cancel() {
        C1070a<?> aVar = this.f3538m;
        if (aVar != null) {
            aVar.f3808c.cancel();
        }
    }
}
