package com.ArquiteturaSpring.ArquiteturaSpring.motadora.configuration;


import com.ArquiteturaSpring.ArquiteturaSpring.motadora.Motor;
import com.ArquiteturaSpring.ArquiteturaSpring.motadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor(){
        var motor = new Motor();
        motor.setCavalos(1000);
        motor.setCilindros(100);
        motor.setLitragem(100.00);
        motor.setTipo(TipoMotor.ELETRICO);
        motor.setModelo("GOHORSE");
        return motor;
    }
}
