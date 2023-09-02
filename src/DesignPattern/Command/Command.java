package DesignPattern.Command;

public class Command {
    protected Robot robot;

    public void setRobot (Robot _robot){
        this.robot = _robot;
    }
    public abstract void execute();
}

class MoveForwardCommand extends Command{
    int space;
    public MoveForwardCommand (int _space){
        space = _space;
    }
    public void execute(){
        robot.moveForward(space);
    }
}

class TurnCommand extends Command{
    Robot.Direction direction;
    public TurnCommand (Robot.Direction _direction){
        direction = _direction;
    }
    public void execute (){
        robot.turn(direction);
    }
}

class PickupCommand extends Command{
    public void excute (){
        robot.pickup();
    }
}

class CommandOrderAdapter extends Command {
    private Order order;

    public  CommandOrderAdapter (Order _order) {
        order = _order;
    }

    public void excute (){
        order.run(robot);
    }
}