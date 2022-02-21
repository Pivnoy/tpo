package part3;

public class SpaceShip implements Visiable, Movable{

    private int strength;
    private Position position;

    public SpaceShip(int strength, Position position) {
        this.strength = strength;
        this.position = position;
    }

    public boolean isAlive(){
        return strength > 0;
    }

    @Override
    public boolean isMove() {
        return strength > 0 && position.getX() > 0 && position.getY() > 0;
    }

    @Override
    public void howDisplayedOnScreen() {
        System.out.println("Корабль");
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public Position getPosition() {
        return position;
    }

}

