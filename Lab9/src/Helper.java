public class Helper {

    public static void PrintSymbols(final String line) {
        StringBuilder str = new StringBuilder();
        for (char symbol : line.toCharArray()) {
            str.append(symbol + "\t");
        }
        System.out.println(str.toString());
    }

    public static void PrintSymbolNumbers(final String line) {
        StringBuffer str = new StringBuffer("");
        for(char ch : line.toCharArray()){
            if(Character.isAlphabetic(ch))
                str.append(String.format("%-3s", ch));
        }
        System.out.println(str.toString());
    }
}