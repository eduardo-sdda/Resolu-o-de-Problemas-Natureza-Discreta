import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import java.awt.Dimension;

// Panel usada pro display da Fórmula, o input do usuário
public class FormulaPanel extends JPanel {
    private String formula = "";
    private JLabel display;

    public FormulaPanel() {
        display = new JLabel("Fórmula: "); // Label com o texto padrão do display
        display.setPreferredSize(new Dimension(560, 40)); // proporções do display
        this.setBorder(BorderFactory.createTitledBorder("Display")); // nome do Panel, aparece no topo
        this.add(display); // adiciona o display no Panel
    }

    public void addSymbol(String symbol){ // função que vai ser usada pra adicionar os símbolos no Display
        formula += symbol; // vai adicionando cada simbolo na formula conforme for apertado os botões
        display.setText("Fórmula: " + formula); // o texto que vai aparecer no display
    }

    public void clear() { // função que vai ser usada no botão Apagar, serve pra limpar a formula
        formula = "";
        display.setText("Fórmula: ");
    }

    public String getFormula() { // get da Formula, retorna a String que é a formula atual
        return formula;
    }

}
