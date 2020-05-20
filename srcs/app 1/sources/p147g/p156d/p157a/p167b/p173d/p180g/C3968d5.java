package p147g.p156d.p157a.p167b.p173d.p180g;

import java.io.IOException;

/* renamed from: g.d.a.b.d.g.d5 */
public class C3968d5 extends IOException {
    public C3968d5(String str) {
        super(str);
    }

    /* renamed from: a */
    static C3968d5 m16205a() {
        return new C3968d5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: b */
    static C3968d5 m16206b() {
        return new C3968d5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: c */
    static C3968d5 m16207c() {
        return new C3968d5("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: d */
    static C3948c5 m16208d() {
        return new C3948c5("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    static C3968d5 m16209e() {
        return new C3968d5("Failed to parse the message.");
    }

    /* renamed from: f */
    static C3968d5 m16210f() {
        return new C3968d5("Protocol message had invalid UTF-8.");
    }
}
