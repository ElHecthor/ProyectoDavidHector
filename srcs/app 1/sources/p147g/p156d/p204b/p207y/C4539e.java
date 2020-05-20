package p147g.p156d.p204b.p207y;

/* renamed from: g.d.b.y.e */
public final class C4539e {

    /* renamed from: a */
    private static final int f11952a = m18419a();

    /* renamed from: a */
    private static int m18419a() {
        return m18422b(System.getProperty("java.version"));
    }

    /* renamed from: a */
    private static int m18420a(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: b */
    public static int m18421b() {
        return f11952a;
    }

    /* renamed from: b */
    static int m18422b(String str) {
        int c = m18423c(str);
        if (c == -1) {
            c = m18420a(str);
        }
        if (c == -1) {
            return 6;
        }
        return c;
    }

    /* renamed from: c */
    private static int m18423c(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static boolean m18424c() {
        return f11952a >= 9;
    }
}
