package p147g.p156d.p157a.p185c.p187b0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g.d.a.c.b0.b */
public final class C4377b implements C4378c {

    /* renamed from: a */
    private final C4378c f11575a;

    /* renamed from: b */
    private final float f11576b;

    public C4377b(float f, C4378c cVar) {
        while (cVar instanceof C4377b) {
            cVar = ((C4377b) cVar).f11575a;
            f += ((C4377b) cVar).f11576b;
        }
        this.f11575a = cVar;
        this.f11576b = f;
    }

    /* renamed from: a */
    public float mo13045a(RectF rectF) {
        return Math.max(0.0f, this.f11575a.mo13045a(rectF) + this.f11576b);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4377b)) {
            return false;
        }
        C4377b bVar = (C4377b) obj;
        if (!this.f11575a.equals(bVar.f11575a) || this.f11576b != bVar.f11576b) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11575a, Float.valueOf(this.f11576b)});
    }
}
