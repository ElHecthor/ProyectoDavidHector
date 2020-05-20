package com.facebook.internal.p042y.p043c;

import android.os.Process;
import android.util.Log;
import com.facebook.C1787m;
import com.facebook.C1797q.C1802e;
import com.facebook.C1842t;
import com.facebook.internal.p042y.C1717b;
import java.io.File;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.internal.y.c.a */
public class C1719a implements UncaughtExceptionHandler {

    /* renamed from: c */
    private static final String f5205c = C1719a.class.getCanonicalName();

    /* renamed from: d */
    private static C1719a f5206d;

    /* renamed from: a */
    private final UncaughtExceptionHandler f5207a;

    /* renamed from: b */
    private boolean f5208b = false;

    /* renamed from: com.facebook.internal.y.c.a$a */
    static class C1720a implements Comparator<C1722b> {
        C1720a() {
        }

        /* renamed from: a */
        public int compare(C1722b bVar, C1722b bVar2) {
            return bVar.mo5990a(bVar2);
        }
    }

    /* renamed from: com.facebook.internal.y.c.a$b */
    static class C1721b implements C1802e {

        /* renamed from: a */
        final /* synthetic */ ArrayList f5209a;

        C1721b(ArrayList arrayList) {
            this.f5209a = arrayList;
        }

        /* renamed from: a */
        public void mo5725a(C1842t tVar) {
            try {
                if (tVar.mo6290a() == null && tVar.mo6291b().getBoolean("success")) {
                    for (int i = 0; this.f5209a.size() > i; i++) {
                        ((C1722b) this.f5209a.get(i)).mo5991a();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    private C1719a(UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f5207a = uncaughtExceptionHandler;
    }

    /* renamed from: a */
    public static synchronized void m7482a() {
        synchronized (C1719a.class) {
            if (C1787m.m7747h()) {
                m7484c();
            }
            if (f5206d != null) {
                Log.w(f5205c, "Already enabled!");
                return;
            }
            C1719a aVar = new C1719a(Thread.getDefaultUncaughtExceptionHandler());
            f5206d = aVar;
            Thread.setDefaultUncaughtExceptionHandler(aVar);
        }
    }

    /* renamed from: b */
    private static void m7483b() {
        try {
            Process.killProcess(Process.myPid());
            System.exit(10);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    private static void m7484c() {
        File[] b = C1717b.m7480b();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (File bVar : b) {
            C1722b bVar2 = new C1722b(bVar);
            if (bVar2.mo5993c()) {
                arrayList.add(bVar2);
            }
        }
        Collections.sort(arrayList, new C1720a());
        JSONArray jSONArray = new JSONArray();
        while (i < arrayList.size() && i < 5) {
            jSONArray.put(arrayList.get(i));
            i++;
        }
        C1717b.m7477a("crash_reports", jSONArray, new C1721b(arrayList));
    }

    public void uncaughtException(Thread thread, Throwable th) {
        if (C1717b.m7481c(th)) {
            new C1722b(th).mo5994d();
        }
        UncaughtExceptionHandler uncaughtExceptionHandler = this.f5207a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        if (this.f5208b) {
            m7483b();
        }
    }
}
