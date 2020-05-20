package p071f.p097h.p106k;

import android.os.Build.VERSION;
import android.text.TextUtils;
import java.util.Locale;

/* renamed from: f.h.k.g */
public final class C3313g {

    /* renamed from: a */
    private static final Locale f9490a;

    static {
        String str = "";
        f9490a = new Locale(str, str);
    }

    /* renamed from: a */
    private static int m13527a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    /* renamed from: b */
    public static int m13528b(Locale locale) {
        if (VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale != null && !locale.equals(f9490a)) {
            String b = C3301c.m13504b(locale);
            if (b == null) {
                return m13527a(locale);
            }
            if (b.equalsIgnoreCase("Arab") || b.equalsIgnoreCase("Hebr")) {
                return 1;
            }
        }
        return 0;
    }
}
