public class BmiService {
    public int calculate(int kg , double cm) {
        int result = (int) (kg / (cm * cm));

        return result;

    }
}
