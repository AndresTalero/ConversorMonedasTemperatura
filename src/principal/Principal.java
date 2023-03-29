package principal;

import javax.swing.JOptionPane;
import convertirYMostrar.OpcionesConversionMoneda;
import convertirYMostrar.OpcionesConversionTemperatura;

public class Principal {

    public static void main(String[] args) {       
        
        boolean salir = true;
        int respuesta;       

        while (salir) {
            
            try{
                String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu",
                        JOptionPane.PLAIN_MESSAGE, null,
                        new Object[]{"Conversor de Moneda", "Conversor de Temperatura"}, "Seleccion")).toString();

                switch (opciones) {
                    case "Conversor de Moneda":                        
                        conversorMoneda();  
                        
                        //Si agregamos: JOptionPane.YES_NO_OPTION quitamos el botón de Cancelar en el cuadro de diálogo
                        //respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Select an Option",  JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                        
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");   
                        if (JOptionPane.OK_OPTION == respuesta) {
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "Programa terminado");
                                salir = false;
                            }                       
                        break;

                    case "Conversor de Temperatura":
                        conversorTemperatura();        
                        
                        //Otra forma diferente a la que se usó en el anterior JOptionPane.showConfirmDialog:
                        
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if (respuesta == 0) {
                            break;
                        }                         
                        else if(respuesta == 1){
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            salir = false;
                        }else{
                            JOptionPane.showMessageDialog(null, "Programa terminado");  
                            salir = false;
                        }                        
                        break;
                }
            }    
            catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Programa terminado","Message",JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);            
            }
        }       
    }
    
    
    public static void conversorMoneda(){  
        
        OpcionesConversionMoneda cambiar = new OpcionesConversionMoneda();        
        String valorMoneda= JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
        
        if (ValidarNumero(valorMoneda) == true) {                        
            double cantidad = Double.parseDouble(valorMoneda);
            cambiar.ConvertirMonedas(cantidad);
        } else {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            conversorMoneda();
        }
    } 
    
    
    public static void conversorTemperatura(){
        
        OpcionesConversionTemperatura convertir = new OpcionesConversionTemperatura();        
        String valorTemperatura = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
        
        if (ValidarNumero(valorTemperatura) == true) {
            double valor = Double.parseDouble(valorTemperatura);
            convertir.ConvertirTemperatura(valor); 
        }
        else {
            JOptionPane.showMessageDialog(null, "Valor no válido");
            conversorTemperatura();
        }
    }   
    

    public static boolean ValidarNumero(String valorMoneda) {
        try {
            double x = Double.parseDouble(valorMoneda);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}