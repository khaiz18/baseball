import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerEntry  extends JFrame {

    double maxBattingAverage=0;
    Player maxPlayer=null;

    public PlayerEntry() {
        //Set the title of the form
        this.setTitle("Player Entry");
        //Set the layout of the form
        this.setLayout(null);
        //Set the size of the form
        this.setSize(500, 500);
        //Set the default close operation of the form
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        int y = 50, gap = 30;
        //Create the player name text field
        JLabel lblName = new JLabel("Player Name");
        lblName.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblName);

        JTextField txtPlayerName = new JTextField();
        txtPlayerName.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtPlayerName);
        txtPlayerName.setColumns(10);

        y = y + gap;
        //Create the team code text field
        JLabel lblTeam = new JLabel("Team Code (1-5)");
        lblTeam.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblTeam);

        JTextField txtTeam = new JTextField();
        txtTeam.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtTeam);
        txtTeam.setColumns(10);

        y = y + gap;
        //Create the number of times at bat text field
        JLabel lblBat = new JLabel("No. of times at bat");
        lblBat.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblBat);

        JTextField txtBat = new JTextField();
        txtBat.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtBat);
        txtBat.setColumns(10);

        y = y + gap;
        //Create the number of singles text field
        JLabel lblSingles = new JLabel("No. of singles");
        lblSingles.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblSingles);

        JTextField txtSingles = new JTextField();
        txtSingles.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtSingles);
        txtSingles.setColumns(10);

        y = y + gap;
        //Create the number of doubles text field
        JLabel lblDoubles = new JLabel("No. of doubles");
        lblDoubles.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblDoubles);

        JTextField txtDoubles = new JTextField();
        txtDoubles.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtDoubles);
        txtDoubles.setColumns(10);

        y = y + gap;

        //Create the number of triples text fields
        JLabel lblTriples = new JLabel("No. of triples");
        lblTriples.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblTriples);

        JTextField txtTriples = new JTextField();
        txtTriples.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtTriples);
        txtTriples.setColumns(10);

        y = y + gap;


        //Create the number of home run text fiels
        JLabel lblHomeruns = new JLabel("No. of home runs");
        lblHomeruns.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblHomeruns);

        JTextField txtHomeruns = new JTextField();
        txtHomeruns.setBounds(200, y - 3, 200, 20);
        this.getContentPane().add(txtHomeruns);
        txtHomeruns.setColumns(10);

        y = y + gap * 2;

        //Create the calculate button
        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.setBounds(50, y - 3, 100, 20);
        this.getContentPane().add(btnCalculate);

        //Creaate the clear button
        JButton btnClear = new JButton("Clear");
        btnClear.setBounds(175, y - 3, 100, 20);
        this.getContentPane().add(btnClear);

        //Create the exit buttom
        JButton btnExit = new JButton("Exit");
        btnExit.setBounds(300, y - 3, 100, 20);
        this.getContentPane().add(btnExit);

        //Show all the 5 team codes and their names at the bottom
        y = y + gap * 2;
        JLabel lblTeams = new JLabel("Teams");
        lblTeams.setBounds(50, y, 120, 14);
        this.getContentPane().add(lblTeams);

        y = y + gap / 2;
        JLabel lblTeam1 = new JLabel("1 - "+Player.teams[0]);
        lblTeam1.setBounds(50, y, 200, 14);
        this.getContentPane().add(lblTeam1);

        y = y + gap / 2;
        JLabel lblTeam2 = new JLabel("2 - "+Player.teams[1]);
        lblTeam2.setBounds(50, y, 200, 14);
        this.getContentPane().add(lblTeam2);

        y = y + gap / 2;
        JLabel lblTeam3 = new JLabel("3 - "+Player.teams[2]);
        lblTeam3.setBounds(50, y, 200, 14);
        this.getContentPane().add(lblTeam3);

        y = y + gap / 2;
        JLabel lblTeam4 = new JLabel("4 - "+Player.teams[3]);
        lblTeam4.setBounds(50, y, 200, 14);
        this.getContentPane().add(lblTeam4);

        y = y + gap / 2;
        JLabel lblTeam5 = new JLabel("5 - "+Player.teams[4]);
        lblTeam5.setBounds(50, y, 200, 14);
        this.getContentPane().add(lblTeam5);

        //Event handler for the Calculate button
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Read all the fields from the form
                String name=txtPlayerName.getText();
                int teamCode=Integer.parseInt(txtTeam.getText());
                int timesBat=Integer.parseInt(txtBat.getText());
                int singles=Integer.parseInt(txtSingles.getText());
                int doubles=Integer.parseInt(txtDoubles.getText());
                int triples=Integer.parseInt(txtTriples.getText());
                int homeruns=Integer.parseInt(txtHomeruns.getText());

                //Create a new player object with the read values
                Player player=new Player(name,teamCode,timesBat,singles,doubles,triples,homeruns);
                //Get the batting average of the player
                double battingAverage=player.calculateBattingAverage();
                //If the Player has higher batting average than the maximum battinng average yet then set this player as the maximum batting average player
                if(battingAverage>=maxBattingAverage) {
                    maxBattingAverage=battingAverage;
                    maxPlayer=player;
                }
                //Create a new player output frame with the created player object and show it
                PlayerOutput playerOutput=new PlayerOutput(player);
                playerOutput.show();
            }
        });

        //Event handler for the clear button
        btnClear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Clear all the input fields
                txtPlayerName.setText("");
                txtTeam.setText("");
                txtBat.setText("");
                txtSingles.setText("");
                txtDoubles.setText("");
                txtTriples.setText("");
                txtHomeruns.setText("");
                //Set the focus on the player name field
                txtPlayerName.requestFocusInWindow();
            }
        });

        //Event handler for the exit button
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                //Create a new exit screen frame with the maximum batting average player object and show it
                ExitScreen exitScreen=new ExitScreen(maxPlayer);
                exitScreen.show();
            }
        });

        //Show the frame
        this.setVisible(true);
    }
}