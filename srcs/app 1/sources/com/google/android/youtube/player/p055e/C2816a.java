package com.google.android.youtube.player.p055e;

import android.app.Activity;
import android.content.Context;
import com.google.android.youtube.player.p055e.C2843o.C2844a;
import com.google.android.youtube.player.p055e.C2843o.C2845b;

/* renamed from: com.google.android.youtube.player.e.a */
public abstract class C2816a {

    /* renamed from: a */
    private static final C2816a f8269a = m11727b();

    /* renamed from: a */
    public static C2816a m11726a() {
        return f8269a;
    }

    /* renamed from: b */
    private static C2816a m11727b() {
        try {
            return (C2816a) Class.forName("com.google.android.youtube.api.locallylinked.LocallyLinkedFactory").asSubclass(C2816a.class).newInstance();
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException(e2);
        } catch (ClassNotFoundException unused) {
            return new C2818c();
        }
    }

    /* renamed from: a */
    public abstract C2819d mo9439a(Context context, String str, C2844a aVar, C2845b bVar);

    /* renamed from: a */
    public abstract C2822f mo9440a(Activity activity, C2819d dVar, boolean z);
}
