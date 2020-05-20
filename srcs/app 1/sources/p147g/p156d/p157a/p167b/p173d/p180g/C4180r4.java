package p147g.p156d.p157a.p167b.p173d.p180g;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;
import p147g.p156d.p157a.p167b.p173d.p180g.C3999f4;

/* renamed from: g.d.a.b.d.g.r4 */
abstract class C4180r4<T extends C3999f4> {

    /* renamed from: a */
    private static final Logger f11257a = Logger.getLogger(C3945c4.class.getName());

    /* renamed from: b */
    private static String f11258b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    C4180r4() {
    }

    /* renamed from: a */
    static <T extends C3999f4> T m16983a(Class<T> cls) {
        String str;
        Class<C4180r4> cls2 = C4180r4.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(C3999f4.class)) {
            str = f11258b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (C3999f4) cls.cast(((C4180r4) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo12743a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((C4180r4) it.next()).mo12743a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f11257a;
                    Level level = Level.SEVERE;
                    String str2 = "Unable to load ";
                    String valueOf = String.valueOf(cls.getSimpleName());
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (C3999f4) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (C3999f4) cls.getMethod("combine", new Class[]{Collection.class}).invoke(null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo12743a();
}
