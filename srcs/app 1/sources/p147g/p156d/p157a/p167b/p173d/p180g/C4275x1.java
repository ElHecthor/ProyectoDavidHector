package p147g.p156d.p157a.p167b.p173d.p180g;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: g.d.a.b.d.g.x1 */
public final class C4275x1 {

    /* renamed from: a */
    private final Map<String, Map<String, String>> f11428a;

    C4275x1(Map<String, Map<String, String>> map) {
        this.f11428a = map;
    }

    @Nullable
    /* renamed from: a */
    public final String mo12906a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            str = uri.toString();
        } else if (str == null) {
            return null;
        }
        Map map = (Map) this.f11428a.get(str);
        if (map == null) {
            return null;
        }
        if (str2 != null) {
            String valueOf = String.valueOf(str2);
            String valueOf2 = String.valueOf(str3);
            str3 = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        }
        return (String) map.get(str3);
    }
}
