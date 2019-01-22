package frc.robot.commands; 

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Crossbow;
import frc.robot.RobotMap;

public class ForwardCrossbow extends Crossbow{
    public ForwardCrossbow(){
       
    }

    protected void initialize(){
       
    }

    protected void execute(){
        Robot.crossbow.Forward();
    }

    protected boolean isFinished(){
        return false; 
    }

    protected void end(){

    }

    protected void interrupted(){
        end();
    }
}
