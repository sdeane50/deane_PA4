public class Application {
    public static void main(String[] args) {
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        try {
            duplicateCounter.count();
        } catch (Exception excpt) {

            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }
        try {
            duplicateCounter.write();
        } catch (Exception excpt) {

            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }

    }
}