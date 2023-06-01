public class Main {
    public static void main(String[] args) {
        // Maintenance costs for each season
        double springCost = 100;
        double summerCost = 250;
        double autumnCost = 300;
        double winterCost = 350;

        // Total yearly maintenance costs
        double totalYearlyCost = springCost + summerCost + autumnCost + winterCost;

        // Output statement
        System.out.println("Spring maintenance cost: $" + springCost);
        System.out.println("Summer maintenance cost: $" + summerCost);
        System.out.println("Autumn maintenance cost: $" + autumnCost);
        System.out.println("Winter maintenance cost: $" + winterCost);
        System.out.println("Total yearly maintenance cost: $" + totalYearlyCost);
    }
}