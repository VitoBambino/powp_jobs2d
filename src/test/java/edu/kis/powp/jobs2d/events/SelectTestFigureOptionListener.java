package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;
	private String figureName;

	public SelectTestFigureOptionListener(DriverManager driverManager, String figureName) {
		this.driverManager = driverManager;
		this.figureName = figureName;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (figureName) {
			case "figureScript1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "figureScript2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			default:
				System.out.println("Nieznana figura: " + figureName);
		}
	}
}
