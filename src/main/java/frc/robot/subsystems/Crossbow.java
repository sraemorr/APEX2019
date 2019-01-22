package main.java.frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class Crossbow extends Subsystem{

    public DoubleSolenoid Crossbow1 = RobotMap.Crossbow1;
    public DoubleSolenoid Crossbow2 = RobotMap.Crossbow2;
   
    public void Forward(){
        Crossbow1.set(false);
        Crossbow2.set(false);
    }

    public void Reverse(){
        Crossbow1.set(true);
        Crossbow2.set(true);
    }


    @Override
    public void initDefaultCommand(){

    
    }
}
