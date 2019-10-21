import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        final String FILE = "G:\\InfProjekte\\Halstead\\src\\main\\quelldateien\\eval1.c";

        STGroup templates = new STGroupFile("G:\\InfProjekte\\Halstead\\src\\main\\java\\halstead.stg");
        RunLexer r = new RunLexer();
        r.start(FILE);
        ST st = templates.getInstanceOf("listall");
        st.add("operatoren", r.operatorStr);
        st.add("operanden", r.operandStr);

        System.out.println(st.render());
        System.out.println(r.parameter().render());
        System.out.println(r.metriken().render());

    }

}
