package p350n;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.x */
final class C6505x extends C6475d {

    /* renamed from: l */
    private final Logger f16140l = Logger.getLogger("okio.Okio");

    /* renamed from: m */
    private final Socket f16141m;

    public C6505x(Socket socket) {
        C5942k.m22327b(socket, "socket");
        this.f16141m = socket;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public IOException mo16403b(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo16195i() {
        StringBuilder sb;
        Level level;
        Logger logger;
        String str = "Failed to close timed out socket ";
        try {
            this.f16141m.close();
            return;
        } catch (Exception e) {
            logger = this.f16140l;
            level = Level.WARNING;
            sb = new StringBuilder();
            r1 = e;
        } catch (AssertionError e2) {
            if (C6493o.m24626a(e2)) {
                logger = this.f16140l;
                level = Level.WARNING;
                sb = new StringBuilder();
                r1 = e2;
            } else {
                throw e2;
            }
        }
        sb.append(str);
        sb.append(this.f16141m);
        logger.log(level, sb.toString(), r1);
    }
}
