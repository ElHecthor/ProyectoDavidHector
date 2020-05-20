package p071f.p133t.p134a;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: f.t.a.c */
public interface C3538c {

    /* renamed from: f.t.a.c$a */
    public static abstract class C3539a {

        /* renamed from: a */
        public final int f10010a;

        public C3539a(int i) {
            this.f10010a = i;
        }

        /* renamed from: a */
        private void m14486a(String str) {
            if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("deleting the database file: ");
                sb.append(str);
                String str2 = "SupportSQLite";
                Log.w(str2, sb.toString());
                try {
                    if (VERSION.SDK_INT >= 16) {
                        SQLiteDatabase.deleteDatabase(new File(str));
                        return;
                    }
                    try {
                        if (!new File(str).delete()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Could not delete the database file ");
                            sb2.append(str);
                            Log.e(str2, sb2.toString());
                        }
                    } catch (Exception e) {
                        Log.e(str2, "error while deleting corrupted database file", e);
                    }
                } catch (Exception e2) {
                    Log.w(str2, "delete failed: ", e2);
                }
            }
        }

        /* renamed from: a */
        public void mo4093a(C3537b bVar) {
        }

        /* renamed from: a */
        public abstract void mo4094a(C3537b bVar, int i, int i2);

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
            if (r0 != null) goto L_0x0036;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
            r3 = r0.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
            if (r3.hasNext() != false) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
            m14486a((java.lang.String) ((android.util.Pair) r3.next()).second);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
            m14486a(r3.getPath());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
            throw r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v3 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
          PHI: (r0v10 java.util.List) = (r0v3 java.util.List), (r0v4 java.util.List), (r0v4 java.util.List) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo11233b(p071f.p133t.p134a.C3537b r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Corruption reported by sqlite on database: "
                r0.append(r1)
                java.lang.String r1 = r3.getPath()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "SupportSQLite"
                android.util.Log.e(r1, r0)
                boolean r0 = r3.isOpen()
                if (r0 != 0) goto L_0x0028
                java.lang.String r3 = r3.getPath()
                r2.m14486a(r3)
                return
            L_0x0028:
                r0 = 0
                java.util.List r0 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
                goto L_0x0030
            L_0x002e:
                r1 = move-exception
                goto L_0x0034
            L_0x0030:
                r3.close()     // Catch:{ IOException -> 0x0056, all -> 0x002e }
                goto L_0x0057
            L_0x0034:
                if (r0 == 0) goto L_0x004e
                java.util.Iterator r3 = r0.iterator()
            L_0x003a:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0055
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m14486a(r0)
                goto L_0x003a
            L_0x004e:
                java.lang.String r3 = r3.getPath()
                r2.m14486a(r3)
            L_0x0055:
                throw r1
            L_0x0056:
            L_0x0057:
                if (r0 == 0) goto L_0x0071
                java.util.Iterator r3 = r0.iterator()
            L_0x005d:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L_0x0078
                java.lang.Object r0 = r3.next()
                android.util.Pair r0 = (android.util.Pair) r0
                java.lang.Object r0 = r0.second
                java.lang.String r0 = (java.lang.String) r0
                r2.m14486a(r0)
                goto L_0x005d
            L_0x0071:
                java.lang.String r3 = r3.getPath()
                r2.m14486a(r3)
            L_0x0078:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p133t.p134a.C3538c.C3539a.mo11233b(f.t.a.b):void");
        }

        /* renamed from: b */
        public abstract void mo4095b(C3537b bVar, int i, int i2);

        /* renamed from: c */
        public abstract void mo4096c(C3537b bVar);

        /* renamed from: d */
        public void mo4097d(C3537b bVar) {
        }
    }

    /* renamed from: f.t.a.c$b */
    public static class C3540b {

        /* renamed from: a */
        public final Context f10011a;

        /* renamed from: b */
        public final String f10012b;

        /* renamed from: c */
        public final C3539a f10013c;

        /* renamed from: f.t.a.c$b$a */
        public static class C3541a {

            /* renamed from: a */
            Context f10014a;

            /* renamed from: b */
            String f10015b;

            /* renamed from: c */
            C3539a f10016c;

            C3541a(Context context) {
                this.f10014a = context;
            }

            /* renamed from: a */
            public C3541a mo11234a(C3539a aVar) {
                this.f10016c = aVar;
                return this;
            }

            /* renamed from: a */
            public C3541a mo11235a(String str) {
                this.f10015b = str;
                return this;
            }

            /* renamed from: a */
            public C3540b mo11236a() {
                C3539a aVar = this.f10016c;
                if (aVar != null) {
                    Context context = this.f10014a;
                    if (context != null) {
                        return new C3540b(context, this.f10015b, aVar);
                    }
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                throw new IllegalArgumentException("Must set a callback to create the configuration.");
            }
        }

        C3540b(Context context, String str, C3539a aVar) {
            this.f10011a = context;
            this.f10012b = str;
            this.f10013c = aVar;
        }

        /* renamed from: a */
        public static C3541a m14493a(Context context) {
            return new C3541a(context);
        }
    }

    /* renamed from: f.t.a.c$c */
    public interface C3542c {
        /* renamed from: a */
        C3538c mo4125a(C3540b bVar);
    }

    /* renamed from: a */
    C3537b mo4121a();

    /* renamed from: a */
    void mo4123a(boolean z);

    /* renamed from: b */
    String mo4124b();
}
