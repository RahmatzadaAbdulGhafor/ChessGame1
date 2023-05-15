import javax.swing.*;
import java.awt.*;

public class ChessMainMenu extends JFrame {
    public ChessMainMenu() {
        // Set window properties
        setTitle("Chess Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 600));
        setResizable(false);

        // Create and set layout for main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        // To Be Changed Later When Designing
//        ImageIcon backgroundImage = new ImageIcon("chessBackground.jpg");
//        JLabel backgroundLabel = new JLabel(backgroundImage);
//        backgroundLabel.setBounds(0, 0, backgroundImage.getIconWidth(), backgroundImage.getIconHeight());
//        mainPanel.add(backgroundLabel);
        // Create and add components to main panel
        JPanel topPanel = new JPanel();
        topPanel.setPreferredSize(new Dimension(600, 50));
        topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JSlider volumeSlider = new JSlider(0, 100, 50);
        volumeSlider.setPreferredSize(new Dimension(150, 25));
        topPanel.add(volumeSlider);
        JButton muteButton = new JButton("Mute");
        topPanel.add(muteButton);
        mainPanel.add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(4, 1, 0, 20));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(20, 30, 20, 30));
        JButton twoPlayerButton = new JButton("2 Player");
        twoPlayerButton.setPreferredSize(new Dimension(50, 50)); // set preferred size
        JButton aiButton = new JButton("AI");
        aiButton.setPreferredSize(new Dimension(50, 50)); // set preferred size
        JButton leaderboardButton = new JButton("Leaderboard");
        leaderboardButton.setPreferredSize(new Dimension(50, 50)); // set preferred size
        JButton settingsButton = new JButton("Settings");
        settingsButton.setPreferredSize(new Dimension(500, 50)); // set preferred size
        centerPanel.add(twoPlayerButton);
        centerPanel.add(aiButton);
        centerPanel.add(leaderboardButton);
        centerPanel.add(settingsButton);
        mainPanel.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setPreferredSize(new Dimension(600, 50));
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel copyrightLabel = new JLabel("© 2023 Chess Game");
        bottomPanel.add(copyrightLabel);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);

        // Add main panel to window
        add(mainPanel);

        // Pack and show window
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ChessMainMenu();
    }
}
