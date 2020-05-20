package p071f.p126p.p127a;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.C0498a0;
import androidx.lifecycle.C0503b0;
import androidx.lifecycle.C0503b0.C0504a;
import androidx.lifecycle.C0508c0;
import androidx.lifecycle.C0523n;
import androidx.lifecycle.C0532t;
import androidx.lifecycle.C0533u;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import p071f.p088e.C3176h;
import p071f.p097h.p107l.C3314a;
import p071f.p126p.p127a.C3455a.C3456a;
import p071f.p126p.p128b.C3464b;
import p071f.p126p.p128b.C3464b.C3466b;

/* renamed from: f.p.a.b */
class C3457b extends C3455a {

    /* renamed from: c */
    static boolean f9793c = false;

    /* renamed from: a */
    private final C0523n f9794a;

    /* renamed from: b */
    private final C3460c f9795b;

    /* renamed from: f.p.a.b$a */
    public static class C3458a<D> extends C0532t<D> implements C3466b<D> {

        /* renamed from: k */
        private final int f9796k;

        /* renamed from: l */
        private final Bundle f9797l;

        /* renamed from: m */
        private final C3464b<D> f9798m;

        /* renamed from: n */
        private C0523n f9799n;

        /* renamed from: o */
        private C3459b<D> f9800o;

        /* renamed from: p */
        private C3464b<D> f9801p;

        C3458a(int i, Bundle bundle, C3464b<D> bVar, C3464b<D> bVar2) {
            this.f9796k = i;
            this.f9797l = bundle;
            this.f9798m = bVar;
            this.f9801p = bVar2;
            bVar.mo11054a(i, this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3464b<D> mo11020a(C0523n nVar, C3456a<D> aVar) {
            C3459b<D> bVar = new C3459b<>(this.f9798m, aVar);
            mo2976a(nVar, bVar);
            C3459b<D> bVar2 = this.f9800o;
            if (bVar2 != null) {
                mo2980b((C0533u<? super D>) bVar2);
            }
            this.f9799n = nVar;
            this.f9800o = bVar;
            return this.f9798m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3464b<D> mo11021a(boolean z) {
            if (C3457b.f9793c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Destroying: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f9798m.mo11057b();
            this.f9798m.mo11053a();
            C3459b<D> bVar = this.f9800o;
            if (bVar != null) {
                mo2980b((C0533u<? super D>) bVar);
                if (z) {
                    bVar.mo11029b();
                }
            }
            this.f9798m.mo11055a((C3466b<D>) this);
            if ((bVar == null || bVar.mo11028a()) && !z) {
                return this.f9798m;
            }
            this.f9798m.mo11066n();
            return this.f9801p;
        }

        /* renamed from: a */
        public void mo11022a(C3464b<D> bVar, D d) {
            String str = "LoaderManager";
            if (C3457b.f9793c) {
                StringBuilder sb = new StringBuilder();
                sb.append("onLoadComplete: ");
                sb.append(this);
                Log.v(str, sb.toString());
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                mo2981b(d);
                return;
            }
            if (C3457b.f9793c) {
                Log.w(str, "onLoadComplete was incorrectly called on a background thread");
            }
            mo2978a(d);
        }

        /* renamed from: a */
        public void mo11023a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f9796k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f9797l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f9798m);
            C3464b<D> bVar = this.f9798m;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            String str2 = "  ";
            sb.append(str2);
            bVar.mo11039a(sb.toString(), fileDescriptor, printWriter, strArr);
            if (this.f9800o != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f9800o);
                C3459b<D> bVar2 = this.f9800o;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(str2);
                bVar2.mo11027a(sb2.toString(), printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(mo11024f().mo11052a(mo2974a()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(mo2982c());
        }

        /* renamed from: b */
        public void mo2980b(C0533u<? super D> uVar) {
            super.mo2980b(uVar);
            this.f9799n = null;
            this.f9800o = null;
        }

        /* renamed from: b */
        public void mo2981b(D d) {
            super.mo2981b(d);
            C3464b<D> bVar = this.f9801p;
            if (bVar != null) {
                bVar.mo11066n();
                this.f9801p = null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo2983d() {
            if (C3457b.f9793c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Starting: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f9798m.mo11068p();
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public void mo2984e() {
            if (C3457b.f9793c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  Stopping: ");
                sb.append(this);
                Log.v("LoaderManager", sb.toString());
            }
            this.f9798m.mo11069q();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C3464b<D> mo11024f() {
            return this.f9798m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public void mo11025g() {
            C0523n nVar = this.f9799n;
            C3459b<D> bVar = this.f9800o;
            if (nVar != null && bVar != null) {
                super.mo2980b((C0533u<? super T>) bVar);
                mo2976a(nVar, bVar);
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f9796k);
            sb.append(" : ");
            C3314a.m13529a(this.f9798m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: f.p.a.b$b */
    static class C3459b<D> implements C0533u<D> {

        /* renamed from: a */
        private final C3464b<D> f9802a;

        /* renamed from: b */
        private final C3456a<D> f9803b;

        /* renamed from: c */
        private boolean f9804c = false;

        C3459b(C3464b<D> bVar, C3456a<D> aVar) {
            this.f9802a = bVar;
            this.f9803b = aVar;
        }

        /* renamed from: a */
        public void mo3048a(D d) {
            if (C3457b.f9793c) {
                StringBuilder sb = new StringBuilder();
                sb.append("  onLoadFinished in ");
                sb.append(this.f9802a);
                sb.append(": ");
                sb.append(this.f9802a.mo11052a(d));
                Log.v("LoaderManager", sb.toString());
            }
            this.f9803b.mo6534a(this.f9802a, d);
            this.f9804c = true;
        }

        /* renamed from: a */
        public void mo11027a(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f9804c);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo11028a() {
            return this.f9804c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo11029b() {
            if (this.f9804c) {
                if (C3457b.f9793c) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("  Resetting: ");
                    sb.append(this.f9802a);
                    Log.v("LoaderManager", sb.toString());
                }
                this.f9803b.mo6533a(this.f9802a);
            }
        }

        public String toString() {
            return this.f9803b.toString();
        }
    }

    /* renamed from: f.p.a.b$c */
    static class C3460c extends C0498a0 {

        /* renamed from: d */
        private static final C0504a f9805d = new C3461a();

        /* renamed from: b */
        private C3176h<C3458a> f9806b = new C3176h<>();

        /* renamed from: c */
        private boolean f9807c = false;

        /* renamed from: f.p.a.b$c$a */
        static class C3461a implements C0504a {
            C3461a() {
            }

            /* renamed from: a */
            public <T extends C0498a0> T mo2866a(Class<T> cls) {
                return new C3460c();
            }
        }

        C3460c() {
        }

        /* renamed from: a */
        static C3460c m14188a(C0508c0 c0Var) {
            return (C3460c) new C0503b0(c0Var, f9805d).mo3012a(C3460c.class);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public <D> C3458a<D> mo11031a(int i) {
            return (C3458a) this.f9806b.mo10287a(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo11032a(int i, C3458a aVar) {
            this.f9806b.mo10294c(i, aVar);
        }

        /* renamed from: a */
        public void mo11033a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f9806b.mo10292c() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("    ");
                String sb2 = sb.toString();
                for (int i = 0; i < this.f9806b.mo10292c(); i++) {
                    C3458a aVar = (C3458a) this.f9806b.mo10297e(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f9806b.mo10293c(i));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo11023a(sb2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo2855b() {
            super.mo2855b();
            int c = this.f9806b.mo10292c();
            for (int i = 0; i < c; i++) {
                ((C3458a) this.f9806b.mo10297e(i)).mo11021a(true);
            }
            this.f9806b.mo10291b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo11034c() {
            this.f9807c = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo11035d() {
            return this.f9807c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo11036e() {
            int c = this.f9806b.mo10292c();
            for (int i = 0; i < c; i++) {
                ((C3458a) this.f9806b.mo10297e(i)).mo11025g();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public void mo11037f() {
            this.f9807c = true;
        }
    }

    C3457b(C0523n nVar, C0508c0 c0Var) {
        this.f9794a = nVar;
        this.f9795b = C3460c.m14188a(c0Var);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private <D> C3464b<D> m14170a(int i, Bundle bundle, C3456a<D> aVar, C3464b<D> bVar) {
        try {
            this.f9795b.mo11037f();
            C3464b a = aVar.mo6532a(i, bundle);
            if (a != null) {
                if (a.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a.getClass().getModifiers())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                        sb.append(a);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                C3458a aVar2 = new C3458a(i, bundle, a, bVar);
                if (f9793c) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  Created new loader ");
                    sb2.append(aVar2);
                    Log.v("LoaderManager", sb2.toString());
                }
                this.f9795b.mo11032a(i, aVar2);
                this.f9795b.mo11034c();
                return aVar2.mo11020a(this.f9794a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.f9795b.mo11034c();
            throw th;
        }
    }

    /* renamed from: a */
    public <D> C3464b<D> mo11016a(int i, Bundle bundle, C3456a<D> aVar) {
        if (this.f9795b.mo11035d()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            C3458a a = this.f9795b.mo11031a(i);
            String str = "LoaderManager";
            if (f9793c) {
                StringBuilder sb = new StringBuilder();
                sb.append("initLoader in ");
                sb.append(this);
                sb.append(": args=");
                sb.append(bundle);
                Log.v(str, sb.toString());
            }
            if (a == null) {
                return m14170a(i, bundle, aVar, null);
            }
            if (f9793c) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("  Re-using existing loader ");
                sb2.append(a);
                Log.v(str, sb2.toString());
            }
            return a.mo11020a(this.f9794a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    /* renamed from: a */
    public void mo11017a() {
        this.f9795b.mo11036e();
    }

    @Deprecated
    /* renamed from: a */
    public void mo11018a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f9795b.mo11033a(str, fileDescriptor, printWriter, strArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C3314a.m13529a(this.f9794a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
