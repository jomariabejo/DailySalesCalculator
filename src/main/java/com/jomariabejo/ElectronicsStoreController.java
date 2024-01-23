package com.jomariabejo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ElectronicsStoreController {

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
        try {

            PhoneCheckoutService soldPhoneService = new PhoneCheckoutService();
            /**
             * Show phone calculation to UI fields after performing computations
             */
            soldPhoneService.setPrice(Double.parseDouble(txtField_phone_sold_price.getText()));
            soldPhoneService.setQuantitySold(Integer.parseInt(txtField_quantitySold.getText()));


            RepairService repairService = new RepairService();
            /**
             * Show repair calculation to UI fields after performing computations.
             */
            repairService.setPricePerHour(Integer.parseInt(txtField_repair_service_pricePerHour.getText()));
            repairService.setTotalHoursWorked(Integer.parseInt(txtField_repair_service_numberOfHours.getText()));

            /**
             * Display Computed Result
             */
            Alert informationAlert = new Alert(Alert.AlertType.INFORMATION);
            String phpSymbol = StringUtil.getPhilippinePesoSymbol();
            double combineTotalSale = ((repairService.calculateTotalSales()) + soldPhoneService.calculateTotalSales());

            informationAlert.setContentText("Phone Sold Total Sale =      " + phpSymbol + " " + soldPhoneService.calculateTotalSales() + "\n" +
                    "Repair Service Total Sale = " + phpSymbol + " " + repairService.calculateTotalSales() + "\n" +
                    "Combined Total Sale =       " + phpSymbol + " " + combineTotalSale);
            // Show computation result via console
            System.out.println("Phone Sold Total Sale = " + phpSymbol + " " + soldPhoneService.calculateTotalSales() + "\n" +
                    "Repair Service Total Sale = " + phpSymbol + " " + repairService.calculateTotalSales() + "\n" +
                    "Combined Total Sale =       " + phpSymbol + " " + combineTotalSale);

            informationAlert.show();
        } catch (NumberFormatException e) {
            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Invalid input " + e.getMessage() + " , please try again.");
            errorAlert.show();
            e.getStackTrace();
        }
    }
}
