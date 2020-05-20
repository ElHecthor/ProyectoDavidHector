package p147g.p148a.p149a;

import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: g.a.a.l */
public class C3698l {

    /* renamed from: c */
    private static final String f10479c = "g.a.a.l";

    /* renamed from: a */
    protected JSONObject f10480a = new JSONObject();

    /* renamed from: b */
    protected Set<String> f10481b = new HashSet();

    /* renamed from: a */
    private void m15115a(String str, String str2, Object obj) {
        if (C3700n.m15138a(str2)) {
            C3690f.m15021a().mo11715d(f10479c, String.format("Attempting to perform operation %s with a null or empty string property, ignoring", new Object[]{str}));
        } else if (obj == null) {
            C3690f.m15021a().mo11715d(f10479c, String.format("Attempting to perform operation %s with null value for property %s, ignoring", new Object[]{str, str2}));
        } else if (this.f10480a.has("$clearAll")) {
            C3690f.m15021a().mo11715d(f10479c, String.format("This Identify already contains a $clearAll operation, ignoring operation %s", new Object[]{str}));
        } else if (this.f10481b.contains(str2)) {
            C3690f.m15021a().mo11715d(f10479c, String.format("Already used property %s in previous operation, ignoring operation %s", new Object[]{str2, str}));
        } else {
            try {
                if (!this.f10480a.has(str)) {
                    this.f10480a.put(str, new JSONObject());
                }
                this.f10480a.getJSONObject(str).put(str2, obj);
                this.f10481b.add(str2);
            } catch (JSONException e) {
                C3690f.m15021a().mo11713b(f10479c, e.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C3698l mo11760a(String str, Object obj) {
        m15115a("$set", str, obj);
        return this;
    }
}
