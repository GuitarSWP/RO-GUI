import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * page1
 */
public class page1 extends JFrame {
    public page1 (){
        super("Ragnarok");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        JPanel n = new JPanel();
        n.setLayout(new FlowLayout());
        ImageIcon male = new ImageIcon("male.png");
        ImageIcon female = new ImageIcon("female.png");
        ImageIcon head = new ImageIcon("head.png");
        JLabel mImage = new JLabel(male);
        JLabel fImage = new JLabel(female);
        JLabel hImage = new JLabel(head);
        n.add(hImage);
        JPanel e = new JPanel();
        e.setLayout(new FlowLayout());
        e.add(fImage);
        JPanel w = new JPanel();
        w.setLayout(new FlowLayout());
        w.add(mImage);
        
        
        JPanel m = new JPanel();
        m.setLayout(new BoxLayout(m, BoxLayout.Y_AXIS));
        JPanel textName = new JPanel();
        JLabel textEnter = new JLabel("Enter Name");
        textName.add(textEnter);
        
        JPanel textField = new JPanel();
        JTextField space = new JTextField(25);
        textField.add(space);

        JPanel character = new JPanel();
        character.setLayout(new FlowLayout());
        JLabel textChar = new JLabel("Choose Your Character");
        character.add(textChar);

        JPanel sex = new JPanel();
        sex.setLayout(new GridLayout(1,2));
        JButton setmale = new JButton("MALE");
        JPanel buttonmale = new JPanel();
        buttonmale.add(setmale);
        JButton setfemale = new JButton("FEMALE");
        JPanel buttonfemale = new JPanel();
        buttonfemale.add(setfemale);
        sex.add(buttonmale);
        sex.add(buttonfemale);
        
        m.add(textName);
        m.add(textField);
        m.add(character);
        m.add(sex);
        
        textField.setBorder(BorderFactory.createEmptyBorder(0, 20, 300, 0));
        c.add(n,BorderLayout.NORTH);
        c.add(e,BorderLayout.EAST);
        c.add(w,BorderLayout.WEST);
        
        c.add(m,BorderLayout.CENTER);
        setmale.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Fight(new Monster(),new Male(space.getText()));
                dispose();
            }
        });
        setfemale.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                new Fight(new Monster(),new Female(space.getText()));
                dispose();
            }
        });
        pack();
        setSize(1320,786);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new page1();
    }
}