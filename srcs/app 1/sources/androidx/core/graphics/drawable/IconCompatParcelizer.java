package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.C0776a;

public class IconCompatParcelizer {
    public static IconCompat read(C0776a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1723a = aVar.mo4286a(iconCompat.f1723a, 1);
        iconCompat.f1725c = aVar.mo4303a(iconCompat.f1725c, 2);
        iconCompat.f1726d = aVar.mo4287a(iconCompat.f1726d, 3);
        iconCompat.f1727e = aVar.mo4286a(iconCompat.f1727e, 4);
        iconCompat.f1728f = aVar.mo4286a(iconCompat.f1728f, 5);
        iconCompat.f1729g = (ColorStateList) aVar.mo4287a(iconCompat.f1729g, 6);
        iconCompat.f1731i = aVar.mo4291a(iconCompat.f1731i, 7);
        iconCompat.mo2238d();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, C0776a aVar) {
        aVar.mo4299a(true, true);
        iconCompat.mo2235a(aVar.mo4314c());
        int i = iconCompat.f1723a;
        if (-1 != i) {
            aVar.mo4306b(i, 1);
        }
        byte[] bArr = iconCompat.f1725c;
        if (bArr != null) {
            aVar.mo4312b(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1726d;
        if (parcelable != null) {
            aVar.mo4307b(parcelable, 3);
        }
        int i2 = iconCompat.f1727e;
        if (i2 != 0) {
            aVar.mo4306b(i2, 4);
        }
        int i3 = iconCompat.f1728f;
        if (i3 != 0) {
            aVar.mo4306b(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f1729g;
        if (colorStateList != null) {
            aVar.mo4307b((Parcelable) colorStateList, 6);
        }
        String str = iconCompat.f1731i;
        if (str != null) {
            aVar.mo4310b(str, 7);
        }
    }
}
