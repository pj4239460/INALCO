public class StringBuilderExe {
    public static void main(String[] args) {
        String[] fields = { "name", "position", "salary" };
        String table = "employee";
        String insert = buildInsertSql(table, fields);
        System.out.println(insert);
        String s = "INSERT INTO employee (name, position, salary) VALUES (?, ?, ?)";
        System.out.println(s.equals(insert) ? "Test réussi" : "Test échoué");
    }

    static String buildInsertSql(String table, String[] fields) {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ").append(table).append(" (");

        for (int i = 0; i < fields.length; i ++) {
            sb.append(fields[i]);
            if (i < fields.length -1) {
                sb.append(", ");
            }
        }

        sb.append(") VALUES (");

        for (int i = 0; i < fields.length; i ++) {
            sb.append("?");
            if (i < fields.length -1) {
                sb.append(", ");
            }
        }

        sb.append(")");

        return sb.toString();
    }

}