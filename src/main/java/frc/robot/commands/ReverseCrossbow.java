package main.java.frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import main.java.frc.robot.subsystems.Crossbow;

public class ReverseCrossbow extends Crossbow{

    public ReverseCrossbow(){
        requires(Robot.m_Crossbow);
    }

    protected void initialize(){

    }

    protected void execute(){

    }

    protected boolean isFinished(){
        return false;
    }

    protected void end(){

    }

    protected void interrupted(){
        
    }
}