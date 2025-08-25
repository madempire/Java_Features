public class Java14Features {
    
    public static void main(String[] args) {
        DayOfWeek day = DayOfWeek.MONDAY;
        String result = switch(day){
            case MONDAY, FRIDAY -> "Weekend is near!";
            default -> "This is Weekend ";
        };
        System.out.println(result);
    }
}
