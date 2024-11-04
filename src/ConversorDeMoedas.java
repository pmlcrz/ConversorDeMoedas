import javax.swing.JOptionPane;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        String[] opcoes = {"Dólar para Real", "Euro para Real", "Real para Dólar", "Real para Euro"};
        String escolha = (String) JOptionPane.showInputDialog(null,
                "Escolha a conversão:",
                "Conversor de Moedas",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]);

        if (escolha != null) {
            realizarConversao(escolha);
        } else {
            JOptionPane.showMessageDialog(null, "Conversão cancelada.");
        }
    }

    public static void realizarConversao(String escolha) {
        String valorStr = JOptionPane.showInputDialog("Insira o valor para conversão:");
        try {
            double valor = Double.parseDouble(valorStr);
            double resultado = 0;
            String moedaDestino = "";

            switch (escolha) {
                case "Dólar para Real":
                    resultado = valor * 5.25;  // taxa de conversão exemplo
                    moedaDestino = "Reais";
                    break;
                case "Euro para Real":
                    resultado = valor * 6.18;  // taxa de conversão exemplo
                    moedaDestino = "Reais";
                    break;
                case "Real para Dólar":
                    resultado = valor / 5.25;
                    moedaDestino = "Dólares";
                    break;
                case "Real para Euro":
                    resultado = valor / 6.18;
                    moedaDestino = "Euros";
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    return;
            }

            JOptionPane.showMessageDialog(null, "Resultado: " + resultado + " " + moedaDestino);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida. Por favor, insira um número.");
        }
    }
}
