package com.facebook.p034f0.p035q;

import android.content.res.Resources.NotFoundException;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.facebook.p034f0.p036r.p037g.C1601f;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.f0.q.b */
final class C1567b {
    /* renamed from: a */
    static List<String> m6954a(View view) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(C1601f.m7060h(view));
        Object tag = view.getTag();
        if (tag != null) {
            arrayList.add(tag.toString());
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null) {
            arrayList.add(contentDescription.toString());
        }
        try {
            if (view.getId() != -1) {
                String[] split = view.getResources().getResourceName(view.getId()).split("/");
                if (split.length == 2) {
                    arrayList.add(split[1]);
                }
            }
        } catch (NotFoundException unused) {
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str : arrayList) {
            if (!str.isEmpty() && str.length() <= 100) {
                arrayList2.add(str.toLowerCase());
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    static boolean m6955a(String str, String str2) {
        return str.matches(str2);
    }

    /* renamed from: a */
    static boolean m6956a(String str, List<String> list) {
        for (String contains : list) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    static boolean m6957a(List<String> list, List<String> list2) {
        for (String a : list) {
            if (m6956a(a, list2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    static List<String> m6958b(View view) {
        ArrayList arrayList = new ArrayList();
        if (view instanceof EditText) {
            return arrayList;
        }
        if (view instanceof TextView) {
            String charSequence = ((TextView) view).getText().toString();
            if (!charSequence.isEmpty() && charSequence.length() < 100) {
                arrayList.add(charSequence.toLowerCase());
            }
            return arrayList;
        }
        for (View b : C1601f.m7054b(view)) {
            arrayList.addAll(m6958b(b));
        }
        return arrayList;
    }
}
