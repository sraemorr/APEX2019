package frc.robot.commands;
import frc.robot.Robot;
import frc.robot.subsystems.Lift;

import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj.command.*;
import frc.robot.RobotMap;

public class MoveLiftManual extends Command {
double position;
public MoveLiftManual( double position){
    requires(Robot.lift);
    this.position = RobotMap.Lift1.getSelectedSensorPosition(0);
}

protected void initialize(){

}
protected void execute(){
    // Robot.lift.lift(ControlMode.MotionMagic, position + OI.);
}



protected boolean isFinished(){
    return false;
}
protected void end() {
}

protected void interrupted(){
    
}

}