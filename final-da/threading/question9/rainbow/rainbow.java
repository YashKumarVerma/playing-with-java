package rainbow;

public class rainbow {
    /** global declarations */

    private static final String RESET = "\u001B[0m";

    /** color declarations */
    private static final String COLOR_BLACK = "\u001B[30m";
    private static final String COLOR_RED = "\u001B[31m";
    private static final String COLOR_GREEN = "\u001B[32m";
    private static final String COLOR_YELLOW = "\u001B[33m";
    private static final String COLOR_BLUE = "\u001B[34m";
    private static final String COLOR_PURPLE = "\u001B[35m";
    private static final String COLOR_CYAN = "\u001B[36m";
    private static final String COLOR_WHITE = "\u001B[37m";

    /** formatting declarations */
    private static final String BOLD = "\u001B[1m";
    private static final String DIM = "\u001B[2m";
    private static final String ITALIC = "\u001B[3m";
    private static final String UNDERLINE = "\u001B[4m";
    private static final String BLINK = "\u001B[5m";
    private static final String LIGHTEN = "\u001B[6m";
    private static final String INVERTED = "\u001B[7m";
    private static final String HIDDEN = "\u001B[8m";

    /** public user consumable functions */

    public static String bold(String string) {
        return BOLD + string + RESET;
    }

    public static String dim(String string) {
        return DIM + string + RESET;
    }

    public static String italic(String string) {
        return ITALIC + string + RESET;
    }

    public static String underline(String string) {
        return UNDERLINE + string + RESET;
    }

    public static String blink(String string) {
        return BLINK + string + RESET;
    }

    public static String lighten(String string) {
        return LIGHTEN + string + RESET;
    }

    public static String inverted(String string) {
        return INVERTED + string + RESET;
    }

    public static String hidden(String string) {
        return HIDDEN + string + RESET;
    }

    public static String black(String string) {
        return COLOR_BLACK + string + RESET;
    }

    public static String red(String string) {
        return COLOR_RED + string + RESET;
    }

    public static String green(String string) {
        return COLOR_GREEN + string + RESET;
    }

    public static String yellow(String string) {
        return COLOR_YELLOW + string + RESET;
    }

    public static String blue(String string) {
        return COLOR_BLUE + string + RESET;
    }

    public static String purple(String string) {
        return COLOR_PURPLE + string + RESET;
    }

    public static String cyan(String string) {
        return COLOR_CYAN + string + RESET;
    }

    public static String white(String string) {
        return COLOR_WHITE + string + RESET;
    }

    public static String rainbow(String string) {
        String res = "";
        String[] rainbow_Colors = new String[] { COLOR_RED, COLOR_YELLOW, COLOR_GREEN, COLOR_CYAN, COLOR_BLUE,
                COLOR_PURPLE };
        char[] cont = string.toCharArray();
        for (int i = 0; i < string.length(); i++) {
            int color = i % rainbow_Colors.length;
            res += rainbow_Colors[color] + cont[i];
        }
        return res;
    }
}