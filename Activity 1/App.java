import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import java.util.*;


public class App {
    

    public static void logIn (){

        JFrame window1 = new JFrame("Log-in");
        JLabel userLabel = new JLabel("Username:");
        JLabel passLabel = new JLabel("Password:");
        JTextField userInput = new JTextField();
        JPasswordField passInput = new JPasswordField();
        JFrame frame = new JFrame();
        JButton log_in = new JButton("Login");

        //user
        //label
        userLabel.setBounds(30, 40, 80, 25);
        userLabel.setFont(new Font("Roboto",Font.BOLD, 14));

        //Input

        userInput.setLayout(null);
        userInput.setBounds(115, 40, 130, 25);
        
        //pass
        //label
        passLabel.setBounds(30, 80, 80, 25);
        passLabel.setFont(new Font("Roboto",Font.BOLD, 14));

        
        //Input
        passInput.setLayout(null);
        passInput.setBounds(115, 80, 130, 25);
        

        //login button
        log_in.setBounds(95, 120 ,100, 25);
        log_in.setFocusable(false);
        log_in.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String password = passInput.getText();
            String username = userInput.getText();  

            if(username.equals("Fwessa") && password.equals("120603")){
                JOptionPane.showMessageDialog(frame, "Login Successful");
                window1.dispose();
                studProf();

            } else if(username.equals("") && password.equals("") ){

                JOptionPane.showMessageDialog(frame, "Username and Password Required!");
            } else{
                JOptionPane.showMessageDialog(frame, "Incorrect Username and Password");
            }
        }

        });

        //add to frame
        window1.add(userLabel);
        window1.add(passLabel);
        window1.add(userInput);
        window1.add(passInput);
        window1.add(log_in);

        window1.setBounds(0, 0, 300, 200);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setLocationRelativeTo(null);
        window1.setLayout(null);
        window1.setVisible(true);
    }

    public static void studProf(){
        JFrame window2 = new JFrame("Student Profile");

        ImageIcon pic = new ImageIcon("luisa.jpg");
        JLabel profilePic = new JLabel();
        profilePic.setIcon(pic);
        profilePic.setBounds(140, 80, 200, 199);


        JLabel nameText = new JLabel("Karen Pearl V. Pabilando");
        nameText.setBounds(178, 300, 150, 25);
        nameText.setFont(new Font("Roboto",Font.BOLD, 20));


        JLabel birthDate = new JLabel();
        JLabel birthDate_input = new JLabel();
        JLabel hobbies = new JLabel();
        JLabel hobbiesText = new JLabel();
        JLabel talent = new JLabel();
        JLabel talentText = new JLabel();
        JLabel achievement = new JLabel();
        JLabel achievementText = new JLabel();
        JLabel strengths = new JLabel();
        JLabel strengthsText = new JLabel();
        JLabel weakness = new JLabel();
        JLabel weaknessText = new JLabel();
        JLabel course = new JLabel();
        JTextPane whyCourse = new JTextPane();




        // add
        window2.add(profilePic);
        window2.add(nameText);






        window2.setBounds(0, 0, 500, 700);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setLocationRelativeTo(null);
        window2.setLayout(null);
        window2.setVisible(true);



    }


    public static void main(String[] args) throws Exception {

        logIn();

    }

    
}
