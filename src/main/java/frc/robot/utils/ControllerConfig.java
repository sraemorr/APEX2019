package frc.robot.utils;
import com.ctre.phoenix.motorcontrol.*;
import com.ctre.phoenix.motorcontrol.can.*;
import frc.robot.RobotMap;

public class ControllerConfig{
    // configs victor to all default settings, then prepares all proper settings for driving
    public static void setDriveLeader(TalonSRX leaderSRX, Boolean isInverted){
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

        leaderSRX.config_kP(0, 1, 0);
		leaderSRX.config_kI(0, 0, 0);
		leaderSRX.config_kD(0, 0, 0);
		leaderSRX.config_kF(0, 0, 0);
    }

    public static void setDriveFollower(VictorSPX currentSPX, TalonSRX leaderSRX, Boolean isInverted) {
        currentSPX.configFactoryDefault();
        currentSPX.follow(leaderSRX);
        currentSPX.setInverted(isInverted);
        currentSPX.configNominalOutputForward(0.0);
        currentSPX.configNominalOutputReverse(0.0);
        currentSPX.configPeakOutputForward(1);
        currentSPX.configPeakOutputReverse(-1);
    }

    public static void setLift(TalonSRX currentSRX) {
        currentSRX.configFactoryDefault();

        if (currentSRX == RobotMap.Lift1) {
            currentSRX.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 0);
            currentSRX.config_kP(0, 1, 0);
            currentSRX.config_kI(0, 0, 0);
            currentSRX.config_kD(0, 0, 0);
            currentSRX.config_kF(0, 0, 0);
        }
        if (currentSRX == RobotMap.Lift2) {
            currentSRX.follow(RobotMap.Lift1);
        }
        currentSRX.setInverted(false);
        currentSRX.setSensorPhase(true);
        currentSRX.configNominalOutputForward(0.0);
        currentSRX.configNominalOutputReverse(0.0);
        currentSRX.configPeakOutputForward(1);
        currentSRX.configPeakOutputReverse(-1);
        currentSRX.configAllowableClosedloopError(0, 0, 0);
        currentSRX.configForwardSoftLimitEnable(false, 0);
        currentSRX.configReverseSoftLimitEnable(false, 0);
        // currentSRX.configForwardSoftLimitThreshold(30000,0);
        // currentSRX.configReverseSoftLimitThreshold(0, 0);
        currentSRX.configContinuousCurrentLimit(40);
        currentSRX.configPeakCurrentLimit(40);
        currentSRX.configPeakCurrentDuration(0, 0);
        currentSRX.enableCurrentLimit(true);
        // currentSRX.configMotionAcceleration(500, 0); //TODO SET THESE
        // currentSRX.configMotionCruiseVelocity(1000, 0); //TODO SET THESE
    }

    public static void setClimber(TalonSRX currentSRX, Boolean isInverted){
        currentSRX.configFactoryDefault();
        currentSRX.setInverted(isInverted);
        if(currentSRX == RobotMap.Climber2){
            currentSRX.follow(RobotMap.Climber1);
        }
        currentSRX.configNominalOutputForward(0.0);
		currentSRX.configNominalOutputReverse(0.0);
		currentSRX.configPeakOutputForward(1);
        currentSRX.configPeakOutputReverse(-1);
        // currentSRX.configContinuousCurrentLimit(40);
        // currentSRX.configPeakCurrentLimit(40);
        // currentSRX.configPeakCurrentDuration(0, 0);
        currentSRX.enableCurrentLimit(false);
    }
}
