package com.crashlytics.android.p033e;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.crashlytics.android.e.y0 */
final class C1493y0 {

    /* renamed from: a */
    private static final FilenameFilter f4671a = new C1494a();

    /* renamed from: com.crashlytics.android.e.y0$a */
    static class C1494a implements FilenameFilter {
        C1494a() {
        }

        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* renamed from: a */
    static int m6738a(File file, int i, Comparator<File> comparator) {
        return m6739a(file, f4671a, i, comparator);
    }

    /* renamed from: a */
    static int m6739a(File file, FilenameFilter filenameFilter, int i, Comparator<File> comparator) {
        File[] listFiles = file.listFiles(filenameFilter);
        if (listFiles == null) {
            return 0;
        }
        int length = listFiles.length;
        Arrays.sort(listFiles, comparator);
        for (File file2 : listFiles) {
            if (length <= i) {
                return length;
            }
            file2.delete();
            length--;
        }
        return length;
    }
}
