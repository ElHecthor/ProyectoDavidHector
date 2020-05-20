package p255io.stashteam.stashapp.data.local.p264db;

import android.content.Context;
import androidx.room.C0710k;
import androidx.room.C0711l;
import androidx.room.C0711l.C0712a;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5121b;
import p255io.stashteam.stashapp.data.local.p264db.p266b.C5135d;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.data.local.db.InMemoryDatabase */
public abstract class InMemoryDatabase extends C0711l {

    /* renamed from: l */
    public static final C5112a f13330l = new C5112a(null);

    /* renamed from: io.stashteam.stashapp.data.local.db.InMemoryDatabase$a */
    public static final class C5112a {
        private C5112a() {
        }

        public /* synthetic */ C5112a(C5938g gVar) {
            this();
        }

        /* renamed from: a */
        public final InMemoryDatabase mo14283a(Context context) {
            C5942k.m22327b(context, "context");
            C0712a a = C0710k.m3950a(context.getApplicationContext(), InMemoryDatabase.class);
            a.mo4083b();
            C0711l a2 = a.mo4082a();
            C5942k.m22324a((Object) a2, "Room.inMemoryDatabaseBui…                 .build()");
            return (InMemoryDatabase) a2;
        }
    }

    /* renamed from: p */
    public abstract C5121b mo14281p();

    /* renamed from: q */
    public abstract C5135d mo14282q();
}
