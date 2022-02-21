package part3;

public class Human implements Sensibilityable{

    private final String name;
    private final int age;
    private final String status;

    public Human(String name, int age, String status) {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    @Override
    public boolean canAnalyzeScreen(Screen screen) {
        return screen.getObjectCountFromScreen() > 0;
    }

    @Override
    public boolean canPanic(Screen screen) {
        return screen.isDangerous();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

}
