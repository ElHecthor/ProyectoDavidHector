package p071f.p126p.p127a;

import android.os.Bundle;
import androidx.lifecycle.C0510d0;
import androidx.lifecycle.C0523n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p071f.p126p.p128b.C3464b;

/* renamed from: f.p.a.a */
public abstract class C3455a {

    /* renamed from: f.p.a.a$a */
    public interface C3456a<D> {
        /* renamed from: a */
        C3464b<D> mo6532a(int i, Bundle bundle);

        /* renamed from: a */
        void mo6533a(C3464b<D> bVar);

        /* renamed from: a */
        void mo6534a(C3464b<D> bVar, D d);
    }

    /* renamed from: a */
    public static <T extends C0523n & C0510d0> C3455a m14163a(T t) {
        return new C3457b(t, ((C0510d0) t).mo118h());
    }

    /* renamed from: a */
    public abstract <D> C3464b<D> mo11016a(int i, Bundle bundle, C3456a<D> aVar);

    /* renamed from: a */
    public abstract void mo11017a();

    @Deprecated
    /* renamed from: a */
    public abstract void mo11018a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);
}
