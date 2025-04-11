import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Career {
    public static void main(String[] args) throws IOException {
        Path file1 = Paths.get("career.txt");
        List<String> myCareer = List.of(
                "Ivan Ivanov",
                "02.06.1990",
                "2015-2019 my first job",
                "2019-2021 my second job",
                "2021-2022 my third job",
                "2022-2025 my current job"
        );

        Files.write(file1, myCareer, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
        List<String> lines = Files.readAllLines(file1, StandardCharsets.UTF_8);

        int numberOfLines = lines.size();
        String longestLine = lines.stream().max((s1, s2) -> s1.length() - s2.length()).orElse("");
        String name = lines.get(0);
        String birthday = lines.get(1);

        Path file2 = Paths.get("career2.txt");
        List<String> output = List.of(
                "Numbers of lines = " + numberOfLines,
                "Longest line = " + longestLine,
                "name = " + name,
                "birthday = " + birthday
        );

        Files.write(file2, output, StandardCharsets.UTF_8, StandardOpenOption.CREATE);
    }
}
