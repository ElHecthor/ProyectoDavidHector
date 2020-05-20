package com.facebook;

import com.facebook.internal.C1661j;
import com.facebook.internal.C1661j.C1664c;
import com.facebook.internal.C1661j.C1665d;
import com.facebook.internal.p042y.p044d.C1724b;
import java.util.Random;

/* renamed from: com.facebook.i */
public class C1631i extends RuntimeException {
    static final long serialVersionUID = 1;

    /* renamed from: com.facebook.i$a */
    class C1632a implements C1664c {

        /* renamed from: a */
        final /* synthetic */ String f5024a;

        C1632a(C1631i iVar, String str) {
            this.f5024a = str;
        }

        /* renamed from: a */
        public void mo5768a(boolean z) {
            if (z) {
                try {
                    C1724b.m7498a(this.f5024a);
                } catch (Exception unused) {
                }
            }
        }
    }

    public C1631i() {
    }

    public C1631i(String str) {
        super(str);
        Random random = new Random();
        if (str != null && C1787m.m7758s() && random.nextInt(100) > 50) {
            C1661j.m7223a(C1665d.ErrorReport, new C1632a(this, str));
        }
    }

    public C1631i(String str, Throwable th) {
        super(str, th);
    }

    public C1631i(Throwable th) {
        super(th);
    }

    public String toString() {
        return getMessage();
    }
}
