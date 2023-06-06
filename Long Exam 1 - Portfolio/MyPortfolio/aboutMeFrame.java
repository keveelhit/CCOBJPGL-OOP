package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

/*These lines import necessary classes from the java.awt and javax.swing packages.
They are required for creating GUI components and handling events.*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

//*This line defines a class named aboutMeFrame which extends the JFrame class. It represents the main frame of the application.
public class aboutMeFrame extends JFrame {

    /*These lines declare two instance variables of types aboutMeWindow and homeWindow that are 
    used to store references to other windows or frames of the application.*/
    private aboutMeWindow aboutMeWindow;
    private homeWindow homeWindow;
    
    /*This is the constructor for the aboutMeFrame class. It takes an aboutMeWindow object as a parameter and assigns 
    it to the aboutMeWindow instance variable. Then, it calls the runAboutMeWindow method.*/
    public aboutMeFrame(aboutMeWindow aboutMeWindow) {
        this.aboutMeWindow = aboutMeWindow;
        runAboutMeWindow();
    }

    /*This method configures the properties of the aboutMeFrame window. It sets the title, size, layout (null layout),
    background color, location (centered on the screen), and makes the window non-resizable. Additionally, 
    it sets the default close operation to exit the application when the window is closed.*/
    public void runAboutMeWindow() {
        setTitle("ABOUT ME");
        setSize(1000,600);
        setLayout(null);
        getContentPane().setBackground(new Color(0, 102, 102));
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        /*This block of code creates a JLabel named myFullName and sets its properties, such as text, font,
        foreground color, and position. It retrieves the full name from the aboutMeWindow object 
        and assigns it to the JLabel.*/
        JLabel myFullName = new JLabel(aboutMeWindow.getFullName());
        myFullName.setText(aboutMeWindow.getFullName());
        myFullName.setFont(new Font("Arial", Font.BOLD, 30));
        myFullName.setForeground(new Color(255, 255, 255));
        myFullName.setBounds(290, 30, 425, 43);
        add(myFullName);
        
        /*An ImageIcon is created using the getFormalPhoto method of aboutMeWindow 
        and added to a JLabel. A border is created using the BorderFactory class, 
        and the JLabel is given the border.*/
        ImageIcon myFormalPhoto = aboutMeWindow.getFormalPhoto();
        JLabel photoIconLabel = new JLabel(myFormalPhoto);
        photoIconLabel.setBounds(30, 30, 250, 250);
        Border photoBorder = BorderFactory.createLineBorder(Color.BLACK, 3);
        photoIconLabel.setBorder(photoBorder);
        add(photoIconLabel);
        
        /*These lines create a `JLabel` component to display the home address obtained from 
        the `aboutMeWindow` object. The label is customized with a specific font, foreground 
        color, and position within the window.*/
        JLabel homeAddress = new JLabel(aboutMeWindow.getHomeAddress());
        homeAddress.setText(aboutMeWindow.getHomeAddress());
        homeAddress.setFont(new Font("Arial", Font.PLAIN, 14));
        homeAddress.setForeground(new Color(255, 255, 255));
        homeAddress.setBounds(290, 70, 359, 17);
        add(homeAddress);
        
        /*Several JLabels are created and added to the JFrame using the add method. Each JLabel
        displays a specific piece of information such as name, address, date of birth, education,
        achievements, and interests. The information is retrieved from the aboutMeWindow object.*/
        
        JLabel phoneNumber = new JLabel(aboutMeWindow.getPhoneNumber());
        phoneNumber.setText(aboutMeWindow.getPhoneNumber());
        phoneNumber.setFont(new Font("Arial", Font.PLAIN, 14));
        phoneNumber.setForeground(new Color(255, 255, 255));
        phoneNumber.setBounds(290, 90, 104, 17);
        add(phoneNumber);
        
        JLabel personalData = new JLabel(aboutMeWindow.getPersonalDataText());
        personalData.setText(aboutMeWindow.getPersonalDataText());
        personalData.setFont(new Font("Arial", Font.BOLD, 24));
        personalData.setForeground(new Color(255, 255, 255));
        personalData.setBounds(290, 130, 205, 29);
        add(personalData);
        
        JLabel birthDate = new JLabel(aboutMeWindow.getBirthDate());
        birthDate.setText(aboutMeWindow.getBirthDate());
        birthDate.setFont(new Font("Arial", Font.PLAIN, 15));
        birthDate.setForeground(new Color(255, 255, 255));
        birthDate.setBounds(290, 160, 216, 18);
        add(birthDate);
        
        JLabel nationality = new JLabel(aboutMeWindow.getNationality());
        nationality.setText(aboutMeWindow.getNationality());
        nationality.setFont(new Font("Arial", Font.PLAIN, 15));
        nationality.setForeground(new Color(255, 255, 255));
        nationality.setBounds(290, 180, 119, 18);
        add(nationality);
        
        JLabel religion = new JLabel(aboutMeWindow.getReligion());
        religion.setText(aboutMeWindow.getReligion());
        religion.setFont(new Font("Arial", Font.PLAIN, 15));
        religion.setForeground(new Color(255, 255, 255));
        religion.setBounds(290, 200, 165, 18);
        add(religion);
        
        JLabel weight = new JLabel(aboutMeWindow.getWeight());
        weight.setText(aboutMeWindow.getWeight());
        weight.setFont(new Font("Arial", Font.PLAIN, 15));
        weight.setForeground(new Color(255, 255, 255));
        weight.setBounds(290, 220, 85, 18);
        add(weight);
        
        JLabel height = new JLabel(aboutMeWindow.getHeightText());
        height.setText(aboutMeWindow.getHeightText());
        height.setFont(new Font("Arial", Font.PLAIN, 15));
        height.setForeground(new Color(255, 255, 255));
        height.setBounds(290, 240, 118, 18);
        add(height);
        
        JLabel educationalBackground = new JLabel(aboutMeWindow.getEducationalBackground());
        educationalBackground.setText(aboutMeWindow.getEducationalBackground());
        educationalBackground.setFont(new Font("Arial", Font.BOLD, 24));
        educationalBackground.setForeground(new Color(255, 255, 255));
        educationalBackground.setBounds(70, 300, 353, 29);
        add(educationalBackground);
        
        JLabel tertiaryEducation = new JLabel(aboutMeWindow.getTertiaryEducation());
        tertiaryEducation.setText(aboutMeWindow.getTertiaryEducation());
        tertiaryEducation.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 15));
        tertiaryEducation.setForeground(new Color(255, 255, 255));
        tertiaryEducation.setBounds(70,330, 129, 18);
        add(tertiaryEducation);
        
        JLabel nuManila = new JLabel();
        nuManila.setIcon(aboutMeWindow.getNULogo());
        nuManila.setText(aboutMeWindow.getNUText());
        nuManila.setText(aboutMeWindow.getNUText());
        nuManila.setFont(new Font("Arial", Font.PLAIN, 15));
        nuManila.setForeground(new Color(255, 255, 255));
        nuManila.setBounds(70, 350, 350, 27);
        add(nuManila);
        
        JLabel secondaryEducation = new JLabel(aboutMeWindow.getSecondaryEducation());
        secondaryEducation.setText(aboutMeWindow.getSecondaryEducation());
        secondaryEducation.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 15));
        secondaryEducation.setForeground(new Color(255, 255, 255));
        secondaryEducation.setBounds(70,385, 150, 18);
        add(secondaryEducation);
                
        JLabel nazareth = new JLabel();
        nazareth.setIcon(aboutMeWindow.getNazarethLogo());
        nazareth.setText(aboutMeWindow.getNazarethText());
        nazareth.setFont(new Font("Arial", Font.PLAIN, 15));
        nazareth.setForeground(new Color(255, 255, 255));
        nazareth.setBounds(70, 405, 365, 22);
        add(nazareth);
        
        JLabel rmhs = new JLabel();
        rmhs.setIcon(aboutMeWindow.getRMHSLogo());
        rmhs.setText(aboutMeWindow.getRMHSText());
        rmhs.setFont(new Font("Arial", Font.PLAIN, 15));
        rmhs.setForeground(new Color(255, 255, 255));
        rmhs.setBounds(70, 435, 325, 22);
        add(rmhs);
        
        JLabel primaryEducation = new JLabel(aboutMeWindow.getPrimaryEducation());
        primaryEducation.setText(aboutMeWindow.getPrimaryEducation());
        primaryEducation.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 15));
        primaryEducation.setForeground(new Color(255, 255, 255));
        primaryEducation.setBounds(70,465, 131, 18);
        add(primaryEducation);
        
        JLabel elemSchool = new JLabel();
        elemSchool.setIcon(aboutMeWindow.getElemLogo());
        elemSchool.setText(aboutMeWindow.getElemText());
        elemSchool.setFont(new Font("Arial", Font.PLAIN, 15));
        elemSchool.setForeground(new Color(255, 255, 255));
        elemSchool.setBounds(70, 485, 431, 22);
        add(elemSchool);
        
        JLabel coreCompetence = new JLabel(aboutMeWindow.getCoreCompetence());
        coreCompetence.setText(aboutMeWindow.getCoreCompetence());
        coreCompetence.setFont(new Font("Arial", Font.BOLD, 24));
        coreCompetence.setForeground(new Color(255, 255, 255));
        coreCompetence.setBounds(600, 130, 244, 29);
        add(coreCompetence);
        
        JLabel coreCompetence1 = new JLabel(aboutMeWindow.getCoreCompe1());
        coreCompetence1.setText(aboutMeWindow.getCoreCompe1());
        coreCompetence1.setFont(new Font("Arial", Font.PLAIN, 15));
        coreCompetence1.setForeground(new Color(255, 255, 255));
        coreCompetence1.setBounds(600, 160, 288, 18);
        add(coreCompetence1);
        
        JLabel coreCompetence2 = new JLabel(aboutMeWindow.getCoreCompe2());
        coreCompetence2.setText(aboutMeWindow.getCoreCompe2());
        coreCompetence2.setFont(new Font("Arial", Font.PLAIN, 15));
        coreCompetence2.setForeground(new Color(255, 255, 255));
        coreCompetence2.setBounds(600, 180, 288, 18);
        add(coreCompetence2);
        
        JLabel coreCompetence3 = new JLabel(aboutMeWindow.getCoreCompe3());
        coreCompetence3.setText(aboutMeWindow.getCoreCompe3());
        coreCompetence3.setFont(new Font("Arial", Font.PLAIN, 15));
        coreCompetence3.setForeground(new Color(255, 255, 255));
        coreCompetence3.setBounds(600, 200, 288, 18);
        add(coreCompetence3);
        
        JLabel achievements = new JLabel(aboutMeWindow.getAchievements());
        achievements.setText(aboutMeWindow.getAchievements());
        achievements.setFont(new Font("Arial", Font.BOLD, 24));
        achievements.setForeground(new Color(255, 255, 255));
        achievements.setBounds(600, 250, 191, 29);
        add(achievements);
        
        JLabel achievemet1 = new JLabel(aboutMeWindow.getAchievements1());
        achievemet1.setText(aboutMeWindow.getAchievements1());
        achievemet1.setFont(new Font("Arial", Font.PLAIN, 15));
        achievemet1.setForeground(new Color(255, 255, 255));
        achievemet1.setBounds(600, 280, 277, 18);
        add(achievemet1);
        
        JLabel achievemet2 = new JLabel(aboutMeWindow.getAchievements2());
        achievemet2.setText(aboutMeWindow.getAchievements2());
        achievemet2.setFont(new Font("Arial", Font.PLAIN, 15));
        achievemet2.setForeground(new Color(255, 255, 255));
        achievemet2.setBounds(600, 300, 243, 18);
        add(achievemet2);
        
        JLabel achievemet3 = new JLabel(aboutMeWindow.getAchievements3());
        achievemet3.setText(aboutMeWindow.getAchievements3());
        achievemet3.setFont(new Font("Arial", Font.PLAIN, 15));
        achievemet3.setForeground(new Color(255, 255, 255));
        achievemet3.setBounds(600, 320, 188, 18);
        add(achievemet3);
        
        JLabel achievemet4 = new JLabel(aboutMeWindow.getAchievements4());
        achievemet4.setText(aboutMeWindow.getAchievements4());
        achievemet4.setFont(new Font("Arial", Font.PLAIN, 15));
        achievemet4.setForeground(new Color(255, 255, 255));
        achievemet4.setBounds(600, 340, 315, 18);
        add(achievemet4);
        
        JLabel achievemet5 = new JLabel(aboutMeWindow.getAchievements5());
        achievemet5.setText(aboutMeWindow.getAchievements5());
        achievemet5.setFont(new Font("Arial", Font.PLAIN, 15));
        achievemet5.setForeground(new Color(255, 255, 255));
        achievemet5.setBounds(600, 360, 315, 18);
        add(achievemet5);
        
        JLabel interest = new JLabel(aboutMeWindow.getInterest());
        interest.setText(aboutMeWindow.getInterest());
        interest.setFont(new Font("Arial", Font.BOLD, 24));
        interest.setForeground(new Color(255, 255, 255));
        interest.setBounds(600, 410, 135, 29);
        add(interest);
        
        JLabel interest1 = new JLabel(aboutMeWindow.getInterest1());
        interest1.setText(aboutMeWindow.getInterest1());
        interest1.setFont(new Font("Arial", Font.PLAIN, 15));
        interest1.setForeground(new Color(255, 255, 255));
        interest1.setBounds(600, 440, 230, 18);
        add(interest1);
        
        JLabel interest2 = new JLabel(aboutMeWindow.getInterest2());
        interest2.setText(aboutMeWindow.getInterest2());
        interest2.setFont(new Font("Arial", Font.PLAIN, 15));
        interest2.setForeground(new Color(255, 255, 255));
        interest2.setBounds(850, 440, 38, 18);
        add(interest2);
        
        JLabel interest3 = new JLabel(aboutMeWindow.getInterest3());
        interest3.setText(aboutMeWindow.getInterest3());
        interest3.setFont(new Font("Arial", Font.PLAIN, 15));
        interest3.setForeground(new Color(255, 255, 255));
        interest3.setBounds(600, 460, 223, 18);
        add(interest3);
        
        JLabel interest4 = new JLabel(aboutMeWindow.getInterest4());
        interest4.setText(aboutMeWindow.getInterest4());
        interest4.setFont(new Font("Arial", Font.PLAIN, 15));
        interest4.setForeground(new Color(255, 255, 255));
        interest4.setBounds(850, 460, 36, 18);
        add(interest4);
        
        JLabel interest5 = new JLabel(aboutMeWindow.getInterest5());
        interest5.setText(aboutMeWindow.getInterest5());
        interest5.setFont(new Font("Arial", Font.PLAIN, 15));
        interest5.setForeground(new Color(255, 255, 255));
        interest5.setBounds(600, 480, 71, 18);
        add(interest5);
        
        JLabel interest6 = new JLabel(aboutMeWindow.getInterest6());
        interest6.setText(aboutMeWindow.getInterest6());
        interest6.setFont(new Font("Arial", Font.PLAIN, 15));
        interest6.setForeground(new Color(255, 255, 255));
        interest6.setBounds(710, 480, 101, 18);
        add(interest6);
        
        JLabel interest7 = new JLabel(aboutMeWindow.getInterest7());
        interest7.setText(aboutMeWindow.getInterest7());
        interest7.setFont(new Font("Arial", Font.PLAIN, 15));
        interest7.setForeground(new Color(255, 255, 255));
        interest7.setBounds(850, 480, 101, 18);
        add(interest7);
        
        /*These lines create a JButton component labeled "BACK" with a specific font, background color,
        and position within the window. An ActionListener is added to the button to define the action
        to be performed when it is clicked. In this case, it hides the current window (aboutMeFrame) and 
        makes the homeWindow visible.*/
        JButton homeButton = new JButton(aboutMeWindow.getHomeButton(), aboutMeWindow.getHomeButtonIcon());
        homeButton.setText(aboutMeWindow.getHomeButton());
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
        
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //* This line makes the aboutMeFrame window visible by setting its visibility to true.
        setVisible(true);
    }
    
}
