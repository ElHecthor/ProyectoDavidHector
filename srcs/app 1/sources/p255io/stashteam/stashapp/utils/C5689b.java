package p255io.stashteam.stashapp.utils;

import com.crashlytics.android.C1325a;
import p308k.p323z.p325d.C5942k;
import p382q.p383a.C6677a.C6679b;

/* renamed from: io.stashteam.stashapp.utils.b */
public final class C5689b extends C6679b {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo15345a(int i, String str, String str2, Throwable th) {
        String str3 = "message";
        C5942k.m22327b(str2, str3);
        if (i != 2 && i != 3 && i != 4) {
            C1325a.m6202a("priority", i);
            C1325a.m6203a("tag", str);
            C1325a.m6203a(str3, str2);
            if (th == null) {
                C1325a.m6204a(new Exception(str2));
            } else {
                C1325a.m6204a(th);
            }
        }
    }
}
