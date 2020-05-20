package p308k.p310b0;

import java.util.NoSuchElementException;
import p308k.p314u.C5851y;

/* renamed from: k.b0.c */
public final class C5731c extends C5851y {

    /* renamed from: f */
    private final int f14811f;

    /* renamed from: g */
    private boolean f14812g;

    /* renamed from: h */
    private int f14813h;

    /* renamed from: i */
    private final int f14814i;

    public C5731c(int i, int i2, int i3) {
        this.f14814i = i3;
        this.f14811f = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f14812g = z;
        if (!z) {
            i = this.f14811f;
        }
        this.f14813h = i;
    }

    /* renamed from: b */
    public int mo15372b() {
        int i = this.f14813h;
        if (i != this.f14811f) {
            this.f14813h = this.f14814i + i;
        } else if (this.f14812g) {
            this.f14812g = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.f14812g;
    }
}
