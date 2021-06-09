package org.firstinspires.ftc.teamcode;

import org.firstinspires.ftc.teamcode.Auton.AutonomousOpModesBase;

public class AutonTest extends AutonomousOpModesBase {

    int state = 0;

    @Override
    public void initAutonomous() {
        super.initAutonomous();
        telemetry.addData("Status", "Initialized");
        telemetry.update();
    }
    @Override
    public void loop() {


        /*********************************************
         * GAME IS ON !!
         * *******************************************/
        autonomousIdleTasks();

        telemetry.addData("X", botBase.odometry.getCurrentXPos());

        // run until the end of the match (driver presses STOP)
        switch (state) {
            case 0:
                moveDiagonally(45, 100, 1);
                break;
            case 1:
                break;
        }
    }
}
