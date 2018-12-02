import javax.swing.*;

public class ExitScreen extends JFrame{
    public ExitScreen(Player player) {
        //Set the title of the output screen
        this.setTitle("Exit Screen");
        //Set the layout of the output screen
        this.setLayout(null);
        //Set the size of the output screen
        this.setSize(500, 300);
        //Set the default close operation of the form
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int y = 50, gap = 30;
        //Display the message
        JLabel lblMax = new JLabel("Maximum Batting Average");
        lblMax.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblMax);

        y = y + gap;
        //Display the team name of the Player
        JLabel lblName = new JLabel("Player Name: " + player.getName());
        lblName.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblName);

        y = y + gap;
        //Display the batting average of the Player
        JLabel lblAverage = new JLabel("Player Average: " + player.calculateBattingAverage());
        lblAverage.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblAverage);

        this.setVisible(true);
    }
}
