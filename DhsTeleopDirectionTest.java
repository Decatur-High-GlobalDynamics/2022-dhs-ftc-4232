package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.Blinker;
import com.qualcomm.robotcore.hardware.Gyroscope;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

public class DhsTeleopDirectionTest extends LinearOpMode {
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
        m2.setDirection(DcMotorSimple.Direction.REVERSE);

        m3 = hardwareMap.dcMotor.get("m3");
        
        m0.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        m1.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        m2.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        m3.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        
        while (!isStarted()) {
            
        }
        while (!isStopRequested()) {
            float power = gamepad1.left_trigger;
           if (gamepad1.dpad_up) {
               m0.setPower(-power);
               m1.setPower(-power);
               m2.setPower(power);
               m3.setPower(power);
           }
           else if (gamepad1.dpad_down) {
               m0.setPower(power);
               m1.setPower(power);
               m2.setPower(-power);
               m3.setPower(-power);
           }
           else if (gamepad1.dpad_left) {
               m0.setPower(-power);
               m1.setPower(power);
               m2.setPower(-power);
               m3.setPower(power);
           }
           else if (gamepad1.dpad_right) {
               m0.setPower(power);
               m1.setPower(-power);
               m2.setPower(power);
               m3.setPower(-power);
           }
           else {
               m0.setPower(0);
               m1.setPower(0);
               m2.setPower(0);
               m3.setPower(0);
           }
        }
        
    }
    
    
}
