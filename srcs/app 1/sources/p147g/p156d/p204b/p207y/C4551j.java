package p147g.p156d.p204b.p207y;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: g.d.b.y.j */
public class C4551j {
    /* renamed from: a */
    private static String m18441a(int i) {
        if (i == 0) {
            return "EEEE, MMMM d, yyyy";
        }
        if (i == 1) {
            return "MMMM d, yyyy";
        }
        if (i == 2) {
            return "MMM d, yyyy";
        }
        if (i == 3) {
            return "M/d/yy";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static DateFormat m18442a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m18441a(i));
        sb.append(" ");
        sb.append(m18443b(i2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    /* renamed from: b */
    private static String m18443b(int i) {
        if (i == 0 || i == 1) {
            return "h:mm:ss a z";
        }
        if (i == 2) {
            return "h:mm:ss a";
        }
        if (i == 3) {
            return "h:mm a";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown DateFormat style: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
