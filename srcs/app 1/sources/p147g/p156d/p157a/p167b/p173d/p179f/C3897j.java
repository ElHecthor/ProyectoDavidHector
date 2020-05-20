package p147g.p156d.p157a.p167b.p173d.p179f;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: g.d.a.b.d.f.j */
public final class C3897j {

    /* renamed from: a */
    private static final Logger f10794a = Logger.getLogger(C3897j.class.getName());

    private C3897j() {
    }

    /* renamed from: a */
    public static void m15650a(@NullableDecl InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                try {
                    f10794a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    throw new AssertionError(e2);
                }
            }
        }
    }
}
