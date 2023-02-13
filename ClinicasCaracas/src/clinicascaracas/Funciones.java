/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinicascaracas;

public class Funciones {
    public int calcularPrecio(String estudio){
        int precio = 0;
        if (estudio.equals("ultrasonido")){
            precio += 100;
        } else if(estudio.equals("tomografía")){
            precio += 130;
        } else if(estudio.equals("resonancia")){
            precio += 160;
        }
        return precio;
    }
    public int descuentoTerceraEdad(String sexo, int age){
        int discount = 0;
        if ("m".equals(sexo) && age >= 65){
            discount += 25;
        } else if ("f".equals(sexo) && age >= 55){
            discount += 25;
        }
        return discount;
    }
    public int descuentoSeguro(boolean seguro){
        int discount = 0;
        if (seguro){
            discount += 80;
        } else{
            discount = 0;
        }
        return discount;
    }
    public int CalculoTotal(int precio, int descuento){
        int total = 0;
        total = precio * (descuento/100);
        return total;
    }
}
