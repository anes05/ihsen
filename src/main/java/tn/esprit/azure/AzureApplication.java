package tn.esprit.azure;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AzureApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
