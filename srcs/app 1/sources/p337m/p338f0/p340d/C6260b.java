package p337m.p338f0.p340d;

import java.util.Arrays;
import java.util.logging.Logger;
import p308k.p323z.p325d.C5942k;
import p308k.p323z.p325d.C5952u;

/* renamed from: m.f0.d.b */
public final class C6260b {
    /* renamed from: a */
    public static final String m23500a(long j) {
        StringBuilder sb;
        long j2;
        long j3;
        StringBuilder sb2;
        long j4;
        String str = " s ";
        if (j <= ((long) -999500000)) {
            sb = new StringBuilder();
            j2 = j - ((long) 500000000);
        } else {
            String str2 = " ms";
            if (j <= ((long) -999500)) {
                sb = new StringBuilder();
                j3 = j - ((long) 500000);
            } else {
                String str3 = " µs";
                if (j <= 0) {
                    sb2 = new StringBuilder();
                    j4 = j - ((long) 500);
                } else if (j < ((long) 999500)) {
                    sb2 = new StringBuilder();
                    j4 = j + ((long) 500);
                } else if (j < ((long) 999500000)) {
                    sb = new StringBuilder();
                    j3 = j + ((long) 500000);
                } else {
                    sb = new StringBuilder();
                    j2 = j + ((long) 500000000);
                }
                sb2.append(j4 / ((long) 1000));
                sb2.append(str3);
                String sb3 = sb2.toString();
                C5952u uVar = C5952u.f14949a;
                String str4 = "%6s";
                String format = String.format(str4, Arrays.copyOf(new Object[]{sb3}, 1));
                C5942k.m22324a((Object) format, "java.lang.String.format(format, *args)");
                return format;
            }
            sb2.append(j3 / ((long) 1000000));
            sb2.append(str2);
            String sb32 = sb2.toString();
            C5952u uVar2 = C5952u.f14949a;
            String str42 = "%6s";
            String format2 = String.format(str42, Arrays.copyOf(new Object[]{sb32}, 1));
            C5942k.m22324a((Object) format2, "java.lang.String.format(format, *args)");
            return format2;
        }
        sb2.append(j2 / ((long) 1000000000));
        sb2.append(str);
        String sb322 = sb2.toString();
        C5952u uVar22 = C5952u.f14949a;
        String str422 = "%6s";
        String format22 = String.format(str422, Arrays.copyOf(new Object[]{sb322}, 1));
        C5942k.m22324a((Object) format22, "java.lang.String.format(format, *args)");
        return format22;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m23502b(C6259a aVar, C6261c cVar, String str) {
        Logger a = C6262d.f15455j.mo16136a();
        StringBuilder sb = new StringBuilder();
        sb.append(cVar.mo16123f());
        sb.append(' ');
        C5952u uVar = C5952u.f14949a;
        Object[] objArr = {str};
        String format = String.format("%-22s", Arrays.copyOf(objArr, 1));
        C5942k.m22324a((Object) format, "java.lang.String.format(format, *args)");
        sb.append(format);
        sb.append(": ");
        sb.append(aVar.mo16109b());
        a.fine(sb.toString());
    }
}
