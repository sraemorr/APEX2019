package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.*;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
import frc.robot.RobotMap;


public class CargoIntake extends Subsystem {
    public TalonSRX Intake = RobotMap.Intake;

    public void Intake(){
        RobotMap.Intake.set(ControlMode.PercentOutput, -0.5);
    }

    public void IntakeManual(){
        if(OI.xbox2.getTriggerAxis(Hand.kLeft) >= 0.2){
            Intake.set(ControlMode.PercentOutput, 0.5 * OI.xbox2.getTriggerAxis(Hand.kLeft));
        }
        else if(OI.xbox2.getTriggerAxis(Hand.kLeft) >= -0.2){
            Intake.set(ControlMode.PercentOutput, 0.5 * OI.xbox2.getTriggerAxis(Hand.kLeft));
        }
        else {
            end();
        }
    }

    public void Expel(){
        RobotMap.Intake.set(ControlMode.PercentOutput, 0.5 );
       

    }

    public void ExpelManual(){
        if(OI.xbox2.getTriggerAxis(Hand.kLeft) >= 0.2){
            Intake.set(ControlMode.PercentOutput, -0.5 * OI.xbox2.getTriggerAxis(Hand.kRight));
        }
        else if(OI.xbox2.getTriggerAxis(Hand.kRight) >= -0.2){
            Intake.set(ControlMode.PercentOutput, -0.5 * OI.xbox2.getTriggerAxis(Hand.kRight));
        }
        else{
            end();
        }
    }

 
    @Override
    public void initDefaultCommand() {
  
    }

    public void end(){
        RobotMap.Intake.set(ControlMode.PercentOutput, 0.0);
    }
}
