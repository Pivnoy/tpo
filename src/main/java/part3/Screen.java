package part3;

import java.util.ArrayList;
import java.util.List;

public class Screen {

    private final int width;
    private final int height;
    private SpaceShip spaceShip;
    private final List<Visiable> ls = new ArrayList<>();

    public Screen(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getObjectCountFromScreen(){
        return ls.size() + 1;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public boolean addVisiableObject(Visiable visiable){
        return ls.add(visiable);
    }

    public boolean getDescription(){
        if (ls.size() > 0) {
            for (Visiable obj : ls) {
                obj.howDisplayedOnScreen();
            }
            return true;
        }
        return false;
    }

    public void setSpaceShip(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
    }

    public boolean isDangerous() {
        boolean flag = false;
        for (Visiable obj: ls) {
            Rocket customRocket = (Rocket) obj;
            if (spaceShip.getPosition().getX() - customRocket.getPosition().getX() < 5 || spaceShip.getPosition().getY() - customRocket.getPosition().getY() < 4) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
