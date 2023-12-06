package adventofcode.days;

import java.io.File;
import java.io.IOException;
import java.util.List;

import static adventofcode.utils.IOUtils.fileContentAsString;

public abstract class Challenge {
    private String challengeId;
    private final String challengeInputFilePath;

    public Challenge(String challengeId, String challengeInputFilePath) {
        this.challengeId = challengeId;
        this.challengeInputFilePath = challengeInputFilePath;
    }

    public abstract void run() throws IOException;

    public List<String> getChallengeInput() throws IOException {
        return fileContentAsString(challengeInputFilePath);
    }
}
