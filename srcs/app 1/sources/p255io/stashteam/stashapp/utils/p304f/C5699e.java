package p255io.stashteam.stashapp.utils.p304f;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import java.util.Locale;
import p071f.p085c.p086b.C3155b;
import p071f.p085c.p086b.C3155b.C3156a;
import p071f.p097h.p098e.C3236a;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.utils.f.e */
public final class C5699e {
    /* renamed from: a */
    public static final int m21783a(Context context, int i) {
        C5942k.m22327b(context, "$this$getColorCompat");
        return C3236a.m13263a(context, i);
    }

    /* renamed from: a */
    public static final Drawable m21784a(Context context, int i, int i2) {
        C5942k.m22327b(context, "$this$getTintDrawable");
        Drawable b = m21788b(context, i);
        if (b != null) {
            return C5702h.m21796a(b, m21783a(context, i2));
        }
        return null;
    }

    /* renamed from: a */
    public static final void m21785a(Context context, long j) {
        C5942k.m22327b(context, "$this$openContactUsScreen");
        String string = context.getString(R.string.contact_us_text, new Object[]{context.getString(R.string.app_name), "1.10.0", Integer.valueOf(34), "android", Long.valueOf(j)});
        C5942k.m22324a((Object) string, "getString(\n            R…\n            userId\n    )");
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        String str = "android.intent.extra.SUBJECT";
        intent.putExtra(str, context.getString(R.string.contact_us_subject, new Object[]{Long.valueOf(j)}));
        intent.putExtra("android.intent.extra.TEXT", string);
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"stashapp.games@gmail.com"});
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.contact_us_send_email)));
    }

    /* renamed from: a */
    public static final void m21786a(Context context, String str) {
        C5942k.m22327b(context, "$this$openUrl");
        C5942k.m22327b(str, "url");
        if (m21787a(context)) {
            C3155b a = new C3156a().mo10147a();
            C5942k.m22324a((Object) a, "builder.build()");
            a.mo10146a(context, Uri.parse(str));
            return;
        }
        Uri parse = Uri.parse(str);
        C5942k.m22324a((Object) parse, "Uri.parse(this)");
        context.startActivity(new Intent("android.intent.action.VIEW", parse));
    }

    /* renamed from: a */
    private static final boolean m21787a(Context context) {
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        intent.setPackage("com.android.chrome");
        List queryIntentServices = context.getPackageManager().queryIntentServices(intent, 0);
        C5942k.m22324a((Object) queryIntentServices, "context.packageManager.q…ervices(serviceIntent, 0)");
        return !queryIntentServices.isEmpty();
    }

    /* renamed from: b */
    public static final Drawable m21788b(Context context, int i) {
        C5942k.m22327b(context, "$this$getDrawableCompat");
        return C3236a.m13271c(context, i);
    }

    /* renamed from: b */
    public static final void m21789b(Context context) {
        C5942k.m22327b(context, "$this$openFeedbackForm");
        Locale locale = Locale.getDefault();
        C5942k.m22324a((Object) locale, "Locale.getDefault()");
        m21786a(context, C5942k.m22326a((Object) locale.getLanguage(), (Object) "ru") ? "https://forms.gle/4121R9uA1G4hkFHK7" : "https://forms.gle/yMuop21ApHYHVL3u9");
    }

    /* renamed from: c */
    public static final void m21790c(Context context) {
        C5942k.m22327b(context, "$this$openPrivacyPolicy");
        m21786a(context, "https://stash.games/privacy-mobile.html");
    }

    /* renamed from: d */
    public static final void m21791d(Context context) {
        String str = "android.intent.action.VIEW";
        C5942k.m22327b(context, "$this$openStore");
        String packageName = context.getPackageName();
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("market://details?id=");
            sb.append(packageName);
            context.startActivity(new Intent(str, Uri.parse(sb.toString())));
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("https://play.google.com/store/apps/details?id=");
            sb2.append(packageName);
            context.startActivity(new Intent(str, Uri.parse(sb2.toString())));
        }
    }

    /* renamed from: e */
    public static final void m21792e(Context context) {
        C5942k.m22327b(context, "$this$openTermsOfUse");
        m21786a(context, "https://stash.games/terms-mobile.html");
    }
}
