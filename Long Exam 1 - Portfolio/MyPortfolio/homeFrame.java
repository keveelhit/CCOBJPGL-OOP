package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

/* The necessary Java AWT and Swing classes are imported to use GUI components and event handling. */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

//* A new class homeFrame is defined, which extends the JFrame class, indicating that it represents a frame or window for the application.
public class homeFrame extends JFrame {

    //* Private instance variables are declared to hold instances of different window classes (homeWindow, contactWindow, workWindow, and aboutMeWindow).
    private homeWindow homeWindow;
    private contactWindow contactWindow;
    private workWindow workWindow;
    private aboutMeWindow aboutMeWindow;
      
    /* A constructor is defined for the homeFrame class, which takes an instance of homeWindow as a parameter. 
    It assigns the parameter to the corresponding instance variable and calls the runHomeFrame method. */
    public homeFrame(homeWindow homeWindow) {
        this.homeWindow = homeWindow;
        runHomeFrame();
    }

    /* This method is responsible for setting up and configuring the home frame. It contains 
    the code to create and add various GUI components to the frame. */
    public void runHomeFrame() {
        
        /*These lines configure various properties of the frame, such as the title, size, layout (using absolute positioning),
        background color, location (centered on the screen), and behavior when closed (exit the application).*/
        setTitle("My Portfolio");
        setSize(1000,600);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 102, 102));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*The following lines (from JLabel fullName to JLabel descriptionText6) create and configure multiple JLabel components. 
        These labels display text information in the home frame, such as the full name, college department, university, 
        and description text.*/
        
        JLabel fullName = new JLabel(homeWindow.getFullName());
        fullName.setText(homeWindow.getFullName());
        fullName.setFont(new Font("Arial", Font.BOLD, 30));;
        fullName.setForeground(new Color(225, 225, 225));
        fullName.setBounds(74, 100, 400, 35);
        add(fullName);
        
        JLabel collegeDepartment = new JLabel(homeWindow.getCollegeDepartment());
        collegeDepartment.setText(homeWindow.getCollegeDepartment());
        collegeDepartment.setFont(new Font("Arial", Font.PLAIN, 12));
        collegeDepartment.setForeground(new Color(225, 225, 225));
        collegeDepartment.setBounds(140, 140, 300, 15);
        add(collegeDepartment);

        JLabel universityLabel = new JLabel(homeWindow.getUniversity());
        universityLabel.setText(homeWindow.getUniversity());
        universityLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        universityLabel.setForeground(new Color(225, 225, 225));
        universityLabel.setBounds(285, 160, 283, 15);
        add(universityLabel);

        ImageIcon myImage = homeWindow.getHomePicture();
        JLabel myImageLabel = new JLabel(myImage);
        myImageLabel.setBounds(436, 0, 552, 600);
        add(myImageLabel);

        JLabel descriptionText1 = new JLabel(homeWindow.getDescriptionText1());
        descriptionText1.setText(homeWindow.getDescriptionText1());
        descriptionText1.setFont(new Font("Arial", Font.ITALIC, 10));
        descriptionText1.setForeground(new Color(225, 225, 225));
        descriptionText1.setBounds(15, 240, 380, 14);
        add(descriptionText1);

        JLabel descriptionText2 = new JLabel(homeWindow.getDescriptionText2());
        descriptionText2.setText(homeWindow.getDescriptionText2());
        descriptionText2.setFont(new Font("Arial", Font.ITALIC, 10));
        descriptionText2.setForeground(new Color(225, 225, 225));
        descriptionText2.setBounds(15, 260, 380, 14);
        add(descriptionText2);

        JLabel descriptionText3 = new JLabel(homeWindow.getDescriptionText3());
        descriptionText3.setText(homeWindow.getDescriptionText3());
        descriptionText3.setFont(new Font("Arial", Font.ITALIC, 10));
        descriptionText3.setForeground(new Color(225, 225, 225));
        descriptionText3.setBounds(15, 280, 380, 14);
        add(descriptionText3);

        JLabel descriptionText4 = new JLabel(homeWindow.getDescriptionText4());
        descriptionText4.setText(homeWindow.getDescriptionText4());
        descriptionText4.setFont(new Font("Arial", Font.ITALIC, 10));
        descriptionText4.setForeground(new Color(225, 225, 225));
        descriptionText4.setBounds(15, 300, 380, 14);
        add(descriptionText4);

        JLabel descriptionText5 = new JLabel(homeWindow.getDescriptionText5());
        descriptionText5.setText(homeWindow.getDescriptionText5());
        descriptionText5.setFont(new Font("Arial", Font.ITALIC, 10));
        descriptionText5.setForeground(new Color(225, 225, 225));
        descriptionText5.setBounds(15, 320, 380, 14);
        add(descriptionText5);

        JLabel descriptionText6 = new JLabel(homeWindow.getDescriptionText6());
        descriptionText6.setText(homeWindow.getDescriptionText6());
        descriptionText6.setFont(new Font("Arial", Font.ITALIC, 10));
        descriptionText6.setForeground(new Color(225, 225, 225));
        descriptionText6.setBounds(15, 340, 380, 14);
        add(descriptionText6);


        /*Three JButton components (aboutMe_Button, work_Button, and contact_Button) are 
        created and added to the frame. They display text and icons obtained from the 
        homeWindow object. The buttons are customized with fonts, colors, borders, and backgrounds. 
        Action listeners are added to each button to handle their respective actions when clicked. 
        These actions involve disposing the current frame, creating new window instances, and making them visible.*/
        
        JButton aboutMe_Button = new JButton(homeWindow.getAboutMeButton(), homeWindow.getAboutMeIcon());
        aboutMe_Button.setText(homeWindow.getAboutMeButton());
        aboutMe_Button.setFont(new Font("Arial", Font.BOLD, 15));
        aboutMe_Button.setForeground(new Color(0, 0, 0));
        aboutMe_Button.setBorder(new LineBorder(getForeground(), 1));
        aboutMe_Button.setBackground(new Color(225, 225, 225));
        aboutMe_Button.setBounds(15, 425, 125, 49);
        aboutMe_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                aboutMeWindow aboutMeWindow = new aboutMeWindow();
                aboutMeFrame aboutMeFrame = new aboutMeFrame(aboutMeWindow);
                aboutMeFrame.setVisible(true);
            }
        });
        add(aboutMe_Button);

        JButton work_Button = new JButton(homeWindow.getWorkButton(), homeWindow.getWorkIcon());
        work_Button.setText(homeWindow.getWorkButton());
        work_Button.setFont(new Font("Arial", Font.BOLD, 15));
        work_Button.setForeground(new Color(0, 0, 0));
        work_Button.setBorder(new LineBorder(getForeground(), 1));
        work_Button.setBackground(new Color(225, 225, 225));
        work_Button.setBounds(165, 425, 115, 49);
        work_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                workWindow workWindow = new workWindow();
                workFrame workFrame = new workFrame(workWindow);
                workFrame.setVisible(true);
            }
        });
        add(work_Button);

        JButton contact_Button = new JButton(homeWindow.getContactButton(), homeWindow.getContactIcon());
        contact_Button.setText(homeWindow.getContactButton());
        contact_Button.setFont(new Font("Arial", Font.BOLD, 15));
        contact_Button.setForeground(new Color(0, 0, 0));
        contact_Button.setBorder(new LineBorder(getForeground(), 1));
        contact_Button.setBackground(new Color(225, 225, 225));
        contact_Button.setBounds(305, 425, 115, 49);
        contact_Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                contactWindow contactWindow = new contactWindow();
                contactFrame contactFrame = new contactFrame(contactWindow);
                contactFrame.setVisible(true);
            }
        });
        add(contact_Button);
        
        //* the frame is set to be visible to display all the added components.
        setVisible(true);

    }
    
}

