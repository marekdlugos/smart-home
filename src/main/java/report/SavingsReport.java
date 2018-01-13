package report;

import device.Device;

import java.util.List;


/**
 * Report that will generate a list of all devices that were switched on and not used at the same time.
 */
public class SavingsReport implements Report {
    private List<Device> devices;

    public SavingsReport(List<Device> devices) {
        this.devices = devices;
    }

    public void print() {
    }
}
