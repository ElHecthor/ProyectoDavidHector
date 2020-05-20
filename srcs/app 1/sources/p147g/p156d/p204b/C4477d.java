package p147g.p156d.p204b;

import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: g.d.b.d */
public enum C4477d implements C4484e {
    IDENTITY {
        /* renamed from: a */
        public String mo13332a(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE {
        /* renamed from: a */
        public String mo13332a(Field field) {
            return C4477d.m18274a(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES {
        /* renamed from: a */
        public String mo13332a(Field field) {
            return C4477d.m18274a(C4477d.m18275a(field.getName(), " "));
        }
    },
    LOWER_CASE_WITH_UNDERSCORES {
        /* renamed from: a */
        public String mo13332a(Field field) {
            return C4477d.m18275a(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES {
        /* renamed from: a */
        public String mo13332a(Field field) {
            return C4477d.m18275a(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS {
        /* renamed from: a */
        public String mo13332a(Field field) {
            return C4477d.m18275a(field.getName(), ".").toLowerCase(Locale.ENGLISH);
        }
    };

    /* renamed from: a */
    private static String m18273a(char c, String str, int i) {
        if (i >= str.length()) {
            return String.valueOf(c);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(c);
        sb.append(str.substring(i));
        return sb.toString();
    }

    /* renamed from: a */
    static String m18274a(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(m18273a(Character.toUpperCase(charAt), str, i + 1));
        return sb.toString();
    }

    /* renamed from: a */
    static String m18275a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }
}
