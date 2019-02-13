package frc.robot.commands;

import frc.robot.commands.MoveLift;
import edu.wpi.first.wpilibj.command.*;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class LiftHoldPosition extends Command {

    public LiftHoldPosition() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.lift);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println("Holding Extender position");
//    	double angle = RobotMap.Arm1.getClosedLoopTarget(0);
    	double liftPosition = RobotMap.Lift1.getSelectedSensorPosition(0);
    	 new MoveLift(liftPosition);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}