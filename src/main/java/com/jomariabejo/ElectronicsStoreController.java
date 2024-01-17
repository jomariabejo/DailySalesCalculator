package com.jomariabejo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;

public class ElectronicsStoreController  {

    /**
     * Labels
     */

    @FXML
    private Label lbl_number_of_hours;

    @FXML
    private Label lbl_phone_sold_price;

    @FXML
    private Label lbl_price_per_hour;

    @FXML
    private Label lbl_qty_sold;

    /**
     * TextFields
     */

    @FXML
    private TextField txtField_phone_sold_price;

    @FXML
    private TextField txtField_quantitySold;


    @FXML
    private TextField txtField_repair_service_numberOfHours;

    @FXML
    private TextField txtField_repair_service_pricePerHour;


    @FXML
    private TextField txtField_repairServiceTotalSales;

    @FXML
    private TextField txtField_phoneTotalSales;


    public void computeTotalSale(ActionEvent event) {
        System.out.println("Clicked");
    }
}
