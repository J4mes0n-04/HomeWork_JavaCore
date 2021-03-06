//Glazyrin
package HomeWork_1;

public class Wall extends Barrier {

    private int heigth;

    public Wall(String name, int heigth) {
        super(name);

        this.heigth = heigth;
    }

    public int getHeigth() {
        return heigth;
    }

    @Override
    protected boolean moving(Actions actions) {
        System.out.println("Стена " + "метров: " + this.heigth);

        actions.jump();

        if (getHeigth() <= actions.getJumpHeight()) {
            System.out.println("Успешный прыжок");

            return true;
        } else {
            System.out.println("Не успешный прыжок");

            return false;
        }
    }
}
