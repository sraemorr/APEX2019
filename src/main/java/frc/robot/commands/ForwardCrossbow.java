package main.java.frc.robot.commands; 

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import main.java.frc.robot.subsystems.Crossbow;
import frc.robot.RobotMap;

public class ForwardCrossbow extends Crossbow{
    public ForwardCrossbow(){
        requires(Robot.m_Crossbow);
    }

    protected void initialize(){
       
    }

    protected void execute(){
        Robot.kCrossbow.forwardCrossbow();
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
