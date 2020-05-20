package com.crashlytics.android.p033e;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import p242i.p243a.p244a.p245a.p246n.p248b.C4813i;
import p242i.p243a.p244a.p245a.p246n.p248b.C4830s;

/* renamed from: com.crashlytics.android.e.e */
class C1382e {

    /* renamed from: a */
    private static final AtomicLong f4452a = new AtomicLong(0);

    /* renamed from: b */
    private static String f4453b;

    public C1382e(C4830s sVar) {
        byte[] bArr = new byte[10];
        m6387c(bArr);
        m6385b(bArr);
        m6383a(bArr);
        String c = C4813i.m19378c(sVar.mo13893d());
        String a = C4813i.m19360a(bArr);
        f4453b = String.format(Locale.US, "%s-%s-%s-%s", new Object[]{a.substring(0, 12), a.substring(12, 16), a.subSequence(16, 20), c.substring(0, 12)}).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private void m6383a(byte[] bArr) {
        byte[] b = m6386b((long) Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = b[0];
        bArr[9] = b[1];
    }

    /* renamed from: a */
    private static byte[] m6384a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private void m6385b(byte[] bArr) {
        byte[] b = m6386b(f4452a.incrementAndGet());
        bArr[6] = b[0];
        bArr[7] = b[1];
    }

    /* renamed from: b */
    private static byte[] m6386b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) ((int) j));
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m6387c(byte[] bArr) {
        long time = new Date().getTime();
        long j = time / 1000;
        long j2 = time % 1000;
        byte[] a = m6384a(j);
        bArr[0] = a[0];
        bArr[1] = a[1];
        bArr[2] = a[2];
        bArr[3] = a[3];
        byte[] b = m6386b(j2);
        bArr[4] = b[0];
        bArr[5] = b[1];
    }

    public String toString() {
        return f4453b;
    }
}
