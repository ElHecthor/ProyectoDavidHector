package kotlinx.coroutines;

import kotlinx.coroutines.internal.C6139v;

/* renamed from: kotlinx.coroutines.h1 */
public final class C6094h1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C6139v f15185a = new C6139v("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C6139v f15186b = new C6139v("CLOSED_EMPTY");

    /* renamed from: a */
    public static final long m22910a(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
