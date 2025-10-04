package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp
//This TeleOp will be applied automatically to the robot and not need to be applied when selecting one.
public class MotorTest extends LinearOpMode {
    DcMotor motor0 = hardwareMap.get(DcMotor.class, "BL"); //"BottomLeft"
    DcMotor motor1 = hardwareMap.get(DcMotor.class, "BR"); //"BottomRight"
    DcMotor motor2 = hardwareMap.get(DcMotor.class, "UL"); //"UpperLeft"
    DcMotor motor3 = hardwareMap.get(DcMotor.class, "UR"); //"UpperRight"
    Servo servo0 = hardwareMap.get(Servo.class, "SL"); //"ServoLeft"
    //Establishes the motors and servos in the configuration of the Driver Hub
    @Override
    public void runOpMode(){

        motor0.setDirection(DcMotor.Direction.REVERSE);

        waitForStart();
        while (opModeIsActive()){

            motor0.setPower(gamepad1.left_stick_y);
        //Sets the Motor power to the left stick of a joystick (specifically the up and down axis)
        }
    }
}
