package LibrarySystemLoginFeature;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LibrarySystem {

	public static void LoginModule() {
		
		JFrame libraryManagementDashboard = new JFrame("Library System Login");
		JPanel mainPanel = new JPanel();
		JLabel libraryManagementLabel = new JLabel("Library Management - JavaTpoint");
		JButton adminLoginButton = new JButton("Admin Login");
		JButton librarianLoginButton = new JButton("Librarian Login");
		
		// Library Management - JavaTpoint Settings
		libraryManagementLabel.setBounds(100, 30, 200, 40);
		libraryManagementLabel.setLayout(null);
		libraryManagementLabel.setFont(new Font("Roboto", Font.BOLD, 12));
		
		// Admin Login Button Settings
		adminLoginButton.setBounds(120, 100, 150, 40);
		adminLoginButton.setFocusable(false);
		adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagementDashboard.dispose();
				adminLogin();
			}
		});
		
		// Librarian Login Button Settings
		librarianLoginButton.setBounds(120, 160, 150, 40);
		librarianLoginButton.setFocusable(false);
		librarianLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				libraryManagementDashboard.dispose();
				librarianLogin();
			}
		});
		
		// JPanel Class Settings
		mainPanel.setLayout(null);
		mainPanel.add(libraryManagementLabel);
		mainPanel.add(adminLoginButton);
		mainPanel.add(librarianLoginButton);
		
		
		// Library Management Login Dashboard Settings
		libraryManagementDashboard.setLocation(400, 100);
		libraryManagementDashboard.setSize(400, 300);
//		libraryManagementDashboard.setBounds(0, 0,300, 200);
		libraryManagementDashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libraryManagementDashboard.setLayout(null);
		libraryManagementDashboard.setVisible(true);	
		libraryManagementDashboard.add(mainPanel);
		libraryManagementDashboard.add(libraryManagementLabel);
		libraryManagementDashboard.add(adminLoginButton);
		libraryManagementDashboard.add(librarianLoginButton);
	}
	
	public static void adminLogin() {
		
		JFrame adminLoginFrame = new JFrame("Login as an Admin");
		JPanel adminFramePanel = new JPanel();
		JLabel adminUsername = new JLabel();
		JLabel adminPassword = new JLabel();
		JTextField adminUserInput = new JTextField();
		JPasswordField adminPassInput = new JPasswordField();
		
		adminFramePanel.setLayout(null);
		adminFramePanel.add(adminUsername);
		adminFramePanel.add(adminPassword);
		adminFramePanel.add(adminUserInput);
		adminFramePanel.add(adminPassInput);
		
		adminLoginFrame.setLocation(400, 100);
		adminLoginFrame.setSize(400, 300);
		adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLoginFrame.setLayout(null);
		adminLoginFrame.setVisible(true);
		adminLoginFrame.add(adminFramePanel);
		adminLoginFrame.add(adminUsername);
		adminLoginFrame.add(adminPassword);
		adminLoginFrame.add(adminUserInput);
		adminLoginFrame.add(adminPassInput);
		
	}
	
	public static void librarianLogin() {
		
		JFrame librarianLoginFrame = new JFrame("Login as a Librarian");
		JPanel librarianFramePanel = new JPanel();
		JLabel librarianUsername = new JLabel();
		JLabel librarianPassword = new JLabel();
		JTextField librarianUserInput = new JTextField();
		JPasswordField librarianPassInput = new JPasswordField();
		
		librarianFramePanel.setLayout(null);
		librarianFramePanel.add(librarianUsername);
		librarianFramePanel.add(librarianPassword);
		librarianFramePanel.add(librarianUserInput);
		librarianFramePanel.add(librarianPassInput);
		
		librarianLoginFrame.setLocation(400, 100);
		librarianLoginFrame.setSize(400, 300);
		librarianLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianLoginFrame.setLayout(null);
		librarianLoginFrame.setVisible(true);
		librarianLoginFrame.add(librarianFramePanel);
		librarianLoginFrame.add(librarianUsername);
		librarianLoginFrame.add(librarianPassword);
		librarianLoginFrame.add(librarianUserInput);
		librarianLoginFrame.add(librarianPassInput);
		
	}
	
	public static void main(String[] args) {
		LoginModule();
	}
}
