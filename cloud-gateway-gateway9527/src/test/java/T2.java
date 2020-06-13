import java.time.ZonedDateTime;

public class T2 {
    public static void main(String[] args) {
        ZonedDateTime zbj =ZonedDateTime.now();//默认时区
        System.out.println(zbj);
        //2020-03-16T21:53:26.260+08:00[Asia/Shanghai]
    }
}
