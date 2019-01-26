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
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.EatCargo;
import frc.robot.commands.ForwardCrossbow;
import frc.robot.commands.MoveLift;
import frc.robot.commands.MoveLiftManual;
import frc.robot.commands.ReverseCrossbow;
import frc.robot.commands.SpitCargo;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static XboxController xbox1; 
    public static XboxController xbox2; 

    public OI(){
      xbox1 = new XboxController(0);
      xbox2 = new XboxController(1);

      Button RPT2=new JoystickButton(xbox2, 1 );  
      RPT2.whileHeld(new MoveLiftManual());
      Button LPT2=new JoystickButton(xbox2, 2 );  
      LPT2.whileHeld(new MoveLift(0));
      
      Button LPB2=new JoystickButton(xbox2, 3);  //Change this to appropriate paddle value after testing
      LPB2.whenActive(new MoveLiftManual());
      // LPB2.whenInactive();

      Button LB2=new JoystickButton(xbox2,5);
        	LB2.whileHeld(new EatCargo());

      Button RB1=new JoystickButton(xbox2,6);
          RB1.whileHeld(new SpitCargo());
      Button RB2=new JoystickButton(xbox2,6);
          RB2.whileHeld(new SpitCargo());

      Button Y1=new JoystickButton(xbox1,4);
        	Y1.whileActive(new ForwardCrossbow());
        	Y1.whenInactive(new ReverseCrossbow());
      Button Y2=new JoystickButton(xbox2,4);
         	Y2.whileActive(new ForwardCrossbow());
           Y2.whenInactive(new ReverseCrossbow());
    }

    public XboxController xbox1(){
      return xbox1; 
    }

    public XboxController xbox2(){
      return xbox2; 
    }
}
