package p242i.p243a.p244a.p245a;

import android.content.Context;
import java.io.File;
import java.util.Collection;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;
import p242i.p243a.p244a.p245a.p246n.p249c.C4855d;
import p242i.p243a.p244a.p245a.p246n.p249c.C4866l;

/* renamed from: i.a.a.a.i */
public abstract class C4792i<Result> implements Comparable<C4792i> {

    /* renamed from: f */
    C4781c f12522f;

    /* renamed from: g */
    C4791h<Result> f12523g = new C4791h<>(this);

    /* renamed from: h */
    Context f12524h;

    /* renamed from: i */
    C4787f<Result> f12525i;

    /* renamed from: j */
    C4830s f12526j;

    /* renamed from: k */
    final C4855d f12527k = ((C4855d) getClass().getAnnotation(C4855d.class));

    /* renamed from: a */
    public int compareTo(C4792i iVar) {
        if (mo13831b(iVar)) {
            return 1;
        }
        if (iVar.mo13831b(this)) {
            return -1;
        }
        if (!mo13838q() || iVar.mo13838q()) {
            return (mo13838q() || !iVar.mo13838q()) ? 0 : -1;
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo13828a(Context context, C4781c cVar, C4787f<Result> fVar, C4830s sVar) {
        this.f12522f = cVar;
        this.f12524h = new C4785d(context, mo5401n(), mo13837o());
        this.f12525i = fVar;
        this.f12526j = sVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13829a(Result result) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo13830b(Result result) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo13831b(C4792i iVar) {
        if (mo13838q()) {
            for (Class isAssignableFrom : this.f12527k.value()) {
                if (isAssignableFrom.isAssignableFrom(iVar.getClass())) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract Result mo5400h();

    /* renamed from: i */
    public Context mo13833i() {
        return this.f12524h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public Collection<C4866l> mo13834j() {
        return this.f12523g.mo13932h();
    }

    /* renamed from: l */
    public C4781c mo13835l() {
        return this.f12522f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public C4830s mo13836m() {
        return this.f12526j;
    }

    /* renamed from: n */
    public abstract String mo5401n();

    /* renamed from: o */
    public String mo13837o() {
        StringBuilder sb = new StringBuilder();
        sb.append(".Fabric");
        sb.append(File.separator);
        sb.append(mo5401n());
        return sb.toString();
    }

    /* renamed from: p */
    public abstract String mo5402p();

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo13838q() {
        return this.f12527k != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public final void mo13839r() {
        this.f12523g.mo13955a(this.f12522f.mo13803b(), null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo5409s() {
        return true;
    }
}
