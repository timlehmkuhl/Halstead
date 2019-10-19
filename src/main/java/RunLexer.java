import org.antlr.v4.runtime.*;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class RunLexer {

      String operandStr = "";
     String operatorStr = "";
     String ignoreStr = "";

    public RunLexer() {
    }

    public  String run(String str, boolean file) throws IOException {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\Halstead\\src\\main\\java\\halstead.stg");
        CharStream input = null;
        // Pick an input stream (filename from commandline or stdin)
        if (file) input = CharStreams.fromFileName(str);
        else input = CharStreams.fromString(str);

        Halstead lex = new Halstead(input);
        Token t=null;
        String ret = "";
        Map<String, Integer> mapAll = new TreeMap<>();

        Map<String, Integer> mapOPERAND = new TreeMap<>();
        Map<String, Integer> mapOPERATOR = new TreeMap<>();
        Map<String, Integer> mapIGNORE = new TreeMap<>();


        int v = 0;

        do {
            t = lex.nextToken();

            v = mapAll.get(t.getText()) != null ? mapAll.get(t.getText()) : 0;
            mapAll.put(t.getText(), v+1);
            if(t.getType() == Halstead.OPERAND) {
                int count = mapOPERAND.get(t.getText()) != null ? mapOPERAND.get(t.getText()) : 0;
                mapOPERAND.put(t.getText(), count+1);
            }
            if(t.getType() == Halstead.OPERATOR ) {
                int count = mapOPERATOR.get(t.getText()) != null ? mapOPERATOR.get(t.getText()) : 0;
                mapOPERATOR.put(t.getText(), count+1);
            }
            if(t.getType() == Halstead.IGNORE) {
                int count = mapIGNORE.get(t.getText()) != null ? mapIGNORE.get(t.getText()) : 0;
                mapIGNORE.put(t.getText(), count+1);
            }

        } while ( t.getType()!=Token.EOF );

      /*  mapstr = mapAll.keySet().stream()
                .mapAll(key -> key + "=" + mapAll.get(key))
                .collect(Collectors.joining(", ", "{", "}"));*/
          //  mapAll.remove("<EOF>");
          for(Map.Entry<String, Integer>  e: mapAll.entrySet()){
            ST st = templates.getInstanceOf("halstead");
            st.add("zeichen", e.getKey());
            st.add("anzahl", e.getValue());
            ret +=  st.render() + "\n";
        }
        for(Map.Entry<String, Integer>  e: mapOPERAND.entrySet()){
            ST st = templates.getInstanceOf("operand");
            st.add("zeichen", e.getKey());
            st.add("anzahl", e.getValue());
            operandStr +=  st.render() + "\n";
        }
        for(Map.Entry<String, Integer>  e: mapOPERATOR.entrySet()){
            ST st = templates.getInstanceOf("operator");
            st.add("zeichen", e.getKey());
            st.add("anzahl", e.getValue());
            operatorStr +=  st.render() + "\n";
        }
        for(Map.Entry<String, Integer>  e: mapIGNORE.entrySet()){
            ST st = templates.getInstanceOf("ignore");
            st.add("zeichen", e.getKey());
            st.add("anzahl", e.getValue());
            ignoreStr +=  st.render() + "\n";
        }
       // System.out.println(ret);
        return ret;//  ret.length() > 0 ? ret.substring(0,ret.length()-1) : ret;
    }

    public void start() throws IOException {
        //   String s = run("G:\\InfProjekte\\Halstead\\src\\main\\java\\input.txt", true);
        // String s = run("G:\\InfProjekte\\Halstead\\src\\main\\quelldateien\\ggt1.c", true);
        String s = run("G:\\InfProjekte\\Halstead\\src\\main\\quelldateien\\Beispiel.c", true);
      /*  System.out.println("--------Operand--------");
        System.out.println(operandStr);
        System.out.println("--------Operator--------");
        System.out.println(operatorStr);
        System.out.println("--------Ignore--------");
        System.out.println(ignoreStr);
        // System.err.print(s);*/
    }
   /* public static void main(String[] args) throws IOException {
            start();
    }*/

}
