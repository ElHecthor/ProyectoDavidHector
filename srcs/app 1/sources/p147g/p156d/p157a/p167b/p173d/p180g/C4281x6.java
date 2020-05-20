package p147g.p156d.p157a.p167b.p173d.p180g;

import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: g.d.a.b.d.g.x6 */
final class C4281x6 extends C4296y6<FieldDescriptorType, Object> {
    C4281x6(int i) {
        super(i, null);
    }

    /* renamed from: a */
    public final void mo12907a() {
        if (!mo12951b()) {
            for (int i = 0; i < mo12952c(); i++) {
                Entry a = mo12950a(i);
                if (((C4137o4) a.getKey()).mo12687d()) {
                    a.setValue(Collections.unmodifiableList((List) a.getValue()));
                }
            }
            for (Entry entry : mo12955d()) {
                if (((C4137o4) entry.getKey()).mo12687d()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo12907a();
    }
}
