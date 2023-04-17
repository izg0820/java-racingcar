package racingcar.domain;

public class Car {

    private int position;
    private String name;
    private final int CAR_NAME_LENGTH_LIMIT = 5;
    private final int CAR_MOVE_CRITERIA = 4;
    private final String CAR_NAME_LENGTH_OVER = "자동차 이름은 5자를 초과할 수 없습니다.";

    public Car() {
        this.position = 0;
    }

    public Car(String name) {
        this.name = validateName(name);
        this.position = 0;
    }

    private String validateName(String name) {
        if (name.length() > CAR_NAME_LENGTH_LIMIT) {
            throw new IllegalArgumentException(CAR_NAME_LENGTH_OVER);
        }
        return name;
    }

    public boolean isOver(int randomValue) {
        return CAR_MOVE_CRITERIA <= randomValue;
    }

    public void move() {
        int randomValue = RandomGenerator.getValue();
        if (isOver(randomValue)) {
            position++;
        }
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }
}