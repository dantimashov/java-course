package ru.tim.lesson3;

public class ClassDeclaration {

}

enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
}

class Robot {

    private int x;
    private int y;
    private Direction dir;


    Robot(int x, int y, Direction dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    private Direction getDirection() {
        return dir;
    }

    private int getX() {
        return x;
    }

    private int getY() {
        return y;
    }

    private void turnLeft() {
        // повернуться на 90 градусов против часовой стрелки
        switch (dir){
            case UP:
                dir = Direction.LEFT;
                break;
            case LEFT:
                dir = Direction.DOWN;
                break;
            case DOWN:
                dir = Direction.RIGHT;
                break;
            case RIGHT:
                dir = Direction.UP;
                break;
        }
    }

    private void turnRight() {
        switch (dir){
            case UP:
                dir = Direction.RIGHT;
                break;
            case LEFT:
                dir = Direction.UP;
                break;
            case DOWN:
                dir = Direction.LEFT;
                break;
            case RIGHT:
                dir = Direction.DOWN;
                break;
        }
    }

    private void stepForward() {
        switch (dir){
            case UP:
                ++y;
                break;
            case LEFT:
                --x;
                break;
            case DOWN:
                --y;
                break;
            case RIGHT:
                ++x;
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        int numStepX = Math.abs(robot.getX() - toX);
        int numStepY = Math.abs(robot.getY() - toY);
        if(robot.getX() < toX){
            robot.setNeedableDir(Direction.RIGHT);
        }
        if(robot.getX() > toX){
            robot.setNeedableDir(Direction.LEFT);
        }
        for (int i = 0; i < numStepX; i++) {
            robot.stepForward();
        }
        if(robot.getY() < toY){
            robot.setNeedableDir(Direction.UP);
        }
        if(robot.getY() > toY){
            robot.setNeedableDir(Direction.DOWN);
        }
        for (int i = 0; i < numStepY; i++) {
            robot.stepForward();
        }
    }

    private void setNeedableDir(Direction toDir){
        while(this.getDirection() != toDir)
            this.turnRight();
    }
}
