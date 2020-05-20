package com.google.android.datatransport.cct.p047b;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.google.android.datatransport.cct.b.t */
public abstract class C1886t {
    /* renamed from: a */
    public static C1886t m8062a(Reader reader) {
        JsonReader jsonReader = new JsonReader(reader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new C1869i(Long.parseLong(jsonReader.nextString()));
                } else {
                    C1869i iVar = new C1869i(jsonReader.nextLong());
                    jsonReader.close();
                    return iVar;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: a */
    public abstract long mo6383a();
}
