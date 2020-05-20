package p147g.p156d.p212c.p213i;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import p147g.p156d.p212c.C4633a;
import p147g.p156d.p212c.C4635c;
import p147g.p156d.p212c.C4640g;
import p147g.p156d.p212c.p213i.p214b.C4643a;
import p147g.p156d.p212c.p213i.p214b.C4645c;
import p147g.p156d.p212c.p215j.C4652b;

/* renamed from: g.d.c.i.a */
public final class C4642a implements C4640g {
    /* renamed from: a */
    private static C4652b m18700a(C4643a aVar, int i, int i2) {
        C4652b a = aVar.mo13541a();
        if (a != null) {
            int d = a.mo13585d();
            int c = a.mo13583c();
            int max = Math.max(i, d);
            int max2 = Math.max(i2, c);
            int min = Math.min(max / d, max2 / c);
            int i3 = (max - (d * min)) / 2;
            int i4 = (max2 - (c * min)) / 2;
            C4652b bVar = new C4652b(max, max2);
            int i5 = 0;
            while (i5 < c) {
                int i6 = i3;
                int i7 = 0;
                while (i7 < d) {
                    if (a.mo13580a(i7, i5)) {
                        bVar.mo13579a(i6, i4, min, min);
                    }
                    i7++;
                    i6 += min;
                }
                i5++;
                i4 += min;
            }
            return bVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    private static C4652b m18701a(String str, C4633a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == C4633a.AZTEC) {
            return m18700a(C4645c.m18711a(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    /* renamed from: a */
    public C4652b mo13539a(String str, C4633a aVar, int i, int i2, Map<C4635c, ?> map) {
        int i3;
        int i4;
        Charset charset;
        Charset charset2 = StandardCharsets.ISO_8859_1;
        int i5 = 33;
        if (map != null) {
            if (map.containsKey(C4635c.CHARACTER_SET)) {
                charset2 = Charset.forName(map.get(C4635c.CHARACTER_SET).toString());
            }
            if (map.containsKey(C4635c.ERROR_CORRECTION)) {
                i5 = Integer.parseInt(map.get(C4635c.ERROR_CORRECTION).toString());
            }
            if (map.containsKey(C4635c.AZTEC_LAYERS)) {
                charset = charset2;
                i4 = i5;
                i3 = Integer.parseInt(map.get(C4635c.AZTEC_LAYERS).toString());
                return m18701a(str, aVar, i, i2, charset, i4, i3);
            }
            charset = charset2;
            i4 = i5;
        } else {
            charset = charset2;
            i4 = 33;
        }
        i3 = 0;
        return m18701a(str, aVar, i, i2, charset, i4, i3);
    }
}
