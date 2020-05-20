package androidx.room;

/* renamed from: androidx.room.n */
public class C0724n {
    /* renamed from: a */
    public static String m3999a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }
}
