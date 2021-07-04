public class BonusMilesService {
    public int calculate(int cost) {
        int discount = 20;
        int miles = cost / discount;
        return miles;
    }
}
