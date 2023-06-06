package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

//* Importing necessary classes from the java.awt and javax.swing packages, including event-related classes and border-related classes.
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

//* Definition of the workFrame class that extends JFrame.
class workFrame extends JFrame{

    //* Declaration of private variables workWindow and homeWindow.
    private workWindow workWindow;
    private homeWindow homeWindow;
    
    /*  Constructor for the workFrame class that takes a workWindow object as a parameter 
    and assigns it to the workWindow variable. It then calls the runWorkWindow() method.*/
    public workFrame (workWindow workWindow) {
        this.workWindow = workWindow;
        runWorkWindow();
    }
    
    /*Method runWorkWindow() sets the properties of the frame, such as title, size, 
    layout, background color, location, resizable, and default close operation.*/
    public void runWorkWindow() {
        setTitle("My Work");
        setSize(1000,600);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 102, 102));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /* Creation of a JLabel component for the frame title. It retrieves the frame title
        from workWindow object and sets the label's text, font, foreground color, and position.*/
        JLabel frameTitle = new JLabel(workWindow.getFrameTitle());
        frameTitle.setText(workWindow.getFrameTitle());
        frameTitle.setFont(new Font("Arial", Font.BOLD, 24));
        frameTitle.setForeground(new Color(255, 255, 255));
        frameTitle.setBounds(60, 30, 388, 29);
        add(frameTitle);
        
        //* writionTitle: Creates a label for the Writion title.
        JLabel writionTitle = new JLabel(workWindow.getWritionTitle());
        writionTitle.setText(workWindow.getWritionTitle());
        writionTitle.setFont(new Font("Arial", Font.BOLD,15));
        writionTitle.setForeground(new Color(255, 255, 255));
        writionTitle.setBounds(60, 70, 190, 18);
        add(writionTitle);
        
        //* awardTitle: Creates a label for the award title.
        JLabel awardTitle = new JLabel(workWindow.getAwardTitle());
        awardTitle.setText(workWindow.getAwardTitle());
        awardTitle.setFont(new Font("Arial", Font.ITALIC,15));
        awardTitle.setForeground(new Color(255, 255, 255));
        awardTitle.setBounds(60, 90, 426, 18);
        add(awardTitle);
        
        //* mobileAppIconLabel: Creates a label for the mobile app icon.
        ImageIcon mobileAppIcon = workWindow.getMobileAppIcon();
        JLabel mobileAppIconLabel = new JLabel(mobileAppIcon);
        mobileAppIconLabel.setBounds(70, 115, 294, 400);
        add(mobileAppIconLabel);
        
        //* prototypeIconLabel: Creates a label for the prototype icon.
        ImageIcon prototypeIcon = workWindow.getPrototypeIcon();
        JLabel prototypeIconLabel = new JLabel(prototypeIcon);
        prototypeIconLabel.setBounds(360, 130, 250, 230);
        Border prototypeBorder = BorderFactory.createLineBorder(Color.BLACK, 3);
        prototypeIconLabel.setBorder(prototypeBorder);
        add(prototypeIconLabel);
        
        //* prototypeText: Creates a label for the prototype text.
        JLabel prototypeText = new JLabel(workWindow.getPrototypeText());
        prototypeText.setText(workWindow.getPrototypeText());
        prototypeText.setFont(new Font("Arial", Font.BOLD,15));
        prototypeText.setForeground(new Color(255, 255, 255));
        prototypeText.setBounds(515, 365, 426, 18);
        add(prototypeText);
        
        //* designIconLabel: Creates a label for the design icon.
        ImageIcon designIcon = workWindow.getDesignIcon();
        JLabel designIconLabel = new JLabel(designIcon);
        designIconLabel.setBounds(625, 130, 250, 230);
        Border designBorder = BorderFactory.createLineBorder(Color.BLACK, 3);
        designIconLabel.setBorder(designBorder);
        add(designIconLabel);
        
        //* designText: Creates a label for the design text.
        JLabel designText = new JLabel(workWindow.getDesignText());
        designText.setText(workWindow.getDesignText());
        designText.setFont(new Font("Arial", Font.BOLD,15));
        designText.setForeground(new Color(255, 255, 255));
        designText.setBounds(815, 365, 426, 18);
        add(designText);

        //* descText1: Creates a label for description text 1.
        JLabel descText1 = new JLabel(workWindow.getDescriptionText1());
        descText1.setText(workWindow.getDescriptionText1());
        descText1.setFont(new Font("Arial", Font.ITALIC,12));
        descText1.setForeground(new Color(255, 255, 255));
        descText1.setBounds(360, 400, 551, 16);
        add(descText1);
        
        //* descText2: Creates a label for description text 2.
        JLabel descText2 = new JLabel(workWindow.getDescriptionText2());
        descText2.setText(workWindow.getDescriptionText2());
        descText2.setFont(new Font("Arial", Font.ITALIC,12));
        descText2.setForeground(new Color(255, 255, 255));
        descText2.setBounds(360, 420, 551, 16);
        add(descText2);
        
        //* descText3: Creates a label for description text 3.
        JLabel descText3 = new JLabel(workWindow.getDescriptionText3());
        descText3.setText(workWindow.getDescriptionText3());
        descText3.setFont(new Font("Arial", Font.ITALIC,12));
        descText3.setForeground(new Color(255, 255, 255));
        descText3.setBounds(360, 440, 551, 16);
        add(descText3);
        
        //* descText4: Creates a label for description text 4.
        JLabel descText4 = new JLabel(workWindow.getDescriptionText4());
        descText4.setText(workWindow.getDescriptionText4());
        descText4.setFont(new Font("Arial", Font.ITALIC,12));
        descText4.setForeground(new Color(255, 255, 255));
        descText4.setBounds(360, 460, 551, 16);
        add(descText4);
        
        //* descText5: Creates a label for description text 5.
        JLabel descText5 = new JLabel(workWindow.getDescriptionText5());
        descText5.setText(workWindow.getDescriptionText5());
        descText5.setFont(new Font("Arial", Font.ITALIC,12));
        descText5.setForeground(new Color(255, 255, 255));
        descText5.setBounds(360, 480, 551, 16);
        add(descText5);
        
        /* homeButton: Creates a button for the home button with its text, font, foreground color, border, background color, and position.
        Adds an action listener to the home button. When the button is clicked, it disposes the current frame, creates a new homeWindow 
        object, creates a new homeFrame object with the homeWindow, and sets it visible.*/
        JButton homeButton = new JButton(workWindow.getHomeButton(), workWindow.getHomeButtonIcon());
        homeButton.setText(workWindow.getHomeButton());
        homeButton.setFont(new Font("Arial", Font.BOLD, 15));
        homeButton.setForeground(new Color(0, 0, 0));
        homeButton.setBorder(new LineBorder(getForeground(), 1));
        homeButton.setBackground(new Color(225, 225, 225));
        homeButton.setBounds(830, 30, 115, 49);
        homeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                homeWindow homeWindow = new homeWindow();
                homeFrame homeFrame = new homeFrame(homeWindow);
                homeFrame.setVisible(true);
              
            }
            
        });
        add(homeButton);
        
        //* Sets the visibility of the frame to true, making it visible to the user.
        setVisible(true);
    }
}
