package MiniAnswer.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        // 현재 날짜와 시간 가져오기
        LocalDateTime now = LocalDateTime.now();
        System.out.println("현재 날짜와 시간: " + now);

        // 특정 날짜와 시간 생성
        LocalDateTime specificDateTime = LocalDateTime.of(2023, 9, 4, 15, 30);
        System.out.println("지정된 날짜와 시간: " + specificDateTime);

        // 날짜와 시간 포맷팅
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("포맷된 현재 날짜와 시간: " + formattedDateTime);
    }
}

