package p147g.p156d.p157a.p185c.p187b0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g.d.a.c.b0.i */
public final class C4387i implements C4378c {

    /* renamed from: a */
    private final float f11625a;

    public C4387i(float f) {
        this.f11625a = f;
    }

    /* renamed from: a */
    public float mo13045a(RectF rectF) {
        return this.f11625a * rectF.height();
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4387i)) {
            return false;
        }
        if (this.f11625a != ((C4387i) obj).f11625a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11625a)});
    }
}
