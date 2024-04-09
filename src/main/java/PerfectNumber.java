public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }
    private static boolean isPerfectNumber(int number) {
        // Validación de número mayor o igual a 1.
        if(number < 1) {
            return false;
        }
        int divisorSum = 0;  // Creo variable para sumar los divisores de number.
        // Uso bucle for y:
        for(int i = 1; i < number; i++) {
            // Añado cada divisor a la variable divisorSum.
            if(number % i == 0) {
                divisorSum += i;
            }
        }
        return divisorSum == number;  // Retorno el booleano de igualdad entre divisorSum y number.
    }
}