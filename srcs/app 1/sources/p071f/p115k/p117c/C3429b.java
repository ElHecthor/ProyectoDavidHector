package p071f.p115k.p117c;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import p071f.p136u.p137a.p138a.C3555a;

/* renamed from: f.k.c.b */
public class C3429b {

    /* renamed from: d */
    private static final ThreadLocal<C3555a> f9696d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f9697a;

    /* renamed from: b */
    private final C3439f f9698b;

    /* renamed from: c */
    private volatile int f9699c = 0;

    C3429b(C3439f fVar, int i) {
        this.f9698b = fVar;
        this.f9697a = i;
    }

    /* renamed from: h */
    private C3555a m14054h() {
        C3555a aVar = (C3555a) f9696d.get();
        if (aVar == null) {
            aVar = new C3555a();
            f9696d.set(aVar);
        }
        this.f9698b.mo10975b().mo11263a(aVar, this.f9697a);
        return aVar;
    }

    /* renamed from: a */
    public int mo10946a() {
        return m14054h().mo11253a();
    }

    /* renamed from: a */
    public int mo10947a(int i) {
        return m14054h().mo11259e(i);
    }

    /* renamed from: a */
    public void mo10948a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface e = this.f9698b.mo10978e();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(e);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f9698b.mo10974a(), this.f9697a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: a */
    public void mo10949a(boolean z) {
        this.f9699c = z ? 2 : 1;
    }

    /* renamed from: b */
    public int mo10950b() {
        return this.f9699c;
    }

    /* renamed from: c */
    public short mo10951c() {
        return m14054h().mo11257c();
    }

    /* renamed from: d */
    public int mo10952d() {
        return m14054h().mo11258d();
    }

    /* renamed from: e */
    public short mo10953e() {
        return m14054h().mo11260e();
    }

    /* renamed from: f */
    public short mo10954f() {
        return m14054h().mo11261f();
    }

    /* renamed from: g */
    public boolean mo10955g() {
        return m14054h().mo11256b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo10952d()));
        sb.append(", codepoints:");
        int a = mo10946a();
        for (int i = 0; i < a; i++) {
            sb.append(Integer.toHexString(mo10947a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
