package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class DhsTeleop1 extends LinearOpMode {
    private Blinker expansion_Hub_1;
    private Gyroscope imu;
    private DcMotor m0;
    private DcMotor m1;
    private DcMotor m2;
    private DcMotor m3;

    // todo: write your code here
    
    public void runOpMode() {
        m0 = hardwareMap.dcMotor.get("m0");
        m1 = hardwareMap.dcMotor.get("m1");
        m1.setDirection(DcMotorSimple.Direction.REVERSE);

        m2 = hardwareMap.dcMotor.get("m2");
        m3 = hardwareMap.dcMotor.get("m3");
        
        while (!isStarted()) {
            
        }
        while (!isStopRequested()) {
            m0.setPower(-gamepad1.left_stick_y);
            m1.setPower(-gamepad1.right_stick_y);
            m2.setPower(-gamepad2.left_stick_y);
            m3.setPower(-gamepad2.right_stick_y);
        }
    }
    
    
}
