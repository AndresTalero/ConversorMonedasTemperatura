package convertirYMostrar;

import javax.swing.JOptionPane;

public class OpcionesConversionTemperatura {

    ResultadosConversiones valores = new ResultadosConversiones();

    public void ConvertirTemperatura(double valorInicial) {
        
        String opciones = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null,
                new Object[]{"Grados Celsius a Grados Fahrenheit", "Grados Celsius a Kelvin", "Grados Fahrenheit a Grados Celsius",
                    "Kelvin a Grados Celsius", "Kelvin a Grados Fahrenheit", "Grados Fahrenheit a kelvin"}, "Seleccion")).toString();
        
        switch (opciones) {
            case "Grados Celsius a Grados Fahrenheit":
                double fahrenheit = (valorInicial * 1.8) + 32; 
                valores.resultadoTemperatura(valorInicial , fahrenheit,"Grados Celsius", "Grados Fahrenheit");
                break;
            case "Grados Celsius a Kelvin":
                double kelvin = valorInicial + 273.15;
                valores.resultadoTemperatura(valorInicial, kelvin, "Grados Celsius", "Grados Kelvin");
                break;                
            case "Grados Fahrenheit a Grados Celsius":
                double celsius = (valorInicial - 32) / 1.8;
                valores.resultadoTemperatura(valorInicial , celsius,"Grados Fahrenheit", "Grados Celsius");
                break;
            case "Kelvin a Grados Celsius":
                celsius = valorInicial - 273.15;
                valores.resultadoTemperatura(valorInicial, celsius,"Kelvin", "Grados Celsius");
                break;
            case "Kelvin a Grados Fahrenheit":
                celsius = valorInicial - 273;
                fahrenheit = (celsius * 1.8) + 32;
                valores.resultadoTemperatura(valorInicial,fahrenheit, "Kelvin", "Grados Fahrenheit");
                break;
            case "Grados Fahrenheit a kelvin":
                celsius = (valorInicial - 32) / 1.8;                
                kelvin = celsius + 273;
                valores.resultadoTemperatura(valorInicial, kelvin, "Grados Fahrenheit", "Grados Kelvin");
                break;             
        }
    }
}
