package p337m.p338f0.p342f;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p308k.C5812t;
import p308k.p323z.p325d.C5942k;
import p337m.p338f0.C6250b;

/* renamed from: m.f0.f.c */
public final class C6293c {

    /* renamed from: a */
    private static final C6294a f15567a = new C6294a();

    /* renamed from: b */
    private static final String[] f15568b;

    /* renamed from: c */
    private static final DateFormat[] f15569c;

    /* renamed from: m.f0.f.c$a */
    public static final class C6294a extends ThreadLocal<DateFormat> {
        C6294a() {
        }

        /* access modifiers changed from: protected */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C6250b.f15419e);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f15568b = strArr;
        f15569c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final String m23666a(Date date) {
        C5942k.m22327b(date, "$this$toHttpDateString");
        String format = ((DateFormat) f15567a.get()).format(date);
        C5942k.m22324a((Object) format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }

    /* renamed from: a */
    public static final Date m23667a(String str) {
        C5942k.m22327b(str, "$this$toHttpDateOrNull");
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f15567a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f15568b) {
            int length = f15568b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f15569c[i];
                if (dateFormat == 0) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(f15568b[i], Locale.US);
                    simpleDateFormat.setTimeZone(C6250b.f15419e);
                    f15569c[i] = simpleDateFormat;
                    dateFormat = simpleDateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            C5812t tVar = C5812t.f14872a;
            return null;
        }
    }
}
