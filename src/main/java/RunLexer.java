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

    Map<String, Integer> mapOPERAND = new TreeMap<>();
    Map<String, Integer> mapOPERATOR = new TreeMap<>();
    Map<String, Integer> mapIGNORE = new TreeMap<>();

    public RunLexer() {
    }

    public  void run(String str, boolean file) throws IOException {

        STGroup templates = new STGroupFile("G:\\InfProjekte\\Halstead\\src\\main\\java\\halstead.stg");
        CharStream input = null;

        if (file) input = CharStreams.fromFileName(str);
        else input = CharStreams.fromString(str);

        Halstead lex = new Halstead(input);
        Token t=null;
        String ret = "";

        do {
            t = lex.nextToken();

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


        //Fill StringTemplate

        for(Map.Entry<String, Integer>  e: mapOPERAND.entrySet()){
            ST st = templates.getInstanceOf("operand");
            st.add("token", e.getKey());
            st.add("anzahl", e.getValue());
            operandStr +=  st.render() + "\n";
        }
        for(Map.Entry<String, Integer>  e: mapOPERATOR.entrySet()){
            ST st = templates.getInstanceOf("operator");
            st.add("token", e.getKey());
            st.add("anzahl", e.getValue());
            operatorStr +=  st.render() + "\n";
        }
        for(Map.Entry<String, Integer>  e: mapIGNORE.entrySet()){
            ST st = templates.getInstanceOf("ignore");
            st.add("token", e.getKey());
            st.add("anzahl", e.getValue());
            ignoreStr +=  st.render() + "\n";
        }

    }

    public void start(String file) throws IOException {
        run(file, true);

    }

    public ST parameter(){
        STGroup templates = new STGroupFile("G:\\InfProjekte\\Halstead\\src\\main\\java\\halstead.stg");
        ST st = templates.getInstanceOf("parameter");
        int sumOperator = 0;
        int sumOperand = 0;
        for(Map.Entry<String, Integer>  e: mapOPERATOR.entrySet()){
            sumOperator += e.getValue();
        }
        for(Map.Entry<String, Integer>  e: mapOPERAND.entrySet()){
            sumOperand += e.getValue();
        }

        st.add("n1", mapOPERATOR.size());

        st.add("n2",  mapOPERAND.size());

        st.add("N1", sumOperator);

        st.add("N2", sumOperand);


        return st;
    }

    public ST metriken(){
        STGroup templates = new STGroupFile("G:\\InfProjekte\\Halstead\\src\\main\\java\\halstead.stg");
        ST st = templates.getInstanceOf("metriken");
        ST parameter = parameter();

        int N = (int) parameter.getAttribute("N1") + (int) parameter.getAttribute("N2");
        st.add("N", N);

        int n = (int) parameter.getAttribute("n1") + (int) parameter.getAttribute("n2");
        st.add("n", n);

        double V = N * (Math.log(n) /Math.log(2));
        st.add("V", V);

        double n1 = (int) parameter.getAttribute("n1");
        double N2 = (int) parameter.getAttribute("N2");
        double n2 = (int) parameter.getAttribute("n2");
        double D = (n1/2) * (N2/n2);
        st.add("D", D);

        double E = V * D;
        st.add("E", E);

        return st;
    }

}
