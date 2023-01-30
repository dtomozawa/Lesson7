package javaapis.datetime;

import java.time.LocalDateTime;

public class DateSample01 {

    public static void main(String[] args) {

        // 現在日時の取得と表示
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);

        // 現在の日時から一週間後を表示する
        LocalDateTime nextWeek = dateTime.plusWeeks(1);
        System.out.println(nextWeek);

    }
}