import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;

public class Run {

    public Run() {
    }

    public static String run(String str, boolean file) throws IOException {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\LexikalischeFilter\\src\\main\\java\\Ip.stg");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (file) input = CharStreams.fromFileName(str);
        else input = CharStreams.fromString(str);

        Halstead lex = new Halstead(input);
        Token t=null;
        String ret = "";

        do {
            t = lex.nextToken();
            if(t.getType() == Halstead.IGNORE) {
                ret = ret + t.getText();
                System.out.println(t.getText() + " " + t.getLine());
            }
            if(t.getType() == Halstead.OPERATOR) {
                ret = ret + t.getText();
                System.out.println(t.getText() + " " + t.getLine());
            }
        } while ( t.getType()!=Token.EOF );
        return ret;//  ret.length() > 0 ? ret.substring(0,ret.length()-1) : ret;
    }

    public static void main(String[] args) throws IOException {
        String s = run("G:\\InfProjekte\\Halstead\\src\\main\\java\\input.txt", true);
       // System.err.print(s);
    }

}
