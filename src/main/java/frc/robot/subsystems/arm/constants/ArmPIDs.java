package frc.robot.subsystems.arm.constants;

import frc.lib.TunableNumber;

public class ArmPIDs {
    public static TunableNumber elevatorKp = new TunableNumber("Elevator kP");
    public static TunableNumber elevatorKi = new TunableNumber("Elevator kI");
    public static TunableNumber elevatorKd = new TunableNumber("Elevator kD");
    public static TunableNumber elevatorVelocity = new TunableNumber("Elevator Velocity");
    public static TunableNumber elevatorAcceleration = new TunableNumber("Elevator Acceleration");

    public static TunableNumber pivotKp = new TunableNumber("Pivot kP");
    public static TunableNumber pivotKi = new TunableNumber("Pivot kI");
    public static TunableNumber pivotKd = new TunableNumber("Pivot kD");
    public static TunableNumber pivotVelocity = new TunableNumber("Pivot Velocity");
    public static TunableNumber pivotAcceleration = new TunableNumber("Pivot Acceleration");

    static {
        elevatorKp.setDefault(0.5);
        elevatorKi.setDefault(0.0);
        elevatorKd.setDefault(0.0);
        elevatorVelocity.setDefault(0.5);
        elevatorAcceleration.setDefault(0.8);

        pivotKp.setDefault(0.5);
        pivotKi.setDefault(0.0);
        pivotKd.setDefault(0.0);
        pivotVelocity.setDefault(0.5);
        pivotAcceleration.setDefault(0.5);
    }
}
