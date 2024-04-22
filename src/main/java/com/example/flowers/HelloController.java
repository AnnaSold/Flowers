package com.example.flowers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    Label counter;

    @FXML
    ImageView Geran;

    @FXML
    ImageView Krokus;

    @FXML
    ImageView Fialka;

    ImageView[] massiv = {Geran, Krokus, Fialka};

    public void masha() {
        ImageView temp = massiv[2];
        massiv[2] = massiv[1];
        massiv[1] = temp;
        double xtemp =
    }


    public void tanya() {
        ImageView temp = massiv[0];
        massiv[0] = massiv[1];
        massiv[1] = temp;

    }

    public void dayPassed() {
        masha();
        tanya();
    }
}
