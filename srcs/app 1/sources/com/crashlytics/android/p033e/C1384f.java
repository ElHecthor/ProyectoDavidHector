package com.crashlytics.android.p033e;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: com.crashlytics.android.e.f */
class C1384f extends FileOutputStream {

    /* renamed from: i */
    public static final FilenameFilter f4455i = new C1385a();

    /* renamed from: f */
    private final String f4456f;

    /* renamed from: g */
    private File f4457g;

    /* renamed from: h */
    private boolean f4458h = false;

    /* renamed from: com.crashlytics.android.e.f$a */
    static class C1385a implements FilenameFilter {
        C1385a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public C1384f(File file, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = ".cls_temp";
        sb.append(str2);
        super(new File(file, sb.toString()));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file);
        sb2.append(File.separator);
        sb2.append(str);
        this.f4456f = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f4456f);
        sb3.append(str2);
        this.f4457g = new File(sb3.toString());
    }

    /* renamed from: a */
    public void mo5511a() {
        if (!this.f4458h) {
            this.f4458h = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() {
        if (!this.f4458h) {
            this.f4458h = true;
            super.flush();
            super.close();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4456f);
            sb.append(".cls");
            File file = new File(sb.toString());
            if (this.f4457g.renameTo(file)) {
                this.f4457g = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f4457g.exists()) {
                str = " (source does not exist)";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Could not rename temp file: ");
            sb2.append(this.f4457g);
            sb2.append(" -> ");
            sb2.append(file);
            sb2.append(str);
            throw new IOException(sb2.toString());
        }
    }
}
