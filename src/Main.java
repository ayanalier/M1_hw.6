public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setLife(500);
        boss.setDamage(20);
        boss.setWeapon("cold");
        System.out.println("Жизнь " + boss.getLife() + " Урон " + boss.getDamage() + " Оружие " + boss.getWeapon());


    }



}