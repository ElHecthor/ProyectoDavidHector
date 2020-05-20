package com.bumptech.glide.load.p005n;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.n.o */
public class C0901o extends C0896l<InputStream> {

    /* renamed from: i */
    private static final UriMatcher f3429i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f3429i = uriMatcher;
        String str = "com.android.contacts";
        uriMatcher.addURI(str, "contacts/lookup/*/#", 1);
        f3429i.addURI(str, "contacts/lookup/*", 1);
        f3429i.addURI(str, "contacts/#/photo", 2);
        f3429i.addURI(str, "contacts/#", 3);
        f3429i.addURI(str, "contacts/#/display_photo", 4);
        f3429i.addURI(str, "phone_lookup/*", 5);
    }

    public C0901o(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    /* renamed from: a */
    private InputStream m4664a(ContentResolver contentResolver, Uri uri) {
        return Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    /* renamed from: b */
    private InputStream m4665b(Uri uri, ContentResolver contentResolver) {
        int match = f3429i.match(uri);
        if (match != 1) {
            if (match == 3) {
                return m4664a(contentResolver, uri);
            }
            if (match != 5) {
                return contentResolver.openInputStream(uri);
            }
        }
        Uri lookupContact = Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return m4664a(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public InputStream m4668a(Uri uri, ContentResolver contentResolver) {
        InputStream b = m4665b(uri, contentResolver);
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("InputStream is null for ");
        sb.append(uri);
        throw new FileNotFoundException(sb.toString());
    }

    /* renamed from: a */
    public Class<InputStream> mo4563a() {
        return InputStream.class;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4637a(InputStream inputStream) {
        inputStream.close();
    }
}
