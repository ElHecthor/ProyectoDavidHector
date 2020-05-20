package p147g.p156d.p157a.p158a.p159i.p160t;

import android.util.Log;

/* renamed from: g.d.a.a.i.t.a */
public final class C3777a {
    /* renamed from: a */
    private static String m15414a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportRuntime.");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m15415a(String str, String str2) {
        Log.i(m15414a(str), str2);
    }

    /* renamed from: a */
    public static void m15416a(String str, String str2, Object obj) {
        Log.d(m15414a(str), String.format(str2, new Object[]{obj}));
    }

    /* renamed from: a */
    public static void m15417a(String str, String str2, Throwable th) {
        Log.e(m15414a(str), str2, th);
    }

    /* renamed from: a */
    public static void m15418a(String str, String str2, Object... objArr) {
        Log.d(m15414a(str), String.format(str2, objArr));
    }

    /* renamed from: b */
    public static void m15419b(String str, String str2, Object obj) {
        Log.w(m15414a(str), String.format(str2, new Object[]{obj}));
    }
}
