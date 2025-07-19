//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Main con main");

        String userHome = System.getProperty("user.home");
        String url = "jdbc:h2:" + userHome + "\\AccesoBD";
        System.out.println(url);

        String url2 = "jdbc:h2:D:\\Codigo\\java-dh\\09-acceso-db\\AccesoBD";
        System.out.println(url2);
    }
}