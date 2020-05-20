package p255io.stashteam.stashapp.utils.p304f;

import java.math.BigDecimal;
import java.math.RoundingMode;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.g */
public final class C5701g {
    /* renamed from: a */
    public static final double m21794a(double d, int i, RoundingMode roundingMode) {
        C5942k.m22327b(roundingMode, "roundingMode");
        return new BigDecimal(d).setScale(i, roundingMode).doubleValue();
    }

    /* renamed from: a */
    public static /* synthetic */ double m21795a(double d, int i, RoundingMode roundingMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            roundingMode = RoundingMode.HALF_UP;
        }
        return m21794a(d, i, roundingMode);
    }
}
