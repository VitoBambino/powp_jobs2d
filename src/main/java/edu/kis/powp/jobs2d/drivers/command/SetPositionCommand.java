package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand {

    int x;
    int y;

    Job2dDriver driver = new Job2dDriver() {
        @Override
        public void setPosition(int i, int i1) {

        }

        @Override
        public void operateTo(int i, int i1) {

        }
    };
    @Override
    public void execute() {
        driver.setPosition(x, y);
    }
}
