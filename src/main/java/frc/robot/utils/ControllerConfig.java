
package frc.robot.utils;

import com.ctre.phoenix.motorcontrol.*;
import frc.robot.models.ApexTalonSRX;
import frc.robot.models.ApexVictorSPX;

public class ControllerConfig {
    // configs victor to all default settings, then prepares all proper settings for
    // driving
    public static void setDriveLeader(ApexTalonSRX leaderSRX, Boolean isInverted) {
        leaderSRX.configFactoryDefault();
        leaderSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
        leaderSRX.setInverted(isInverted);
        leaderSRX.setSensorPhase(true);
        leaderSRX.configNominalOutputForward(0.0);
        leaderSRX.configNominalOutputReverse(0.0);
        leaderSRX.configPeakOutputForward(1);
        leaderSRX.configPeakOutputReverse(-1);
        leaderSRX.configMotionProfileTrajectoryPeriod(0);
        leaderSRX.configContinuousCurrentLimit(25);
        leaderSRX.configPeakCurrentLimit(25);
        leaderSRX.configPeakCurrentDuration(0, 0);
        leaderSRX.enableCurrentLimit(true);
        // leaderSRX.configMotionAcceleration(500, 0);
        leaderSRX.configOpenloopRamp(.4);
        // currentSRX.configMotionCruiseVelocity(1000, 0);
        leaderSRX.config_kP(0, 1, 0);
        leaderSRX.config_kI(0, 0, 0);
        leaderSRX.config_kD(0, 0, 0);
        leaderSRX.config_kF(0, 0, 0);
        // leaderSRX.setSafetyEnabled(false);
    }

    public static void setDriveFollower(ApexVictorSPX currentSPX, ApexTalonSRX leaderSRX, Boolean isInverted) {
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(isInverted);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
        // currentSPX.setSafetyEnabled(false);
    }

    public static void setLiftLead(ApexTalonSRX currentSRX) {
        currentSRX.configFactoryDefault();
        currentSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
        currentSRX.config_kP(0, .9, 0);
        currentSRX.config_kI(0, 0, 0);
        currentSRX.config_kD(0, 0, 0);
        currentSRX.config_kF(0, 0, 0);

        currentSRX.setInverted(false);
        currentSRX.setSensorPhase(false);
        currentSRX.configNominalOutputForward(0.0);
        currentSRX.configNominalOutputReverse(0.0);
        currentSRX.configPeakOutputForward(1);
        currentSRX.configPeakOutputReverse(-1);
        currentSRX.configAllowableClosedloopError(0, 100, 0);
        currentSRX.configForwardSoftLimitEnable(false, 0);
        currentSRX.configReverseSoftLimitEnable(false, 0);
        // currentSRX.configForwardSoftLimitThreshold(30000,0);
        // currentSRX.configReverseSoftLimitThreshold(0, 0);
        currentSRX.configContinuousCurrentLimit(40);
        currentSRX.configPeakCurrentLimit(40);
        currentSRX.configPeakCurrentDuration(0, 0);
        currentSRX.enableCurrentLimit(true);
        currentSRX.configMotionAcceleration(500, 0); //TODO SET THESE
        currentSRX.configMotionCruiseVelocity(300, 0); //TODO SET THESE
        // currentSRX.setSafetyEnabled(false);

    }

    public static void setLiftFollower(ApexVictorSPX currentSPX, ApexTalonSRX leaderSRX, Boolean isInverted) {
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(isInverted);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
        // currentSPX.setSafetyEnabled(false);
    }

    public static void setClimbLead(ApexTalonSRX currentSRX) {
        System.out.println("Configuring Climb Lead" + currentSRX.getInverted());
        currentSRX.configFactoryDefault();
        currentSRX.setInverted(false);
        currentSRX.configNominalOutputForward(0.0);
        currentSRX.configNominalOutputReverse(0.0);
        currentSRX.configPeakOutputForward(1);
        currentSRX.configPeakOutputReverse(-1);
        currentSRX.configContinuousCurrentLimit(40);
        currentSRX.configPeakCurrentLimit(40);
        currentSRX.configPeakCurrentDuration(0, 0);
        currentSRX.enableCurrentLimit(true);
        // currentSRX.setSafetyEnabled(false);
        System.out.println("Done Configuring Climb Lead" + currentSRX.getInverted());
    }

    public static void setClimbFollower(ApexVictorSPX currentSPX, ApexTalonSRX leaderSRX) {
        System.out.println("Configuring Climb Follower" + currentSPX.getInverted());
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(true);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
        // currentSPX.setSafetyEnabled(false);
        System.out.println("Done Configuring Climb Follower, Inversion: " + currentSPX.getInverted());
    }
}
