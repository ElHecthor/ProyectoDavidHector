package com.facebook.internal;

import com.facebook.C1787m;
import java.util.Collection;

/* renamed from: com.facebook.internal.t */
public final class C1696t {

    /* renamed from: a */
    public static final Collection<String> f5152a = C1698v.m7395b((T[]) new String[]{"service_disabled", "AndroidAuthKillSwitchException"});

    /* renamed from: b */
    public static final Collection<String> f5153b = C1698v.m7395b((T[]) new String[]{"access_denied", "OAuthAccessDeniedException"});

    /* renamed from: a */
    public static final String m7347a() {
        return "v4.0";
    }

    /* renamed from: b */
    public static final String m7348b() {
        return String.format("m.%s", new Object[]{C1787m.m7752m()});
    }

    /* renamed from: c */
    public static final String m7349c() {
        return String.format("https://graph.%s", new Object[]{C1787m.m7752m()});
    }

    /* renamed from: d */
    public static final String m7350d() {
        return String.format("https://graph-video.%s", new Object[]{C1787m.m7752m()});
    }
}
