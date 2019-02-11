package frc.robot;


public class PortMap{

//TEMP FOR TESTING ON CONE
public static final int L1 = 0;
public static final int L2 = 0;
public static final int L3 = 2;

public static final int R1 = 1;
public static final int R2 = 1;
public static final int R3 = 3;


//drive base CAN ids, R1 and L1 are TalonSRX and others are VictorSPX
//talons
// public static int R1 = 1;
// public static int L1 = 2;

//victors
// public static int R2 = 1;
// public static int R3 = 2;
// public static int L2 = 3;
// public static int L3 = 4;

//lift ids, all are talons
public static int Lift1 = 3;
public static int Lift2 = 4;

public static int Lift_Solenoid1_Forward_Channel = 0;
public static int Lift_Solenoid1_Reverse_Channel = 1;

//eater (intake) id, TalonSRX
public static int Intake = 5;

//Crossbow PDP stuff, solenoid IDs (adjust later)
public static int Crossbow1_Forward_Channel = 2;
public static int Crossbow1_Reverse_Channel = 3;

//Climber PDP stuff, solenoid IDs (adjust later)
public static int ClimberSolenoid1_Forward_Channel = 4;
public static int ClimberSolenoid1_Reverse_Channel = 5;

//climber speed controller ids, both are talonsrx
public static int Climber1 = 6;
public static int Climber2 = 7;
}