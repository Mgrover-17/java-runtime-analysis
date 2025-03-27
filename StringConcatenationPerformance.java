public class StringConcatenationPerformance {

    public static void main(String[] args) {
        int size = 1_000_000;
        String text = "a";

        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < size; i++) {
            str += text;
        }
        long stringTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(text);
        }
        long stringBuilderTime = System.nanoTime() - startTime;

        startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < size; i++) {
            stringBuffer.append(text);
        }
        long stringBufferTime = System.nanoTime() - startTime;

        System.out.println("String Concatenation Performance:");
        System.out.println("Using String: " + (stringTime / 1_000_000.0) + " ms");
        System.out.println("Using StringBuilder: " + (stringBuilderTime / 1_000_000.0) + " ms");
        System.out.println("Using StringBuffer: " + (stringBufferTime / 1_000_000.0) + " ms");
    }
}
