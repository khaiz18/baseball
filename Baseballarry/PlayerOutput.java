import javax.swing.*;

public class PlayerOutput extends JFrame{
    public PlayerOutput(Player player) {
        //Set the title of the output screen
        this.setTitle("Player Output");
        //Set the layout of the output screen
        this.setLayout(null);
        //Set the size of the output screen
        this.setSize(500, 500);

        int y = 50, gap = 30;
        //Display the name of the Player
        JLabel lblName = new JLabel("Player Name: "+player.getName());
        lblName.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblName);

        y = y + gap;
        //Display the team name of the Player
        JLabel lblTeam = new JLabel("Team: "+player.getTeamName());
        lblTeam.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblTeam);

        y = y + gap;
        //Display the number of times at bat of the Player
        JLabel lblBat = new JLabel("No. of times at bat: "+player.getTimesBat());
        lblBat.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblBat);

        y = y + gap;
        //Display the number of singles of the Player
        JLabel lblSingles = new JLabel("No. of singles: "+player.getSingles());
        lblSingles.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblSingles);

        y = y + gap;
        //Display the number of doubles of the Player
        JLabel lblDoubles = new JLabel("No. of doubles: "+player.getDoubles());
        lblDoubles.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblDoubles);

        y = y + gap;
        //Display the number of triples of the Player
        JLabel lblTriples = new JLabel("No. of triples: "+player.getTriples());
        lblTriples.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblTriples);

        y = y + gap;
        //Display the number of home runs of the plauer
        JLabel lblHomeruns = new JLabel("No. of home runs: "+player.getHomeruns());
        lblHomeruns.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblHomeruns);

        y = y + gap;
        //Display the batting average of the player
        JLabel lblBattingAverage = new JLabel("Batting Average: "+player.calculateBattingAverage());
        lblBattingAverage.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblBattingAverage);

        y = y + gap;
        //Display the slugging percentage of the player
        JLabel lblSluggingPercentage = new JLabel("Slugging Percentage: "+player.calculateSluggingPercentage());
        lblSluggingPercentage.setBounds(150, y, 300, 14);
        this.getContentPane().add(lblSluggingPercentage);
        //Display the form
        this.setVisible(true);
    }
}
