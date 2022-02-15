package by.epam.jwd.fundamentals;

public class Controller {
    public Controller() {
        Printer printer = new Printer();
        Logic logic = new Logic();
        Input input = new Input();

        printer.printMessage("------------First task------------");
        printer.printBoolean(logic.compareSumOfDigits(input.inputInteger()));
        printer.printMessage("------------Third task------------");
        printer.printDouble(logic.calculatePerimeterOfTriangle
                (input.inputDouble(), input.inputDouble()));
        printer.printDouble(logic.calculateSquareOfTriangle
                (input.inputDouble(), input.inputDouble()));
        printer.printMessage("------------Fifth task------------");
        int[] defaultArray = input.randomArrayOfInteger(input.inputInteger());
        printer.printArray(defaultArray);
        printer.printArray(logic.numsSquare(defaultArray));
        printer.printMessage("------------Sixth task------------");
        printer.printDouble(logic.calculateNumbersSum(input.inputDouble(),
                input.inputDouble(), input.inputDouble()));
        printer.printMessage("------------Eights task------------");
        printer.printDouble(logic.elemSum(input.randomArrayOfInteger(input.inputInteger()),
                input.inputInteger()));
        printer.printMessage("------------Tenth task------------");
        printer.printMatrix(logic.fillTheMatrix(input.inputInteger()));
    }
}
