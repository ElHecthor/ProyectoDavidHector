package p350n;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import p308k.p323z.p325d.C5942k;

/* renamed from: n.o */
public final class C6493o {
    /* renamed from: a */
    public static final C6483f m24622a(C6504w wVar) {
        C5942k.m22327b(wVar, "$this$buffer");
        return new C6497r(wVar);
    }

    /* renamed from: a */
    public static final C6484g m24623a(C6506y yVar) {
        C5942k.m22327b(yVar, "$this$buffer");
        return new C6498s(yVar);
    }

    /* renamed from: a */
    public static final C6504w m24624a(Socket socket) {
        C5942k.m22327b(socket, "$this$sink");
        C6505x xVar = new C6505x(socket);
        OutputStream outputStream = socket.getOutputStream();
        C5942k.m22324a((Object) outputStream, "getOutputStream()");
        return xVar.mo16769a((C6504w) new C6496q(outputStream, xVar));
    }

    /* renamed from: a */
    public static final C6506y m24625a(InputStream inputStream) {
        C5942k.m22327b(inputStream, "$this$source");
        return new C6492n(inputStream, new C6507z());
    }

    /* renamed from: a */
    public static final boolean m24626a(AssertionError assertionError) {
        C5942k.m22327b(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        return message != null ? C5788q.m22009a((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false;
    }

    /* renamed from: b */
    public static final C6506y m24627b(Socket socket) {
        C5942k.m22327b(socket, "$this$source");
        C6505x xVar = new C6505x(socket);
        InputStream inputStream = socket.getInputStream();
        C5942k.m22324a((Object) inputStream, "getInputStream()");
        return xVar.mo16770a((C6506y) new C6492n(inputStream, xVar));
    }
}
