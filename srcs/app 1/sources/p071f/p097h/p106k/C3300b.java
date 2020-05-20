package p071f.p097h.p106k;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.text.Html;
import android.text.Spanned;

@SuppressLint({"InlinedApi"})
/* renamed from: f.h.k.b */
public final class C3300b {
    /* renamed from: a */
    public static Spanned m13501a(String str, int i) {
        return VERSION.SDK_INT >= 24 ? Html.fromHtml(str, i) : Html.fromHtml(str);
    }
}
