
//* This line declares the package name MyPortfolio, under which the class homeWindow resides.
package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

/* This line imports the JFrame class from the javax.swing package. 
The JFrame class is used to create a window in Java Swing. */
import javax.swing.*;

//* This code defines an interface named FullName with a single method getFullName(). 
interface FullName {
    String getFullName();
}

/* The following code defines several more interfaces, each with a single method.
 * These interfaces are named CollegeDepartment, University, HomePicture, DescriptionText1,
 * DescriptionText2, DescriptionText3, DescriptionText4, DescriptionText5, DescriptionText6,
 * AboutMeIcon, AboutMeButton, WorkIcon, WorkButton, ContactIcon, and ContactButton. 
 * Each interface represents a specific functionality that the homeWindow class wants to 
 * provide. */

interface CollegeDepartment {
    String getCollegeDepartment();
}

interface University {
    String getUniversity();
}

interface HomePicture {
    ImageIcon getHomePicture();
}

interface DescriptionText1 {
    String getDescriptionText1();
}

interface DescriptionText2 {
    String getDescriptionText2();
}

interface DescriptionText3 {
    String getDescriptionText3();
}

interface DescriptionText4 {
    String getDescriptionText4();
}

interface DescriptionText5 {
    String getDescriptionText5();
}

interface DescriptionText6 {
    String getDescriptionText6();
} 

interface AboutMeIcon {
    ImageIcon getAboutMeIcon();
}

interface AbooutMeButton {
    String getAboutMeButton();
}

interface WorkIcon {
    ImageIcon getWorkIcon();
}

interface WorkButton {
    String getWorkButton();
}

interface ContactIcon {
    ImageIcon getContactIcon();
}

interface ContactButton {
    String getContactButton();
}


/* This line declares the homeWindow class, which extends the JFrame class
 * and implements all the interfaces mentioned above. By implementing these 
 * interfaces, the homeWindow class provides the required functionality 
 * defined in each interface. */
public class homeWindow extends JFrame implements FullName, CollegeDepartment, University, HomePicture,DescriptionText1, DescriptionText2, DescriptionText3, DescriptionText4, DescriptionText5, DescriptionText6, AboutMeIcon, AbooutMeButton, WorkIcon, WorkButton, ContactIcon, ContactButton {

    //* This line marks the beginning of the main method, which serves as the entry point of the Java program.
    public static void main(String[] args) {
        
        //* This line creates an instance of the homeWindow class using the default constructor and assigns it to a variable named homeWindow.
        homeWindow homeWindow = new homeWindow();
        //** This line creates an instance of the homeFrame class, passing the homeWindow instance as a parameter to its constructor.
        homeFrame homeFrame = new homeFrame(homeWindow);
    }

    /* This code overrides the getFullName() method from the FullName interface and 
     * provides the implementation. It returns the full name as a string.*/
    @Override
    public String getFullName() {
        return "Karen Pearl V. Pabilando";
    }

    /* The remaining code in the class follows the same pattern, providing 
     * implementations for the methods defined in the various interfaces. 
     * Each method returns the required information or objects. */
    
    @Override
    public ImageIcon getHomePicture() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\homePicture.png");
    }

    @Override
    public String getUniversity() {
        return "National University-Manila";
    }

    @Override
    public String getCollegeDepartment() {
       return "College of Computing and Information Technologies";
    }

    @Override
    public String getDescriptionText1() {
        return "\"As you navigate through my portfolio, I am confident that you will discern";
    }

    @Override
    public String getDescriptionText6() {
        return "in inspiring collaborations on future projects.\"";
    }

    @Override
    public String getDescriptionText5() {
        return "my skills. It is with great enthusiasm that I anticipate the prospect of engaging";
    }

    @Override
    public String getDescriptionText4() {
        return "continuous growth and learning, always seeking new avenues to expand";
    }

    @Override
    public String getDescriptionText3() {
        return "and relentless pursuit of excellence. I maintain an unwavering dedication to";
    }
  
    @Override
    public String getDescriptionText2() {
        return "my unwavering commitment to professionalism, meticulous attention to detail,";
    }

    @Override
    public ImageIcon getAboutMeIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\aboutMe.png");
    }

    @Override
    public String getAboutMeButton() {
        return "ABOUT ME";
    }

    @Override
    public ImageIcon getWorkIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\workButton.png");
    }

    @Override
    public String getWorkButton() {
        return "WORK";
    }

    @Override
    public ImageIcon getContactIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\contactButton.png");
    }

    @Override
    public String getContactButton() {
        return "CONTACT";
    }
    
}
    

