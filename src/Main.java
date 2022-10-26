public class Main {
    public static void main(String[] args) {
        //Task1. Declaration variable types
        char symbol = 'B';
        boolean isAttack = true;
        byte enemies = 127;
        short provisions = 24_700;
        int marchLength = 300_000;
        long stepCounter = 3_000_000L;
        float temperature = 25.1f;
        double windSpeed = 3.12d;

        //Task2. Boxers weight
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float totalBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        float weightDiff = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Boxers total weight is " + totalBoxerWeight + " kg");
        System.out.println("Weight different is " + weightDiff + " kg");

        //Task 3. Breakfast
        float bananaCount = 5;
        float oneBananaW = 80;
        float bananasWeight = bananaCount * oneBananaW;
        float milkV = 200;
        float milkDensity = 105f / 100;
        float milkWeight = milkV * milkDensity;
        float iceCount = 2;
        float oneIceW = 100;
        float iceWeight = iceCount * oneIceW;
        int eggCount = 4;
        float oneEggW = 70;
        float eggsWeight = eggCount * oneEggW;
        float totalWeightGrams = bananasWeight + milkWeight + iceWeight + eggsWeight;
        float totalWeightKg = totalWeightGrams / 1000;
        System.out.println("Breakfast weight " + totalWeightKg + " kg\n");

        //Task 4. Lose Weight
        float loseWeightKg = 7;
        float gramsToKg = 1000;
        float lose250grams = 250;
        float lose500grams = 500;
        float daysToLose250 = loseWeightKg * gramsToKg / lose250grams;
        float daysToLose500 = loseWeightKg * gramsToKg / lose500grams;
        float meanDays = (daysToLose250 + daysToLose500) / 2;
        System.out.println("On average it tales " + (int) meanDays + " days to lose weight!");
        System.out.println("At worst it takes " + (int) daysToLose250 + " days to lose weight!");
        System.out.println("At best it takes " + (int) daysToLose500 + " days to lose weight!\n");

        //Task 5. Salary
        float mashaSalaryPerMonth = 67_760;
        float denisSalaryPerMonth = 83_690;
        float kristinaSalaryPerMonth = 76_230;
        float increasingCoef = 1 + 0.1f;
        float newMashaSalaryPerMonth = mashaSalaryPerMonth * increasingCoef;
        float newDenisSalaryPerMonth = denisSalaryPerMonth * increasingCoef;
        float newKristinaSalaryPerMonth = kristinaSalaryPerMonth * increasingCoef;
        float deltaMashaSalary = (newMashaSalaryPerMonth - mashaSalaryPerMonth) * 12;
        float deltaDenisSalary = (newDenisSalaryPerMonth - denisSalaryPerMonth) * 12;
        float deltaKristinaSalary = (newKristinaSalaryPerMonth - kristinaSalaryPerMonth) * 12;

        System.out.println("Маша теперь получает " + newMashaSalaryPerMonth +
                " рублей. Годовой доход вырос на " + deltaMashaSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalaryPerMonth +
                " рублей. Годовой доход вырос на " + deltaDenisSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalaryPerMonth +
                " рублей. Годовой доход вырос на " + deltaKristinaSalary + " рублей");
    }
}
