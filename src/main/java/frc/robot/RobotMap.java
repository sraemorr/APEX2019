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
public class RobotMap {

//drive train stuff
  public static TalonSRX R1;
  public static TalonSRX L1;

  public static VictorSPX R2;
  public static VictorSPX R3;
  public static VictorSPX L2;
  public static VictorSPX L3;
//lift stuff
  public static TalonSRX Lift1;
  public static VictorSPX Lift2;
  public static VictorSPX Lift3;
//intake/eater stuff
  public static TalonSRX Eater;
//S.T.I.C.C.S. stuff
  public static TalonSRX Sticc1;
  public static VictorSPX Sticc2;

// crossbow stuff
  public static DoubleSolenoid Crossbow1;
  public static DoubleSolenoid Crossbow2;

//stair climber stuff
public static DoubleSolenoid Stair1;
public static DoubleSolenoid Stair2;






  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
