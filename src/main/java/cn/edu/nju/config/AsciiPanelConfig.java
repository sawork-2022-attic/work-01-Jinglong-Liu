package cn.edu.nju.config;

import asciiPanel.AsciiPanel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class AsciiPanelConfig {

    @Bean("drakePanel")
    public AsciiPanel drake_10x10_AsciiPanel(){
        return new AsciiPanel(80,24,new AsciiFontConfig().drake_10x10_AsciiFont());
    }
    @Bean("cp437Panel")
    public AsciiPanel cp437_10x10_AsciiPanel(){
        return new AsciiPanel(80,24,new AsciiFontConfig().cp437_16x16_AsciiFont());
    }
}
