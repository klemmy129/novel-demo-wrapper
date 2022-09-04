package com.klemmy.novel.ghostwriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication( scanBasePackages = {"com.klemmy.novel.ghostwriter","com.klemmy.novelideas.config"})
public class NovelGhostwriterApplication {

  public static void main(String[] args) {
    SpringApplication.run(NovelGhostwriterApplication.class, args);
  }

}
