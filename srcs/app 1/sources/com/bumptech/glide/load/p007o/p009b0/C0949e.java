package com.bumptech.glide.load.p007o.p009b0;

import android.util.Log;
import com.bumptech.glide.load.C0869g;
import com.bumptech.glide.load.p007o.p009b0.C0940a.C0942b;
import com.bumptech.glide.p020m.C1217a;
import com.bumptech.glide.p020m.C1217a.C1220c;
import com.bumptech.glide.p020m.C1217a.C1222e;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bumptech.glide.load.o.b0.e */
public class C0949e implements C0940a {

    /* renamed from: a */
    private final C0959j f3505a;

    /* renamed from: b */
    private final File f3506b;

    /* renamed from: c */
    private final long f3507c;

    /* renamed from: d */
    private final C0944c f3508d = new C0944c();

    /* renamed from: e */
    private C1217a f3509e;

    @Deprecated
    protected C0949e(File file, long j) {
        this.f3506b = file;
        this.f3507c = j;
        this.f3505a = new C0959j();
    }

    /* renamed from: a */
    public static C0940a m4829a(File file, long j) {
        return new C0949e(file, j);
    }

    /* renamed from: a */
    private synchronized C1217a m4830a() {
        if (this.f3509e == null) {
            this.f3509e = C1217a.m5688a(this.f3506b, 1, 1, this.f3507c);
        }
        return this.f3509e;
    }

    /* renamed from: a */
    public File mo4738a(C0869g gVar) {
        String a = this.f3505a.mo4763a(gVar);
        String str = "DiskLruCacheWrapper";
        if (Log.isLoggable(str, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Get: Obtained: ");
            sb.append(a);
            sb.append(" for for Key: ");
            sb.append(gVar);
            Log.v(str, sb.toString());
        }
        try {
            C1222e d = m4830a().mo5145d(a);
            if (d != null) {
                return d.mo5156a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    public void mo4739a(C0869g gVar, C0942b bVar) {
        C1220c c;
        String str = "DiskLruCacheWrapper";
        String a = this.f3505a.mo4763a(gVar);
        this.f3508d.mo4742a(a);
        try {
            if (Log.isLoggable(str, 2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Put: Obtained: ");
                sb.append(a);
                sb.append(" for for Key: ");
                sb.append(gVar);
                Log.v(str, sb.toString());
            }
            try {
                C1217a a2 = m4830a();
                if (a2.mo5145d(a) == null) {
                    c = a2.mo5143c(a);
                    if (c != null) {
                        if (bVar.mo4741a(c.mo5149a(0))) {
                            c.mo5152c();
                        }
                        c.mo5151b();
                        this.f3508d.mo4743b(a);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Had two simultaneous puts for: ");
                    sb2.append(a);
                    throw new IllegalStateException(sb2.toString());
                }
            } catch (IOException e) {
                if (Log.isLoggable(str, 5)) {
                    Log.w(str, "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                c.mo5151b();
                throw th;
            }
        } finally {
            this.f3508d.mo4743b(a);
        }
    }
}
