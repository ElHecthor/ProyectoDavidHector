package com.bumptech.glide;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.integration.okhttp3.C0846a;
import java.util.Collections;
import java.util.Set;
import p255io.stashteam.stashapp.utils.CustomGlideAppModule;

final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {

    /* renamed from: a */
    private final CustomGlideAppModule f3267a = new CustomGlideAppModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        String str = "Glide";
        if (Log.isLoggable(str, 3)) {
            Log.d(str, "Discovered AppGlideModule from annotation: io.stashteam.stashapp.utils.CustomGlideAppModule");
            Log.d(str, "Discovered LibraryGlideModule from annotation: com.bumptech.glide.integration.okhttp3.OkHttpLibraryGlideModule");
        }
    }

    /* renamed from: a */
    public void mo4511a(Context context, C0832c cVar, C0840i iVar) {
        new C0846a().mo4511a(context, cVar, iVar);
        this.f3267a.mo4511a(context, cVar, iVar);
    }

    /* renamed from: a */
    public void mo4512a(Context context, C0834d dVar) {
        this.f3267a.mo4512a(context, dVar);
    }

    /* renamed from: a */
    public boolean mo4513a() {
        return this.f3267a.mo4513a();
    }

    /* renamed from: b */
    public Set<Class<?>> mo4509b() {
        return Collections.emptySet();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0830a m4443c() {
        return new C0830a();
    }
}
