package ch03;

public class TestBlockTest {
    public static void main(String[] args) {
        String textBlocks = """
                Hello,
                hi,
                how are you""";
        System.out.println(textBlocks);
        System.out.println(getBlockOfHtml());
    }

    public static String getBlockOfHtml() {
        return """
                 <html>
                    <body>
                        <p>
                        TextBlock P tag
                        </p>
                    </body>
                 </html>
                """;
    }
}
