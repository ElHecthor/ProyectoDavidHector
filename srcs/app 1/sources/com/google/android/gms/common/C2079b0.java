package com.google.android.gms.common;

import android.util.Log;
import com.google.android.gms.common.util.C2186a;
import com.google.android.gms.common.util.C2195j;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue
/* renamed from: com.google.android.gms.common.b0 */
class C2079b0 {

    /* renamed from: d */
    private static final C2079b0 f5967d = new C2079b0(true, null, null);

    /* renamed from: a */
    final boolean f5968a;

    /* renamed from: b */
    private final String f5969b;

    /* renamed from: c */
    private final Throwable f5970c;

    C2079b0(boolean z, @Nullable String str, @Nullable Throwable th) {
        this.f5968a = z;
        this.f5969b = str;
        this.f5970c = th;
    }

    /* renamed from: a */
    static C2079b0 m8599a(String str) {
        return new C2079b0(false, str, null);
    }

    /* renamed from: a */
    static C2079b0 m8600a(String str, Throwable th) {
        return new C2079b0(false, str, th);
    }

    /* renamed from: a */
    static C2079b0 m8601a(Callable<String> callable) {
        return new C2083d0(callable);
    }

    /* renamed from: a */
    static String m8602a(String str, C2184t tVar, boolean z, boolean z2) {
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{z2 ? "debug cert rejected" : "not whitelisted", str, C2195j.m8995a(C2186a.m8969a("SHA-1").digest(tVar.mo6985t())), Boolean.valueOf(z), "12451009.false"});
    }

    /* renamed from: c */
    static C2079b0 m8603c() {
        return f5967d;
    }

    /* access modifiers changed from: 0000 */
    @Nullable
    /* renamed from: a */
    public String mo6784a() {
        return this.f5969b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6785b() {
        if (!this.f5968a) {
            String str = "GoogleCertificatesRslt";
            if (Log.isLoggable(str, 3)) {
                if (this.f5970c != null) {
                    Log.d(str, mo6784a(), this.f5970c);
                    return;
                }
                Log.d(str, mo6784a());
            }
        }
    }
}
