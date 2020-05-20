package com.facebook.p034f0.p036r.p037g;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.facebook.f0.r.g.d */
public class C1599d {
    /* renamed from: a */
    public static boolean m7039a(View view) {
        if (!(view instanceof TextView)) {
            return false;
        }
        TextView textView = (TextView) view;
        return m7042c(textView) || m7040a(textView) || m7043d(textView) || m7045f(textView) || m7044e(textView) || m7041b(textView);
    }

    /* renamed from: a */
    private static boolean m7040a(TextView textView) {
        String replaceAll = C1601f.m7062j(textView).replaceAll("\\s", "");
        int length = replaceAll.length();
        boolean z = false;
        if (length >= 12 && length <= 19) {
            int i = 0;
            boolean z2 = false;
            for (int i2 = length - 1; i2 >= 0; i2--) {
                char charAt = replaceAll.charAt(i2);
                if (charAt < '0' || charAt > '9') {
                    return false;
                }
                int i3 = charAt - '0';
                if (z2) {
                    i3 *= 2;
                    if (i3 > 9) {
                        i3 = (i3 % 10) + 1;
                    }
                }
                i += i3;
                z2 = !z2;
            }
            if (i % 10 == 0) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: b */
    private static boolean m7041b(TextView textView) {
        if (textView.getInputType() == 32) {
            return true;
        }
        String j = C1601f.m7062j(textView);
        if (j == null || j.length() == 0) {
            return false;
        }
        return Patterns.EMAIL_ADDRESS.matcher(j).matches();
    }

    /* renamed from: c */
    private static boolean m7042c(TextView textView) {
        if (textView.getInputType() == 128) {
            return true;
        }
        return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
    }

    /* renamed from: d */
    private static boolean m7043d(TextView textView) {
        return textView.getInputType() == 96;
    }

    /* renamed from: e */
    private static boolean m7044e(TextView textView) {
        return textView.getInputType() == 3;
    }

    /* renamed from: f */
    private static boolean m7045f(TextView textView) {
        return textView.getInputType() == 112;
    }
}
