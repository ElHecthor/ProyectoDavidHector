package com.google.android.youtube.player.p055e;

import android.content.Context;
import android.content.res.Resources;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.youtube.player.e.i */
public final class C2831i {

    /* renamed from: a */
    public final String f8273a;

    public C2831i(Context context) {
        Resources resources = context.getResources();
        Map a = C2852s.m11843a((resources == null || resources.getConfiguration() == null || resources.getConfiguration().locale == null) ? Locale.getDefault() : resources.getConfiguration().locale);
        this.f8273a = (String) a.get("error_initializing_player");
        String str = (String) a.get("get_youtube_app_title");
        String str2 = (String) a.get("get_youtube_app_text");
        String str3 = (String) a.get("get_youtube_app_action");
        String str4 = (String) a.get("enable_youtube_app_title");
        String str5 = (String) a.get("enable_youtube_app_text");
        String str6 = (String) a.get("enable_youtube_app_action");
        String str7 = (String) a.get("update_youtube_app_title");
        String str8 = (String) a.get("update_youtube_app_text");
        String str9 = (String) a.get("update_youtube_app_action");
    }
}
