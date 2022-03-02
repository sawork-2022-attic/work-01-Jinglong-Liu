package cn.edu.nju.config;

import asciiPanel.AsciiFont;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AsciiFontConfig {
    @Bean("cp43716x16")
    public AsciiFont cp437_16x16_AsciiFont(){
        return new AsciiFont("cp437_16x16.png",10,10);
    }
    @Bean("drake10x10")
    public AsciiFont drake_10x10_AsciiFont(){
        return new AsciiFont("drake_10x10.png",10,10);
    }
}
