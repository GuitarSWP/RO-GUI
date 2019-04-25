import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Fight
 */
public class Fight extends JFrame {
    Monster monster;
    public Fight(Monster mons,Novice novice){
        super("Ragnarok");
        monster = mons;
        Container c = getContentPane();
        c.setLayout(new GridLayout(3,1));

        ImageIcon novicePic = new ImageIcon(novice.getPic());
        ImageIcon monsterPic = new ImageIcon(monster.getPic());
        JLabel noviceImage = new JLabel(novicePic);
        JLabel monsterImage = new JLabel(monsterPic);
        JPanel g1 = new JPanel();
        g1.setLayout(new GridLayout(1,2));
        JPanel left1 = new JPanel();
        left1.setLayout(new BorderLayout());
        left1.add(noviceImage, BorderLayout.CENTER);
        JPanel right1 = new JPanel();
        right1.setLayout(new BorderLayout());
        right1.add(monsterImage,BorderLayout.CENTER);
        g1.add(left1);
        g1.add(right1);

        


        JPanel g3 = new JPanel();
        g3.setLayout(new GridLayout(1,2));
        JPanel left3 = new JPanel();
        left3.setLayout(new BoxLayout(left3, BoxLayout.Y_AXIS));
        
        JLabel nvName = new JLabel("NAME: "+ novice.getName());
        JLabel nvSex = new JLabel("SEX: "+novice.getSex());
        JLabel nvHp = new JLabel("HP: "+novice.getHp());
        JLabel nvExp = new JLabel("EXP: "+novice.getExp());
        JLabel nvLevel = new JLabel("LEVEL: "+novice.getLevel());
        JLabel nvkill = new JLabel("Kill: "+novice.getkill());
        left3.add(nvName);
        left3.add(nvSex);
        left3.add(nvHp);
        left3.add(nvExp);
        left3.add(nvLevel);
        left3.add(nvkill);
        JPanel right3 = new JPanel();
        right3.setLayout(new BoxLayout(right3, BoxLayout.Y_AXIS));
        
        JLabel mtName = new JLabel("NAME: "+monster.getName());
        JLabel mtHp = new JLabel("HP: "+monster.getHp());
        right3.add(mtName);
        right3.add(mtHp);
        g3.add(left3);
        g3.add(right3);

        JPanel g2 = new JPanel();
        g2.setLayout(new FlowLayout());
        JButton setFight = new JButton("FIGHT!");
        JPanel buttonfight = new JPanel();
        buttonfight.add(setFight);
        g2.add(buttonfight);
        setFight.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                novice.takingDamage(monster.getDamage());   
                monster.takingDamage(novice.getAtk());
                nvHp.setText("Hp: " + novice.getHp());
                mtHp.setText("Hp: "+ monster.getHp());

                if(monster.getHp() <= 0){
                    novice.getExpUp(monster.getExp());
                    nvExp.setText("Exp: " + novice.getExp());
                    monster = new Vadon();
                    mtHp.setText("Hp: "+ monster.getHp());
                    mtName.setText("NAME: "+monster.getName());
                    novice.getkillup();
                    nvkill.setText("Kill: "+novice.getkill());
                    
                }

                if(novice.getExp() >= 100){
                    novice.setExp();
                    novice.setHp();
                    nvHp.setText("Hp: "+ novice.getHp());
                    nvExp.setText("Exp: " + novice.getExp());
                    novice.LevelUp();
                    nvLevel.setText("Level: " + novice.getLevel());
                }
                if(novice.getHp()<=0){
                    novice.setHp();
                    nvHp.setText("Hp: "+ novice.getHp());
                }

            }
        });

        c.add(g1);
        c.add(g2);
        c.add(g3);
        setSize(800, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
}