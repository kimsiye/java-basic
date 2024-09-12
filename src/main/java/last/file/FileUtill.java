package last.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtill {
    public void save(String content, String fileName ){

        Path filePath = Paths.get(fileName);

        try {
            Files.write(filePath, content.getBytes());
            System.out.println("파일 작성 완료: " + filePath.toAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //C:\Users\admin\IdeaProjects\java-basic\test.txt
    }

    public String load (String fileName){
        Path path = Paths.get(fileName);

        try {
            List<String> lines = Files.readAllLines(path);
            for (String line : lines) {
                return line;
            }
        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류가 발생했습니다: " + e.getMessage());
        }

        return null;
    }
}
