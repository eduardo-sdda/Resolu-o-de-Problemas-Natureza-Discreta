import javax.swing.JFrame;
import javax.swing.BoxLayout;

public class AppWindow { // cria a janela onde vai ficar os botões e os displays
    private JFrame frame;
    private FormulaPanel formulaPanel;
    private ButtonPanel buttonPanel;

    public AppWindow() {
        frame = new JFrame("Provador de Fórmulas"); // nome da Janela
        frame.setSize(600,400); // proporções largura e altura
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fecha a interface quando se fecha a janela
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS)); // configuração do layout, oq for adicionado com frame.add vai aparecer de cima pra baixo, na vertical

        formulaPanel = new FormulaPanel(); // chama o Panel do display
        buttonPanel = new ButtonPanel(formulaPanel); // chama o Panel dos botões

        // adiciona os Panels na Janela
        frame.add(formulaPanel);
        frame.add(buttonPanel);

    }

    // função show usada na main, torna a Janela vísivel
    public void show() {
        frame.setVisible(true);
    }
}
