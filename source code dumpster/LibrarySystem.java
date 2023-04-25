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
		JLabel adminText = new JLabel("ADMIN PAGE");
		JLabel adminUsername = new JLabel("Username:");
		JLabel adminPassword = new JLabel("Password:");
		JTextField adminUserInput = new JTextField();
		JPasswordField adminPassInput = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		// Label Settings
		adminText.setBounds(150, 30, 200, 40);
		adminText.setFont(new Font("Roboto",Font.BOLD, 14));
		adminUsername.setBounds(50, 95, 80, 25);
		adminPassword.setBounds(50, 140, 80, 25);
		
		// TextField and PasswordField Settings
		adminUserInput.setLayout(null);
		adminUserInput.setBounds(120, 95, 200, 25);
		adminPassInput.setLayout(null);
		adminPassInput.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(145, 190, 150, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = adminUserInput.getText();
				String password = adminPassInput.getText();
				
				if ((username.equals("Admin_01") && password.equals("AdminOne")) || (username.equals("Admin_02") && password.equals("AdminTwo")) || (username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "SUCCESFULLY LOGIN");
					adminLoginFrame.dispose();
					adminModule();

				} else if ((!username.equals("Admin_01") && password.equals("AdminOne")) || (!username.equals("Admin_02") && password.equals("AdminTwo")) || (!username.equals("Admin_03") && password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME.");
					
				} else if ((username.equals("Admin_01") && !password.equals("AdminOne")) || (username.equals("Admin_02") && !password.equals("AdminTwo")) || (username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT PASSWORD.");
					
				} else if ((!username.equals("Admin_01") && !password.equals("AdminOne")) || (!username.equals("Admin_02") && !password.equals("AdminTwo")) || (!username.equals("Admin_03") && !password.equals("AdminThree"))) {
					JOptionPane.showMessageDialog(adminLoginFrame, "INCORRECT USERNAME and PASSWORD.");
					
				} 
			}
		});
		
		// Frame Panel Settings
		adminFramePanel.setLayout(null);
		adminFramePanel.add(adminText);
		adminFramePanel.add(adminUsername);
		adminFramePanel.add(adminPassword);
		adminFramePanel.add(adminUserInput);
		adminFramePanel.add(adminPassInput);
		adminFramePanel.add(loginButton);
		
		// Admin Frame Settings
		adminLoginFrame.setLocation(400, 100);
		adminLoginFrame.setSize(400, 300);
		adminLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLoginFrame.setLayout(null);
		adminLoginFrame.setVisible(true);
		adminLoginFrame.add(adminFramePanel);
		adminLoginFrame.add(adminText);
		adminLoginFrame.add(adminUsername);
		adminLoginFrame.add(adminPassword);
		adminLoginFrame.add(adminUserInput);
		adminLoginFrame.add(adminPassInput);
		adminLoginFrame.add(loginButton);
		
	}
	
	public static void librarianLogin() {
		
		JFrame librarianLoginFrame = new JFrame("Login as a Librarian");
		JPanel librarianFramePanel = new JPanel();
		JLabel librarianText = new JLabel("LIBRARIAN PAGE");
		JLabel librarianUsername = new JLabel("Username:");
		JLabel librarianPassword = new JLabel("Password:");
		JTextField librarianUserInput = new JTextField();
		JPasswordField librarianPassInput = new JPasswordField();
		JButton loginButton = new JButton("Login");
		
		// Label Settings
		librarianText.setBounds(140, 30, 200, 40);
		librarianText.setFont(new Font("Roboto",Font.BOLD, 14));
		librarianUsername.setBounds(50, 95, 80, 25);
		librarianPassword.setBounds(50, 140, 80, 25);
		
		// TextField and PasswordField Settings
		librarianUserInput.setLayout(null);
		librarianUserInput.setBounds(120, 95, 200, 25);
		librarianPassInput.setLayout(null);
		librarianPassInput.setBounds(120, 140, 200, 25);
		
		loginButton.setLayout(null);
		loginButton.setBounds(145, 190, 150, 40);
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = librarianUserInput.getText();
				String password = librarianPassInput.getText();
				
				if ((username.equals("Librarian_01") && password.equals("LibOne")) || (username.equals("Librarian_02") && password.equals("LibTwo")) || (username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "SUCCESFULLY LOGIN");
					librarianLoginFrame.dispose();
					librarianModule();
			
				} else if ((!username.equals("Librarian_01") && password.equals("LibOne")) || (!username.equals("Librarian_02") && password.equals("LibTwo")) || (!username.equals("Librarian_03") && password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME.");
					
				} else if ((username.equals("Librarian_01") && !password.equals("LibOne")) || (username.equals("Librarian_02") && !password.equals("LibTwo")) || (username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT PASSWORD.");
					
				} else if ((!username.equals("Librarian_01") && !password.equals("LibOne")) || (!username.equals("Librarian_02") && !password.equals("LibTwo")) || (!username.equals("Librarian_03") && !password.equals("LibThree"))) {
					JOptionPane.showMessageDialog(librarianLoginFrame, "INCORRECT USERNAME and PASSWORD.");
					
				} 
			}
		});
		
		// Frame Panel Settings
		librarianFramePanel.setLayout(null);
		librarianFramePanel.add(librarianText);
		librarianFramePanel.add(librarianUsername);
		librarianFramePanel.add(librarianPassword);
		librarianFramePanel.add(librarianUserInput);
		librarianFramePanel.add(librarianPassInput);
		librarianFramePanel.add(loginButton);
		
		// Librarian Frame Settings
		librarianLoginFrame.setLocation(400, 100);
		librarianLoginFrame.setSize(400, 300);
		librarianLoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianLoginFrame.setLayout(null);
		librarianLoginFrame.setVisible(true);
		librarianLoginFrame.add(librarianFramePanel);
		librarianLoginFrame.add(librarianText);
		librarianLoginFrame.add(librarianUsername);
		librarianLoginFrame.add(librarianPassword);
		librarianLoginFrame.add(librarianUserInput);
		librarianLoginFrame.add(librarianPassInput);
		librarianLoginFrame.add(loginButton);
		
	}
	
	public static void adminModule() {
		
		JFrame adminModuleFrame = new JFrame("Admin Module");
		JPanel adminModulePanel = new JPanel();
		JLabel adminModuleText = new JLabel("Welcom to NU Library System");
		
		adminModulePanel.setLayout(null);
		adminModulePanel.add(adminModuleText);
		
		adminModuleText.setBounds(100, 100, 200, 40);
		adminModuleText.setLayout(null);
		adminModuleText.setFont(new Font("Roboto", Font.BOLD, 12));
		
		adminModuleFrame.setLocation(400, 100);
		adminModuleFrame.setSize(400, 300);
		adminModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminModuleFrame.setLayout(null);
		adminModuleFrame.setVisible(true);
		adminModuleFrame.add(adminModulePanel);
		adminModuleFrame.add(adminModuleText);
	}
	
	public static void librarianModule() {
		
		JFrame libModuleFrame = new JFrame("Librarian Module");
		JPanel libModulePanel = new JPanel();
		JLabel libModuleText = new JLabel("Electronic Book Rental System");
		
		libModuleText.setBounds(200, 30, 200, 40);
		libModuleText.setLayout(null);
		libModuleText.setFont(new Font("Roboto", Font.BOLD, 12));
		
		JLabel bookIndex1 = new JLabel("1.");
		bookIndex1.setBounds(50, 95, 80, 25);
		JLabel bookIndex2 = new JLabel("2.");
		bookIndex2.setBounds(50, 120, 80, 25);
		JLabel bookIndex3 = new JLabel("3.");
		bookIndex3.setBounds(50, 145, 80, 25);
		
		JLabel bookTitle1 = new JLabel("The Song of Achilles");
		bookTitle1.setBounds(70, 95, 150, 25);
		JLabel bookTitle2 = new JLabel("The Book Thief");
		bookTitle2.setBounds(70, 120, 150, 25);
		JLabel bookTitle3 = new JLabel("Pride and Prejudice");
		bookTitle3.setBounds(70, 145, 150, 25);
		
		JLabel bookAuthor1 = new JLabel("Madeline Miller");
		bookAuthor1.setBounds(200, 95, 150, 25);
		JLabel bookAuthor2 = new JLabel( "Markus Zusak");
		bookAuthor2.setBounds(200, 120, 150, 25);
		JLabel bookAuthor3 = new JLabel("Jane Austen");
		bookAuthor3.setBounds(200, 145, 150, 25);
		
		libModulePanel.setLayout(null);
		libModulePanel.add(libModuleText);
		libModulePanel.add(bookIndex1);
		libModulePanel.add(bookIndex2);
		libModulePanel.add(bookIndex3);
		libModulePanel.add(bookTitle1);
		libModulePanel.add(bookTitle2);
		libModulePanel.add(bookTitle3);
		libModulePanel.add(bookAuthor1);
		libModulePanel.add(bookAuthor2);
		libModulePanel.add(bookAuthor3);
		
		libModuleFrame.setLocation(400, 100);
		libModuleFrame.setSize(400, 300);
		libModuleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		libModuleFrame.setLayout(null);
		libModuleFrame.setVisible(true);
		libModuleFrame.add(libModulePanel);
		libModuleFrame.add(libModuleText);
		libModuleFrame.add(bookIndex1);
		libModuleFrame.add(bookIndex2);
		libModuleFrame.add(bookIndex3);
		libModuleFrame.add(bookTitle1);
		libModuleFrame.add(bookTitle2);
		libModuleFrame.add(bookTitle3);
		libModuleFrame.add(bookAuthor1);
		libModuleFrame.add(bookAuthor2);
		libModuleFrame.add(bookAuthor3);
		
	}
	
	public static void main(String[] args) {
		LoginModule();
	}
}
