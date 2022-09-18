public class GameEntity {
    protected int life;
    protected int damage;
    protected String weapon;
    private Color name;

    public String getWeapon() {
        return weapon;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Color getName() {
        return name;
    }

    public void setName(Color name) {
        this.name = name;
    }

    public GameEntity() {
    }

    public int getAge() {
        return life;
    }

    public void setAge(int age) {
        this.life = age;
    }

    public Color getColor() {
        return name;
    }

    public void setColor(Color color) {
        this.name = name;
    }

    public String info(){
        return "Age: " + this.life + " color: " + this.name.getName() + this.name + "\u001B[0m";
    }

    public void setWeapon(String cold) {

    }
}

