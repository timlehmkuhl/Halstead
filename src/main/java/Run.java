import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Run {

    public Run() {
    }

    public static String run(String str, boolean file) throws IOException {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\Halstead\\src\\main\\java\\halstead.stg");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (file) input = CharStreams.fromFileName(str);
        else input = CharStreams.fromString(str);

        Halstead lex = new Halstead(input);
        Token t=null;
        String ret = "";
        Map<String, Integer> map = new HashMap<>();
        String mapstr = "";
        //ST st = templates.getInstanceOf("halstead");
        int v = 0;

        do {
            t = lex.nextToken();

            v = map.get(t.getText()) != null ? map.get(t.getText()) : 0;
            map.put(t.getText(), v+1);
          //  ST st = templates.getInstanceOf("halstead");
            if(t.getType() == Halstead.IGNORE) {
              //  ret = ret + t.getText();
               // st.add("zeichen", t.getText());
                //st.add("anzahl", "0");


                //System.out.println(t.getText() + " " + t.getLine());
            }
            if(t.getType() == Halstead.OPERATOR) {
             //   ret = ret + t.getText();
              //  st.add("zeichen", t.getText());
              //  st.add("anzahl", "0");

               // System.out.println(t.getText() + " " + t.getLine());
            }

        } while ( t.getType()!=Token.EOF );

      /*  mapstr = map.keySet().stream()
                .map(key -> key + "=" + map.get(key))
                .collect(Collectors.joining(", ", "{", "}"));*/

          for(Map.Entry<String, Integer>  e: map.entrySet()){
               ST st = templates.getInstanceOf("halstead");
                st.add("zeichen", e.getKey());
                st.add("anzahl", e.getValue());
                ret +=  st.render() + "\n";
               // System.out.println(st.render());
               //  System.out.println(e.getKey() + " " + e.getValue());

            }
        System.out.println(ret);
        return ret;//  ret.length() > 0 ? ret.substring(0,ret.length()-1) : ret;
    }

    public static void main(String[] args) throws IOException {
        String s = run("G:\\InfProjekte\\Halstead\\src\\main\\java\\input.txt", true);
       // System.err.print(s);
    }

}
