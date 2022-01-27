/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radio.station.controller;

import javax.usb.UsbException;
import javax.usb.UsbHostManager;
import javax.usb.UsbServices;
import radio.station.controller.usb.UsbConnect;


/**
 *
 * @author Koles
 */
public class RadioStationController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UsbException {
        System.out.println("Hello world!");
        UsbConnect uc = new UsbConnect();
        UsbServices services = UsbHostManager.getUsbServices();
        uc.dump(services.getRootUsbHub(), 0);
    }
    
}
