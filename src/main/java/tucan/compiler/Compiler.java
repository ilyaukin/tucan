package tucan.compiler;

/*
 * Compiler runnable. This is invoked by `tucanc` command.
 */
public class Compiler {
    public String getHelpMessage() {
        return "Powerful compiler is coming! " +
                "Bring pop corn and wait.";
    }

    public static void main(String[] args) {
        System.out.println(new Compiler().getHelpMessage());
    }
}
