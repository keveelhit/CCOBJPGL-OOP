package MyPortfolio;

/** 
 * Author: Karen Pearl V. Pabilando
 * Section: INF224
 * Course: Object-Oriented Programming (CCOBJPGL)
**/

//* Importing the necessary class JFrame from the javax.swing package.
import javax.swing.*;

//* Declaration of an interface FrameTitle with a method getFrameTitle() that returns a String.
interface FrameTitle {
    String getFrameTitle();
}

//* WritionTitle: Defines getWritionTitle() method.
interface WritionTitle {
    String getWritionTitle();
}

//* AwardTitle: Defines getAwardTitle() method.
interface AwardTitle {
    String getAwardTitle();
}

//* DescriptionText1: Defines getDescriptionText1() method.
interface DescriptionText1 {
    String getDescriptionText1();
}

//* DescriptionText2: Defines getDescriptionText2() method.
interface DescriptionText2 {
    String getDescriptionText2();
}

//* DescriptionText3: Defines getDescriptionText3() method.
interface DescriptionText3 {
    String getDescriptionText3();
}

//* DescriptionText4: Defines getDescriptionText4() method.
interface DescriptionText4 {
    String getDescriptionText4();
}

//* DescriptionText5: Defines getDescriptionText5() method.
interface DescriptionText5 {
    String getDescriptionText5();
}

//* MobileAppIcon: Defines getMobileAppIcon() method.
interface MobileAppIcon {
    ImageIcon getMobileAppIcon();
}

//* PrototypeIcon: Defines getPrototypeIcon() method.
interface PrototypeIcon {
    ImageIcon getPrototypeIcon();
}

//* PrototypeText: Defines getPrototypeText() method.
interface PrototypeText {
    String getPrototypeText();
}

//* DesignIcon: Defines getDesignIcon() method.
interface DesignIcon {
    ImageIcon getDesignIcon();
}

//* DesignText: Defines getDesignText() method.
interface DesignText {
    String getDesignText();
}

//* HomeButtonIcon: Defines getHomeButtonIcon() method.
interface HomeButtonIcon {
    ImageIcon getHomeButtonIcon();
}

//* HomeButton: Defines getHomeButton() method.
interface HomeButton {
    String getHomeButton();
}

//* Definition of the workWindow class which extends JFrame and implements all the previously declared interfaces.
public class workWindow extends JFrame implements FrameTitle, WritionTitle, AwardTitle, DescriptionText1, DescriptionText2, DescriptionText3, DescriptionText4, DescriptionText5, MobileAppIcon, PrototypeIcon, PrototypeText, DesignIcon, DesignText, HomeButtonIcon, HomeButton  {
    
    //* The main method of the workWindow class, where an instance of workWindow and workFrame are created and the workFrame is set to be visible.
    public static void main(String[] args) {
        workWindow workWindow = new workWindow();
        workFrame workFrame = new workFrame(workWindow);
        workFrame.setVisible(true);
    }

    //* getFrameTitle(): Returns the frame title.
    @Override
    public String getFrameTitle() {
        return "Application Design and Prototype";
    }

    //* getWritionTitle(): Returns the Writion title.
    @Override
    public String getWritionTitle() {
        return "writion | Mobile Application";
    }

     //* getAwardTitle(): Returns the award title.
    @Override
    public String getAwardTitle() {
        return "CCIT's Choice Awardee in Nazareth School of National University";
    }
    
    //* getDescriptionText1(): Returns the first description text.
    @Override
    public String getDescriptionText1() {
        return "Writion is dedicated to scholars, academics, and language learners. It is designed with";
    }

    //* getDescriptionText2(): Returns the second description text.
    @Override
    public String getDescriptionText2() {
        return "a minimalist and multi-purpose approach.  It has 3 in 1 functionality that develops and strengthens";
    }

    //* getDescriptionText3(): Returns the third description text.
    @Override
    public String getDescriptionText3() {
        return "time management, organization, productivity, maintained focus, and the retention capability of an";
    }

     //* getDescriptionText4(): Returns the fourth description text.
    @Override
    public String getDescriptionText4() {
        return "individual's memory. It is best use for improving one's performance in a professional and";
    }

    //* getMobileAppIcon(): Returns the mobile app icon.
    @Override
    public ImageIcon getMobileAppIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\writionPicture.png");
    }

    //* getPrototypeIcon(): Returns the prototype icon.
    @Override
    public ImageIcon getPrototypeIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\writionPrototype_image.png");
    }

    //* getPrototypeText(): Returns the prototype text.
    @Override
    public String getPrototypeText() {
        return "PROTOTYPE";
    }

    //* getDesignIcon(): Returns the design icon.
    @Override
    public ImageIcon getDesignIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\NetBeansProjects\\My Portfiolio in OOP\\src\\Portfolio\\writionDesign_image.png");
    }

    //* getDesignText(): Returns the design text.
    @Override
    public String getDesignText() {
        return "DESIGN";
    }

    //* getHomeButtonIcon(): Returns the home button icon.
    @Override
    public ImageIcon getHomeButtonIcon() {
        return new ImageIcon("C:\\Users\\Karen Pabilando\\OneDrive\\Documents\\VSCODE JAVA\\My Portfolio in OOP\\src\\homeButton_icon.png");
    }

    //* getHomeButton(): Returns the home button
    @Override
    public String getHomeButton() {
        return "HOME";
    }

    //* getDescriptionText5(): Returns the fifth description text.
    @Override
    public String getDescriptionText5() {
        return "academical setting.";
    }
}
