import java.util.ArrayList;

public class AverageCalculator {
    public static double calculateAverage(String data) {
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] input = data.split(" ");

        int total = 0;
        for (String character : input) {
            numbers.add(Integer.parseInt(character));
            total += Integer.parseInt(character);
        }

        return (double) total / numbers.size();
    }
}