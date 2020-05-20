package p071f.p118l.p119a;

import android.content.res.AssetManager.AssetInputStream;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* renamed from: f.l.a.a */
public class C3442a {

    /* renamed from: A */
    private static final C3445c f9732A = new C3445c("StripOffsets", 273, 3);

    /* renamed from: B */
    private static final C3445c[] f9733B = {new C3445c("ThumbnailImage", 256, 7), new C3445c("CameraSettingsIFDPointer", 8224, 4), new C3445c("ImageProcessingIFDPointer", 8256, 4)};

    /* renamed from: C */
    private static final C3445c[] f9734C = {new C3445c("PreviewImageStart", 257, 4), new C3445c("PreviewImageLength", 258, 4)};

    /* renamed from: D */
    private static final C3445c[] f9735D = {new C3445c("AspectFrame", 4371, 3)};

    /* renamed from: E */
    private static final C3445c[] f9736E;

    /* renamed from: F */
    static final C3445c[][] f9737F;

    /* renamed from: G */
    private static final C3445c[] f9738G = {new C3445c("SubIFDPointer", 330, 4), new C3445c("ExifIFDPointer", 34665, 4), new C3445c("GPSInfoIFDPointer", 34853, 4), new C3445c("InteroperabilityIFDPointer", 40965, 4), new C3445c("CameraSettingsIFDPointer", 8224, 1), new C3445c("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: H */
    private static final HashMap<Integer, C3445c>[] f9739H;

    /* renamed from: I */
    private static final HashMap<String, C3445c>[] f9740I;

    /* renamed from: J */
    private static final HashSet<String> f9741J = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: K */
    private static final HashMap<Integer, Integer> f9742K = new HashMap<>();

    /* renamed from: L */
    static final Charset f9743L;

    /* renamed from: M */
    static final byte[] f9744M;

    /* renamed from: m */
    public static final int[] f9745m = {8, 8, 8};

    /* renamed from: n */
    public static final int[] f9746n = {8};

    /* renamed from: o */
    static final byte[] f9747o = {-1, -40, -1};

    /* renamed from: p */
    private static final byte[] f9748p = {79, 76, 89, 77, 80, 0};

    /* renamed from: q */
    private static final byte[] f9749q = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: r */
    private static SimpleDateFormat f9750r;

    /* renamed from: s */
    static final String[] f9751s = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: t */
    static final int[] f9752t = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: u */
    static final byte[] f9753u = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: v */
    private static final C3445c[] f9754v = {new C3445c("NewSubfileType", 254, 4), new C3445c("SubfileType", 255, 4), new C3445c("ImageWidth", 256, 3, 4), new C3445c("ImageLength", 257, 3, 4), new C3445c("BitsPerSample", 258, 3), new C3445c("Compression", 259, 3), new C3445c("PhotometricInterpretation", 262, 3), new C3445c("ImageDescription", 270, 2), new C3445c("Make", 271, 2), new C3445c("Model", 272, 2), new C3445c("StripOffsets", 273, 3, 4), new C3445c("Orientation", 274, 3), new C3445c("SamplesPerPixel", 277, 3), new C3445c("RowsPerStrip", 278, 3, 4), new C3445c("StripByteCounts", 279, 3, 4), new C3445c("XResolution", 282, 5), new C3445c("YResolution", 283, 5), new C3445c("PlanarConfiguration", 284, 3), new C3445c("ResolutionUnit", 296, 3), new C3445c("TransferFunction", 301, 3), new C3445c("Software", 305, 2), new C3445c("DateTime", 306, 2), new C3445c("Artist", 315, 2), new C3445c("WhitePoint", 318, 5), new C3445c("PrimaryChromaticities", 319, 5), new C3445c("SubIFDPointer", 330, 4), new C3445c("JPEGInterchangeFormat", 513, 4), new C3445c("JPEGInterchangeFormatLength", 514, 4), new C3445c("YCbCrCoefficients", 529, 5), new C3445c("YCbCrSubSampling", 530, 3), new C3445c("YCbCrPositioning", 531, 3), new C3445c("ReferenceBlackWhite", 532, 5), new C3445c("Copyright", 33432, 2), new C3445c("ExifIFDPointer", 34665, 4), new C3445c("GPSInfoIFDPointer", 34853, 4), new C3445c("SensorTopBorder", 4, 4), new C3445c("SensorLeftBorder", 5, 4), new C3445c("SensorBottomBorder", 6, 4), new C3445c("SensorRightBorder", 7, 4), new C3445c("ISO", 23, 3), new C3445c("JpgFromRaw", 46, 7)};

    /* renamed from: w */
    private static final C3445c[] f9755w = {new C3445c("ExposureTime", 33434, 5), new C3445c("FNumber", 33437, 5), new C3445c("ExposureProgram", 34850, 3), new C3445c("SpectralSensitivity", 34852, 2), new C3445c("PhotographicSensitivity", 34855, 3), new C3445c("OECF", 34856, 7), new C3445c("ExifVersion", 36864, 2), new C3445c("DateTimeOriginal", 36867, 2), new C3445c("DateTimeDigitized", 36868, 2), new C3445c("ComponentsConfiguration", 37121, 7), new C3445c("CompressedBitsPerPixel", 37122, 5), new C3445c("ShutterSpeedValue", 37377, 10), new C3445c("ApertureValue", 37378, 5), new C3445c("BrightnessValue", 37379, 10), new C3445c("ExposureBiasValue", 37380, 10), new C3445c("MaxApertureValue", 37381, 5), new C3445c("SubjectDistance", 37382, 5), new C3445c("MeteringMode", 37383, 3), new C3445c("LightSource", 37384, 3), new C3445c("Flash", 37385, 3), new C3445c("FocalLength", 37386, 5), new C3445c("SubjectArea", 37396, 3), new C3445c("MakerNote", 37500, 7), new C3445c("UserComment", 37510, 7), new C3445c("SubSecTime", 37520, 2), new C3445c("SubSecTimeOriginal", 37521, 2), new C3445c("SubSecTimeDigitized", 37522, 2), new C3445c("FlashpixVersion", 40960, 7), new C3445c("ColorSpace", 40961, 3), new C3445c("PixelXDimension", 40962, 3, 4), new C3445c("PixelYDimension", 40963, 3, 4), new C3445c("RelatedSoundFile", 40964, 2), new C3445c("InteroperabilityIFDPointer", 40965, 4), new C3445c("FlashEnergy", 41483, 5), new C3445c("SpatialFrequencyResponse", 41484, 7), new C3445c("FocalPlaneXResolution", 41486, 5), new C3445c("FocalPlaneYResolution", 41487, 5), new C3445c("FocalPlaneResolutionUnit", 41488, 3), new C3445c("SubjectLocation", 41492, 3), new C3445c("ExposureIndex", 41493, 5), new C3445c("SensingMethod", 41495, 3), new C3445c("FileSource", 41728, 7), new C3445c("SceneType", 41729, 7), new C3445c("CFAPattern", 41730, 7), new C3445c("CustomRendered", 41985, 3), new C3445c("ExposureMode", 41986, 3), new C3445c("WhiteBalance", 41987, 3), new C3445c("DigitalZoomRatio", 41988, 5), new C3445c("FocalLengthIn35mmFilm", 41989, 3), new C3445c("SceneCaptureType", 41990, 3), new C3445c("GainControl", 41991, 3), new C3445c("Contrast", 41992, 3), new C3445c("Saturation", 41993, 3), new C3445c("Sharpness", 41994, 3), new C3445c("DeviceSettingDescription", 41995, 7), new C3445c("SubjectDistanceRange", 41996, 3), new C3445c("ImageUniqueID", 42016, 2), new C3445c("DNGVersion", 50706, 1), new C3445c("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: x */
    private static final C3445c[] f9756x = {new C3445c("GPSVersionID", 0, 1), new C3445c("GPSLatitudeRef", 1, 2), new C3445c("GPSLatitude", 2, 5), new C3445c("GPSLongitudeRef", 3, 2), new C3445c("GPSLongitude", 4, 5), new C3445c("GPSAltitudeRef", 5, 1), new C3445c("GPSAltitude", 6, 5), new C3445c("GPSTimeStamp", 7, 5), new C3445c("GPSSatellites", 8, 2), new C3445c("GPSStatus", 9, 2), new C3445c("GPSMeasureMode", 10, 2), new C3445c("GPSDOP", 11, 5), new C3445c("GPSSpeedRef", 12, 2), new C3445c("GPSSpeed", 13, 5), new C3445c("GPSTrackRef", 14, 2), new C3445c("GPSTrack", 15, 5), new C3445c("GPSImgDirectionRef", 16, 2), new C3445c("GPSImgDirection", 17, 5), new C3445c("GPSMapDatum", 18, 2), new C3445c("GPSDestLatitudeRef", 19, 2), new C3445c("GPSDestLatitude", 20, 5), new C3445c("GPSDestLongitudeRef", 21, 2), new C3445c("GPSDestLongitude", 22, 5), new C3445c("GPSDestBearingRef", 23, 2), new C3445c("GPSDestBearing", 24, 5), new C3445c("GPSDestDistanceRef", 25, 2), new C3445c("GPSDestDistance", 26, 5), new C3445c("GPSProcessingMethod", 27, 7), new C3445c("GPSAreaInformation", 28, 7), new C3445c("GPSDateStamp", 29, 2), new C3445c("GPSDifferential", 30, 3)};

    /* renamed from: y */
    private static final C3445c[] f9757y = {new C3445c("InteroperabilityIndex", 1, 2)};

    /* renamed from: z */
    private static final C3445c[] f9758z = {new C3445c("NewSubfileType", 254, 4), new C3445c("SubfileType", 255, 4), new C3445c("ThumbnailImageWidth", 256, 3, 4), new C3445c("ThumbnailImageLength", 257, 3, 4), new C3445c("BitsPerSample", 258, 3), new C3445c("Compression", 259, 3), new C3445c("PhotometricInterpretation", 262, 3), new C3445c("ImageDescription", 270, 2), new C3445c("Make", 271, 2), new C3445c("Model", 272, 2), new C3445c("StripOffsets", 273, 3, 4), new C3445c("Orientation", 274, 3), new C3445c("SamplesPerPixel", 277, 3), new C3445c("RowsPerStrip", 278, 3, 4), new C3445c("StripByteCounts", 279, 3, 4), new C3445c("XResolution", 282, 5), new C3445c("YResolution", 283, 5), new C3445c("PlanarConfiguration", 284, 3), new C3445c("ResolutionUnit", 296, 3), new C3445c("TransferFunction", 301, 3), new C3445c("Software", 305, 2), new C3445c("DateTime", 306, 2), new C3445c("Artist", 315, 2), new C3445c("WhitePoint", 318, 5), new C3445c("PrimaryChromaticities", 319, 5), new C3445c("SubIFDPointer", 330, 4), new C3445c("JPEGInterchangeFormat", 513, 4), new C3445c("JPEGInterchangeFormatLength", 514, 4), new C3445c("YCbCrCoefficients", 529, 5), new C3445c("YCbCrSubSampling", 530, 3), new C3445c("YCbCrPositioning", 531, 3), new C3445c("ReferenceBlackWhite", 532, 5), new C3445c("Copyright", 33432, 2), new C3445c("ExifIFDPointer", 34665, 4), new C3445c("GPSInfoIFDPointer", 34853, 4), new C3445c("DNGVersion", 50706, 1), new C3445c("DefaultCropSize", 50720, 3, 4)};

    /* renamed from: a */
    private final String f9759a;

    /* renamed from: b */
    private final AssetInputStream f9760b;

    /* renamed from: c */
    private int f9761c;

    /* renamed from: d */
    private final HashMap<String, C3444b>[] f9762d = new HashMap[f9737F.length];

    /* renamed from: e */
    private Set<Integer> f9763e = new HashSet(f9737F.length);

    /* renamed from: f */
    private ByteOrder f9764f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private int f9765g;

    /* renamed from: h */
    private int f9766h;

    /* renamed from: i */
    private int f9767i;

    /* renamed from: j */
    private int f9768j;

    /* renamed from: k */
    private int f9769k;

    /* renamed from: l */
    private int f9770l;

    /* renamed from: f.l.a.a$a */
    private static class C3443a extends InputStream implements DataInput {

        /* renamed from: j */
        private static final ByteOrder f9771j = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: k */
        private static final ByteOrder f9772k = ByteOrder.BIG_ENDIAN;

        /* renamed from: f */
        private DataInputStream f9773f;

        /* renamed from: g */
        private ByteOrder f9774g;

        /* renamed from: h */
        final int f9775h;

        /* renamed from: i */
        int f9776i;

        public C3443a(InputStream inputStream) {
            this.f9774g = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f9773f = dataInputStream;
            int available = dataInputStream.available();
            this.f9775h = available;
            this.f9776i = 0;
            this.f9773f.mark(available);
        }

        public C3443a(byte[] bArr) {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public int mo10985a() {
            return this.f9776i;
        }

        /* renamed from: a */
        public void mo10986a(ByteOrder byteOrder) {
            this.f9774g = byteOrder;
        }

        public int available() {
            return this.f9773f.available();
        }

        /* renamed from: d */
        public long mo10988d() {
            return ((long) readInt()) & 4294967295L;
        }

        /* renamed from: d */
        public void mo10989d(long j) {
            int i = this.f9776i;
            if (((long) i) > j) {
                this.f9776i = 0;
                this.f9773f.reset();
                this.f9773f.mark(this.f9775h);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read() {
            this.f9776i++;
            return this.f9773f.read();
        }

        public int read(byte[] bArr, int i, int i2) {
            int read = this.f9773f.read(bArr, i, i2);
            this.f9776i += read;
            return read;
        }

        public boolean readBoolean() {
            this.f9776i++;
            return this.f9773f.readBoolean();
        }

        public byte readByte() {
            int i = this.f9776i + 1;
            this.f9776i = i;
            if (i <= this.f9775h) {
                int read = this.f9773f.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f9776i += 2;
            return this.f9773f.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr) {
            int length = this.f9776i + bArr.length;
            this.f9776i = length;
            if (length > this.f9775h) {
                throw new EOFException();
            } else if (this.f9773f.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public void readFully(byte[] bArr, int i, int i2) {
            int i3 = this.f9776i + i2;
            this.f9776i = i3;
            if (i3 > this.f9775h) {
                throw new EOFException();
            } else if (this.f9773f.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() {
            int i = this.f9776i + 4;
            this.f9776i = i;
            if (i <= this.f9775h) {
                int read = this.f9773f.read();
                int read2 = this.f9773f.read();
                int read3 = this.f9773f.read();
                int read4 = this.f9773f.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f9774g;
                    if (byteOrder == f9771j) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f9772k) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f9774g);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            int i = this.f9776i + 8;
            this.f9776i = i;
            if (i <= this.f9775h) {
                int read = this.f9773f.read();
                int read2 = this.f9773f.read();
                int read3 = this.f9773f.read();
                int read4 = this.f9773f.read();
                int read5 = this.f9773f.read();
                int read6 = this.f9773f.read();
                int read7 = this.f9773f.read();
                int read8 = this.f9773f.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f9774g;
                    if (byteOrder == f9771j) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i2 = read2;
                    if (byteOrder == f9772k) {
                        return (((long) read) << 56) + (((long) i2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f9774g);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() {
            int i = this.f9776i + 2;
            this.f9776i = i;
            if (i <= this.f9775h) {
                int read = this.f9773f.read();
                int read2 = this.f9773f.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f9774g;
                    if (byteOrder == f9771j) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f9772k) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f9774g);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f9776i += 2;
            return this.f9773f.readUTF();
        }

        public int readUnsignedByte() {
            this.f9776i++;
            return this.f9773f.readUnsignedByte();
        }

        public int readUnsignedShort() {
            int i = this.f9776i + 2;
            this.f9776i = i;
            if (i <= this.f9775h) {
                int read = this.f9773f.read();
                int read2 = this.f9773f.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f9774g;
                    if (byteOrder == f9771j) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f9772k) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f9774g);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) {
            int min = Math.min(i, this.f9775h - this.f9776i);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f9773f.skipBytes(min - i2);
            }
            this.f9776i += i2;
            return i2;
        }
    }

    /* renamed from: f.l.a.a$b */
    private static class C3444b {

        /* renamed from: a */
        public final int f9777a;

        /* renamed from: b */
        public final int f9778b;

        /* renamed from: c */
        public final byte[] f9779c;

        C3444b(int i, int i2, byte[] bArr) {
            this.f9777a = i;
            this.f9778b = i2;
            this.f9779c = bArr;
        }

        /* renamed from: a */
        public static C3444b m14148a(int i, ByteOrder byteOrder) {
            return m14152a(new int[]{i}, byteOrder);
        }

        /* renamed from: a */
        public static C3444b m14149a(long j, ByteOrder byteOrder) {
            return m14153a(new long[]{j}, byteOrder);
        }

        /* renamed from: a */
        public static C3444b m14150a(C3446d dVar, ByteOrder byteOrder) {
            return m14154a(new C3446d[]{dVar}, byteOrder);
        }

        /* renamed from: a */
        public static C3444b m14151a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            byte[] bytes = sb.toString().getBytes(C3442a.f9743L);
            return new C3444b(2, bytes.length, bytes);
        }

        /* renamed from: a */
        public static C3444b m14152a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C3442a.f9752t[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C3444b(3, iArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C3444b m14153a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C3442a.f9752t[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C3444b(4, jArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C3444b m14154a(C3446d[] dVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C3442a.f9752t[5] * dVarArr.length)]);
            wrap.order(byteOrder);
            for (C3446d dVar : dVarArr) {
                wrap.putInt((int) dVar.f9784a);
                wrap.putInt((int) dVar.f9785b);
            }
            return new C3444b(5, dVarArr.length, wrap.array());
        }

        /* renamed from: a */
        public double mo11007a(ByteOrder byteOrder) {
            Object d = mo11010d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (d instanceof String) {
                return Double.parseDouble((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof double[]) {
                    double[] dArr = (double[]) d;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof C3446d[]) {
                    C3446d[] dVarArr = (C3446d[]) d;
                    if (dVarArr.length == 1) {
                        return dVarArr[0].mo11013a();
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: b */
        public int mo11008b(ByteOrder byteOrder) {
            Object d = mo11010d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d instanceof String) {
                return Integer.parseInt((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: c */
        public String mo11009c(ByteOrder byteOrder) {
            Object d = mo11010d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            String str = ",";
            int i = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (!(d instanceof C3446d[])) {
                return null;
            } else {
                C3446d[] dVarArr = (C3446d[]) d;
                while (i < dVarArr.length) {
                    sb.append(dVarArr[i].f9784a);
                    sb.append('/');
                    sb.append(dVarArr[i].f9785b);
                    i++;
                    if (i != dVarArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x01ab A[SYNTHETIC, Splitter:B:164:0x01ab] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo11010d(java.nio.ByteOrder r11) {
            /*
                r10 = this;
                java.lang.String r0 = "IOException occurred while closing InputStream"
                java.lang.String r1 = "ExifInterface"
                r2 = 0
                f.l.a.a$a r3 = new f.l.a.a$a     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                byte[] r4 = r10.f9779c     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                r3.<init>(r4)     // Catch:{ IOException -> 0x0195, all -> 0x0193 }
                r3.mo10986a(r11)     // Catch:{ IOException -> 0x0191 }
                int r11 = r10.f9777a     // Catch:{ IOException -> 0x0191 }
                r4 = 1
                r5 = 0
                switch(r11) {
                    case 1: goto L_0x014c;
                    case 2: goto L_0x00fd;
                    case 3: goto L_0x00e3;
                    case 4: goto L_0x00c9;
                    case 5: goto L_0x00a6;
                    case 6: goto L_0x014c;
                    case 7: goto L_0x00fd;
                    case 8: goto L_0x008c;
                    case 9: goto L_0x0072;
                    case 10: goto L_0x004d;
                    case 11: goto L_0x0032;
                    case 12: goto L_0x0018;
                    default: goto L_0x0016;
                }     // Catch:{ IOException -> 0x0191 }
            L_0x0016:
                goto L_0x0188
            L_0x0018:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x001c:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0029
                double r6 = r3.readDouble()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x001c
            L_0x0029:
                r3.close()     // Catch:{ IOException -> 0x002d }
                goto L_0x0031
            L_0x002d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0031:
                return r11
            L_0x0032:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                double[] r11 = new double[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0036:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0044
                float r4 = r3.readFloat()     // Catch:{ IOException -> 0x0191 }
                double r6 = (double) r4     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0036
            L_0x0044:
                r3.close()     // Catch:{ IOException -> 0x0048 }
                goto L_0x004c
            L_0x0048:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x004c:
                return r11
            L_0x004d:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                f.l.a.a$d[] r11 = new p071f.p118l.p119a.C3442a.C3446d[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0051:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0069
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r6 = (long) r4     // Catch:{ IOException -> 0x0191 }
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                long r8 = (long) r4     // Catch:{ IOException -> 0x0191 }
                f.l.a.a$d r4 = new f.l.a.a$d     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0051
            L_0x0069:
                r3.close()     // Catch:{ IOException -> 0x006d }
                goto L_0x0071
            L_0x006d:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0071:
                return r11
            L_0x0072:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0076:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x0083
                int r4 = r3.readInt()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0076
            L_0x0083:
                r3.close()     // Catch:{ IOException -> 0x0087 }
                goto L_0x008b
            L_0x0087:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x008b:
                return r11
            L_0x008c:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x0090:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x009d
                short r4 = r3.readShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x0090
            L_0x009d:
                r3.close()     // Catch:{ IOException -> 0x00a1 }
                goto L_0x00a5
            L_0x00a1:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00a5:
                return r11
            L_0x00a6:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                f.l.a.a$d[] r11 = new p071f.p118l.p119a.C3442a.C3446d[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00aa:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00c0
                long r6 = r3.mo10988d()     // Catch:{ IOException -> 0x0191 }
                long r8 = r3.mo10988d()     // Catch:{ IOException -> 0x0191 }
                f.l.a.a$d r4 = new f.l.a.a$d     // Catch:{ IOException -> 0x0191 }
                r4.<init>(r6, r8)     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00aa
            L_0x00c0:
                r3.close()     // Catch:{ IOException -> 0x00c4 }
                goto L_0x00c8
            L_0x00c4:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00c8:
                return r11
            L_0x00c9:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                long[] r11 = new long[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00cd:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00da
                long r6 = r3.mo10988d()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r6     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00cd
            L_0x00da:
                r3.close()     // Catch:{ IOException -> 0x00de }
                goto L_0x00e2
            L_0x00de:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00e2:
                return r11
            L_0x00e3:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                int[] r11 = new int[r11]     // Catch:{ IOException -> 0x0191 }
            L_0x00e7:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x00f4
                int r4 = r3.readUnsignedShort()     // Catch:{ IOException -> 0x0191 }
                r11[r5] = r4     // Catch:{ IOException -> 0x0191 }
                int r5 = r5 + 1
                goto L_0x00e7
            L_0x00f4:
                r3.close()     // Catch:{ IOException -> 0x00f8 }
                goto L_0x00fc
            L_0x00f8:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x00fc:
                return r11
            L_0x00fd:
                int r11 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = p071f.p118l.p119a.C3442a.f9753u     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 < r6) goto L_0x011e
                r11 = 0
            L_0x0105:
                byte[] r6 = p071f.p118l.p119a.C3442a.f9753u     // Catch:{ IOException -> 0x0191 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0191 }
                if (r11 >= r6) goto L_0x0119
                byte[] r6 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r11]     // Catch:{ IOException -> 0x0191 }
                byte[] r7 = p071f.p118l.p119a.C3442a.f9753u     // Catch:{ IOException -> 0x0191 }
                byte r7 = r7[r11]     // Catch:{ IOException -> 0x0191 }
                if (r6 == r7) goto L_0x0116
                r4 = 0
                goto L_0x0119
            L_0x0116:
                int r11 = r11 + 1
                goto L_0x0105
            L_0x0119:
                if (r4 == 0) goto L_0x011e
                byte[] r11 = p071f.p118l.p119a.C3442a.f9753u     // Catch:{ IOException -> 0x0191 }
                int r5 = r11.length     // Catch:{ IOException -> 0x0191 }
            L_0x011e:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0191 }
                r11.<init>()     // Catch:{ IOException -> 0x0191 }
            L_0x0123:
                int r4 = r10.f9778b     // Catch:{ IOException -> 0x0191 }
                if (r5 >= r4) goto L_0x013f
                byte[] r4 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                byte r4 = r4[r5]     // Catch:{ IOException -> 0x0191 }
                if (r4 != 0) goto L_0x012e
                goto L_0x013f
            L_0x012e:
                r6 = 32
                if (r4 < r6) goto L_0x0137
                char r4 = (char) r4     // Catch:{ IOException -> 0x0191 }
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
                goto L_0x013c
            L_0x0137:
                r4 = 63
                r11.append(r4)     // Catch:{ IOException -> 0x0191 }
            L_0x013c:
                int r5 = r5 + 1
                goto L_0x0123
            L_0x013f:
                java.lang.String r11 = r11.toString()     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0147 }
                goto L_0x014b
            L_0x0147:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x014b:
                return r11
            L_0x014c:
                byte[] r11 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                int r11 = r11.length     // Catch:{ IOException -> 0x0191 }
                if (r11 != r4) goto L_0x0176
                byte[] r11 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 < 0) goto L_0x0176
                byte[] r11 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                byte r11 = r11[r5]     // Catch:{ IOException -> 0x0191 }
                if (r11 > r4) goto L_0x0176
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                char[] r4 = new char[r4]     // Catch:{ IOException -> 0x0191 }
                byte[] r6 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                byte r6 = r6[r5]     // Catch:{ IOException -> 0x0191 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0191 }
                r4[r5] = r6     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0171 }
                goto L_0x0175
            L_0x0171:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0175:
                return r11
            L_0x0176:
                java.lang.String r11 = new java.lang.String     // Catch:{ IOException -> 0x0191 }
                byte[] r4 = r10.f9779c     // Catch:{ IOException -> 0x0191 }
                java.nio.charset.Charset r5 = p071f.p118l.p119a.C3442a.f9743L     // Catch:{ IOException -> 0x0191 }
                r11.<init>(r4, r5)     // Catch:{ IOException -> 0x0191 }
                r3.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0187
            L_0x0183:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x0187:
                return r11
            L_0x0188:
                r3.close()     // Catch:{ IOException -> 0x018c }
                goto L_0x0190
            L_0x018c:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x0190:
                return r2
            L_0x0191:
                r11 = move-exception
                goto L_0x0197
            L_0x0193:
                r11 = move-exception
                goto L_0x01a9
            L_0x0195:
                r11 = move-exception
                r3 = r2
            L_0x0197:
                java.lang.String r4 = "IOException occurred during reading a value"
                android.util.Log.w(r1, r4, r11)     // Catch:{ all -> 0x01a7 }
                if (r3 == 0) goto L_0x01a6
                r3.close()     // Catch:{ IOException -> 0x01a2 }
                goto L_0x01a6
            L_0x01a2:
                r11 = move-exception
                android.util.Log.e(r1, r0, r11)
            L_0x01a6:
                return r2
            L_0x01a7:
                r11 = move-exception
                r2 = r3
            L_0x01a9:
                if (r2 == 0) goto L_0x01b3
                r2.close()     // Catch:{ IOException -> 0x01af }
                goto L_0x01b3
            L_0x01af:
                r2 = move-exception
                android.util.Log.e(r1, r0, r2)
            L_0x01b3:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: p071f.p118l.p119a.C3442a.C3444b.mo11010d(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(C3442a.f9751s[this.f9777a]);
            sb.append(", data length:");
            sb.append(this.f9779c.length);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: f.l.a.a$c */
    static class C3445c {

        /* renamed from: a */
        public final int f9780a;

        /* renamed from: b */
        public final String f9781b;

        /* renamed from: c */
        public final int f9782c;

        /* renamed from: d */
        public final int f9783d;

        C3445c(String str, int i, int i2) {
            this.f9781b = str;
            this.f9780a = i;
            this.f9782c = i2;
            this.f9783d = -1;
        }

        C3445c(String str, int i, int i2, int i3) {
            this.f9781b = str;
            this.f9780a = i;
            this.f9782c = i2;
            this.f9783d = i3;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo11012a(int i) {
            int i2 = this.f9782c;
            if (!(i2 == 7 || i == 7 || i2 == i)) {
                int i3 = this.f9783d;
                if (i3 != i) {
                    if ((i2 == 4 || i3 == 4) && i == 3) {
                        return true;
                    }
                    if ((this.f9782c == 9 || this.f9783d == 9) && i == 8) {
                        return true;
                    }
                    return (this.f9782c == 12 || this.f9783d == 12) && i == 11;
                }
            }
            return true;
        }
    }

    /* renamed from: f.l.a.a$d */
    private static class C3446d {

        /* renamed from: a */
        public final long f9784a;

        /* renamed from: b */
        public final long f9785b;

        C3446d(long j, long j2) {
            if (j2 == 0) {
                this.f9784a = 0;
                this.f9785b = 1;
                return;
            }
            this.f9784a = j;
            this.f9785b = j2;
        }

        /* renamed from: a */
        public double mo11013a() {
            return ((double) this.f9784a) / ((double) this.f9785b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9784a);
            sb.append("/");
            sb.append(this.f9785b);
            return sb.toString();
        }
    }

    static {
        C3445c[] cVarArr;
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(3);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(8);
        Arrays.asList(new Integer[]{valueOf, Integer.valueOf(6), valueOf2, valueOf4});
        Integer valueOf5 = Integer.valueOf(7);
        Integer valueOf6 = Integer.valueOf(5);
        Arrays.asList(new Integer[]{valueOf3, valueOf5, Integer.valueOf(4), valueOf6});
        C3445c[] cVarArr2 = {new C3445c("ColorSpace", 55, 3)};
        f9736E = cVarArr2;
        C3445c[] cVarArr3 = f9754v;
        f9737F = new C3445c[][]{cVarArr3, f9755w, f9756x, f9757y, f9758z, cVarArr3, f9733B, f9734C, f9735D, cVarArr2};
        new C3445c("JPEGInterchangeFormat", 513, 4);
        new C3445c("JPEGInterchangeFormatLength", 514, 4);
        C3445c[][] cVarArr4 = f9737F;
        f9739H = new HashMap[cVarArr4.length];
        f9740I = new HashMap[cVarArr4.length];
        Charset forName = Charset.forName("US-ASCII");
        f9743L = forName;
        f9744M = "Exif\u0000\u0000".getBytes(forName);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");
        f9750r = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < f9737F.length; i++) {
            f9739H[i] = new HashMap<>();
            f9740I[i] = new HashMap<>();
            for (C3445c cVar : f9737F[i]) {
                f9739H[i].put(Integer.valueOf(cVar.f9780a), cVar);
                f9740I[i].put(cVar.f9781b, cVar);
            }
        }
        f9742K.put(Integer.valueOf(f9738G[0].f9780a), valueOf6);
        f9742K.put(Integer.valueOf(f9738G[1].f9780a), valueOf);
        f9742K.put(Integer.valueOf(f9738G[2].f9780a), valueOf3);
        f9742K.put(Integer.valueOf(f9738G[3].f9780a), valueOf2);
        f9742K.put(Integer.valueOf(f9738G[4].f9780a), valueOf5);
        f9742K.put(Integer.valueOf(f9738G[5].f9780a), valueOf4);
        Pattern.compile(".*[1-9].*");
        Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");
    }

    public C3442a(InputStream inputStream) {
        if (inputStream != null) {
            AssetInputStream assetInputStream = null;
            this.f9759a = null;
            if (inputStream instanceof AssetInputStream) {
                assetInputStream = (AssetInputStream) inputStream;
            }
            this.f9760b = assetInputStream;
            m14122a(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    /* renamed from: a */
    private int m14115a(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m14125a(bArr)) {
            return 4;
        }
        if (m14136c(bArr)) {
            return 9;
        }
        if (m14133b(bArr)) {
            return 7;
        }
        return m14139d(bArr) ? 10 : 0;
    }

    /* renamed from: a */
    private void m14116a() {
        String a = mo10984a("DateTimeOriginal");
        if (a != null) {
            String str = "DateTime";
            if (mo10984a(str) == null) {
                this.f9762d[0].put(str, C3444b.m14151a(a));
            }
        }
        String str2 = "ImageWidth";
        if (mo10984a(str2) == null) {
            this.f9762d[0].put(str2, C3444b.m14149a(0, this.f9764f));
        }
        String str3 = "ImageLength";
        if (mo10984a(str3) == null) {
            this.f9762d[0].put(str3, C3444b.m14149a(0, this.f9764f));
        }
        String str4 = "Orientation";
        if (mo10984a(str4) == null) {
            this.f9762d[0].put(str4, C3444b.m14149a(0, this.f9764f));
        }
        String str5 = "LightSource";
        if (mo10984a(str5) == null) {
            this.f9762d[1].put(str5, C3444b.m14149a(0, this.f9764f));
        }
    }

    /* renamed from: a */
    private void m14117a(int i, int i2) {
        if (!this.f9762d[i].isEmpty() && !this.f9762d[i2].isEmpty()) {
            String str = "ImageLength";
            C3444b bVar = (C3444b) this.f9762d[i].get(str);
            String str2 = "ImageWidth";
            C3444b bVar2 = (C3444b) this.f9762d[i].get(str2);
            C3444b bVar3 = (C3444b) this.f9762d[i2].get(str);
            C3444b bVar4 = (C3444b) this.f9762d[i2].get(str2);
            if (bVar != null && bVar2 != null && bVar3 != null && bVar4 != null) {
                int b = bVar.mo11008b(this.f9764f);
                int b2 = bVar2.mo11008b(this.f9764f);
                int b3 = bVar3.mo11008b(this.f9764f);
                int b4 = bVar4.mo11008b(this.f9764f);
                if (b < b3 && b2 < b4) {
                    HashMap<String, C3444b>[] hashMapArr = this.f9762d;
                    HashMap<String, C3444b> hashMap = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap;
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14118a(p071f.p118l.p119a.C3442a.C3443a r7) {
        /*
            r6 = this;
            r6.m14134c(r7)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r7 = r6.f9762d
            r0 = 1
            r7 = r7[r0]
            java.lang.String r1 = "MakerNote"
            java.lang.Object r7 = r7.get(r1)
            f.l.a.a$b r7 = (p071f.p118l.p119a.C3442a.C3444b) r7
            if (r7 == 0) goto L_0x00f9
            f.l.a.a$a r1 = new f.l.a.a$a
            byte[] r7 = r7.f9779c
            r1.<init>(r7)
            java.nio.ByteOrder r7 = r6.f9764f
            r1.mo10986a(r7)
            byte[] r7 = f9748p
            int r7 = r7.length
            byte[] r7 = new byte[r7]
            r1.readFully(r7)
            r2 = 0
            r1.mo10989d(r2)
            byte[] r2 = f9749q
            int r2 = r2.length
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            byte[] r3 = f9748p
            boolean r7 = java.util.Arrays.equals(r7, r3)
            if (r7 == 0) goto L_0x0041
            r2 = 8
        L_0x003d:
            r1.mo10989d(r2)
            goto L_0x004c
        L_0x0041:
            byte[] r7 = f9749q
            boolean r7 = java.util.Arrays.equals(r2, r7)
            if (r7 == 0) goto L_0x004c
            r2 = 12
            goto L_0x003d
        L_0x004c:
            r7 = 6
            r6.m14129b(r1, r7)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r7 = r6.f9762d
            r1 = 7
            r7 = r7[r1]
            java.lang.String r2 = "PreviewImageStart"
            java.lang.Object r7 = r7.get(r2)
            f.l.a.a$b r7 = (p071f.p118l.p119a.C3442a.C3444b) r7
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r2 = r6.f9762d
            r1 = r2[r1]
            java.lang.String r2 = "PreviewImageLength"
            java.lang.Object r1 = r1.get(r2)
            f.l.a.a$b r1 = (p071f.p118l.p119a.C3442a.C3444b) r1
            if (r7 == 0) goto L_0x0080
            if (r1 == 0) goto L_0x0080
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r2 = r6.f9762d
            r3 = 5
            r2 = r2[r3]
            java.lang.String r4 = "JPEGInterchangeFormat"
            r2.put(r4, r7)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r7 = r6.f9762d
            r7 = r7[r3]
            java.lang.String r2 = "JPEGInterchangeFormatLength"
            r7.put(r2, r1)
        L_0x0080:
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r7 = r6.f9762d
            r1 = 8
            r7 = r7[r1]
            java.lang.String r1 = "AspectFrame"
            java.lang.Object r7 = r7.get(r1)
            f.l.a.a$b r7 = (p071f.p118l.p119a.C3442a.C3444b) r7
            if (r7 == 0) goto L_0x00f9
            java.nio.ByteOrder r1 = r6.f9764f
            java.lang.Object r7 = r7.mo11010d(r1)
            int[] r7 = (int[]) r7
            if (r7 == 0) goto L_0x00df
            int r1 = r7.length
            r2 = 4
            if (r1 == r2) goto L_0x009f
            goto L_0x00df
        L_0x009f:
            r1 = 2
            r2 = r7[r1]
            r3 = 0
            r4 = r7[r3]
            if (r2 <= r4) goto L_0x00f9
            r2 = 3
            r4 = r7[r2]
            r5 = r7[r0]
            if (r4 <= r5) goto L_0x00f9
            r1 = r7[r1]
            r4 = r7[r3]
            int r1 = r1 - r4
            int r1 = r1 + r0
            r2 = r7[r2]
            r7 = r7[r0]
            int r2 = r2 - r7
            int r2 = r2 + r0
            if (r1 >= r2) goto L_0x00c0
            int r1 = r1 + r2
            int r2 = r1 - r2
            int r1 = r1 - r2
        L_0x00c0:
            java.nio.ByteOrder r7 = r6.f9764f
            f.l.a.a$b r7 = p071f.p118l.p119a.C3442a.C3444b.m14148a(r1, r7)
            java.nio.ByteOrder r0 = r6.f9764f
            f.l.a.a$b r0 = p071f.p118l.p119a.C3442a.C3444b.m14148a(r2, r0)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r1 = r6.f9762d
            r1 = r1[r3]
            java.lang.String r2 = "ImageWidth"
            r1.put(r2, r7)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r7 = r6.f9762d
            r7 = r7[r3]
            java.lang.String r1 = "ImageLength"
            r7.put(r1, r0)
            goto L_0x00f9
        L_0x00df:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid aspect frame values. frame="
            r0.append(r1)
            java.lang.String r7 = java.util.Arrays.toString(r7)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "ExifInterface"
            android.util.Log.w(r0, r7)
        L_0x00f9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p118l.p119a.C3442a.m14118a(f.l.a.a$a):void");
    }

    /* renamed from: a */
    private void m14119a(C3443a aVar, int i) {
        ByteOrder e = m14140e(aVar);
        this.f9764f = e;
        aVar.mo10986a(e);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f9761c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't jump to first Ifd: ");
                sb2.append(i3);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14120a(p071f.p118l.p119a.C3442a.C3443a r10, int r11, int r12) {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.mo10986a(r0)
            long r0 = (long) r11
            r10.mo10989d(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r0 = r9.f9762d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f9764f
            f.l.a.a$b r5 = p071f.p118l.p119a.C3442a.C3444b.m14149a(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r0 = r9.f9762d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f9764f
            f.l.a.a$b r5 = p071f.p118l.p119a.C3442a.C3444b.m14149a(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.mo10984a(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r5 = r9.f9762d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = f9743L
            r7.<init>(r0, r8)
            f.l.a.a$b r0 = p071f.p118l.p119a.C3442a.C3444b.m14151a(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = f9744M
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f9766h = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.m14123a(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f9764f
            r10.mo10986a(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p118l.p119a.C3442a.m14120a(f.l.a.a$a, int, int):void");
    }

    /* renamed from: a */
    private void m14121a(C3443a aVar, HashMap hashMap) {
        int i;
        C3444b bVar = (C3444b) hashMap.get("JPEGInterchangeFormat");
        C3444b bVar2 = (C3444b) hashMap.get("JPEGInterchangeFormatLength");
        if (bVar != null && bVar2 != null) {
            int b = bVar.mo11008b(this.f9764f);
            int min = Math.min(bVar2.mo11008b(this.f9764f), aVar.available() - b);
            int i2 = this.f9761c;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.f9766h;
            } else {
                if (i2 == 7) {
                    i = this.f9767i;
                }
                if (b > 0 && min > 0 && this.f9759a == null && this.f9760b == null) {
                    byte[] bArr = new byte[min];
                    aVar.mo10989d((long) b);
                    aVar.readFully(bArr);
                    return;
                }
                return;
            }
            b += i;
            if (b > 0) {
            }
        }
    }

    /* renamed from: a */
    private void m14122a(InputStream inputStream) {
        int i = 0;
        while (i < f9737F.length) {
            try {
                this.f9762d[i] = new HashMap<>();
                i++;
            } catch (IOException unused) {
            } catch (Throwable th) {
                m14116a();
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f9761c = m14115a(bufferedInputStream);
        C3443a aVar = new C3443a((InputStream) bufferedInputStream);
        switch (this.f9761c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                m14134c(aVar);
                break;
            case 4:
                m14120a(aVar, 0, 0);
                break;
            case 7:
                m14118a(aVar);
                break;
            case 9:
                m14128b(aVar);
                break;
            case 10:
                m14137d(aVar);
                break;
        }
        m14141f(aVar);
        m14116a();
    }

    /* renamed from: a */
    private void m14123a(byte[] bArr, int i) {
        C3443a aVar = new C3443a(bArr);
        m14119a(aVar, bArr.length);
        m14129b(aVar, i);
    }

    /* renamed from: a */
    private boolean m14124a(HashMap hashMap) {
        C3444b bVar = (C3444b) hashMap.get("BitsPerSample");
        if (bVar != null) {
            int[] iArr = (int[]) bVar.mo11010d(this.f9764f);
            if (Arrays.equals(f9745m, iArr)) {
                return true;
            }
            if (this.f9761c == 3) {
                C3444b bVar2 = (C3444b) hashMap.get("PhotometricInterpretation");
                if (bVar2 != null) {
                    int b = bVar2.mo11008b(this.f9764f);
                    if ((b == 1 && Arrays.equals(iArr, f9746n)) || (b == 6 && Arrays.equals(iArr, f9745m))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m14125a(byte[] bArr) {
        int i = 0;
        while (true) {
            byte[] bArr2 = f9747o;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* renamed from: a */
    private static long[] m14126a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }

    /* renamed from: b */
    private C3444b m14127b(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < f9737F.length; i++) {
            C3444b bVar = (C3444b) this.f9762d[i].get(str);
            if (bVar != null) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: b */
    private void m14128b(C3443a aVar) {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m14120a(aVar, i, 5);
        aVar.mo10989d((long) i2);
        aVar.mo10986a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f9732A.f9780a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C3444b a = C3444b.m14148a((int) readShort, this.f9764f);
                C3444b a2 = C3444b.m14148a((int) readShort2, this.f9764f);
                this.f9762d[0].put("ImageLength", a);
                this.f9762d[0].put("ImageWidth", a2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02e6, code lost:
        if (r0.f9762d[5].isEmpty() != false) goto L_0x02d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x026d, code lost:
        if ("Model".equals(r6.f9781b) != false) goto L_0x026f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x027b, code lost:
        if (r5.mo11009c(r0.f9764f).contains("PENTAX") == false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0283, code lost:
        if (r8.equals(r6.f9781b) == false) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x028e, code lost:
        if (r5.mo11008b(r0.f9764f) != 65535) goto L_0x0292;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0290, code lost:
        r0.f9761c = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0299, code lost:
        if (((long) r24.mo10985a()) == r13) goto L_0x029d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01b4  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m14129b(p071f.p118l.p119a.C3442a.C3443a r24, int r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.util.Set<java.lang.Integer> r3 = r0.f9763e
            int r4 = r1.f9776i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f9776i
            int r3 = r3 + 2
            int r4 = r1.f9775h
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r24.readShort()
            int r4 = r1.f9776i
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f9775h
            if (r4 > r5) goto L_0x0305
            if (r3 > 0) goto L_0x002b
            goto L_0x0305
        L_0x002b:
            r5 = 0
        L_0x002c:
            java.lang.String r9 = "ExifInterface"
            if (r5 >= r3) goto L_0x02a6
            int r10 = r24.readUnsignedShort()
            int r11 = r24.readUnsignedShort()
            int r12 = r24.readInt()
            int r13 = r24.mo10985a()
            long r13 = (long) r13
            r15 = 4
            long r13 = r13 + r15
            java.util.HashMap<java.lang.Integer, f.l.a.a$c>[] r17 = f9739H
            r4 = r17[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r8)
            f.l.a.a$c r4 = (p071f.p118l.p119a.C3442a.C3445c) r4
            r8 = 7
            if (r4 != 0) goto L_0x006b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "Skip the tag entry since tag number is not defined: "
            r15.append(r6)
            r15.append(r10)
            java.lang.String r6 = r15.toString()
        L_0x0066:
            android.util.Log.w(r9, r6)
            goto L_0x00de
        L_0x006b:
            if (r11 <= 0) goto L_0x00cc
            int[] r6 = f9752t
            int r6 = r6.length
            if (r11 < r6) goto L_0x0073
            goto L_0x00cc
        L_0x0073:
            boolean r6 = r4.mo11012a(r11)
            if (r6 != 0) goto L_0x0095
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f9751s
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f9781b
            r6.append(r7)
            goto L_0x00d9
        L_0x0095:
            if (r11 != r8) goto L_0x0099
            int r11 = r4.f9782c
        L_0x0099:
            long r6 = (long) r12
            int[] r15 = f9752t
            r15 = r15[r11]
            r16 = r9
            long r8 = (long) r15
            long r6 = r6 * r8
            r8 = 0
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 < 0) goto L_0x00b5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r15 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r15 <= 0) goto L_0x00b1
            goto L_0x00b5
        L_0x00b1:
            r8 = 1
            r9 = r16
            goto L_0x00e1
        L_0x00b5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since the number of components is invalid: "
            r8.append(r9)
            r8.append(r12)
            java.lang.String r8 = r8.toString()
            r9 = r16
            android.util.Log.w(r9, r8)
            goto L_0x00e0
        L_0x00cc:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format is invalid: "
            r6.append(r7)
            r6.append(r11)
        L_0x00d9:
            java.lang.String r6 = r6.toString()
            goto L_0x0066
        L_0x00de:
            r6 = 0
        L_0x00e0:
            r8 = 0
        L_0x00e1:
            if (r8 != 0) goto L_0x00ec
            r1.mo10989d(r13)
            r16 = r3
            r18 = r5
            goto L_0x029d
        L_0x00ec:
            java.lang.String r8 = "Compression"
            r15 = 4
            int r18 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r18 <= 0) goto L_0x0199
            int r15 = r24.readInt()
            r16 = r3
            int r3 = r0.f9761c
            r18 = r5
            r5 = 7
            if (r3 != r5) goto L_0x015c
            java.lang.String r3 = r4.f9781b
            java.lang.String r5 = "MakerNote"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x010e
            r0.f9767i = r15
            goto L_0x0157
        L_0x010e:
            r3 = 6
            if (r2 != r3) goto L_0x0157
            java.lang.String r5 = r4.f9781b
            java.lang.String r3 = "ThumbnailImage"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0157
            r0.f9768j = r15
            r0.f9769k = r12
            java.nio.ByteOrder r3 = r0.f9764f
            r5 = 6
            f.l.a.a$b r3 = p071f.p118l.p119a.C3442a.C3444b.m14148a(r5, r3)
            int r5 = r0.f9768j
            r20 = r11
            r19 = r12
            long r11 = (long) r5
            java.nio.ByteOrder r5 = r0.f9764f
            f.l.a.a$b r5 = p071f.p118l.p119a.C3442a.C3444b.m14149a(r11, r5)
            int r11 = r0.f9769k
            long r11 = (long) r11
            java.nio.ByteOrder r2 = r0.f9764f
            f.l.a.a$b r2 = p071f.p118l.p119a.C3442a.C3444b.m14149a(r11, r2)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r11 = r0.f9762d
            r12 = 4
            r11 = r11[r12]
            r11.put(r8, r3)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r3 = r0.f9762d
            r3 = r3[r12]
            java.lang.String r11 = "JPEGInterchangeFormat"
            r3.put(r11, r5)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r3 = r0.f9762d
            r3 = r3[r12]
            java.lang.String r5 = "JPEGInterchangeFormatLength"
            r3.put(r5, r2)
            goto L_0x0170
        L_0x0157:
            r20 = r11
            r19 = r12
            goto L_0x0170
        L_0x015c:
            r20 = r11
            r19 = r12
            r2 = 10
            if (r3 != r2) goto L_0x0170
            java.lang.String r2 = r4.f9781b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0170
            r0.f9770l = r15
        L_0x0170:
            long r2 = (long) r15
            long r11 = r2 + r6
            int r5 = r1.f9775h
            r21 = r4
            long r4 = (long) r5
            int r22 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r22 > 0) goto L_0x0180
            r1.mo10989d(r2)
            goto L_0x01a3
        L_0x0180:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
        L_0x0191:
            android.util.Log.w(r9, r2)
        L_0x0194:
            r1.mo10989d(r13)
            goto L_0x029d
        L_0x0199:
            r16 = r3
            r21 = r4
            r18 = r5
            r20 = r11
            r19 = r12
        L_0x01a3:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f9742K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r4 = 3
            if (r2 == 0) goto L_0x0235
            r5 = -1
            r11 = r20
            if (r11 == r4) goto L_0x01d9
            r4 = 4
            if (r11 == r4) goto L_0x01d4
            if (r11 == r3) goto L_0x01cf
            r3 = 9
            if (r11 == r3) goto L_0x01ca
            r3 = 13
            if (r11 == r3) goto L_0x01ca
        L_0x01c7:
            r3 = 0
            goto L_0x01df
        L_0x01ca:
            int r3 = r24.readInt()
            goto L_0x01dd
        L_0x01cf:
            short r3 = r24.readShort()
            goto L_0x01dd
        L_0x01d4:
            long r5 = r24.mo10988d()
            goto L_0x01c7
        L_0x01d9:
            int r3 = r24.readUnsignedShort()
        L_0x01dd:
            long r5 = (long) r3
            goto L_0x01c7
        L_0x01df:
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0222
            int r3 = r1.f9775h
            long r3 = (long) r3
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0222
            java.util.Set<java.lang.Integer> r3 = r0.f9763e
            int r4 = (int) r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0202
            r1.mo10989d(r5)
            int r2 = r2.intValue()
            r0.m14129b(r1, r2)
            goto L_0x0194
        L_0x0202:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L_0x0191
        L_0x0222:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            goto L_0x0191
        L_0x0235:
            r11 = r20
            int r2 = (int) r6
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            f.l.a.a$b r5 = new f.l.a.a$b
            r6 = r19
            r5.<init>(r11, r6, r2)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r2 = r0.f9762d
            r2 = r2[r25]
            r6 = r21
            java.lang.String r7 = r6.f9781b
            r2.put(r7, r5)
            java.lang.String r2 = r6.f9781b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x025b
            r0.f9761c = r4
        L_0x025b:
            java.lang.String r2 = r6.f9781b
            java.lang.String r4 = "Make"
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x026f
            java.lang.String r2 = r6.f9781b
            java.lang.String r4 = "Model"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x027d
        L_0x026f:
            java.nio.ByteOrder r2 = r0.f9764f
            java.lang.String r2 = r5.mo11009c(r2)
            java.lang.String r4 = "PENTAX"
            boolean r2 = r2.contains(r4)
            if (r2 != 0) goto L_0x0290
        L_0x027d:
            java.lang.String r2 = r6.f9781b
            boolean r2 = r8.equals(r2)
            if (r2 == 0) goto L_0x0292
            java.nio.ByteOrder r2 = r0.f9764f
            int r2 = r5.mo11008b(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x0292
        L_0x0290:
            r0.f9761c = r3
        L_0x0292:
            int r2 = r24.mo10985a()
            long r2 = (long) r2
            int r4 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r4 == 0) goto L_0x029d
            goto L_0x0194
        L_0x029d:
            int r5 = r18 + 1
            short r5 = (short) r5
            r2 = r25
            r3 = r16
            goto L_0x002c
        L_0x02a6:
            int r2 = r24.mo10985a()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f9775h
            if (r2 > r3) goto L_0x0305
            int r2 = r24.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02f1
            int r5 = r1.f9775h
            if (r2 >= r5) goto L_0x02f1
            java.util.Set<java.lang.Integer> r5 = r0.f9763e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02e9
            r1.mo10989d(r3)
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r2 = r0.f9762d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02dd
        L_0x02d9:
            r0.m14129b(r1, r3)
            goto L_0x0305
        L_0x02dd:
            java.util.HashMap<java.lang.String, f.l.a.a$b>[] r2 = r0.f9762d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0305
            goto L_0x02d9
        L_0x02e9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            goto L_0x02f8
        L_0x02f1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
        L_0x02f8:
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r9, r1)
        L_0x0305:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p071f.p118l.p119a.C3442a.m14129b(f.l.a.a$a, int):void");
    }

    /* renamed from: b */
    private void m14130b(C3443a aVar, HashMap hashMap) {
        String str;
        C3444b bVar = (C3444b) hashMap.get("StripOffsets");
        C3444b bVar2 = (C3444b) hashMap.get("StripByteCounts");
        if (!(bVar == null || bVar2 == null)) {
            long[] a = m14126a(bVar.mo11010d(this.f9764f));
            long[] a2 = m14126a(bVar2.mo11010d(this.f9764f));
            String str2 = "ExifInterface";
            if (a == null) {
                str = "stripOffsets should not be null.";
            } else if (a2 == null) {
                str = "stripByteCounts should not be null.";
            } else {
                long j = 0;
                for (long j2 : a2) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a.length; i3++) {
                    int i4 = (int) a2[i3];
                    int i5 = ((int) a[i3]) - i;
                    if (i5 < 0) {
                        Log.d(str2, "Invalid strip offset value");
                    }
                    aVar.mo10989d((long) i5);
                    int i6 = i + i5;
                    byte[] bArr2 = new byte[i4];
                    aVar.read(bArr2);
                    i = i6 + i4;
                    System.arraycopy(bArr2, 0, bArr, i2, i4);
                    i2 += i4;
                }
            }
            Log.w(str2, str);
        }
    }

    /* renamed from: b */
    private void m14131b(InputStream inputStream) {
        m14117a(0, 5);
        m14117a(0, 4);
        m14117a(5, 4);
        C3444b bVar = (C3444b) this.f9762d[1].get("PixelXDimension");
        C3444b bVar2 = (C3444b) this.f9762d[1].get("PixelYDimension");
        if (!(bVar == null || bVar2 == null)) {
            this.f9762d[0].put("ImageWidth", bVar);
            this.f9762d[0].put("ImageLength", bVar2);
        }
        if (this.f9762d[4].isEmpty() && m14132b((HashMap) this.f9762d[5])) {
            HashMap<String, C3444b>[] hashMapArr = this.f9762d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!m14132b((HashMap) this.f9762d[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
    }

    /* renamed from: b */
    private boolean m14132b(HashMap hashMap) {
        C3444b bVar = (C3444b) hashMap.get("ImageLength");
        C3444b bVar2 = (C3444b) hashMap.get("ImageWidth");
        if (!(bVar == null || bVar2 == null)) {
            int b = bVar.mo11008b(this.f9764f);
            int b2 = bVar2.mo11008b(this.f9764f);
            if (b <= 512 && b2 <= 512) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private boolean m14133b(byte[] bArr) {
        C3443a aVar = new C3443a(bArr);
        ByteOrder e = m14140e(aVar);
        this.f9764f = e;
        aVar.mo10986a(e);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: c */
    private void m14134c(C3443a aVar) {
        m14119a(aVar, aVar.available());
        m14129b(aVar, 0);
        m14138d(aVar, 0);
        m14138d(aVar, 5);
        m14138d(aVar, 4);
        m14131b((InputStream) aVar);
        if (this.f9761c == 8) {
            C3444b bVar = (C3444b) this.f9762d[1].get("MakerNote");
            if (bVar != null) {
                C3443a aVar2 = new C3443a(bVar.f9779c);
                aVar2.mo10986a(this.f9764f);
                aVar2.mo10989d(6);
                m14129b(aVar2, 9);
                String str = "ColorSpace";
                C3444b bVar2 = (C3444b) this.f9762d[9].get(str);
                if (bVar2 != null) {
                    this.f9762d[1].put(str, bVar2);
                }
            }
        }
    }

    /* renamed from: c */
    private void m14135c(C3443a aVar, int i) {
        C3444b bVar = (C3444b) this.f9762d[i].get("ImageWidth");
        if (((C3444b) this.f9762d[i].get("ImageLength")) == null || bVar == null) {
            C3444b bVar2 = (C3444b) this.f9762d[i].get("JPEGInterchangeFormat");
            if (bVar2 != null) {
                m14120a(aVar, bVar2.mo11008b(this.f9764f), i);
            }
        }
    }

    /* renamed from: c */
    private boolean m14136c(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private void m14137d(C3443a aVar) {
        m14134c(aVar);
        if (((C3444b) this.f9762d[0].get("JpgFromRaw")) != null) {
            m14120a(aVar, this.f9770l, 5);
        }
        C3444b bVar = (C3444b) this.f9762d[0].get("ISO");
        String str = "PhotographicSensitivity";
        C3444b bVar2 = (C3444b) this.f9762d[1].get(str);
        if (bVar != null && bVar2 == null) {
            this.f9762d[1].put(str, bVar);
        }
    }

    /* renamed from: d */
    private void m14138d(C3443a aVar, int i) {
        C3444b bVar;
        C3444b bVar2;
        StringBuilder sb;
        String arrays;
        C3444b bVar3 = (C3444b) this.f9762d[i].get("DefaultCropSize");
        C3444b bVar4 = (C3444b) this.f9762d[i].get("SensorTopBorder");
        C3444b bVar5 = (C3444b) this.f9762d[i].get("SensorLeftBorder");
        C3444b bVar6 = (C3444b) this.f9762d[i].get("SensorBottomBorder");
        C3444b bVar7 = (C3444b) this.f9762d[i].get("SensorRightBorder");
        String str = "ImageLength";
        String str2 = "ImageWidth";
        if (bVar3 != null) {
            String str3 = "Invalid crop size values. cropSize=";
            String str4 = "ExifInterface";
            if (bVar3.f9777a == 5) {
                C3446d[] dVarArr = (C3446d[]) bVar3.mo11010d(this.f9764f);
                if (dVarArr == null || dVarArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    arrays = Arrays.toString(dVarArr);
                } else {
                    bVar2 = C3444b.m14150a(dVarArr[0], this.f9764f);
                    bVar = C3444b.m14150a(dVarArr[1], this.f9764f);
                    this.f9762d[i].put(str2, bVar2);
                    this.f9762d[i].put(str, bVar);
                }
            } else {
                int[] iArr = (int[]) bVar3.mo11010d(this.f9764f);
                if (iArr == null || iArr.length != 2) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    arrays = Arrays.toString(iArr);
                } else {
                    bVar2 = C3444b.m14148a(iArr[0], this.f9764f);
                    bVar = C3444b.m14148a(iArr[1], this.f9764f);
                    this.f9762d[i].put(str2, bVar2);
                    this.f9762d[i].put(str, bVar);
                }
            }
            sb.append(arrays);
            Log.w(str4, sb.toString());
        } else if (bVar4 == null || bVar5 == null || bVar6 == null || bVar7 == null) {
            m14135c(aVar, i);
        } else {
            int b = bVar4.mo11008b(this.f9764f);
            int b2 = bVar6.mo11008b(this.f9764f);
            int b3 = bVar7.mo11008b(this.f9764f);
            int b4 = bVar5.mo11008b(this.f9764f);
            if (b2 > b && b3 > b4) {
                int i2 = b3 - b4;
                C3444b a = C3444b.m14148a(b2 - b, this.f9764f);
                C3444b a2 = C3444b.m14148a(i2, this.f9764f);
                this.f9762d[i].put(str, a);
                this.f9762d[i].put(str2, a2);
            }
        }
    }

    /* renamed from: d */
    private boolean m14139d(byte[] bArr) {
        C3443a aVar = new C3443a(bArr);
        ByteOrder e = m14140e(aVar);
        this.f9764f = e;
        aVar.mo10986a(e);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: e */
    private ByteOrder m14140e(C3443a aVar) {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(readShort));
        throw new IOException(sb.toString());
    }

    /* renamed from: f */
    private void m14141f(C3443a aVar) {
        HashMap<String, C3444b> hashMap = this.f9762d[4];
        C3444b bVar = (C3444b) hashMap.get("Compression");
        if (bVar != null) {
            int b = bVar.mo11008b(this.f9764f);
            this.f9765g = b;
            if (b != 1) {
                if (b != 6) {
                    if (b != 7) {
                        return;
                    }
                }
            }
            if (m14124a((HashMap) hashMap)) {
                m14130b(aVar, (HashMap) hashMap);
                return;
            }
            return;
        }
        this.f9765g = 6;
        m14121a(aVar, (HashMap) hashMap);
    }

    /* renamed from: a */
    public int mo10983a(String str, int i) {
        C3444b b = m14127b(str);
        if (b == null) {
            return i;
        }
        try {
            return b.mo11008b(this.f9764f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public String mo10984a(String str) {
        String sb;
        C3444b b = m14127b(str);
        if (b != null) {
            if (!f9741J.contains(str)) {
                return b.mo11009c(this.f9764f);
            }
            if (str.equals("GPSTimeStamp")) {
                int i = b.f9777a;
                String str2 = "ExifInterface";
                if (i == 5 || i == 10) {
                    C3446d[] dVarArr = (C3446d[]) b.mo11010d(this.f9764f);
                    if (dVarArr == null || dVarArr.length != 3) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid GPS Timestamp array. array=");
                        sb2.append(Arrays.toString(dVarArr));
                        sb = sb2.toString();
                    } else {
                        return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) dVarArr[0].f9784a) / ((float) dVarArr[0].f9785b))), Integer.valueOf((int) (((float) dVarArr[1].f9784a) / ((float) dVarArr[1].f9785b))), Integer.valueOf((int) (((float) dVarArr[2].f9784a) / ((float) dVarArr[2].f9785b)))});
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("GPS Timestamp format is not rational. format=");
                    sb3.append(b.f9777a);
                    sb = sb3.toString();
                }
                Log.w(str2, sb);
                return null;
            }
            try {
                return Double.toString(b.mo11007a(this.f9764f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }
}
