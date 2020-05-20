package com.facebook.p034f0;

import android.content.Context;
import android.util.Log;
import com.facebook.C1787m;
import com.facebook.internal.C1698v;
import com.facebook.p034f0.p038s.C1609b;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

/* renamed from: com.facebook.f0.f */
class C1545f {

    /* renamed from: a */
    private static final String f4816a = "com.facebook.f0.f";

    /* renamed from: com.facebook.f0.f$a */
    private static class C1546a extends ObjectInputStream {
        public C1546a(InputStream inputStream) {
            super(inputStream);
        }

        /* access modifiers changed from: protected */
        public ObjectStreamClass readClassDescriptor() {
            Class cls;
            ObjectStreamClass readClassDescriptor = super.readClassDescriptor();
            if (readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1")) {
                cls = C1530b.class;
            } else if (!readClassDescriptor.getName().equals("com.facebook.appevents.AppEventsLogger$AppEvent$SerializationProxyV1")) {
                return readClassDescriptor;
            } else {
                cls = C1535b.class;
            }
            return ObjectStreamClass.lookup(cls);
        }
    }

    C1545f() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x008a A[Catch:{ Exception -> 0x002e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.facebook.p034f0.C1559n m6876a() {
        /*
            java.lang.Class<com.facebook.f0.f> r0 = com.facebook.p034f0.C1545f.class
            monitor-enter(r0)
            com.facebook.p034f0.p038s.C1609b.m7093b()     // Catch:{ all -> 0x0091 }
            android.content.Context r1 = com.facebook.C1787m.m7744e()     // Catch:{ all -> 0x0091 }
            r2 = 0
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.FileInputStream r3 = r1.openFileInput(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            com.facebook.f0.f$a r4 = new com.facebook.f0.f$a     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            r5.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0074, Exception -> 0x003e, all -> 0x003a }
            java.lang.Object r3 = r4.readObject()     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.f0.n r3 = (com.facebook.p034f0.C1559n) r3     // Catch:{ FileNotFoundException -> 0x0075, Exception -> 0x0038 }
            com.facebook.internal.C1698v.m7378a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r2 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r2)     // Catch:{ Exception -> 0x002e }
            r1.delete()     // Catch:{ Exception -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r1 = move-exception
            java.lang.String r2 = f4816a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r2, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0036:
            r2 = r3
            goto L_0x0088
        L_0x0038:
            r3 = move-exception
            goto L_0x0040
        L_0x003a:
            r3 = move-exception
            r4 = r2
            r2 = r3
            goto L_0x005e
        L_0x003e:
            r3 = move-exception
            r4 = r2
        L_0x0040:
            java.lang.String r5 = f4816a     // Catch:{ all -> 0x005d }
            java.lang.String r6 = "Got unexpected exception while reading events: "
            android.util.Log.w(r5, r6, r3)     // Catch:{ all -> 0x005d }
            com.facebook.internal.C1698v.m7378a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0054 }
            r1.delete()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0088
        L_0x0054:
            r1 = move-exception
            java.lang.String r3 = f4816a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
        L_0x0059:
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
            goto L_0x0088
        L_0x005d:
            r2 = move-exception
        L_0x005e:
            com.facebook.internal.C1698v.m7378a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x006b }
            r1.delete()     // Catch:{ Exception -> 0x006b }
            goto L_0x0073
        L_0x006b:
            r1 = move-exception
            java.lang.String r3 = f4816a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            android.util.Log.w(r3, r4, r1)     // Catch:{ all -> 0x0091 }
        L_0x0073:
            throw r2     // Catch:{ all -> 0x0091 }
        L_0x0074:
            r4 = r2
        L_0x0075:
            com.facebook.internal.C1698v.m7378a(r4)     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = "AppEventsLogger.persistedevents"
            java.io.File r1 = r1.getFileStreamPath(r3)     // Catch:{ Exception -> 0x0082 }
            r1.delete()     // Catch:{ Exception -> 0x0082 }
            goto L_0x0088
        L_0x0082:
            r1 = move-exception
            java.lang.String r3 = f4816a     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = "Got unexpected exception when removing events file: "
            goto L_0x0059
        L_0x0088:
            if (r2 != 0) goto L_0x008f
            com.facebook.f0.n r2 = new com.facebook.f0.n     // Catch:{ all -> 0x0091 }
            r2.<init>()     // Catch:{ all -> 0x0091 }
        L_0x008f:
            monitor-exit(r0)
            return r2
        L_0x0091:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p034f0.C1545f.m6876a():com.facebook.f0.n");
    }

    /* renamed from: a */
    public static synchronized void m6877a(C1528a aVar, C1562o oVar) {
        synchronized (C1545f.class) {
            C1609b.m7093b();
            C1559n a = m6876a();
            if (a.mo5779a(aVar)) {
                a.mo5780b(aVar).addAll(oVar.mo5785b());
            } else {
                a.mo5778a(aVar, oVar.mo5785b());
            }
            m6879a(a);
        }
    }

    /* renamed from: a */
    public static synchronized void m6878a(C1537d dVar) {
        synchronized (C1545f.class) {
            C1609b.m7093b();
            C1559n a = m6876a();
            for (C1528a aVar : dVar.mo5749b()) {
                a.mo5778a(aVar, dVar.mo5746a(aVar).mo5785b());
            }
            m6879a(a);
        }
    }

    /* renamed from: a */
    private static void m6879a(C1559n nVar) {
        String str = "AppEventsLogger.persistedevents";
        Context e = C1787m.m7744e();
        ObjectOutputStream objectOutputStream = null;
        try {
            ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(e.openFileOutput(str, 0)));
            try {
                objectOutputStream2.writeObject(nVar);
                C1698v.m7378a((Closeable) objectOutputStream2);
            } catch (Exception e2) {
                e = e2;
                objectOutputStream = objectOutputStream2;
                try {
                    Log.w(f4816a, "Got unexpected exception while persisting events: ", e);
                    try {
                        e.getFileStreamPath(str).delete();
                    } catch (Exception unused) {
                    }
                    C1698v.m7378a((Closeable) objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    C1698v.m7378a((Closeable) objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                objectOutputStream = objectOutputStream2;
                C1698v.m7378a((Closeable) objectOutputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            Log.w(f4816a, "Got unexpected exception while persisting events: ", e);
            e.getFileStreamPath(str).delete();
            C1698v.m7378a((Closeable) objectOutputStream);
        }
    }
}
