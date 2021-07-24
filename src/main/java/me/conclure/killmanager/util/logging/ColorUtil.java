package me.conclure.killmanager.util.logging;

public enum ColorUtil {
    ;
    private static final String COLOR_CODES = "0123456789AaBbCcDdEeFfKkLlMmNnOoRr";

    public static String format(String line) {
        char[] b = line.toCharArray();

        for(int i = 0; i < b.length - 1; ++i) {
            if (b[i] == '&' && COLOR_CODES.indexOf(b[i + 1]) > -1) {
                b[i] = 167;
                b[i + 1] = Character.toLowerCase(b[i + 1]);
            }
        }

        return new String(b);
    }
}
