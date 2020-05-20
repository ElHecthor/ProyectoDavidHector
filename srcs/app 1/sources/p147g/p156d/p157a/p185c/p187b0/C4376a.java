package p147g.p156d.p157a.p185c.p187b0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: g.d.a.c.b0.a */
public final class C4376a implements C4378c {

    /* renamed from: a */
    private final float f11574a;

    public C4376a(float f) {
        this.f11574a = f;
    }

    /* renamed from: a */
    public float mo13045a(RectF rectF) {
        return this.f11574a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4376a)) {
            return false;
        }
        if (this.f11574a != ((C4376a) obj).f11574a) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f11574a)});
    }
}
