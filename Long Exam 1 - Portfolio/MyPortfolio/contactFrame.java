package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

//*  Importing required libraries for GUI components.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

//*  Definition of the contactFrame class that extends JFrame.
public class contactFrame extends JFrame{

    //* Instance variables of the contactWindow and homeWindow classes.
    private contactWindow contactWindow;
    private homeWindow homeWindow;

    //* Constructor for the contactFrame class that takes a contactWindow object as a parameter.
    public contactFrame(contactWindow contactWindow) {
        this.contactWindow = contactWindow;
        runContactWindow();
    }

    //*  Method to initialize and display the contact window.
    public void runContactWindow() {
        
        //* Set the title, size, layout, content pane, frame position, and default close operation of the JFrame.
        setTitle("Contact Information");
        setSize(1000,600);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 102, 102));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //* Create and configure the frameTitle label.
        JLabel frameTitle = new JLabel(contactWindow.getContactInfoTitle());
        frameTitle.setText(contactWindow.getContactInfoTitle());
        frameTitle.setFont(new Font("Arial", Font.BOLD, 28));
        frameTitle.setForeground(new Color(255, 255, 255));
        frameTitle.setBounds(640, 100, 267, 33);
        add(frameTitle);

        //* Create and configure the myPhotoLabel label.
        ImageIcon myPhoto = contactWindow.getContactFrameImage();
        JLabel myPhotoLabel = new JLabel(myPhoto);
        myPhotoLabel.setBounds(0, 0, 550, 600);
        add(myPhotoLabel);

        //* Create and configure the outlookLabel label.
        JLabel outlookLabel = new JLabel();
        outlookLabel.setIcon(contactWindow.getOutlookIcon());
        outlookLabel.setText(contactWindow.getOutlookText());
        outlookLabel.setFont(new Font("Arial", Font.BOLD, 13));
        outlookLabel.setForeground(new Color(255, 255, 255));
        outlookLabel.setBounds(575, 170, 500, 48);
        add(outlookLabel);

        //* Create and configure the gmailLabel label.
        JLabel gmailLabel = new JLabel();
        gmailLabel.setIcon(contactWindow.getGmailIcon());
        gmailLabel.setText(contactWindow.getGmailText());
        gmailLabel.setFont(new Font("Arial", Font.BOLD, 13));
        gmailLabel.setForeground(new Color(255, 255, 255));
        gmailLabel.setBounds(580, 230, 500, 48);
        add(gmailLabel);

        //* Create and configure the linkedinLabel label.
        JLabel linkedinLabel = new JLabel();
        linkedinLabel.setIcon(contactWindow.getLinkedInIcon());
        linkedinLabel.setText(contactWindow.getLinkedInText());
        linkedinLabel.setFont(new Font("Arial", Font.BOLD,13));
        linkedinLabel.setForeground(new Color(255, 255, 255));
        linkedinLabel.setBounds(580, 290, 500, 48);
        add(linkedinLabel);

        //* reate and configure the instagramLabel label.
        JLabel instagramLabel = new JLabel();
        instagramLabel.setIcon(contactWindow.getInstagramIcon());
        instagramLabel.setText(contactWindow.getInstagramText());
        instagramLabel.setFont(new Font("Arial", Font.BOLD,13));
        instagramLabel.setForeground(new Color(255, 255, 255));
        instagramLabel.setBounds(580, 350, 500, 48);
        add(instagramLabel);

        //* Create and configure the homeButton button.
        JButton homeButton = new JButton(contactWindow.getHomeButton(), contactWindow.getHomeButtonIcon());
        homeButton.setText(contactWindow.getHomeButton());
        homeButton.setFont(new Font("Arial", Font.BOLD, 15));
        homeButton.setForeground(new Color(0, 0, 0));
        homeButton.setBorder(new LineBorder(getForeground(), 1));
        homeButton.setBackground(new Color(225, 225, 225));
        homeButton.setBounds(830, 480, 115, 49);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //* Dispose the current frame and create a new instance of homeWindow and homeFrame.
                dispose();
                
                homeWindow homeWindow = new homeWindow();
                homeFrame homeFrame = new homeFrame(homeWindow);
                homeFrame.setVisible(true);
              
            }
            
        });
        add(homeButton);
        
        //* Set the visibility of the JFrame to true.
        setVisible(true);
    }
    
}
