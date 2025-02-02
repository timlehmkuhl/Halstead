import org.junit.Before;
import org.junit.Test;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UnitTest {


    final static Map<String, Integer> mapOPERATOR = new TreeMap<>();
    final static Map<String, Integer> mapOPERANT = new TreeMap<>();
    final static Map<String, Integer> mapIGNORE = new HashMap<>();
    final String FILE = "G:\\InfProjekte\\Halstead\\src\\main\\quelldateien\\Beispiel.c";
    final String EVAL = "G:\\InfProjekte\\Halstead\\src\\main\\quelldateien\\eval1.c";



    @Test
    public void testOperator() throws IOException {
        Map<String, Integer> testMap = new TreeMap<>();
        RunLexer r = new RunLexer();
        r.start(FILE);
        String str = r.operatorStr;
        String strA[] = str.split("\n");
        for(String s : strA){
          testMap.put(s.substring(0,s.indexOf("_")), Integer.parseInt( s.substring(s.indexOf("_")+1)));
        }
        for(Map.Entry<String, Integer>  e: testMap.entrySet()){
           System.out.println(e.getKey() + " " + e.getValue());
        }

        assertTrue(testMap.equals(mapOPERATOR));

    }

    @Test
    public void testOperant() throws IOException {
        Map<String, Integer> testMap = new TreeMap<>();
        RunLexer r = new RunLexer();
        r.start(FILE);
        String str = r.operandStr;

        String strA[] = str.split("\n");
        for(int i = 0; i < strA.length; i++){
            if(i != 2 && i != 3)  testMap.put(strA[i].substring(0,strA[i].indexOf("_")), Integer.parseInt( strA[i].substring(strA[i].indexOf("_")+1)));
        }
        for(Map.Entry<String, Integer>  e: testMap.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        assertTrue(testMap.equals(mapOPERANT));

    }

    @Test
    public void testIgnore() throws IOException {
        RunLexer r = new RunLexer();
        r.start(FILE);
        assertEquals("", r.ignoreStr);
    }

    @Test
    public void parameter() throws IOException {
        RunLexer r = new RunLexer();
        r.start(EVAL);
        ST st = r.parameter();
        assertEquals(22, st.getAttribute("n1"));
        assertEquals(30, st.getAttribute("n2"));
        assertEquals(157, st.getAttribute("N1"));
        assertEquals(122, st.getAttribute("N2"));
    }

    @Test
    public void metriken() throws IOException {
        RunLexer r = new RunLexer();
        r.start(EVAL);
        ST st = r.metriken();
        assertEquals(279, (int)st.getAttribute("N"));
        assertEquals(52, (int)st.getAttribute("n"));
        assertEquals(1590.42, (double)st.getAttribute("V"), 0.01);
        assertEquals(44.73, (double)st.getAttribute("D"), 0.01);
        assertEquals(71144.91, (double)st.getAttribute("E"), 0.01);

    }


    @Before
    public void init(){
        mapOPERATOR.put("!=", 7);
        //  mapOPERATOR.put("#", 3);
        mapOPERATOR.put("&", 2);
        mapOPERATOR.put("&&", 4);
        mapOPERATOR.put("(", 37);
        mapOPERATOR.put("*", 23);
        mapOPERATOR.put("+", 12);
        mapOPERATOR.put("++", 4);
        mapOPERATOR.put(",", 20);
        mapOPERATOR.put("-", 3);
        mapOPERATOR.put("/", 1);
        mapOPERATOR.put(";", 46);
        mapOPERATOR.put("<", 1);
        mapOPERATOR.put("=", 15);
        mapOPERATOR.put("==", 3);
        mapOPERATOR.put("[", 1);
        mapOPERATOR.put("break", 3);
        mapOPERATOR.put("case", 4);
        mapOPERATOR.put("else", 4);
        mapOPERATOR.put("for(", 1);
        mapOPERATOR.put("if(", 5);
        mapOPERATOR.put("return", 1);
        mapOPERATOR.put("sizeof", 2);
        mapOPERATOR.put("switch(", 1);
        mapOPERATOR.put("while(", 1);
        mapOPERATOR.put("{", 12);



        mapOPERANT.put("\"%d\"", 2);
        mapOPERANT.put("\"Das Ergebnis der Berechnung ist : %d\"", 1);
        //mapOPERANT.put("\"Error, Nutzung des Programms : eval1 <expression>\"", 1);
        mapOPERANT.put("\"Error: Division durch 0 nicht moeglich\"", 1);
        mapOPERANT.put("\"Error: kein <operator>\"", 1);
        mapOPERANT.put("\"Error: kein <wert1>\"", 1);
        mapOPERANT.put("\"Error: kein <wert2>\"", 1);
        mapOPERANT.put("\'*\'", 2);
        mapOPERANT.put("\'+\'", 2);
        mapOPERANT.put("\'-\'", 2);
        mapOPERANT.put("\'/\'", 2);
        mapOPERANT.put("'\\0'", 1);//
        mapOPERANT.put("'\\n'", 1);//
        mapOPERANT.put("0", 10);
        mapOPERANT.put("1", 6);
        mapOPERANT.put("2", 1);
        mapOPERANT.put("anfang", 3);
        mapOPERANT.put("argc", 2);
        mapOPERANT.put("argv", 2);
        mapOPERANT.put("ch", 12);
        mapOPERANT.put("char", 12);
        mapOPERANT.put("eval1", 2);
        mapOPERANT.put("exit", 4);
        mapOPERANT.put("extract", 4);
        mapOPERANT.put("i", 20);
        //mapOPERANT.put("include", 3);
        mapOPERANT.put("int", 13);
        mapOPERANT.put("lgval2", 4);
        mapOPERANT.put("main", 1);
        mapOPERANT.put("malloc", 2);
        mapOPERANT.put("nb", 3);
        mapOPERANT.put("operation", 3);
        mapOPERANT.put("printf", 6);
        mapOPERANT.put("res", 3);
        mapOPERANT.put("resultat", 7);
        mapOPERANT.put("sscanf", 2);
        mapOPERANT.put("strlen", 3);
        mapOPERANT.put("val1", 4);
        mapOPERANT.put("val2", 4);
        mapOPERANT.put("void", 2);
        mapOPERANT.put("wert1", 6);
        mapOPERANT.put("wert2", 7);
        mapOPERANT.put("zeichenkette1", 6);
        mapOPERANT.put("zeichenkette2", 5);



    }
}