package p308k.p310b0;

import p308k.p314u.C5851y;
import p308k.p320x.C5902c;
import p308k.p323z.p325d.p326w.C5954a;

/* renamed from: k.b0.b */
public class C5729b implements Iterable<Integer>, C5954a {

    /* renamed from: i */
    public static final C5730a f14807i = new C5730a(null);

    /* renamed from: f */
    private final int f14808f;

    /* renamed from: g */
    private final int f14809g;

    /* renamed from: h */
    private final int f14810h;

    /* renamed from: k.b0.b$a */
    public static final class C5730a {
        private C5730a() {
        }

        public /* synthetic */ C5730a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final C5729b mo15371a(int i, int i2, int i3) {
            return new C5729b(i, i2, i3);
        }
    }

    public C5729b(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f14808f = i;
            this.f14809g = C5902c.m22291b(i, i2, i3);
            this.f14810h = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: c */
    public final int mo15363c() {
        return this.f14808f;
    }

    /* renamed from: d */
    public final int mo15364d() {
        return this.f14809g;
    }

    /* renamed from: e */
    public final int mo15365e() {
        return this.f14810h;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        if (r2.f14810h == r3.f14810h) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof p308k.p310b0.C5729b
            if (r0 == 0) goto L_0x0029
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x0013
            r0 = r3
            k.b0.b r0 = (p308k.p310b0.C5729b) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0027
        L_0x0013:
            int r0 = r2.f14808f
            k.b0.b r3 = (p308k.p310b0.C5729b) r3
            int r1 = r3.f14808f
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f14809g
            int r1 = r3.f14809g
            if (r0 != r1) goto L_0x0029
            int r0 = r2.f14810h
            int r3 = r3.f14810h
            if (r0 != r3) goto L_0x0029
        L_0x0027:
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p308k.p310b0.C5729b.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f14808f * 31) + this.f14809g) * 31) + this.f14810h;
    }

    public boolean isEmpty() {
        if (this.f14810h > 0) {
            if (this.f14808f > this.f14809g) {
                return true;
            }
        } else if (this.f14808f < this.f14809g) {
            return true;
        }
        return false;
    }

    public C5851y iterator() {
        return new C5731c(this.f14808f, this.f14809g, this.f14810h);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        String str = " step ";
        if (this.f14810h > 0) {
            sb = new StringBuilder();
            sb.append(this.f14808f);
            sb.append("..");
            sb.append(this.f14809g);
            sb.append(str);
            i = this.f14810h;
        } else {
            sb = new StringBuilder();
            sb.append(this.f14808f);
            sb.append(" downTo ");
            sb.append(this.f14809g);
            sb.append(str);
            i = -this.f14810h;
        }
        sb.append(i);
        return sb.toString();
    }
}
