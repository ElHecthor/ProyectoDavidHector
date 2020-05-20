package p255io.stashteam.stashapp.p281f.p292d;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import io.stashteam.games.tracker.stashapp.R;
import java.util.List;
import p255io.stashteam.stashapp.p269e.p280c.C5305k;
import p255io.stashteam.stashapp.p281f.p288b.p289c.C5370a;
import p255io.stashteam.stashapp.p281f.p290c.p291a.C5398b;
import p255io.stashteam.stashapp.p281f.p290c.p291a.C5398b.C5401c;
import p308k.p323z.p325d.C5942k;

/* renamed from: io.stashteam.stashapp.f.d.c */
public final class C5426c extends FragmentStateAdapter {

    /* renamed from: k */
    private final List<Integer> f14195k = C5837l.m22162b((Object[]) new Integer[]{Integer.valueOf(R.string.common_want), Integer.valueOf(R.string.common_playing), Integer.valueOf(R.string.common_played), Integer.valueOf(R.string.lists_profile_title)});

    /* renamed from: l */
    private final Long f14196l;

    /* JADX INFO: used method not loaded: k.u.l.b(java.lang.Object[]):null, types can be incorrect */
    public C5426c(Fragment fragment, Long l) {
        C5942k.m22327b(fragment, "fragment");
        super(fragment);
        this.f14196l = l;
    }

    /* renamed from: b */
    public int mo3472b() {
        return this.f14196l == null ? this.f14195k.size() : this.f14195k.size() - 1;
    }

    /* renamed from: c */
    public Fragment mo4329c(int i) {
        C5401c cVar;
        C5305k kVar;
        if (i == 0) {
            cVar = C5398b.f14149k0;
            kVar = C5305k.WANT_LIST;
        } else if (i == 1) {
            cVar = C5398b.f14149k0;
            kVar = C5305k.PLAYING_LIST;
        } else if (i == 2) {
            cVar = C5398b.f14149k0;
            kVar = C5305k.PLAYED_LIST;
        } else if (i == 3) {
            return C5370a.f14075g0.mo15065a();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected position ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return cVar.mo15086a(kVar, this.f14196l);
    }

    /* renamed from: d */
    public final int mo15098d(int i) {
        if (i >= 0 && i <= C5837l.m22155a((List) this.f14195k)) {
            return ((Number) this.f14195k.get(i)).intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected position ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
