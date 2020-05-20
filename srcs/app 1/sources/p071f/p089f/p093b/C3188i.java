package p071f.p089f.p093b;

import java.util.Arrays;

/* renamed from: f.f.b.i */
public class C3188i {

    /* renamed from: k */
    private static int f9062k = 1;

    /* renamed from: a */
    private String f9063a;

    /* renamed from: b */
    public int f9064b = -1;

    /* renamed from: c */
    int f9065c = -1;

    /* renamed from: d */
    public int f9066d = 0;

    /* renamed from: e */
    public float f9067e;

    /* renamed from: f */
    float[] f9068f = new float[7];

    /* renamed from: g */
    C3189a f9069g;

    /* renamed from: h */
    C3180b[] f9070h = new C3180b[8];

    /* renamed from: i */
    int f9071i = 0;

    /* renamed from: j */
    public int f9072j = 0;

    /* renamed from: f.f.b.i$a */
    public enum C3189a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C3188i(C3189a aVar, String str) {
        this.f9069g = aVar;
    }

    /* renamed from: b */
    static void m12944b() {
        f9062k++;
    }

    /* renamed from: a */
    public void mo10366a() {
        this.f9063a = null;
        this.f9069g = C3189a.UNKNOWN;
        this.f9066d = 0;
        this.f9064b = -1;
        this.f9065c = -1;
        this.f9067e = 0.0f;
        this.f9071i = 0;
        this.f9072j = 0;
    }

    /* renamed from: a */
    public final void mo10367a(C3180b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f9071i;
            if (i >= i2) {
                C3180b[] bVarArr = this.f9070h;
                if (i2 >= bVarArr.length) {
                    this.f9070h = (C3180b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C3180b[] bVarArr2 = this.f9070h;
                int i3 = this.f9071i;
                bVarArr2[i3] = bVar;
                this.f9071i = i3 + 1;
                return;
            } else if (this.f9070h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo10368a(C3189a aVar, String str) {
        this.f9069g = aVar;
    }

    /* renamed from: b */
    public final void mo10369b(C3180b bVar) {
        int i = this.f9071i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f9070h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C3180b[] bVarArr = this.f9070h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f9071i--;
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo10370c(C3180b bVar) {
        int i = this.f9071i;
        for (int i2 = 0; i2 < i; i2++) {
            C3180b[] bVarArr = this.f9070h;
            bVarArr[i2].f9014d.mo10306a(bVarArr[i2], bVar, false);
        }
        this.f9071i = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f9063a);
        return sb.toString();
    }
}
