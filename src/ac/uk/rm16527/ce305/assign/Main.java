package ac.uk.rm16527.ce305.assign;

import ac.uk.rm16527.ce305.assign.generated.CompilerLexer;
import ac.uk.rm16527.ce305.assign.generated.CompilerParser;
import ac.uk.rm16527.ce305.assign.intermediate.PythonGenerator;
import ac.uk.rm16527.ce305.assign.visitors.CompilerVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.util.Scanner;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    private static final String DIR = "input/";

    /**
     * Simple loop for testing the visitor
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Welcome! Please enter a file name to an input file (must be in the project input directory) or press enter to use the default code.txt file: ");
            String file = in.nextLine();
            try {
                CharStream cs = fromFileName(DIR + (file.trim().isEmpty() ? "code.txt" : file));  //read the input file

                System.out.print("Please enter a command. ('change' to change file'; 'quit' to stop the program; 'pretty' for pretty print; 'eval' to evaluate): ");
                String command = in.nextLine().toLowerCase();
                if (command.startsWith("c")) continue; //Restart loop
                if (command.startsWith("q")) break; //Stop the program

                CompilerLexer lexer = new CompilerLexer(cs);  //create a lexer object
                CommonTokenStream tokens = new CommonTokenStream(lexer); //scan stream for tokens
                CompilerParser parser = new CompilerParser(tokens);
                System.out.println();//In place for my environment as my home environment has a library version issue i was unable to resolve.

                //P loads pretty printer, anything else loads evaluator
                PythonGenerator out = new CompilerVisitor().visit(parser.start());
                if(out != null) System.out.println(out.generatePython());
            } catch (IOException e) {
                System.out.println("Failed to load file '"+file+"'. Please try again.");
            }
        }
    }
}
