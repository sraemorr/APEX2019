package frc.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.commands.*;

public class ClimberPrep extends CommandGroup{
    public ClimberPrep(){
        addSequential(new MoveLift(1000));
        addSequential(new LockElevator());
    } 


}