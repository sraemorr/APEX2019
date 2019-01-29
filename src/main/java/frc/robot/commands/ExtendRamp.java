package frc.robot.commands; 

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.subsystems.Crossbow;
import frc.robot.RobotMap;

public class ExtendRamp extends Command{
    public ExtendRamp(){
       
    }

    protected void initialize(){
       
    }

    protected void execute(){
        Robot.cargoIntake.ExtendRamp();
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