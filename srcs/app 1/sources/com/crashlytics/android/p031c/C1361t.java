package com.crashlytics.android.p031c;

import java.util.Random;
import p242i.p243a.p244a.p245a.p246n.p249c.p250n.C4868a;

/* renamed from: com.crashlytics.android.c.t */
class C1361t implements C4868a {

    /* renamed from: a */
    final C4868a f4417a;

    /* renamed from: b */
    final Random f4418b;

    /* renamed from: c */
    final double f4419c;

    public C1361t(C4868a aVar, double d) {
        this(aVar, d, new Random());
    }

    public C1361t(C4868a aVar, double d, Random random) {
        if (d < 0.0d || d > 1.0d) {
            throw new IllegalArgumentException("jitterPercent must be between 0.0 and 1.0");
        } else if (aVar == null) {
            throw new NullPointerException("backoff must not be null");
        } else if (random != null) {
            this.f4417a = aVar;
            this.f4419c = d;
            this.f4418b = random;
        } else {
            throw new NullPointerException("random must not be null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public double mo5464a() {
        double d = this.f4419c;
        double d2 = 1.0d - d;
        return d2 + (((d + 1.0d) - d2) * this.f4418b.nextDouble());
    }

    /* renamed from: a */
    public long mo5465a(int i) {
        return (long) (mo5464a() * ((double) this.f4417a.mo5465a(i)));
    }
}
