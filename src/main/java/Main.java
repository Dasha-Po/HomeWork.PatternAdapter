public class Main {
    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));

        BinOps bins = new BinOps();
        System.out.println(bins.sum("11", "100"));
        System.out.println(bins.mult("11", "100"));

//        Calculator calc = new Calculator();
//        System.out.println(
//                calc.newFormula()
//                        .addOperand(5)
//                        .addOperand(15)
//                        .calculate(Calculator.Operation.MULT)
//                        .result()
//        );
    }
}
