public class Java22_Features {
    public static void main(String[] args) {
        Object obj = "hello";
        switch(obj){
            case String _ -> System.out.println("String");
            case Integer _ -> System.out.println("Integer");
            default -> System.out.println("Unknown type.");
        }
    }

}
