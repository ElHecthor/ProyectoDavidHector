package com.crashlytics.android.p033e;

/* renamed from: com.crashlytics.android.e.d0 */
class C1381d0 implements C1483u0 {

    /* renamed from: a */
    private final int f4449a;

    /* renamed from: b */
    private final C1483u0[] f4450b;

    /* renamed from: c */
    private final C1383e0 f4451c;

    public C1381d0(int i, C1483u0... u0VarArr) {
        this.f4449a = i;
        this.f4450b = u0VarArr;
        this.f4451c = new C1383e0(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo5509a(StackTraceElement[] stackTraceElementArr) {
        C1483u0[] u0VarArr;
        if (stackTraceElementArr.length <= this.f4449a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C1483u0 u0Var : this.f4450b) {
            if (stackTraceElementArr2.length <= this.f4449a) {
                break;
            }
            stackTraceElementArr2 = u0Var.mo5509a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f4449a) {
            stackTraceElementArr2 = this.f4451c.mo5509a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
