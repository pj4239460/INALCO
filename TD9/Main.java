public class Main {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        s = s.toUpperCase();
        System.out.println(s);

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        String s3 = "hello";
        String s4 = "HELLO".toLowerCase();
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String s5 = "Hi %s, your score is %d!";
        System.out.println(s5.formatted("Alice", 80));
        System.out.println(String.format("Hi %s, your score is %.2f!", "Bob", 59.5));

        System.out.println(String.valueOf(123));
        System.out.println(String.valueOf(45.67));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(new Object()));

        // StringBuilder sb = new StringBuilder(1024);
        // // 1024 indique une capacité initiale de 1024 caractères, pas la longueur finale de la chaîne. 
        // // Cela signifie que le StringBuilder peut contenir initialement jusqu'à 1024 caractères avant de   
        // // devoir étendre son espace de stockage.
        // for (int i = 0; i < 1000; i++) {
        //     sb.append(',');
        //     sb.append(i);
        // }
        // String s6 = sb.toString();
        // System.out.println(s6);

        var sb1 = new StringBuilder(1024);
        sb1.append("Mr ")
          .append("Bob")
          .append("!")
          .insert(0, "Hello, ");
        System.out.println(sb1.toString());


    }
}