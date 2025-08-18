package com.ArquiteturaSpring.ArquiteturaSpring.motadora;

import java.awt.*;

public class HondaHRV extends Carro{
    public HondaHRV(Motor motor){
        super(motor);
        setCor(Color.BLACK);
        setModelo("CIVIC");
        setMontadora(Montadora.HONDA);;
    }
}
