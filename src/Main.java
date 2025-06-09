//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        double springCost = 1500;
        double summerCost = 3000;
        double fallCost = 1500;
        double winterCost = 100;
        double totalCost;

        totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall: $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("Total yearly home maintenance cost is $" + totalCost);
    }
}