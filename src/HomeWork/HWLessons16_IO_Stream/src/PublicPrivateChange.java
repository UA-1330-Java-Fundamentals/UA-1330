import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.stream.Collectors;

public class PublicPrivateChange {
    public static void main(String[] args) {
        Path inputPath = Paths.get("DigitSumCalculator2.txt");
        Path outputPath = Paths.get("DigitSumCalculatorNew.txt");

        try {
            List<String> lines = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            List<String> modifiedLines = lines.stream()
                    .map(line -> {
                        String trimmed = line.trim();
                        if (trimmed.startsWith("public") && !trimmed.contains("class")) {
                            return line.replaceFirst("public", "private");
                        } else {
                            return line;
                        }
                    })
                    .collect(Collectors.toList());
            Files.write(outputPath, modifiedLines, StandardCharsets.UTF_8, StandardOpenOption.CREATE);

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}

