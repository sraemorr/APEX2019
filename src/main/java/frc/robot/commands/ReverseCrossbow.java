package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Crossbow;
import frc.robot.RobotMap;

public class ReverseCrossbow extends Crossbow{

    public ReverseCrossbow(){
    
    }

    protected void initialize(){
    
    }

    protected void execute(){
        Robot.crossbow.Reverse();
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