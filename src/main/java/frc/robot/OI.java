/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;

// import org.graalvm.compiler.replacements.nodes.ReverseBytesNode;
import frc.robot.utils.POVTrigger;
import frc.robot.utils.TriggerButton;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
// import edu.wpi.first.wpilibj.buttons.Trigger;
// import edu.wpi.first.wpilibj.command.Command;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.EatCargo;
import frc.robot.commands.ExtendClimber;
import frc.robot.commands.LiftHoldPosition;
import frc.robot.commands.LockElevator;
import frc.robot.commands.UnlockElevator;
import frc.robot.commands.CrossbowBoop;
import frc.robot.commands.MoveLift;
import frc.robot.commands.MoveLiftManual;
import frc.robot.commands.RetractClimber;
import frc.robot.commands.CrossbowAcquire;
import frc.robot.commands.SpitCargo;
import frc.robot.commands.CrawlForward;
import frc.robot.commands.ClimberPrep;
import frc.robot.commands.CrawlForward;
import frc.robot.commands.CrawlBack;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public static XboxController xbox1;
  public static XboxController xbox2;

  public OI() {
    xbox1 = new XboxController(0);
    xbox2 = new XboxController(1);

    Button RPT2 = new JoystickButton(xbox2, 1); // 1 is equal to A
    RPT2.whileHeld(new MoveLiftManual());
    // RPT2.whenInactive(new LiftHoldPosition());
    Button LPT2 = new JoystickButton(xbox1, 2); // 2 is equal to B
    LPT2.whenPressed(new LockElevator());
    // LPT2.whenInactive(new UnlockElevator());
    // LPT2.whileHeld(new MoveLiftManual());
    Button RPB2 = new JoystickButton(xbox2, 3); // 3 = X
    // RPB2.whenPressed(new ClimberPrep());
    // RPB2.whileHeld(new ExtendClimber());
    // RPB2.whenInactive(new RetractClimber());
    // Button LPB2=new JoystickButton(xbox2, 3); //Change this to appropriate paddle
    // value after testing
    // LPB2.whenActive(new MoveLiftManual()); // 3 is equal to X
    // LPB2.whenReleased(new LiftHoldPosition());
    // LPB2.whenInactive();
    // 4 is equal to Y
    Button Y2 = new JoystickButton(xbox2, 4);
    Y2.whileHeld(new CrossbowBoop());
    // Y2.whileHeld(new CrawlForward());
    Button LB2 = new JoystickButton(xbox2, 5);
    // LB2.whenPressed(new CrawlForward());
    // LB2.whileHeld(new EatCargo());
    // LB2.whileHeld(new CrawlForward());

    // Button RB1=new JoystickButton(xbox2,6);
    // RB1.whileHeld(new SpitCargo());
    Button RB2 = new JoystickButton(xbox2, 6);
    RB2.whenPressed(new CrossbowBoop());
    RB2.whenReleased(new CrossbowAcquire());
    // RB2.whenInactive(new CrossbowAcquire());

    // Button Y1=new JoystickButton(xbox1,4);
    // Y1.whileActive(new CrossbowBoop());
    // Y1.whenInactive(new CrossbowAcquire());
    TriggerButton RT2 = new TriggerButton(xbox2, 3);
    RT2.whileActive(new SpitCargo());
    RT2.whileActive(new CrawlBack());

    TriggerButton LT2 = new TriggerButton(xbox2, 2);
    LT2.whileActive(new EatCargo());
    LT2.whileActive(new CrawlForward());

    POVTrigger DPAD_UP2 = new POVTrigger(xbox2, 0, 0);
    DPAD_UP2.whenPressed(new MoveLift(19000));
    DPAD_UP2.whenReleased(new LiftHoldPosition());

    POVTrigger DPAD_RIGHT2 = new POVTrigger(xbox2, 0, 90);
    DPAD_RIGHT2.whenPressed(new MoveLift(16000));
    DPAD_RIGHT2.whenReleased(new LiftHoldPosition());

    POVTrigger DPAD_LEFT2 = new POVTrigger(xbox2, 0, 270);
    DPAD_LEFT2.whenPressed(new MoveLift(7600));
    DPAD_LEFT2.whenReleased(new LiftHoldPosition());

    // DPAD_LEFT2.whenReleased(new MoveLift(40));

    POVTrigger DPAD_DOWN2 = new POVTrigger(xbox2, 0, 180);
    DPAD_DOWN2.whenPressed(new MoveLift(2100));
    DPAD_DOWN2.whenReleased(new LiftHoldPosition());

  }

  public XboxController xbox1() {
    return xbox1;
  }

  public XboxController xbox2() {
    return xbox2;
  }
}
