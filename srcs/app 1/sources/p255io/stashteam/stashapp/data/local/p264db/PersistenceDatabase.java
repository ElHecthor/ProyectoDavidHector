package p255io.stashteam.stashapp.data.local.p264db;

import android.content.Context;
import androidx.room.C0710k;
import androidx.room.C0711l;
import androidx.room.C0711l.C0712a;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5152f;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.local.db.PersistenceDatabase */
public abstract class PersistenceDatabase extends C0711l {

    /* renamed from: l */
    public static final C5114a f13334l = new C5114a(null);

    /* renamed from: io.stashteam.stashapp.data.local.db.PersistenceDatabase$a */
    public static final class C5114a {
        private C5114a() {
        }

        public /* synthetic */ C5114a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final PersistenceDatabase mo14284a(Context context) {
            C5942k.m22327b(context, "context");
            C0712a a = C0710k.m3951a(context.getApplicationContext(), PersistenceDatabase.class, "stash_db");
            a.mo4083b();
            C0711l a2 = a.mo4082a();
            C5942k.m22324a((Object) a2, "Room.databaseBuilder(con…                 .build()");
            return (PersistenceDatabase) a2;
        }
    }

    /* renamed from: p */
    public abstract C5152f mo14281p();
}
