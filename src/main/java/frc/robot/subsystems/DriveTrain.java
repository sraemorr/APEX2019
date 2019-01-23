package main.java.frc.robot.subsystems; 
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

public class DriveTrain extends Subsystem{
    public TalonSRX L1 = RobotMap.L1; 
    public TalonSRX R1 = RobotMap.R1; 

    StringBuilder _sb = new StringBuilder();
    int _loops = 0;

    public void initDefaultCommand(){
        setDefaultCommand(new Drive());
    }

    public void configPIDF (double p, double i, double d, double f){
        this.L1.config_kP(0, p, 0);
        this.L1.config_kI(0, i, 0);
        this.L1.config_kD(0, d, 0);
        this.L1.config_kF(0, f, 0);

        this.R1.config_kP(0, p, 0);
        this.R1.config_kI(0, i, 0);
        this.R1.config_kD(0, d, 0);
        this.R1.config_kF(0, f, 0);
    }

    public void drive(ControlMode controlMode, double left, double right){
        this.L1.set(controlMode, left);
        this.R1.set(controlMode, right);
    }
    public boolean quickTurnController(){
            
    }

    public void velocityPIDTest(){

        TalonSRX _talonL = this.L1;
        TalonSRX _talonR = this.R1;

        double leftYstick = OI.xbox1.getY(Hand.kLeft); 
        double rightYstick = OI.xbox1.getY(Hand.kRight);
        double motorOutputL = _talon.getMotorOutputPercent();
        double motorOutputR = _talon.getMotorOutputPercent();

        //_sb.append("toutL:");
        _sb.append(motorOutputL);
        _sb.append(_talonL.getSelectSensorVelocity(0));
        
        _sb.append(motorOutputR);
        _sb.append(_talonR.getSelectSensorVelocity(0));

        _sb.setLength(0);

    }
    public void periodic(){

    }

    public void End(){
        drive(ControlMode.PercentOutput, 0,0);
    }
}
