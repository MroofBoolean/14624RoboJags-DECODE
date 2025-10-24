package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp

//This TeleOp will be applied automatically to the robot and not need to be applied when selecting one.
public class MotorTest extends LinearOpMode {
    DcMotor motor0, motor1, motor2, motor3;
    @Override
    public void runOpMode(){
        DcMotor motor0 = hardwareMap.get(DcMotor.class, "TL"); //"TopLeft"
        DcMotor motor1 = hardwareMap.get(DcMotor.class, "TR"); //"TopRight"
        DcMotor motor2 = hardwareMap.get(DcMotor.class, "BL"); //"BottomLeft"
        DcMotor motor3 = hardwareMap.get(DcMotor.class, "BR"); //"BottomRight"
        //Establishes the motors and servos in the configuration of the Driver Hub

        //motor0.setDirection(DcMotor.Direction.REVERSE);
        motor1.setDirection(DcMotor.Direction.REVERSE);
        //motor2.setDirection(DcMotor.Direction.REVERSE);
        motor3.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()){
            moveForward();

        }
    }
    public void moveForward(){
        motor0.setPower(-gamepad1.left_stick_y);
        motor1.setPower(-gamepad1.left_stick_y);
        motor2.setPower(-gamepad1.left_stick_y);
        motor3.setPower(-gamepad1.left_stick_y);
    }
    //Sets the Motor power to the left stick of a joystick (specifically the up and down axis)
}
