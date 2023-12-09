
public class V5_TiposPrimitivosTipoChar {
    
    public static void main(String arg[]){
    
        // https://en.wikipedia.org/wiki/List_of_Unicode_characters
        char miChar = 'S';
        System.out.println("miChar \'S\' \t\t = " + miChar);
     
        char miCharUniCode = '\u0053';
        System.out.println("miCharUniCode \\u0053 \t = " + miCharUniCode);
        
        char miCharDecimal = 83;
        System.out.println("miCharDecimal 83 \t = " + miCharDecimal);
        
        var miVarDecimal = 83;
        System.out.println("miVarDecimal 83 \t = " + miVarDecimal);
        
        var miVarDecimalChar = (char)83;
        System.out.println("miVarDecimalChar (char)83 = " + miVarDecimalChar);
        
        int miIntSimbolo = 'S';
        System.out.println("miIntSimbolo \'S\' \t = " + miIntSimbolo);
        
    }
    
}
