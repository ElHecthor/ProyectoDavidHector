package p242i.p243a.p244a.p245a.p246n.p251d;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: i.a.a.a.n.d.g */
public class C4881g extends C4882h {
    public C4881g(Context context, File file, String str, String str2) {
        super(context, file, str, str2);
    }

    /* renamed from: a */
    public OutputStream mo13995a(File file) {
        return new GZIPOutputStream(new FileOutputStream(file));
    }
}
