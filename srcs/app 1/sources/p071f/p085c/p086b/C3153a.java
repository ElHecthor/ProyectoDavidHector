package p071f.p085c.p086b;

import android.os.Bundle;

/* renamed from: f.c.b.a */
public final class C3153a {

    /* renamed from: a */
    public final Integer f8927a;

    /* renamed from: b */
    public final Integer f8928b;

    /* renamed from: c */
    public final Integer f8929c;

    /* renamed from: f.c.b.a$a */
    public static final class C3154a {

        /* renamed from: a */
        private Integer f8930a;

        /* renamed from: b */
        private Integer f8931b;

        /* renamed from: c */
        private Integer f8932c;

        /* renamed from: a */
        public C3153a mo10145a() {
            return new C3153a(this.f8930a, this.f8931b, this.f8932c);
        }
    }

    C3153a(Integer num, Integer num2, Integer num3) {
        this.f8927a = num;
        this.f8928b = num2;
        this.f8929c = num3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bundle mo10144a() {
        Bundle bundle = new Bundle();
        Integer num = this.f8927a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f8928b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f8929c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        return bundle;
    }
}
