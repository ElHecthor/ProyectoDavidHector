package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.C0859d;
import com.bumptech.glide.load.C0875k;
import com.bumptech.glide.load.C0876l;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p005n.C0883e.C0884a;
import com.bumptech.glide.load.p005n.C0894k.C0895a;
import com.bumptech.glide.load.p005n.C0897m;
import com.bumptech.glide.load.p005n.C0897m.C0898a;
import com.bumptech.glide.load.p007o.C0995k;
import com.bumptech.glide.load.p007o.p008a0.C0916b;
import com.bumptech.glide.load.p007o.p008a0.C0921e;
import com.bumptech.glide.load.p007o.p009b0.C0953h;
import com.bumptech.glide.load.p011p.C1027a.C1029b;
import com.bumptech.glide.load.p011p.C1027a.C1030c;
import com.bumptech.glide.load.p011p.C1031b.C1032a;
import com.bumptech.glide.load.p011p.C1031b.C1036d;
import com.bumptech.glide.load.p011p.C1038c;
import com.bumptech.glide.load.p011p.C1039d.C1041b;
import com.bumptech.glide.load.p011p.C1042e.C1045c;
import com.bumptech.glide.load.p011p.C1047f.C1049b;
import com.bumptech.glide.load.p011p.C1047f.C1053e;
import com.bumptech.glide.load.p011p.C1055g;
import com.bumptech.glide.load.p011p.C1062k.C1063a;
import com.bumptech.glide.load.p011p.C1071o;
import com.bumptech.glide.load.p011p.C1081s.C1082a;
import com.bumptech.glide.load.p011p.C1081s.C1083b;
import com.bumptech.glide.load.p011p.C1081s.C1084c;
import com.bumptech.glide.load.p011p.C1081s.C1085d;
import com.bumptech.glide.load.p011p.C1086t;
import com.bumptech.glide.load.p011p.C1087u.C1088a;
import com.bumptech.glide.load.p011p.C1087u.C1089b;
import com.bumptech.glide.load.p011p.C1087u.C1090c;
import com.bumptech.glide.load.p011p.C1091v.C1092a;
import com.bumptech.glide.load.p011p.C1094w.C1095a;
import com.bumptech.glide.load.p011p.C1094w.C1096b;
import com.bumptech.glide.load.p011p.C1094w.C1098d;
import com.bumptech.glide.load.p011p.C1099x.C1100a;
import com.bumptech.glide.load.p011p.p012y.C1101a.C1102a;
import com.bumptech.glide.load.p011p.p012y.C1103b.C1104a;
import com.bumptech.glide.load.p011p.p012y.C1105c.C1106a;
import com.bumptech.glide.load.p011p.p012y.C1107d.C1108a;
import com.bumptech.glide.load.p011p.p012y.C1109e.C1111b;
import com.bumptech.glide.load.p011p.p012y.C1109e.C1112c;
import com.bumptech.glide.load.p011p.p012y.C1114f.C1115a;
import com.bumptech.glide.load.p013q.p014d.C1121a;
import com.bumptech.glide.load.p013q.p014d.C1122a0;
import com.bumptech.glide.load.p013q.p014d.C1124b;
import com.bumptech.glide.load.p013q.p014d.C1129c;
import com.bumptech.glide.load.p013q.p014d.C1130c0;
import com.bumptech.glide.load.p013q.p014d.C1133d0;
import com.bumptech.glide.load.p013q.p014d.C1144g;
import com.bumptech.glide.load.p013q.p014d.C1145h;
import com.bumptech.glide.load.p013q.p014d.C1149l;
import com.bumptech.glide.load.p013q.p014d.C1163n;
import com.bumptech.glide.load.p013q.p014d.C1169q;
import com.bumptech.glide.load.p013q.p014d.C1175u;
import com.bumptech.glide.load.p013q.p014d.C1177w;
import com.bumptech.glide.load.p013q.p014d.C1180y;
import com.bumptech.glide.load.p013q.p015e.C1182a.C1183a;
import com.bumptech.glide.load.p013q.p016f.C1188d;
import com.bumptech.glide.load.p013q.p016f.C1189e;
import com.bumptech.glide.load.p013q.p017g.C1190a;
import com.bumptech.glide.load.p013q.p018h.C1192a;
import com.bumptech.glide.load.p013q.p018h.C1196c;
import com.bumptech.glide.load.p013q.p018h.C1198d;
import com.bumptech.glide.load.p013q.p018h.C1206h;
import com.bumptech.glide.load.p013q.p018h.C1208j;
import com.bumptech.glide.load.p013q.p019i.C1209a;
import com.bumptech.glide.load.p013q.p019i.C1210b;
import com.bumptech.glide.load.p013q.p019i.C1211c;
import com.bumptech.glide.load.p013q.p019i.C1212d;
import com.bumptech.glide.load.p013q.p019i.C1213e;
import com.bumptech.glide.p021n.C1226a;
import com.bumptech.glide.p022o.C1236d;
import com.bumptech.glide.p022o.C1246l;
import com.bumptech.glide.p023p.C1255b;
import com.bumptech.glide.p023p.C1257d;
import com.bumptech.glide.p025r.C1272e;
import com.bumptech.glide.p025r.C1273f;
import com.bumptech.glide.p025r.p026j.C1283f;
import com.bumptech.glide.p025r.p026j.C1285h;
import com.bumptech.glide.p029t.C1309j;
import com.bumptech.glide.p029t.C1310k;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bumptech.glide.c */
public class C0832c implements ComponentCallbacks2 {

    /* renamed from: n */
    private static volatile C0832c f3268n;

    /* renamed from: o */
    private static volatile boolean f3269o;

    /* renamed from: f */
    private final C0921e f3270f;

    /* renamed from: g */
    private final C0953h f3271g;

    /* renamed from: h */
    private final C0836e f3272h;

    /* renamed from: i */
    private final C0840i f3273i;

    /* renamed from: j */
    private final C0916b f3274j;

    /* renamed from: k */
    private final C1246l f3275k;

    /* renamed from: l */
    private final C1236d f3276l;

    /* renamed from: m */
    private final List<C0852k> f3277m = new ArrayList();

    /* renamed from: com.bumptech.glide.c$a */
    public interface C0833a {
        /* renamed from: a */
        C1273f mo4530a();
    }

    C0832c(Context context, C0995k kVar, C0953h hVar, C0921e eVar, C0916b bVar, C1246l lVar, C1236d dVar, int i, C0833a aVar, Map<Class<?>, C0855l<?, ?>> map, List<C1272e<Object>> list, boolean z, boolean z2) {
        C0875k kVar2;
        C0875k kVar3;
        Class<C1226a> cls;
        Context context2 = context;
        C0921e eVar2 = eVar;
        C0916b bVar2 = bVar;
        Class<C1226a> cls2 = C1226a.class;
        Class<String> cls3 = String.class;
        Class<Integer> cls4 = Integer.class;
        Class<byte[]> cls5 = byte[].class;
        C0837f fVar = C0837f.NORMAL;
        this.f3270f = eVar2;
        this.f3274j = bVar2;
        this.f3271g = hVar;
        this.f3275k = lVar;
        this.f3276l = dVar;
        Resources resources = context.getResources();
        C0840i iVar = new C0840i();
        this.f3273i = iVar;
        iVar.mo4543a((ImageHeaderParser) new C1149l());
        if (VERSION.SDK_INT >= 27) {
            this.f3273i.mo4543a((ImageHeaderParser) new C1169q());
        }
        List a = this.f3273i.mo4554a();
        C1192a aVar2 = new C1192a(context2, a, eVar2, bVar2);
        C0875k c = C1133d0.m5409c(eVar);
        C1163n nVar = new C1163n(this.f3273i.mo4554a(), resources.getDisplayMetrics(), eVar2, bVar2);
        if (!z2 || VERSION.SDK_INT < 28) {
            kVar2 = new C1144g(nVar);
            kVar3 = new C1122a0(nVar, bVar2);
        } else {
            kVar3 = new C1175u();
            kVar2 = new C1145h();
        }
        C1188d dVar2 = new C1188d(context2);
        Class<byte[]> cls6 = cls5;
        C1084c cVar = new C1084c(resources);
        C1085d dVar3 = new C1085d(resources);
        Class<String> cls7 = cls3;
        C1083b bVar3 = new C1083b(resources);
        C1085d dVar4 = dVar3;
        C1082a aVar3 = new C1082a(resources);
        C1129c cVar2 = new C1129c(bVar2);
        Class<Integer> cls8 = cls4;
        C1209a aVar4 = new C1209a();
        C1212d dVar5 = new C1212d();
        ContentResolver contentResolver = context.getContentResolver();
        C0840i iVar2 = this.f3273i;
        C1083b bVar4 = bVar3;
        C1084c cVar3 = cVar;
        iVar2.mo4545a(ByteBuffer.class, (C0859d<Data>) new C1038c<Data>());
        iVar2.mo4545a(InputStream.class, (C0859d<Data>) new C1086t<Data>(bVar2));
        C1188d dVar6 = dVar2;
        String str = "Bitmap";
        iVar2.mo4550a(str, ByteBuffer.class, Bitmap.class, kVar2);
        iVar2.mo4550a(str, InputStream.class, Bitmap.class, kVar3);
        if (C0897m.m4651c()) {
            cls = cls2;
            this.f3273i.mo4550a(str, ParcelFileDescriptor.class, Bitmap.class, new C1177w(nVar));
        } else {
            cls = cls2;
        }
        C0840i iVar3 = this.f3273i;
        iVar3.mo4550a(str, ParcelFileDescriptor.class, Bitmap.class, c);
        iVar3.mo4550a(str, AssetFileDescriptor.class, Bitmap.class, C1133d0.m5406a(eVar));
        iVar3.mo4548a(Bitmap.class, Bitmap.class, (C1071o<Model, Data>) C1092a.m5279b());
        iVar3.mo4550a(str, Bitmap.class, Bitmap.class, new C1130c0());
        iVar3.mo4546a(Bitmap.class, (C0876l<TResource>) cVar2);
        String str2 = "BitmapDrawable";
        iVar3.mo4550a(str2, ByteBuffer.class, BitmapDrawable.class, new C1121a(resources, kVar2));
        iVar3.mo4550a(str2, InputStream.class, BitmapDrawable.class, new C1121a(resources, kVar3));
        iVar3.mo4550a(str2, ParcelFileDescriptor.class, BitmapDrawable.class, new C1121a(resources, c));
        iVar3.mo4546a(BitmapDrawable.class, (C0876l<TResource>) new C1124b<TResource>(eVar2, cVar2));
        String str3 = "Gif";
        iVar3.mo4550a(str3, InputStream.class, C1196c.class, new C1208j(a, aVar2, bVar2));
        iVar3.mo4550a(str3, ByteBuffer.class, C1196c.class, aVar2);
        iVar3.mo4546a(C1196c.class, (C0876l<TResource>) new C1198d<TResource>());
        Class<C1226a> cls9 = cls;
        iVar3.mo4548a(cls9, cls9, (C1071o<Model, Data>) C1092a.m5279b());
        iVar3.mo4550a(str, cls9, Bitmap.class, new C1206h(eVar2));
        C1188d dVar7 = dVar6;
        iVar3.mo4547a(Uri.class, Drawable.class, (C0875k<Data, TResource>) dVar7);
        iVar3.mo4547a(Uri.class, Bitmap.class, (C0875k<Data, TResource>) new C1180y<Data,TResource>(dVar7, eVar2));
        iVar3.mo4544a((C0884a<?>) new C1183a<Object>());
        iVar3.mo4548a(File.class, ByteBuffer.class, (C1071o<Model, Data>) new C1041b<Model,Data>());
        iVar3.mo4548a(File.class, InputStream.class, (C1071o<Model, Data>) new C1053e<Model,Data>());
        iVar3.mo4547a(File.class, File.class, (C0875k<Data, TResource>) new C1190a<Data,TResource>());
        iVar3.mo4548a(File.class, ParcelFileDescriptor.class, (C1071o<Model, Data>) new C1049b<Model,Data>());
        iVar3.mo4548a(File.class, File.class, (C1071o<Model, Data>) C1092a.m5279b());
        iVar3.mo4544a((C0884a<?>) new C0895a<Object>(bVar2));
        if (C0897m.m4651c()) {
            this.f3273i.mo4544a((C0884a<?>) new C0898a<Object>());
        }
        C0840i iVar4 = this.f3273i;
        C1084c cVar4 = cVar3;
        iVar4.mo4548a(Integer.TYPE, InputStream.class, (C1071o<Model, Data>) cVar4);
        C1083b bVar5 = bVar4;
        iVar4.mo4548a(Integer.TYPE, ParcelFileDescriptor.class, (C1071o<Model, Data>) bVar5);
        Class<Integer> cls10 = cls8;
        iVar4.mo4548a(cls10, InputStream.class, (C1071o<Model, Data>) cVar4);
        iVar4.mo4548a(cls10, ParcelFileDescriptor.class, (C1071o<Model, Data>) bVar5);
        C1085d dVar8 = dVar4;
        iVar4.mo4548a(cls10, Uri.class, (C1071o<Model, Data>) dVar8);
        C1082a aVar5 = aVar3;
        iVar4.mo4548a(Integer.TYPE, AssetFileDescriptor.class, (C1071o<Model, Data>) aVar5);
        iVar4.mo4548a(cls10, AssetFileDescriptor.class, (C1071o<Model, Data>) aVar5);
        iVar4.mo4548a(Integer.TYPE, Uri.class, (C1071o<Model, Data>) dVar8);
        Class<String> cls11 = cls7;
        iVar4.mo4548a(cls11, InputStream.class, (C1071o<Model, Data>) new C1045c<Model,Data>());
        iVar4.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1045c<Model,Data>());
        iVar4.mo4548a(cls11, InputStream.class, (C1071o<Model, Data>) new C1090c<Model,Data>());
        iVar4.mo4548a(cls11, ParcelFileDescriptor.class, (C1071o<Model, Data>) new C1089b<Model,Data>());
        iVar4.mo4548a(cls11, AssetFileDescriptor.class, (C1071o<Model, Data>) new C1088a<Model,Data>());
        iVar4.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1104a<Model,Data>());
        iVar4.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1030c<Model,Data>(context.getAssets()));
        iVar4.mo4548a(Uri.class, ParcelFileDescriptor.class, (C1071o<Model, Data>) new C1029b<Model,Data>(context.getAssets()));
        Context context3 = context;
        iVar4.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1106a<Model,Data>(context3));
        iVar4.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1108a<Model,Data>(context3));
        if (VERSION.SDK_INT >= 29) {
            this.f3273i.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1112c<Model,Data>(context3));
            this.f3273i.mo4548a(Uri.class, ParcelFileDescriptor.class, (C1071o<Model, Data>) new C1111b<Model,Data>(context3));
        }
        C0840i iVar5 = this.f3273i;
        ContentResolver contentResolver2 = contentResolver;
        iVar5.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1098d<Model,Data>(contentResolver2));
        iVar5.mo4548a(Uri.class, ParcelFileDescriptor.class, (C1071o<Model, Data>) new C1096b<Model,Data>(contentResolver2));
        iVar5.mo4548a(Uri.class, AssetFileDescriptor.class, (C1071o<Model, Data>) new C1095a<Model,Data>(contentResolver2));
        iVar5.mo4548a(Uri.class, InputStream.class, (C1071o<Model, Data>) new C1100a<Model,Data>());
        iVar5.mo4548a(URL.class, InputStream.class, (C1071o<Model, Data>) new C1115a<Model,Data>());
        iVar5.mo4548a(Uri.class, File.class, (C1071o<Model, Data>) new C1063a<Model,Data>(context3));
        iVar5.mo4548a(C1055g.class, InputStream.class, (C1071o<Model, Data>) new C1102a<Model,Data>());
        Class<byte[]> cls12 = cls6;
        iVar5.mo4548a(cls12, ByteBuffer.class, (C1071o<Model, Data>) new C1032a<Model,Data>());
        iVar5.mo4548a(cls12, InputStream.class, (C1071o<Model, Data>) new C1036d<Model,Data>());
        iVar5.mo4548a(Uri.class, Uri.class, (C1071o<Model, Data>) C1092a.m5279b());
        iVar5.mo4548a(Drawable.class, Drawable.class, (C1071o<Model, Data>) C1092a.m5279b());
        iVar5.mo4547a(Drawable.class, Drawable.class, (C0875k<Data, TResource>) new C1189e<Data,TResource>());
        iVar5.mo4549a(Bitmap.class, BitmapDrawable.class, (C1213e<TResource, Transcode>) new C1210b<TResource,Transcode>(resources));
        C1209a aVar6 = aVar4;
        iVar5.mo4549a(Bitmap.class, cls12, (C1213e<TResource, Transcode>) aVar6);
        C1212d dVar9 = dVar5;
        iVar5.mo4549a(Drawable.class, cls12, (C1213e<TResource, Transcode>) new C1211c<TResource,Transcode>(eVar2, aVar6, dVar9));
        iVar5.mo4549a(C1196c.class, cls12, (C1213e<TResource, Transcode>) dVar9);
        if (VERSION.SDK_INT >= 23) {
            C0875k b = C1133d0.m5408b(eVar);
            this.f3273i.mo4547a(ByteBuffer.class, Bitmap.class, b);
            this.f3273i.mo4547a(ByteBuffer.class, BitmapDrawable.class, (C0875k<Data, TResource>) new C1121a<Data,TResource>(resources, b));
        }
        Context context4 = context;
        C0916b bVar6 = bVar;
        C0836e eVar3 = new C0836e(context4, bVar6, this.f3273i, new C1283f(), aVar, map, list, kVar, z, i);
        this.f3272h = eVar3;
    }

    /* renamed from: a */
    public static C0832c m4445a(Context context) {
        if (f3268n == null) {
            GeneratedAppGlideModule b = m4449b(context.getApplicationContext());
            synchronized (C0832c.class) {
                if (f3268n == null) {
                    m4446a(context, b);
                }
            }
        }
        return f3268n;
    }

    /* renamed from: a */
    private static void m4446a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f3269o) {
            f3269o = true;
            m4450b(context, generatedAppGlideModule);
            f3269o = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: a */
    private static void m4447a(Context context, C0834d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<C1255b> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.mo4513a()) {
            emptyList = new C1257d(applicationContext).mo5225a();
        }
        String str = "Glide";
        if (generatedAppGlideModule != null && !generatedAppGlideModule.mo4509b().isEmpty()) {
            Set b = generatedAppGlideModule.mo4509b();
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                C1255b bVar = (C1255b) it.next();
                if (b.contains(bVar.getClass())) {
                    if (Log.isLoggable(str, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("AppGlideModule excludes manifest GlideModule: ");
                        sb.append(bVar);
                        Log.d(str, sb.toString());
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable(str, 3)) {
            for (C1255b bVar2 : emptyList) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Discovered GlideModule from manifest: ");
                sb2.append(bVar2.getClass());
                Log.d(str, sb2.toString());
            }
        }
        dVar.mo4533a(generatedAppGlideModule != null ? generatedAppGlideModule.mo4510c() : null);
        for (C1255b a : emptyList) {
            a.mo4562a(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo4512a(applicationContext, dVar);
        }
        C0832c a2 = dVar.mo4531a(applicationContext);
        for (C1255b bVar3 : emptyList) {
            try {
                bVar3.mo4561a(applicationContext, a2, a2.f3273i);
            } catch (AbstractMethodError e) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                sb3.append(bVar3.getClass().getName());
                throw new IllegalStateException(sb3.toString(), e);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo4511a(applicationContext, a2, a2.f3273i);
        }
        applicationContext.registerComponentCallbacks(a2);
        f3268n = a2;
    }

    /* renamed from: a */
    private static void m4448a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: b */
    private static GeneratedAppGlideModule m4449b(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{context.getApplicationContext()});
        } catch (ClassNotFoundException unused) {
            String str = "Glide";
            if (!Log.isLoggable(str, 5)) {
                return null;
            }
            Log.w(str, "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            return null;
        } catch (InstantiationException e) {
            m4448a((Exception) e);
            throw null;
        } catch (IllegalAccessException e2) {
            m4448a((Exception) e2);
            throw null;
        } catch (NoSuchMethodException e3) {
            m4448a((Exception) e3);
            throw null;
        } catch (InvocationTargetException e4) {
            m4448a((Exception) e4);
            throw null;
        }
    }

    /* renamed from: b */
    private static void m4450b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m4447a(context, new C0834d(), generatedAppGlideModule);
    }

    /* renamed from: c */
    private static C1246l m4451c(Context context) {
        C1309j.m6150a(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m4445a(context).mo4526h();
    }

    /* renamed from: d */
    public static C0852k m4452d(Context context) {
        return m4451c(context).mo5203a(context);
    }

    /* renamed from: a */
    public void mo4515a() {
        C1310k.m6166a();
        this.f3271g.mo4755a();
        this.f3270f.mo4711a();
        this.f3274j.mo4690a();
    }

    /* renamed from: a */
    public void mo4516a(int i) {
        C1310k.m6166a();
        for (C0852k onTrimMemory : this.f3277m) {
            onTrimMemory.onTrimMemory(i);
        }
        this.f3271g.mo4750a(i);
        this.f3270f.mo4712a(i);
        this.f3274j.mo4691a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4517a(C0852k kVar) {
        synchronized (this.f3277m) {
            if (!this.f3277m.contains(kVar)) {
                this.f3277m.add(kVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4518a(C1285h<?> hVar) {
        synchronized (this.f3277m) {
            for (C0852k b : this.f3277m) {
                if (b.mo4593b(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: b */
    public C0916b mo4519b() {
        return this.f3274j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4520b(C0852k kVar) {
        synchronized (this.f3277m) {
            if (this.f3277m.contains(kVar)) {
                this.f3277m.remove(kVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    /* renamed from: c */
    public C0921e mo4521c() {
        return this.f3270f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1236d mo4522d() {
        return this.f3276l;
    }

    /* renamed from: e */
    public Context mo4523e() {
        return this.f3272h.getBaseContext();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public C0836e mo4524f() {
        return this.f3272h;
    }

    /* renamed from: g */
    public C0840i mo4525g() {
        return this.f3273i;
    }

    /* renamed from: h */
    public C1246l mo4526h() {
        return this.f3275k;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        mo4515a();
    }

    public void onTrimMemory(int i) {
        mo4516a(i);
    }
}
