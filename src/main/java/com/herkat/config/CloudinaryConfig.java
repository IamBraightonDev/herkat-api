package com.herkat.config;

import com.cloudinary.Cloudinary;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudinaryConfig {

    @Bean
    public Cloudinary cloudinary() {
        Dotenv dotenv = Dotenv.load(); // Carga las variables del archivo .env
        return new Cloudinary(dotenv.get("CLOUDINARY_URL")); // Usa la variable del .env
    }
}
