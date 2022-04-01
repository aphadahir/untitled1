public class datastuc {

    public static void main(String args[]){
        int cansPerPack =6;
       final double canValume = 0.355;
       double totalVolume = cansPerPack*canValume;
       System.out.println("A six-pack of 12-ounce cans contains");
       System.out.println("litter "+totalVolume);
       final double litter = 2;
       totalVolume= litter*canValume;
       System.out.println("the amount  "+totalVolume);
    }}

