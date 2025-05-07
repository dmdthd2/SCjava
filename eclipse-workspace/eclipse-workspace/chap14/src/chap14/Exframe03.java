package chap14;
import javax.swing.*;
import java.awt.*;

public class Exframe03 extends JFrame {

    public Exframe03() {
        setTitle("두번째 윈도우 프로그램");
        setSize(400,200);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        
        
        JButton obg1 = new JButton("프로그램 실행");
        JButton obg2 = new JButton("프로그램 종료");
        
        panel.add(obg1);
        panel.add(obg2);
        
        add(panel);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Exframe03();
    }
}
