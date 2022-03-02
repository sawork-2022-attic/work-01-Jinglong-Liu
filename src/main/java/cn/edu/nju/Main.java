package cn.edu.nju;

import asciiPanel.AsciiFont;
import asciiPanel.AsciiPanel;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        final AsciiPanel drakePanel = context.getBean("drakePanel",AsciiPanel.class);
        //final AsciiPanel drakePanel = new AsciiPanel(80,24,context.getBean("drake10x10", AsciiFont.class));
        //final AsciiPanel drakePanel = context.getBean("drakePanel", AsciiPanel.class);
        Application.display(drakePanel,"drakePanel");
        //final AsciiPanel cp437Panel = context.getBean("cp437Panel", AsciiPanel.class);
        //final AsciiPanel cp437Panel = new AsciiPanel(80,24,context.getBean("cp43716x16", AsciiFont.class));
        AsciiPanel cp437Panel = context.getBean("cp437Panel",AsciiPanel.class);
        Application.display(cp437Panel,"cp437Panel");
    }
}
