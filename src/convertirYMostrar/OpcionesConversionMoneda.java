package convertirYMostrar;

import javax.swing.JOptionPane;

public class OpcionesConversionMoneda {

    ResultadosConversiones cantidades = new ResultadosConversiones();    

    public void ConvertirMonedas(double cantidad) {
        
        String opciones = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras",
                "De Pesos a Yen", "De Pesos a Won Coreano", "De Dólar a Pesos", "De Euro a Pesos",
                "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "Seleccion")).toString();
        
        switch (opciones) {
            case "De Pesos a Dólar":
                cantidades.resultadoPesoAMoneda(cantidad, 3739.00, "Dólares");
                break;
            case "De Pesos a Euro":
                cantidades.resultadoPesoAMoneda(cantidad, 4050.48, "Euros");
                break;
            case "De Pesos a Libras":
                cantidades.resultadoPesoAMoneda(cantidad, 4890.52, "Libras Esterlinas");
                break;
            case "De Pesos a Yen":
                cantidades.resultadoPesoAMoneda(cantidad, 29.68, "Yuanes");
                break;
            case "De Pesos a Won Coreano":
                cantidades.resultadoPesoAMoneda(cantidad, 3.04, "Wons");
                break;
            case "De Dólar a Pesos":
                cantidades.resultadoMonedaAPeso(cantidad, 3739.00);
                break;
            case "De Euro a Pesos":
                cantidades.resultadoMonedaAPeso(cantidad, 4050.48);
                break;
            case "De Libras a Pesos":
                cantidades.resultadoMonedaAPeso(cantidad, 4890.52);
                break;
            case "De Yen a Pesos":
                cantidades.resultadoMonedaAPeso(cantidad, 29.68);
                break;
            case "De Won resultamonedaAPesodo a Pesos":
                cantidades.resultadoMonedaAPeso(cantidad, 3.04);
                break;
        }
    }
}