package p071f.p115k.p117c;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p071f.p088e.C3164b;
import p071f.p097h.p107l.C3321h;

/* renamed from: f.k.c.a */
public class C3419a {

    /* renamed from: m */
    private static final Object f9667m = new Object();

    /* renamed from: n */
    private static volatile C3419a f9668n;

    /* renamed from: a */
    private final ReadWriteLock f9669a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private final Set<C3424d> f9670b;

    /* renamed from: c */
    private int f9671c = 3;

    /* renamed from: d */
    private final Handler f9672d;

    /* renamed from: e */
    private final C3422b f9673e;

    /* renamed from: f */
    final C3426f f9674f;

    /* renamed from: g */
    final boolean f9675g;

    /* renamed from: h */
    final boolean f9676h;

    /* renamed from: i */
    final int[] f9677i;

    /* renamed from: j */
    private final boolean f9678j;

    /* renamed from: k */
    private final int f9679k;

    /* renamed from: l */
    private final int f9680l;

    /* renamed from: f.k.c.a$a */
    private static final class C3420a extends C3422b {

        /* renamed from: b */
        private volatile C3430c f9681b;

        /* renamed from: c */
        private volatile C3439f f9682c;

        /* renamed from: f.k.c.a$a$a */
        class C3421a extends C3427g {
            C3421a() {
            }

            /* renamed from: a */
            public void mo10941a(C3439f fVar) {
                C3420a.this.mo10940a(fVar);
            }

            /* renamed from: a */
            public void mo10942a(Throwable th) {
                C3420a.this.f9684a.mo10933a(th);
            }
        }

        C3420a(C3419a aVar) {
            super(aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo10937a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return this.f9681b.mo10957a(charSequence, i, i2, i3, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10938a() {
            try {
                this.f9684a.f9674f.mo10924a(new C3421a());
            } catch (Throwable th) {
                this.f9684a.mo10933a(th);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10939a(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f9682c.mo10976c());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f9684a.f9675g);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10940a(C3439f fVar) {
            if (fVar == null) {
                this.f9684a.mo10933a((Throwable) new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f9682c = fVar;
            C3439f fVar2 = this.f9682c;
            C3428h hVar = new C3428h();
            C3419a aVar = this.f9684a;
            this.f9681b = new C3430c(fVar2, hVar, aVar.f9676h, aVar.f9677i);
            this.f9684a.mo10936d();
        }
    }

    /* renamed from: f.k.c.a$b */
    private static class C3422b {

        /* renamed from: a */
        final C3419a f9684a;

        C3422b(C3419a aVar) {
            this.f9684a = aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public CharSequence mo10937a(CharSequence charSequence, int i, int i2, int i3, boolean z) {
            return charSequence;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10938a() {
            this.f9684a.mo10936d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo10939a(EditorInfo editorInfo) {
        }
    }

    /* renamed from: f.k.c.a$c */
    public static abstract class C3423c {

        /* renamed from: a */
        final C3426f f9685a;

        /* renamed from: b */
        boolean f9686b;

        /* renamed from: c */
        boolean f9687c;

        /* renamed from: d */
        int[] f9688d;

        /* renamed from: e */
        Set<C3424d> f9689e;

        /* renamed from: f */
        boolean f9690f;

        /* renamed from: g */
        int f9691g = -16711936;

        /* renamed from: h */
        int f9692h = 0;

        protected C3423c(C3426f fVar) {
            C3321h.m13544a(fVar, (Object) "metadataLoader cannot be null.");
            this.f9685a = fVar;
        }
    }

    /* renamed from: f.k.c.a$d */
    public static abstract class C3424d {
        /* renamed from: a */
        public void mo2414a() {
        }

        /* renamed from: a */
        public void mo10943a(Throwable th) {
        }
    }

    /* renamed from: f.k.c.a$e */
    private static class C3425e implements Runnable {

        /* renamed from: f */
        private final List<C3424d> f9693f;

        /* renamed from: g */
        private final Throwable f9694g;

        /* renamed from: h */
        private final int f9695h;

        C3425e(C3424d dVar, int i) {
            C3321h.m13544a(dVar, (Object) "initCallback cannot be null");
            this(Arrays.asList(new C3424d[]{dVar}), i, null);
        }

        C3425e(Collection<C3424d> collection, int i) {
            this(collection, i, null);
        }

        C3425e(Collection<C3424d> collection, int i, Throwable th) {
            C3321h.m13544a(collection, (Object) "initCallbacks cannot be null");
            this.f9693f = new ArrayList(collection);
            this.f9695h = i;
            this.f9694g = th;
        }

        public void run() {
            int size = this.f9693f.size();
            int i = 0;
            if (this.f9695h != 1) {
                while (i < size) {
                    ((C3424d) this.f9693f.get(i)).mo10943a(this.f9694g);
                    i++;
                }
                return;
            }
            while (i < size) {
                ((C3424d) this.f9693f.get(i)).mo2414a();
                i++;
            }
        }
    }

    /* renamed from: f.k.c.a$f */
    public interface C3426f {
        /* renamed from: a */
        void mo10924a(C3427g gVar);
    }

    /* renamed from: f.k.c.a$g */
    public static abstract class C3427g {
        /* renamed from: a */
        public abstract void mo10941a(C3439f fVar);

        /* renamed from: a */
        public abstract void mo10942a(Throwable th);
    }

    /* renamed from: f.k.c.a$h */
    static class C3428h {
        C3428h() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C3434d mo10945a(C3429b bVar) {
            return new C3441g(bVar);
        }
    }

    private C3419a(C3423c cVar) {
        this.f9675g = cVar.f9686b;
        this.f9676h = cVar.f9687c;
        this.f9677i = cVar.f9688d;
        this.f9678j = cVar.f9690f;
        this.f9679k = cVar.f9691g;
        this.f9674f = cVar.f9685a;
        this.f9680l = cVar.f9692h;
        this.f9672d = new Handler(Looper.getMainLooper());
        this.f9670b = new C3164b();
        Set<C3424d> set = cVar.f9689e;
        if (set != null && !set.isEmpty()) {
            this.f9670b.addAll(cVar.f9689e);
        }
        this.f9673e = VERSION.SDK_INT < 19 ? new C3422b(this) : new C3420a(this);
        m14027g();
    }

    /* renamed from: a */
    public static C3419a m14022a(C3423c cVar) {
        if (f9668n == null) {
            synchronized (f9667m) {
                if (f9668n == null) {
                    f9668n = new C3419a(cVar);
                }
            }
        }
        return f9668n;
    }

    /* renamed from: a */
    public static boolean m14023a(Editable editable, int i, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 19) {
            return C3430c.m14067a(editable, i, keyEvent);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m14024a(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            return C3430c.m14070a(inputConnection, editable, i, i2, z);
        }
        return false;
    }

    /* renamed from: e */
    public static C3419a m14025e() {
        C3419a aVar;
        synchronized (f9667m) {
            C3321h.m13547a(f9668n != null, "EmojiCompat is not initialized. Please call EmojiCompat.init() first");
            aVar = f9668n;
        }
        return aVar;
    }

    /* renamed from: f */
    private boolean m14026f() {
        return mo10934b() == 1;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private void m14027g() {
        this.f9669a.writeLock().lock();
        try {
            if (this.f9680l == 0) {
                this.f9671c = 0;
            }
            this.f9669a.writeLock().unlock();
            if (mo10934b() == 0) {
                this.f9673e.mo10938a();
            }
        } catch (Throwable th) {
            this.f9669a.writeLock().unlock();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo10926a() {
        return this.f9679k;
    }

    /* renamed from: a */
    public CharSequence mo10927a(CharSequence charSequence) {
        return mo10928a(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    /* renamed from: a */
    public CharSequence mo10928a(CharSequence charSequence, int i, int i2) {
        return mo10929a(charSequence, i, i2, Integer.MAX_VALUE);
    }

    /* renamed from: a */
    public CharSequence mo10929a(CharSequence charSequence, int i, int i2, int i3) {
        return mo10930a(charSequence, i, i2, i3, 0);
    }

    /* renamed from: a */
    public CharSequence mo10930a(CharSequence charSequence, int i, int i2, int i3, int i4) {
        C3321h.m13547a(m14026f(), "Not initialized yet");
        C3321h.m13542a(i, "start cannot be negative");
        C3321h.m13542a(i2, "end cannot be negative");
        C3321h.m13542a(i3, "maxEmojiCount cannot be negative");
        C3321h.m13546a(i <= i2, (Object) "start should be <= than end");
        if (charSequence == null) {
            return charSequence;
        }
        C3321h.m13546a(i <= charSequence.length(), (Object) "start should be < than charSequence length");
        C3321h.m13546a(i2 <= charSequence.length(), (Object) "end should be < than charSequence length");
        if (!(charSequence.length() == 0 || i == i2)) {
            boolean z = i4 != 1 ? i4 != 2 ? this.f9675g : false : true;
            charSequence = this.f9673e.mo10937a(charSequence, i, i2, i3, z);
        }
        return charSequence;
    }

    /* renamed from: a */
    public void mo10931a(EditorInfo editorInfo) {
        if (m14026f() && editorInfo != null && editorInfo.extras != null) {
            this.f9673e.mo10939a(editorInfo);
        }
    }

    /* renamed from: a */
    public void mo10932a(C3424d dVar) {
        C3321h.m13544a(dVar, (Object) "initCallback cannot be null");
        this.f9669a.writeLock().lock();
        try {
            if (this.f9671c != 1) {
                if (this.f9671c != 2) {
                    this.f9670b.add(dVar);
                }
            }
            this.f9672d.post(new C3425e(dVar, this.f9671c));
        } finally {
            this.f9669a.writeLock().unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10933a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9669a.writeLock().lock();
        try {
            this.f9671c = 2;
            arrayList.addAll(this.f9670b);
            this.f9670b.clear();
            this.f9669a.writeLock().unlock();
            this.f9672d.post(new C3425e(arrayList, this.f9671c, th));
        } catch (Throwable th2) {
            this.f9669a.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: b */
    public int mo10934b() {
        this.f9669a.readLock().lock();
        try {
            return this.f9671c;
        } finally {
            this.f9669a.readLock().unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo10935c() {
        return this.f9678j;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo10936d() {
        ArrayList arrayList = new ArrayList();
        this.f9669a.writeLock().lock();
        try {
            this.f9671c = 1;
            arrayList.addAll(this.f9670b);
            this.f9670b.clear();
            this.f9669a.writeLock().unlock();
            this.f9672d.post(new C3425e((Collection<C3424d>) arrayList, this.f9671c));
        } catch (Throwable th) {
            this.f9669a.writeLock().unlock();
            throw th;
        }
    }
}
