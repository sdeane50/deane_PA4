public class Application {
    public static void main(String[] args) {
        DuplicateRemover duplicateRemover = new DuplicateRemover();

        try {
            duplicateRemover.remove();
        } catch (Exception excpt) {

            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }
        try {
            duplicateRemover.write();
        } catch (Exception excpt) {

            System.out.println(excpt.getMessage());
            System.out.println("Cannot read file");
        }

    }
}
