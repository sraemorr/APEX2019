package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
// import frc.robot.commands.MoveLift;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
// import frc.robot.utils.Booleans;
// import frc.robot.Robot;


public class Lift extends Subsystem{
// public boolean IsEndGame = Robot.booleans.IsEndGame;
public boolean IsEndGame = false;

public TalonSRX Lift1 = RobotMap.Lift1;
public DoubleSolenoid LiftSolenoid1 = RobotMap.LiftSolenoid1;

   
    public void lift(ControlMode controlmode, double TargetPosition){
    // if (IsEndGame == false && position <= 0){
    //     Lift1.set(ControlMode.MotionMagic, 1);
    // }
    // else{
    //     Lift1.set(controlmode, position); 
    // }
    Lift1.set(controlmode, TargetPosition);
   
   }

   public void lift(double power){
    // if (IsEndGame == false && position <= 0){
    //     Lift1.set(ControlMode.MotionMagic, 1);
    // }
    // else{
    //     Lift1.set(ControlMode.PercentOutput, power); 
    // }
    Lift1.set(ControlMode.PercentOutput, power);
   
   }

   

   public void lockLift(){
    LiftSolenoid1.set(Value.kForward);
   }

   public void releaseLift(){
    LiftSolenoid1.set(Value.kReverse);
   }
   public void end(){
    
   }
    public void initDefaultCommand(){
        // setDefaultCommand(new MoveLift(0));
    }
}