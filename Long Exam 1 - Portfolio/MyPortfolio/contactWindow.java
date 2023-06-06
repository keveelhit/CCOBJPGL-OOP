package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

//* Importing the JFrame class from the javax.swing package.
import javax.swing.*;

//* Declaration of the ContactFrameImage interface with a method getContactFrameImage() that returns an ImageIcon object.
interface ContactFrameImage {
    ImageIcon getContactFrameImage();
}

//* ContactInfoTitle: Defines the getContactInfoTitle() method that returns a String.
interface ContactInfoTitle {
    String getContactInfoTitle();
}

//* OutlookIcon: Defines the getOutlookIcon() method that returns an ImageIcon.
 interface OutlookIcon {
    ImageIcon getOutlookIcon();
 }

//* OutlookText: Defines the getOutlookText() method that returns a String.
 interface OutlookText {
    String getOutlookText();
 }

//* GmailIcon: Defines the getGmailIcon() method that returns an ImageIcon.
 interface GmailIcon {
    ImageIcon getGmailIcon();
 }

//* GmailText: Defines the getGmailText() method that returns a String.
 interface GmailText {
    String getGmailText();
 }

//* LinkedInIcon: Defines the getLinkedInIcon() method that returns an ImageIcon.
 interface LinkedInIcon {
    ImageIcon getLinkedInIcon();
 }

//* LinkedInText: Defines the getLinkedInText() method that returns a String.
 interface LinkedInText {
    String getLinkedInText();
 }

//* InstagramIcon: Defines the getInstagramIcon() method that returns an ImageIcon.
 interface InstagramIcon {
    ImageIcon getInstagramIcon();
 }

//* InstagramText: Defines the getInstagramText() method that returns a String.
 interface InstagramText {
    String getInstagramText();
 }

//* HomeButtonIcon: Defines the getHomeButtonIcon() method that returns an ImageIcon.
 interface HomeButtonIcon {
    ImageIcon getHomeButtonIcon();
 }

//* HomeButton: Defines the getHomeButton() method that returns a String.
interface HomeButton {
    String getHomeButton();
}

//* Definition of the contactWindow class that extends JFrame and implements all the previously defined interfaces.
public class contactWindow extends JFrame implements ContactFrameImage, ContactInfoTitle, OutlookIcon, OutlookText, GmailIcon, GmailText, LinkedInIcon, LinkedInText, InstagramIcon, InstagramText, HomeButtonIcon, HomeButton {

    /*The main method of the contactWindow class that creates an instance of 
    contactWindow, creates an instance of contactFrame with the contactWindow object, 
    and sets the frame visible.*/
    public static void main(String[] args) {
        contactWindow contactWindow = new contactWindow();
        contactFrame contactFrame = new contactFrame(contactWindow);
        contactFrame.setVisible(true);
    }

    //* getHomeButton: Returns the string "HOME".
    @Override
    public String getHomeButton() {
        return "HOME";
    }

    //* getHomeButtonIcon: Returns an ImageIcon object with the specified image file path.
    @Override
    public ImageIcon getHomeButtonIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\homeButton_icon.png");
    }

    //* getInstagramText: Returns the string "Instagram: @envember".
    @Override
    public String getInstagramText() {
        return "Instagram: @envember";
    }

    //* getInstagramIcon: Returns an ImageIcon object with the specified image file path.
    @Override
    public ImageIcon getInstagramIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\instagram_icon.png");
    }

    //* getLinkedInText: Returns the string "LinkedIn: www.linkedin.com/in/pabilandokarenpv".
    @Override
    public String getLinkedInText() {
        return "LinkedIn: www.linkedin.com/in/pabilandokarenpv";
    }

    //* getLinkedInIcon: Returns an ImageIcon object with the specified image file path.
    @Override
    public ImageIcon getLinkedInIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\linkedIn_icon.png");
    }

    //* getGmailText: Returns the string "Gmail: pabilando.karenpv@gmail.com".
    @Override
    public String getGmailText() {
        return "Gmail: pabilando.karenpv@gmail.com";
    }

    //* getGmailIcon: Returns an ImageIcon object with the specified image file path.
    @Override
    public ImageIcon getGmailIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\gmail_icon.png");
    }

    //* getOutlookText: Returns the string "Oulook: pabilando.karenpv@outlook.com".
    @Override
    public String getOutlookText() {
        return "Oulook: pabilando.karenpv@outlook.com";
    }

    //* getOutlookIcon: Returns an ImageIcon object with the specified image file path.
    @Override
    public ImageIcon getOutlookIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\outlookIcon.png");
    }

    //* getContactInfoTitle: Returns the string "Contact Information".
    @Override
    public String getContactInfoTitle() {
        return "Contact Information";
    }

    //* getContactFrameImage: Returns an ImageIcon object with the specified image file path.
    @Override
    public ImageIcon getContactFrameImage() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\contactPhoto.jpg");
    }

}