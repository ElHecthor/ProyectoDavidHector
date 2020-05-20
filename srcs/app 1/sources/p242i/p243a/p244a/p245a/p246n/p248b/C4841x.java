package p242i.p243a.p244a.p245a.p246n.p248b;

import android.os.SystemClock;
import android.util.Log;

/* renamed from: i.a.a.a.n.b.x */
public class C4841x {

    /* renamed from: a */
    private final String f12641a;

    /* renamed from: b */
    private final String f12642b;

    /* renamed from: c */
    private final boolean f12643c;

    /* renamed from: d */
    private long f12644d;

    /* renamed from: e */
    private long f12645e;

    public C4841x(String str, String str2) {
        this.f12641a = str;
        this.f12642b = str2;
        this.f12643c = !Log.isLoggable(str2, 2);
    }

    /* renamed from: c */
    private void m19474c() {
        String str = this.f12642b;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f12641a);
        sb.append(": ");
        sb.append(this.f12645e);
        sb.append("ms");
        Log.v(str, sb.toString());
    }

    /* renamed from: a */
    public synchronized void mo13916a() {
        if (!this.f12643c) {
            this.f12644d = SystemClock.elapsedRealtime();
            this.f12645e = 0;
        }
    }

    /* renamed from: b */
    public synchronized void mo13917b() {
        if (!this.f12643c) {
            if (this.f12645e == 0) {
                this.f12645e = SystemClock.elapsedRealtime() - this.f12644d;
                m19474c();
            }
        }
    }
}
