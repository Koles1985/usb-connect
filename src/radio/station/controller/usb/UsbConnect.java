/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package radio.station.controller.usb;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.usb.UsbDevice;
import javax.usb.UsbDisconnectedException;
import javax.usb.UsbException;
import javax.usb.UsbHub;

/**
 *
 * @author Koles
 */
public class UsbConnect {
    static int count = 0;
    public static void dump(UsbDevice device, int level){
        for(int i = 0; i < level; i++){
            System.out.print(" ");
        }
        
            System.out.println(device +" - " + count++);
        
           
        
        if(device.isUsbHub()){
            final UsbHub hub = (UsbHub)device;
            for(UsbDevice child : (List<UsbDevice>) hub.getAttachedUsbDevices()){
                dump(child, level + 1);
            }
        }
    }
    
}
