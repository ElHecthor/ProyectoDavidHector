package com.facebook.internal;

import android.content.Intent;
import com.facebook.C1522e;
import com.facebook.C1787m;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.d */
public final class C1647d implements C1522e {

    /* renamed from: b */
    private static Map<Integer, C1648a> f5039b = new HashMap();

    /* renamed from: a */
    private Map<Integer, C1648a> f5040a = new HashMap();

    /* renamed from: com.facebook.internal.d$a */
    public interface C1648a {
        /* renamed from: a */
        boolean mo5890a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.d$b */
    public enum C1649b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        

        /* renamed from: f */
        private final int f5051f;

        private C1649b(int i) {
            this.f5051f = i;
        }

        /* renamed from: f */
        public int mo5891f() {
            return C1787m.m7748i() + this.f5051f;
        }
    }

    /* renamed from: a */
    private static synchronized C1648a m7193a(Integer num) {
        C1648a aVar;
        synchronized (C1647d.class) {
            aVar = (C1648a) f5039b.get(num);
        }
        return aVar;
    }

    /* renamed from: b */
    public static synchronized void m7194b(int i, C1648a aVar) {
        synchronized (C1647d.class) {
            C1703w.m7423a((Object) aVar, "callback");
            if (!f5039b.containsKey(Integer.valueOf(i))) {
                f5039b.put(Integer.valueOf(i), aVar);
            }
        }
    }

    /* renamed from: b */
    private static boolean m7195b(int i, int i2, Intent intent) {
        C1648a a = m7193a(Integer.valueOf(i));
        if (a != null) {
            return a.mo5890a(i2, intent);
        }
        return false;
    }

    /* renamed from: a */
    public void mo5889a(int i, C1648a aVar) {
        C1703w.m7423a((Object) aVar, "callback");
        this.f5040a.put(Integer.valueOf(i), aVar);
    }

    /* renamed from: a */
    public boolean mo5732a(int i, int i2, Intent intent) {
        C1648a aVar = (C1648a) this.f5040a.get(Integer.valueOf(i));
        return aVar != null ? aVar.mo5890a(i2, intent) : m7195b(i, i2, intent);
    }
}
