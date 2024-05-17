public class Main {
    public static void main(String[] args){

        Boss boss = new Boss();
        boss.setHelth(400);
        boss.setDamage(40);
        boss.setDefence("Metall");

        System.out.println("Boss characteristic: \n" + "Health: " + boss.getHelth() + "\nDamage: " + boss.getDamage() + "\nDafence: " + boss.getDefence() );

        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            int heroNumber = i + 1;
            System.out.println("Hero # " + heroNumber + ": Health " + heroes[i].getHelth() + " Damage " + heroes[i].getDamage() +" SuperPower " + heroes[i].getPower() );
        }

    }
    public static Hero[] createHeroes() {
        Hero warrior = new Hero(100, 50);
        Hero archer = new Hero(60, 70);
        Hero mage = new Hero(30, 100, " Stun" );

        Hero[] heroes = {warrior, archer, mage};
        return heroes;
    }
}