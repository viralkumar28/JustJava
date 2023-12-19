import java.io.*;


class Result {

    /*
     * Complete the 'getPhoneNumber' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String getPhoneNumber(String s) {
        // Write your code here
        String[] words = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            String number = convertWordToNumber(word.toLowerCase());
            if (number != null) {
                stringBuilder.append(number);
            }
        }
        return stringBuilder.toString();
    }
    public static String convertWordToNumber(String words){
        switch (words) {
            case "zero":
                return "0";
            case "one":
                return "1";
            case "two":
                return "2";
            case "three":
                return "3";
            case "four":
                return "4";
            case "five":
                return "5";
            case "six":
                return "6";
            case "seven":
                return "7";
            case "eight":
                return "8";
            case "nine":
                return "9";
            default:
                return null;
        }
    }
}
public class StringtoNumberConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.getPhoneNumber(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
