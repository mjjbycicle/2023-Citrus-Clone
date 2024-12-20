package frc.robot.subsystems.arm.constants;

import frc.lib.TunableNumber;

public class ArmConstants {
    public static class ElevatorConstants {
        public static final double UP_POSITION = -26;
        public static final double DOWN_POSITION = -1.64;
        public static final double POSITION_DIFF = UP_POSITION - DOWN_POSITION;
        public static final double[] CONE_POSITIONS = new double[]{
                DOWN_POSITION + 0 * POSITION_DIFF,
                DOWN_POSITION + 0.5 * POSITION_DIFF,
                DOWN_POSITION * 0.8 * POSITION_DIFF
        };
        public static final double[] CUBE_POSITIONS = new double[]{
                DOWN_POSITION + 0 * POSITION_DIFF,
                DOWN_POSITION + 0.5 * POSITION_DIFF,
                DOWN_POSITION * 0.8 * POSITION_DIFF
        };
        public static final double SUBSTATION_INTAKING_POSITION = DOWN_POSITION + 1 * POSITION_DIFF;
        public static final double GROUND_INTAKING_POSITION = DOWN_POSITION;

        public static final double ELEVATOR_TOLERANCE = 0.1;
    }
    public static class PivotConstants {
        public static final double DOWN_ANGLE = -0.1;
        public static final double UP_ANGLE = -0.36;
        public static final double ANGLE_DIFF = UP_ANGLE - DOWN_ANGLE;

        public static final double GROUND_INTAKING_ANGLE = DOWN_ANGLE;
        public static final double CUBE_PIVOT_ANGLE = DOWN_ANGLE + 0.4 * ANGLE_DIFF;
        public static final double CONE_PIVOT_ANGLE = DOWN_ANGLE + 0.4 * ANGLE_DIFF;
        public static final double SUBSTATION_INTAKING_ANGLE = DOWN_ANGLE + 0.7 * ANGLE_DIFF;

        public static final double PIVOT_TOLERANCE = 0.1;

        public static final double PIVOT_SENSOR_TO_MECHANISM_RATIO = 1;
    }

    public enum ArmSuperstructureState {
        IDLE(false),
        LOW(true),
        MID(true),
        HIGH(true),
        GROUND_INTAKING(false),
        SUBSTATION_INTAKING(true),
        OUTTAKING(false);

        public final boolean high;

        ArmSuperstructureState(boolean high) {
            this.high = high;
        }
    }

    public static class IDs {
        public static final int LEFT_PIVOT_ID = 1;
        public static final int RIGHT_PIVOT_ID = 10;

        public static final int LEFT_ELEVATOR_ID = 20;
        public static final int RIGHT_ELEVATOR_ID = 21;

        public static final int PIVOT_ENCODER_ID = 0;
    }
}
