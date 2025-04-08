package edu.kis.powp.jobs2d.drivers.adapter;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.magicpresets.FiguresJane;
import edu.kis.powp.jobs2d.AbstractDriver;

public class FiguresJaneAdapter extends AbstractDriver {
    private Job2dDriver driver;

    public FiguresJaneAdapter(Job2dDriver driver) {
        super(0, 0);
        this.driver = driver;
    }

    @Override
    public void operateTo(int x, int y) {
        driver.operateTo(x, y);
        setPosition(x, y);
    }

    public void drawFiguresJane() {
        FiguresJane.figureScript(this);
    }
}