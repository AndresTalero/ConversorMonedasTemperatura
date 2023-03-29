package convertirYMostrar;

import javax.swing.JOptionPane;

public class ResultadosConversiones {
    
    double conversion = 0;

    public void resultadoPesoAMoneda(double valor, double moneda, String nombre) {
        conversion = valor / moneda;
        conversion = (double) Math.round(conversion * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + conversion + " " + nombre);
    }
    
    
    public void resultadoMonedaAPeso(double valor, double moneda) {
        conversion = valor * moneda;
        conversion = (double) Math.round(conversion * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes $ " + conversion + " COP");
    }

    
    public void resultadoTemperatura(double valorInicial, double valorTemperatura, String temperaturaA, String temperaturaB) {        
        double temperatura = (double) Math.round(valorTemperatura * 100d) / 100;
        JOptionPane.showMessageDialog(null, + valorInicial + " " + temperaturaA + " son " + temperatura + " " + temperaturaB);
    }
}