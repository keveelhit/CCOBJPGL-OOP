package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

//* This line imports the necessary classes from the javax.swing package, which is used for creating graphical user interface components.
import javax.swing.*;

/*This code defines an interface FormalPhoto with a single method getFormalPhoto(). 
Classes implementing this interface should provide 
an implementation for this method that returns an ImageIcon object.*/
interface FormalPhoto {
    ImageIcon getFormalPhoto();
}

/*Similar interfaces are defined for different types of data, such as FullName, HomeAddress, 
PhoneNumber, etc. Each interface defines a single method related to the corresponding data type.*/

interface FullName {
    String getFullName();
}

interface HomeAddress {
    String getHomeAddress();
}

interface PhoneNumber {
    String getPhoneNumber();
}

interface PersonalDataText {
    String getPersonalDataText();
}

interface BirthDate {
    String getBirthDate();
}

interface Nationality {
    String getNationality();
}

interface Religion {
    String getReligion();
}

interface Weight {
    String getWeight();
}

interface HeightText {
    String getHeightText();
}

interface EducationalBackground {
    String getEducationalBackground();
}

interface TertiaryEducation {
    String getTertiaryEducation();
}

interface NULogo {
    ImageIcon getNULogo();
}

interface NUText {
    String getNUText();
}

interface SecondaryEducation {
    String getSecondaryEducation();
}

interface NazarethLogo {
    ImageIcon getNazarethLogo();
}

interface NazarethText {
    String getNazarethText();
}

interface RMHSLogo {
    ImageIcon getRMHSLogo();
}

interface RMHSText {
    String getRMHSText();
}

interface PrimaryEducation {
    String getPrimaryEducation();
}

interface ElemLogo {
    ImageIcon getElemLogo();
}

interface ElemText {
    String getElemText();
}

interface CoreCompetence {
    String getCoreCompetence();
}

interface CoreCompe1 {
    String getCoreCompe1();
}

interface CoreCompe2 {
    String getCoreCompe2();
}

interface CoreCompe3 {
    String getCoreCompe3();
}

interface Achievements {
    String getAchievements();
}

interface Achievements1 {
    String getAchievements1();
}

interface Achievements2{
    String getAchievements2();
}

interface Achievements3 {
    String getAchievements3();
}

interface Achievements4 {
    String getAchievements4();
}

interface Achievements5 {
    String getAchievements5();
}

interface Interest {
    String getInterest();
}

interface Interest1 {
    String getInterest1();
}

interface Interest2 {
    String getInterest2();
}

interface Interest3 {
    String getInterest3();
}

interface Interest4 {
    String getInterest4();
}

interface Interest5 {
    String getInterest5();
}

interface Interest6 {
    String getInterest6();
}

interface Interest7 {
    String getInterest7();
}

interface HomeButtonIcon {
    ImageIcon getHomeButtonIcon();
}

interface HomeButton {
    String getHomeButton();
}

/*This line defines the aboutMeWindow class, which extends the JFrame class and implements
numerous interfaces related to different types of data. The class represents a window that 
displays information about the author of a portfolio. The interfaces specify the methods 
that should be implemented to retrieve specific data.*/
public class aboutMeWindow extends JFrame implements FormalPhoto, FullName, HomeAddress, PhoneNumber, PersonalDataText, BirthDate, Nationality, Religion, Weight, HeightText, EducationalBackground, TertiaryEducation, NULogo, NUText, SecondaryEducation, NazarethLogo, NazarethText, RMHSLogo, RMHSText, PrimaryEducation, ElemLogo, ElemText, CoreCompetence, CoreCompe1, CoreCompe2, CoreCompe3, Achievements, Achievements1, Achievements2, Achievements3, Achievements4, Achievements5, Interest, Interest1, Interest2, Interest3, Interest4, Interest5, Interest6, Interest7, HomeButtonIcon, HomeButton {

    /*This code defines the main method, which serves as the entry point of the program. 
    It creates an instance of the aboutMeWindow class and an instance of the aboutMeFrame
    class (not shown in the provided code), passing the aboutMeWindow instance as a parameter. 
    Finally, it sets the aboutMeFrame to be visible.*/
    public static void main(String[] args) {
        aboutMeWindow aboutMeWindow = new aboutMeWindow();
        aboutMeFrame aboutMeFrame = new aboutMeFrame(aboutMeWindow);
        aboutMeFrame.setVisible(true);
    }
    
    /*The remaining code consists of method implementations for the interfaces. Each method
    returns the corresponding data, such as a full name, address, phone number, etc. Some
    methods return ImageIcon objects for displaying images. The paths to the image files are 
    specified in the implementations.*/
    
    @Override
    public ImageIcon getFormalPhoto() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\formal_pic.jpg");
    }

    @Override
    public String getFullName() {
        return "Karen Pearl V. Pabilando";
    }

    @Override
    public String getHomeAddress() {
        return "1450-2A Gerardo Tuazon Street, Sampaloc Manila, 1008";
    }

    @Override
    public String getPhoneNumber() {
        return "+63391086242";
    }
    
    @Override
    public String getPersonalDataText() {
        return "PERSONAL DATA";
    }

    @Override
    public String getBirthDate() {
        return "Date of Birth: November 26, 2003";  
    }

    @Override
    public String getNationality() {
        return "Nationality: Filipino";
    }

    @Override
    public String getReligion() {
        return "Religion: Roman Catholic";
    }

    @Override
    public String getWeight() {
        return "Weight: 41kg";
    }

    /**
     *
     * @return
     */
    @Override
    public String getHeightText() {
        return "Height: 157.48 cm";
    }

    @Override
    public String getEducationalBackground() {
        return "EDUCATIONAL BACKGROUND";
    }

    @Override
    public String getTertiaryEducation() {
        return "Tertiary Education";
    }

    @Override
    public ImageIcon getNULogo() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\nu_logo.png");
    }

    @Override
    public String getNUText() {
        return "National University - Manila (2022 - Present)";
    }
    
    @Override
    public String getSecondaryEducation() {
        return "Secondary Education";
    }

    @Override
    public ImageIcon getNazarethLogo() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\nazareth_logo.png");
    }

    @Override
    public String getNazarethText() {
        return "Nazareth School of National University (2020 - 2022)";
    }

    @Override
    public ImageIcon getRMHSLogo() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\rmhs_logo.png");
    }

    @Override
    public String getRMHSText() {
        return "Ramon Magsaysay High School (2016 - 2020)";
    }
    
    @Override
    public String getPrimaryEducation() {
        return "Primary Education";
    }

    @Override
    public ImageIcon getElemLogo() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\primarySchool_logo.png");
    }

    @Override
    public String getElemText() {
        return "Sta. Elena Elementary School, Camarines Norte (2009 - 2016)";
    }

    @Override
    public String getCoreCompetence() {
        return "CORE COMPETENCE";
    }

    @Override
    public String getCoreCompe1() {
        return "Adaptability and Teamwork Cooperativeness";
    }

    @Override
    public String getCoreCompe2() {
        return "Oragnization and Management Skills";
    }

    @Override
    public String getCoreCompe3() {
        return "Communicative Excellence ";
    }

    @Override
    public String getInterest() {
        return "INTERESTS";
    }

    @Override
    public String getInterest1() {
        return "Programming with Java and Python";
    }

    @Override
    public String getInterest2() {
        return "Music";
    }

    @Override
    public String getInterest3() {
        return "Application and Web Development";
    }

    @Override
    public String getInterest4() {
        return "Films";
    }

    @Override
    public String getInterest5() {
        return "Digitral Art";
    }

    @Override
    public String getInterest6() {
        return "Graphic Design";
    }

    @Override
    public String getInterest7() {
        return "Writing";
    }

    @Override
    public ImageIcon getHomeButtonIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\homeButton_icon.png");
    }

    @Override
    public String getHomeButton() {
        return "HOME";
    }

    @Override
    public String getAchievements() {
        return "ACHIEVEMENTS";
    }

    @Override
    public String getAchievements1() {
        return "Graduated with High Honor in NU-Nazareth";
    }

     @Override
    public String getAchievements2() {
        return "CCIT's Choice Award in NU-Nazareth";
    }
        
    @Override
    public String getAchievements3() {
        return "Science Elite Team Awardee";
    }

    @Override
    public String getAchievements4() {
        return "Consistent Honor Student (Primary - Secondary)";
    }

    @Override
    public String getAchievements5() {
        return "CCIT's Battle of the Bands Champion";
    }
    
}
