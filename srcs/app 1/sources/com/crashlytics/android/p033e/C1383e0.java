package com.crashlytics.android.p033e;

/* renamed from: com.crashlytics.android.e.e0 */
class C1383e0 implements C1483u0 {

    /* renamed from: a */
    private final int f4454a;

    public C1383e0(int i) {
        this.f4454a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo5509a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f4454a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
