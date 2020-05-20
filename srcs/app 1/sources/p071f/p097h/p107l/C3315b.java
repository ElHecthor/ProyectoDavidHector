package p071f.p097h.p107l;

import android.util.Log;
import java.io.Writer;

/* renamed from: f.h.l.b */
public class C3315b extends Writer {

    /* renamed from: f */
    private final String f9491f;

    /* renamed from: g */
    private StringBuilder f9492g = new StringBuilder(128);

    public C3315b(String str) {
        this.f9491f = str;
    }

    /* renamed from: a */
    private void m13530a() {
        if (this.f9492g.length() > 0) {
            Log.d(this.f9491f, this.f9492g.toString());
            StringBuilder sb = this.f9492g;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        m13530a();
    }

    public void flush() {
        m13530a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                m13530a();
            } else {
                this.f9492g.append(c);
            }
        }
    }
}
