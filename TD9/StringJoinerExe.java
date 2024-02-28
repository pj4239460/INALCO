import java.util.StringJoiner;

public class StringJoinerExe {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String select = buildSelectSql(table, fields);
        System.out.println(select);
        System.out.println("SELECT name, position, salary FROM employee".equals(select) ? "Test réussi" : "Test échoué");
    }

    static String buildSelectSql(String table, String[] fields) {
        StringJoiner sj = new StringJoiner(", ");
        for (String field : fields) {
            sj.add(field);
        }
        return "SELECT " + sj.toString() + " FROM " + table;
    }
}