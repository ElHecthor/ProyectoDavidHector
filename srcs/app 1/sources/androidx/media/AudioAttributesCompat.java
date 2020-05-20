package androidx.media;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import androidx.versionedparcelable.C0778c;

public class AudioAttributesCompat implements C0778c {

    /* renamed from: b */
    private static final SparseIntArray f2266b;

    /* renamed from: a */
    C0548a f2267a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2266b = sparseIntArray;
        sparseIntArray.put(5, 1);
        f2266b.put(6, 2);
        f2266b.put(7, 2);
        f2266b.put(8, 1);
        f2266b.put(9, 1);
        f2266b.put(10, 1);
    }

    AudioAttributesCompat() {
    }

    /* renamed from: a */
    static int m2802a(boolean z, int i, int i2) {
        int i3 = 1;
        if ((i & 1) == 1) {
            if (!z) {
                i3 = 7;
            }
            return i3;
        }
        int i4 = 0;
        if ((i & 4) == 4) {
            if (!z) {
                i4 = 6;
            }
            return i4;
        }
        int i5 = 3;
        switch (i2) {
            case 0:
                if (z) {
                    i5 = RecyclerView.UNDEFINED_DURATION;
                }
                return i5;
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                break;
            case 3:
                if (!z) {
                    i4 = 8;
                    break;
                }
                break;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            default:
                if (!z) {
                    return 3;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown usage value ");
                sb.append(i2);
                sb.append(" in audio attributes");
                throw new IllegalArgumentException(sb.toString());
        }
        return i4;
    }

    /* renamed from: a */
    static String m2803a(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 16:
                return "USAGE_ASSISTANT";
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("unknown usage ");
                sb.append(i);
                return sb.toString();
        }
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        C0548a aVar = this.f2267a;
        C0548a aVar2 = audioAttributesCompat.f2267a;
        if (aVar != null) {
            return aVar.equals(aVar2);
        }
        if (aVar2 == null) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return this.f2267a.hashCode();
    }

    public String toString() {
        return this.f2267a.toString();
    }
}
