package frc.robot;


public class PortMap{

//drive base CAN ids, R1 and L1 are TalonSRX and others are VictorSPX
//talons
public static int R1 = 1;
public static int L1 = 2;

//victors
public static int R2 = 1;
public static int R3 = 2;
public static int L2 = 3;
public static int L3 = 4;

//lift ids, lift 1 is TalonSRX and others are VictorSPX
public static int Lift1 = 3;

public static int Lift2 = 5;
public static int Lift3 = 6;

public static int Lift_Solenoid_Forward_Channel = 9;
public static int Lift_Solenoid_Reverse_Channel = 10;

//eater (intake) id, TalonSRX
public static int Intake = 4;


//sticc ids, Sticc1 is TalonSRX  and Sticc2 is VictorSPX
//TalonSRX
public static int Sticc1 = 5;

//VictorSPX
public static int Sticc2 = 7;

//Crossbow PDP stuff, solenoid IDs (adjust later)
public static int Crossbow1_Forward_Channel = 1;
public static int Crossbow1_Reverse_Channel = 2;

public static int Crossbow2_Forward_Channel = 3;
public static int Crossbow2_Reverse_Channel = 4;


//Stair PDP stuff, solenoid IDs (adjust later)
public static int Stair1_Forward_Channel = 5;
public static int Stair1_Reverse_Channel = 6;

public static int Stair2_Forward_Channel = 7;
public static int Stair2_Reverse_Channel = 8;


}