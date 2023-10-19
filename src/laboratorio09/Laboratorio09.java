/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio09;

/**
 *
 * @author USER
 */
public class Laboratorio09 {

    private static Object sc;

    public static void main(String[] args, boolean True) {
        // TODO code application logic here
        int ancho =30;
        int altura = 30;
        
        int tanque1X=13;
        int tanque1Y=28;
        int tanque2X=12;
        int tanque2Y=29;
        int tanque3X=13;
        int tanque3Y=29;
        int tanque4X=14;
        int tanque4Y=29;
        
        int tanqueBalaX =13;
        int tanqueBalaY = 27;
        
        char caracter = 'O';
        char caracterTanque = '*';
        char caracterTanqueBala = '|';
        
        while(True){
            limpiarPantalla();
            
            if(tanqueBalaY);
            

            for(int i =0; i<altura;i++){
                for (int j = 0; j<ancho;j++){
                
                    if(j==tanque1X && i==tanque1Y) 
                    System.out.print(caracterTanque+ " ");
                    else if(j==tanque2X && i==tanque2Y) 
                    System.out.print(caracterTanque+ " ");
                    else if(j==tanque3X && i==tanque3Y) 
                    System.out.print(caracterTanque+ " ");
                    else if(j==tanque4X && i==tanque4Y) 
                    System.out.print(caracterTanque+ " ");
                    else System.out.print(caracter+" ");
                }
                System.out.print("\n");
            
            }
        }
        esperar();
        String letra;
        letra = sc.next();
        if(letra.equalsIgnoreCase("w")){
            tanque1Y--;tanque2Y--;tanque3Y--;tanque4Y--;
        }else if(letra.equalsIgnoreCase("s")){
            tanque1Y--;tanque2Y--;tanque3Y--;tanque4Y--;
        } else if(letra.equalsIgnoreCase("a")){
            tanque1Y--;tanque2Y--;tanque3Y--;tanque4Y--;
        }
    }

    private static void limpiarPantalla() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static void esperar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}    


