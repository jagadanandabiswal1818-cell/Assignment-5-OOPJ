interface NumberPrinter {
    void printNumber(Integer num);
}

class DisplayNumber implements NumberPrinter {
    @Override
    public void printNumber(Integer num) {
        System.out.println("The given number is: " + num);
    }
}

public class test15 {
    public static void main(String[] args) {
        DisplayNumber printer = new DisplayNumber();
        
                int value = 42;
        printer.printNumber(value);

                Integer objValue = Integer.valueOf(100);
        printer.printNumber(objValue);
    }
}