import javax.swing.*;
import java.awt.*;

public class WindowView extends JFrame {
    public WindowView(JTextField calcul) {
        super();
        this.setTitle("SAE 32_2023");
        this.setSize(1500, 800);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        calcul.setPreferredSize(new Dimension(1000, 40));
        calcul.setFont(new Font("Arial", Font.BOLD, 15));

        JLabel calculLabel = new JLabel("Calcul : ");
        calculLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JPanel calculPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 15));
        calculPanel.add(calculLabel);
        calculPanel.add(calcul);
        this.add(calculPanel, BorderLayout.NORTH);
    }

}