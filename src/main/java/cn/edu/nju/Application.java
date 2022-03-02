package cn.edu.nju;

import asciiPanel.AsciiPanel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import javax.swing.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        final ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        AsciiPanel myPanel1 = context.getBean("cp437Panel", AsciiPanel.class);
        AsciiPanel myPanel2 = context.getBean("drakePanel", AsciiPanel.class);
        display(myPanel1, "cp347 10x10");
        display(myPanel2, "drake 10x10");
    }
    public static void display(AsciiPanel asciiPanel,String str){
        asciiPanel.write(str);
        JFrame jf = new JFrame(str);
        jf.setBounds(300, 100, 400, 200);
        jf.add(asciiPanel);
        jf.setDefaultCloseOperation(2);
        jf.setVisible(true);
    }
}
