package com.crashlytics.android.p033e;

import android.app.ActivityManager.RunningAppProcessInfo;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import p242i.p243a.p244a.p245a.C4781c;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s.C4831a;

/* renamed from: com.crashlytics.android.e.r0 */
class C1476r0 {

    /* renamed from: a */
    private static final C1380d f4640a = C1380d.m6377a("0");

    /* renamed from: b */
    private static final C1380d f4641b = C1380d.m6377a("Unity");

    /* renamed from: a */
    private static int m6666a() {
        return C1387g.m6399b(1, f4640a) + 0 + C1387g.m6399b(2, f4640a) + C1387g.m6398b(3, 0);
    }

    /* renamed from: a */
    private static int m6667a(int i, C1380d dVar, int i2, long j, long j2, boolean z, Map<C4831a, String> map, int i3, C1380d dVar2, C1380d dVar3) {
        int i4 = 0;
        int e = C1387g.m6404e(3, i) + 0 + (dVar == null ? 0 : C1387g.m6399b(4, dVar)) + C1387g.m6407g(5, i2) + C1387g.m6398b(6, j) + C1387g.m6398b(7, j2) + C1387g.m6400b(10, z);
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a = m6676a((C4831a) entry.getKey(), (String) entry.getValue());
                e += C1387g.m6412l(11) + C1387g.m6410j(a) + a;
            }
        }
        int g = e + C1387g.m6407g(12, i3) + (dVar2 == null ? 0 : C1387g.m6399b(13, dVar2));
        if (dVar3 != null) {
            i4 = C1387g.m6399b(14, dVar3);
        }
        return g + i4;
    }

    /* renamed from: a */
    private static int m6668a(long j, String str, C1485v0 v0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2, C1380d dVar, C1380d dVar2, Float f, int i3, boolean z, long j2, long j3, C1380d dVar3) {
        long j4 = j;
        int b = C1387g.m6398b(1, j) + 0 + C1387g.m6399b(2, C1380d.m6377a(str));
        int a = m6675a(v0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2, map, runningAppProcessInfo, i2);
        int l = b + C1387g.m6412l(3) + C1387g.m6410j(a) + a;
        int a2 = m6677a(f, i3, z, i2, j2, j3);
        int l2 = l + C1387g.m6412l(5) + C1387g.m6410j(a2) + a2;
        if (dVar3 == null) {
            return l2;
        }
        int a3 = m6669a(dVar3);
        return l2 + C1387g.m6412l(6) + C1387g.m6410j(a3) + a3;
    }

    /* renamed from: a */
    private static int m6669a(C1380d dVar) {
        return C1387g.m6399b(1, dVar);
    }

    /* renamed from: a */
    private static int m6670a(C1380d dVar, C1380d dVar2) {
        int b = C1387g.m6398b(1, 0) + 0 + C1387g.m6398b(2, 0) + C1387g.m6399b(3, dVar);
        return dVar2 != null ? b + C1387g.m6399b(4, dVar2) : b;
    }

    /* renamed from: a */
    private static int m6671a(C1380d dVar, C1380d dVar2, C1380d dVar3, C1380d dVar4, C1380d dVar5, int i, C1380d dVar6) {
        int b = C1387g.m6399b(1, dVar) + 0 + C1387g.m6399b(2, dVar3) + C1387g.m6399b(3, dVar4);
        int b2 = m6696b(dVar2);
        int l = b + C1387g.m6412l(5) + C1387g.m6410j(b2) + b2 + C1387g.m6399b(6, dVar5);
        if (dVar6 != null) {
            l = l + C1387g.m6399b(8, f4641b) + C1387g.m6399b(9, dVar6);
        }
        return l + C1387g.m6404e(10, i);
    }

    /* renamed from: a */
    private static int m6672a(C1380d dVar, C1380d dVar2, boolean z) {
        return C1387g.m6404e(1, 3) + 0 + C1387g.m6399b(2, dVar) + C1387g.m6399b(3, dVar2) + C1387g.m6400b(4, z);
    }

    /* renamed from: a */
    private static int m6673a(C1485v0 v0Var, int i, int i2) {
        int i3 = 0;
        int b = C1387g.m6399b(1, C1380d.m6377a(v0Var.f4652b)) + 0;
        String str = v0Var.f4651a;
        if (str != null) {
            b += C1387g.m6399b(3, C1380d.m6377a(str));
        }
        for (StackTraceElement a : v0Var.f4653c) {
            int a2 = m6678a(a, true);
            b += C1387g.m6412l(4) + C1387g.m6410j(a2) + a2;
        }
        C1485v0 v0Var2 = v0Var.f4654d;
        if (v0Var2 == null) {
            return b;
        }
        if (i < i2) {
            int a3 = m6673a(v0Var2, i + 1, i2);
            return b + C1387g.m6412l(6) + C1387g.m6410j(a3) + a3;
        }
        while (v0Var2 != null) {
            v0Var2 = v0Var2.f4654d;
            i3++;
        }
        return b + C1387g.m6407g(7, i3);
    }

    /* renamed from: a */
    private static int m6674a(C1485v0 v0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1380d dVar, C1380d dVar2) {
        int a = m6680a(thread, stackTraceElementArr, 4, true);
        int l = C1387g.m6412l(1) + C1387g.m6410j(a) + a + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int a2 = m6680a(threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
            l += C1387g.m6412l(1) + C1387g.m6410j(a2) + a2;
        }
        int a3 = m6673a(v0Var, 1, i);
        int l2 = l + C1387g.m6412l(2) + C1387g.m6410j(a3) + a3;
        int a4 = m6666a();
        int l3 = l2 + C1387g.m6412l(3) + C1387g.m6410j(a4) + a4;
        int a5 = m6670a(dVar, dVar2);
        return l3 + C1387g.m6412l(3) + C1387g.m6410j(a5) + a5;
    }

    /* renamed from: a */
    private static int m6675a(C1485v0 v0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1380d dVar, C1380d dVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int a = m6674a(v0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2);
        boolean z = true;
        int l = C1387g.m6412l(1) + C1387g.m6410j(a) + a + 0;
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                int a2 = m6679a((String) entry.getKey(), (String) entry.getValue());
                l += C1387g.m6412l(2) + C1387g.m6410j(a2) + a2;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                z = false;
            }
            l += C1387g.m6400b(3, z);
        }
        return l + C1387g.m6407g(4, i2);
    }

    /* renamed from: a */
    private static int m6676a(C4831a aVar, String str) {
        return C1387g.m6404e(1, aVar.f12623f) + C1387g.m6399b(2, C1380d.m6377a(str));
    }

    /* renamed from: a */
    private static int m6677a(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + C1387g.m6397b(1, f.floatValue());
        }
        return i3 + C1387g.m6406f(2, i) + C1387g.m6400b(3, z) + C1387g.m6407g(4, i2) + C1387g.m6398b(5, j) + C1387g.m6398b(6, j2);
    }

    /* renamed from: a */
    private static int m6678a(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        int b = C1387g.m6398b(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0) + 0;
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        int b2 = b + C1387g.m6399b(2, C1380d.m6377a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            b2 += C1387g.m6399b(3, C1380d.m6377a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            b2 += C1387g.m6398b(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return b2 + C1387g.m6407g(5, i);
    }

    /* renamed from: a */
    private static int m6679a(String str, String str2) {
        int b = C1387g.m6399b(1, C1380d.m6377a(str));
        if (str2 == null) {
            str2 = "";
        }
        return b + C1387g.m6399b(2, C1380d.m6377a(str2));
    }

    /* renamed from: a */
    private static int m6680a(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int b = C1387g.m6399b(1, C1380d.m6377a(thread.getName())) + C1387g.m6407g(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            int a2 = m6678a(a, z);
            b += C1387g.m6412l(3) + C1387g.m6410j(a2) + a2;
        }
        return b;
    }

    /* renamed from: a */
    private static C1380d m6681a(String str) {
        if (str == null) {
            return null;
        }
        return C1380d.m6377a(str);
    }

    /* renamed from: a */
    private static void m6682a(C1387g gVar, int i, StackTraceElement stackTraceElement, boolean z) {
        gVar.mo5533c(i, 2);
        gVar.mo5537e(m6678a(stackTraceElement, z));
        int i2 = 0;
        gVar.mo5520a(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(stackTraceElement.getClassName());
        sb.append(".");
        sb.append(stackTraceElement.getMethodName());
        gVar.mo5521a(2, C1380d.m6377a(sb.toString()));
        if (stackTraceElement.getFileName() != null) {
            gVar.mo5521a(3, C1380d.m6377a(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            gVar.mo5520a(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 4;
        }
        gVar.mo5536d(5, i2);
    }

    /* renamed from: a */
    public static void m6683a(C1387g gVar, int i, String str, int i2, long j, long j2, boolean z, Map<C4831a, String> map, int i3, String str2, String str3) {
        C1387g gVar2 = gVar;
        C1380d a = m6681a(str);
        C1380d a2 = m6681a(str3);
        C1380d a3 = m6681a(str2);
        gVar2.mo5533c(9, 2);
        C1380d dVar = a3;
        gVar2.mo5537e(m6667a(i, a, i2, j, j2, z, map, i3, a3, a2));
        gVar2.mo5519a(3, i);
        gVar2.mo5521a(4, a);
        gVar2.mo5536d(5, i2);
        gVar2.mo5520a(6, j);
        gVar2.mo5520a(7, j2);
        gVar2.mo5522a(10, z);
        for (Entry entry : map.entrySet()) {
            gVar2.mo5533c(11, 2);
            gVar2.mo5537e(m6676a((C4831a) entry.getKey(), (String) entry.getValue()));
            gVar2.mo5519a(1, ((C4831a) entry.getKey()).f12623f);
            gVar2.mo5521a(2, C1380d.m6377a((String) entry.getValue()));
        }
        gVar2.mo5536d(12, i3);
        if (dVar != null) {
            gVar2.mo5521a(13, dVar);
        }
        if (a2 != null) {
            gVar2.mo5521a(14, a2);
        }
    }

    /* renamed from: a */
    public static void m6684a(C1387g gVar, long j, String str, C1485v0 v0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, Map<String, String> map, C1371a0 a0Var, RunningAppProcessInfo runningAppProcessInfo, int i, String str2, String str3, Float f, int i2, boolean z, long j2, long j3) {
        C1387g gVar2 = gVar;
        String str4 = str3;
        C1380d a = C1380d.m6377a(str2);
        C1380d a2 = str4 == null ? null : C1380d.m6377a(str4.replace("-", ""));
        C1380d b = a0Var.mo5487b();
        if (b == null) {
            C4781c.m19229f().mo13796e("CrashlyticsCore", "No log data to include with this event.");
        }
        a0Var.mo5482a();
        gVar2.mo5533c(10, 2);
        gVar2.mo5537e(m6668a(j, str, v0Var, thread, stackTraceElementArr, threadArr, list, 8, map, runningAppProcessInfo, i, a, a2, f, i2, z, j2, j3, b));
        gVar2.mo5520a(1, j);
        gVar2.mo5521a(2, C1380d.m6377a(str));
        C1380d dVar = b;
        m6688a(gVar, v0Var, thread, stackTraceElementArr, threadArr, list, 8, a, a2, map, runningAppProcessInfo, i);
        m6689a(gVar, f, i2, z, i, j2, j3);
        m6685a(gVar2, dVar);
    }

    /* renamed from: a */
    private static void m6685a(C1387g gVar, C1380d dVar) {
        if (dVar != null) {
            gVar.mo5533c(6, 2);
            gVar.mo5537e(m6669a(dVar));
            gVar.mo5521a(1, dVar);
        }
    }

    /* renamed from: a */
    private static void m6686a(C1387g gVar, C1485v0 v0Var, int i, int i2, int i3) {
        gVar.mo5533c(i3, 2);
        gVar.mo5537e(m6673a(v0Var, 1, i2));
        gVar.mo5521a(1, C1380d.m6377a(v0Var.f4652b));
        String str = v0Var.f4651a;
        if (str != null) {
            gVar.mo5521a(3, C1380d.m6377a(str));
        }
        int i4 = 0;
        for (StackTraceElement a : v0Var.f4653c) {
            m6682a(gVar, 4, a, true);
        }
        C1485v0 v0Var2 = v0Var.f4654d;
        if (v0Var2 == null) {
            return;
        }
        if (i < i2) {
            m6686a(gVar, v0Var2, i + 1, i2, 6);
            return;
        }
        while (v0Var2 != null) {
            v0Var2 = v0Var2.f4654d;
            i4++;
        }
        gVar.mo5536d(7, i4);
    }

    /* renamed from: a */
    private static void m6687a(C1387g gVar, C1485v0 v0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1380d dVar, C1380d dVar2) {
        gVar.mo5533c(1, 2);
        gVar.mo5537e(m6674a(v0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2));
        m6694a(gVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            m6694a(gVar, threadArr[i2], (StackTraceElement[]) list.get(i2), 0, false);
        }
        m6686a(gVar, v0Var, 1, i, 2);
        gVar.mo5533c(3, 2);
        gVar.mo5537e(m6666a());
        gVar.mo5521a(1, f4640a);
        gVar.mo5521a(2, f4640a);
        gVar.mo5520a(3, 0);
        gVar.mo5533c(4, 2);
        gVar.mo5537e(m6670a(dVar, dVar2));
        gVar.mo5520a(1, 0);
        gVar.mo5520a(2, 0);
        gVar.mo5521a(3, dVar);
        if (dVar2 != null) {
            gVar.mo5521a(4, dVar2);
        }
    }

    /* renamed from: a */
    private static void m6688a(C1387g gVar, C1485v0 v0Var, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C1380d dVar, C1380d dVar2, Map<String, String> map, RunningAppProcessInfo runningAppProcessInfo, int i2) {
        gVar.mo5533c(3, 2);
        gVar.mo5537e(m6675a(v0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2, map, runningAppProcessInfo, i2));
        m6687a(gVar, v0Var, thread, stackTraceElementArr, threadArr, list, i, dVar, dVar2);
        if (map != null && !map.isEmpty()) {
            m6695a(gVar, map);
        }
        if (runningAppProcessInfo != null) {
            gVar.mo5522a(3, runningAppProcessInfo.importance != 100);
        }
        gVar.mo5536d(4, i2);
    }

    /* renamed from: a */
    private static void m6689a(C1387g gVar, Float f, int i, boolean z, int i2, long j, long j2) {
        gVar.mo5533c(5, 2);
        gVar.mo5537e(m6677a(f, i, z, i2, j, j2));
        if (f != null) {
            gVar.mo5518a(1, f.floatValue());
        }
        gVar.mo5529b(2, i);
        gVar.mo5522a(3, z);
        gVar.mo5536d(4, i2);
        gVar.mo5520a(5, j);
        gVar.mo5520a(6, j2);
    }

    /* renamed from: a */
    public static void m6690a(C1387g gVar, String str, String str2, long j) {
        gVar.mo5521a(1, C1380d.m6377a(str2));
        gVar.mo5521a(2, C1380d.m6377a(str));
        gVar.mo5520a(3, j);
    }

    /* renamed from: a */
    public static void m6691a(C1387g gVar, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        C1380d a = C1380d.m6377a(str);
        C1380d a2 = m6681a(str2);
        C1380d a3 = m6681a(str3);
        int b = C1387g.m6399b(1, a) + 0;
        if (str2 != null) {
            b += C1387g.m6399b(2, a2);
        }
        if (str3 != null) {
            b += C1387g.m6399b(3, a3);
        }
        gVar.mo5533c(6, 2);
        gVar.mo5537e(b);
        gVar.mo5521a(1, a);
        if (str2 != null) {
            gVar.mo5521a(2, a2);
        }
        if (str3 != null) {
            gVar.mo5521a(3, a3);
        }
    }

    /* renamed from: a */
    public static void m6692a(C1387g gVar, String str, String str2, String str3, String str4, String str5, int i, String str6) {
        C1380d a = C1380d.m6377a(str);
        C1380d a2 = C1380d.m6377a(str2);
        C1380d a3 = C1380d.m6377a(str3);
        C1380d a4 = C1380d.m6377a(str4);
        C1380d a5 = C1380d.m6377a(str5);
        C1380d a6 = str6 != null ? C1380d.m6377a(str6) : null;
        gVar.mo5533c(7, 2);
        gVar.mo5537e(m6671a(a, a2, a3, a4, a5, i, a6));
        gVar.mo5521a(1, a);
        gVar.mo5521a(2, a3);
        gVar.mo5521a(3, a4);
        gVar.mo5533c(5, 2);
        gVar.mo5537e(m6696b(a2));
        gVar.mo5521a(1, a2);
        gVar.mo5521a(6, a5);
        if (a6 != null) {
            gVar.mo5521a(8, f4641b);
            gVar.mo5521a(9, a6);
        }
        gVar.mo5519a(10, i);
    }

    /* renamed from: a */
    public static void m6693a(C1387g gVar, String str, String str2, boolean z) {
        C1380d a = C1380d.m6377a(str);
        C1380d a2 = C1380d.m6377a(str2);
        gVar.mo5533c(8, 2);
        gVar.mo5537e(m6672a(a, a2, z));
        gVar.mo5519a(1, 3);
        gVar.mo5521a(2, a);
        gVar.mo5521a(3, a2);
        gVar.mo5522a(4, z);
    }

    /* renamed from: a */
    private static void m6694a(C1387g gVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        gVar.mo5533c(1, 2);
        gVar.mo5537e(m6680a(thread, stackTraceElementArr, i, z));
        gVar.mo5521a(1, C1380d.m6377a(thread.getName()));
        gVar.mo5536d(2, i);
        for (StackTraceElement a : stackTraceElementArr) {
            m6682a(gVar, 3, a, z);
        }
    }

    /* renamed from: a */
    private static void m6695a(C1387g gVar, Map<String, String> map) {
        for (Entry entry : map.entrySet()) {
            gVar.mo5533c(2, 2);
            gVar.mo5537e(m6679a((String) entry.getKey(), (String) entry.getValue()));
            gVar.mo5521a(1, C1380d.m6377a((String) entry.getKey()));
            String str = (String) entry.getValue();
            if (str == null) {
                str = "";
            }
            gVar.mo5521a(2, C1380d.m6377a(str));
        }
    }

    /* renamed from: b */
    private static int m6696b(C1380d dVar) {
        return C1387g.m6399b(1, dVar) + 0;
    }
}
