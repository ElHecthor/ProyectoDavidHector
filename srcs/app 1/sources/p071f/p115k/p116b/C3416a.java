package p071f.p115k.p116b;

import android.content.Context;
import p071f.p097h.p107l.C3321h;
import p071f.p115k.p117c.C3419a.C3423c;
import p071f.p115k.p117c.C3419a.C3426f;
import p071f.p115k.p117c.C3419a.C3427g;
import p071f.p115k.p117c.C3439f;

/* renamed from: f.k.b.a */
public class C3416a extends C3423c {

    /* renamed from: f.k.b.a$a */
    private static class C3417a implements C3426f {

        /* renamed from: a */
        private final Context f9664a;

        C3417a(Context context) {
            this.f9664a = context.getApplicationContext();
        }

        /* renamed from: a */
        public void mo10924a(C3427g gVar) {
            C3321h.m13544a(gVar, (Object) "loaderCallback cannot be null");
            Thread thread = new Thread(new C3418b(this.f9664a, gVar));
            thread.setDaemon(false);
            thread.start();
        }
    }

    /* renamed from: f.k.b.a$b */
    private static class C3418b implements Runnable {

        /* renamed from: f */
        private final C3427g f9665f;

        /* renamed from: g */
        private final Context f9666g;

        C3418b(Context context, C3427g gVar) {
            this.f9666g = context;
            this.f9665f = gVar;
        }

        public void run() {
            try {
                this.f9665f.mo10941a(C3439f.m14103a(this.f9666g.getAssets(), "NotoColorEmojiCompat.ttf"));
            } catch (Throwable th) {
                this.f9665f.mo10942a(th);
            }
        }
    }

    public C3416a(Context context) {
        super(new C3417a(context));
    }
}
