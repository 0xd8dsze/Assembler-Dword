import java.util.HashMap;
import java.util.Map;

/**
 * Created by 0xd8dsze on 10.01.2023
 */
public class SymbolTable {

    Map<String, Integer> symbolTable;

    //Initializes the symbol table
    public SymbolTable() {
        symbolTable = new HashMap<String, Integer>();
        symbolTable.put("SP", 0);
        symbolTable.put("LCL", 1);
        symbolTable.put("ARG", 2);
        symbolTable.put("THIS", 3);
        symbolTable.put("THAT", 4);
        symbolTable.put("R0", 0);
        symbolTable.put("R1", 1);
        symbolTable.put("R2", 2);
        symbolTable.put("R3", 3);
        symbolTable.put("R4", 4);
        symbolTable.put("R5", 5);
        symbolTable.put("R6", 6);
        symbolTable.put("R7", 7);
        symbolTable.put("R8", 8);
        symbolTable.put("R9", 9);
        symbolTable.put("R10", 10);
        symbolTable.put("R11", 11);
        symbolTable.put("R12", 12);
        symbolTable.put("R13", 13);
        symbolTable.put("R14", 14);
        symbolTable.put("R15", 15);
        symbolTable.put("SCREEN", 16384);
        symbolTable.put("KBD", 24576);

    }

    //Takes string symbol and int address and places it into HashMap using symbol as key
    public void addEntry(String symbol, int address) {

        symbolTable.put(symbol, address);
    }

    public Boolean contains(String symbol) {

        return symbolTable.containsKey(symbol);
    }

    //Returns the address of the symbol in the table
    public int getAddress(String symbol) {

        if (contains(symbol)) {
            return symbolTable.get(symbol);
        } else {
            return -1;
        }
    }

    //Test function to check the contents of the Symbol Table
    public void dumpTable() {
        for (String k : symbolTable.keySet()) {
            System.out.println(k + "-" + symbolTable.get(k));
        }
    }
}
