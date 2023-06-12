package uno;

public class TipoNumericos {

    int a, g; // 4 bytes
    short b ; // 2 bytes
    long c; // 8 bytes
    byte d; // 1 byte
    
    float e; // 4 bytes
    double f; // 8 bytes
    
    final int h;
    final double i;
    
    String aa;
    
    public TipoNumericos(int numero, String cadena){
        a = -210000000;
        b = -32768;
        c =  345645645645645645L;
        d = -128;

        e = 0.123456F;
        f = 0.123456;
        
        g = numero * 100; 
        h = 1;
        i = 2.54;
        
        aa = cadena;
    }
}
