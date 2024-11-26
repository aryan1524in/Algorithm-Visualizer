package Visualizer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HomeScreen extends JFrame {

    private JButton startVisualizerButton;

    public HomeScreen() {
        super("Home Screen");

        // Create a button to start the visualizer
        startVisualizerButton = new JButton("Start Visualizer");

        // Set the layout and add the button to the frame
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(new JLabel("Welcome to the Visualizer!"), BorderLayout.NORTH);
        panel.add(startVisualizerButton, BorderLayout.CENTER);

        add(panel);

        // Set the frame properties
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        // Add action listener to the button
        startVisualizerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Create and display the visualizer frame
                SortingVisualizer.frame = new VisualizerFrame();
            }
        });
    }

    public static void main(String[] args) {
        // Start the home screen
        new HomeScreen();
    }
}
