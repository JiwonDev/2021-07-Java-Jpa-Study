package Hello;

public class Hello {
    public static void main(String[] args) {
        // 2020년 java14부터 지원하는 기능이라 아직 잘 쓰이지는 않는다.
        String monthString = "1월";
        monthString = switch (monthString) {
            case "1월" -> "January";
            case "2월" -> "February";
            case "3월" -> "March";
            case "4월","5월" -> "4,5월";
            default -> "May";
        };

        // 열거형을 사용하면 default 없이 switch문을 안전하게 사용 할 수 있다.
        enum Month { January, February, March, April }
        Month value = Month.January;
        monthString = switch (value) {
            case January -> "January";
            case February -> "February";
            case March -> "March";
            case April -> "4,5월";
        };


        System.out.println(monthString);
    }
}