public class Java15Features {
    public static void main(String[] args) {
        // 1. simplifies working with multi-line strings.
        String json = """
                {
                    "name":"king",
                    "age":30
                }
                """;
                System.out.println(json);
    }
}
