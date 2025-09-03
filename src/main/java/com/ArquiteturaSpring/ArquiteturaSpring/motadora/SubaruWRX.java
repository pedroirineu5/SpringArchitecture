package com.ArquiteturaSpring.ArquiteturaSpring.motadora;

import java.awt.*;

public class SubaruWRX extends Carro{
    public SubaruWRX(Motor motor){
        super(motor);
        setCor(Color.BLACK);
        setModelo("WRX");
        setMontadora(Montadora.SUBARU);
    }
}
