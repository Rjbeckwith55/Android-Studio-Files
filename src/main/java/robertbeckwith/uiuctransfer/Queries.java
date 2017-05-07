package robertbeckwith.uiuctransfer;

/**
 * Created by rjbec on 5/6/2017.
 */

public class Queries {
    public static String selectAll = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20%2A&key=1jJLek-Y_6n9JoBqEBNj88WaE_WBbgwrAdgvqharpnvI";
    public static String selectAllSS = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20A%2C%20B%2C%20C%2C%20D%2C%20E%20%26%20%27%27%20as%20E%2C%20F%20%26%20%27%27%20as%20F%2C%20G%20%26%20%27%27%20as%20G%2C%20H%20%26%20%27%27%20as%20H%20where%20G%20contains%20%27SS%27&key=1jJLek-Y_6n9JoBqEBNj88WaE_WBbgwrAdgvqharpnvI";
    public static String selectAllHum = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20*%20where%20G%20contains%20%27LA%27&key=1jJLek-Y_6n9JoBqEBNj88WaE_WBbgwrAdgvqharpnvI";
    public static String selectAllWCC = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20*%20where%20H%20contains%20%27WCC%27&key=1jJLek-Y_6n9JoBqEBNj88WaE_WBbgwrAdgvqharpnvI";
    public static String selectAllUS = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20*%20where%20H%20contains%20%27US%27&key=1jJLek-Y_6n9JoBqEBNj88WaE_WBbgwrAdgvqharpnvI";
    public static String selectAllNW = "https://spreadsheets.google.com/tq?tqx=out:JSON&tq=select%20*%20where%20H%20contains%20%27NW%27&key=1jJLek-Y_6n9JoBqEBNj88WaE_WBbgwrAdgvqharpnvI";
}
