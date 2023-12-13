package Exercise;

public class MobileSalesAnalyzer {

    private int[] dailySales;

    public MobileSalesAnalyzer(int[] dailySales) {
        this.dailySales = dailySales;
    }

    public int calculateTotalSales() {
        int totalSales = 0;
        for (int sales : dailySales) {
            totalSales += sales;
        }
        return totalSales;
    }

    public double calculateAverageSales() {
        int totalSales = calculateTotalSales();
        return (double) totalSales / dailySales.length;
    }

    public int findDayWithHighestSales() {
        int maxSales = dailySales[0];
        int day = 0;
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] > maxSales) {
                maxSales = dailySales[i];
                day = i;
            }
        }
        return day;
    }

    public int findDayWithLowestSales() {
        int minSales = dailySales[0];
        int day = 0;
        for (int i = 1; i < dailySales.length; i++) {
            if (dailySales[i] < minSales) {
                minSales = dailySales[i];
                day = i;
            }
        }
        return day;
    }

    public void displayDailySales() {
        for (int i = 0; i < dailySales.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + dailySales[i]);
        }
    }

    public static void main(String[] args) {
        int[] dailySales = {30, 45, 20, 15, 50, 10, 35};
        MobileSalesAnalyzer salesAnalyzer = new MobileSalesAnalyzer(dailySales);

        System.out.println("Total Sales: " + salesAnalyzer.calculateTotalSales());
        System.out.println("Average Daily Sales: " + salesAnalyzer.calculateAverageSales());
        System.out.println("Day with Highest Sales: Day " + (salesAnalyzer.findDayWithHighestSales() + 1));
        System.out.println("Day with Lowest Sales: Day " + (salesAnalyzer.findDayWithLowestSales() + 1));

        System.out.println("Daily Sales:");
        salesAnalyzer.displayDailySales();
    }
}

