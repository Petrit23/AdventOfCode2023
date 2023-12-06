package adventofcode.days.day1;

import adventofcode.days.Challenge;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static adventofcode.utils.LoggerUtil.LOGGER;
import static java.util.stream.Collectors.toList;

public class ChallengeOne extends Challenge {

    public ChallengeOne() {
        super("1.0", "./data/1_0.txt");
    }

    @Override
    public void run() throws IOException {
        LOGGER.info(Objects.toString(combineFirstAndLastDigit()));
    }

    private int combineFirstAndLastDigit() throws IOException {
        List<String> input = getChallengeInput();
        List<Integer> combinedDigits = new ArrayList<>();
        input.stream().forEach(line -> {
            List<Integer> digits =  line.chars().filter(Character::isDigit).mapToObj(Character::getNumericValue).collect(toList());
            int firstDigit = digits.get(0);
            int lastDigit = digits.get(digits.size() -1);

            combinedDigits.add(Integer.parseInt(String.valueOf(firstDigit) + String.valueOf(lastDigit)));

        });

        return combinedDigits.stream().mapToInt(Integer::intValue).sum();
    }
}
