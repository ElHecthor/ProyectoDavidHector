package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C2166k;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.p051p.C2175c;
import com.google.android.gms.common.util.C2194i;
import javax.annotation.concurrent.GuardedBy;
import p071f.p088e.C3175g;
import p147g.p156d.p157a.p167b.p171b.C3850b;

/* renamed from: com.google.android.gms.common.internal.e */
public final class C2113e {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C3175g<String, String> f6044a = new C3175g<>();

    /* renamed from: a */
    public static String m8744a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C2175c.m8939a(context).mo6965b(packageName).toString();
        } catch (NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    public static String m8745a(Context context, int i) {
        Resources resources = context.getResources();
        int i2 = i != 1 ? i != 2 ? i != 3 ? 17039370 : C3850b.common_google_play_services_enable_button : C3850b.common_google_play_services_update_button : C3850b.common_google_play_services_install_button;
        return resources.getString(i2);
    }

    /* renamed from: a */
    private static String m8746a(Context context, String str) {
        synchronized (f6044a) {
            String str2 = (String) f6044a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String str3 = "GoogleApiAvailability";
                String str4 = "Missing resource: ";
                String valueOf = String.valueOf(str);
                Log.w(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String str5 = "GoogleApiAvailability";
                String str6 = "Got empty resource: ";
                String valueOf2 = String.valueOf(str);
                Log.w(str5, valueOf2.length() != 0 ? str6.concat(valueOf2) : new String(str6));
                return null;
            }
            f6044a.put(str, string);
            return string;
        }
    }

    /* renamed from: a */
    private static String m8747a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m8746a(context, str);
        if (a == null) {
            a = resources.getString(C2166k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: b */
    public static String m8748b(Context context) {
        return context.getResources().getString(C3850b.common_google_play_services_notification_channel_name);
    }

    /* renamed from: b */
    public static String m8749b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m8744a(context);
        if (i == 1) {
            return resources.getString(C3850b.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C3850b.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m8747a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m8747a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C3850b.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m8747a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m8747a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m8747a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C3850b.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C2166k.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (C2194i.m8992c(context)) {
            return resources.getString(C3850b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C3850b.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: c */
    public static String m8750c(Context context, int i) {
        if (i != 6 && i != 19) {
            return m8749b(context, i);
        }
        return m8747a(context, "common_google_play_services_resolution_required_text", m8744a(context));
    }

    /* renamed from: d */
    public static String m8751d(Context context, int i) {
        String a = i == 6 ? m8746a(context, "common_google_play_services_resolution_required_title") : m8752e(context, i);
        return a == null ? context.getResources().getString(C3850b.common_google_play_services_notification_ticker) : a;
    }

    /* renamed from: e */
    public static String m8752e(Context context, int i) {
        String str;
        Resources resources = context.getResources();
        String str2 = "GoogleApiAvailability";
        switch (i) {
            case 1:
                return resources.getString(C3850b.common_google_play_services_install_title);
            case 2:
                return resources.getString(C3850b.common_google_play_services_update_title);
            case 3:
                return resources.getString(C3850b.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e(str2, "An invalid account was specified when connecting. Please provide a valid account.");
                return m8746a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e(str2, "Network error occurred. Please retry request later.");
                return m8746a(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e(str2, "The specified account could not be signed in.");
                return m8746a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e(str2, "The current user profile is restricted and could not use authenticated features.");
                return m8746a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                str = sb.toString();
                break;
        }
        Log.e(str2, str);
        return null;
    }
}
