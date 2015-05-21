package by.mitroshin.homedev.entity.kitchen;

import by.mitroshin.homedev.entity.Manufacturer;
import by.mitroshin.homedev.exception.LogicException;

/**
 * Created by HP M6 on 20.05.2015.
 */
public class Cooker extends KitchenDevice {
    public Cooker(Manufacturer manufacturer, int power, String model) throws LogicException {
        super(manufacturer, power, model);
    }
}