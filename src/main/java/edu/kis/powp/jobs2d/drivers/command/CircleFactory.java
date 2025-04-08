package edu.kis.powp.jobs2d.drivers.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.*;

import java.util.ArrayList;
import java.util.List;

public class CircleFactory {

    public static DriverCommand create(Job2dDriver driver, int centerX, int centerY, int radius) {
        List<DriverCommand> commands = new ArrayList<>();

        int steps = 36; // liczba punktów na okręgu
        double angleStep = 2 * Math.PI / steps;

        // Wygeneruj wszystkie punkty na okręgu
        List<int[]> points = new ArrayList<>();
        for (int i = 0; i < steps; i++) {
            double angle = i * angleStep;
            int x = centerX + (int) (radius * Math.cos(angle));
            int y = centerY + (int) (radius * Math.sin(angle));
            points.add(new int[]{x, y});
        }

        // Ustaw pozycję na pierwszy punkt
        int[] first = points.get(0);
        commands.add(new SetPositionCommand(driver, first[0], first[1]));

        // Przejdź przez kolejne punkty rysując linie
        for (int i = 1; i < points.size(); i++) {
            int[] pt = points.get(i);
            commands.add(new OperateToCommand(driver, pt[0], pt[1]));
        }

        // Zamknij okrąg — wróć do punktu startowego
        commands.add(new OperateToCommand(driver, first[0], first[1]));

        return new ComplexCommand(commands);
    }
}