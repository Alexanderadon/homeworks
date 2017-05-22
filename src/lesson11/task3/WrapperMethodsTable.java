package lesson11.task3;

public class WrapperMethodsTable {
    public static void printWrapperMethodsTable() {
        System.out.print(getTableHeader());
        System.out.print(getTableBody());
    }

    private static String getTableHeader() {
        return "|                         | Boolean  |   Byte   | Character|  Double  |" +
                "  Float   | Integer  |   Long   |  Short   | isStatic?|\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n";
    }

    private static String getTableBody() {
        return "|byteValue                |    o     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|doubleValue              |    o     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|floatValue               |    o     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|intValue                 |    o     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|longValue                |    o     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|shortValue               |    o     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|parseXxx                 |    x     |     x    |     o    |     x    |" +
                "     x    |     x    |     x    |     x    |   true   |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|parseXxx with radix      |    o     |     x    |     o    |     o    |" +
                "     o    |     x    |     x    |     x    |   true   |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|valueOf with radix       |    o     |     x    |     o    |     o    |" +
                "     o    |     x    |     x    |     x    |   true   |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|toString                 |    x     |     x    |     x    |     x    |" +
                "     x    |     x    |     x    |     x    |   false  |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|toString(primitive)      |    x     |     x    |     x    |     x    |" +
                "     x    |     x    |     x    |     x    |   true   |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n" +
                "|toString(primitive,radix)|    o     |     o    |     o    |     o    |" +
                "     o    |     x    |     x    |     x    |   true   |\n" +
                "|-------------------------+----------+----------+----------+----------+" +
                "----------+----------+----------+----------+----------|\n";
    }
}