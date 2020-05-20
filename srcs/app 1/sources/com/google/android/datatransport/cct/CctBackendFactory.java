package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.C1903d;
import com.google.android.datatransport.runtime.backends.C1909h;
import com.google.android.datatransport.runtime.backends.C1915m;

@Keep
public class CctBackendFactory implements C1903d {
    public C1915m create(C1909h hVar) {
        return new C1894e(hVar.mo6418a(), hVar.mo6421d(), hVar.mo6420c());
    }
}
