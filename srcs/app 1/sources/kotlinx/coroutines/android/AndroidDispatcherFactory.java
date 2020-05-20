package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p308k.p323z.p325d.C5942k;

public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    /* renamed from: a */
    public String mo15707a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    /* renamed from: a */
    public C6007a m22571a(List<? extends MainDispatcherFactory> list) {
        C5942k.m22327b(list, "allFactories");
        Looper mainLooper = Looper.getMainLooper();
        C5942k.m22324a((Object) mainLooper, "Looper.getMainLooper()");
        return new C6007a(C6010c.m22579a(mainLooper, true), "Main");
    }

    /* renamed from: b */
    public int mo15709b() {
        return 1073741823;
    }
}
