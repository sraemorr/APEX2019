/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import com.ctre.phoenix.*;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.models.*;
public class RobotMap {

//drive train stuff
  public static BobTalonSRX R1;
  public static BobTalonSRX L1;

  public static VictorSPX R2;
  public static VictorSPX R3;
  public static VictorSPX L2;
  public static VictorSPX L3;
//lift stuff
  public static TalonSRX Lift1;
  public static VictorSPX Lift2;
  public static VictorSPX Lift3;
  public static DoubleSolenoid LiftSolenoid;
//intake/eater stuff
  public static TalonSRX Intake;
//S.T.I.C.C.S. stuff
  public static TalonSRX Sticc1;
  public static VictorSPX Sticc2;

// crossbow stuff
  public static DoubleSolenoid Crossbow1;
  public static DoubleSolenoid Crossbow2;

//stair climber stuff
public static DoubleSolenoid Stair1;
public static DoubleSolenoid Stair2;




public static void init(){
     System.out.println("Initializing Speed Controllers");
//left side drive base
L1 = new BobTalonSRX(PortMap.L1);
L2 = new VictorSPX(PortMap.L2);
L2.follow(L1);
L3 = new VictorSPX(PortMap.L3);
L3.follow(L1);
//right side drive base
R1 = new BobTalonSRX(PortMap.R1);
R2 = new VictorSPX(PortMap.R2);
R2.follow(R1);
R3 = new VictorSPX(PortMap.R3);
R3.follow(R1);
//lift stuff
Lift1 = new TalonSRX(PortMap.Lift1);
Lift2 = new VictorSPX(PortMap.Lift2);
Lift2.follow(Lift1);
Lift3 = new VictorSPX(PortMap.Lift3);
Lift3.follow(Lift1);
LiftSolenoid = new DoubleSolenoid(PortMap.Lift_Solenoid_Forward_Channel, PortMap.Lift_Solenoid_Reverse_Channel);
//intake stuff
Intake = new TalonSRX(PortMap.Intake);
//sticcs stuff
Sticc1 = new TalonSRX(PortMap.Sticc1);
Sticc2 = new VictorSPX(PortMap.Sticc2);
Sticc2.follow(Sticc1);
//crossbow stuff
Crossbow1 = new DoubleSolenoid(PortMap.Crossbow1_Forward_Channel, PortMap.Crossbow1_Reverse_Channel);
Crossbow2 = new DoubleSolenoid(PortMap.Crossbow2_Forward_Channel, PortMap.Crossbow2_Reverse_Channel);
//stair stepper stuff
Stair1 = new DoubleSolenoid(PortMap.Stair1_Forward_Channel, PortMap.Stair1_Reverse_Channel);
Stair2 = new DoubleSolenoid(PortMap.Stair2_Forward_Channel, PortMap.Stair2_Reverse_Channel);


}






  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
