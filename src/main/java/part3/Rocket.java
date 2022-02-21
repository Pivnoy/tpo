package part3;

public class Rocket implements Visiable, Movable{

    private final int damage;
    private final Position position;
    private int fuel;

    public Rocket(int damage, Position position, int fuel) {
        this.damage = damage;
        this.position = position;
        this.fuel = fuel;
    }

    public boolean canAttack(SpaceShip spaceShip) {
        return fuel > 0 && damage > 0 && position.getY() == spaceShip.getPosition().getY() && position.getX() == spaceShip.getPosition().getX();
    }

    public boolean attack(SpaceShip spaceShip) {
        if (canAttack(spaceShip)) {
            spaceShip.setStrength(spaceShip.getStrength() - damage);
            return true;
        }
        return false;
    }

    @Override
    public boolean isMove() {
        return fuel > 0;
    }

    @Override
    public void howDisplayedOnScreen() {
        System.out.println("Ракета отображается как стрелка");
    }

    public int getDamage() {
        return damage;
    }

    public Position getPosition() {
        return position;
    }

    public int getFuel() {
        return fuel;
    }

}
