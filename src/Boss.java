public class Boss extends GameEntity{
    Weapon weapon = new Weapon();


    public  String printInfo(){
       return "Health"+getLife() + " урон" + getDamage() + "/  " + weapon.getTypeof() +" /// "+ weapon.getTitle();
    }



    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;}
    public Boss() {
        super();
    }


}
