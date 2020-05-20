package p071f.p139v;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: f.v.s */
public class C3624s {

    /* renamed from: a */
    public final Map<String, Object> f10177a = new HashMap();

    /* renamed from: b */
    public View f10178b;

    /* renamed from: c */
    final ArrayList<C3607m> f10179c = new ArrayList<>();

    @Deprecated
    public C3624s() {
    }

    public C3624s(View view) {
        this.f10178b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3624s) {
            C3624s sVar = (C3624s) obj;
            if (this.f10178b == sVar.f10178b && this.f10177a.equals(sVar.f10177a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f10178b.hashCode() * 31) + this.f10177a.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(":\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append("    view = ");
        sb3.append(this.f10178b);
        String str = "\n";
        sb3.append(str);
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append("    values:");
        String sb6 = sb5.toString();
        for (String str2 : this.f10177a.keySet()) {
            StringBuilder sb7 = new StringBuilder();
            sb7.append(sb6);
            sb7.append("    ");
            sb7.append(str2);
            sb7.append(": ");
            sb7.append(this.f10177a.get(str2));
            sb7.append(str);
            sb6 = sb7.toString();
        }
        return sb6;
    }
}
