package PresentationLayer;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class LoginUI implements ActionListener {

    private static JLabel userLabel;
    private static JTextField userText;
    private static JButton button;
    private static JLabel success;
    private static JLabel webTitle;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(700, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.getContentPane().setBackground(Color.CYAN);
        panel.setLayout(null);

        webTitle = new JLabel("Shopping App");
        webTitle.setFont(new Font("SansSerif",Font.BOLD+Font.ITALIC,37));
        webTitle.setBounds(220, 10, 400, 200);
        panel.add(webTitle);


        userLabel = new JLabel("Username");
        userLabel.setBounds(180, 250, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(255, 250, 165, 25);
        panel.add(userText);

        button = new JButton("Login");
        button.setBounds(295, 350, 80, 70);
        button.addActionListener(new LoginUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(282, 200, 165, 25); 
        success.setFont(new Font("Monospaced",Font.BOLD,15));
        panel.add(success);

        frame.setVisible(true);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        String userName = userText.getText();
        
        this.writeToFile(userName);
        // userName.equals("Group2");  {
            
        //     success.setText("Login worked!");
        // }

    }

    public void writeToFile(String username) {
        try {    
            BufferedWriter out = new BufferedWriter(new FileWriter("Usernames.txt", true ));
            out.append(username);
            out.newLine();
            out.close();
        } catch (IOException e1) {
        // TODO Auto-generated catch block
            e1.printStackTrace();
        }
    }

}
