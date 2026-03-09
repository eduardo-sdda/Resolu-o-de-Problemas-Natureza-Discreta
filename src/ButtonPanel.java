import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.GridLayout;

// Panel onde vão ficar os botões
// Botões que vão ser usados: Botões de preposições (letras), Botões para os parênteses, Botões para os conectivos, Botões de apagar e confirmar

public class ButtonPanel extends JPanel {
    private FormulaPanel formulaPanel;

    public ButtonPanel(FormulaPanel formulaPanel) {
        this.formulaPanel = formulaPanel;
        this.setBorder(BorderFactory.createTitledBorder("Símbolos")); // nome do Panel
        this.setLayout(new GridLayout(5, 3, 5, 5)); // layout das separações dos botões, linhas e colunas, gap horizontal e vertical

        // chama as funções de cada tipo de botão
        addPreposicoes();
        addConectivos();
        addControls(); // aqui vão ter os parênteses, Apagar e Cofirmar
    }

    // função pra criar os botões, recebe uma String que é o texto que aparece no Botão
    private void addButton(String symbol) {
        JButton button = new JButton(symbol);
        button.addActionListener(e -> formulaPanel.addSymbol(symbol)); // adiciona uma função pro botão, nesse caso ele chama addSymbol do Panel da formula e adiciona o simbolo do botão no texto do display
        this.add(button);
    }

    // botão das preposições
    private void addPreposicoes() {
        String[] preposicoes = {"P", "Q", "A", "B", "C", "D", "E"}; // Letras usadas pra preposições, da pra adicionar mais, mas acho que não precisa
        for (String p : preposicoes) {
            addButton(p); // adiciona um botão pra cada uma das letras da String preposicoes
        }
    }

    // botões dos conectivos, tem os 6 conectivos de exemplo do slide, se formos adicionar mais é só botar mais uma linha
    private void addConectivos() {
        addButton("~");
        addButton("∧");
        addButton("∨");
        addButton("→");
        addButton("↔");
        addButton("⊕");
    }

    // botões dos parenteses, apagar, confirmar
    private void addControls() {
        addButton("(");
        addButton(")");

        // botão de apagar, ta sendo criado manualmente, sem usar a função de criar botões, pq ela não adiciona texto no display da Fórmula
        JButton clearButton = new JButton("Apagar");
        clearButton.addActionListener(e -> formulaPanel.clear()); // ação quando o botão é clicado, chama a função do formulaPanel de limpar o texto do display
        this.add(clearButton);

        // botão de confirmar, não faz nada por enquanto pq depende da etapa 2
        // a ideia é que ele vai exibir uma mensagem de erro no display caso a fórmula não esteja válida, e caso esteja, vai mostrar a tabela verdade referente a fórmula
        JButton confirmButton = new JButton("Confirmar");
        this.add(confirmButton);
    }

}
