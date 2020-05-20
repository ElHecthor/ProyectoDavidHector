package com.google.android.material.bottomappbar;

import p147g.p156d.p157a.p185c.p187b0.C4381f;
import p147g.p156d.p157a.p185c.p187b0.C4396m;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C2564a extends C4381f implements Cloneable {

    /* renamed from: f */
    private float f7252f;

    /* renamed from: g */
    private float f7253g;

    /* renamed from: h */
    private float f7254h;

    /* renamed from: i */
    private float f7255i;

    /* renamed from: j */
    private float f7256j;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo8001a(float f) {
        this.f7255i = f;
    }

    /* renamed from: a */
    public void mo8002a(float f, float f2, float f3, C4396m mVar) {
        float f4 = f;
        C4396m mVar2 = mVar;
        float f5 = this.f7254h;
        if (f5 == 0.0f) {
            mVar2.mo13138a(f4, 0.0f);
            return;
        }
        float f6 = ((this.f7253g * 2.0f) + f5) / 2.0f;
        float f7 = f3 * this.f7252f;
        float f8 = f2 + this.f7256j;
        float f9 = (this.f7255i * f3) + ((1.0f - f3) * f6);
        if (f9 / f6 >= 1.0f) {
            mVar2.mo13138a(f4, 0.0f);
            return;
        }
        float f10 = f6 + f7;
        float f11 = f9 + f7;
        float sqrt = (float) Math.sqrt((double) ((f10 * f10) - (f11 * f11)));
        float f12 = f8 - sqrt;
        float f13 = f8 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f11)));
        float f14 = 90.0f - degrees;
        mVar2.mo13138a(f12, 0.0f);
        float f15 = f7 * 2.0f;
        float f16 = degrees;
        mVar.mo13140a(f12 - f7, 0.0f, f12 + f7, f15, 270.0f, degrees);
        mVar.mo13140a(f8 - f6, (-f6) - f9, f8 + f6, f6 - f9, 180.0f - f14, (f14 * 2.0f) - 180.0f);
        mVar.mo13140a(f13 - f7, 0.0f, f13 + f7, f15, 270.0f - f16, f16);
        mVar2.mo13138a(f4, 0.0f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo8003b(float f) {
        this.f7253g = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo8004c() {
        return this.f7255i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo8005c(float f) {
        this.f7252f = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo8006d() {
        return this.f7253g;
    }

    /* renamed from: d */
    public void mo8007d(float f) {
        this.f7254h = f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public float mo8008e() {
        return this.f7252f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo8009e(float f) {
        this.f7256j = f;
    }

    /* renamed from: j */
    public float mo8010j() {
        return this.f7254h;
    }
}
