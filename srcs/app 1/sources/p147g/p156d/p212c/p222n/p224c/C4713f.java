package p147g.p156d.p212c.p222n.p224c;

import p147g.p156d.p212c.p222n.p223b.C4702a;
import p147g.p156d.p212c.p222n.p223b.C4703b;
import p147g.p156d.p212c.p222n.p223b.C4704c;

/* renamed from: g.d.c.n.c.f */
public final class C4713f {

    /* renamed from: a */
    private C4703b f12353a;

    /* renamed from: b */
    private C4702a f12354b;

    /* renamed from: c */
    private C4704c f12355c;

    /* renamed from: d */
    private int f12356d = -1;

    /* renamed from: e */
    private C4708b f12357e;

    /* renamed from: b */
    public static boolean m19016b(int i) {
        return i >= 0 && i < 8;
    }

    /* renamed from: a */
    public C4708b mo13686a() {
        return this.f12357e;
    }

    /* renamed from: a */
    public void mo13687a(int i) {
        this.f12356d = i;
    }

    /* renamed from: a */
    public void mo13688a(C4702a aVar) {
        this.f12354b = aVar;
    }

    /* renamed from: a */
    public void mo13689a(C4703b bVar) {
        this.f12353a = bVar;
    }

    /* renamed from: a */
    public void mo13690a(C4704c cVar) {
        this.f12355c = cVar;
    }

    /* renamed from: a */
    public void mo13691a(C4708b bVar) {
        this.f12357e = bVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f12353a);
        sb.append("\n ecLevel: ");
        sb.append(this.f12354b);
        sb.append("\n version: ");
        sb.append(this.f12355c);
        sb.append("\n maskPattern: ");
        sb.append(this.f12356d);
        if (this.f12357e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f12357e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
